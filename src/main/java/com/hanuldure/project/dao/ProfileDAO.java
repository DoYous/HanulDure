package com.hanuldure.project.dao;

import com.hanuldure.project.dto.CommunityTO;
import com.hanuldure.project.dto.MemberDTO;
import com.hanuldure.project.mapper.ProfileMapper;
import com.hanuldure.project.model.dto.ExpDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("profileDAO")
public class ProfileDAO {

    @Autowired
    private ProfileMapper mapper;

    public MemberDTO selectUserDetails(int userSeq) {
        return mapper.selectUserDetails(userSeq);
    }

//    public ExpDTO selectExpDetails(int userSeq) {
//        return mapper.selectExpDetails(userSeq);
//    }

    public List<ExpDTO> selectExpAllDetails(int userSeq) {
        return mapper.selectExpAllDetails(userSeq);
    }

}
