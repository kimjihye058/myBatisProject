package kr.hs.study.myBatisPrj.Controller;

import kr.hs.study.myBatisPrj.DTO.MemoDTO;
import kr.hs.study.myBatisPrj.Service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class memoController {
    // 컨테이너에서 MemoService라는 타입을 보고 찾음
    @Autowired
    private MemoService service;

    @PostMapping("/memo_input")
    public String insert(MemoDTO dto){
        service.insert(dto);    // 서비스의 인서트 호출
        return "redirect:/Memo";
    }
    @GetMapping("/Memo")
    public String listAll(Model model){
        List<MemoDTO> all = service.listAll();
        System.out.println(all);
        model.addAttribute("data", all);
        System.out.println("size: " + all.size());
        return "Memo";
    }

    @GetMapping("/edit/{idx}")
    public String edit_form(@PathVariable("idx") int idx, Model model) {
        System.out.println("index: " + idx);
        MemoDTO dto = service.selectOne(idx);
        model.addAttribute("one", dto);
        return "edit_form";
    }
    @PostMapping("/edit")
    public String update(MemoDTO dto){
        service.update(dto);
        return "redirect:/Memo";
    }
}
