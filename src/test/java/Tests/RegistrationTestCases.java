package Tests;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;
import PageObjects.RegistrationPage;

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
	
	protected String getRandomString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

	@Test(retryAnalyzer = RetryAnalyzer.class)

	public void TC_01_validate_RegistrationIsSuccessful_onAllValidCredentials( ) throws IOException, OpenXML4JException {
		String username = getRandomString();
		String password = getRandomString();
		RGPage.enterUsername(username);
		RGPage.enterPassword(password);
		RGPage.enterPasswordConfirmation(password);
		RGPage.clickRegisterBtn_RegisterPage();	
	}


	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "registerData", dataProviderClass = TestDataProvider.class)
	public void registerPageScenarios(String userName, String password, String ConfirmPwd, String ExpectedMsg) throws IOException, OpenXML4JException, InterruptedException {
		{			       
			try {
				RGPage.enterUsername(userName);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				RGPage.enterPassword(password);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				RGPage.enterPasswordConfirmation(ConfirmPwd);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}        
			RGPage.clickRegisterBtn_RegisterPage();	
			if((userName.trim()==""&& password.trim()==""&& ConfirmPwd.trim()=="")||(password.trim()==""&& ConfirmPwd.trim()=="")||(ConfirmPwd.trim()=="")||userName.trim()=="")
			{
				Assert.assertEquals(ip.getValidationMessage(), ExpectedMsg);
			}
			else {
				Assert.assertEquals(RGPage.showErrorMsg_PswdDoNotMatch(), ExpectedMsg);
				System.out.println("Testing registration with Username: " + userName + 
						", Password: " + password + 
						", Confirm Password: " + ConfirmPwd +
						", ExpectedMsg: " + RGPage.showErrorMsg_PswdDoNotMatch() );
			}
		}
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
