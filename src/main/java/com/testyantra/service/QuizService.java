package com.testyantra.service;

import com.testyantra.quizdtos.Users;

public interface QuizService {
	public Users registerUser();
	public Users loginUser();
	public void javaQuiz(Users user,int id);
	public void javascriptQuiz(Users user,int id);
	public void sqlQuiz(Users user,int id);
}
