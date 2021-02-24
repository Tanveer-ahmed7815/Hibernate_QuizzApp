package com.testyantra.HibernateQuizApp;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.testyantra.operations.OperationsSwitches;
import com.testyantra.quizdtos.Users;
import com.testyantra.service.QuizServiceImple;

public class App 
{
	public static Logger log = Logger.getLogger(App.class.getName());
	
    public static void main( String[] args )
    {
    	OperationsSwitches op = new OperationsSwitches();
    	Scanner sc = new Scanner(System.in);
    	QuizServiceImple quiz = new QuizServiceImple();
    	Users user = new Users();
    	log.info(("=====Welcome to Quiz App====="));
    	while(true) {
        
        log.info("1.Register 2.Login 3.Exit");
        int choice = sc.nextInt();
        switch(choice) {
        case 1 : user = quiz.registerUser();
         		 break;
        case 2 : user = quiz.loginUser();
			     if(user!= null) {
			    	 log.info("Login Successful.....Welcome " + user.getUserName());
			    	 System.out.println();
			       	op.operations(user,user.getUserId());
			     }
			     else {
			    	 System.out.println("User doesn't exist");
			     }
         		 break;
        case 3 : System.exit(0);
        
        default : log.info("Invaild choice...try again");
        		  sc.close();
        }
    	}
    }
    
}
