package PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

import BaseTest.BaseTest;

public class TreePage extends BaseTest {

	private By Tree_GetStartedBtn_HomePage = By.xpath("//div[6]/div/div/a");
	private By TreePageHeader = By.xpath("//div/h4");
	private By NumpyNinjaTitle = By.xpath("//a[@class='navbar-brand']");
	private By DataStructures_DropDownBtn = By.xpath("//a[@class='nav-link dropdown-toggle']");
	private By SignOutBtn_Tree = By.xpath("//a[@href='/logout']");

	// Tree Page Module elements
	private By OverviewOfTrees = By.xpath("//a[@href='overview-of-trees']");
	private By Terminologies = By.xpath("//a[@href='terminologies']");
	private By TypesOfTrees = By.xpath("//a[@href='types-of-trees']");
	private By TreeTraversals = By.xpath("//a[@href='tree-traversals']");
	private By Trvaersals_Illustration = By.xpath("//a[@href='traversals-illustration']");
	private By BinaryTrees = By.xpath("//a[@href='binary-trees']");
	private By TypesOfBinaryTrees = By.xpath("//a[@href='types-of-binary-trees']");
	private By ImplementationInPython = By.xpath("//a[@href='implementation-in-python']");
	private By BinaryTreeTraversals = By.xpath("//a[@href='binary-tree-traversals']");
	private By ImplementationOfBinaryTrees = By.xpath("//a[@href='implementation-of-binary-trees']");
	private By ApplicationsOfBinaryTrees = By.xpath("//a[@href='applications-of-binary-trees']");
	private By BinarySearchTrees = By.xpath("//a[@href='binary-search-trees']");
	private By ImplementationOfBST = By.xpath("//a[@href='implementation-of-bst']");

	// Tree Details Page module elements
	private By treeDetails_OverviewOfTrees = By.xpath("//a[@href='/tree/introduction/']");
	private By treeDetails_Terminologies = By.xpath("//a[@href='/tree/terminologies/']");
	private By treeDetails_TypesOfTrees = By.xpath("//a[@href='/tree/types-of-trees/']");
	private By treeDetails_TreeTraversals = By.xpath("//a[@href='/tree/tree-traversals/']");
	private By treeDetails_Traversals_Illustration = By.xpath("//a[@href='/tree/traversals-illustration/']");
	private By treeDetails_BinaryTrees = By.xpath("//a[@href='/tree/binary-trees/']");
	private By treeDetails_TypesOfBinaryTrees = By.xpath("//a[@href='/tree/types-of-binary-trees/']");
	private By treeDetails_ImplementationInPython = By.xpath("//a[@href='/tree/implementation-in-python/']");
	private By treeDetails_BinaryTreeTraversals = By.xpath("//a[@href='/tree/binary-tree-traversals/']");
	private By treeDetails_ImplementationOfBinaryTrees = By.xpath("//a[@href='/tree/implementation-of-binary-trees/']");
	private By treeDetails_ApplicationsOfBinaryTrees = By.xpath("//a[@href='/tree/applications-of-binary-trees/']");
	private By treeDetails_BinarySearchTrees = By.xpath("//a[@href='/tree/binary-search-trees/']");
	private By treeDetails_ImplementationOfBST = By.xpath("//a[@href='/tree/implementation-of-bst/']");
	private By treeDetails_PracticeQuestions = By
			.xpath("//a[@class='list-group-item list-group-item-light text-info']");

	// DropDown Elements
	private By Tree_FromDropDown = By.xpath("//div[@class='dropdown-menu show']/a[@href='/tree']");
	private By Stack_FromDropDown = By.xpath("//div[@class='dropdown-menu show']/a[@href='/stack']");
	private By Array_FromDropDown = By.xpath("//div[@class='dropdown-menu show']/a[@href='/array']");
	private By Linked_List_FromDropDown = By.xpath("//div[@class='dropdown-menu show']/a[@href='/linked-list']");
	private By Graph_FromDropDown = By.xpath("//div[@class='dropdown-menu show']/a[@href='/graph']");
	private By Queue_FromDropDown = By.xpath("//div[@class='dropdown-menu show']/a[@href='/queue']");

	// Try Editor elements

	/*
	 * private By RunBtn_TryEditorPage = By.xpath("//button[@type='button']");
	 * private By EditorWindow =
	 * By.xpath("//div[@class='CodeMirror cm-s-default']/div/textarea");
	 */
	private By TryHereBtn_TreePage = By.xpath("//a[@href='/tryEditor']");

