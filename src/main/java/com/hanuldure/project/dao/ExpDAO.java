package com.hanuldure.project.dao;

import com.hanuldure.project.mapper.ExpMapper;
import com.hanuldure.project.model.dto.ExpDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("expDAO")
public class ExpDAO {

    @Autowired
    private ExpMapper mapper;

    public ExpDTO selectExpGetEnd(int newExp){
        return mapper.selectExpGetEnd(newExp);
    }
}
