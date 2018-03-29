package com.ecnu.dto;

import com.ecnu.entity.Question;
import lombok.Data;

import java.io.Serializable;

@Data
public class QuestionDTO implements Serializable {
    private String category;
    private String stem;//如果题干或选项过大怎么办？
    private String A;
    private String B;
    private String C;
    private String D;
    private String answer;//前台传回ABCD

    public QuestionDTO(){

    }

    public QuestionDTO(Question question){
        this.category=question.getCategory();
        this.stem=question.getStem();
        this.A=question.getA();
        this.B=question.getB();
        this.C=question.getC();
        this.D=question.getD();
        this.answer=question.getAnswer();

    }
}
