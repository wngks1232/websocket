package com.example.websocketdemo.userModel;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@ToString
@Table(name = "MEMBER")
public class Member {
    @Id
    private String memberemail;
    private String memberpw;
}
