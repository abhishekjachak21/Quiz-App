package com.aj.quizapp.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.aj.quizapp.model.Question;
import com.aj.quizapp.dao.QuestionDao;

@Service
public class QuestionService {

	@Autowired
	QuestionDao questionDao;

	public List<Question> getAllQuestions() {
		return questionDao.findAll();
	}

	public List<Question> getQuestionsByCategory(String category) {
		// TODO Auto-generated method stub
		return questionDao.findByCategory(category);
	}

	public List<Question> getQuestionByCategoryAndDifficultyLevel(String category, String difficultyLevel) {
		// TODO Auto-generated method stub
		return questionDao.findByCategoryAndDifficultyLevel( category,  difficultyLevel);
	}

	public String addQuestion(Question question) {
		questionDao.save(question);
		return "sucess";
	}

}
