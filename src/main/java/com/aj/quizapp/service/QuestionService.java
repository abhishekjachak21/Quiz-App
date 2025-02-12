package com.aj.quizapp.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.aj.quizapp.model.Question;
import com.aj.quizapp.dao.QuestionDao;

@Service
public class QuestionService {

	@Autowired
	QuestionDao questionDao;

	public ResponseEntity<List<Question>> getAllQuestions() {
		try {
			return new ResponseEntity<>(questionDao.findAll(),HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST); //if error comes.
	}

	public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
		try {
			return new ResponseEntity<>(questionDao.findByCategory(category), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST); //if error comes
	}

	public List<Question> getQuestionByCategoryAndDifficultyLevel(String category, String difficultyLevel) {
		// TODO Auto-generated method stub
		return questionDao.findByCategoryAndDifficultyLevel( category,  difficultyLevel);
	}

	public ResponseEntity<String> addQuestion( Question question) {
        questionDao.save(question);
        return new ResponseEntity<>(("success"), HttpStatus.CREATED);
    }

}
