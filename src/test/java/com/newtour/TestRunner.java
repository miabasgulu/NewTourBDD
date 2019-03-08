package com.newtour;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(
		dryRun = false, 
		tags = { "@Test" }, 
		monochrome = true,
		strict = true,
		plugin = { "pretty", "html:target/html", "json:target/cucumber.json" },
		//glue = {"stepdefinition"},
		features = "./src/test/resources/features")

public class TestRunner extends AbstractTestNGCucumberTests {
  
} 
 