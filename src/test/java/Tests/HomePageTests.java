package Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Utilities.RetryAnalyzer;
import BaseTest.BaseTest;
import PageObjects.ArrayPage;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;

public class HomePageTests extends BaseTest{

	public HomePage hp;
	public ArrayPage ap;
	public IntroductionPage ip;

	@BeforeMethod(alwaysRun = true)
	public void loginIntoApp() {
		hp = new HomePage();
		ap = new ArrayPage();
		ip =  new IntroductionPage();
		hp.openUrl();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_lands_on_default_home_page () {
		hp.validateHomePageHeader("Preparing for the Interviews");
		hp.validateHomePageText("You are at the right place");
		hp.validateHomePageGetStratedButton();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_navigate_to_DS_Intro_Page () {
		hp.clickOnHomePageGetStartedButton();
		ip.validateUserIsOnIntroductionPage();
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_the_DS_dropdown_without_signIN () {
		hp.clickOnHomePageGetStartedButton();
		ip.clickOnDataStructureDropdown();
		ip.validateListInDataStructureDropDownMenu();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verify_warning_message_when_user_navigate_to_DS_details_page_without_signIn () {
		hp.clickOnHomePageGetStartedButton();	
		ip.clickOnDSIntroductionhomepage();
		ip.validateWarningMessageWhenNotLoggedIn();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_user_lands_on_register_page_when_clicked_on_register () {
		hp.clickOnHomePageGetStartedButton();	
		ip.clickOnRegisterlink();
		ip.validateUserNavigatedToRegisterPage();
	}
}