package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DriverManager.DriverManager;

public class LinkedListPage {
	public WebDriver driver = DriverManager.getDriver();

	// LL Page general elements
	public By LL_GetStartedBtn_HomePage = By.xpath("//div[3]/div/div/a");
	public By DataStructures_DropDownBtn = By.xpath("//a[@class='nav-link dropdown-toggle']");
	public By LinkedList_FromDropDown = By.xpath("//div[@class='dropdown-menu show']/a[@href='/linked-list']");

	// LL HomePage Module elements
	public By Introduction = By.xpath("//a[@href='introduction']");
	public By CreatingLinkedList = By.xpath("//a[@href='creating-linked-list']");
	public By TypesOfLinkedList = By.xpath("//a[@href='types-of-linked-list']");
	public By ImplementLinkedListInPython = By.xpath("//a[@href='implement-linked-list-in-python']");
	public By Traversal = By.xpath("//a[@href='traversal']");
	public By Insertion = By.xpath("//a[@href='insertion-in-linked-list']");
	public By Deletion = By.xpath("//a[@href='deletion-in-linked-list']");

	// LL Details Module elements
	public By LL_Details_Introduction = By.cssSelector("a[href='/linked-list/introduction/']");
	public By LL_Details_CreatingLinkedList = By.cssSelector("a[href='/linked-list/creating-linked-list/']");
	public By LL_Details_TypesOfLinkedList = By.cssSelector("a[href='/linked-list/types-of-linked-list/']");
	public By LL_Details_ImplementLinkedListInPython = By
			.cssSelector("a[href='/linked-list/implement-linked-list-in-python/']");
	public By LL_Details_Traversal = By.cssSelector("a[href='/linked-list/traversal/']");
	public By LL_Details_Insertion = By.cssSelector("a[href='/linked-list/insertion-in-linked-list/']");
	public By LL_Details_Deletion = By.cssSelector("a[href='/linked-list/deletion-in-linked-list/']");
	public By LL_Topics_List = By.cssSelector("ul a.list-group-item");


	// GENERAL ELEMENT METHODS

	public void click_GetStartedBtn_for_LinkedList_from_HomePage() {
		driver.findElement(LL_GetStartedBtn_HomePage).click();
	}

	public void click_LL_IntroductionPage() {
		driver.findElement(Introduction).click();
	}

	public void click_LinkedList_FromDropDown() {
		driver.findElement(LinkedList_FromDropDown).click();
	}

	// PAGE MODULES ELEMENTS METHODS

	public void clickOn_LL_Creating_LinkedList() {
		driver.findElement(CreatingLinkedList).click();
	}

	public void clickOn_LL_Types_Of_LinkedList() {
		driver.findElement(TypesOfLinkedList).click();
	}

	public void clickOn_LL_Implement_Linked_List_In_Python() {
		driver.findElement(ImplementLinkedListInPython).click();
	}

	public void clickOn_LL_Traversal() {
		driver.findElement(Traversal).click();
	}

	public void clickOn_LL_Insertion() {
		driver.findElement(Insertion).click();
	}

	public void clickOn_LL_Deletion() {
		driver.findElement(Deletion).click();
	}
	
	public void clickOnLinkedListTopListByPosition(int position) {
		driver.findElements(LL_Topics_List).get(position).click();
	}

	// LL Details Page module methods
	public void click_LL_Details_Introduction() {
		driver.findElement(LL_Details_Introduction).click();

	}

	public void click_LL_Details_Creating_LinkedList() {
		driver.findElement(LL_Details_CreatingLinkedList).click();

	}

	public void click_LL_Details_Types_Of_LinkedList() {
		driver.findElement(LL_Details_TypesOfLinkedList).click();
	}

	public void click_LL_Details_Implement_Linked_List_In_Python() {
		driver.findElement(LL_Details_ImplementLinkedListInPython).click();
	}

	public void click_LL_Details_Traversal() {
		driver.findElement(LL_Details_Traversal).click();
	}

	public void click_LL_Details_Insertion() {
		driver.findElement(LL_Details_Insertion).click();
	}

	public void click_LL_Details_Deletion() {
		driver.findElement(LL_Details_Deletion).click();
	}

}
