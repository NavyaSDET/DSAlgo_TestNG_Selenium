package Tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;
import PageObjects.StackPage;

public class StackPageTests extends BaseTest{

	public HomePage hp = new HomePage();
	public StackPage sp = new StackPage();
	public IntroductionPage ip =  new IntroductionPage();

	@Parameters("browser")
    @BeforeClass
    public void setUpTest(String browser) {
        setUp(browser);
    }
	
	@BeforeMethod(alwaysRun = true)
	public void loginIntoApp() {
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.completeTheLOgin();
		ip.clickOnGetStartedButtonOfStack();
	}

	@AfterClass
    public void tearDownTest() {
        tearDown();
    }

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test1() {
		Assert.assertTrue(true);
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