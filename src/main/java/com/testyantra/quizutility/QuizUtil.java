package com.testyantra.quizutility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class QuizUtil {
	static EntityManagerFactory entityManagerFactory;
	static EntityManager entityManager;
	public static EntityManager dbConnector(){
		//step 1
    	entityManagerFactory = Persistence.createEntityManagerFactory("QuizDB");
    	
    	//step 2
    	entityManager = entityManagerFactory.createEntityManager();
    	
    	
    	return entityManager;
	}
	
	public static void closeResources() {
		//last step
		entityManager.close();
		entityManagerFactory.close();
	}
}
