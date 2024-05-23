package com.hanuldure.project.service;

import com.hanuldure.project.dao.MemberDAO;
import com.hanuldure.project.model.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private MemberDAO memberDAO;

    @Autowired
    public MemberService(MemberDAO memberDAO){
        this.memberDAO=memberDAO;
    }

    public int signup(MemberDTO memberDTO){
        return memberDAO.insertMember(memberDTO);
    }

    public Integer login(MemberDTO memberDTO){
        return memberDAO.selectMember(memberDTO);
    }

    public String searchId(MemberDTO memberDTO){return memberDAO.searchId(memberDTO);}

    public String searchPwd(MemberDTO memberDTO){return memberDAO.searchPwd(memberDTO);}
}
