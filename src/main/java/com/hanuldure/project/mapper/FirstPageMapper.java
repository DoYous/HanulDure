package com.hanuldure.project.mapper;

import com.hanuldure.project.model.dto.FirstPageDTO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FirstPageMapper {

    @Select("SELECT exp_seq,exp_title,exp_addr,exp_price,exp_min,exp_max,exp_img FROM EXP WHERE exp_seq = ${expSeq}")
    FirstPageDTO searchRankExp(Integer expSeq);


}
