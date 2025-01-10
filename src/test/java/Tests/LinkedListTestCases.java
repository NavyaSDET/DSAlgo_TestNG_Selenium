package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseTest.BaseTest;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;
import PageObjects.LinkedListPage;
import PageObjects.TreePage;
import Utilities.RetryAnalyzer;

public class LinkedListTestCases extends BaseTest {


	public IntroductionPage ip;
	public HomePage hp;
	public LinkedListPage ll;
	public TreePage tree;


	@BeforeMethod	
	public void LL_GoToLinkedListHomePage() {
		ip = new IntroductionPage();
		hp = new HomePage();
		ll = new LinkedListPage();
		tree = new TreePage();
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.completeTheLogin();
		ll.click_GetStartedBtn_for_LinkedList_from_HomePage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_01_validate_IfOn_LL_HomePage() 
	{


		Assert.assertEquals(driver.getCurrentUrl(),"Linked List" );
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_02_validate_Clicking_LinkedList_from_Dropdown() 
	{
		ll.click_LinkedList_FromDropDown();
		Assert.assertEquals(driver.getCurrentUrl(),"Linked List" );
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_03_validate_clickOnIntroduction() 
	{
		ll.click_LL_IntroductionPage();
		Assert.assertEquals(driver.getCurrentUrl(),"Introduction" );

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_Introduction() 
	{
		ll.click_LL_IntroductionPage();
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_Introduction() {

		ll.click_LL_IntroductionPage();
		Assert.assertEquals(driver.getCurrentUrl(),"Introduction" );
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
		Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_Introduction () {

		ll.click_LL_IntroductionPage();
		Assert.assertEquals(driver.getCurrentUrl(),"Introduction" );
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_Introduction_runs_successfully() {

		ll.click_LL_IntroductionPage();
		Assert.assertEquals(driver.getCurrentUrl(),"Introduction" );
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_04_validate_click_On_CreatingLinkedList() 
	{
		ll.clickOn_LL_Creating_LinkedList();
		Assert.assertEquals(driver.getCurrentUrl(),"Creating Linked LIst" );
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_CreatingLinkedList() 
	{
		ll.clickOn_LL_Creating_LinkedList();
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_CreatingLinkedList() {
		ll.clickOn_LL_Creating_LinkedList();
		Assert.assertEquals(driver.getCurrentUrl(),"Creating Linked LIst" );
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
		Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_CreatingLinkedList () {

		ll.clickOn_LL_Creating_LinkedList();
		Assert.assertEquals(driver.getCurrentUrl(),"Creating Linked LIst" );
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_CreatingLinkedList_runs_successfully() {

		ll.clickOn_LL_Creating_LinkedList();
		Assert.assertEquals(driver.getCurrentUrl(),"Creating Linked LIst" );
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_05_validate_click_On_Types_Of_LinkedList() 
	{
		ll.clickOn_LL_Types_Of_LinkedList();
		Assert.assertEquals(driver.getCurrentUrl(),"Types of Linked List" );
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_Types_Of_LinkedList() 
	{
		ll.clickOn_LL_Types_Of_LinkedList();
		Assert.assertEquals(driver.getCurrentUrl(),"Types of Linked List" );
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_Types_Of_LinkedList() {
		ll.clickOn_LL_Implement_Linked_List_In_Python();
		Assert.assertEquals(driver.getCurrentUrl(),"Implement Linked List in Python" );
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
		Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Types_Of_LinkedList () {

		ll.clickOn_LL_Implement_Linked_List_In_Python();
		Assert.assertEquals(driver.getCurrentUrl(),"Implement Linked List in Python" );
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_Types_Of_LinkedList_runs_successfully() {

		ll.clickOn_LL_Implement_Linked_List_In_Python();
		Assert.assertEquals(driver.getCurrentUrl(),"Implement Linked List in Python" );
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_06_validate_clickOn_ImplementLinkedListInPython() 
	{
		ll.clickOn_LL_Implement_Linked_List_In_Python();
		Assert.assertEquals(driver.getCurrentUrl(),"Implement Linked List in Python" );
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_ImplementLinkedListInPython() 
	{
		ll.click_LL_IntroductionPage();
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_ImplementLinkedListInPython() {
		ll.click_LL_IntroductionPage();
		Assert.assertEquals(driver.getCurrentUrl(),"Introduction" );
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_ImplementLinkedListInPython () {

		ll.click_LL_IntroductionPage();
		Assert.assertEquals(driver.getCurrentUrl(),"Introduction" );
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_ImplementLinkedListInPython_runs_successfully() {

		ll.click_LL_IntroductionPage();
		Assert.assertEquals(driver.getCurrentUrl(),"Introduction" );
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_07_validate_clickOnTraversal() 
	{
		ll.clickOn_LL_Traversal();
		Assert.assertEquals(driver.getCurrentUrl(),"Traversal" );
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_Traversal() 
	{
		ll.clickOn_LL_Traversal();
		Assert.assertEquals(driver.getCurrentUrl(),"Traversal" );
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_Traversal() {

		ll.clickOn_LL_Traversal();
		Assert.assertEquals(driver.getCurrentUrl(),"Traversal" );
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_Traversal() {

		ll.clickOn_LL_Traversal();
		Assert.assertEquals(driver.getCurrentUrl(),"Traversal" );
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_Traversal_runs_successfully() {

		ll.clickOn_LL_Traversal();
		Assert.assertEquals(driver.getCurrentUrl(),"Traversal" );
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_08_validate_clickOnInsertion() 
	{
		ll.clickOn_LL_Insertion();
		Assert.assertEquals(driver.getCurrentUrl(),"Insertion" );
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_Insertion() 
	{
		ll.clickOn_LL_Insertion();
		Assert.assertEquals(driver.getCurrentUrl(),"Insertion" );
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_Insertion() {
		ll.clickOn_LL_Insertion();
		Assert.assertEquals(driver.getCurrentUrl(),"Insertion" );
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_Insertion () {

		ll.clickOn_LL_Insertion();
		Assert.assertEquals(driver.getCurrentUrl(),"Insertion" );
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_Insertion_runs_successfully() {

		ll.clickOn_LL_Insertion();
		Assert.assertEquals(driver.getCurrentUrl(),"Insertion" );
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_09_validate_click_On_Deletion() 
	{
		ll.clickOn_LL_Deletion();
		Assert.assertEquals(driver.getCurrentUrl(),"Deletion" );
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_Deletion() 
	{
		ll.clickOn_LL_Deletion();
		Assert.assertEquals(driver.getCurrentUrl(),"Deletion" );
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_Deletion() {
		ll.clickOn_LL_Deletion();
		Assert.assertEquals(driver.getCurrentUrl(),"Deletion" );
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_Deletion () {

		ll.clickOn_LL_Deletion();
		Assert.assertEquals(driver.getCurrentUrl(),"Deletion" );
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_Deletion_runs_successfully() {

		ll.clickOn_LL_Deletion();
		Assert.assertEquals(driver.getCurrentUrl(),"Deletion" );
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}





}
