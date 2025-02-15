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
		Assert.assertTrue(ip.validateElementDisplayed(ip.dataStructurePageHeader));
		Assert.assertEquals(ip.getTextForElement(ip.dataStructurePageHeader), "Data Structures-Introduction");
		Assert.assertEquals(ip.getCurrentUrl(), "https://dsportalapp.herokuapp.com/data-structures-introduction/");
		Assert.assertTrue(ip.validateElementDisplayed(ip.dispalyTimeComplexity));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void clicking_on_time_complexity_navigate_to_the_page() {
		ip.clickOnTimeComplexiButton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.timeComplexityPage));   
		Assert.assertEquals(ip.getTextForElement(ip.timeComplexityPage), "Time Complexity");	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Clicking_on_Try_Here_on_time_complexity_opens_python_editor() {
		ip.clickOnTimeComplexiButton();
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_editor_for_Time_Complexity () {
		ip.clickOnTimeComplexiButton();
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_Time_Complexity () {
		ip.clickOnTimeComplexiButton();
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
		ip.clickOnRunButton();
		Assert.assertFalse(ip.validateElementDisplayed(ip.consoleOutput));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_Time_Complexity_runs_successfully () {
		ip.clickOnTimeComplexiButton();
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(ip.getTextForElement(ip.consoleOutput), "hello");
	}


}
