package kr.hs.study.myBatisPrj.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MemoDTO {
    private int idx;
    private String writer;
    private String Memo;
    private LocalDateTime post_date;
}
