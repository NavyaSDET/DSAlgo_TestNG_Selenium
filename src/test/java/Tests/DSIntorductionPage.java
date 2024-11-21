package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import PageObjects.ArrayPage;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;

public class DSIntorductionPage extends BaseTest{
	public HomePage hp = new HomePage();
	public ArrayPage ap = new ArrayPage();
	public IntroductionPage ip =  new IntroductionPage();

	@BeforeMethod(alwaysRun = true)
	public void loginIntoApp() {
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.completeTheLOgin();
		ip.clickOnGetStartedButtonOfDSIntroduction();
	}

	@AfterMethod(alwaysRun =  true) 
	public void clearCookies(){
		hp.deleteAllCookies();		
	}

	@Test
	public void clicking_on_get_started_for_data_structers_lands_on_Data_Structers_details_page() {
		ip.validateUserisOnDSIntroduction();
		ip.validateTimeComplexiButtonDisplayed();
	}

	@Test
	public void clicking_on_time_complexity_navigate_to_the_page() {

		ip.clickOnTimeComplexiButton();
		ip.validateTimeComplexitypage();
	}

	@Test
	public void Clicking_on_Try_Here_on_time_complexity_opens_python_editor() {
		ip.clickOnTimeComplexiButton();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test
	public void Error_message_displayed_for_invalid_code_on_try_editor_for_Time_Complexity () {
		ip.clickOnTimeComplexiButton();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says", "NameError: name 'ABC' is not defined on line 1");
	}

	@Test
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_Time_Complexity () {
		ip.clickOnTimeComplexiButton();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test
	public void Valid_code_on_try_editor_for_Time_Complexity_runs_successfully () {
		ip.clickOnTimeComplexiButton();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}


}
