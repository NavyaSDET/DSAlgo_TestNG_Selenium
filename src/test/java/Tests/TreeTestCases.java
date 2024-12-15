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

public class TreeTestCases extends BaseTest{

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
	public void LL_GoToTreeHomePage() {
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.completeTheLOgin();
		tree.click_GetStartedBtn_for_Tree_from_HomePage();
	}

	@AfterClass
	public void tearDownTest() {
		tearDown();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_IfOn_LL_HomePage() {
		tree.checkIfOn_TreesPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_Clicking_Tree_from_Dropdown() {
		tree.click_Tree_FromDropDown();
		tree.checkIfOn_TreesPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_clickOn_OverviewOfTrees() {
		tree.clickOverviewOfTrees();
		tree.checkIfOn_OverviewOfTreesPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_TRY_HERE_BUTTON_from_OverviewOfTrees() {
		tree.clickOverviewOfTrees();
		tree.checkIfOn_OverviewOfTreesPage();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_OverviewOfTrees() {
		tree.clickOverviewOfTrees();
		tree.checkIfOn_OverviewOfTreesPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_OverviewOfTrees() {
		tree.clickOverviewOfTrees();
		tree.checkIfOn_OverviewOfTreesPage();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_OverviewOfTrees_runs_successfully() {
		tree.clickOverviewOfTrees();
		tree.checkIfOn_OverviewOfTreesPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_clickOn_Terminologies() {
		tree.clickTerminologies();
		tree.checkIfOn_TerminologiesPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_TRY_HERE_BUTTON_from_Terminologies() {
		tree.clickTerminologies();
		tree.checkIfOn_TerminologiesPage();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_Terminologies() {
		tree.clickTerminologies();
		tree.checkIfOn_TerminologiesPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_Terminologies() {
		tree.clickTerminologies();
		tree.checkIfOn_TerminologiesPage();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_Terminologies_runs_successfully() {
		tree.clickTerminologies();
		tree.checkIfOn_TerminologiesPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_clickOn_TypesOfTrees() {
		tree.clickTypesOfTrees();
		tree.checkIfOn_TypesOfTreesPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_TRY_HERE_BUTTON_from_TypesOfTrees() {
		tree.clickTypesOfTrees();
		tree.checkIfOn_TypesOfTreesPage();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_TypesOfTrees() {
		tree.clickTypesOfTrees();
		tree.checkIfOn_TypesOfTreesPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_TypesOfTrees() {
		tree.clickTypesOfTrees();
		tree.checkIfOn_TypesOfTreesPage();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_TypesOfTrees_runs_successfully() {
		tree.clickTypesOfTrees();
		tree.checkIfOn_TypesOfTreesPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_clickOn_TreeTraversals() {
		tree.clickTreeTraversals();
		tree.checkIfOn_TreeTraversals();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_TRY_HERE_BUTTON_from_TreeTraversals() {
		tree.clickTreeTraversals();
		tree.checkIfOn_TreeTraversals();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_TreeTraversals() {
		tree.clickTreeTraversals();
		tree.checkIfOn_TreeTraversals();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_TreeTraversals() {
		tree.clickTreeTraversals();
		tree.checkIfOn_TreeTraversals();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_TreeTraversals_runs_successfully() {
		tree.clickTreeTraversals();
		tree.checkIfOn_TreeTraversals();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_clickOn_Traversals_Illustration() {
		tree.clickTraversals_Illustration();
		tree.checkIfOn_Traversals_IllustrationPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_TRY_HERE_BUTTON_from_Traversals_Illustration() {
		tree.clickTraversals_Illustration();
		tree.checkIfOn_Traversals_IllustrationPage();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_Traversals_Illustration() {
		tree.clickTraversals_Illustration();
		tree.checkIfOn_Traversals_IllustrationPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_Traversals_Illustration() {
		tree.clickTraversals_Illustration();
		tree.checkIfOn_Traversals_IllustrationPage();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_Traversals_Illustration_runs_successfully() {
		tree.clickTraversals_Illustration();
		tree.checkIfOn_Traversals_IllustrationPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_clickOn_BinaryTrees() {
		tree.clickBinaryTrees();
		tree.checkIfOn_BinaryTreesPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_TRY_HERE_BUTTON_from_BinaryTrees() {
		tree.clickBinaryTrees();
		tree.checkIfOn_BinaryTreesPage();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_BinaryTrees() {
		tree.clickBinaryTrees();
		tree.checkIfOn_BinaryTreesPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_BinaryTrees() {
		tree.clickBinaryTrees();
		tree.checkIfOn_BinaryTreesPage();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_BinaryTrees_runs_successfully() {
		tree.clickBinaryTrees();
		tree.checkIfOn_BinaryTreesPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_clickOn_TypesOfBinaryTrees() {
		tree.clickTypesOfBinaryTrees();
		tree.checkIfOn_TypesOfBinaryTreesPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_TRY_HERE_BUTTON_from_TypesOfBinaryTrees() {
		tree.clickTypesOfBinaryTrees();
		tree.checkIfOn_TypesOfBinaryTreesPage();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_TypesOfBinaryTrees() {
		tree.clickTypesOfBinaryTrees();
		tree.checkIfOn_TypesOfBinaryTreesPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_TypesOfBinaryTrees() {
		tree.clickTypesOfBinaryTrees();
		tree.checkIfOn_TypesOfBinaryTreesPage();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_TypesOfBinaryTrees_runs_successfully() {
		tree.clickTypesOfBinaryTrees();
		tree.checkIfOn_TypesOfBinaryTreesPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_clickOn_ImplementationInPython() {
		tree.clickImplementationInPython();
		tree.checkIfOn_ImplementationInPythonPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_TRY_HERE_BUTTON_from_ImplementationInPython() {
		tree.clickImplementationInPython();
		tree.checkIfOn_ImplementationInPythonPage();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_ImplementationInPython() {
		tree.clickImplementationInPython();
		tree.checkIfOn_ImplementationInPythonPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_ImplementationInPython() {
		tree.clickImplementationInPython();
		tree.checkIfOn_ImplementationInPythonPage();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_ImplementationInPython_runs_successfully() {
		tree.clickImplementationInPython();
		tree.checkIfOn_ImplementationInPythonPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_clickOn_BinaryTreeTraversal() {
		tree.clickBinaryTreeTraversals();
		tree.checkIfOn_BinaryTreeTraversalsPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_TRY_HERE_BUTTON_from_BinaryTreeTraversal() {
		tree.clickBinaryTreeTraversals();
		tree.checkIfOn_BinaryTreeTraversalsPage();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_BinaryTreeTraversal() {
		tree.clickBinaryTreeTraversals();
		tree.checkIfOn_BinaryTreeTraversalsPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_BinaryTreeTraversal() {
		tree.clickBinaryTreeTraversals();
		tree.checkIfOn_BinaryTreeTraversalsPage();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_BinaryTreeTraversal_runs_successfully() {
		tree.clickBinaryTreeTraversals();
		tree.checkIfOn_BinaryTreeTraversalsPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_clickOn_ImplementationOfBinaryTrees() {
		tree.clickImplementationOfBinaryTrees();
		tree.checkIfOn_ImplementationOfBinaryTreesPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_TRY_HERE_BUTTON_from_ImplementationOfBinaryTrees() {
		tree.clickImplementationOfBinaryTrees();
		tree.checkIfOn_ImplementationOfBinaryTreesPage();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_ImplementationOfBinaryTrees() {
		tree.clickImplementationOfBinaryTrees();
		tree.checkIfOn_ImplementationOfBinaryTreesPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_ImplementationOfBinaryTrees() {
		tree.clickImplementationOfBinaryTrees();
		tree.checkIfOn_ImplementationOfBinaryTreesPage();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_ImplementationOfBinaryTrees_runs_successfully() {
		tree.clickImplementationOfBinaryTrees();
		tree.checkIfOn_ImplementationOfBinaryTreesPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_clickOn_ApplicationOfBinaryTrees() {
		tree.clickApplicationsOfBinaryTrees();
		tree.checkIfOn_ApplicationsOfBinaryTreesPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_TRY_HERE_BUTTON_from_ApplicationOfBinaryTrees() {
		tree.clickApplicationsOfBinaryTrees();
		tree.checkIfOn_ApplicationsOfBinaryTreesPage();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_ApplicationOfBinaryTrees() {
		tree.clickApplicationsOfBinaryTrees();
		tree.checkIfOn_ApplicationsOfBinaryTreesPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_ApplicationOfBinaryTrees() {
		tree.clickApplicationsOfBinaryTrees();
		tree.checkIfOn_ApplicationsOfBinaryTreesPage();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_ApplicationOfBinaryTrees_runs_successfully() {
		tree.clickApplicationsOfBinaryTrees();
		tree.checkIfOn_ApplicationsOfBinaryTreesPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_clickOn_BinarySearchTrees() {
		tree.clickBinarySearchTrees();
		tree.checkIfOn_BinarySearchTreesPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_TRY_HERE_BUTTON_from_BinarySearchTrees() {
		tree.clickBinarySearchTrees();
		tree.checkIfOn_BinarySearchTreesPage();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_BinarySearchTrees() {
		tree.clickBinarySearchTrees();
		tree.checkIfOn_BinarySearchTreesPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_BinarySearchTrees() {
		tree.clickBinarySearchTrees();
		tree.checkIfOn_BinarySearchTreesPage();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_BinarySearchTrees_runs_successfully() {
		tree.clickBinarySearchTrees();
		tree.checkIfOn_BinarySearchTreesPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_ImplementationOfBST() {
		tree.clickImplementationOfBST();
		tree.checkIfOn_ImplementationOfBSTPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_TRY_HERE_BUTTON_from_ImplementationOfBST() {
		tree.clickImplementationOfBST();
		tree.checkIfOn_ImplementationOfBSTPage();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_ImplementationOfBST() {
		tree.clickImplementationOfBST();
		tree.checkIfOn_ImplementationOfBSTPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says",
				"NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_ImplementationOfBST() {
		tree.clickImplementationOfBST();
		tree.checkIfOn_ImplementationOfBSTPage();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_ImplementationOfBST_runs_successfully() {
		tree.clickImplementationOfBST();
		tree.checkIfOn_ImplementationOfBSTPage();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

}