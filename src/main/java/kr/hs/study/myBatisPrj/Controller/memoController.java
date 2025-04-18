package kr.hs.study.myBatisPrj.Controller;

import kr.hs.study.myBatisPrj.DTO.MemoDTO;
import kr.hs.study.myBatisPrj.Service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class memoController {
    // 컨테이너에서 MemoService라는 타입을 보고 찾음
    @Autowired
    private MemoService service;

    @GetMapping("/Memo")
    public String memo(){
        return "memo_input";
    }

    @PostMapping("/memo_input")
    public String insert(MemoDTO dto){
        service.insert(dto);
        return "resultMemo";
    }
}
