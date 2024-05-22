package com.hanuldure.project.dao;

import com.hanuldure.project.dto.CommunityTO;
import com.hanuldure.project.dto.MemberDTO;
import com.hanuldure.project.mapper.ProfileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("profileDAO")
public class ProfileDAO {

    @Autowired
    private ProfileMapper mapper;

    public MemberDTO selectUserDetails(int userSeq) {
        return mapper.selectUserDetails(userSeq);
    }
}
