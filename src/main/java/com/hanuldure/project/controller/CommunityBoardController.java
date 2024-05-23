package com.hanuldure.project.controller;

import com.hanuldure.project.dao.CommunityDAO;
//import com.hanuldure.project.dao.impl.CommunityDAOImpl;
import com.hanuldure.project.dto.CommunityTO;
import com.hanuldure.project.service.CommunityService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.Date;

@Controller
@RequestMapping("hanuldure")
public class CommunityBoardController {

    @Autowired
    private CommunityDAO communitydao;

    @PostMapping("add")
    public ModelAndView add(HttpServletRequest request, ModelAndView model) {
        CommunityTO community = new CommunityTO();
        community.setBoardTitle(request.getParameter("boardTitle"));
        community.setBoardType(request.getParameter("boardType"));
        community.setBoardContent(request.getParameter("boardContent"));
        community.setBoardWriteDate(new Date());

        System.out.println(community);
        communitydao.insertCommunity(community);

        // 리다이렉트 URL 설정
        model.setViewName("redirect:/hanuldure/community/detail/" + community.getBoardSeq());
        return model;
    }

    private final CommunityService communityService;

    @Autowired
    public CommunityBoardController(CommunityService communityService) {
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
    @GetMapping("community/edit/{boardSeq}")
    public ModelAndView communityedit(@PathVariable("boardSeq") int boardSeq, ModelAndView model) {

        CommunityTO community = communityService.getCommunityBySeq(boardSeq);
        model.addObject("community", community);
        System.out.println(community);

        model.setViewName("/community/communityedit");
        LocalDate today = LocalDate.now();



        model.addObject("today", today.toString());
        return model;
    }

    @PostMapping("community/update")
    public ModelAndView updateCommunity(HttpServletRequest request, ModelAndView model) {
        int boardSeq = Integer.parseInt(request.getParameter("boardSeq"));
        CommunityTO community = new CommunityTO();
        community.setBoardSeq(boardSeq);
        community.setBoardTitle(request.getParameter("boardTitle"));
        community.setBoardType(request.getParameter("boardType"));
        community.setBoardContent(request.getParameter("boardContent"));
        community.setBoardWriteDate(new Date());

        System.out.println(community);

        communityService.updateCommunity(community);

        model.setViewName("redirect:/hanuldure/community/detail/" + community.getBoardSeq());
        return model;
    }

    //상세페이지
    @GetMapping("community/detail/{boardSeq}")
    public ModelAndView communityDetail(@PathVariable("boardSeq") int boardSeq, ModelAndView model) {

        CommunityTO community = communityService.getCommunityBySeq(boardSeq);
        if (community == null) {
            model.setViewName("redirect:/hanuldure/errorPage");
            return model;
        }

        model.addObject("community", community);
        model.setViewName("/community/communitydetail");
        return model;
    }

    @GetMapping("errorPage")
    public String errorPage() {
        return "error/errorpage";
    }


    @PostMapping("/community/delete")
    public String deleteCommunity(@RequestParam("boardSeq") int boardSeq) {
        int result = communityService.deleteCommunity(boardSeq);
        
        return "redirect:/community";
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
