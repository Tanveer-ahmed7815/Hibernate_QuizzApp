package com.testyantra.dao;

import com.testyantra.quizdtos.Users;

public interface QuizDao {
	public void javaQuiz(Users user, int id);

	public void javascriptQuiz(Users user, int id);

	public void sqlQuiz(Users user, int id);
}
