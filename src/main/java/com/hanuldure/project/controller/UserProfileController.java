package com.hanuldure.project.controller;

import com.hanuldure.project.dto.MemberDTO;
import com.hanuldure.project.model.User;
import com.hanuldure.project.model.dto.ExpDTO;
import com.hanuldure.project.service.ExpService;
import com.hanuldure.project.service.ProfileService;
import com.hanuldure.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/hanuldure")
public class UserProfileController {

//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private ExpService expService;

    private final ProfileService profileService;

    @Autowired
    public UserProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/userprofile/{userSeq}")
    public ModelAndView userProfile(@PathVariable("userSeq") int userSeq, /*int expSeq,*/ ModelAndView model) {
        MemberDTO userprofile = profileService.getUserDetailsBySeq(userSeq);
        model.addObject("userprofile", userprofile);

        List<ExpDTO> expInfo = profileService.selectAllExpByUserSeq(userSeq);
        if (expInfo != null) {      //null일 경우 정보 안보냄
            Date now = new Date();
            for (ExpDTO exp : expInfo) {
                if (exp.getExpEnd().before(now)) {
                    exp.setExpStatus(5);
                } else {
                    exp.setExpStatus(1);
                }
                int expApplyCount = profileService.selectExpApplications(exp.getExpSeq());
                exp.setExpApplyCount(expApplyCount);
                System.out.println(expApplyCount);
            }
            model.addObject("expInfo", expInfo);
        }


//        if (!expInfo.isEmpty()) {
//            Integer expApplyCount = profileService.selectExpApplications(expInfo.get(0).getExpSeq());
//            model.addObject("expApplyCount", expApplyCount);
//            System.out.println(expApplyCount);
//        }

        /*확인문*/
        System.out.println(userprofile);
        System.out.println(expInfo);
//        // 현재 로그인한 사용자의 ID를 얻어온다고 가정하고,
//        String userId = "currentUserId";
//
//        // 해당 ID를 사용하여 사용자 정보를 조회한다.
//        User user = userService.getUserById(userId);
//
//        // 사용자가 참여한 행사 정보를 가져와서 모델에 추가한다.
//        model.addObject("user", user);
//        model.addObject("exps", expService.getExpsByUserId(userId));
//
//        // 프로필 페이지 템플릿을 반환한다.
        model.setViewName("profile/userprofile");
        return model;
    }
}
