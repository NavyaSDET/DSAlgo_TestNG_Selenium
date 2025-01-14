package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DriverManager.DriverManager;

public class LoginPage {
	public WebDriver driver = DriverManager.getDriver();

	public By txt_username = By.id("id_username");
	public By txt_password = By.id("id_password");
	public By btn_login =   By.xpath("//input[@value='Login']");
	public By warningMessage = By.cssSelector(".alert.alert-primary");

	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);

	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	public void clicklogin() {
		driver.findElement(btn_login).click();
	}

	public void loginValiduser(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		if(password != null) {
			driver.findElement(txt_password).sendKeys(password);
		}
		driver.findElement(btn_login).click();
	}

}
