package Tests;

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
		ip.completeTheLOgin();
		ip.clickOnGetStartedButtonOfStack();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_navigated_to_stack_details_page_when_clicked_on_get_started () {
		sp.validateUserIsOnStackDetailPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Operations_in_Stack_page () {
		sp.validateUserIsOnStackDetailPage();
		sp.clickOnOperationsInStackLink();
		sp.validateUserIsOnoperationsInStackText();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_Try_here_link_page_from_Operations_in_Stack () {
		sp.clickOnOperationsInStackLink();
		sp.validateUserIsOnoperationsInStackText();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_Editor_for_Operations_in_Stack_page () {
		sp.clickOnOperationsInStackLink();
		sp.validateUserIsOnoperationsInStackText();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says", "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_Operations_in_Stack_page () {
		sp.clickOnOperationsInStackLink();
		sp.validateUserIsOnoperationsInStackText();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_Operations_in_Stack_runs_successfully () {
		sp.clickOnOperationsInStackLink();
		sp.validateUserIsOnoperationsInStackText();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Implementation_page () {
		sp.validateUserIsOnStackDetailPage();
		sp.clickOnImplementationLink();
		sp.validateUserIsOnimplementaionText();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_click_on_Try_here_link_from_Implementation_page () {
		sp.clickOnImplementationLink();
		sp.validateUserIsOnimplementaionText();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_Editor_for_Implementation_page () {
		sp.clickOnImplementationLink();
		sp.validateUserIsOnimplementaionText();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says", "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_Implementation_page () {
		sp.clickOnImplementationLink();
		sp.validateUserIsOnimplementaionText();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_Implementation_runs_successfully () {
		sp.clickOnImplementationLink();
		sp.validateUserIsOnimplementaionText();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Applications_page () {
		sp.validateUserIsOnStackDetailPage();
		sp.clickOnApplicationsLink();
		sp.validateUserIsOnApplicationsText();
	}
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_click_on_Try_here_link_from_Applications_page () {
		sp.clickOnApplicationsLink();
		sp.validateUserIsOnApplicationsText();ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_Editor_for_Applications_page() {
		sp.clickOnApplicationsLink();
		sp.validateUserIsOnApplicationsText();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says", "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_Applications_page () {
		sp.clickOnApplicationsLink();
		sp.validateUserIsOnApplicationsText();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_Applications_runs_successfully () {
		sp.clickOnApplicationsLink();
		sp.validateUserIsOnApplicationsText();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}
}