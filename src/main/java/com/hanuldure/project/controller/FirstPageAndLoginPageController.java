package com.hanuldure.project.controller;

import com.hanuldure.project.model.dto.firstpageDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hanuldure")
public class FirstPageAndLoginPageController {
    @GetMapping("firstpage")
    public ModelAndView firstpage(ModelAndView model){

        model.addObject("ranking1",new firstpageDTO("모내기","경기도",10000,3,4,"/image/eximage.png"));
        model.addObject("ranking2",new firstpageDTO("벼베기","충청도",10000,5,7,"/image/eximage.png"));
        model.addObject("ranking3",new firstpageDTO("씨심기","전라도",10000,3,8,"/image/eximage.png"));
        model.setViewName("/main/firstpage");
        return model;
    }

    @GetMapping("login")
    public ModelAndView login(ModelAndView model){
        model.setViewName("/main/login");
        return model;
    }

    @GetMapping("searchid")
    public ModelAndView searchid(ModelAndView model) {
        model.setViewName("/main/searchid");
        return model;
    }

    @GetMapping("searchpwd")
    public ModelAndView searchpwd(ModelAndView model) {
        model.setViewName("/main/searchpwd");
        return model;
    }

    @GetMapping("createmember")
    public ModelAndView createmember(ModelAndView model) {
        model.setViewName("/main/createmember");
        return model;
    }

    @PostMapping("creatememberOk")
    public ModelAndView creatememberOk(){
        return null;
    }

}
