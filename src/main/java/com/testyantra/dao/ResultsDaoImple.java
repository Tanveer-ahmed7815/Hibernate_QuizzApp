package com.testyantra.dao;

import javax.persistence.EntityManager;


import com.testyantra.quizdtos.Results;
import com.testyantra.quizdtos.Users;
import com.testyantra.quizutility.QuizUtil;

public class ResultsDaoImple implements ResultsDao{

	EntityManager entityManager = null;

	@Override
	public void appendResults(Users user,Results res) {
		try {
			entityManager = QuizUtil.dbConnector();
			entityManager.getTransaction().begin();
			if(user.getUserId()==res.getUserId()) {
			
			res.setUserId(res.getUserId());
			res.setScore(res.getScore());
			res.setQuestionLanguage(res.getQuestionLanguage());
			entityManager.persist(res);
			
			entityManager.getTransaction().commit();
			}
			
			QuizUtil.closeResources();
				
				
		 }
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
