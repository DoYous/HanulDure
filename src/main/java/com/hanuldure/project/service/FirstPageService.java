package com.hanuldure.project.service;

import com.hanuldure.project.dao.FirstPageDAO;
import com.hanuldure.project.model.dto.FirstPageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstPageService {

    @Autowired
    private FirstPageDAO firstPageDAO;

    public FirstPageDTO searchRankExp(Integer expSeq) {

        return firstPageDAO.searchRankExp(expSeq);
    }
    
}
