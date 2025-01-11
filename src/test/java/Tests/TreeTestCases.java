package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Utilities.RetryAnalyzer;
import Utilities.TestDataProvider;
import BaseTest.BaseTest;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;
import PageObjects.LinkedListPage;
import PageObjects.TreePage;

public class TreeTestCases extends BaseTest{

	public IntroductionPage ip;
	public HomePage hp;
	public LinkedListPage ll;
	public TreePage tree;

	@BeforeMethod	
	public void LL_GoToTreeHomePage() {
		ip = new IntroductionPage();
		hp = new HomePage();
		ll = new LinkedListPage();
		tree = new TreePage();
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.completeTheLogin();
		tree.click_GetStartedBtn_for_Tree_from_HomePage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_IfOn_LL_HomePage() {
		Assert.assertEquals(ip.getPageTitle(),"Tree");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_Clicking_Tree_from_Dropdown() {
		ip.clickOnDataStructureDropdown();
		tree.click_Tree_FromDropDown();
		Assert.assertEquals(ip.getPageTitle(),"Tree");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_OverviewOfTrees() {
		tree.clickOverviewOfTrees();
		Assert.assertEquals(ip.getPageTitle(),"Overview of Trees");

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_OverviewOfTrees() {
		tree.clickOverviewOfTrees();
		Assert.assertEquals(ip.getPageTitle(),"Overview of Trees");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "treeInValidcodeTopics", dataProviderClass = TestDataProvider.class)
	public void Error_message_displayed_for_invalid_code_on_try_Editor (int topicNumber, String inValidCode) throws InterruptedException {
		tree.clickOnTreeTopListByPosition(topicNumber);
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor(inValidCode);
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "treeInValidcodeTopics", dataProviderClass = TestDataProvider.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor(int topicNumber, String inValidCode) {
		tree.clickOnTreeTopListByPosition(topicNumber);
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(ip.validateElementDisplayed(ip.consoleOutput));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "treeValidcodeTopics", dataProviderClass = TestDataProvider.class)
	public void Valid_code_on_try_editor_runs_successfully (int topicNumber, String validCode) {
		tree.clickOnTreeTopListByPosition(topicNumber);
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor(validCode);
		ip.clickOnRunButton();
		Assert.assertEquals(ip.getTextForElement(ip.consoleOutput), "Hello");
	}


	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_Terminologies() {
		tree.clickTerminologies();
		Assert.assertEquals(ip.getPageTitle(),"Terminologies");

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_Terminologies() {
		tree.clickTerminologies();
		Assert.assertEquals(ip.getPageTitle(),"Terminologies");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_TypesOfTrees() {
		tree.clickTypesOfTrees();
		Assert.assertEquals(ip.getPageTitle(),"Types of Trees");

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_TypesOfTrees() {
		tree.clickTypesOfTrees();
		Assert.assertEquals(ip.getPageTitle(),"Types of Trees");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_TreeTraversals() {
		tree.clickTreeTraversals();
		Assert.assertEquals(ip.getPageTitle(),"Tree Traversals");

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_TreeTraversals() {
		tree.clickTreeTraversals();
		Assert.assertEquals(ip.getPageTitle(),"Tree Traversals");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_clickOn_Traversals_Illustration() {
		tree.clickTraversals_Illustration();
		Assert.assertEquals(ip.getPageTitle(),"Traversals-Illustration");

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_Traversals_Illustration() {
		tree.clickTraversals_Illustration();
		Assert.assertEquals(ip.getPageTitle(),"Traversals-Illustration");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_BinaryTrees() {
		tree.clickBinaryTrees();
		Assert.assertEquals(ip.getPageTitle(),"Binary Trees");

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_BinaryTrees() {
		tree.clickBinaryTrees();
		Assert.assertEquals(ip.getPageTitle(),"Binary Trees");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_TypesOfBinaryTrees() {
		tree.clickTypesOfBinaryTrees();
		Assert.assertEquals(ip.getPageTitle(),"Types of Binary Trees");    
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_TypesOfBinaryTrees() {
		tree.clickTypesOfBinaryTrees();
		Assert.assertEquals(ip.getPageTitle(),"Types of Binary Trees"); 
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_ImplementationInPython() {
		tree.clickImplementationInPython();
		Assert.assertEquals(ip.getPageTitle(),"Implementation in Python");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_ImplementationInPython() {
		tree.clickImplementationInPython();
		Assert.assertEquals(ip.getPageTitle(),"Implementation in Python");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_BinaryTreeTraversal() {
		tree.clickBinaryTreeTraversals();
		Assert.assertEquals(ip.getPageTitle(),"Binary Tree Traversals");

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_BinaryTreeTraversal() {
		tree.clickBinaryTreeTraversals();
		Assert.assertEquals(ip.getPageTitle(),"Binary Tree Traversals");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_ImplementationOfBinaryTrees() {
		tree.clickImplementationOfBinaryTrees();
		Assert.assertEquals(ip.getPageTitle(),"Implementation of Binary Trees");

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_ImplementationOfBinaryTrees() {
		tree.clickImplementationOfBinaryTrees();
		Assert.assertEquals(ip.getPageTitle(),"Implementation of Binary Trees");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_ApplicationOfBinaryTrees() {
		tree.clickApplicationsOfBinaryTrees();
		Assert.assertEquals(ip.getPageTitle(),"Applications of Binary trees");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_ApplicationOfBinaryTrees() {
		tree.clickApplicationsOfBinaryTrees();
		Assert.assertEquals(ip.getPageTitle(),"Applications of Binary trees");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_BinarySearchTrees() {
		tree.clickBinarySearchTrees();
		Assert.assertEquals(ip.getPageTitle(),"Binary Search Trees");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_BinarySearchTrees() {
		tree.clickBinarySearchTrees();
		Assert.assertEquals(ip.getPageTitle(),"Binary Search Trees");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_ImplementationOfBST() {
		tree.clickImplementationOfBST();
		Assert.assertEquals(ip.getPageTitle(),"Implementation Of BST");

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_ImplementationOfBST() {
		tree.clickImplementationOfBST();
		Assert.assertEquals(ip.getPageTitle(),"Implementation Of BST");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

}