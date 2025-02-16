package com.aj.quizapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.aj.quizapp.dao.QuizDao;

@Service
public class QuizService {
	
	@Autowired
	QuizDao quizDao;

	public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
		return quiz;
	}

}
