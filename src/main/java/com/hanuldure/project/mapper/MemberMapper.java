package com.hanuldure.project.mapper;

import com.hanuldure.project.model.dto.MemberDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface MemberMapper {

    @Insert("INSERT INTO USER (user_seq,user_id, user_password, user_email,user_name, user_birth, user_phone,user_reason,user_region,user_gender,user_intro,user_point,user_type) VALUE(0,#{userId},#{userPassword},#{userEmail},#{userName},#{userBirth},#{userPhone},#{userReason},#{userRegion},#{userGender},#{userIntro},#{userPoint},#{userType})")
    int insertMember(MemberDTO newMember);

    @Select("SELECT user_seq FROM USER WHERE user_id=#{userId} AND user_password=#{userPassword}")
    Integer selectMember(MemberDTO newMember);

    @Select("SELECT user_id FROM USER WHERE user_name=#{userName} AND user_phone =#{userPhone}")
    String searchId(MemberDTO newMember);

    @Select("SELECT user_password FROM USER WHERE user_name=#{userName} AND user_phone =#{userPhone} AND user_id=#{userId}")
    String searchPwd(MemberDTO newMember);
}
