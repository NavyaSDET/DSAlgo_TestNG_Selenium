package Tests;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import Utilities.RetryAnalyzer;
import Utilities.TestDataProvider;
import BaseTest.BaseTest;
import PageObjects.LoginPage;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;

public class LoginTestNav extends BaseTest{

	public HomePage hp;
	public LoginPage login;
	public IntroductionPage ip;

	@BeforeMethod(alwaysRun = true)
	public void loginIntoApp() {
		hp = new HomePage();
		login = new LoginPage();
		ip =  new IntroductionPage();
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.clickOnSignInlink();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "loginRow4", dataProviderClass = TestDataProvider.class)
	public void DS_Algo_Sign_in_Page_with_blank_info (String sheetName, int rowNumber) throws InterruptedException, InvalidFormatException, IOException, OpenXML4JException {
		login.loginValiduser(sheetName, rowNumber);
		login.validateAlertMessage("Please fill out this field.");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "loginRow5", dataProviderClass = TestDataProvider.class)
	public void DS_Algo_Sign_in_Page_with_blank_password (String sheetName, int rowNumber) throws InterruptedException, InvalidFormatException, IOException, OpenXML4JException {
		login.loginValiduser(sheetName, rowNumber);
		login.validateAlertMessage("Please fill out this field.");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "loginRow1", dataProviderClass = TestDataProvider.class)
	public void DS_Algo_Sign_in_Page__with_blank_username (String sheetName, int rowNumber) throws InterruptedException, InvalidFormatException, IOException, OpenXML4JException {
		login.loginValiduser(sheetName, rowNumber);
		login.validateAlertMessage("Please fill out this field.");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "loginRow0", dataProviderClass = TestDataProvider.class)
	public void DS_Algo_Sign_in_Page_with_invalid_username_and_password (String sheetName, int rowNumber) throws InterruptedException, InvalidFormatException, IOException, OpenXML4JException {
		login.loginValiduser(sheetName, rowNumber);
		login.validaterrormessage("Invalid Username and Password");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "loginRow3", dataProviderClass = TestDataProvider.class)
	public void DS_Algo_Sign_in_Page_with_valid_username_and_invalid_password (String sheetName, int rowNumber) throws InterruptedException, InvalidFormatException, IOException, OpenXML4JException {
		login.loginValiduser(sheetName, rowNumber);
		login.validaterrormessage("Invalid Username and Password");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "loginRow2", dataProviderClass = TestDataProvider.class)
	public void DS_Algo_Sign_in_Page__with_valid_username_and_Valid_password  (String sheetName, int rowNumber) throws InterruptedException, InvalidFormatException, IOException, OpenXML4JException {
		login.loginValiduser(sheetName, rowNumber);
		login.validaterrormessage("You are logged in");
	}
}
