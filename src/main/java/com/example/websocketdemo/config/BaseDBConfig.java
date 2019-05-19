package com.example.websocketdemo.config;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "entityManagerFactory",
        basePackages = "com.example.websocketdemo.userRepo",
        transactionManagerRef = "transactionManager")
public class BaseDBConfig {

    @Primary
    @Bean(name = "dataSource")
    @ConfigurationProperties(prefix = "spring.user.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @Primary
    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(
            EntityManagerFactoryBuilder builder,
            @Qualifier("dataSource") DataSource dataSource) {
        Map<String, Object> properties = new HashMap<>();
        properties.put("hibernate.ddl-auto", "none");
        properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
        return builder.dataSource(dataSource).properties(properties)
                .packages("com.example.websocketdemo.userModel").build();
    }
    @Primary
    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager(
            @Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
