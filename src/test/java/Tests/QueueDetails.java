package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Utilities.RetryAnalyzer;
import BaseTest.BaseTest;
import PageObjects.QueuePage;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;

public class QueueDetails extends BaseTest{

	public HomePage hp;
	public QueuePage qp;
	public IntroductionPage ip;

	@BeforeMethod(alwaysRun = true)
	public void loginIntoApp() {
		hp = new HomePage();
		qp = new QueuePage();
		ip =  new IntroductionPage();
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.completeTheLogin();
		ip.clickOnGetStartedButtonOfQueue();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_navigated_to_queue_details_page_when_clicked_on_get_started () {
		Assert.assertEquals(driver.findElement(qp.queuepage).getText(), "Queue"); 
		Assert.assertTrue(driver.findElement(qp.queuepage).isDisplayed());
		Assert.assertEquals(driver.getCurrentUrl(),"https://dsportalapp.herokuapp.com/queue/");
		Assert.assertEquals(driver.findElement(qp.topicsCovered).getText(),"Topics Covered");	
		Assert.assertTrue(driver.findElement(qp.topicsCovered).isDisplayed());
		Assert.assertTrue(driver.findElement(qp.TopicsCoveredOptions).isDisplayed());	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Implementations_of_Queue_in_Python () {
		qp.clickOnImplementationOfQueueInPython();
		Assert.assertTrue(driver.findElement(qp.implementationOfQueueInPythonPage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.implementationOfQueueInPythonPage).getText(), "Implementation of Queue in Python");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_open_try_editor_page_from_Implementation_of_Queue_in_python () {
		qp.clickOnImplementationOfQueueInPython();
		Assert.assertTrue(driver.findElement(qp.implementationOfQueueInPythonPage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.implementationOfQueueInPythonPage).getText(), "Implementation of Queue in Python");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_editor_for_Implementation_of_Queue_in_python () {
		qp.clickOnImplementationOfQueueInPython();
		Assert.assertTrue(driver.findElement(qp.implementationOfQueueInPythonPage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.implementationOfQueueInPythonPage).getText(), "Implementation of Queue in Python");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_Implementation_of_Queue_in_python () {
		qp.clickOnImplementationOfQueueInPython();
		Assert.assertTrue(driver.findElement(qp.implementationOfQueueInPythonPage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.implementationOfQueueInPythonPage).getText(), "Implementation of Queue in Python");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_Implementation_of_Queue_in_python_runs_successfully () {
		qp.clickOnImplementationOfQueueInPython();
		Assert.assertTrue(driver.findElement(qp.implementationOfQueueInPythonPage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.implementationOfQueueInPythonPage).getText(), "Implementation of Queue in Python");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Implementation_using_collections_deque () {
		qp.clickOnImplementationUsingCollectionsDeque();
		Assert.assertTrue(driver.findElement(qp.implementaionUsingCollectionDequePage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.implementaionUsingCollectionDequePage).getText(), "Implementation using collections.deque");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_open_try_editor_page_from_Implementation_using_collections_deque () {
		qp.clickOnImplementationUsingCollectionsDeque();
		Assert.assertTrue(driver.findElement(qp.implementaionUsingCollectionDequePage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.implementaionUsingCollectionDequePage).getText(), "Implementation using collections.deque");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_editor_for_Implementation_using_collections_deque () {
		qp.clickOnImplementationUsingCollectionsDeque();
		Assert.assertTrue(driver.findElement(qp.implementaionUsingCollectionDequePage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.implementaionUsingCollectionDequePage).getText(), "Implementation using collections.deque");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_Implementation_using_collections_deque () {
		qp.clickOnImplementationUsingCollectionsDeque();
		Assert.assertTrue(driver.findElement(qp.implementaionUsingCollectionDequePage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.implementaionUsingCollectionDequePage).getText(), "Implementation using collections.deque");
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_Implementation_using_collections_deque_runs_successfully () {
		qp.clickOnImplementationUsingCollectionsDeque();
		Assert.assertTrue(driver.findElement(qp.implementaionUsingCollectionDequePage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.implementaionUsingCollectionDequePage).getText(), "Implementation using collections.deque");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_queue_operations_page() {
		qp.clickOnQueueOperations();
		Assert.assertTrue(driver.findElement(qp.queueOperationsPage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.queueOperationsPage).getText(), "Queue Operations");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_open_try_editor_page_from_queue_operations () {
		qp.clickOnQueueOperations();
		Assert.assertTrue(driver.findElement(qp.queueOperationsPage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.queueOperationsPage).getText(), "Queue Operations");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_editor_for_queue_operations () {
		qp.clickOnQueueOperations();
		Assert.assertTrue(driver.findElement(qp.queueOperationsPage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.queueOperationsPage).getText(), "Queue Operations");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_queue_operations () {
		qp.clickOnQueueOperations();
		Assert.assertTrue(driver.findElement(qp.queueOperationsPage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.queueOperationsPage).getText(), "Queue Operations");
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_queue_operations_runs_successfully () {
		qp.clickOnQueueOperations();
		Assert.assertTrue(driver.findElement(qp.queueOperationsPage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.queueOperationsPage).getText(), "Queue Operations");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_implementation_using_array () {
		qp.clickOnImplementationUsingArray();
		Assert.assertTrue(driver.findElement(qp.implementationUsingCollectionsArrayPage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.implementationUsingCollectionsArrayPage).getText(), "Implementation using array");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_open_try_editor_page_from_implementation_using_array () {
		qp.clickOnImplementationUsingArray();
		Assert.assertTrue(driver.findElement(qp.implementationUsingCollectionsArrayPage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.implementationUsingCollectionsArrayPage).getText(), "Implementation using array");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_editor_for_implementation_using_array () {
		qp.clickOnImplementationUsingArray();
		Assert.assertTrue(driver.findElement(qp.implementationUsingCollectionsArrayPage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.implementationUsingCollectionsArrayPage).getText(), "Implementation using array");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_implementation_using_array () {
		qp.clickOnImplementationUsingArray();
		Assert.assertTrue(driver.findElement(qp.implementationUsingCollectionsArrayPage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.implementationUsingCollectionsArrayPage).getText(), "Implementation using array");
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_implementation_using_array_runs_successfully () {
		qp.clickOnImplementationUsingArray();
		Assert.assertTrue(driver.findElement(qp.implementationUsingCollectionsArrayPage).isDisplayed());
		Assert.assertEquals(driver.findElement(qp.implementationUsingCollectionsArrayPage).getText(), "Implementation using array");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}
}