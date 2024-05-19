package com.hanuldure.project.controller;

import com.hanuldure.project.dto.CommunityTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.time.LocalDate;

@Controller
@RequestMapping("hanuldure")
public class CommunityController {

    //글 작성
    @GetMapping("community/write")
    public ModelAndView communitywrite(ModelAndView model) {
        LocalDate today = LocalDate.now();
        model.addObject("today", today.toString());
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

    //메인버튼 클릭 시
    @GetMapping("community/mainbt")
    public String gomain() {
        return "redirect:/hanuldure/mainpage";
    }

    @GetMapping("community/gowordlist")
    public String gowordlist() {
        return "redirect:/hanuldure/experiencepage";
    }
}
