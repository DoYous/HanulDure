package com.hanuldure.project.controller;

import com.hanuldure.project.dao.CommunityDAO;
//import com.hanuldure.project.dao.impl.CommunityDAOImpl;
import com.hanuldure.project.dao.MemberDAO;
import com.hanuldure.project.dto.CommunityTO;
import com.hanuldure.project.dto.MemberDTO;
import com.hanuldure.project.service.CommunityService;
import com.hanuldure.project.service.MemberService;
import com.hanuldure.project.service.ProfileService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("hanuldure")
public class CommunityBoardController {

    @Autowired
    private CommunityDAO communitydao;
    @Autowired
    private ProfileService profileService;

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
    private final MemberService memberService;

    @Autowired
    public CommunityBoardController(CommunityService communityService, MemberService memberService) {
        this.communityService = communityService;
        this.memberService = memberService;
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
    public ModelAndView communityDetail(@PathVariable("boardSeq") int boardSeq, ModelAndView model, HttpSession session) {
        Integer userSeq = (Integer) session.getAttribute("userSeq");
        System.out.println("현재 세션값은 = " + userSeq);

        MemberDTO memberDTO = profileService.getUserDetailsBySeq(userSeq);
        System.out.println("세션값으로 가져오는 username = " + memberDTO.getUserName());
        session.setAttribute("username", memberDTO.getUserName());

        List<CommunityTO> boardseqvalue = communityService.getCommunityByBoardSeq(userSeq);
        System.out.println("세션 값으로 가져오는 보더값 = " + boardseqvalue);

        // 현재 boardSeq가 유저 게시물 목록에 포함되어 있는지 확인하는 구문
//        boolean BoardIn = boardseqvalue.stream().anyMatch(b -> b.getBoardSeq() == boardSeq);
        /*boolean BoardIn;
        if(boardSeq == boardseqvalue.get(1).getBoardSeq()) {
            BoardIn = true;
            System.out.println("반환값 true 작동 확인");
            model.addObject("BoardIn", BoardIn);
        }else{
            BoardIn = false;
            System.out.println("반환값 fales 작동 확인" + BoardIn);
            model.addObject("BoardIn", BoardIn);
        }*/
//        model.addObject("isBoardSeqInList", BoardIn);
//        System.out.println("반환값 확인" + BoardIn);

        CommunityTO community = communityService.getCommunityBySeq(boardSeq);
        System.out.println("지금 띄워주는 정보 값들 = " + community);
        if (community == null) {
            model.setViewName("redirect:/hanuldure/errorPage");
            return model;
        }

        int userinseq = community.getUserSeq();
        System.out.println("여기 확인해주세요 ! " + userinseq);

        boolean BoardIn;
        if(userinseq == userSeq){
            BoardIn = true;
            System.out.println("반환값 true 작동 확인");
            model.addObject("BoardIn", BoardIn);
        }else{
            BoardIn = false;
        }

        MemberDTO whatisname = memberService.getWhatUserName(userinseq);
        System.out.println(whatisname);
        model.addObject("whatisname", whatisname);

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
        
        return "redirect:/hanuldure/community";
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
