package Tests;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;
import PageObjects.RegistrationPage;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import Utilities.ExcelReader;
import Utilities.RetryAnalyzer;
import Utilities.TestDataProvider;
import BaseTest.BaseTest;

public class RegistrationTestCases extends BaseTest{

	public HomePage hp;
	public IntroductionPage ip;
	public RegistrationPage RGPage;

	@BeforeMethod(alwaysRun = true)
	public void landOnRegisterPage() {
		hp = new HomePage();
		ip =  new IntroductionPage();
		RGPage = new RegistrationPage();
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.clickOnRegisterlink();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "RegisterRow7", dataProviderClass = TestDataProvider.class)

	public void TC_01_validate_RegistrationIsSuccessful_onAllValidCredentials(String sheetName, int rowNumber ) throws IOException, OpenXML4JException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetName);

		String username = testdata.get(rowNumber).get("username");
		String password = testdata.get(rowNumber).get("password");
		String passwordConfirm = testdata.get(rowNumber).get("password confirmation");
		RGPage.enterUsername(username);
		RGPage.enterPassword(password);
		RGPage.enterPasswordConfirmation(passwordConfirm);
		RGPage.clickRegisterBtn_RegisterPage();	
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "RegisterRow6", dataProviderClass = TestDataProvider.class)
	public void TC_02_validate_Error_Message_when_DifferentPasswordsIn_Both_PswdFields(String sheetName, int rowNumber ) throws IOException, OpenXML4JException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetName);

		String username = testdata.get(rowNumber).get("username");
		String password = testdata.get(rowNumber).get("password");
		String passwordConfirm = testdata.get(rowNumber).get("password confirmation");
		RGPage.enterUsername(username);
		RGPage.enterPassword(password);
		RGPage.enterPasswordConfirmation(passwordConfirm);
		RGPage.clickRegisterBtn_RegisterPage();	
		String expectedErrorMsg = "password_mismatch:The two password fields didn’t match.";
		String actualErrorMsg = RGPage.showErrorMsg_PswdDoNotMatch();
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);  //Assertion
	}


	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "RegisterRow0", dataProviderClass = TestDataProvider.class)
	public void the_user_clicks_register_button_with_all_fields_empty_on_registration_form(String sheetName, int rowNumber ) throws IOException, OpenXML4JException, InterruptedException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetName);

		String username = testdata.get(rowNumber).get("username");
		String password = testdata.get(rowNumber).get("password");
		String passwordConfirm = testdata.get(rowNumber).get("password confirmation");

		RGPage.enterUsername(username);
		RGPage.enterPassword(password);
		RGPage.enterPasswordConfirmation(passwordConfirm);
		RGPage.clickRegisterBtn_RegisterPage();	
		String validationMessage = ip.getValidationMessage();
		Assert.assertEquals(validationMessage, "Please fill out this field.");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "RegisterRow3", dataProviderClass = TestDataProvider.class)
	public void the_user_clicks_register_button_after_entering_a_username_with_spacebar_characters_other_than_digits_and_on_registration_form(String sheetName, int rowNumber ) throws IOException, OpenXML4JException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetName);

		String username = testdata.get(rowNumber).get("username");
		String password = testdata.get(rowNumber).get("password");
		String passwordConfirm = testdata.get(rowNumber).get("password confirmation");RGPage.enterUsername("dgfgf awe33");
		RGPage.enterPassword(password);
		RGPage.enterPasswordConfirmation(passwordConfirm);
		RGPage.clickRegisterBtn_RegisterPage();	
		Assert.assertEquals(ip.getPageTitle(),"NumpyNinja");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "RegisterRow4", dataProviderClass = TestDataProvider.class)
	public void the_user_clicks_register_button_after_entering_a_password_with_only_numeric_data_on_registration_form(String sheetName, int rowNumber ) throws IOException, OpenXML4JException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetName);

		String username = testdata.get(rowNumber).get("username");
		String password = testdata.get(rowNumber).get("password");
		String passwordConfirm = testdata.get(rowNumber).get("password confirmation");
		RGPage.enterUsername(username);
		RGPage.enterPassword(password);
		RGPage.enterPasswordConfirmation(passwordConfirm);
		RGPage.clickRegisterBtn_RegisterPage();
		String expectedErrorMsg = "password_mismatch:The two password fields didn’t match.";
		String actualErrorMsg = RGPage.showErrorMsg_PswdDoNotMatch();
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "RegisterRow5", dataProviderClass = TestDataProvider.class)
	public void the_user_clicks_register_button_after_entering_a_password_with_characters_less_than_eight_on_registration_form(String sheetName, int rowNumber ) throws IOException, OpenXML4JException	{
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetName);

		String username = testdata.get(rowNumber).get("username");
		String password = testdata.get(rowNumber).get("password");
		String passwordConfirm = testdata.get(rowNumber).get("password confirmation");
		RGPage.enterUsername(username);
		RGPage.enterPassword(password);
		RGPage.enterPasswordConfirmation(passwordConfirm);
		RGPage.clickRegisterBtn_RegisterPage();
		String expectedErrorMsg = "password_mismatch:The two password fields didn’t match.";
		String actualErrorMsg = RGPage.showErrorMsg_PswdDoNotMatch();
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);  //Assertion
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void user_clicks_on_login_button_from_registration_page() {
		RGPage.clickLoginBtn();
		Assert.assertEquals(ip.getPageTitle(),"Login");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void user_clicks_on_sign_in_button_from_registration_page() {
		RGPage.clickSignInBtn();
		Assert.assertEquals(ip.getPageTitle(),"Login");
	}

}
