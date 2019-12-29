package com.adactin.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", glue = "com\\adactin\\stepdefinition", plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:Report/cucubmer_report.html", "json:cucumber_reports.json",
		"html:Report" }, monochrome = true, dryRun = false, strict = true

)

public class Runner {
	
	public static void setup() {
		
		// TODO Auto-generated method stub
	}
	
	public  void tearDown() {
		// TODO Auto-generated method stub

	}

}