	By codeEditorPage = By.cssSelector("pre.codeMirror-line");
	By codeInputField = By.cssSelector(".CodeMirror textarea");
	By consoleOutput = By.cssSelector("#output");
	By runButton = By.cssSelector("button[type='button']");
	By okBtn_EditorAlert = By.xpath("");

	public void click_GetStartedBtn_for_Tree_from_HomePage() {
		getDriver().findElement(Tree_GetStartedBtn_HomePage).click();
	}

	public void clickTree_GetStartedBtn_HomePage() {
		getDriver().findElement(Tree_GetStartedBtn_HomePage).click();
	}

	public void clickDataStructures_DropDownBtn() {
		getDriver().findElement(DataStructures_DropDownBtn).click();
	}

	public void click_TryHereBtn_TreePage() {
		getDriver().findElement(TryHereBtn_TreePage).click();
	}

	public void click_Tree_FromDropDown() {
		getDriver().findElement(Tree_FromDropDown).click();
	}

	public void click_Stack_FromDropDown() {
		getDriver().findElement(Stack_FromDropDown).click();
	}

	public void click_Array_FromDropDown() {
		getDriver().findElement(Array_FromDropDown).click();
	}

	public void click_Linked_List_FromDropDown() {
		getDriver().findElement(Linked_List_FromDropDown).click();
	}

	public void click_Graph_FromDropDown() {
		getDriver().findElement(Graph_FromDropDown).click();
	}

	public void clickQueue_FromDropDown() {
		getDriver().findElement(Queue_FromDropDown).click();
	}

	public void clickOverviewOfTrees() {
		getDriver().findElement(OverviewOfTrees).click();
	}

	public void clickTerminologies() {
		getDriver().findElement(Terminologies).click();
	}

	public void clickTypesOfTrees() {
		getDriver().findElement(TypesOfTrees).click();
	}

	public void clickTreeTraversals() {
		getDriver().findElement(TreeTraversals).click();
	}

	public void clickTraversals_Illustration() {
		getDriver().findElement(Trvaersals_Illustration).click();
	}

	public void clickBinaryTrees() {
		getDriver().findElement(BinaryTrees).click();
	}

	public void clickTypesOfBinaryTrees() {
		getDriver().findElement(TypesOfBinaryTrees).click();
	}

	public void clickImplementationInPython() {
		getDriver().findElement(ImplementationInPython).click();
	}

	public void clickBinaryTreeTraversals() {
		getDriver().findElement(BinaryTreeTraversals).click();
	}

	public void clickImplementationOfBinaryTrees() {
		getDriver().findElement(ImplementationOfBinaryTrees).click();
	}

	public void clickApplicationsOfBinaryTrees() {
		getDriver().findElement(ApplicationsOfBinaryTrees).click();
	}

	public void clickBinarySearchTrees() {
		getDriver().findElement(BinarySearchTrees).click();
	}

	public void clickImplementationOfBST() {
		getDriver().findElement(ImplementationOfBST).click();
	}

	public void click_TreeDetails_OverviewOfTrees() {
		getDriver().findElement(treeDetails_OverviewOfTrees).click();
	}

	public void click_TreeDetails_Terminologies() {
		getDriver().findElement(treeDetails_Terminologies).click();
	}

	public void click_TreeDetails_TypesOfTrees() {
		getDriver().findElement(treeDetails_TypesOfTrees).click();
	}

	public void click_TreeDetails_TreeTraversals() {
		getDriver().findElement(treeDetails_TreeTraversals).click();
	}

	public void click_TreeDetails_Traversals_Illustration() {
		getDriver().findElement(treeDetails_Traversals_Illustration).click();
	}

	public void click_TreeDetails_BinaryTrees() {
		getDriver().findElement(treeDetails_BinaryTrees).click();
	}

	public void click_TreeDetails_TypesOfBinaryTrees() {
		getDriver().findElement(treeDetails_TypesOfBinaryTrees).click();
	}

	public void click_TreeDetails_ImplementationInPython() {
		getDriver().findElement(treeDetails_ImplementationInPython).click();
	}

	public void click_TreeDetails_BinaryTreeTraversals() {
		getDriver().findElement(treeDetails_BinaryTreeTraversals).click();
	}

	public void click_TreeDetails_ImplementationOfBinaryTrees() {
		getDriver().findElement(treeDetails_ImplementationOfBinaryTrees).click();
	}

