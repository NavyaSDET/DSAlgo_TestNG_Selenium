package PageObjects;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Utilities.ExcelReader;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import DriverManager.DriverManager;

public class RegistrationPage {
	public WebDriver driver = DriverManager.getDriver();

	String actualErrorMsgText1;
	String InvalidUser_errorMsg;

	ExcelReader excelReader = new ExcelReader();

	//2. Web Elements locators using By class
	public By GetStartedButton = By.className("btn");
	public By RegisterButton_GetStartedPage = By.xpath("//div[2]/ul/a[2]"); //Register button from Get Started page
	public By RegisterButton_RegPage = By.xpath("//input[@value='Register']"); //Register button from Registration page
	public By UsernameTextbox = By.xpath("//div[@class='col-sm']/form/input[2][@name='username']");
	public By PasswordTextbox = By.xpath("//div[@class='col-sm']/form/input[3][@name='password1']");
	public By ConfirmPasswordTextbox = By.xpath("//div[@class='col-sm']/form/input[4][@name='password2']");
	public By LoginBtn = By.xpath("//div[2]/a[@href='/login']");
	public By SignInBtn = By.xpath("//div[@class='navbar-nav']/ul/a[@href='/login']");
	public By Error_PswdDoNotMatch = By.xpath("//div[@class='alert alert-primary']");//pswds do not match
	public By RegisterSuccessMsg = By.xpath("//div[@class='alert alert-primary']");
	@FindBy(xpath ="//div[@class='alert alert-primary']" )
	WebElement text_errorMsg;


	//3. Actions made on Web Elements
	public void openDSAlgoURL()
	{
       // System.setProperty("webdriver.chrome.driver", "/Users/rakes/eclipse-workspace/Hello-Selenium/src/test/resources/driver/chromedriver-win64/chromedriver.exe");
       // driver = new ChromeDriver();
       // driver.manage().window().maximize();
	  // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://dsportalapp.herokuapp.com/");
	}

	public void clickGetStartedBtn()
	{
		driver.findElement(GetStartedButton).click();
	}

	public void clickRegisterBtn_GetStartedPage()
	{
		driver.findElement(RegisterButton_GetStartedPage).click();
	}

	public void clickRegisterBtn_RegisterPage()
	{
		driver.findElement(RegisterButton_RegPage).click();
	}


	/////////////////////////////////////////////////////////////   Fill up Registration Form fields
	public void enterUsername(String username) throws IOException
	{

		driver.findElement(UsernameTextbox).sendKeys(username);

	}

	public void enterPassword(String password)
	{

		driver.findElement(PasswordTextbox).sendKeys(password);
	}

	public void enterPasswordConfirmation(String confirmPswd)
	{

		driver.findElement(ConfirmPasswordTextbox).sendKeys(confirmPswd);
	}

	public void fillRegistrationForm(String sheetname, int row) throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetname);


			String username = testdata.get(row).get("username");
			enterUsername(username);


			String password = testdata.get(row).get("password");
			enterPassword(password);


			String passwordConfirm = testdata.get(row).get("password confirmation");
			enterPasswordConfirmation(passwordConfirm);


	}
	///////////////////////  FILL UP LOGIN FORM DETAILS

	public void fillLoginFormDataDriven(String sheetname, int row) throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetname);


			String username = testdata.get(row).get("username");
			enterUsername(username);


			String password = testdata.get(row).get("password");
			enterPassword(password);

	}


	////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void clickSignInBtn()
	{
		driver.findElement(SignInBtn).click();
	}

	public void clickLoginBtn()
	{
		driver.findElement(LoginBtn).click();
	}


	public String showErrorMsg_PswdDoNotMatch()
	{
		return driver.findElement(Error_PswdDoNotMatch).getText();

	}

	public boolean checkIfRegisterSuccessMsgIsDisplayed()
	{
		 return driver.findElement(RegisterSuccessMsg).isDisplayed();


	}

	public String successMsg()
	{
		return driver.findElement(RegisterSuccessMsg).getText();
	}

	public String activeElementBrowserValidation()   // Capture error - Please fill out this field
	{
		return driver.findElement(UsernameTextbox).getAttribute("validationMessage");
	}

	public void Land_On_RegistrationPage()
	{
		this.openDSAlgoURL();
		this.clickGetStartedBtn();
		this.clickRegisterBtn_GetStartedPage();

	}

}
