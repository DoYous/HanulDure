package com.hanuldure.project.mapper;

import com.hanuldure.project.dto.CommunityTO;
import org.apache.ibatis.annotations.*;

public interface CommunityMapper {

    @Insert("INSERT INTO board (user_seq, board_title, board_content, board_write_date, board_type) VALUES (1, #{board_title}, #{board_content}, now(), #{board_type})")
    @Options(useGeneratedKeys = true, keyProperty = "board_seq")
    int insertCommunity(CommunityTO communityTO);

    @Select("SELECT board_seq, board_title, board_content, board_write_date, board_type FROM board WHERE board_seq = #{boardSeq}")
    CommunityTO selectCommunityBySeq(int board_seq);

    @Update("UPDATE board SET board_title = #{board_title}, board_content = #{board_content}, board_write_date = now(), board_type = #{board_type} WHERE board_seq = #{board_seq}")
    int updateCommunity(CommunityTO communityTO);
}
