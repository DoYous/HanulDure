package com.hanuldure.project.service;

import com.hanuldure.project.dao.ProfileDAO;
import com.hanuldure.project.dto.CommunityTO;
import com.hanuldure.project.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    private final ProfileDAO profileDAO;

    @Autowired
    public ProfileService(ProfileDAO profileDAO) {
        this.profileDAO = profileDAO;
    }

    public MemberDTO getUserDetailsBySeq(int user_seq) {
        return profileDAO.selectUserDetails(user_seq);
    }
}
