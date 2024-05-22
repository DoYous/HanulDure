package com.hanuldure.project.controller;

import com.hanuldure.project.dto.MemberDTO;
import com.hanuldure.project.model.Farmer;
import com.hanuldure.project.model.dto.ExpDTO;
import com.hanuldure.project.service.ExpService;
import com.hanuldure.project.service.FarmerService;
import com.hanuldure.project.service.ProfileService;
import com.hanuldure.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("hanuldure") // URL 수정
public class FarmerProfileController {

    private final ProfileService profileService;

    @Autowired
    public FarmerProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("farmerprofile/{userSeq}")
    public ModelAndView farmerProfile(@PathVariable("userSeq") int userSeq, ModelAndView model) {
        MemberDTO farmerprofile = profileService.getUserDetailsBySeq(userSeq);
        model.addObject("farmerprofile", farmerprofile);

//        ExpDTO expInfo = profileService.selectExpByUserSeq(userSeq);
//        if (expInfo != null) {      //null일 경우 정보 안보냄
//            model.addObject("expInfo", expInfo);
//        }

        List<ExpDTO> expInfo = profileService.selectAllExpByUserSeq(userSeq);
        if (expInfo != null) {      //null일 경우 정보 안보냄
            Date now = new Date();
            for (ExpDTO exp : expInfo) {
                if (exp.getExpEnd().before(now)) {
                    exp.setExpStatus("종료됨");
                } else {
                    exp.setExpStatus("진행중");
                }
            }
            model.addObject("expInfo", expInfo);
        }

        /*확인문*/
        System.out.println(farmerprofile);
        System.out.println(expInfo);

        model.setViewName("profile/farmerprofile");
        return model;
    }
}
