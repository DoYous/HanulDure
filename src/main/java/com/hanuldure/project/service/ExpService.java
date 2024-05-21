package com.hanuldure.project.service;

import org.springframework.stereotype.Service;
import com.hanuldure.project.model.Exp;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExpService {

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
}
