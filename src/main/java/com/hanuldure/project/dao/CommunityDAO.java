package com.hanuldure.project.dao;

import com.hanuldure.project.dto.CommunityTO;
import com.hanuldure.project.mapper.CommunityMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("communityDAO")
public class CommunityDAO {

    @Autowired
    private CommunityMapper mapper;

    public int insertCommunity(CommunityTO communityTO) {
        return mapper.insertCommunity(communityTO);
    }

    public CommunityTO selectCommunityBySeq(int board_seq) {
        return mapper.selectCommunityBySeq(board_seq);
    }
}
