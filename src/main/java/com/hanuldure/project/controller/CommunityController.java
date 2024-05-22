package com.hanuldure.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hanuldure")
public class CommunityController {

    @GetMapping("community")
    public ModelAndView communityMain(ModelAndView mv) {

        mv.setViewName("/community/main");
        return mv;
    }

    @GetMapping("community/partyApply")
    public ModelAndView partyApply(ModelAndView mv) {

        mv.setViewName("/community/partyApply");
        return mv;
    }

    @GetMapping("community/partyList")
    public ModelAndView partyList(ModelAndView mv) {

        mv.setViewName("/community/partyList");
        return mv;
    }

    @GetMapping("community/boardList")
    public ModelAndView boardList(ModelAndView mv) {

        mv.setViewName("/community/boardList");
        return mv;
    }
}
