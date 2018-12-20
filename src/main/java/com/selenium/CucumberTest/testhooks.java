package com.selenium.CucumberTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class testhooks {
	
	@Before("@regression")
	public void beforemethod(){
		System.out.println("!!!!!!!!!!!!!!!!!!!!!");
	}
	
	@After("@regression")
public void aftermethod(){
		System.out.println("____________________________");
	}
	
	@Before(value="@regression",order=1)
	public void setup(){
		System.out.println("#######################");
	}
	
	@After(order=1)
public void teardown(){
		System.out.println("$$$$$$$$$$$$$$$$$$$");
	}
		
	
}
