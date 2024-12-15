package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import BaseTest.BaseTest;
import PageObjects.QueuePage;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;

public class QueueDetails extends BaseTest {

	public HomePage hp = new HomePage();
	public QueuePage qp = new QueuePage();
	public IntroductionPage ip = new IntroductionPage();

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
		ip.clickOnGetStartedButtonOfQueue();
	}

	@AfterClass
	public void tearDownTest() {
		tearDown();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_navigated_to_queue_details_page_when_clicked_on_get_started() {
		qp.validateUserIsOnQueueDetailsPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Implementations_of_Queue_in_Python() {
		qp.validateUserIsOnQueueDetailsPage();
		qp.clickOnImplementationOfQueueInPython();
		qp.validateUserIsOnQueueInPythonPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_open_try_editor_page_from_Implementation_of_Queue_in_python() {
		qp.clickOnImplementationOfQueueInPython();
		qp.validateUserIsOnQueueInPythonPage();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_editor_for_Implementation_of_Queue_in_python() {
		qp.clickOnImplementationOfQueueInPython();
		qp.validateUserIsOnQueueInPythonPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_Implementation_of_Queue_in_python() {
		qp.clickOnImplementationOfQueueInPython();
		qp.validateUserIsOnQueueInPythonPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_Implementation_of_Queue_in_python_runs_successfully() {
		qp.clickOnImplementationOfQueueInPython();
		qp.validateUserIsOnQueueInPythonPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Implementation_using_collections_deque() {
		qp.validateUserIsOnQueueDetailsPage();
		qp.clickOnImplementationUsingCollectionsDeque();
		qp.validateUserIsOnImplementationUsingCollectionsDequePage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_open_try_editor_page_from_Implementation_using_collections_deque() {
		qp.clickOnImplementationUsingCollectionsDeque();
		qp.validateUserIsOnImplementationUsingCollectionsDequePage();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_editor_for_Implementation_using_collections_deque() {
		qp.clickOnImplementationUsingCollectionsDeque();
		qp.validateUserIsOnImplementationUsingCollectionsDequePage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_Implementation_using_collections_deque() {
		qp.clickOnImplementationUsingCollectionsDeque();
		qp.validateUserIsOnImplementationUsingCollectionsDequePage();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_Implementation_using_collections_deque_runs_successfully() {
		qp.clickOnImplementationUsingCollectionsDeque();
		qp.validateUserIsOnImplementationUsingCollectionsDequePage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_queue_operations_page() {
		qp.validateUserIsOnQueueDetailsPage();
		qp.clickOnQueueOperations();
		qp.validateUserIsOnQueueOperationsPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_open_try_editor_page_from_queue_operations() {
		qp.clickOnQueueOperations();
		qp.validateUserIsOnQueueOperationsPage();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_editor_for_queue_operations() {
		qp.clickOnQueueOperations();
		qp.validateUserIsOnQueueOperationsPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_queue_operations() {
		qp.clickOnQueueOperations();
		qp.validateUserIsOnQueueOperationsPage();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_queue_operations_runs_successfully() {
		qp.clickOnQueueOperations();
		qp.validateUserIsOnQueueOperationsPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_implementation_using_array() {
		qp.validateUserIsOnQueueDetailsPage();
		qp.clickOnImplementationUsingArray();
		qp.validateUserIsOnImplementationUsingArrayPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_open_try_editor_page_from_implementation_using_array() {
		qp.clickOnImplementationUsingArray();
		qp.validateUserIsOnImplementationUsingArrayPage();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_editor_for_implementation_using_array() {
		qp.clickOnImplementationUsingArray();
		qp.validateUserIsOnImplementationUsingArrayPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_implementation_using_array() {
		qp.clickOnImplementationUsingArray();
		qp.validateUserIsOnImplementationUsingArrayPage();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_implementation_using_array_runs_successfully() {
		qp.clickOnImplementationUsingArray();
		qp.validateUserIsOnImplementationUsingArrayPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}
}