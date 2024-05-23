package com.hanuldure.project.controller;

import com.hanuldure.project.dto.MemberDTO;
import com.hanuldure.project.model.dto.ExpDTO;
import com.hanuldure.project.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public ModelAndView farmerProfile(@PathVariable("userSeq") int userSeq, /*int expSeq,*/ ModelAndView model) {
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
                    exp.setExpStatus(5);
                } else {
                    exp.setExpStatus(1);
                }
//                int expApplyCount = profileService.selectExpApplications(exp.getExpSeq());
//                exp.setExpApplyCount(expApplyCount);
//                System.out.println(expApplyCount);
            }
            model.addObject("expInfo", expInfo);
        }


//        if (!expInfo.isEmpty()) {
//            Integer expApplyCount = profileService.selectExpApplications(expInfo.get(0).getExpSeq());
//            model.addObject("expApplyCount", expApplyCount);
//            System.out.println(expApplyCount);
//        }

        /*확인문*/
        System.out.println(farmerprofile);
        System.out.println(expInfo);


        model.setViewName("profile/farmerprofile");
        return model;
    }
}
