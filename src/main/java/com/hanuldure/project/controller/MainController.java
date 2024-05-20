package com.hanuldure.project.controller;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hanuldure")
public class MainController {

    @GetMapping("main")
    public ModelAndView main(ModelAndView model) {

        model.setViewName("/main/main");
        return model;
    }

}
