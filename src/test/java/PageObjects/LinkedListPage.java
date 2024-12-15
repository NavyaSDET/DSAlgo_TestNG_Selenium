package PageObjects;

import org.openqa.selenium.By;
import org.testng.Assert;

import BaseTest.BaseTest;

public class LinkedListPage extends BaseTest {

	// LL Page general elements
	private By LL_GetStartedBtn_HomePage = By.xpath("//div[3]/div/div/a");
	private By DataStructures_DropDownBtn = By.xpath("//a[@class='nav-link dropdown-toggle']");
	private By LinkedList_FromDropDown = By.xpath("//div[@class='dropdown-menu show']/a[@href='/linked-list']");

	// LL HomePage Module elements

	private By Introduction = By.xpath("//a[@href='introduction']");
	private By CreatingLinkedList = By.xpath("//a[@href='creating-linked-list']");
	private By TypesOfLinkedList = By.xpath("//a[@href='types-of-linked-list']");
	private By ImplementLinkedListInPython = By.xpath("//a[@href='implement-linked-list-in-python']");
	private By Traversal = By.xpath("//a[@href='traversal']");
	private By Insertion = By.xpath("//a[@href='insertion-in-linked-list']");
	private By Deletion = By.xpath("//a[@href='deletion-in-linked-list']");

	// LL Details Module elements
	private By LL_Details_Introduction = By.cssSelector("a[href='/linked-list/introduction/']");
	private By LL_Details_CreatingLinkedList = By.cssSelector("a[href='/linked-list/creating-linked-list/']");
	private By LL_Details_TypesOfLinkedList = By.cssSelector("a[href='/linked-list/types-of-linked-list/']");
	private By LL_Details_ImplementLinkedListInPython = By
			.cssSelector("a[href='/linked-list/implement-linked-list-in-python/']");
	private By LL_Details_Traversal = By.cssSelector("a[href='/linked-list/traversal/']");
	private By LL_Details_Insertion = By.cssSelector("a[href='/linked-list/insertion-in-linked-list/']");
	private By LL_Details_Deletion = By.cssSelector("a[href='/linked-list/deletion-in-linked-list/']");

	// GENERAL ELEMENT METHODS

	public void clickOn_LL_GetStartedBtn_HomePage() {
		getDriver().findElement(LL_GetStartedBtn_HomePage).click();
	}

	public void clickOn_LL_IntroductionPage() {
		getDriver().findElement(Introduction).click();
	}

	public void clickOn_LinkedList_FromDropDown() {
		getDriver().findElement(DataStructures_DropDownBtn).click();
		getDriver().findElement(LinkedList_FromDropDown).click();
	}

	// PAGE MODULES ELEMENTS METHODS

	public void clickOn_LL_Creating_LinkedList() {
		getDriver().findElement(CreatingLinkedList).click();
	}

	public void clickOn_LL_Types_Of_LinkedList() {
		getDriver().findElement(TypesOfLinkedList).click();
	}

	public void clickOn_LL_Implement_Linked_List_In_Python() {
		getDriver().findElement(ImplementLinkedListInPython).click();
	}

	public void clickOn_LL_Traversal() {
		getDriver().findElement(Traversal).click();
	}

	public void clickOn_LL_Insertion() {
		getDriver().findElement(Insertion).click();
	}

	public void clickOn_LL_Deletion() {
		getDriver().findElement(Deletion).click();
	}

	// LL Details Page module methods

	public void clickOn_LL_Details_Creating_LinkedList() {
		getDriver().findElement(LL_Details_CreatingLinkedList).click();
	}

	public void clickOn_LL_Details_Types_Of_LinkedList() {
		getDriver().findElement(LL_Details_TypesOfLinkedList).click();
	}

	public void clickOn_LL_Details_Implement_Linked_List_In_Python() {
		getDriver().findElement(LL_Details_ImplementLinkedListInPython).click();
	}

	public void clickOn_LL_Details_Traversal() {
		getDriver().findElement(LL_Details_Traversal).click();
	}

	public void clickOn_LL_Details_Insertion() {
		getDriver().findElement(LL_Details_Insertion).click();
	}

	public void clickOn_LL_Details_Deletion() {
		getDriver().findElement(LL_Details_Deletion).click();
	}

	public void check_If_On_LL_Deletion() {
		Assert.assertEquals(getDriver().getCurrentUrl(), "Deletion");
	}

	public void check_If_On_LL_Insertion() {
		Assert.assertEquals(getDriver().getCurrentUrl(), "Insertion");
	}

	public void check_If_On_LL_TRaversal() {
		Assert.assertEquals(getDriver().getCurrentUrl(), "Traversal");
	}

	public void check_If_On_LL_Introduction() {
		Assert.assertEquals(getDriver().getCurrentUrl(), "Introduction");
	}

	public void check_If_On_LL_CreatingLinkedList() {
		Assert.assertEquals(getDriver().getCurrentUrl(), "Creating Linked LIst");
	}

	public void check_If_On_LL_TypesOfLinkedListe() {
		Assert.assertEquals(getDriver().getCurrentUrl(), "Types of Linked List");
	}

	public void check_If_On_LL_ImplementLinkedListInPython() {
		Assert.assertEquals(getDriver().getCurrentUrl(), "Implement Linked List in Python");
	}

	public void check_If_On_LL_HomePage() {
		Assert.assertEquals(getDriver().getCurrentUrl(), "Linked List");
	}

}
