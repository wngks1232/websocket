package com.example.websocketdemo.controller;

import com.example.websocketdemo.userModel.Member;
import com.example.websocketdemo.userRepo.MemberRepo;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@Log
public class CountController {
    @Autowired
    MemberRepo repo;
    @PostMapping("/count")
    public String count(@Valid Member member){
        log.info("sdsd"+member.toString());

        if(0 < repo.getCount(member.getMemberemail(),member.getMemberpw())){
            return "count";
        }else{
            return "failLogin";
        }
    }
}
