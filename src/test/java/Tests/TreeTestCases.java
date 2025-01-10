package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Utilities.RetryAnalyzer;
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
	public void LL_TC_validate_IfOn_LL_HomePage() 
	{
		Assert.assertEquals(driver.getTitle(),"Tree");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_Clicking_Tree_from_Dropdown() 
	{
		tree.click_Tree_FromDropDown();
		Assert.assertEquals(driver.getTitle(),"Tree");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_OverviewOfTrees() 
	{
		tree.clickOverviewOfTrees();
		Assert.assertEquals(driver.getTitle(),"Overview of Trees");

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_OverviewOfTrees() 
	{
		tree.clickOverviewOfTrees();
		Assert.assertEquals(driver.getTitle(),"Overview of Trees");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_OverviewOfTrees() {

		tree.clickOverviewOfTrees();
		Assert.assertEquals(driver.getTitle(),"Overview of Trees");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
		Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_OverviewOfTrees () {

		tree.clickOverviewOfTrees();
		Assert.assertEquals(driver.getTitle(),"Overview of Trees");
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_OverviewOfTrees_runs_successfully() {

		tree.clickOverviewOfTrees();
		Assert.assertEquals(driver.getTitle(),"Overview of Trees");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}


	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_Terminologies() 
	{
		tree.clickTerminologies();
		Assert.assertEquals(driver.getTitle(),"Terminologies");

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_Terminologies() 
	{
		tree.clickTerminologies();
		Assert.assertEquals(driver.getTitle(),"Terminologies");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_Terminologies() {

		tree.clickTerminologies();
		Assert.assertEquals(driver.getTitle(),"Terminologies");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_Terminologies () {

		tree.clickTerminologies();
		Assert.assertEquals(driver.getTitle(),"Terminologies");
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_Terminologies_runs_successfully() {

		tree.clickTerminologies();
		Assert.assertEquals(driver.getTitle(),"Terminologies");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_TypesOfTrees() 
	{
		tree.clickTypesOfTrees();
		Assert.assertEquals(driver.getTitle(),"Types of Trees");

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_TypesOfTrees() 
	{
		tree.clickTypesOfTrees();
		Assert.assertEquals(driver.getTitle(),"Types of Trees");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_TypesOfTrees() {

		tree.clickTypesOfTrees();
		Assert.assertEquals(driver.getTitle(),"Types of Trees");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_TypesOfTrees () {

		tree.clickTypesOfTrees();
		Assert.assertEquals(driver.getTitle(),"Types of Trees");
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_TypesOfTrees_runs_successfully() {

		tree.clickTypesOfTrees();
		Assert.assertEquals(driver.getTitle(),"Types of Trees");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_TreeTraversals() 
	{
		tree.clickTreeTraversals();
		Assert.assertEquals(driver.getTitle(),"Tree Traversals");

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_TreeTraversals() 
	{
		tree.clickTreeTraversals();
		Assert.assertEquals(driver.getTitle(),"Tree Traversals");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_TreeTraversals() {

		tree.clickTreeTraversals();
		Assert.assertEquals(driver.getTitle(),"Tree Traversals");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_TreeTraversals() {

		tree.clickTreeTraversals();
		Assert.assertEquals(driver.getTitle(),"Tree Traversals");
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_TreeTraversals_runs_successfully() {

		tree.clickTreeTraversals();
		Assert.assertEquals(driver.getTitle(),"Tree Traversals");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void LL_TC_validate_clickOn_Traversals_Illustration() 
	{
		tree.clickTraversals_Illustration();
		Assert.assertEquals(driver.getTitle(),"Traversals-Illustration");

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_Traversals_Illustration() 
	{
		tree.clickTraversals_Illustration();
		Assert.assertEquals(driver.getTitle(),"Traversals-Illustration");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_Traversals_Illustration() {

		tree.clickTraversals_Illustration();
		Assert.assertEquals(driver.getTitle(),"Traversals-Illustration");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_Traversals_Illustration () {

		tree.clickTraversals_Illustration();
		Assert.assertEquals(driver.getTitle(),"Traversals-Illustration");
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_Traversals_Illustration_runs_successfully() {

		tree.clickTraversals_Illustration();
		Assert.assertEquals(driver.getTitle(),"Traversals-Illustration");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_BinaryTrees() 
	{
		tree.clickBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Binary Trees");

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_BinaryTrees() 
	{
		tree.clickBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Binary Trees");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_BinaryTrees() {

		tree.clickBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Binary Trees");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_BinaryTrees () {

		tree.clickBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Binary Trees");
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_BinaryTrees_runs_successfully() {

		tree.clickBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Binary Trees");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_TypesOfBinaryTrees() 
	{
		tree.clickTypesOfBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Types of Binary Trees");    
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_TypesOfBinaryTrees() 
	{
		tree.clickTypesOfBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Types of Binary Trees"); 
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_TypesOfBinaryTrees() {

		tree.clickTypesOfBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Types of Binary Trees"); 
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_TypesOfBinaryTrees () {

		tree.clickTypesOfBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Types of Binary Trees"); 
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_TypesOfBinaryTrees_runs_successfully() {

		tree.clickTypesOfBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Types of Binary Trees"); 
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_ImplementationInPython() 
	{
		tree.clickImplementationInPython();
		Assert.assertEquals(driver.getTitle(),"Implementation in Python");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_ImplementationInPython() 
	{
		tree.clickImplementationInPython();
		Assert.assertEquals(driver.getTitle(),"Implementation in Python");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_ImplementationInPython() {

		tree.clickImplementationInPython();
		Assert.assertEquals(driver.getTitle(),"Implementation in Python");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_ImplementationInPython() {

		tree.clickImplementationInPython();
		Assert.assertEquals(driver.getTitle(),"Implementation in Python");
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_ImplementationInPython_runs_successfully() {

		tree.clickImplementationInPython();
		Assert.assertEquals(driver.getTitle(),"Implementation in Python");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_BinaryTreeTraversal() 
	{
		tree.clickBinaryTreeTraversals();
		Assert.assertEquals(driver.getTitle(),"Binary Tree Traversals");

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_BinaryTreeTraversal() 
	{
		tree.clickBinaryTreeTraversals();
		Assert.assertEquals(driver.getTitle(),"Binary Tree Traversals");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_BinaryTreeTraversal() {

		tree.clickBinaryTreeTraversals();
		Assert.assertEquals(driver.getTitle(),"Binary Tree Traversals");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_BinaryTreeTraversal() {

		tree.clickBinaryTreeTraversals();
		Assert.assertEquals(driver.getTitle(),"Binary Tree Traversals");
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_BinaryTreeTraversal_runs_successfully() {

		tree.clickBinaryTreeTraversals();
		Assert.assertEquals(driver.getTitle(),"Binary Tree Traversals");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_ImplementationOfBinaryTrees() 
	{
		tree.clickImplementationOfBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Implementation of Binary Trees");

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_ImplementationOfBinaryTrees() 
	{
		tree.clickImplementationOfBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Implementation of Binary Trees");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_ImplementationOfBinaryTrees() {

		tree.clickImplementationOfBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Implementation of Binary Trees");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_ImplementationOfBinaryTrees () {

		tree.clickImplementationOfBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Implementation of Binary Trees");
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_ImplementationOfBinaryTrees_runs_successfully() {

		tree.clickImplementationOfBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Implementation of Binary Trees");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_ApplicationOfBinaryTrees() 
	{
		tree.clickApplicationsOfBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Applications of Binary trees");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_ApplicationOfBinaryTrees() 
	{
		tree.clickApplicationsOfBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Applications of Binary trees");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_ApplicationOfBinaryTrees() {

		tree.clickApplicationsOfBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Applications of Binary trees");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_ApplicationOfBinaryTrees () {

		tree.clickApplicationsOfBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Applications of Binary trees");
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_ApplicationOfBinaryTrees_runs_successfully() {

		tree.clickApplicationsOfBinaryTrees();
		Assert.assertEquals(driver.getTitle(),"Applications of Binary trees");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_clickOn_BinarySearchTrees() 
	{
		tree.clickBinarySearchTrees();
		Assert.assertEquals(driver.getTitle(),"Binary Search Trees");

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_BinarySearchTrees() 
	{
		tree.clickBinarySearchTrees();
		Assert.assertEquals(driver.getTitle(),"Binary Search Trees");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_BinarySearchTrees() {

		tree.clickBinarySearchTrees();
		Assert.assertEquals(driver.getTitle(),"Binary Search Trees");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_BinarySearchTrees() {

		tree.clickBinarySearchTrees();
		Assert.assertEquals(driver.getTitle(),"Binary Search Trees");
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_BinarySearchTrees_runs_successfully() {

		tree.clickBinarySearchTrees();
		Assert.assertEquals(driver.getTitle(),"Binary Search Trees");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_ImplementationOfBST() 
	{
		tree.clickImplementationOfBST();
		Assert.assertEquals(driver.getTitle(),"Implementation Of BST");

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)	
	public void LL_TC_validate_TRY_HERE_BUTTON_from_ImplementationOfBST() 
	{
		tree.clickImplementationOfBST();
		Assert.assertEquals(driver.getTitle(),"Implementation Of BST");
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_Error_message_displayed_for_INVALID_CODE_on_try_Editor_for_ImplementationOfBST() {

		tree.clickImplementationOfBST();
		Assert.assertEquals(driver.getTitle(),"Implementation Of BST");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_No_error_message_displayed_for_EMPTY_CODE_on_try_editor_for_Operations_for_ImplementationOfBST() {

		tree.clickImplementationOfBST();
		Assert.assertEquals(driver.getTitle(),"Implementation Of BST");
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_VALID_CODE_on_try_editor_for_ImplementationOfBST_runs_successfully() {

		tree.clickImplementationOfBST();
		Assert.assertEquals(driver.getTitle(),"Implementation Of BST");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}


}