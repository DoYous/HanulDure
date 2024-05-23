package com.hanuldure.project.controller;

import com.hanuldure.project.dto.CommunityTO;
import com.hanuldure.project.model.dto.ExpDTO;
import com.hanuldure.project.service.CommunityService;
import com.hanuldure.project.service.ExpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("hanuldure")
public class CommunityController {

    private ExpService expService;
    private CommunityService communityService;

    public CommunityController(ExpService expService, CommunityService communityService) {
        this.expService = expService;
        this.communityService = communityService;
    }

    @GetMapping("community")
    public String communityMain(Model model) {

        List<ExpDTO> expList = expService.getExpList(true);
        List<CommunityTO> boardList = communityService.getBoardList();

        model.addAttribute("expList", expList);
        model.addAttribute("boardList", boardList);

        return "/community/main";
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

        List<CommunityTO> boardList = communityService.getBoardList();

        mv.addObject("boardList", boardList);
        mv.setViewName("/community/boardList");
        return mv;
    }
}
