package com.automation.framework.stepdefs;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.automation.framework.base.TestBase;
import com.automation.framework.screens.ChooseTopicsScreen;
import com.automation.framework.screens.HomeScreen;
import com.automation.framework.screens.LoginScreen;
import com.automation.framework.screens.SkipLoginScreen;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FlipboardSteps extends TestBase{
	
	
	LoginScreen login;
	ChooseTopicsScreen chooseTopics;
	SkipLoginScreen skipLoginScreen;
	HomeScreen homeScreen;
	
	@Before
	public void init()
	{
		setUp();
		login = new LoginScreen(driver);
		chooseTopics = new ChooseTopicsScreen(driver);
		skipLoginScreen = new SkipLoginScreen(driver);
		homeScreen = new HomeScreen(driver);
	}
	
	@After
	public void close(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			ExtentCucumberAdapter.getCurrentStep().fail("-----Test case failed------");
		}
		tearDown();
	}
	
	
	
	@Given("user click on getstartedbutton")
	public void user_click_on_getstartedbutton() {
	    // Write code here that turns the phrase above into concrete actions
		login.clickGetStarted();
	}


	@When("user selects {int} topic")
	public void user_selects_topic(Integer int1)
	{
		chooseTopics.chooseTopics(int1).clickContinueButton();
	}
	
	
	
}
