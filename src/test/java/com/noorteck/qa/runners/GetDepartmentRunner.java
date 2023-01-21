package com.noorteck.qa.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/resources/hr/US205-GetAllDeps.feature",
		glue = "com.noorteck.qa.steps",
		tags = "@GetAllExDeps",
		plugin = {"summary", "pretty", "html:target/cucumber-reports.html",
				"json:target/cucumber-reports",					
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class GetDepartmentRunner {

}
