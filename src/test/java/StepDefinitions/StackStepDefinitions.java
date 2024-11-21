package StepDefinitions;

import PageObjects.IntroductionPage;
import PageObjects.StackPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackStepDefinitions {

	public StackPage sp = new StackPage();
	public IntroductionPage ip = new IntroductionPage();
	
	@Given("The user clicks on Get Started link for stack")
	public void the_user_clicks_on_get_started_link_for_stack() {
	    ip.clickOnGetStartedButtonOfStack();
	}

	@Given("The user is on the stack details page")
	public void the_user_is_on_the_stack_details_page() {
	    sp.validateUserIsOnStackDetailPage();
	}

	@When("The user click on Operations in Stack link")
	public void the_user_click_on_operations_in_stack_link() {
	    sp.clickOnOperationsInStackLink();
	}

	@Then("the user is navigated to Operations in Stack page")
	public void the_user_is_navigated_to_operations_in_stack_page() {
	    sp.validateUserIsOnoperationsInStackText();
	}

	@Given("The user is on the Operations in Stack page")
	public void the_user_is_on_the_operations_in_stack_page() {
	    sp.clickOnOperationsInStackLink();
	    sp.validateUserIsOnoperationsInStackText();
	}

	@When("The user click on Implementation link")
	public void the_user_click_on_implementation_link() {
	    sp.clickOnImplementationLink();
	}

	@Then("the user is navigated to Implementation page")
	public void the_user_is_navigated_to_implementation_page() {
	    sp.validateUserIsOnimplementaionText();
	}

	@Given("The user is on the Implementation page")
	public void the_user_is_on_the_implementation_page() {
	    sp.clickOnImplementationLink();
	    sp.validateUserIsOnimplementaionText();
	}

	@When("The user click on Applications link")
	public void the_user_click_on_applications_link() {
	    sp.clickOnApplicationsLink();
	}

	@Then("the user is navigated to Applications page")
	public void the_user_is_navigated_to_applications_page() {
	    sp.validateUserIsOnApplicationsText();
	}

	@Given("The user is on the Applications page")
	public void the_user_is_on_the_applications_page() {
	    sp.clickOnApplicationsLink();
	    sp.validateUserIsOnApplicationsText();
	}
}