Feature: Title of your feature
  I want to use this template for my feature file

 Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters Credentials to LogIn
    | testuser_1 | Test@153 |
        | testuser_2 | Test@154 |
            | testuser_3 | Test@155 |
	Then Message displayed Login Successfully