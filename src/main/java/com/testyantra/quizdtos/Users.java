package com.testyantra.quizdtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="user_Id")
	private int userId;
	@Column(name="username")
	private String userName;
	private String password;
	
	public Users(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public Users(int userId, String userName, String password) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}



	public Users() {
		
	}

	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}

	
	
	
}
