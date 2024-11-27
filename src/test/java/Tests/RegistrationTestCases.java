package Tests;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;
import PageObjects.RegistrationPage;
import Utilities.ExcelReader;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
//import io.cucumber.java.en.Then;

public class RegistrationTestCases {
	
	
	public HomePage hp = new HomePage();
	public IntroductionPage ip =  new IntroductionPage();
	public RegistrationPage RGPage = new RegistrationPage();
	 

	@BeforeMethod(alwaysRun = true)
	public void landOnRegisterPage() {
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.clickOnRegisterlink();
	}

	@AfterMethod(alwaysRun =  true) 
	public void clearCookies(){
		hp.deleteAllCookies();		
	}
	
	@DataProvider(name = "RegistrationData")
	public Object[][] dataset1()
	{
		return new Object[][]
				{
			       {"orepiya355", "bhbhujhs33", "897ujhs33"},
			       {"jiyare289", "ctfgnnjhuh77", "mijokokoi79"}
			
				};
	}
	
	@Test
	
	public void TC_01_validate_RegistrationIsSuccessful_onAllValidCredentials()throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {
		
		//RGPage.fillRegistrationForm("Register", 0);
		
		
	}
	
	@Test(dataProvider="RegistrationData")
	public void TC_02_validate_Error_Message_when_DifferentPasswordsIn_Both_PswdFields(String username, String password, String confirm_pswd) throws IOException {
		
		RGPage.enterUsername(username);
		RGPage.enterPassword(password);
		RGPage.enterPasswordConfirmation(confirm_pswd);
		RGPage.clickRegisterBtn_RegisterPage();	
		String expectedErrorMsg = "Invalid password";
		String actualErrorMsg = RGPage.showErrorMsg_PswdDoNotMatch();
	    Assert.assertEquals(actualErrorMsg, expectedErrorMsg);  //Assertion
	}
	
	
	@Test
	public void the_user_clicks_register_button_with_all_fields_empty_on_registration_form() throws IOException
	{
		RGPage.enterUsername("");
		RGPage.enterPassword("");
		RGPage.enterPasswordConfirmation("");
		RGPage.clickRegisterBtn_RegisterPage();	
		RGPage.compareActualAndExpectedBrowserErrorMsg(); //Assertion
	}
	
	@Test
	public void the_user_clicks_register_button_after_entering_a_username_with_spacebar_characters_other_than_digits_and_on_registration_form() throws IOException {

		RGPage.enterUsername("dgfgf awe33");
		RGPage.enterPassword("dcdtgfh2344");
		RGPage.enterPasswordConfirmation("dcdtgfh2344");
		RGPage.clickRegisterBtn_RegisterPage();	
		RGPage.checkRegistrationPageURL();		//Assertion
	}
	
	@Test
	public void the_user_clicks_register_button_after_entering_a_password_with_only_numeric_data_on_registration_form() throws IOException{

		RGPage.enterUsername("ologonik27");
		RGPage.enterPassword("1234567999");
		RGPage.enterPasswordConfirmation("1234567999");
		RGPage.clickRegisterBtn_RegisterPage();
		String expectedErrorMsg = "Invalid password";
		String actualErrorMsg = RGPage.showErrorMsg_PswdDoNotMatch();
	    Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}
	
	@Test
	public void the_user_clicks_register_button_after_entering_a_password_with_characters_less_than_eight_on_registration_form() throws IOException {



		RGPage.enterUsername("ologonik27");
		RGPage.enterPassword("dc234");
		RGPage.enterPasswordConfirmation("dc234");
		RGPage.clickRegisterBtn_RegisterPage();
		String expectedErrorMsg = "Invalid password";
		String actualErrorMsg = RGPage.showErrorMsg_PswdDoNotMatch();
	    Assert.assertEquals(actualErrorMsg, expectedErrorMsg);  //Assertion


	}
	
	@Test
	public void user_clicks_on_login_button_from_registration_page() {

		RGPage.clickLoginBtn();
	    RGPage.assertLoginPage();  //Assertion
	}
	
	@Test
	public void user_clicks_on_sign_in_button_from_registration_page() {

		   RGPage.clickSignInBtn();
		   RGPage.assertLoginPage();  //Assertion
		   
		}
	
}
