package TestRunners;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import Utilities.ConfigReader;

@CucumberOptions(features = { "src/test/resources/Features" }, // location of feature files
glue = { "StepDefinitions" }) // location of step definition files
public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

	@BeforeTest
	@Parameters({"browser"})
	public void defineBrowser(String browser) throws Throwable {
		ConfigReader.loadConfig();
		ConfigReader.setBrowserType(browser);
		System.out.println(" in runner " + browser);
	}

}