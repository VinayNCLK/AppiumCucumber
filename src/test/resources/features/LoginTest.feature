Feature: Login Feature
	In order to do perform successfull login
	As a user
	I want to launch the Flipboard app
	
Scenario: Click on continue button
	Given user click on getstartedbutton
	
	
Scenario Outline:: Click on continue button and select topics
	Given user click on getstartedbutton
	When user selects <topics> topic
	
	
	Examples:
		| topics |
		| 4		   |