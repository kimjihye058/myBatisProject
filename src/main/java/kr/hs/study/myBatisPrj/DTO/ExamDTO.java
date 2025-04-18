package kr.hs.study.myBatisPrj.DTO;

import lombok.Data;

@Data
public class ExamDTO {
    private String name;
    private int kor;
    private int eng;
    private int math;

}
