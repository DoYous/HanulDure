package com.hanuldure.project.mapper;

import com.hanuldure.project.dto.CommunityTO;
import org.apache.ibatis.annotations.*;

public interface CommunityMapper {

    @Insert("INSERT INTO board (user_seq, board_title, board_content, board_write_date, board_type) VALUES (1, #{boardTitle}, #{boardContent}, now(), #{boardType})")
    @Options(useGeneratedKeys = true, keyProperty = "boardSeq")
    int insertCommunity(CommunityTO communityTO);

    @Select("SELECT board_seq, board_title, board_content, board_write_date, board_type FROM board WHERE board_seq = #{boardSeq}")
    CommunityTO selectCommunityBySeq(int boardSeq);

    @Update("UPDATE board SET board_title = #{boardTitle}, board_content = #{boardContent}, board_write_date = now(), board_type = #{boardType} WHERE board_seq = #{boardSeq}")
    int updateCommunity(CommunityTO communityTO);

    @Delete("DELETE FROM board WHERE board_seq = #{boardSeq}")
    int deleteCommunityBySeq(int boardSeq);
}
