package com.hanuldure.project.service;

import com.hanuldure.project.mapper.ExpMapper;
import com.hanuldure.project.model.dto.ExpDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hanuldure.project.model.Exp;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpService {

    @Autowired
    private ExpMapper mapper;

    public List<Exp> getExpsByFarmerId(String farmerId) {
        List<Exp> exps = new ArrayList<>();

        // 예제 데이터 생성
        Exp exp1 = new Exp();
        exp1.setExpTitle("행사 제목1");
        exp1.setExpContent("행사 1 내용");
        exp1.setCurrentParticipants(15);
        exp1.setExpStatus("승인 완료");
        exp1.setExpStatus2("진행중");
        exps.add(exp1);

        Exp exp2 = new Exp();
        exp2.setExpTitle("행사 제목2");
        exp2.setExpContent("행사 2 내용");
        exp2.setCurrentParticipants(25);
        exp2.setExpStatus("승인 확인중");
        exp2.setExpStatus2("모집완료");
        exps.add(exp2);

        return exps;
    }

    public List<Exp> getExpsByUserId(String userId) {
        List<Exp> exps = new ArrayList<>();

        // 예제 데이터 생성
        Exp exp1 = new Exp();
        exp1.setExpTitle("행사 제목1");
        exp1.setExpContent("행사 1 내용");
        exp1.setCurrentParticipants(15);
        exp1.setExpStatus("승인 완료");
        exp1.setExpStatus2("진행중");
        exps.add(exp1);

        Exp exp2 = new Exp();
        exp2.setExpTitle("행사 제목2");
        exp2.setExpContent("행사 2 내용");
        exp2.setCurrentParticipants(25);
        exp2.setExpStatus("승인 확인중");
        exp2.setExpStatus2("모집완료");
        exps.add(exp2);

        return exps;
    }

    /* 체험 주최 신청 */
    public int registerExp(ExpDTO newExp) {
        return mapper.insertExp(newExp);
    }

    /* 체험 목록 조회 */

    /* 체험 상세 조회 */
    public ExpDTO getExpBySeq(int expSeq) {
        return mapper.selectExpBySeq(expSeq);
    }
}
