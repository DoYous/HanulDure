package com.hanuldure.project.service;

import com.hanuldure.project.dao.CommunityDAO;
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

}
