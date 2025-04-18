package kr.hs.study.myBatisPrj.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class T_TableController {
    @GetMapping("/t_Table")
    public String ttable() {
        return "table_input";
    }

    @PostMapping("/result")
    public String tableinput(@RequestParam("number") int n, Model model) {

        String result = "";

        for(int i=1; i<=9; i++) {
            System.out.println(i + " x " + n + " = " + i * n);
            result += i + " x " + n + " = " + i*n + " // ";
            model.addAttribute("ttre", result);

        }

        return "result";
    }
}
