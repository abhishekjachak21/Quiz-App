package com.aj.quizapp.controller;

import com.aj.quizapp.model.Question;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		return questionService.getAllQuestions();
	}

	@GetMapping("/category/{category}")
	public List<Question> getQuestionsByCategory(@PathVariable String category) {
		return questionService.getQuestionsByCategory(category);
	}

	@GetMapping("/category/{category}/{difficultyLevel}")
	public List<Question> getQuestionByCategoryAndDifficultyLevel(@PathVariable String category,@PathVariable String difficultyLevel ){
		return questionService.getQuestionByCategoryAndDifficultyLevel( category,  difficultyLevel);	}

}
