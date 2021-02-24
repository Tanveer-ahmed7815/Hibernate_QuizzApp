package com.testyantra.HibernateQuizApp;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

import com.testyantra.dao.RegistrationDao;
import com.testyantra.dao.RegistrationDaoImple;
import com.testyantra.quizdtos.Users;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AppTest{
	
	RegistrationDao imples = new RegistrationDaoImple();
	Users user = new Users();
	private boolean success=true;
	
	@Test
	public void test1() {
		assertTrue("other cases failed", success);
		success = false;
		user.setUserName("anas");
		user.setPassword("sait");
		
		assertEquals(user, imples.registerUser(user, user.getUserName()));
		success = true;
	}
	
	@Test
	public void test2(){
		assertTrue("other cases failed", success);
		success = false;
		user.setUserId(10);
		user.setUserName("zach");
		user.setPassword("joseph");
		
		assertEquals(user, imples.loginUser(user));
		success = true;
	}
}