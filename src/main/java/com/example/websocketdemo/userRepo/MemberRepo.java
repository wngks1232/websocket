package com.example.websocketdemo.userRepo;

import com.example.websocketdemo.userModel.Member;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MemberRepo extends CrudRepository<Member,String> {
    @Query("SELECT COUNT(M) from Member M WHERE M.memberemail=:memberemail AND M.memberpw=:memberpw")
    public int getCount(@Param("memberemail") String memberemail,@Param("memberpw") String memberpw);
}
