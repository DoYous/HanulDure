package com.hanuldure.project.dao;

import com.hanuldure.project.mapper.MemberMapper;
import com.hanuldure.project.model.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

    @Autowired
    private MemberMapper mapper;
    public int insertMember(MemberDTO memberDTO){
        return mapper.insertMember(memberDTO);
    }

    public Integer selectMember(MemberDTO memberDTO){
        return mapper.selectMember(memberDTO);
    }
}
