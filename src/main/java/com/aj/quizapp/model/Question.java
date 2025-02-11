package com.aj.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Question") // Ensure this matches the actual table name
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String difficultyLevel;
    private String category;

    // Getters and Setters (or @Data from Lombok)
}



//package com.aj.quizapp;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.Data;
//
//@Data
//@Entity
//@Table(name = "question") // Ensure this matches your actual table name
//public class Question {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	private Integer id;
//	private String questionTitle;
//	private String option1;
//	private String option2;
//	private String option3;
//	private String option4;
//	private String rightAnswer;
//	private String difficultyLevel;
//	private String category;
//
//}
//
//
