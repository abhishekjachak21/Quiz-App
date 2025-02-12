package com.aj.quizapp.controller;

import com.aj.quizapp.model.Question;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aj.quizapp.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	QuestionService questionService;

	@GetMapping("/allQuestions")
	public List<Question> getAllQuestions() {
		List<Question> questions = questionService.getAllQuestions();
	    System.out.println("Questions fetched: " + questions); // Log the data
	    return questions;
	}

	@GetMapping("/category/{category}")
	public List<Question> getQuestionsByCategory(@PathVariable String category) {
		return questionService.getQuestionsByCategory(category);
	}

	@GetMapping("/category/{category}/{difficultyLevel}")
	public List<Question> getQuestionByCategoryAndDifficultyLevel(@PathVariable String category,@PathVariable String difficultyLevel ){
		return questionService.getQuestionByCategoryAndDifficultyLevel( category,  difficultyLevel);	}

	@PostMapping("/add")
	public String addQuestion(@RequestBody  Question question) {
		return questionService.addQuestion(question);
	}
	
}
