package com.example.websocketdemo.userModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@ToString
@Table(name = "MEMBER")
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id
    private String memberemail;
    private String memberpw;
}
