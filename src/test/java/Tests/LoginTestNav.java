package Tests;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.testng.Assert;
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


	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "invalidLogin", dataProviderClass = TestDataProvider.class)
	public void testSignInInvalidData(String username, String password, String ExpectedMsg) throws InterruptedException {	
		login.loginValiduser(username, username);
		if((username.trim()==""&& password.trim()=="")||(password.trim()=="")||username.trim()=="")
		{
			String messageStr = ip.getValidationMessage();
			Assert.assertEquals(messageStr, "Please fill out this field.");
		}
		else {
			Assert.assertEquals(ip.getTextForElement(login.warningMessage), ExpectedMsg); 
		}
	}


	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "validLogin", dataProviderClass = TestDataProvider.class)
	public void DS_Algo_Sign_in_Page__with_valid_username_and_Valid_password  (String username,String password, String ExpectedMsg) throws InterruptedException {
		login.loginValiduser(username, password);
		Assert.assertEquals(ip.getTextForElement(login.warningMessage), ExpectedMsg);
	}
}
