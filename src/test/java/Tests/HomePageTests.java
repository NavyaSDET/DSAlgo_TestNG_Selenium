package Tests;

import org.testng.Assert;
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
		Assert.assertEquals(ip.getTextForElement(hp.contentHeader),"Preparing for the Interviews");
		Assert.assertEquals(ip.getTextForElement(hp.contentText),"You are at the right place");
		Assert.assertEquals(ip.getTextForElement(hp.getStartedButton), "Get Started"); 
		Assert.assertEquals(ip.getElement(hp.getStartedButton).getCssValue("background-color"), "rgba(0, 0, 255, 1)");
		Assert.assertEquals(ip.getElement(hp.getStartedButton).getCssValue("color"),"rgba(238, 238, 238, 1)");
		Assert.assertEquals(ip.getElement(hp.getStartedButton).getCssValue("font-size"),"18px");
		Assert.assertEquals(ip.getElement(hp.getStartedButton).getSize().height,51);
		Assert.assertEquals(ip.getElement(hp.getStartedButton).getSize().width,122);	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_navigate_to_DS_Intro_Page () {
		hp.clickOnHomePageGetStartedButton();
		Assert.assertEquals(ip.getTextForElement(ip.NumpyNinja), "NumpyNinja"); 
		Assert.assertTrue(ip.validateElementDisplayed(ip.cardBody));
		Assert.assertTrue(ip.validateElementDisplayed(ip.signInButton));
		Assert.assertTrue(ip.validateElementDisplayed(ip.registerButton));
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_the_DS_dropdown_without_signIN () {
		hp.clickOnHomePageGetStartedButton();
		ip.clickOnDataStructureDropdown();
		Assert.assertTrue(ip.validateElementDisplayed(ip.DsDropdown));
		Assert.assertEquals(ip.getElementSize(ip.DsDropdown), 6);
		Assert.assertEquals(ip.getTextForArrayElements(ip.DsDropdown, 0), "Arrays");
		Assert.assertEquals(ip.getTextForArrayElements(ip.DsDropdown, 1), "Linked List");
		Assert.assertEquals(ip.getTextForArrayElements(ip.DsDropdown, 2), "Stack");
		Assert.assertEquals(ip.getTextForArrayElements(ip.DsDropdown, 3), "Queue");
		Assert.assertEquals(ip.getTextForArrayElements(ip.DsDropdown, 4), "Tree");
		Assert.assertEquals(ip.getTextForArrayElements(ip.DsDropdown, 5), "Graph");	
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verify_warning_message_when_user_navigate_to_DS_details_page_without_signIn () {
		hp.clickOnHomePageGetStartedButton();	
		ip.clickOnDSIntroductionhomepage();
		Assert.assertTrue(ip.validateElementDisplayed(ip.warningMessage));
		Assert.assertEquals(ip.getTextForElement(ip.warningMessage), "You are not logged in");
		Assert.assertEquals(ip.getElementSize(ip.warningMessage), 1);	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_user_lands_on_register_page_when_clicked_on_register () {
		hp.clickOnHomePageGetStartedButton();	
		ip.clickOnRegisterlink();
		Assert.assertEquals(ip.getCurrentUrl(), "https://dsportalapp.herokuapp.com/register");
	}
}