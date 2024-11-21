package PageObjects;


import org.testng.Assert;

import StepDefinitions.Hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ArrayPage {

	WebDriver driver=Hooks.getDriver();


	By arrayDetail=By.cssSelector("h4.bg-secondary");
	By topicsCovered = By.cssSelector("p.bg-secondary");
	By TopicsCoveredOptions =By.cssSelector("a.list-group-item");
	By arrayInPythonLink=By.cssSelector("a[href='arrays-in-python']");
	By arraysInPythonText=By.cssSelector("strong .bg-secondary");

	By arraysUsingListLink = By.cssSelector("a[href='arrays-using-list']");
	By arraysUsingListText=By.cssSelector("strong .bg-secondary");
	By basicOperationsInListLink = By.cssSelector("a[href=basic-operations-in-lists]");
	By basicOperationsInListText=By.cssSelector("strong .bg-secondary");
	By applicationsOfArrayLink = By.cssSelector("a[href='applications-of-array']");
	By applicationsOfArrayText=By.cssSelector("strong .bg-secondary");
	By practiceQuestionsLink=By.cssSelector("a[href='/array/practice']");
	By practiceQuestion1 = By.cssSelector("a[href='/question/1']");

	public void validateUserIsOnArrayDetailPage(){
		Assert.assertEquals(driver.findElement(arrayDetail).getText(), "Array");
		Assert.assertTrue(driver.findElement(arrayDetail).isDisplayed());
		Assert.assertEquals(driver.getCurrentUrl(),"https://dsportalapp.herokuapp.com/array/");
		Assert.assertEquals(driver.findElement(topicsCovered).getText(),"Topics Covered");
		Assert.assertTrue(driver.findElement(topicsCovered).isDisplayed());
		Assert.assertTrue(driver.findElement(TopicsCoveredOptions).isDisplayed());
	}

	public void clickOnArrayInPythonLink() {
		driver.findElement(arrayInPythonLink).click();
	}

	public void clickOnArrayUsingListLink() {
		driver.findElement(arraysUsingListLink).click();
	}

	public void clickOnBasicOperationsLink() {
		driver.findElement(basicOperationsInListLink).click();
	}

	public void clickOnApplicationOfArrayLink() {
		driver.findElement(applicationsOfArrayLink).click();
	}

	public void validateUserIsOnArraysInPython() {
		Assert.assertEquals(driver.findElement(arraysInPythonText).getText(),"Arrays in Python");
	}

	public void validateUserIsOnArraysUsingList(){
		Assert.assertEquals(driver.findElement(arraysUsingListText).getText(),"Arrays Using List");
	}

	public void validateUserIsOnBasicOperationsInList() {
		Assert.assertEquals(driver.findElement(basicOperationsInListText).getText(),"Basic Operations in Lists");
	}

	public void validateUserIsOnApplicationsOfArray() {
		Assert.assertEquals(driver.findElement(applicationsOfArrayText).getText(),"Applications of Array");
	}

	public void clickOnPracticeQuestionsLink() {
		driver.findElement(practiceQuestionsLink).click();
	}
	public void validateUserIsOnPracticeQuestionsPage() {
		Assert.assertEquals(driver.getCurrentUrl() ,"https://dsportalapp.herokuapp.com/array/practice");
		Assert.assertTrue(driver.findElement(practiceQuestion1).isDisplayed());
	}
}