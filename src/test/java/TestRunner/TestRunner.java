package TestRunner;


import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

		plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"html:target/htmlReport/report.html" }, // reporting purpose

		monochrome = false, // console output color
		features = { "src/test/resources/Features" },   // location of feature files
		glue = "StepDefinitions"                        // location of step definition files

		)


public class TestRunner {



}


