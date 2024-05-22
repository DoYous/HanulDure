package com.hanuldure.project.service;

import com.hanuldure.project.dao.ProfileDAO;
import com.hanuldure.project.dto.CommunityTO;
import com.hanuldure.project.dto.ExpApplyDTO;
import com.hanuldure.project.dto.MemberDTO;
import com.hanuldure.project.model.dto.ExpDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    private final ProfileDAO profileDAO;

    @Autowired
    public ProfileService(ProfileDAO profileDAO) {
        this.profileDAO = profileDAO;
    }

    public MemberDTO getUserDetailsBySeq(int userSeq) {
        return profileDAO.selectUserDetails(userSeq);
    }

//    public ExpDTO selectExpByUserSeq(int userSeq) {
//        return profileDAO.selectExpDetails(userSeq);
//    }

    public List<ExpDTO> selectAllExpByUserSeq(int userSeq) {
        return profileDAO.selectExpAllDetails(userSeq);
    }

    public Integer selectExpApplications(int expSeq) {
        return profileDAO.selectExpApplications(expSeq);
    }
}
