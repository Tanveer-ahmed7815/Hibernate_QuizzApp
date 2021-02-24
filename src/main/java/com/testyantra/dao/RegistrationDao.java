package com.testyantra.dao;

import com.testyantra.quizdtos.Users;

public interface RegistrationDao {
	public Users registerUser(Users user, String name);
	public Users loginUser(Users user);
	
	
}
