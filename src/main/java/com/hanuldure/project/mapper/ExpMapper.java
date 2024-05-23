package com.hanuldure.project.mapper;

import com.hanuldure.project.model.dto.ExpDTO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ExpMapper {

    /* 체험 주최 신청 */
    int insertExp(ExpDTO newExp);

    /* 체험 목록 조회 */
    List<ExpDTO> selectExpList(boolean isMain);

    /* 체험 상세 조회 */
    ExpDTO selectExpBySeq(int seq);

    @Select("SELECT exp_get_end FROM exp WHERE exp_seq = #{newExp}")
    ExpDTO selectExpGetEnd(int newExp);
}
