package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import BaseTest.BaseTest;

public class LoginPage extends BaseTest{

	By txt_username = By.id("id_username");
	By txt_password = By.id("id_password");
	By btn_login =   By.xpath("//input[@value='Login']");
	By warningMessage = By.cssSelector(".alert.alert-primary");
	
	public void enterUsername(String username) {
		getDriver().findElement(txt_username).sendKeys(username);
		
	}
	
    public void enterPassword(String password) {
    	getDriver().findElement(txt_password).sendKeys(password);
    }
    
    public void clicklogin() {
    	getDriver().findElement(btn_login).click();
    }
    
    public void loginValiduser(String username, String password) throws InterruptedException {
    	getDriver().findElement(txt_username).sendKeys(username);
    	getDriver().findElement(txt_password).sendKeys(password);
    	getDriver().findElement(btn_login).click();
    }
    
    public void validateAlertMessage(String expectedAlertMessage) throws InterruptedException {
    	WebElement activeElement = getDriver().switchTo().activeElement();
    	String messageStr = activeElement.getAttribute("validationMessage");
    	Assert.assertEquals(messageStr, expectedAlertMessage);
    	System.out.println("Actual message appeared on screen: " + messageStr);
    }
    
    public void validaterrormessage(String expectedWarningMessage) {
    	Assert.assertEquals(getDriver().findElement(warningMessage).getText(),expectedWarningMessage);    	
    }
    
}
