package com.testyantra.quizdtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="questions")
public class Questions {
	@Id
	@Column(name="question_Id")
	private int questionId;
	@Column(name="question_language")
	private String questionLanguage;
	@Column(name="question")
	private String questions;
	@Column(name="answer")
	private int answer;
	
	public Questions(int questionId, String questionLanguage, String questions, int answer) {
		this.questionId = questionId;
		this.questionLanguage = questionLanguage;
		this.questions = questions;
		this.answer = answer;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public Questions() {
		
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionLanguage() {
		return questionLanguage;
	}

	public void setQuestionLanguage(String questionLanguage) {
		this.questionLanguage = questionLanguage;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", questionLanguage=" + questionLanguage + ", questions="
				+ questions + ", answer=" + answer + "]";
	}

	
	
	
	
	
}
