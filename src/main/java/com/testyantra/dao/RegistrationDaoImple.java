package com.testyantra.dao;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;


import com.testyantra.HibernateQuizApp.App;
import com.testyantra.quizdtos.Users;
import com.testyantra.quizutility.QuizUtil;

public class RegistrationDaoImple implements RegistrationDao{
	
	Scanner sc = new Scanner(System.in);
	EntityManager entityManager = null;
	Users user;
	List<Users> list = new ArrayList<>();
		
		
	public Users registerUser(Users user,String name) {
		
		
		try {
			entityManager = QuizUtil.dbConnector();
			entityManager.getTransaction().begin();
			Query query = entityManager.createQuery("select U.userName from Users U where U.userName=:names");
			query.setParameter("names", name);
			
			if(query.getResultList().isEmpty()) {
				entityManager.persist(user);
				
				entityManager.getTransaction().commit();
				
				App.log.info("User Registered");
				list.add(user);
				return user;
			}
			else {
				
				App.log.info("User already exists");
		   		 return null;
			}
		 }
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
		
	}

	public Users loginUser(Users user) {
		
		//Users users = new Users(id, name, password);
		
		try {
			entityManager = QuizUtil.dbConnector();
			entityManager.getTransaction().begin();
			Query query = entityManager.createQuery("select U.userName from Users U where U.userName=:names and U.password=:pass and U.userId=:id");
			query.setParameter("names", user.getUserName());
			query.setParameter("pass", user.getPassword());
			query.setParameter("id", user.getUserId());
			if(query.getResultList().isEmpty()) {
				return null;	
			}
			else {
				 return user;
			}
		 }
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
		
		
	}

	

}
