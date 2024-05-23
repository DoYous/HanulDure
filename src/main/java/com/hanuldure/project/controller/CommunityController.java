package com.hanuldure.project.controller;

import com.hanuldure.project.model.dto.ExpDTO;
import com.hanuldure.project.service.ExpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("hanuldure")
public class CommunityController {

    private ExpService expService;

    public CommunityController(ExpService expService) {
        this.expService = expService;
    }

    @GetMapping("community")
    public ModelAndView communityMain(ModelAndView mv) {

        List<ExpDTO> expList = expService.getExpList(true);

        mv.addObject("expList", expList);

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

        List<ExpDTO> expList = expService.getExpList(false);

        mv.addObject("expList", expList);
        mv.setViewName("/community/partyList");
        return mv;
    }

    @GetMapping("community/boardList")
    public ModelAndView boardList(ModelAndView mv) {

        mv.setViewName("/community/boardList");
        return mv;
    }
}
