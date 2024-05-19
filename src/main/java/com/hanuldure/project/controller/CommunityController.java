package com.hanuldure.project.controller;

import com.hanuldure.project.dao.CommunityDAO;
import com.hanuldure.project.dao.impl.CommunityDAOImpl;
import com.hanuldure.project.dto.CommunityTO;
import com.hanuldure.project.service.CommunityService;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.time.LocalDate;
import java.util.Date;

@Controller
@RequestMapping("hanuldure")
public class CommunityController {

    @Autowired
    private CommunityDAOImpl communitydaoimpl;

    @PostMapping("add")
    public ModelAndView add(HttpServletRequest request, ModelAndView model) {

        CommunityTO community = new CommunityTO();
        community.setBoard_title(request.getParameter("board_title"));
        community.setBoard_write_date(new Date());
        community.setBoard_type(request.getParameter("board_type"));
        community.setBoard_content(request.getParameter("board_content"));

        System.out.println(community);

        communitydaoimpl.insertCommunity(community);

        return model;
    }

    private final CommunityService communityService;

    @Autowired
    public CommunityController(CommunityService communityService) {
        this.communityService = communityService;
    }

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

    //상세페이지
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

    //글 목록보기 클릭 시
    @GetMapping("community/gowordlist")
    public String gowordlist() {
        return "redirect:/hanuldure/experiencepage";
    }

    @PostMapping("community/detail")
    public String addCommunityPost(@ModelAttribute CommunityTO communityTO) {
        communityService.addCommunity(communityTO);
        return "redirect:/community/detail";
    }
}
