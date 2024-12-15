package PageObjects;

import org.testng.Assert;

import BaseTest.BaseTest;

import org.openqa.selenium.By;

public class StackPage extends BaseTest {

	By StackDetail = By.cssSelector("h4.bg-secondary");
	By topicsCovered = By.cssSelector("p.bg-secondary");
	By TopicsCoveredOptions = By.cssSelector("a.list-group-item");

	By operationsInStackLink = By.cssSelector("a[href='operations-in-stack']");
	By operationsInStackText = By.cssSelector("strong .bg-secondary");

	By implementaionLink = By.cssSelector("a[href='implementation']");
	By implementaionText = By.cssSelector("strong .bg-secondary");

	By ApplicationsLink = By.cssSelector("a[href='stack-applications']");
	By ApplicationsText = By.cssSelector("strong .bg-secondary");

	By practiceQuestionsLink = By.cssSelector("a[href='/graph/practice']");

	public void validateUserIsOnStackDetailPage() {
		Assert.assertEquals(getDriver().findElement(StackDetail).getText(), "Stack");
		Assert.assertTrue(getDriver().findElement(StackDetail).isDisplayed());
		Assert.assertEquals(getDriver().getCurrentUrl(), "https://dsportalapp.herokuapp.com/stack/");
		Assert.assertEquals(getDriver().findElement(topicsCovered).getText(), "Topics Covered");
		Assert.assertTrue(getDriver().findElement(topicsCovered).isDisplayed());
		Assert.assertTrue(getDriver().findElement(TopicsCoveredOptions).isDisplayed());
	}

	public void clickOnOperationsInStackLink() {
		getDriver().findElement(operationsInStackLink).click();
	}

	public void clickOnImplementationLink() {
		getDriver().findElement(implementaionLink).click();
	}

	public void clickOnApplicationsLink() {
		getDriver().findElement(ApplicationsLink).click();
	}

	public void validateUserIsOnoperationsInStackText() {
		Assert.assertEquals(getDriver().findElement(operationsInStackText).getText(), "Operations in Stack");
	}

	public void validateUserIsOnimplementaionText() {
		Assert.assertEquals(getDriver().findElement(implementaionText).getText(), "Implementation");
	}

	public void validateUserIsOnApplicationsText() {
		Assert.assertEquals(getDriver().findElement(ApplicationsText).getText(), "Applications");
	}

	public void validateUserIsOnPracticeQuestionsPage() {
		Assert.assertEquals(getDriver().getCurrentUrl(), "https://dsportalapp.herokuapp.com/Stack/practice");
		// Assert.assertTrue(getDriver().findElement(practiceQuestion1).isDisplayed());
	}

}