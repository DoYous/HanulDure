package com.hanuldure.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hanuldure")
public class CommunityController {

    //글 작성
    @GetMapping("community/write")
    public ModelAndView communitywrite(ModelAndView model) {

        model.setViewName("/community/communitywrite");
        return model;
    }

    //글 수정
    @GetMapping("community/edit")
    public ModelAndView communityedit(ModelAndView model) {

        model.setViewName("/community/communityedit");
        return model;
    }

    @GetMapping("community/detail")
    public ModelAndView communitydetail(ModelAndView model) {

        model.setViewName("/community/communitydetail");
        return model;
    }
}
