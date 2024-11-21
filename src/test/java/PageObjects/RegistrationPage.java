package pageObjects;

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
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class RegistrationPage {


	public WebDriver driver;

	//1. Constructor -- a method in the class having same name as class --encapsulation concept
	public RegistrationPage(WebDriver rdriver) {

		this.driver = rdriver;
	}


	/*		public RegistrationPage()
			{
				this.driver=driver;
				if(!driver.getTitle().equals("Registration"))
			      throw new IllegalStateException("THIS IS NOT REGISTRATION PAGE. THE CURRENT PAGE IS :"+driver.getCurrentUrl());
			}   */

	String actualErrorMsgText1;
	String InvalidUser_errorMsg;

	ExcelReader excelReader = new ExcelReader();

	//2. Web Elements locators using By class
	private By GetStartedButton = By.className("btn");
	private By RegisterButton_GetStartedPage = By.xpath("//div[2]/ul/a[2]"); //Register button from Get Started page
	private By RegisterButton_RegPage = By.xpath("//input[@value='Register']"); //Register button from Registration page
	private By UsernameTextbox = By.xpath("//div[@class='col-sm']/form/input[2][@name='username']");
	private By PasswordTextbox = By.xpath("//div[@class='col-sm']/form/input[3][@name='password1']");
	private By ConfirmPasswordTextbox = By.xpath("//div[@class='col-sm']/form/input[4][@name='password2']");
	private By LoginBtn = By.xpath("//div[2]/a[@href='/login']");
	private By SignInBtn = By.xpath("//div[@class='navbar-nav']/ul/a[@href='/login']");
	private By Error_PswdDoNotMatch = By.xpath("//div[@class='alert alert-primary']");//pswds do not match
	private By RegisterSuccessMsg = By.xpath("//div[@class='alert alert-primary']");
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

	public void compareActualAndExpectedBrowserErrorMsg()   //'Please fill out this field' error message
	{
		WebElement activeElement = driver.switchTo().activeElement();  //'Please fill out this field' error message
		String msgBrowserValidation = activeElement.getAttribute("validationMessage");
		String expectedErrorMsg = "Please fill out this field.";
		Assert.assertEquals(msgBrowserValidation, expectedErrorMsg);
	}

	public void checkRegistrationPageURL()
	{

		 Assert.assertEquals(driver.getTitle(),"NumpyNinja");
	}

	public void assertLoginPage()
	{
		 Assert.assertEquals(driver.getTitle(),"Login");
	}

	public void Land_On_RegistrationPage()
	{
		this.openDSAlgoURL();
		this.clickGetStartedBtn();
		this.clickRegisterBtn_GetStartedPage();

	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////   Enter INVALID Credentials methods
/*	public void enterUsername_hardcoded(String usrname)
{
driver.findElement(UsernameTextbox).sendKeys(usrname);
}

public void enterPassword_hardcoded(String pswd)
{
driver.findElement(PasswordTextbox).sendKeys(pswd);
}

public void enterConfirmPassword(String confirmPswd)
{
driver.findElement(ConfirmPasswordTextbox).sendKeys(confirmPswd);
}

public void enterUsernameAndPswdAndConfirmPswdAndClickRegisterBtn(String username, String password, String confirm_password)
{
this.enterUsername_hardcoded(username);
this.enterPassword_hardcoded(password);
this.enterConfirmPassword(confirm_password);
this.clickRegisterBtn_RegisterPage();

} */

///////////////////////////  ERROR MAPPING IN TestData.XLSX	///////////////////

/*	public void validateErrorMsgRegistration(String errorMessage) {
String actualMsg = text_errorMsg.getText();

Assert.assertEquals(actualMsg,errorMessage);
System.out.println("Error Displayed!");
}

public void validateToolTipErrorMsgRegistration(String errorMessage) {

WebElement activeElement = driver.switchTo().activeElement();
String messageStr = activeElement.getAttribute("validationMessage");
//LoggerLoad.info("Actual message appeared on screen: " + messageStr);
Assert.assertEquals(messageStr,errorMessage);
}


public void validateToolTipErrorMsgExcel(String sheetname, int row) throws InvalidFormatException, IOException, Exception {

ExcelReader reader = new ExcelReader();

List<Map<String, String>> testdata = reader.getData("./src/test/resources/ExcelTestData/LoginData.xlsx", sheetname);

String expectedMessage = testdata.get(row).get("message");
validateToolTipErrorMsgRegistration(expectedMessage);
}

public void validateErrorMsgFromExcel(String sheetname, int row) throws InvalidFormatException, IOException, Exception {
ExcelReader reader = new ExcelReader();

List<Map<String, String>> testdata = reader.getData("./src/test/resources/ExcelTestData/LoginData.xlsx", sheetname);

String expectedMessage = testdata.get(row).get("message");
validateErrorMsgRegistration(expectedMessage);

}*/
}
