package com.hanuldure.project.mapper;

import com.hanuldure.project.dto.CommunityTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

public interface CommunityMapper {

    @Insert("INSERT INTO board (user_seq, board_title, board_content, board_write_date, board_type) VALUES (1, #{board_title}, #{board_content}, now(), #{board_type})")
    @Options(useGeneratedKeys = true, keyProperty = "board_seq")
    int insertCommunity(CommunityTO communityTO);

    @Select("SELECT board_title, board_content, board_write_date, board_type FROM board WHERE board_seq = #{boardSeq}")
    CommunityTO selectCommunityBySeq(int board_seq);
}
