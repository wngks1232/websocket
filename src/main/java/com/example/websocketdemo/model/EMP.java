package com.example.websocketdemo.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@ToString(exclude = "DEPTNO")
@Table(name = "EMP")
public class EMP {
    @Id
    private Integer EMPNO;
    private String ENAME;
    private String JOB;
    private Integer MGR;
    private Timestamp HIREDATE;
    private Integer SAL;
    private Integer COMM;
    private Integer DEPTNO;
}
