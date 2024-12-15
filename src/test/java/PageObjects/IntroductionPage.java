package PageObjects;

import org.testng.Assert;
import BaseTest.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class IntroductionPage extends BaseTest {

	By NumpyNinja = By.cssSelector("a[href='/home']");
	By Datastructure = By.cssSelector("a.dropdown-toggle");
	By DsDropdown = By.cssSelector("a.dropdown-item");

	By cardBody = By.cssSelector("div.card-body");
	By cardTitle = By.cssSelector("h5.card-title");
	By cardText = By.cssSelector("p.card-text");
	By getStartedButtonOnCard = By.cssSelector("a.btn-primary");
	By signInButton = By.cssSelector("a[href='/login']");
	By registerButton = By.cssSelector("a[href='/register']");
	By warningMessage = By.cssSelector(".alert.alert-primary");
	By userNameInputfield = By.cssSelector("input[name='username']");
	By passWordNameInputField = By.cssSelector("input[name='password']");
	By loginButton = By.cssSelector("input[type='submit']");
	By displayQaChamps = By.cssSelector(".navbar-nav ul a:nth-child(2)");
	By dataStructurePageHeader = By.cssSelector("h4.bg-secondary");
	By dispalyTimeComplexity = By.cssSelector("a[href='time-complexity']");
	By timeComplexityPage = By.cssSelector("strong .bg-secondary.text-white");
	By tryHereButton = By.cssSelector("a[href='/tryEditor']");
	By codeEditorPage = By.cssSelector("pre.codeMirror-line");
	By codeInputField = By.cssSelector(".CodeMirror textarea");
	By consoleOutput = By.cssSelector("#output");
	By runButton = By.cssSelector("button[type='button']");
	By arrayGetStartedBtn = By.cssSelector("a[href='array']");
	By queueGetStartedBtn = By.cssSelector("a[href='queue']");
	By stackGetStartedBtn = By.cssSelector("a[href='stack']");
	By graphGetStartedBtn = By.cssSelector("a[href='graph']");

	public void validateUserIsOnIntroductionPage() {
		Assert.assertEquals(getDriver().findElement(NumpyNinja).getText(), "NumpyNinja");
		Assert.assertTrue(getDriver().findElement(cardBody).isDisplayed());
		Assert.assertTrue(getDriver().findElement(signInButton).isDisplayed());
		Assert.assertTrue(getDriver().findElement(registerButton).isDisplayed());
	}

	public void clickOnDataStructureDropdown() {
		getDriver().findElement(Datastructure).click();
		Assert.assertTrue(getDriver().findElement(DsDropdown).isDisplayed());
	}

	public void validateListInDataStructureDropDownMenu() {
		Assert.assertEquals(getDriver().findElements(DsDropdown).size(), 6);
		Assert.assertEquals(getDriver().findElements(DsDropdown).get(0).getText(), "Arrays");
		Assert.assertEquals(getDriver().findElements(DsDropdown).get(1).getText(), "Linked List");
		Assert.assertEquals(getDriver().findElements(DsDropdown).get(2).getText(), "Stack");
		Assert.assertEquals(getDriver().findElements(DsDropdown).get(3).getText(), "Queue");
		Assert.assertEquals(getDriver().findElements(DsDropdown).get(4).getText(), "Tree");
		Assert.assertEquals(getDriver().findElements(DsDropdown).get(5).getText(), "Graph");
	}

	public void clickOnDSIntroductionhomepage() {
		getDriver().findElements(getStartedButtonOnCard).get(0).click();
	}

	public void validateWarningMessageWhenNotLoggedIn() {
		Assert.assertTrue(getDriver().findElement(warningMessage).isDisplayed());
		Assert.assertEquals(getDriver().findElement(warningMessage).getText(), "You are not logged in");
		Assert.assertEquals(getDriver().findElements(warningMessage).size(), 1);
	}

	public void clickOnRegisterlink() {
		getDriver().findElement(registerButton).click();
	}

	public void clickOnSignInlink() {
		getDriver().findElement(signInButton).click();
	}

	public void validateUserNavigatedToRegisterPage() {
		Assert.assertEquals(getDriver().getCurrentUrl(), "https://dsportalapp.herokuapp.com/register");
	}

	public void completeTheLOgin() {
		getDriver().findElement(signInButton).click();
		getDriver().findElement(userNameInputfield).sendKeys("qachamps3");
		getDriver().findElement(passWordNameInputField).sendKeys("Ninjatest@123");
		getDriver().findElement(loginButton).click();
		Assert.assertTrue(getDriver().findElement(displayQaChamps).isDisplayed());
	}

	public void clickOnGetStartedButtonOfDSIntroduction() {
		getDriver().findElements(getStartedButtonOnCard).get(0).click();
	}

	public void ValidateLoginSuccessFull() {
		Assert.assertTrue(getDriver().findElement(displayQaChamps).isDisplayed());
	}

	public void validateUserisOnDSIntroduction() {
		Assert.assertTrue(getDriver().findElement(dataStructurePageHeader).isDisplayed());
		Assert.assertEquals(getDriver().findElement(dataStructurePageHeader).getText(), "Data Structures-Introduction");

		Assert.assertEquals(getDriver().getCurrentUrl(),
				"https://dsportalapp.herokuapp.com/data-structures-introduction/");
	}

	public void validateTimeComplexiButtonDisplayed() {
		Assert.assertTrue(getDriver().findElement(dispalyTimeComplexity).isDisplayed());
	}

	public void clickOnTimeComplexiButton() {
		getDriver().findElement(dispalyTimeComplexity).click();
	}

	public void validateTimeComplexitypage() {
		Assert.assertTrue(getDriver().findElement(timeComplexityPage).isDisplayed());
		Assert.assertEquals(getDriver().findElement(timeComplexityPage).getText(), "Time Complexity");
	}

	public void clickOnTryHerebutton() {
		getDriver().findElement(tryHereButton).click();

	}

	public void codeTryEditorPage() {
		Assert.assertTrue(getDriver().findElement(codeEditorPage).isDisplayed());
		Assert.assertTrue(getDriver().findElement(runButton).isDisplayed());
	}

	public void enterCodeInEditor(String codeText) {
		getDriver().findElement(codeInputField).sendKeys(codeText);
	}

	public void clickOnRunButton() {
		getDriver().findElement(runButton).click();
	}

	public void validateErrorMessageDisplayedOnAlert(String expectedErrorHeader, String expectedErrorMessage) {
		Alert alert = getDriver().switchTo().alert();
		String alertText = alert.getText();
		Assert.assertEquals(alertText, expectedErrorMessage);
		alert.accept();
	}

	public void clickOnGetStartedButtonOfArray() {
		getDriver().findElement(arrayGetStartedBtn).click();
	}

	public void clickOnGetStartedButtonOfQueue() {
		getDriver().findElement(queueGetStartedBtn).click();
	}

	public void clickOnGetStartedButtonOfStack() {
		getDriver().findElement(stackGetStartedBtn).click();
	}

	public void clickOnGetStartedButtonOfGraph() {
		getDriver().findElement(graphGetStartedBtn).click();
	}

	public void validateConsoleOutput(String expectedOuputText) {
		Assert.assertEquals(getDriver().findElement(consoleOutput).getText(), expectedOuputText);
	}

	public void validateNoConsoleOuput() {
		Assert.assertFalse(getDriver().findElement(consoleOutput).isDisplayed());
	}
}