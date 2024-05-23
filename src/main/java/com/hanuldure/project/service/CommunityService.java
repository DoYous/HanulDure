package com.hanuldure.project.service;

import com.hanuldure.project.dao.CommunityDAO;
//import com.hanuldure.project.dao.impl.CommunityDAOImpl;
import com.hanuldure.project.dto.CommunityTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunityService {

    private final CommunityDAO communityDAO;

    @Autowired
    public CommunityService(CommunityDAO communityDAO) {
        this.communityDAO = communityDAO;
    }

    public int addCommunity(CommunityTO communityTO) {
        return communityDAO.insertCommunity(communityTO);
    }

    public CommunityTO getCommunityBySeq(int boardSeq) {
        return communityDAO.selectCommunityBySeq(boardSeq);
    }

    public int updateCommunity(CommunityTO communityTO) {
        return communityDAO.updateCommunity(communityTO);
    }

    public int deleteCommunity(int boardSeq) {
        return communityDAO.deleteCommunityBySeq(boardSeq);
    }

}
