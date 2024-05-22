package com.hanuldure.project.controller;

import com.hanuldure.project.dto.MemberDTO;
import com.hanuldure.project.model.Farmer;
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
import org.springframework.web.servlet.ModelAndView;

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
//        MemberDTO farmerprofile = new MemberDTO();
//        farmerprofile.setUserSeq(1);
        model.addObject("farmerprofile", farmerprofile);

        System.out.println(farmerprofile);

        model.setViewName("profile/farmerprofile");
        return model;
    }
}
