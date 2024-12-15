package Tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import PageObjects.LoginPage;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;

public class LoginTestNav extends BaseTest{

	public HomePage hp = new HomePage();
	public LoginPage login = new LoginPage();
	public IntroductionPage ip =  new IntroductionPage();

	@Parameters("browser")
    @BeforeClass
    public void setUpTest(String browser) {
        setUp(browser);
    }
	
	
	@BeforeMethod(alwaysRun = true)
	public void loginIntoApp() {
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.clickOnSignInlink();
	}

	@AfterClass
    public void tearDownTest() {
        tearDown();
    }


	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void DS_Algo_Sign_in_Page_with_blank_info () throws InterruptedException {
		login.loginValiduser("", "");
		login.validateAlertMessage("Please fill out this field.");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void DS_Algo_Sign_in_Page_with_blank_password () throws InterruptedException {
		login.loginValiduser("qachamps3", "");
		login.validateAlertMessage("Please fill out this field.");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void DS_Algo_Sign_in_Page__with_blank_username () throws InterruptedException {
		login.loginValiduser("", "Ninjatest@123");
		login.validateAlertMessage("Please fill out this field.");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void DS_Algo_Sign_in_Page_with_invalid_username_and_password () throws InterruptedException {
		login.loginValiduser("testtttt", "testtttt");
		login.validaterrormessage("Invalid Username and Password");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void DS_Algo_Sign_in_Page_with_valid_username_and_invalid_password () throws InterruptedException {
		login.loginValiduser("qachamps3", "ytyutu");
		login.validaterrormessage("Invalid Username and Password");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void DS_Algo_Sign_in_Page__with_valid_username_and_Valid_password  () throws InterruptedException {
		login.loginValiduser("qachamps3", "Ninjatest@123");
		login.validaterrormessage("You are logged in");
		ip.ValidateLoginSuccessFull();
	}
	
}
