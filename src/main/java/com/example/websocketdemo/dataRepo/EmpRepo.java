package com.example.websocketdemo.dataRepo;

import com.example.websocketdemo.dataModel.EMP;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmpRepo extends CrudRepository<EMP,Integer> {

    @Query("select  b from EMP b")
    public List<EMP> getList();

    @Query("SELECT b from EMP b INNER JOIN DEPT c ON b.DEPTNO=c.DEPTNO WHERE c.DNAME='SALES' and b.EMPNO>0")
    public List<EMP> getEMPDEPTLIST();

}
