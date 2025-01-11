package PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DriverManager.DriverManager;

public class TreePage {
	public WebDriver driver = DriverManager.getDriver();

	public By Tree_GetStartedBtn_HomePage = By.xpath("//div[6]/div/div/a");
	public By TreePageHeader = By.xpath("//div/h4");
	public By NumpyNinjaTitle = By.xpath("//a[@class='navbar-brand']");
	public By DataStructures_DropDownBtn = By.xpath("//a[@class='nav-link dropdown-toggle']");
	public By SignOutBtn_Tree = By.xpath("//a[@href='/logout']");

	//Tree Page Module elements
	public By OverviewOfTrees = By.xpath("//a[@href='overview-of-trees']");
	public By Terminologies = By.xpath("//a[@href='terminologies']");
	public By TypesOfTrees = By.xpath("//a[@href='types-of-trees']");
	public By TreeTraversals = By.xpath("//a[@href='tree-traversals']");
	public By Trvaersals_Illustration = By.xpath("//a[@href='traversals-illustration']");
	public By BinaryTrees = By.xpath("//a[@href='binary-trees']");
	public By TypesOfBinaryTrees = By.xpath("//a[@href='types-of-binary-trees']");
	public By ImplementationInPython = By.xpath("//a[@href='implementation-in-python']");
	public By BinaryTreeTraversals = By.xpath("//a[@href='binary-tree-traversals']");
	public By ImplementationOfBinaryTrees = By.xpath("//a[@href='implementation-of-binary-trees']");
	public By ApplicationsOfBinaryTrees = By.xpath("//a[@href='applications-of-binary-trees']");
	public By BinarySearchTrees = By.xpath("//a[@href='binary-search-trees']");
	public By ImplementationOfBST = By.xpath("//a[@href='implementation-of-bst']");

	//Tree Details Page module elements
	public By treeDetails_OverviewOfTrees = By.xpath("//a[@href='/tree/introduction/']");
	public By treeDetails_Terminologies = By.xpath("//a[@href='/tree/terminologies/']");
	public By treeDetails_TypesOfTrees = By.xpath("//a[@href='/tree/types-of-trees/']");
	public By treeDetails_TreeTraversals = By.xpath("//a[@href='/tree/tree-traversals/']");
	public By treeDetails_Traversals_Illustration = By.xpath("//a[@href='/tree/traversals-illustration/']");
	public By treeDetails_BinaryTrees = By.xpath("//a[@href='/tree/binary-trees/']");
	public By treeDetails_TypesOfBinaryTrees = By.xpath("//a[@href='/tree/types-of-binary-trees/']");
	public By treeDetails_ImplementationInPython = By.xpath("//a[@href='/tree/implementation-in-python/']");
	public By treeDetails_BinaryTreeTraversals = By.xpath("//a[@href='/tree/binary-tree-traversals/']");
	public By treeDetails_ImplementationOfBinaryTrees = By.xpath("//a[@href='/tree/implementation-of-binary-trees/']");
	public By treeDetails_ApplicationsOfBinaryTrees = By.xpath("//a[@href='/tree/applications-of-binary-trees/']");
	public By treeDetails_BinarySearchTrees = By.xpath("//a[@href='/tree/binary-search-trees/']");
	public By treeDetails_ImplementationOfBST = By.xpath("//a[@href='/tree/implementation-of-bst/']");
	public By treeDetails_PracticeQuestions = By.xpath("//a[@class='list-group-item list-group-item-light text-info']");

	//DropDown Elements
	public By Tree_FromDropDown = By.xpath("//div[@class='dropdown-menu show']/a[@href='/tree']");
	public By Stack_FromDropDown = By.xpath("//div[@class='dropdown-menu show']/a[@href='/stack']");
	public By Array_FromDropDown = By.xpath("//div[@class='dropdown-menu show']/a[@href='/array']");
	public By Linked_List_FromDropDown = By.xpath("//div[@class='dropdown-menu show']/a[@href='/linked-list']");
	public By Graph_FromDropDown = By.xpath("//div[@class='dropdown-menu show']/a[@href='/graph']");
	public By Queue_FromDropDown = By.xpath("//div[@class='dropdown-menu show']/a[@href='/queue']");
	public By Tree_Topics_List = By.cssSelector("ul a.list-group-item");


	//Try Editor elements

	/*public By RunBtn_TryEditorPage = By.xpath("//button[@type='button']");
	public By EditorWindow = By.xpath("//div[@class='CodeMirror cm-s-default']/div/textarea");*/
	public By TryHereBtn_TreePage = By.xpath("//a[@href='/tryEditor']");

	By codeEditorPage=By.cssSelector("pre.codeMirror-line");
	By codeInputField = By.cssSelector(".CodeMirror textarea");
	By consoleOutput = By.cssSelector("#output");
	By runButton=By.cssSelector("button[type='button']");
	By okBtn_EditorAlert = By.xpath("");

	/////////////////////////////////////////////////////////////////////// GENERAL ELEMENT METHODS

	public void click_GetStartedBtn_for_Tree_from_HomePage()
	{
		driver.findElement(Tree_GetStartedBtn_HomePage).click();
	}
	
	public void clickTree_GetStartedBtn_HomePage()
	{
		driver.findElement(Tree_GetStartedBtn_HomePage).click();
	}

