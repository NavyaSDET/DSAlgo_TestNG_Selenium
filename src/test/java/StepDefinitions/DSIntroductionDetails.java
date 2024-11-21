package StepDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;

public class DSIntroductionDetails {

	public HomePage hp = new HomePage();
	public IntroductionPage ip =  new IntroductionPage();

	@Given("The user should open the DS Algo Portal URL in any supported browser")
	public void the_user_should_open_the_ds_algo_portal_url_in_any_supported_browser() {
		hp.openUrl();
	}

	@Then("The user should land in Data Structure Introduction Page with register and Sign in links")
	public void the_user_should_land_in_data_structure_introduction_page_with_register_and_sign_in_links() {
		ip.validateUserIsOnIntroductionPage();
		System.out.println("The user should land in Data Structure Introduction Page with register and Sign in links");
	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button() {
		System.out.println("The user clicks the Get Started button");
		hp.clickOnHomePageGetStartedButton();
	}

	@When("The user clicks the data structure dropdown arrow")
	public void the_user_clicks_the_data_structure_dropdown_arrow() {
		ip.clickOnDataStructureDropdown();
		System.out.println("The user clicks the data structure dropdown arrow");
	}

	@Then("The user should able to see siz options Arrays Linked,List,Stack,Queue,Tree,Graph in dropdown menu")
	public void the_user_should_able_to_see_siz_options_arrays_linked_list_stack_queue_tree_graph_in_dropdown_menu() {
		ip.validateListInDataStructureDropDownMenu();
		System.out.println(
				"The user should able to see siz options Arrays Linked,List,Stack,Queue,Tree,Graph in dropdown menu");
	}

	@Given("The user is on the DS Introduction page")
	public void the_user_is_on_the_ds_introduction_page() {

		hp.clickOnHomePageGetStartedButton();	

	}

	@When("The user clicks any Get Started buttons of data structures on the DS Introduction page")
	public void the_user_clicks_any_get_started_buttons_of_data_structures_on_the_ds_introduction_page() {
		ip.clickOnDSIntroductionhomepage();
	}

	@Then("The user should able to see an warning message You are not logged in")
	public void the_user_should_able_to_see_an_warning_message_you_are_not_logged_in() {
		ip.validateWarningMessageWhenNotLoggedIn();
	}

	@When("The user clicks Register link on the DS Introduction page")
	public void the_user_clicks_register_link_on_the_ds_introduction_page() {
		ip.clickOnRegisterlink();
	}

	@Then("The user should navigate to register page")
	public void the_user_should_navigate_to_register_page() {
		ip.validateUserNavigatedToRegisterPage();
	}

	@Given("The user is on the DS Introduction page as signedIn")
	public void the_user_is_on_the_ds_introduction_page_as_signed_in() {
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.completeTheLOgin();
	}

	@When("The user clicks the Get Started button of DS Introduction")
	public void the_user_clicks_the_get_started_button_of_ds_introduction() {
		ip.clickOnGetStartedButtonOfDSIntroduction();
	}

	@Then("The user should navigate to DS Intoduction details page")
	public void the_user_should_navigate_to_ds_intoduction_details_page() {
		ip.validateUserisOnDSIntroduction();
	}

	@Then("User should see the timeComplexity link")
	public void user_should_see_the_time_complexity_link() {
		ip.validateTimeComplexiButtonDisplayed();
	}

	@When("The user clicks the Time Complexity button")
	public void the_user_clicks_the_time_complexity_button() {
		ip.clickOnTimeComplexiButton();
	}

	@Then("User should navigate to Time Complexity page")
	public void user_should_navigate_to_time_complexity_page() {
		ip.validateTimeComplexitypage();
	}

	@Then(" User clicks on Get Started button from Tree panel")
	public void  user_clicks_on_get_started_button_from_tree_panel() {
		ip.validateTimeComplexitypage();
	}

	@When("User clicks Try here link")
	public void user_clicks_try_here_link() {
		ip.clickOnTryHerebutton();
	}

	@Then("User should navigate to tryEditor page")
	public void user_should_navigate_to_try_editor_page() {
		ip.codeTryEditorPage();
	}

	@Given("User is on Try Here page for time complexity")
	public void user_is_on_try_here_page_for_time_complexity() {
		ip.codeTryEditorPage();
	}

	@When("The user write the invalid code in Editor")
	public void the_user_write_the_invalid_code_in_editor() {
		ip.enterCodeInEditor("ABC");
	}

	@When("Click the Run button")
	public void click_the_run_button() {
		ip.clickOnRunButton();
	}

	@Then("The user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says", "NameError: name 'ABC' is not defined on line 1");
	}

	@Then("The user should not see any error message or alert")
	public void the_user_should_not_see_any_error_message_or_alert() {
		ip.validateNoConsoleOuput();
	}

	@When("The user write the valid code in Editor")
	public void the_user_write_the_valid_code_in_editor() {
		ip.enterCodeInEditor("print(\"hello\")");
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
		ip.validateConsoleOutput("hello");
	}

}