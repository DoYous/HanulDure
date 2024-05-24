package com.hanuldure.project.mapper;

import com.hanuldure.project.dto.CommunityTO;
import com.hanuldure.project.dto.MemberDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CommunityMapper {

    @Insert("INSERT INTO board (user_seq, board_title, board_content, board_write_date, board_type) VALUES (1, #{boardTitle}, #{boardContent}, now(), #{boardType})")
    @Options(useGeneratedKeys = true, keyProperty = "boardSeq")
    int insertCommunity(CommunityTO communityTO);

    @Select("SELECT board_seq, board_title, board_content, board_write_date, board_type FROM board ORDER BY board_seq DESC")
    List<CommunityTO> selectBoardList();

    @Select("SELECT user_seq, board_seq, board_title, board_content, board_write_date, board_type FROM board WHERE board_seq = #{boardSeq}")

    CommunityTO selectCommunityBySeq(int boardSeq);

    @Update("UPDATE board SET board_title = #{boardTitle}, board_content = #{boardContent}, board_write_date = now(), board_type = #{boardType} WHERE board_seq = #{boardSeq}")
    int updateCommunity(CommunityTO communityTO);

    @Delete("DELETE FROM board WHERE board_seq = #{boardSeq}")
    int deleteCommunityBySeq(int boardSeq);

    @Select("SELECT board_seq FROM board where user_seq = #{userSeq}")
    List<CommunityTO> selectBoardSeqbyUser(int userSeq);

}
