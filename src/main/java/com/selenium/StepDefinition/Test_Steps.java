package com.selenium.StepDefinition;

import java.util.List;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	
	
	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("homepage");
	    
	}

	@When("^User Navigate to LogIn Page$")
	public void User_Navigate_to_LogIn_Page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("loginpage");
	    
	}

	@When("^User enters UserName and Password$")
	public void User_enters_UserName_and_Password() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("usmanepassword");
	    
	}

	@Then("^Message displayed Login Successfully$")
	public void Message_displayed_Login_Successfully() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    System.out.println("loginsuccessful");
	}

	@When("^User LogOut from the Application$")
	public void User_LogOut_from_the_Application() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("logout");
	    
	}

	@Then("^Message displayed LogOut Successfully$")
	public void Message_displayed_LogOut_Successfully() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("logoutSuccesful");
	    
	}
	
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_enters_and(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    System.out.println(arg1+arg2);
	}
	
	@When("^User enters Credentials to LogIn$")
	public void User_enters_Credentials_to_LogIn(DataTable arg1) throws Throwable {
	    
		List<List<String>> data = arg1.raw();
		System.out.println(data.get(0).get(0));
		System.out.println(data.get(0).get(1));
		System.out.println(data.get(1).get(0));
		System.out.println(data.get(1).get(1));
		System.out.println(data.get(2).get(0));
		System.out.println(data.get(2).get(1));
	}
	

	@AfterMethod
	public void takescreenshotOnFailure(ITestResult res){
		if(res.getStatus() == ITestResult.FAILURE){
			//code for takesScreenshot code
			
		}
	}
}
