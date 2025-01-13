package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Utilities.RetryAnalyzer;
import Utilities.TestDataProvider;
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
		Assert.assertEquals(ip.getTextForElement(qp.queuepage), "Queue"); 
		Assert.assertTrue(ip.validateElementDisplayed(qp.queuepage));
		Assert.assertEquals(ip.getCurrentUrl(),"https://dsportalapp.herokuapp.com/queue/");
		Assert.assertEquals(ip.getTextForElement(qp.topicsCovered),"Topics Covered");	
		Assert.assertTrue(ip.validateElementDisplayed(qp.topicsCovered));
		Assert.assertTrue(ip.validateElementDisplayed(qp.TopicsCoveredOptions));	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Implementations_of_Queue_in_Python () {
		qp.clickOnImplementationOfQueueInPython();
		Assert.assertTrue(ip.validateElementDisplayed(qp.implementationOfQueueInPythonPage));
		Assert.assertEquals(ip.getTextForElement(qp.implementationOfQueueInPythonPage), "Implementation of Queue in Python");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_open_try_editor_page_from_Implementation_of_Queue_in_python () {
		qp.clickOnImplementationOfQueueInPython();
		Assert.assertTrue(ip.validateElementDisplayed(qp.implementationOfQueueInPythonPage));
		Assert.assertEquals(ip.getTextForElement(qp.implementationOfQueueInPythonPage), "Implementation of Queue in Python");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "queueInValidcodeTopics", dataProviderClass = TestDataProvider.class)
	public void Error_message_displayed_for_invalid_code_on_try_Editor (String topicNumber, String inValidCode) {
		qp.clickOnQueueTopListByPosition(Integer.parseInt(topicNumber));
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor(inValidCode);
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "queueInValidcodeTopics", dataProviderClass = TestDataProvider.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor(String topicNumber, String inValidCode) {
		qp.clickOnQueueTopListByPosition(Integer.parseInt(topicNumber));
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(ip.validateElementDisplayed(ip.consoleOutput));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "queueValidcodeTopics", dataProviderClass = TestDataProvider.class)
	public void Valid_code_on_try_editor_runs_successfully (String topicNumber, String validCode) {
		qp.clickOnQueueTopListByPosition(Integer.parseInt(topicNumber));
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor(validCode);
		ip.clickOnRunButton();
		Assert.assertEquals(ip.getTextForElement(ip.consoleOutput), "Hello");
	}


	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Implementation_using_collections_deque () {
		qp.clickOnImplementationUsingCollectionsDeque();
		Assert.assertTrue(ip.validateElementDisplayed(qp.implementaionUsingCollectionDequePage));
		Assert.assertEquals(ip.getTextForElement(qp.implementaionUsingCollectionDequePage), "Implementation using collections.deque");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_open_try_editor_page_from_Implementation_using_collections_deque () {
		qp.clickOnImplementationUsingCollectionsDeque();
		Assert.assertTrue(ip.validateElementDisplayed(qp.implementaionUsingCollectionDequePage));
		Assert.assertEquals(ip.getTextForElement(qp.implementaionUsingCollectionDequePage), "Implementation using collections.deque");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_queue_operations_page() {
		qp.clickOnQueueOperations();
		Assert.assertTrue(ip.validateElementDisplayed(qp.queueOperationsPage));
		Assert.assertEquals(ip.getTextForElement(qp.queueOperationsPage), "Queue Operations");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_open_try_editor_page_from_queue_operations () {
		qp.clickOnQueueOperations();
		Assert.assertTrue(ip.validateElementDisplayed(qp.queueOperationsPage));
		Assert.assertEquals(ip.getTextForElement(qp.queueOperationsPage), "Queue Operations");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_implementation_using_array () {
		qp.clickOnImplementationUsingArray();
		Assert.assertTrue(ip.validateElementDisplayed(qp.implementationUsingCollectionsArrayPage));
		Assert.assertEquals(ip.getTextForElement(qp.implementationUsingCollectionsArrayPage), "Implementation using array");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_open_try_editor_page_from_implementation_using_array () {
		qp.clickOnImplementationUsingArray();
		Assert.assertTrue(ip.validateElementDisplayed(qp.implementationUsingCollectionsArrayPage));
		Assert.assertEquals(ip.getTextForElement(qp.implementationUsingCollectionsArrayPage), "Implementation using array");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

}