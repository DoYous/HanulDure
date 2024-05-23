package com.hanuldure.project.controller;


import com.hanuldure.project.model.dto.MemberDTO;
import com.hanuldure.project.model.dto.FirstPageDTO;
import com.hanuldure.project.model.session.SessionKey;
import com.hanuldure.project.service.FirstPageService;
import com.hanuldure.project.service.MemberService;
import com.hanuldure.project.service.ProfileService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("hanuldure")
public class FirstPageAndLoginPageController {

    private final ProfileService profileService;

    @Autowired
    public FirstPageAndLoginPageController(ProfileService profileService) {
        this.profileService = profileService;
    }


    @Autowired
    private MemberService memberService;
    public static Integer loginSession;
    @Autowired
    private FirstPageService firstPageService;

    @GetMapping("firstpage")
    public ModelAndView firstpage(ModelAndView model,HttpSession session) {
        Integer userSeq = (Integer) session.getAttribute("userSeq");
        System.out.println(userSeq);


        FirstPageDTO Ranking1 = firstPageService.searchRankExp(1);
        FirstPageDTO Ranking2 = firstPageService.searchRankExp(2);
        FirstPageDTO Ranking3 = firstPageService.searchRankExp(3);

        model.addObject("Ranking1", Ranking1);
        model.addObject("Ranking2", Ranking2);
        model.addObject("Ranking3", Ranking3);
        System.out.println(Ranking1);
        System.out.println(Ranking2);
        System.out.println(Ranking3);

        model.setViewName("login/firstpage");
        return model;
    }

    @GetMapping("login")
    public ModelAndView login(ModelAndView model){
        model.setViewName("/login/login");
        return model;
    }

    @PostMapping("login")
    public String loginOk(MemberDTO memberDTO, HttpServletRequest request, RedirectAttributes rttr) {
        Integer result = memberService.login(memberDTO);
        if (result == null) {
            return "redirect:/hanuldure/login";
        } else {
            HttpSession session = request.getSession();
            session.setAttribute(SessionKey.sessionUserSeq, result);
            loginSession = (Integer) session.getAttribute(SessionKey.sessionUserSeq);
            System.out.println(loginSession);
            com.hanuldure.project.dto.MemberDTO usertype = profileService.getMemberBySeq(loginSession);

            session.setAttribute("userType", usertype.getUserType());
            System.out.println("유저타입 확인" + usertype);

            return "redirect:/hanuldure/firstpage";
        }
    }

    @GetMapping("logout")
    public String logout(HttpServletRequest request){
        HttpSession session=request.getSession();
        session.invalidate();

        return "redirect:/hanuldure/firstpage";
    }

    @GetMapping("searchid")
    public ModelAndView searchid(ModelAndView model) {
        model.setViewName("/login/searchid");
        return model;
    }

    @PostMapping("searchid")
    public String searchidOk(MemberDTO memberDTO, RedirectAttributes rttr){
        String result=memberService.searchId(memberDTO);

            rttr.addFlashAttribute("result",result);
            System.out.println(result);
            return "redirect:/hanuldure/searchid";
    }

    @GetMapping("searchpwd")
    public ModelAndView searchpwd(ModelAndView model) {
        model.setViewName("/login/searchpwd");
        return model;
    }

    @PostMapping("searchpwd")
    public String searchpwdOk(MemberDTO memberDTO, RedirectAttributes rttr){
        String result=memberService.searchPwd(memberDTO);

            rttr.addFlashAttribute("result",result);
            System.out.println(result);
            return "redirect:/hanuldure/searchpwd";
    }


    @GetMapping("createmember")
    public ModelAndView createmember(ModelAndView model) {
        model.setViewName("/login/createmember");
        return model;
    }

    @PostMapping("createmember")
    public String creatememberOk(MemberDTO newMember){

        System.out.println(newMember);
        int result=memberService.signup(newMember);
        if(result==1){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        return "/login/login.html";
    }

}
