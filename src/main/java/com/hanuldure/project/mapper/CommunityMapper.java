package com.hanuldure.project.mapper;

import com.hanuldure.project.dto.CommunityTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommunityMapper {

    @Insert("INSERT INTO board (board_seq, user_seq, board_title, board_content, board_write_date, board_type) VALUES (#{board_seq}, 0, #{board_title}, #{board_content}, now(), #{board_type})")
    int insertCommunity(CommunityTO communityTO);


}
