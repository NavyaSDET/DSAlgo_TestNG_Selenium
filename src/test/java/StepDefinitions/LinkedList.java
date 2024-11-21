package StepDefinitions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.LinkedListPage;
import PageObjects.RegistrationPage;
import PageObjects.TreePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedList {

	public WebDriver driver = Hooks.driver;
	public LinkedListPage LLPage = new LinkedListPage(driver);
	public RegistrationPage RGPage;
	TreePage treePage= new TreePage(driver);



	@Given("User clicks on Get Started button from Linked List panel")
	public void user_clicks_on_get_started_button_from_linked_list_panel() {
		//treePage = new TreePage(driver);
		RGPage = new RegistrationPage(driver);
		LLPage = new LinkedListPage(driver);
	   LLPage.click_LL_GetStartedBtn_HomePage();
	}

	@Given("The user is on the Introduction page")
	public void the_user_is_on_the_introduction_page() {

		LLPage.click_LL_IntroductionPage();
	}

	@When("The user clicks on Linked List from the Data Structure dropdown menu.")
	public void the_user_clicks_on_linked_list_from_the_data_structure_dropdown_menu() {

	//	treePage = new TreePage(driver);
		treePage.clickDataStructures_DropDownBtn();
	    LLPage.click_LinkedList_FromDropDown();
	}

	@Then("The user is redirected to Linked List page.")
	public void the_user_is_redirected_to_linked_list_page() {

	    Assert.assertEquals(driver.getTitle(),"Linked List");
	}

	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {

		LLPage.click_LL_IntroductionPage();
	}

	@Then("The user is redirected to Introduction page.")
	public void the_user_is_redirected_to_introduction_page() {

		Assert.assertEquals(driver.getTitle(),"Introduction");
	}


	@When("The user clicks Creating Linked LIst link")
	public void the_user_clicks_creating_linked_l_ist_link() {

	    LLPage.click_LL_Details_Creating_LinkedList();
	}

	@Then("The user is redirected to Creating Linked List page.")
	public void the_user_is_redirected_to_creating_linked_list_page() {

		Assert.assertEquals(driver.getTitle(),"Creating Linked LIst");
	}

	@Given("The user is on the Creating Linked LIst page")
	public void the_user_is_on_the_creating_linked_l_ist_page() {

	    LLPage.click_LL_Creating_LinkedList();
	}

	@When("The user clicks Types of Linked List link")
	public void the_user_clicks_types_of_linked_list_link() {

	    LLPage.click_LL_Details_Types_Of_LinkedList();
	}

	@Then("The user is directed to Types of Linked List page.")
	public void the_user_is_directed_to_types_of_linked_list_page() {

		Assert.assertEquals(driver.getTitle(),"Types of Linked List");
	}

	@Given("The user is on the Types of Linked List page")
	public void the_user_is_on_the_types_of_linked_list_page() {

	    LLPage.click_LL_Types_Of_LinkedList();
	}

	@When("The user clicks Implement Linked List in Python link")
	public void the_user_clicks_implement_linked_list_in_python_link() {

	    LLPage.click_LL_Details_Implement_Linked_List_In_Python();
	}

	@Then("The user is redirected to Implement Linked List in Python page.")
	public void the_user_is_redirected_to_implement_linked_list_in_python_page() {

		Assert.assertEquals(driver.getTitle(),"Implement Linked List in Python");
	}

	@Given("The user is on the Implement Linked List in Python page")
	public void the_user_is_on_the_implement_linked_list_in_python_page() {

	    LLPage.click_LL_Implement_Linked_List_In_Python();
	}

	@When("The user clicks Traversal link")
	public void the_user_clicks_traversal_link() {

	    LLPage.click_LL_Details_Traversal();
	}

	@Then("The user is redirected to Traversal page.")
	public void the_user_is_redirected_to_traversal_page() {

		Assert.assertEquals(driver.getTitle(),"Traversal");
	}

	@Given("The user is on the Traversal page")
	public void the_user_is_on_the_traversal_page() {

		LLPage.click_LL_Traversal();

	}

	@When("The user clicks Insertion link")
	public void the_user_clicks_insertion_link() {

	    LLPage.click_LL_Details_Insertion();
	}

	@Then("The user is redirected to Insertion page.")
	public void the_user_is_redirected_to_insertion_page() {

		Assert.assertEquals(driver.getTitle(),"Insertion");
	}

	@Given("The user is on the Insertion page")
	public void the_user_is_on_the_insertion_page() {

	    LLPage.click_LL_Insertion();
	}

	@When("The user clicks Deletion link")
	public void the_user_clicks_deletion_link() {

	    LLPage.click_LL_Details_Deletion();
	}

	@Then("The user is redirected to Deletion page.")
	public void the_user_is_redirected_to_deletion_page() {

		Assert.assertEquals(driver.getTitle(),"Deletion");
	}

	@Given("The user is on the Deletion page")
	public void the_user_is_on_the_deletion_page() {

	    LLPage.click_LL_Deletion();
	}


	/*
	@When("User clicks on Get Started button from Linked List panel.")
	public void user_clicks_on_get_started_button_from_linked_list_panel() {


	}

	@Then("The user is on the same Editor page with Run button")
	public void the_user_is_on_the_same_editor_page_with_run_button() {


	}*/



}
