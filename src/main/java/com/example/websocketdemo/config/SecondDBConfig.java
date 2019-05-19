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

//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(
//        entityManagerFactoryRef = "entityManagerFactory",
//        basePackages = "com.example.websocketdemo.dataRepo",
//        transactionManagerRef = "transactionManager")
public class SecondDBConfig {

//    @Bean(name = "bookDataSource")
//    @ConfigurationProperties(prefix = "spring.book.datasource")
//    public DataSource dataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "bookEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(EntityManagerFactoryBuilder builder,
//                                                                           @Qualifier("bookDataSource") DataSource dataSource) {
//        Map<String, Object> properties = new HashMap<>();
//        properties.put("hibernate.ddl-auto", "create");
//        properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
//        return builder.dataSource(dataSource).properties(properties)
//                .packages("com.example.websocketdemo.dataRepo").persistenceUnit("Book").build();
//    }
//
//    @Bean(name = "bookTransactionManager")
//    public PlatformTransactionManager transactionManager(
//            @Qualifier("bookEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
//        return new JpaTransactionManager(entityManagerFactory);
//    }
}
