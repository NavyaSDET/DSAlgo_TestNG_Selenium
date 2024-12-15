package Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import BaseTest.BaseTest;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;
import PageObjects.LinkedListPage;
import PageObjects.TreePage;

public class LinkedListTestCases extends BaseTest {

	IntroductionPage ip = new IntroductionPage();
	HomePage hp = new HomePage();
	LinkedListPage ll = new LinkedListPage();
	TreePage tree = new TreePage();

	@Parameters("browser")
	@BeforeClass
	public void setUpTest(String browser) {
		setUp(browser);
	}

	@BeforeMethod
	public void LL_GoToLinkedListHomePage() {
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.completeTheLOgin();
		ll.clickOn_LL_GetStartedBtn_HomePage();
	}

	@AfterClass
	public void tearDownTest() {
		tearDown();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_01_validate_IfOn_LL_HomePage() {
		ll.check_If_On_LL_HomePage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_02_validate_Clicking_LinkedList_from_Dropdown() {
		ll.clickOn_LinkedList_FromDropDown();
		ll.check_If_On_LL_HomePage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_03_validate_clickOnIntroduction() {
		ll.clickOn_LL_IntroductionPage();
		ll.check_If_On_LL_Introduction();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_Introduction() {
		ll.clickOn_LL_IntroductionPage();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_Introduction() {
		ll.clickOn_LL_IntroductionPage();
		ll.check_If_On_LL_Introduction();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_Introduction() {
		ll.clickOn_LL_IntroductionPage();
		ll.check_If_On_LL_Introduction();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_Introduction_runs_successfully() {
		ll.clickOn_LL_IntroductionPage();
		ll.check_If_On_LL_Introduction();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_04_validate_clickOn_On_CreatingLinkedList() {
		ll.clickOn_LL_Creating_LinkedList();
		ll.check_If_On_LL_CreatingLinkedList();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_CreatingLinkedList() {
		ll.clickOn_LL_Creating_LinkedList();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_CreatingLinkedList() {
		ll.clickOn_LL_Creating_LinkedList();
		ll.check_If_On_LL_CreatingLinkedList();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_CreatingLinkedList() {
		ll.clickOn_LL_Creating_LinkedList();
		ll.check_If_On_LL_CreatingLinkedList();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_CreatingLinkedList_runs_successfully() {
		ll.clickOn_LL_Creating_LinkedList();
		ll.check_If_On_LL_CreatingLinkedList();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_05_validate_clickOn_On_Types_Of_LinkedList() {
		ll.clickOn_LL_Types_Of_LinkedList();
		ll.check_If_On_LL_TypesOfLinkedListe();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_Types_Of_LinkedList() {
		ll.clickOn_LL_Types_Of_LinkedList();
		ll.check_If_On_LL_TypesOfLinkedListe();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_Types_Of_LinkedList() {
		ll.clickOn_LL_Implement_Linked_List_In_Python();
		ll.check_If_On_LL_ImplementLinkedListInPython();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Types_Of_LinkedList() {
		ll.clickOn_LL_Implement_Linked_List_In_Python();
		ll.check_If_On_LL_ImplementLinkedListInPython();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_Types_Of_LinkedList_runs_successfully() {
		ll.clickOn_LL_Implement_Linked_List_In_Python();
		ll.check_If_On_LL_ImplementLinkedListInPython();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_06_validate_clickOn_ImplementLinkedListInPython() {
		ll.clickOn_LL_Implement_Linked_List_In_Python();
		ll.check_If_On_LL_ImplementLinkedListInPython();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_ImplementLinkedListInPython() {
		ll.clickOn_LL_IntroductionPage();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_ImplementLinkedListInPython() {
		ll.clickOn_LL_IntroductionPage();
		ll.check_If_On_LL_Introduction();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_ImplementLinkedListInPython() {
		ll.clickOn_LL_IntroductionPage();
		ll.check_If_On_LL_Introduction();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_ImplementLinkedListInPython_runs_successfully() {
		ll.clickOn_LL_IntroductionPage();
		ll.check_If_On_LL_Introduction();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_07_validate_clickOnTraversal() {
		ll.clickOn_LL_Traversal();
		ll.check_If_On_LL_TRaversal();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_Traversal() {
		ll.clickOn_LL_Traversal();
		ll.check_If_On_LL_TRaversal();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_Traversal() {
		ll.clickOn_LL_Traversal();
		ll.check_If_On_LL_TRaversal();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_Traversal() {
		ll.clickOn_LL_Traversal();
		ll.check_If_On_LL_TRaversal();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_Traversal_runs_successfully() {
		ll.clickOn_LL_Traversal();
		ll.check_If_On_LL_TRaversal();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_08_validate_clickOnInsertion() {
		ll.clickOn_LL_Insertion();
		ll.check_If_On_LL_Insertion();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_Insertion() {
		ll.clickOn_LL_Insertion();
		ll.check_If_On_LL_Insertion();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_Insertion() {
		ll.clickOn_LL_Insertion();
		ll.check_If_On_LL_Insertion();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_Insertion() {
		ll.clickOn_LL_Insertion();
		ll.check_If_On_LL_Insertion();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_Insertion_runs_successfully() {
		ll.clickOn_LL_Insertion();
		ll.check_If_On_LL_Insertion();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_09_validate_clickOn_On_Deletion() {
		ll.clickOn_LL_Deletion();
		ll.check_If_On_LL_Deletion();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_11_validate_TRY_HERE_BUTTON_from_Deletion() {
		ll.clickOn_LL_Deletion();
		ll.check_If_On_LL_Deletion();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_Deletion() {
		ll.clickOn_LL_Deletion();
		ll.check_If_On_LL_Deletion();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_Deletion() {
		ll.clickOn_LL_Deletion();
		ll.check_If_On_LL_Deletion();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_Deletion_runs_successfully() {
		ll.clickOn_LL_Deletion();
		ll.check_If_On_LL_Deletion();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

}
