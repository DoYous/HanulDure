package com.hanuldure.project.controller;

import com.hanuldure.project.model.User;
import com.hanuldure.project.service.ExpService;
import com.hanuldure.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hanuldure")
public class UserProfileController {

    @Autowired
    private UserService userService;

    @Autowired
    private ExpService expService;

    @GetMapping("/userprofile")
    public ModelAndView userProfile(ModelAndView model) {
        // 현재 로그인한 사용자의 ID를 얻어온다고 가정하고,
        String userId = "currentUserId";

        // 해당 ID를 사용하여 사용자 정보를 조회한다.
        User user = userService.getUserById(userId);

        // 사용자가 참여한 행사 정보를 가져와서 모델에 추가한다.
        model.addObject("user", user);
        model.addObject("exps", expService.getExpsByUserId(userId));

        // 프로필 페이지 템플릿을 반환한다.
        model.setViewName("profile/userprofile");
        return model;
    }
}
