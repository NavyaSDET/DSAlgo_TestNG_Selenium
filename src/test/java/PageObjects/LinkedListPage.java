package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import BaseTest.BaseTest;

public class LinkedListPage extends BaseTest {

	//LL Page general elements

		private By LL_GetStartedBtn_HomePage = By.xpath("//div[3]/div/div/a");
		private By DataStructures_DropDownBtn = By.xpath("//a[@class='nav-link dropdown-toggle']");
		private By LinkedList_FromDropDown = By.xpath("//div[@class='dropdown-menu show']/a[@href='/linked-list']");



		//LL HomePage Module elements

		private By Introduction = By.xpath("//a[@href='introduction']");
		private By CreatingLinkedList = By.xpath("//a[@href='creating-linked-list']");
		private By TypesOfLinkedList = By.xpath("//a[@href='types-of-linked-list']");
		private By ImplementLinkedListInPython = By.xpath("//a[@href='implement-linked-list-in-python']");
		private By Traversal = By.xpath("//a[@href='traversal']");
		private By Insertion = By.xpath("//a[@href='insertion-in-linked-list']");
		private By Deletion = By.xpath("//a[@href='deletion-in-linked-list']");

		//LL Details Module elements
		private By LL_Details_Introduction = By.cssSelector("a[href='/linked-list/introduction/']");
		private By LL_Details_CreatingLinkedList = By.cssSelector("a[href='/linked-list/creating-linked-list/']");
		private By LL_Details_TypesOfLinkedList = By.cssSelector("a[href='/linked-list/types-of-linked-list/']");
		private By LL_Details_ImplementLinkedListInPython = By.cssSelector("a[href='/linked-list/implement-linked-list-in-python/']");
		private By LL_Details_Traversal = By.cssSelector("a[href='/linked-list/traversal/']");
		private By LL_Details_Insertion = By.cssSelector("a[href='/linked-list/insertion-in-linked-list/']");
		private By LL_Details_Deletion = By.cssSelector("a[href='/linked-list/deletion-in-linked-list/']");

	    //GENERAL ELEMENT METHODS

		public void click_GetStartedBtn_for_LinkedList_from_HomePage()
		{
			driver.findElement(LL_GetStartedBtn_HomePage).click();
		}

		
		public void click_LL_IntroductionPage()
		{
			driver.findElement(Introduction).click();
		}

		public void click_LinkedList_FromDropDown()
		{
	        driver.findElement(DataStructures_DropDownBtn).click();
			driver.findElement(LinkedList_FromDropDown).click();
		}

		// PAGE MODULES ELEMENTS METHODS

		public void clickOn_LL_Creating_LinkedList()
		{
			driver.findElement(CreatingLinkedList).click();
		}

		public void clickOn_LL_Types_Of_LinkedList()
		{
			driver.findElement(TypesOfLinkedList).click();
		}

		public void clickOn_LL_Implement_Linked_List_In_Python()
		{
			driver.findElement(ImplementLinkedListInPython).click();
		}

		public void clickOn_LL_Traversal()
		{
			driver.findElement(Traversal).click();
		}

		public void clickOn_LL_Insertion()
		{
			driver.findElement(Insertion).click();
		}

		public void clickOn_LL_Deletion()
		{
			driver.findElement(Deletion).click();
		}


		//LL Details Page module methods

		public void click_LL_Details_Introduction()
		{
			driver.findElement(LL_Details_Introduction).click();

		}
		
		public void click_LL_Details_Creating_LinkedList()
		{
			driver.findElement(LL_Details_CreatingLinkedList).click();

		}

		public void click_LL_Details_Types_Of_LinkedList()
		{
			driver.findElement(LL_Details_TypesOfLinkedList).click();
		}

		public void click_LL_Details_Implement_Linked_List_In_Python()
		{
			driver.findElement(LL_Details_ImplementLinkedListInPython).click();
		}

		public void click_LL_Details_Traversal()
		{
			driver.findElement(LL_Details_Traversal).click();
		}

		public void click_LL_Details_Insertion()
		{
			driver.findElement(LL_Details_Insertion).click();
		}

		public void click_LL_Details_Deletion()
		{
			driver.findElement(LL_Details_Deletion).click();
		}

		// 'Check if on expected Page' METHODS
		
		public void check_If_On_LL_HomePage()
		{
			Assert.assertEquals(driver.getCurrentUrl(),"Linked List" );
		}
		
		public void check_If_On_LL_Introduction()
		{
			Assert.assertEquals(driver.getCurrentUrl(),"Introduction" );
		}
		
		public void check_If_On_LL_CreatingLinkedList()
		{
			Assert.assertEquals(driver.getCurrentUrl(),"Creating Linked LIst" );
		}
		
		public void check_If_On_LL_TypesOfLinkedListe()
		{
			Assert.assertEquals(driver.getCurrentUrl(),"Types of Linked List" );
		}
		
		public void check_If_On_LL_ImplementLinkedListInPython()
		{
			Assert.assertEquals(driver.getCurrentUrl(),"Implement Linked List in Python" );
		}
		
		public void check_If_On_LL_TRaversal()
		{
			Assert.assertEquals(driver.getCurrentUrl(),"Traversal" );
		}
		
		public void check_If_On_LL_Insertion()
		{
			Assert.assertEquals(driver.getCurrentUrl(),"Insertion" );
		}
		
		public void check_If_On_LL_Deletion()
		{
			Assert.assertEquals(driver.getCurrentUrl(),"Deletion" );
		}
		
		public void check_If_On_LL_Practice_Questions()
		{
			Assert.assertEquals(driver.getCurrentUrl(),"Practice Questions" );
		}
		


}