	public void click_TryHereBtn_TreePage()
	{

		driver.findElement(TryHereBtn_TreePage).click();
	}

	/////////////////////////////////////////////////////////////////////// DROPDOWN ELEMENT METHODS

	public void click_Tree_FromDropDown()
	{
		driver.findElement(Tree_FromDropDown).click();
	}

	public void click_Stack_FromDropDown()
	{
		driver.findElement(Stack_FromDropDown).click();
	}
	
	public void clickOnTreeTopListByPosition(int position) {
		driver.findElements(Tree_Topics_List).get(position).click();
	}

	public void click_Array_FromDropDown()
	{
		driver.findElement(Array_FromDropDown).click();
	}

	public void click_Linked_List_FromDropDown()
	{
		driver.findElement(Linked_List_FromDropDown).click();
	}

	public void click_Graph_FromDropDown()
	{
		driver.findElement(Graph_FromDropDown).click();
	}

	public void clickQueue_FromDropDown()
	{
		driver.findElement(Queue_FromDropDown).click();
	}

	//////////////////////////////////////////////////////////////////// PAGE MODULES ELEMENTS METHODS

	public void clickOverviewOfTrees()
	{
		driver.findElement(OverviewOfTrees).click();
	}

	public void clickTerminologies()
	{
		driver.findElement(Terminologies).click();
	}

	public void clickTypesOfTrees()
	{
		driver.findElement(TypesOfTrees).click();
	}

	public void clickTreeTraversals()
	{
		driver.findElement(TreeTraversals).click();
	}

	public void clickTraversals_Illustration()
	{
		driver.findElement(Trvaersals_Illustration).click();
	}

	public void clickBinaryTrees()
	{
		driver.findElement(BinaryTrees).click();
	}

	public void clickTypesOfBinaryTrees()
	{
		driver.findElement(TypesOfBinaryTrees).click();
	}

	public void clickImplementationInPython()
	{
		driver.findElement(ImplementationInPython).click();
	}

	public void clickBinaryTreeTraversals()
	{
		driver.findElement(BinaryTreeTraversals).click();
	}

	public void clickImplementationOfBinaryTrees()
	{
		driver.findElement(ImplementationOfBinaryTrees).click();
	}

	public void clickApplicationsOfBinaryTrees()
	{
		driver.findElement(ApplicationsOfBinaryTrees).click();
	}

	public void clickBinarySearchTrees()
	{
		driver.findElement(BinarySearchTrees).click();
	}

	public void clickImplementationOfBST()
	{
		driver.findElement(ImplementationOfBST).click();
	}

	//////////////////////////////////////////////////////////////////// Tree Details Page module elements-click events

	public void click_TreeDetails_OverviewOfTrees()
	{
		driver.findElement(treeDetails_OverviewOfTrees).click();
	}

	public void click_TreeDetails_Terminologies()
	{
		driver.findElement(treeDetails_Terminologies).click();
	}

	public void click_TreeDetails_TypesOfTrees()
	{
		driver.findElement(treeDetails_TypesOfTrees).click();
	}

	public void click_TreeDetails_TreeTraversals()
	{
		driver.findElement(treeDetails_TreeTraversals).click();
	}

	public void click_TreeDetails_Traversals_Illustration()
	{
		driver.findElement(treeDetails_Traversals_Illustration).click();

	}

	public void click_TreeDetails_BinaryTrees()
	{
		driver.findElement(treeDetails_BinaryTrees).click();
	}

	public void click_TreeDetails_TypesOfBinaryTrees()
	{
		driver.findElement(treeDetails_TypesOfBinaryTrees).click();
	}

	public void click_TreeDetails_ImplementationInPython()
	{
		driver.findElement(treeDetails_ImplementationInPython).click();
	}

	public void click_TreeDetails_BinaryTreeTraversals()
	{
		driver.findElement(treeDetails_BinaryTreeTraversals).click();
	}

	public void click_TreeDetails_ImplementationOfBinaryTrees()
	{
		driver.findElement(treeDetails_ImplementationOfBinaryTrees).click();
	}

	public void click_TreeDetails_ApplicationsOfBinaryTrees()
	{
		driver.findElement(treeDetails_ApplicationsOfBinaryTrees).click();
	}

	public void click_TreeDetails_BinarySearchTrees()
	{
		driver.findElement(treeDetails_BinarySearchTrees).click();
	}

	public void click_TreeDetails_ImplementationOfBST()
	{
		driver.findElement(treeDetails_ImplementationOfBST).click();
	}

	public void click_TreeDetails_PracticeQuestionsLink()
	{
		driver.findElement(treeDetails_PracticeQuestions).click();
	}


	///////////////////////////////////////////////////////////////////// TRY HERE EDITOR METHODS

	public void checkIf_RunBtn_TryEditorPageIsDisplayed()
	{
		driver.findElement(runButton).isDisplayed();
	}

	public void writeInTryEditorWindow(String code)
	{
		driver.findElement(codeInputField).sendKeys(code);
		driver.findElement(runButton).click();
	}

	public void clickOnOKBtnFromEditorErrorAlert()
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void checkIfOn_TryHereEditorPage() {
		driver.findElement(runButton).isDisplayed();
	}

	public void check_When_InvalidCode_In_Editor(String expectedErrorHeader, String expectedErrorMessage)
	{
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
	}



}
