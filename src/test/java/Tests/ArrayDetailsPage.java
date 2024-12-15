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
import PageObjects.ArrayPage;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;
import io.cucumber.java.Before;

public class ArrayDetailsPage extends BaseTest{

	public HomePage hp = new HomePage();
	public ArrayPage ap = new ArrayPage();
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
		ip.clickOnGetStartedButtonOfArray();
	}
	
	@AfterClass
    public void tearDownTest() {
        tearDown();
    }

		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void validate_user_navigated_to_array_details_page_when_clicked_on_get_started(){
			ap.validateUserIsOnArrayDetailPage();
		}
	
		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void validate_user_can_navigate_to_Arrays_in_python (){
			ap.validateUserIsOnArrayDetailPage();
			ap.clickOnArrayInPythonLink();
			ap.validateUserIsOnArraysInPython();
		}
	
		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void validate_user_can_try_here_link_page_from_arrays_in_python() {
			ap.clickOnArrayInPythonLink();
			ap.validateUserIsOnArraysInPython();
			ip.clickOnTryHerebutton();
			ip.codeTryEditorPage();
		}
	
		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void Error_message_displayed_for_invalid_code_on_try_Editor_for_Queue_operations () {
			ap.clickOnArrayInPythonLink();
			ap.validateUserIsOnArraysInPython();
			ip.clickOnTryHerebutton();
			ip.enterCodeInEditor("ABC");
			ip.clickOnRunButton();
			ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says", "NameError: name 'ABC' is not defined on line 1");
		}
	
		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void No_error_message_displayed_for_empty_code_on_try_editor_for_array_in_python () {
			ap.clickOnArrayInPythonLink();
			ap.validateUserIsOnArraysInPython();
			ip.clickOnTryHerebutton();
			ip.clickOnRunButton();
			ip.validateNoConsoleOuput();
		}
	
		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void Valid_code_on_try_editor_for_arrays_in_python_runs_successfully () {
			ap.clickOnArrayInPythonLink();
			ap.validateUserIsOnArraysInPython();
			ip.clickOnTryHerebutton();
			ip.enterCodeInEditor("print(\"hello\")");
			ip.clickOnRunButton();
			ip.validateConsoleOutput("hello");
		}
	
		public void Validate_user_can_navigate_to_Arrays_using_list () {
			ap.validateUserIsOnArrayDetailPage();
			ap.clickOnArrayUsingListLink();
			ap.validateUserIsOnArraysUsingList();
		}
	
		public void Validate_user_can_Try_here_link_page_from_Array_using_list () {
			ap.clickOnArrayUsingListLink();
			ip.clickOnTryHerebutton();
			ip.codeTryEditorPage();
		}
	
		public void Error_message_displayed_for_invalid_code_on_try_Editor_for_Array_using_list () {
			ap.clickOnArrayUsingListLink();
			ip.clickOnTryHerebutton();
			ip.enterCodeInEditor("ABC");
			ip.clickOnRunButton();
			ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says", "NameError: name 'ABC' is not defined on line 1");
		}
	
		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void No_error_message_displayed_for_empty_code_on_try_editor_for_Array_using_list() {
			ap.clickOnArrayUsingListLink();
			ip.clickOnTryHerebutton();
			ip.clickOnRunButton();
			ip.validateNoConsoleOuput();
		}
	
		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void Valid_code_on_try_editor_for_Array_using_list_runs_successfully () {
			ap.clickOnArrayUsingListLink();
			ip.clickOnTryHerebutton();
			ip.enterCodeInEditor("print(\"hello\")");
			ip.clickOnRunButton();
			ip.validateConsoleOutput("hello");
		}
		
		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void Validate_user_can_navigate_to_basic_opertaions_in_lists () {
			ap.validateUserIsOnArrayDetailPage();
			ap.clickOnBasicOperationsLink();
			ap.validateUserIsOnBasicOperationsInList();
		}
	
		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void Validate_user_can_Try_here_link_page_from_Basic_operations_in_lists () {
			ap.clickOnBasicOperationsLink();
			ip.clickOnTryHerebutton();
			ip.codeTryEditorPage();
		}
	
		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void Error_message_displayed_for_invalid_code_on_try_Editor_for_Basic_operations_in_lists () {
			ap.clickOnBasicOperationsLink();
			ip.clickOnTryHerebutton();
			ip.enterCodeInEditor("ABC");
			ip.clickOnRunButton();
			ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says", "NameError: name 'ABC' is not defined on line 1");
		}
	
		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void No_error_message_displayed_for_empty_code_on_try_editor_for_basic_operations_in_lists () {
			ap.clickOnBasicOperationsLink();
			ip.clickOnTryHerebutton();
			ip.clickOnRunButton();
			ip.validateNoConsoleOuput();
		}
	
		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void Valid_code_on_try_editor_for_basic_operations_in_lists_runs_successfully () {
			ap.clickOnBasicOperationsLink();
			ip.clickOnTryHerebutton();
			ip.enterCodeInEditor("print(\"hello\")");
			ip.clickOnRunButton();
			ip.validateConsoleOutput("hello");
		}
	
		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void Validate_user_can_navigate_to_applications_of_array () {
			ap.validateUserIsOnArrayDetailPage();
			ap.clickOnApplicationOfArrayLink();
			ap.validateUserIsOnApplicationsOfArray();
		}
	
		public void Validate_user_can_Try_here_link_page_from_applications_of_array () {
			ap.clickOnApplicationOfArrayLink();
			ip.clickOnTryHerebutton();
			ip.codeTryEditorPage();
		}
	
		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void Error_message_displayed_for_invalid_code_on_try_Editor_for_applications_of_array () {
			ap.clickOnApplicationOfArrayLink();
			ip.clickOnTryHerebutton();
			ip.enterCodeInEditor("ABC");
			ip.clickOnRunButton();
			ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says", "NameError: name 'ABC' is not defined on line 1");
		}
	
		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void No_error_message_displayed_for_empty_code_on_try_editor_for_applications_of_array () {
			ap.clickOnApplicationOfArrayLink();
			ip.clickOnTryHerebutton();
			ip.clickOnRunButton();
			ip.validateNoConsoleOuput();
		}
	
		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void Valid_code_on_try_editor_for_applications_of_array_runs_successfully () {
			ap.clickOnApplicationOfArrayLink();
			ip.clickOnTryHerebutton();
			ip.enterCodeInEditor("print(\"hello\")");
			ip.clickOnRunButton();
			ip.validateConsoleOutput("hello");
		}
	
		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void validate_user_can_click_on_practicequestions () {
			ap.clickOnApplicationOfArrayLink();
			ap.clickOnPracticeQuestionsLink();
			ap.validateUserIsOnPracticeQuestionsPage();
		}

}
