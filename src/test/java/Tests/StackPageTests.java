package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseTest.BaseTest;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;
import PageObjects.StackPage;
import Utilities.RetryAnalyzer;
import Utilities.TestDataProvider;

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
		Assert.assertEquals(ip.getTextForElement(sp.StackDetail), "Stack"); 
		Assert.assertTrue(ip.validateElementDisplayed(sp.StackDetail));
		Assert.assertEquals(ip.getCurrentUrl(),"https://dsportalapp.herokuapp.com/stack/");
		Assert.assertEquals(ip.getTextForElement(sp.topicsCovered),"Topics Covered");	
		Assert.assertTrue(ip.validateElementDisplayed(sp.topicsCovered));
		Assert.assertTrue(ip.validateElementDisplayed(sp.TopicsCoveredOptions));	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Operations_in_Stack_page () {
		sp.clickOnOperationsInStackLink();
		Assert.assertEquals(ip.getTextForElement(sp.operationsInStackText),"Operations in Stack");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_Try_here_link_page_from_Operations_in_Stack () {
		sp.clickOnOperationsInStackLink();
		Assert.assertEquals(ip.getTextForElement(sp.operationsInStackText),"Operations in Stack");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "stackInValidcodeTopics", dataProviderClass = TestDataProvider.class)
	public void Error_message_displayed_for_invalid_code_on_try_Editor (int topicNumber, String inValidCode) {
		sp.clickOnStackTopListByPosition(topicNumber);
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor(inValidCode);
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "stackInValidcodeTopics", dataProviderClass = TestDataProvider.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor(int topicNumber, String inValidCode) {
		sp.clickOnStackTopListByPosition(topicNumber);
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(ip.validateElementDisplayed(ip.consoleOutput));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "stackValidcodeTopics", dataProviderClass = TestDataProvider.class)
	public void Valid_code_on_try_editor_runs_successfully (int topicNumber, String validCode) {
		sp.clickOnStackTopListByPosition(topicNumber);
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor(validCode);
		ip.clickOnRunButton();
		Assert.assertEquals(ip.getTextForElement(ip.consoleOutput), "Hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Implementation_page () {
		sp.clickOnImplementationLink();
		Assert.assertEquals(ip.getTextForElement(sp.implementaionText),"Implementation");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_click_on_Try_here_link_from_Implementation_page () {
		sp.clickOnImplementationLink();
		Assert.assertEquals(ip.getTextForElement(sp.implementaionText),"Implementation");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Applications_page () {
		sp.clickOnApplicationsLink();
		Assert.assertEquals(ip.getTextForElement(sp.ApplicationsText),"Applications");
	}
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_click_on_Try_here_link_from_Applications_page () {
		sp.clickOnApplicationsLink();
		Assert.assertEquals(ip.getTextForElement(sp.ApplicationsText),"Applications");ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

}