package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import PageObjects.ArrayPage;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;

public class HomePageTests extends BaseTest{

	public HomePage hp = new HomePage();
	public ArrayPage ap = new ArrayPage();
	public IntroductionPage ip =  new IntroductionPage();

	@BeforeMethod(alwaysRun = true)
	public void loginIntoApp() {
		hp.openUrl();
	}

	@AfterMethod(alwaysRun =  true) 
	public void clearCookies(){
		hp.deleteAllCookies();		
	}
	@Test
	public void Validate_user_lands_on_default_home_page () {
		hp.validateHomePageHeader("Preparing for the Interviews");
		hp.validateHomePageText("You are at the right place");
		hp.validateHomePageGetStratedButton();
	}

	@Test
	public void Validate_user_navigate_to_DS_Intro_Page () {
		hp.clickOnHomePageGetStartedButton();
		ip.validateUserIsOnIntroductionPage();
	}
	
	@Test
	public void validate_the_DS_dropdown_without_signIN () {
		hp.clickOnHomePageGetStartedButton();
		ip.clickOnDataStructureDropdown();
		ip.validateListInDataStructureDropDownMenu();
	}

	@Test
	public void verify_warning_message_when_user_navigate_to_DS_details_page_without_signIn () {
		hp.clickOnHomePageGetStartedButton();	
		ip.clickOnDSIntroductionhomepage();
		ip.validateWarningMessageWhenNotLoggedIn();
	}

	@Test
	public void validate_user_lands_on_register_page_when_clicked_on_register () {
		hp.clickOnHomePageGetStartedButton();	
		ip.clickOnRegisterlink();
		ip.validateUserNavigatedToRegisterPage();
	}
}