package StepDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.ArrayPage;
import PageObjects.IntroductionPage;

public class ArrayStepDefintions {

	public ArrayPage ap = new ArrayPage();
	public IntroductionPage ip =  new IntroductionPage();

	@When("The user clicks on Get Started link for array")
	public void the_user_clicks_on_get_started_link_for_array() {
		ip.clickOnGetStartedButtonOfArray();
	}

	@Then("The user is on the array details page")
	public void the_user_is_on_the_array_details_page() {
		ap.validateUserIsOnArrayDetailPage();
	}

	@When("The user click on Array in python link")
	public void the_user_click_on_array_in_python_link() {
		ap.clickOnArrayInPythonLink();
	}

	@Then("the user is navigated to array in arrays in python")
	public void the_user_is_navigated_to_array_in_arrays_in_python() {
		ap.validateUserIsOnArraysInPython();
	}

	@Given("The user is on the arrays in python page")
	public void the_user_is_on_the_arrays_in_python_page() {
		ap.clickOnArrayInPythonLink();
		ap.validateUserIsOnArraysInPython();
	}

	@When("The user click on Array using list link")
	public void the_user_click_on_array_using_list_link() {
		ap.clickOnArrayUsingListLink();
	}

	@Then("the user is navigated to array in Array using list")
	public void the_user_is_navigated_to_array_in_array_using_list() {
		ap.validateUserIsOnArraysUsingList();
	}

	@Given("The user is on the Array using list")
	public void the_user_is_on_the_array_using_list() {
		ap.clickOnArrayUsingListLink();
		ap.validateUserIsOnArraysUsingList();
	}

	@When("The user click on basic operations in lists")
	public void the_user_click_on_basic_operations_in_lists() {
		ap.clickOnBasicOperationsLink();
	}

	@Then("the user is navigated to basic opertaions in lists")
	public void the_user_is_navigated_to_basic_opertaions_in_lists() {
		ap.validateUserIsOnBasicOperationsInList();
	}

	@Given("The user is on the Basic operations in lists")
	public void the_user_is_on_the_basic_operations_in_lists() {
		ap.clickOnBasicOperationsLink();
		ap.validateUserIsOnBasicOperationsInList();
	}

	@When("The user click on applications of array link")
	public void the_user_click_on_applications_of_array_link() {
		ap.clickOnApplicationOfArrayLink();
	}

	@Then("the user is navigated to applications of array")
	public void the_user_is_navigated_to_applications_of_array() {
		ap.validateUserIsOnApplicationsOfArray();
	}

	@Given("The user is on the applications of array")
	public void the_user_is_on_the_applications_of_array() {
		ap.clickOnApplicationOfArrayLink();
		ap.validateUserIsOnApplicationsOfArray();
	}

	@When("the user click on the practice questions link")
	public void the_user_click_on_the_practice_questions_link() {
		ap.clickOnPracticeQuestionsLink();
	}

	@Then("the user navigates to practice question page")
	public void the_user_navigates_to_practice_question_page() {
		ap.validateUserIsOnPracticeQuestionsPage();
	}

}