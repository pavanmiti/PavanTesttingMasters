package com.runnnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features= "Features",
		glue = {"com.stepdefinitions"},
		monochrome = true,
		plugin={"html:reports.html","json:reports.json"},
		tags={"@tab"},
		
		dryRun=false
				)

public class RunnerClass {

}
