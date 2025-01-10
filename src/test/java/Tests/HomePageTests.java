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
		Assert.assertEquals(driver.findElement(hp.contentHeader).getText(),"Preparing for the Interviews");
		Assert.assertEquals(driver.findElement(hp.contentText).getText(),"You are at the right place");
		Assert.assertEquals(driver.findElement(hp.getStartedButton).getText(), "Get Started"); 
		Assert.assertEquals(driver.findElement(hp.getStartedButton).getCssValue("background-color"), "rgba(0, 0, 255, 1)");
		Assert.assertEquals(driver.findElement(hp.getStartedButton).getCssValue("color"),"rgba(238, 238, 238, 1)");
		Assert.assertEquals(driver.findElement(hp.getStartedButton).getCssValue("font-size"),"18px");
		Assert.assertEquals(driver.findElement(hp.getStartedButton).getSize().height,51);
		Assert.assertEquals(driver.findElement(hp.getStartedButton).getSize().width,122);	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_navigate_to_DS_Intro_Page () {
		hp.clickOnHomePageGetStartedButton();
		Assert.assertEquals(driver.findElement(ip.NumpyNinja).getText(), "NumpyNinja"); 
		Assert.assertTrue(driver.findElement(ip.cardBody).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.signInButton).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.registerButton).isDisplayed());
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_the_DS_dropdown_without_signIN () {
		hp.clickOnHomePageGetStartedButton();
		ip.clickOnDataStructureDropdown();
		Assert.assertTrue(driver.findElement(ip.DsDropdown).isDisplayed());
		Assert.assertEquals(driver.findElements(ip.DsDropdown).size(), 6);
		Assert.assertEquals(driver.findElements(ip.DsDropdown).get(0).getText(), "Arrays");
		Assert.assertEquals(driver.findElements(ip.DsDropdown).get(1).getText(), "Linked List");
		Assert.assertEquals(driver.findElements(ip.DsDropdown).get(2).getText(), "Stack");
		Assert.assertEquals(driver.findElements(ip.DsDropdown).get(3).getText(), "Queue");
		Assert.assertEquals(driver.findElements(ip.DsDropdown).get(4).getText(), "Tree");
		Assert.assertEquals(driver.findElements(ip.DsDropdown).get(5).getText(), "Graph");	
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verify_warning_message_when_user_navigate_to_DS_details_page_without_signIn () {
		hp.clickOnHomePageGetStartedButton();	
		ip.clickOnDSIntroductionhomepage();
		Assert.assertTrue(driver.findElement(ip.warningMessage).isDisplayed());
		Assert.assertEquals(driver.findElement(ip.warningMessage).getText(), "You are not logged in");
		Assert.assertEquals(driver.findElements(ip.warningMessage).size(), 1);	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_user_lands_on_register_page_when_clicked_on_register () {
		hp.clickOnHomePageGetStartedButton();	
		ip.clickOnRegisterlink();
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/register");
	}
}