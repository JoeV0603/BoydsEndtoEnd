package org.stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\joevi\\eclipse-workspace\\BoydCoffee\\src\\test\\resources\\Feature\\Endtoend.feature", glue = {
		"org.stepdefinitions" }, monochrome = true, plugin = { "pretty",
				"html:C:\\Users\\joevi\\eclipse-workspace\\BoydCoffee\\target//HtmlReports" })

public class RunnerClass {

}
