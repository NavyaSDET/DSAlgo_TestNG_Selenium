package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import StepDefinitions.Hooks;

public class LoginPage {
	WebDriver driver=Hooks.getDriver();

	By txt_username = By.id("id_username");
	By txt_password = By.id("id_password");
	By btn_login =   By.xpath("//input[@value='Login']");
	By warningMessage = By.cssSelector(".alert.alert-primary");
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
		
	}
	
    public void enterPassword(String password) {
    	driver.findElement(txt_password).sendKeys(password);
    }
    
    public void clicklogin() {
    	driver.findElement(btn_login).click();
    }
    
    public void loginValiduser(String username, String password) throws InterruptedException {
    	driver.findElement(txt_username).sendKeys(username);
    	driver.findElement(txt_password).sendKeys(password);
    	driver.findElement(btn_login).click();
    }
    
    public void validateAlertMessage(String expectedAlertMessage) throws InterruptedException {
    	WebElement activeElement = driver.switchTo().activeElement();
    	String messageStr = activeElement.getAttribute("validationMessage");
    	Assert.assertEquals(messageStr, expectedAlertMessage);
    	System.out.println("Actual message appeared on screen: " + messageStr);
    }
    
    public void validaterrormessage(String expectedWarningMessage) {
    	Assert.assertEquals(driver.findElement(warningMessage).getText(),expectedWarningMessage);    	
    }
    
}
