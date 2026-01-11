package com.Dhiraj.question_service.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "question_title")
    private String questionTitle;

    private String option1;
    private String option2;
    private String option3;
    private String option4;

    @Column(name = "right_ans")
    private String rightans;

    @Column(name = "difficulty_level")
    private String diffcultylevel;

    private String category;
}



