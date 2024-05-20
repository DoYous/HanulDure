package com.hanuldure.project.dao.impl;

import com.hanuldure.project.dao.CommunityDAO;
import com.hanuldure.project.dto.CommunityTO;
import com.hanuldure.project.mapper.CommunityMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("communityDAO")
public class CommunityDAOImpl implements CommunityDAO {

    @Autowired
    public CommunityMapper mapper;

    @Override
    public int insertCommunity(CommunityTO communityTO) {
        return mapper.insertCommunity(communityTO);
    }

    @Override
    public CommunityTO selectCommunityBySeq(int board_seq) {
        return mapper.selectCommunityBySeq(board_seq);
    }

}
