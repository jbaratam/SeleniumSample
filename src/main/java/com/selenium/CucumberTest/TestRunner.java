package com.selenium.CucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "Feature"
 ,glue={"com.selenium.StepDefinition"},
 dryRun = false,
		 format = {"html:target"}
 )
 
public class TestRunner {
 
}