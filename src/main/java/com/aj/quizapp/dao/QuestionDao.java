package com.aj.quizapp.dao;


import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.aj.quizapp.model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
	
	List<Question> findByCategory(String category);
	
	List<Question> findByCategoryAndDifficultyLevel(String category, String difficultyLevel);
	
}
