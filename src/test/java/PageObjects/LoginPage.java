package PageObjects;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import DriverManager.DriverManager;
import Utilities.ExcelReader;

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

	public void loginValiduser(String sheetName, int rowNumber) throws InterruptedException, InvalidFormatException, IOException, OpenXML4JException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetName);
		String username = testdata.get(rowNumber).get("username");
		String password = testdata.get(rowNumber).get("password");
		driver.findElement(txt_username).sendKeys(username);
		if(password != null) {
			driver.findElement(txt_password).sendKeys(password);
		}
		driver.findElement(btn_login).click();
	}

}
