package com.example.websocketdemo;

import com.example.websocketdemo.userRepo.MemberRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EMPTest {
    private static final Logger logger = LoggerFactory.getLogger(EMPTest.class);
//    @Autowired
//    EmpRepo repo;
    @Autowired
    MemberRepo mrepp;

    @Test
    public void selectTest(){

        Member member = new Member();
        member.setMemberemail("test0@gmail.com");
        member.setMemberpw("USERPW000");

        int i = mrepp.getCount(member.getMemberemail(),member.getMemberpw());

        logger.info("test : "+i);
    }
}
