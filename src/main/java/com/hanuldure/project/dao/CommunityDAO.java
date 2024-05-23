package com.hanuldure.project.dao;

import com.hanuldure.project.dto.CommunityTO;
import com.hanuldure.project.mapper.CommunityMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("communityDAO")
public class CommunityDAO {

    @Autowired
    private CommunityMapper mapper;

    public int insertCommunity(CommunityTO communityTO) {
        return mapper.insertCommunity(communityTO);
    }

    public List<CommunityTO> selectBoardList() {
        return mapper.selectBoardList();
    }

    public CommunityTO selectCommunityBySeq(int board_seq) {
        return mapper.selectCommunityBySeq(board_seq);
    }

    public int updateCommunity(CommunityTO communityTO) {
        return mapper.updateCommunity(communityTO);
    }

    public int deleteCommunityBySeq(int board_seq) {
        return mapper.deleteCommunityBySeq(board_seq);
    }
}
