package kr.hs.study.myBatisPrj.Controller;

import kr.hs.study.myBatisPrj.DTO.ExamDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScoreController {

    @GetMapping("/score")
    public String score(){
        return "score_input";
    }

    @PostMapping("/resultScore")
    public String score_input(ExamDTO dto, Model model){
        int sum = dto.getKor() + dto.getEng() + dto.getMath();
        double avg = (double)sum/3.0;
        String result  = "";

        result += "국어 : " + dto.getKor() + " / " + " 영어 : " + dto.getEng() + " / " + " 수학 : " + dto.getMath() + " / " + " 총점 : " + sum + " / " + " 평균 : " + avg;

        System.out.println("국어 : " + dto.getKor());
        System.out.println("영어 : " + dto.getEng());
        System.out.println("수학 : " + dto.getMath());
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);

        model.addAttribute("result", result);
        return "resultScore";
    }

}