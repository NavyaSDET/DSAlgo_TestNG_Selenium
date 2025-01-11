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
import Utilities.TestDataProvider;

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
	public void LL_TC_01_validate_IfOn_LL_HomePage() {
		Assert.assertEquals(ip.getPageTitle(),"Linked List" );
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_02_validate_Clicking_LinkedList_from_Dropdown() {
		ip.clickOnDataStructureDropdown();
		ll.click_LinkedList_FromDropDown();
		Assert.assertEquals(ip.getPageTitle(),"Linked List" );
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_03_validate_clickOnIntroduction() {
		ll.click_LL_IntroductionPage();
		Assert.assertEquals(ip.getPageTitle(),"Introduction" );
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_Introduction() {
		ll.click_LL_IntroductionPage();
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "llInValidcodeTopics", dataProviderClass = TestDataProvider.class)
	public void Error_message_displayed_for_invalid_code_on_try_Editor (int topicNumber, String inValidCode) {
		ll.clickOnLinkedListTopListByPosition(topicNumber);
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor(inValidCode);
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "llInValidcodeTopics", dataProviderClass = TestDataProvider.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor(int topicNumber, String inValidCode) {
		ll.clickOnLinkedListTopListByPosition(topicNumber);
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(ip.validateElementDisplayed(ip.consoleOutput));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "llValidcodeTopics", dataProviderClass = TestDataProvider.class)
	public void Valid_code_on_try_editor_runs_successfully (int topicNumber, String validCode) {
		ll.clickOnLinkedListTopListByPosition(topicNumber);
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor(validCode);
		ip.clickOnRunButton();
		Assert.assertEquals(ip.getTextForElement(ip.consoleOutput), "Hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_04_validate_click_On_CreatingLinkedList() {
		ll.clickOn_LL_Creating_LinkedList();
		Assert.assertEquals(ip.getPageTitle(),"Creating Linked LIst" );
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_CreatingLinkedList() {
		ll.clickOn_LL_Creating_LinkedList();
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_05_validate_click_On_Types_Of_LinkedList() {
		ll.clickOn_LL_Types_Of_LinkedList();
		Assert.assertEquals(ip.getPageTitle(),"Types of Linked List" );
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_Types_Of_LinkedList() {
		ll.clickOn_LL_Types_Of_LinkedList();
		Assert.assertEquals(ip.getPageTitle(),"Types of Linked List" );
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_06_validate_clickOn_ImplementLinkedListInPython() {
		ll.clickOn_LL_Implement_Linked_List_In_Python();
		Assert.assertEquals(ip.getPageTitle(),"Implement Linked List in Python" );
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_ImplementLinkedListInPython() {
		ll.click_LL_IntroductionPage();
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_07_validate_clickOnTraversal() {
		ll.clickOn_LL_Traversal();
		Assert.assertEquals(ip.getPageTitle(),"Traversal" );
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_Traversal() {
		ll.clickOn_LL_Traversal();
		Assert.assertEquals(ip.getPageTitle(),"Traversal" );
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_08_validate_clickOnInsertion() {
		ll.clickOn_LL_Insertion();
		Assert.assertEquals(ip.getPageTitle(),"Insertion" );
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_Insertion() {
		ll.clickOn_LL_Insertion();
		Assert.assertEquals(ip.getPageTitle(),"Insertion" );
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_09_validate_click_On_Deletion() {
		ll.clickOn_LL_Deletion();
		Assert.assertEquals(ip.getPageTitle(),"Deletion" );
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_Deletion() {
		ll.clickOn_LL_Deletion();
		Assert.assertEquals(ip.getPageTitle(),"Deletion" );
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

}