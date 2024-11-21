package StepDefinitions;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.RegistrationPage;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {

	public WebDriver driver = Hooks.driver;
	RegistrationPage RGPage= new RegistrationPage(driver); //constructor used
	//ExcelReader excelReader = new ExcelReader("C:/Users/rakes/git/Repo1/src/test/resources/Excel/TestData.xlsx");

	String actualErrorMsg;
	String expectedErrorMsg;
	String expectedSuccessMsg;
	String actualSuccessMsg;


	@Given("The user is on the new user registration page")
	public void the_user_is_on_the_new_user_registration_page() {

		//Traditional structure(without POM) --
		/* System.setProperty("webdriver.chrome.driver", "/Users/rakes/eclipse-workspace/Hello-Selenium/src/test/resources/driver/chromedriver-win64/chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://dsportalapp.herokuapp.com/");
		driver.findElement(By.className("btn")).click();
		driver.findElement(By.xpath("//div[2]/ul/a[2]")).click();*/

		//POM Structure --
		RGPage.openDSAlgoURL();
		RGPage.clickGetStartedBtn();
		RGPage.clickRegisterBtn_GetStartedPage();

	}


	@When("The user clicks Register button with all fields empty on registration form from sheetname {string} and row {int}")
	public void the_user_clicks_register_button_with_all_fields_empty_on_registration_form_from_sheetname(String string, Integer int1) throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {


		RGPage.fillRegistrationForm("Register", 0);
		RGPage.clickRegisterBtn_RegisterPage();



	}

	@Then("The error Please fill out this field appears below Username textbox")
	public void the_error_please_fill_out_this_field_appears_below_username_textbox() {

		RGPage.compareActualAndExpectedBrowserErrorMsg();


	}

	@When("The user clicks Register button after entering Username with other fields empty on registration form from sheetname {string} and row {int}")
	public void the_user_clicks_register_button_after_entering_username_with_other_fields_empty_on_registration_form_from_sheetname(String string, Integer int1) throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {


		RGPage.fillRegistrationForm("Register", 1);
		RGPage.clickRegisterBtn_RegisterPage();


	}

	@Then("The error message Please fill out this field. appears below Password textbox")
	public void the_error_message_please_fill_out_this_field_appears_below_password_textbox() {

		RGPage.compareActualAndExpectedBrowserErrorMsg();
	}

	@When("The user clicks Register button after entering Username and password with Password Confirmation field empty on registration form from sheetname {string} and row {int}")
	public void the_user_clicks_register_button_after_entering_username_and_password_with_password_confirmation_field_empty_on_registration_form_from_sheetname(String string, Integer int1) throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {


		RGPage.fillRegistrationForm("Register", 2);
		RGPage.clickRegisterBtn_RegisterPage();


	}

	@Then("The error message Please fill out this field. appears below Password Confirmation textbox")
	public void then_the_error_message_please_fill_out_this_field_appears_below_password_confirmation_textbox() {

		RGPage.compareActualAndExpectedBrowserErrorMsg();
	}

	@When("The user clicks Register button after entering a username with spacebar characters other than digits and @\\/.\\/+\\/-\\/_ on registration form from sheetname {string} and row {int}")
	public void the_user_clicks_register_button_after_entering_a_username_with_spacebar_characters_other_than_digits_and_on_registration_form_from_sheetname(String string, Integer int1) throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {


		RGPage.fillRegistrationForm("Register", 3);
		RGPage.clickRegisterBtn_RegisterPage();

	}

	@Then("The user is displayed with error msg after entering invalid data and redirects to empty username textbox")
	public void the_user_is_displayed_with_error_msg_after_entering_invalid_data_and_redirects_to_empty_username_textbox() {

		RGPage.checkRegistrationPageURL();

	}

	@When("The user clicks Register button after entering a password with only numeric data on registration form from sheetname {string} and row {int}")
	public void the_user_clicks_register_button_after_entering_a_password_with_only_numeric_data_on_registration_form_from_sheetname(String string, Integer int1) throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {

		RGPage.fillRegistrationForm("Register", 4);
		RGPage.clickRegisterBtn_RegisterPage();
	}

	@Then("The user is displayed the appropriate error msg after entering invalid data and redirects to empty confirm password textbox")
	public void the_user_is_displayed_the_appropriate_error_msg_after_entering_invalid_data_and_redirects_to_empty_confirm_password_textbox() {

		 expectedErrorMsg = "Invalid password";
		 actualErrorMsg = RGPage.showErrorMsg_PswdDoNotMatch();
	     Assert.assertEquals(actualErrorMsg, expectedErrorMsg);


	}

	@When("The user clicks Register button after entering a Password with characters less than eight on registration form from sheetname {string} and row {int}")
	public void the_user_clicks_register_button_after_entering_a_password_with_characters_less_than_eight_on_registration_form_from_sheetname(String string, Integer int1) throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {



		RGPage.fillRegistrationForm("Register", 5);
		RGPage.clickRegisterBtn_RegisterPage();


	}

	@Then("The user is displayed the appropriate error msg after entering invalid data and  redirects to empty password confirm textbox")
	public void the_user_is_displayed_the_appropriate_error_msg_after_entering_invalid_data_and_redirects_to_empty_password_confirm_textbox() {

		 expectedErrorMsg = "Invalid password";
		 actualErrorMsg = RGPage.showErrorMsg_PswdDoNotMatch();
	     Assert.assertEquals(actualErrorMsg, expectedErrorMsg);

	}

	@When("The user clicks Register button after entering different passwords in Password and Password Confirmation fields form from sheetname {string} and row {int}")
	public void the_user_clicks_register_button_after_entering_different_passwords_in_password_and_password_confirmation_fields_on_registration_form_from_sheetname(String string, Integer int1) throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {


		//RGPage.enterUsernameAndPswdAndConfirmPswdAndClickRegisterBtn("rihannanhdgdgh34", "sesesdxftrdf45", "kjokpokmnokiu89");
		RGPage.fillRegistrationForm("Register", 6);
		RGPage.clickRegisterBtn_RegisterPage();
	}

	@Then("The user is displayed with a warning message password_mismatch:The two password fields didn’t match.")
	public void the_user_is_displayed_with_a_warning_message_password_mismatch_the_two_password_fields_didn_t_match() {


		 expectedErrorMsg = "password_mismatch:The two password fields didn’t match.";
		 actualErrorMsg = RGPage.showErrorMsg_PswdDoNotMatch();
		 Assert.assertEquals(actualErrorMsg, expectedErrorMsg);

	}

	@When("The user clicks Register button after user fills registration form from sheetname {string} and row {int}")
	public void the_user_clicks_register_button_after_user_fills_registration_form_from_sheetname_and_row(String string, Integer int1) throws IOException, OpenXML4JException, InterruptedException {


		RGPage.fillRegistrationForm("Register", 7);
		RGPage.clickRegisterBtn_RegisterPage();

	}

	@Then("The user is redirected to Home Page of DS Algo with success message - New Account Created. You are logged in as username on the DS Algo Home Page")
	public void the_user_is_redirected_to_home_page_of_ds_algo_with_success_message_new_account_created_you_are_logged_in_as_username_on_the_ds_algo_home_page() {




		Assert.assertEquals(RGPage.successMsg(), "New Account Created. You are logged in as 11111dddfrtfg");


	}

	@When("User clicks on login button from registration page")
	public void user_clicks_on_login_button_from_registration_page() {

		RGPage.clickLoginBtn();

	}

	@Then("user lands on login page")
	public void user_lands_on_login_page() {

	  RGPage.assertLoginPage();
	}

	@When("User clicks on SignIn button from registration page")
	public void user_clicks_on_sign_in_button_from_registration_page() {

	   RGPage.clickLoginBtn();
	}




}



