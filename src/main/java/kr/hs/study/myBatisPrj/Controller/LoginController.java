package kr.hs.study.myBatisPrj.Controller;

import kr.hs.study.myBatisPrj.DTO.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(){
        return "login_input";
    }

    @PostMapping("/resultLogin")
    public String loginResult(LoginDTO dto, Model model){
        String result = "Wrong";

        if(dto.getUserId().equals("lay")  || dto.getUserPs() == 1111)
            result = "Welcome!";

    model.addAttribute("lg", result);
        return "resultLogin";
    }
}