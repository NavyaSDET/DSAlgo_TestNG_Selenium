package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


	@When("user enters username and password")
	public void user_enters_username_and_password() {
	System.out.println("Inside Step -user Enters username and password");
	}


	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {


	}
}
