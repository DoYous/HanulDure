package com.hanuldure.project.dao;

import com.hanuldure.project.dto.CommunityTO;
import java.util.List;

public interface CommunityDAO {
    int insertCommunity(CommunityTO communityTO);

    CommunityTO selectCommunityBySeq(int board_seq);

}
