package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Utilities.RetryAnalyzer;
import BaseTest.BaseTest;
import PageObjects.ArrayPage;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;

public class DSIntroductionPage extends BaseTest{
	public HomePage hp;
	public ArrayPage ap;
	public IntroductionPage ip;

	@BeforeMethod
	public void loginIntoApp() {
		hp = new HomePage();
		ap = new ArrayPage();
		ip =  new IntroductionPage();
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.completeTheLogin();
		ip.clickOnGetStartedButtonOfDSIntroduction();
	}


	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void clicking_on_get_started_for_data_structers_lands_on_Data_Structers_details_page() {
		Assert.assertTrue(driver.findElement(ip.dataStructurePageHeader).isDisplayed());
		Assert.assertEquals(driver.findElement(ip.dataStructurePageHeader).getText(), "Data Structures-Introduction");
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/data-structures-introduction/");
		Assert.assertTrue(driver.findElement(ip.dispalyTimeComplexity).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void clicking_on_time_complexity_navigate_to_the_page() {
		ip.clickOnTimeComplexiButton();
		Assert.assertTrue(driver.findElement(ip.timeComplexityPage).isDisplayed());   
		Assert.assertEquals(driver.findElement(ip.timeComplexityPage).getText(), "Time Complexity");	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Clicking_on_Try_Here_on_time_complexity_opens_python_editor() {
		ip.clickOnTimeComplexiButton();
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_editor_for_Time_Complexity () {
		ip.clickOnTimeComplexiButton();
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
		Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_Time_Complexity () {
		ip.clickOnTimeComplexiButton();
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_Time_Complexity_runs_successfully () {
		ip.clickOnTimeComplexiButton();
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}


}
