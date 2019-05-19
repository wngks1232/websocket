package com.example.websocketdemo.dataModel;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@ToString(exclude = "DEPTNO")
@Table(name = "DEPT")
public class DEPT {

    @Id
    private Integer DEPTNO;
    private String DNAME;
    private String LOC;

    @OneToMany(mappedBy = "DEPTNO")
    private List<EMP> order;

}
