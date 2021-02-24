package com.testyantra.operations;

import java.util.Scanner;

import com.testyantra.HibernateQuizApp.App;
import com.testyantra.quizdtos.Users;
import com.testyantra.service.QuizServiceImple;

public class OperationsSwitches {
	Scanner sc = new Scanner(System.in);
	QuizServiceImple imple = new QuizServiceImple();
	
	public void operations(Users user, int id) {
		App.log.info("Which quiz would you like to take?");
		App.log.info("1.Java 2.JavaScript 3.SQL");
		int choice = sc.nextInt();
		switch(choice) {
		case 1 : App.log.debug(1);
				 imple.javaQuiz(user,id);
			     break;
		case 2 : App.log.debug(2);
			     imple.javascriptQuiz(user, id);
				 break;
		case 3 : App.log.debug(3);
				 imple.sqlQuiz(user,id);
				 break;
			     
		}
	}
}
