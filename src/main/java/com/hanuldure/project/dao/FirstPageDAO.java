package com.hanuldure.project.dao;

import com.hanuldure.project.mapper.FirstPageMapper;
import com.hanuldure.project.model.dto.FirstPageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("firstpageDAO")
public class FirstPageDAO {

    @Autowired
    private FirstPageMapper mapper;

    public FirstPageDTO searchRankExp(Integer expSeq) {
        return mapper.searchRankExp(expSeq);
    }
}
