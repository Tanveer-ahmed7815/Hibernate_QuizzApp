package com.testyantra.dao;

import com.testyantra.quizdtos.Results;
import com.testyantra.quizdtos.Users;

public interface ResultsDao  {
	public void appendResults(Users user, Results res); 
	
}
