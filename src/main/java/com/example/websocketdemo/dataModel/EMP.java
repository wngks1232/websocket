package com.example.websocketdemo.dataModel;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
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
