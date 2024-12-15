package PageObjects;

import org.testng.Assert;

import BaseTest.BaseTest;

import org.openqa.selenium.By;

public class ArrayPage extends BaseTest {

	By arrayDetail = By.cssSelector("h4.bg-secondary");
	By topicsCovered = By.cssSelector("p.bg-secondary");
	By TopicsCoveredOptions = By.cssSelector("a.list-group-item");
	By arrayInPythonLink = By.cssSelector("a[href='arrays-in-python']");
	By arraysInPythonText = By.cssSelector("strong .bg-secondary");

	By arraysUsingListLink = By.cssSelector("a[href='arrays-using-list']");
	By arraysUsingListText = By.cssSelector("strong .bg-secondary");
	By basicOperationsInListLink = By.cssSelector("a[href=basic-operations-in-lists]");
	By basicOperationsInListText = By.cssSelector("strong .bg-secondary");
	By applicationsOfArrayLink = By.cssSelector("a[href='applications-of-array']");
	By applicationsOfArrayText = By.cssSelector("strong .bg-secondary");
	By practiceQuestionsLink = By.cssSelector("a[href='/array/practice']");
	By practiceQuestion1 = By.cssSelector("a[href='/question/1']");

	public void validateUserIsOnArrayDetailPage() {
		Assert.assertEquals(getDriver().findElement(arrayDetail).getText(), "Array");
		Assert.assertTrue(getDriver().findElement(arrayDetail).isDisplayed());
		Assert.assertEquals(getDriver().getCurrentUrl(), "https://dsportalapp.herokuapp.com/array/");
		Assert.assertEquals(getDriver().findElement(topicsCovered).getText(), "Topics Covered");
		Assert.assertTrue(getDriver().findElement(topicsCovered).isDisplayed());
		Assert.assertTrue(getDriver().findElement(TopicsCoveredOptions).isDisplayed());
	}

	public void clickOnArrayInPythonLink() {
		getDriver().findElement(arrayInPythonLink).click();
	}

	public void clickOnArrayUsingListLink() {
		getDriver().findElement(arraysUsingListLink).click();
	}

	public void clickOnBasicOperationsLink() {
		getDriver().findElement(basicOperationsInListLink).click();
	}

	public void clickOnApplicationOfArrayLink() {
		getDriver().findElement(applicationsOfArrayLink).click();
	}

	public void validateUserIsOnArraysInPython() {
		Assert.assertEquals(getDriver().findElement(arraysInPythonText).getText(), "Arrays in Python");
	}

	public void validateUserIsOnArraysUsingList() {
		Assert.assertEquals(getDriver().findElement(arraysUsingListText).getText(), "Arrays Using List");
	}

	public void validateUserIsOnBasicOperationsInList() {
		Assert.assertEquals(getDriver().findElement(basicOperationsInListText).getText(), "Basic Operations in Lists");
	}

	public void validateUserIsOnApplicationsOfArray() {
		Assert.assertEquals(getDriver().findElement(applicationsOfArrayText).getText(), "Applications of Array");
	}

	public void clickOnPracticeQuestionsLink() {
		getDriver().findElement(practiceQuestionsLink).click();
	}

	public void validateUserIsOnPracticeQuestionsPage() {
		Assert.assertEquals(getDriver().getCurrentUrl(), "https://dsportalapp.herokuapp.com/array/practice");
		Assert.assertTrue(getDriver().findElement(practiceQuestion1).isDisplayed());
	}
}