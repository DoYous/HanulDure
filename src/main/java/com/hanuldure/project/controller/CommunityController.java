package com.hanuldure.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hanuldure")
public class CommunityController {

    @GetMapping("community")
    public ModelAndView partyList(ModelAndView model) {

        model.setViewName("/community/main");
        return model;
    }
}
