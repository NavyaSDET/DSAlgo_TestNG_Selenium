package PageObjects;

import DriverManager.DriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IntroductionPage {

	public WebDriver driver = DriverManager.getDriver();

	public By NumpyNinja =  By.cssSelector("a[href='/home']");
	public By Datastructure = By.cssSelector("a.dropdown-toggle");
	public By DsDropdown = By.cssSelector("a.dropdown-item");

	public By cardBody = By.cssSelector("div.card-body");
	public By cardTitle = By.cssSelector("h5.card-title");
	public By cardText = By.cssSelector("p.card-text");
	public By getStartedButtonOnCard = By.cssSelector("a.btn-primary");
	public By signInButton=By.cssSelector("a[href='/login']");
	public By registerButton=By.cssSelector("a[href='/register']");
	public By warningMessage = By.cssSelector(".alert.alert-primary");
	public By userNameInputfield=By.cssSelector("input[name='username']");
	public By passWordNameInputField=By.cssSelector("input[name='password']");
	public By loginButton=By.cssSelector("input[type='submit']");
	public By displayQaChamps=By.cssSelector(".navbar-nav ul a:nth-child(2)");
	public By dataStructurePageHeader=By.cssSelector("h4.bg-secondary");
	public By dispalyTimeComplexity=By.cssSelector("a[href='time-complexity']");
	public By timeComplexityPage=By.cssSelector("strong .bg-secondary.text-white");
	public By tryHereButton=By.cssSelector("a[href='/tryEditor']");
	public By codeEditorPage=By.cssSelector("pre.codeMirror-line");
	public By codeInputField = By.cssSelector(".CodeMirror textarea");
	public By consoleOutput = By.cssSelector("#output");
	public By runButton=By.cssSelector("button[type='button']");   
	public By arrayGetStartedBtn= By.cssSelector("a[href='array']");
	public By queueGetStartedBtn= By.cssSelector("a[href='queue']");
	public By stackGetStartedBtn= By.cssSelector("a[href='stack']");
	public By graphGetStartedBtn= By.cssSelector("a[href='graph']");

	public void clickOnDataStructureDropdown() {
		driver.findElement(Datastructure).click();
	}

	public void clickOnDSIntroductionhomepage() {
		driver.findElements(getStartedButtonOnCard).get(0).click();
	}

	public void clickOnRegisterlink() {
		driver.findElement(registerButton).click();	
	}
	
	public void clickOnSignInlink() {
		driver.findElement(signInButton).click();	
	}

	public void completeTheLogin() {
		driver.findElement(signInButton).click();
		driver.findElement(userNameInputfield).sendKeys("qachamps3");
		driver.findElement(passWordNameInputField).sendKeys("Ninjatest@123");	
		driver.findElement(loginButton).click();
	}

	public void clickOnGetStartedButtonOfDSIntroduction() {
		driver.findElements(getStartedButtonOnCard).get(0).click();			
	}

	public void clickOnTimeComplexiButton() {
		driver.findElement(dispalyTimeComplexity).click();
	}

	public void clickOnTryHerebutton () {
		driver.findElement(tryHereButton).click();	  
	}

	public void enterCodeInEditor(String codeText  )  {
		driver.findElement(codeInputField).sendKeys(codeText);
	}

	public void clickOnRunButton() {
		driver.findElement(runButton).click();  
	}

	public String getMessageOnAlert() {
		Alert alert= driver.switchTo().alert();
		String alertText=alert.getText();
		return alertText;
	}

	public void acceptAlert() {
		Alert alert= driver.switchTo().alert();
		alert.accept();
	}

	public void clickOnGetStartedButtonOfArray() {
		driver.findElement(arrayGetStartedBtn).click();			
	}

	public void clickOnGetStartedButtonOfQueue() {
		driver.findElement(queueGetStartedBtn).click();			
	}

	public void clickOnGetStartedButtonOfStack() {
		driver.findElement(stackGetStartedBtn).click();			
	}
	
	public void clickOnGetStartedButtonOfGraph() {
		driver.findElement(graphGetStartedBtn).click();			
	}
	
	public String getTextForElement(By locator) {
		String elementText = driver.findElement(locator).getText();
		return elementText;
	}

	public String getCurrentUrl() {
		String elementText = driver.getCurrentUrl();
		return elementText;
	}

	public String getPageTitle() {
		String elementText = driver.getTitle();
		return elementText;
	}
	public Boolean validateElementDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}

	public Integer getElementSize(By locator) {
		Integer elementCount = driver.findElements(locator).size();
		return elementCount;
	}

	public String getTextForArrayElements(By locator, Integer posInteger) {
		String elementText = driver.findElements(locator).get(posInteger).getText();
		return elementText;
	}

	public String getAlertText(){
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();

		return alertText;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public String switchToElementAndGetValidationMessage() {
		WebElement activeElement = driver.switchTo().activeElement();
		String msgBrowserValidation = activeElement.getAttribute("validationMessage");
		return msgBrowserValidation;
	}

	public String getValidationMessage() throws InterruptedException {
    	WebElement activeElement = driver.switchTo().activeElement();
    	String messageStr = activeElement.getAttribute("validationMessage");
		return messageStr;
    }
    
}