package com.example.websocketdemo;

import com.example.websocketdemo.model.EMP;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EMPTest {
    private static final Logger logger = LoggerFactory.getLogger(EMPTest.class);
    @Autowired
    EmpRepo repo;
    @Test
    public void selectTest(){
        List<EMP> list = repo.getEMPDEPTLIST();
        list.forEach(arr->{
            logger.info(arr.toString());
        });
    }
}
