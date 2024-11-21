package TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"html:target/report/parallel.html" }, // reporting purpose
		features = {"src/test/resources/Features"}, //location of feature files
		glue= "StepDefinitions" //location of step definition files
		) 

public class ParallelTestRunner extends AbstractTestNGCucumberTests{

	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
				
		return super.scenarios();	
    }
}