package com.aj.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aj.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer>  {

}
