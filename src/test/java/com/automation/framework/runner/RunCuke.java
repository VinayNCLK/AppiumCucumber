package com.automation.framework.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features= {"src/test/resources/features"},
glue= {"com.automation.framework.stepdefs"},
plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"html:target/cucumber-html-report",
		"json:target/cucumber/cucumber-reports/cucumber.json",
		"junit:target/cucumber-reports/cucumber.xml"})

public class RunCuke extends AbstractTestNGCucumberTests{

}
