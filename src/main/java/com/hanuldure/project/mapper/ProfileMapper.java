package com.hanuldure.project.mapper;

import com.hanuldure.project.dto.ExpApplyDTO;
import com.hanuldure.project.dto.MemberDTO;
import com.hanuldure.project.model.dto.ExpDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProfileMapper {

    @Select("SELECT user_name, user_phone, user_region, user_intro FROM user WHERE user_seq = #{userSeq}")
    MemberDTO selectUserDetails(int userSeq);

//    @Select("SELECT e.exp_title, e.exp_Content FROM exp e JOIN user u ON u.user_seq = e.user_seq WHERE u.user_seq = #{userSeq}")
//    ExpDTO selectExpDetails(int userSeq);

    @Select("SELECT e.exp_end, e.exp_title, e.exp_content FROM exp e JOIN user u ON u.user_seq = e.user_seq WHERE u.user_seq = #{userSeq}")
    List<ExpDTO> selectExpAllDetails(int userSeq);

    @Select("SELECT SUM(apply_user_num) FROM exp_apply WHERE exp_seq = 1") //#{expSeq}
    Integer selectExpApplications(int expSeq);
}
