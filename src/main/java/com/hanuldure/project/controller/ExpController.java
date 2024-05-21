package com.hanuldure.project.controller;

import com.hanuldure.project.model.dto.ExpDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Calendar;
import java.util.Date;

@Controller
@RequestMapping("hanuldure")
public class ExpController {

    @GetMapping("expDetail/{expSeq}")
    public ModelAndView expDetail(ModelAndView model) {
        // Date 객체 생성
        Calendar calendar = Calendar.getInstance();

        calendar.set(2024, Calendar.MAY, 28, 0, 0);
        Date expStart = calendar.getTime();

        calendar.set(2024, Calendar.MAY, 29, 0, 0);
        Date expEnd = calendar.getTime();

        calendar.set(2024, Calendar.MAY, 20, 0, 0);
        Date expGetStart = calendar.getTime();

        calendar.set(2024, Calendar.MAY, 21, 0, 0);
        Date expGetEnd = calendar.getTime();

        // ExpDTO 객체 생성
        ExpDTO exp = new ExpDTO(
                1,
                1,
                "체험 제목",
                "마을 앞으로 금강이 흐르며, 일몰이 장관인 산들강웅포마을은 \n" +
                        "7대 낙조 명소 중 하나로 꼽히는 곳입니다. \n" +
                        "환경과 생태계 보호를 위해 힘쓰고 있으며, \n" +
                        "깔끔한 숙박, 맛있는 음식, 다양한 체험 프로그램을 경험할 수 있습니다.",
                expStart,
                expEnd,
                expGetStart,
                expGetEnd,
                2,
                40,
                "인천 미추홀구 경인로",
                "개인농장",
                "이미지",
                30000,
                1,
                "체험으로 검정깨강정을 만들었는데 맛은 물론 좋았고 시설이 깔끔하고 잘 갖춰져 있어 불편함이 하나도 없었습니다. 지인분 추천으로 다녀왔는데 왜 추천해줬는지 알 것 같고, 또 기회가 된다면 다녀올 생각입니다!",
                "2024-05-14",
                "qoalstj01",
                30
        );

        model.addObject("exp", exp);
        model.setViewName("/main/expDetail");
        return model;
    }

    @GetMapping("expHostSub")
    public ModelAndView expHostSub(ModelAndView model) {
        model.setViewName("/main/expHostSub");
        return model;
    }
}
