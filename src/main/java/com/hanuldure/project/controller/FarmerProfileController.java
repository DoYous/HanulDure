package com.hanuldure.project.controller;

import com.hanuldure.project.model.Farmer;
import com.hanuldure.project.service.ExpService;
import com.hanuldure.project.service.FarmerService;
import com.hanuldure.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hanuldure") // URL 수정
public class FarmerProfileController {

    @Autowired
    private FarmerService farmerService;

    @Autowired
    private ExpService expService;

    @GetMapping("/farmerprofile/{farmerSeq}") // GET 요청 처리 및 URL 수정
    public ModelAndView farmerProfile(ModelAndView model, @PathVariable String farmerSeq) {
        // 현재 로그인한 농업인의 ID를 얻어온다고 가정하고,

        // 해당 ID를 사용하여 농업인 정보를 조회한다.
        Farmer farmer = farmerService.getFarmerProfile(farmerSeq); // FarmerService를 이용하여 농업인 정보 조회

        // 농업인이 참여한 행사 정보를 가져와서 모델에 추가한다.
        model.addObject("farmer", farmer); // 모델에 농업인 정보 추가
        model.addObject("exps", expService.getExpsByFarmerId(farmerSeq)); // 모델에 농업인이 참여한 행사 정보 추가

        // 프로필 페이지 템플릿을 반환한다.
        model.setViewName("profile/farmerprofile"); // 프로필 페이지 템플릿 지정
        return model; // 모델 반환
    }
}