	public void click_TreeDetails_ApplicationsOfBinaryTrees() {
		getDriver().findElement(treeDetails_ApplicationsOfBinaryTrees).click();
	}

	public void click_TreeDetails_BinarySearchTrees() {
		getDriver().findElement(treeDetails_BinarySearchTrees).click();
	}

	public void click_TreeDetails_ImplementationOfBST() {
		getDriver().findElement(treeDetails_ImplementationOfBST).click();
	}

	public void click_TreeDetails_PracticeQuestionsLink() {
		getDriver().findElement(treeDetails_PracticeQuestions).click();
	}

	public void checkIfOn_TreesPage() {
		Assert.assertEquals(getDriver().getTitle(), "Tree");
	}

	public void checkIfOn_OverviewOfTreesPage() {
		Assert.assertEquals(getDriver().getTitle(), "Overview of Trees");
	}

	public void checkIfOn_TerminologiesPage() {
		Assert.assertEquals(getDriver().getTitle(), "Terminologies");
	}

	public void checkIfOn_Traversals_IllustrationPage() {
		Assert.assertEquals(getDriver().getTitle(), "Traversals-Illustration");
	}

	public void checkIfOn_TypesOfTreesPage() {
		Assert.assertEquals(getDriver().getTitle(), "Types of Trees");
	}

	public void checkIfOn_TreeTraversals() {
		Assert.assertEquals(getDriver().getTitle(), "Tree Traversals");
	}

	public void checkIfOn_BinaryTreesPage() {
		Assert.assertEquals(getDriver().getTitle(), "Binary Trees");
	}

	public void checkIfOn_TypesOfBinaryTreesPage() {
		Assert.assertEquals(getDriver().getTitle(), "Types of Binary Trees");
	}

	public void checkIfOn_TreeDetails_TypesOfBinaryTreesPage() {
		Assert.assertEquals(getDriver().getTitle(), "Types of Binary Trees");
	}

	public void checkIfOn_ImplementationInPythonPage() {
		Assert.assertEquals(getDriver().getTitle(), "Implementation in Python");
	}

	public void checkIfOn_BinaryTreeTraversalsPage() {
		Assert.assertEquals(getDriver().getTitle(), "Binary Tree Traversals");
	}

	public void checkIfOn_ImplementationOfBinaryTreesPage() {
		Assert.assertEquals(getDriver().getTitle(), "Implementation of Binary Trees");
	}

	public void checkIfOn_ApplicationsOfBinaryTreesPage() {
		Assert.assertEquals(getDriver().getTitle(), "Applications of Binary trees");
	}

	public void checkIfOn_BinarySearchTreesPage() {
		Assert.assertEquals(getDriver().getTitle(), "Binary Search Trees");
	}

	public void checkIfOn_ImplementationOfBSTPage() {
		Assert.assertEquals(getDriver().getTitle(), "Implementation Of BST");
	}

	public void checkIfOn_PracticePage() {
		Assert.assertEquals(getDriver().getTitle(), "Practice Questions");
	}

	///////////////////////////////////////////////////////////////////// TRY HERE
	///////////////////////////////////////////////////////////////////// EDITOR
	///////////////////////////////////////////////////////////////////// METHODS

	public void checkIf_RunBtn_TryEditorPageIsDisplayed() {
		getDriver().findElement(runButton).isDisplayed();
	}

	public void writeInTryEditorWindow(String code) {
		getDriver().findElement(codeInputField).sendKeys(code);
		getDriver().findElement(runButton).click();
	}

	public void clickOnOKBtnFromEditorErrorAlert() {
		Alert alert = getDriver().switchTo().alert();
		alert.accept();
	}

	public void checkIfOn_TryHereEditorPage() {
		Assert.assertEquals(getDriver().getTitle(), "Assessment");
		getDriver().findElement(runButton).isDisplayed();
	}

	public void check_When_EmptyCode_In_Editor() {
		Assert.assertFalse(getDriver().findElement(consoleOutput).isDisplayed()); // Geetha code line
	}

	public void check_When_ValidCode_In_Editor(String expectedOutputText) {
		Assert.assertEquals(getDriver().findElement(consoleOutput).getText(), expectedOutputText);
	}

	public void check_When_InvalidCode_In_Editor(String expectedErrorHeader, String expectedErrorMessage) {
		Alert alert = getDriver().switchTo().alert();
		String alertText = alert.getText();
		Assert.assertEquals(alertText, expectedErrorMessage);
	}

}