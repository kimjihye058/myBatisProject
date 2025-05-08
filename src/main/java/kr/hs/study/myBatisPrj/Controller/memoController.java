package kr.hs.study.myBatisPrj.Controller;

import kr.hs.study.myBatisPrj.DTO.MemoDTO;
import kr.hs.study.myBatisPrj.Service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class memoController {
    // 컨테이너에서 MemoService라는 타입을 보고 찾음
    @Autowired
    private MemoService service;

    @GetMapping("/Memo")
    public String memo(){
        return "memo_input";
    }

    @PostMapping("/resultMemo")
    public String insert(MemoDTO dto){
        service.insert(dto);    // 서비스의 인서트 호출
        return "resultMemo";
    }
    @GetMapping("/Memo/list")
    public String listAll(Model model){
        List<MemoDTO> all = service.listAll();
        model.addAttribute("data", all);
        System.out.println("size: " + all.size());
        return "resultMemo";
    }
}
