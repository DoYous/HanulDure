package com.hanuldure.project.controller;

import com.hanuldure.project.model.dto.ExpDTO;
import com.hanuldure.project.service.ExpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Calendar;
import java.util.Date;

@Controller
@RequestMapping("hanuldure")
public class ExpController {

    @Autowired
    private ExpService expService;

    @GetMapping("community/expView/{expSeq}")
    public String expView(Model model, @PathVariable int expSeq) {
        ExpDTO expDTO = expService.getExpBySeq(expSeq);

        model.addAttribute("exp", expDTO);
        return "main/expDetail";
    }

    /* 체험 주최 신청 페이지 */
    @GetMapping("community/expRequest")
    public String expRequest() {

        return "main/expRequest";
    }

    /* 체험 주최 신청 데이터 전송 */
    @PostMapping("community/expRequest")
    public String expRequestOk(RedirectAttributes rttr, ExpDTO newExp) {
        System.out.println(newExp);
        int result = expService.registerExp(newExp);

        /*
        * result == 1 (INSERT 성공) : 금방 신청한 체험의 상세페이지로 리디렉트
        * result != 1 (INSERT 실패) :
        * */
        if(result == 1) {
            rttr.addFlashAttribute("ExpDTO", newExp);
            return "redirect:/hanuldure/community/expView/" + newExp.getExpSeq();
        }else {
            return "redirect:/hanuldure/community/expRequest";
        }
    }
}
