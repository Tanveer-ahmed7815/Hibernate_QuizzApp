package com.testyantra.service;


import java.util.Scanner;


import com.testyantra.HibernateQuizApp.App;
import com.testyantra.dao.QuizDao;
import com.testyantra.dao.QuizDaoImple;
import com.testyantra.dao.RegistrationDao;
import com.testyantra.dao.RegistrationDaoImple;
import com.testyantra.quizdtos.Users;

public class QuizServiceImple implements QuizService{

	Scanner sc = new Scanner(System.in);
	QuizDao d = new QuizDaoImple();
	RegistrationDao r = new RegistrationDaoImple();
	Users user = new Users();
	
	
	public Users registerUser() {
		App.log.info("Enter username");
		String name = sc.next();
		App.log.debug(name);
		App.log.info("Enter password");
		String password = sc.next();
		App.log.debug("****");
		user = new Users(name, password);
		return r.registerUser(user,name);
	}

	
	public Users loginUser() {
		App.log.info("Enter user id");
		int id = sc.nextInt();
		App.log.debug(id);
		App.log.info("Enter username");
		String name = sc.next();
		App.log.debug(name);
		App.log.info("Enter password");
		String password = sc.next();
		App.log.debug("****");
		user = new Users(id, name, password);
		return r.loginUser(user);
	}

	public void javaQuiz(Users user, int id) {
		d.javaQuiz(user,id);
	}

	
	public void sqlQuiz(Users user, int id) {
		d.sqlQuiz(user,id);
	}

	

	
	public void javascriptQuiz(Users user, int id) {
		d.javascriptQuiz(user,id);
		
	}

	

}
