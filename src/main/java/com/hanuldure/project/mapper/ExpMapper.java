package com.hanuldure.project.mapper;

import com.hanuldure.project.model.dto.ExpDTO;

public interface ExpMapper {

    /* 체험 주최 신청 */
    int insertExp(ExpDTO newExp);

    /* 체험 상세 조회 */
    ExpDTO selectExpBySeq(int seq);

}
