package com.testyantra.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.testyantra.HibernateQuizApp.App;
import com.testyantra.quizdtos.Options;
import com.testyantra.quizdtos.Results;
import com.testyantra.quizdtos.Users;
import com.testyantra.quizutility.QuizUtil;

public class QuizDaoImple implements QuizDao{

	Scanner sc = new Scanner(System.in);
	EntityManager entityManager = null;
	ResultsDao dao = new ResultsDaoImple(); 
	
	int score=0;
	
	@Override
	public void javaQuiz(Users user, int id) {
		try {
			entityManager = QuizUtil.dbConnector();
			entityManager.getTransaction().begin();
			
			int count=110;
			for(int i=1; i<=3;i++) {
				count++;
				Query query = entityManager.createQuery("select Q.questions from Questions Q where Q.questionId=:id");
				query.setParameter("id", count);
		    	Object question=query.getSingleResult();
		    	App.log.info(question);
				System.out.println();
				
				Query options = entityManager.createQuery("select O from Options O where O.questionId=:id");
				options.setParameter("id", count);
				@SuppressWarnings("unchecked")
				List<Options> list = options.getResultList();
			    
				App.log.info(list.get(0).getOptionOne());
				App.log.info(list.get(0).getOptionTwo());
				App.log.info(list.get(0).getOptionThree());
				App.log.info(list.get(0).getOptionFour());
		    	System.out.println();
		    	
		    	App.log.info("Enter you answer....");
		    	int answers = sc.nextInt();
		    	App.log.debug(answers);
		    	query = entityManager.createQuery("select Q.answer from Questions Q where Q.questionId=:id");
		    	query.setParameter("id", count);
		    	Object answer=query.getSingleResult();
		    	if(answer.equals(answers)) {
		    		score++;
		    	}
		    	
		    	
		    	System.out.println();
		    	continue;
		    	
				
			}
			App.log.info("Your Score is = " + (score/0.03) +"%");
			Results res = new Results(id, score,"Java");
			dao.appendResults(user,res);
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}


	@Override
	public void javascriptQuiz(Users user, int id) {
		try {
			entityManager = QuizUtil.dbConnector();
			entityManager.getTransaction().begin();
			
			int count=210;
			for(int i=1; i<=3;i++) {
				count++;
				Query query = entityManager.createQuery("select Q.questions from Questions Q where Q.questionId=:id");
				query.setParameter("id", count);
		    	Object question=query.getSingleResult();
		    	App.log.info(question);
				System.out.println();
				
				Query options = entityManager.createQuery("select O from Options O where O.questionId=:id");
				options.setParameter("id", count);
				@SuppressWarnings("unchecked")
				List<Options> list = options.getResultList();
			    
				App.log.info(list.get(0).getOptionOne());
				App.log.info(list.get(0).getOptionTwo());
				App.log.info(list.get(0).getOptionThree());
				App.log.info(list.get(0).getOptionFour());
		    	System.out.println();
		    	
		    	App.log.info("Enter you answer....");
		    	int answers = sc.nextInt();
		    	App.log.debug(answers);
		    	query = entityManager.createQuery("select Q.answer from Questions Q where Q.questionId=:id");
		    	query.setParameter("id", count);
		    	Object answer=query.getSingleResult();
		    	if(answer.equals(answers)) {
		    		score++;
		    	}
		    	
		    	
		    	System.out.println();
		    	continue;
		    	
				
			}
			App.log.info("Your Score is = " + (score/0.03) +"%");
			Results res = new Results(id, score,"JavaScript");
			dao.appendResults(user,res);
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}


	@Override
	public void sqlQuiz(Users user, int id) {
		try {
			entityManager = QuizUtil.dbConnector();
			entityManager.getTransaction().begin();
			
			int count=310;
			for(int i=1; i<=3;i++) {
				count++;
				Query query = entityManager.createQuery("select Q.questions from Questions Q where Q.questionId=:id");
				query.setParameter("id", count);
		    	Object question=query.getSingleResult();
		    	App.log.info(question);
				System.out.println();
				
				Query options = entityManager.createQuery("select O from Options O where O.questionId=:id");
				options.setParameter("id", count);
				@SuppressWarnings("unchecked")
				List<Options> list = options.getResultList();
			    
				App.log.info(list.get(0).getOptionOne());
				App.log.info(list.get(0).getOptionTwo());
				App.log.info(list.get(0).getOptionThree());
				App.log.info(list.get(0).getOptionFour());
		    	System.out.println();
		    	
		    	System.out.println("Enter you answer....");
		    	int answers = sc.nextInt();
		    	App.log.debug(answers);
		    	query = entityManager.createQuery("select Q.answer from Questions Q where Q.questionId=:id");
		    	query.setParameter("id", count);
		    	Object answer=query.getSingleResult();
		    	if(answer.equals(answers)) {
		    		score++;
		    	}
		    	
		    	
		    	System.out.println();
		    	continue;
		    	
				
			}
			App.log.info("Your Score is = " + (score/0.03) +"%");
			App.log.info(score);
			Results res = new Results(id, score,"SQL");
			dao.appendResults(user,res);
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
