package PageObjects;

import org.openqa.selenium.By;
import org.testng.*;

import BaseTest.BaseTest;

public class HomePage extends BaseTest{ 

	By getStartedButton = By.cssSelector("button.btn");
	By contentHeader = By.cssSelector(".content h1");
	By contentText =By.cssSelector("div.content p");
	
	public void openUrl() {
		getDriver().get("https://dsportalapp.herokuapp.com/");
	}

	public void validateHomePageHeader(String headerText) {
		Assert.assertEquals(getDriver().findElement(contentHeader).getText(), headerText); 
	}

	public void validateHomePageText(String textValue) {
		Assert.assertEquals(getDriver().findElement(contentText).getText(), textValue); 
	}

	public void clickOnHomePageGetStartedButton() {
		getDriver().findElement(getStartedButton).click();
	}

	public void validateHomePageGetStratedButton() {
		Assert.assertEquals(getDriver().findElement(getStartedButton).getText(), "Get Started"); 
		Assert.assertEquals(getDriver().findElement(getStartedButton).getCssValue("background-color"), "rgba(0, 0, 255, 1)");
		Assert.assertEquals(getDriver().findElement(getStartedButton).getCssValue("color"),"rgba(238, 238, 238, 1)");
		Assert.assertEquals(getDriver().findElement(getStartedButton).getCssValue("font-size"),"18px");
		Assert.assertEquals(getDriver().findElement(getStartedButton).getSize().height,51);
		Assert.assertEquals(getDriver().findElement(getStartedButton).getSize().width,122);

	}

}

