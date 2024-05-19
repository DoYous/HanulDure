package com.hanuldure.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hanuldure")
public class FirstPageAndLoginPageController {
    @GetMapping("firstpage")
    public ModelAndView firstpage(ModelAndView model){
        model.setViewName("/main/firstpage");
        return model;
    }

    @GetMapping("login")
    public ModelAndView login(ModelAndView model){
        model.setViewName("/main/login");
        return model;
    }

}
