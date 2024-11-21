package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import StepDefinitions.Hooks;


public class HomePage { 
	WebDriver driver=Hooks.getDriver();

	By getStartedButton = By.cssSelector("button.btn");
	By contentHeader = By.cssSelector(".content h1");
	By contentText =By.cssSelector("div.content p");
	
	public void openUrl() {
		driver.get("https://dsportalapp.herokuapp.com/");
	}


	public void validateHomePageHeader(String headerText) {
		Assert.assertEquals(driver.findElement(contentHeader).getText(), headerText);
	}

	public void validateHomePageText(String textValue) {
		Assert.assertEquals(driver.findElement(contentText).getText(), textValue);
	}

	public void clickOnHomePageGetStartedButton() {
		driver.findElement(getStartedButton).click();
	}

	public void validateHomePageGetStratedButton() {
		Assert.assertEquals(driver.findElement(getStartedButton).getText(), "Get Started");
		Assert.assertEquals(driver.findElement(getStartedButton).getCssValue("background-color"), "rgba(0, 0, 255, 1)");
		Assert.assertEquals(driver.findElement(getStartedButton).getCssValue("color"),"rgba(238, 238, 238, 1)");
		Assert.assertEquals(driver.findElement(getStartedButton).getCssValue("font-size"),"18px");
		Assert.assertEquals(driver.findElement(getStartedButton).getSize().height,51);
		Assert.assertEquals(driver.findElement(getStartedButton).getSize().width,122);

	}

}

