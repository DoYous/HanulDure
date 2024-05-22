package com.hanuldure.project.controller;


import com.hanuldure.project.model.dto.MemberDTO;
import com.hanuldure.project.model.dto.FirstPageDTO;
import com.hanuldure.project.model.session.SessionKey;
import com.hanuldure.project.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("hanuldure")
public class FirstPageAndLoginPageController {

    @Autowired
    private MemberService memberService;
    public static Integer loginSession;

    @GetMapping("firstpage")
    public ModelAndView firstpage(ModelAndView model){

        model.addObject("ranking1",new FirstPageDTO("모내기","경기도",10000,3,4,"/image/eximage.png"));
        model.addObject("ranking2",new FirstPageDTO("벼베기","충청도",10000,5,7,"/image/eximage.png"));
        model.addObject("ranking3",new FirstPageDTO("씨심기","전라도",10000,3,8,"/image/eximage.png"));
        model.setViewName("/login/firstpage");
        return model;
    }

    @GetMapping("login")
    public ModelAndView login(ModelAndView model, HttpServletRequest request){
        model.setViewName("/login/login");
        return model;
    }

    @PostMapping("login")
    public String loginOk(MemberDTO memberDTO, HttpServletRequest request){
        Integer result=memberService.login(memberDTO);
        if(result==null){
            return "redirect:/hanuldure/login";
        }else{
            HttpSession session=request.getSession();
            session.setAttribute(SessionKey.sessionUserSeq,result);
            loginSession=(Integer)session.getAttribute(SessionKey.sessionUserSeq);
            System.out.println(loginSession);
            return "redirect:/hanuldure/firstpage";
        }
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
//        MemberDTO newMember=new MemberDTO();
//        newMember.setUserId(request.getParameter("userId"));
//        newMember.setUserPassword(request.getParameter("userPassword"));
//        newMember.setUserName(request.getParameter("userName"));
//        newMember.setUserBirth(request.getParameter("userBirth"));
//        newMember.setUserPhone(request.getParameter("userPhone"));
//        newMember.setUserType(request.getParameter("userType"));
//        newMember.setUserPhone(request.getParameter("userPhone"));

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
