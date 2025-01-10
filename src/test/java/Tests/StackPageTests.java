package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseTest.BaseTest;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;
import PageObjects.StackPage;
import Utilities.RetryAnalyzer;

public class StackPageTests extends BaseTest{

	public HomePage hp;
	public StackPage sp;
	public IntroductionPage ip;

	@BeforeMethod(alwaysRun = true)
	public void loginIntoApp() {
		hp = new HomePage();
		sp = new StackPage();
		ip =  new IntroductionPage();hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.completeTheLogin();
		ip.clickOnGetStartedButtonOfStack();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_navigated_to_stack_details_page_when_clicked_on_get_started () {
		Assert.assertEquals(driver.findElement(sp.StackDetail).getText(), "Stack"); 
		Assert.assertTrue(driver.findElement(sp.StackDetail).isDisplayed());
		Assert.assertEquals(driver.getCurrentUrl(),"https://dsportalapp.herokuapp.com/stack/");
		Assert.assertEquals(driver.findElement(sp.topicsCovered).getText(),"Topics Covered");	
		Assert.assertTrue(driver.findElement(sp.topicsCovered).isDisplayed());
		Assert.assertTrue(driver.findElement(sp.TopicsCoveredOptions).isDisplayed());	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Operations_in_Stack_page () {
		sp.clickOnOperationsInStackLink();
		Assert.assertEquals(driver.findElement(sp.operationsInStackText).getText(),"Operations in Stack");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_Try_here_link_page_from_Operations_in_Stack () {
		sp.clickOnOperationsInStackLink();
		Assert.assertEquals(driver.findElement(sp.operationsInStackText).getText(),"Operations in Stack");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_Editor_for_Operations_in_Stack_page () {
		sp.clickOnOperationsInStackLink();
		Assert.assertEquals(driver.findElement(sp.operationsInStackText).getText(),"Operations in Stack");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_Operations_in_Stack_page () {
		sp.clickOnOperationsInStackLink();
		Assert.assertEquals(driver.findElement(sp.operationsInStackText).getText(),"Operations in Stack");
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_Operations_in_Stack_runs_successfully () {
		sp.clickOnOperationsInStackLink();
		Assert.assertEquals(driver.findElement(sp.operationsInStackText).getText(),"Operations in Stack");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Implementation_page () {
		sp.clickOnImplementationLink();
		Assert.assertEquals(driver.findElement(sp.implementaionText).getText(),"Implementation");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_click_on_Try_here_link_from_Implementation_page () {
		sp.clickOnImplementationLink();
		Assert.assertEquals(driver.findElement(sp.implementaionText).getText(),"Implementation");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_Editor_for_Implementation_page () {
		sp.clickOnImplementationLink();
		Assert.assertEquals(driver.findElement(sp.implementaionText).getText(),"Implementation");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_Implementation_page () {
		sp.clickOnImplementationLink();
		Assert.assertEquals(driver.findElement(sp.implementaionText).getText(),"Implementation");
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_Implementation_runs_successfully () {
		sp.clickOnImplementationLink();
		Assert.assertEquals(driver.findElement(sp.implementaionText).getText(),"Implementation");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Applications_page () {
		sp.clickOnApplicationsLink();
		Assert.assertEquals(driver.findElement(sp.ApplicationsText).getText(),"Applications");
	}
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_click_on_Try_here_link_from_Applications_page () {
		sp.clickOnApplicationsLink();
		Assert.assertEquals(driver.findElement(sp.ApplicationsText).getText(),"Applications");ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_Editor_for_Applications_page() {
		sp.clickOnApplicationsLink();
		Assert.assertEquals(driver.findElement(sp.ApplicationsText).getText(),"Applications");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_Applications_page () {
		sp.clickOnApplicationsLink();
		Assert.assertEquals(driver.findElement(sp.ApplicationsText).getText(),"Applications");
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_Applications_runs_successfully () {
		sp.clickOnApplicationsLink();
		Assert.assertEquals(driver.findElement(sp.ApplicationsText).getText(),"Applications");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}
}