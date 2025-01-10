package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DriverManager.DriverManager;

public class HomePage { 
	public WebDriver driver = DriverManager.getDriver();

	public By getStartedButton = By.cssSelector("button.btn");
	public By contentHeader = By.cssSelector(".content h1");
	public By contentText =By.cssSelector("div.content p");
	
	public void openUrl() {
		driver.get("https://dsportalapp.herokuapp.com/");
	}

	public void clickOnHomePageGetStartedButton() {
		driver.findElement(getStartedButton).click();
	}

}

