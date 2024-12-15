package PageObjects;
import org.testng.Assert;

import BaseTest.BaseTest;
import org.openqa.selenium.By;

public class QueuePage extends BaseTest{

	By queueGetStartedButton= By.cssSelector("a[href='queue']");
	By queuepage=By.cssSelector("h4.bg-secondary");
	By implementationOfQueueInPythonLink=By.cssSelector("a[href='implementation-lists']");
	By implementationOfQueueInPythonPage=By.cssSelector("strong .bg-secondary");
	By implementationUsingCollectionsDequeLink=By.cssSelector("a[href='implementation-collections']");
	By implementaionUsingCollectionDequePage=By.cssSelector("strong .bg-secondary");
	By topicsCovered = By.cssSelector("p.bg-secondary");
	By TopicsCoveredOptions =By.cssSelector("a.list-group-item");
	By implementationUsingArrayLink=By.cssSelector("a[href='Implementation-array']");

	By implementationUsingCollectionsArrayPage=By.cssSelector("strong .bg-secondary");
	By queueOperationsLink=By.cssSelector("a[href='QueueOp']");
	By queueOperationsPage=By.cssSelector("strong .bg-secondary");

	public void validateUserIsOnQueueDetailsPage(){
		Assert.assertEquals(getDriver().findElement(queuepage).getText(), "Queue"); 
		Assert.assertTrue(getDriver().findElement(queuepage).isDisplayed());
		Assert.assertEquals(getDriver().getCurrentUrl(),"https://dsportalapp.herokuapp.com/queue/");
		Assert.assertEquals(getDriver().findElement(topicsCovered).getText(),"Topics Covered");	
		Assert.assertTrue(getDriver().findElement(topicsCovered).isDisplayed());
		Assert.assertTrue(getDriver().findElement(TopicsCoveredOptions).isDisplayed());
	}
	
	public void clickOnImplementationOfQueueInPython() {
		getDriver().findElement(implementationOfQueueInPythonLink).click();
	}
	
	public void validateUserIsOnQueueInPythonPage() {
		Assert.assertTrue(getDriver().findElement(implementationOfQueueInPythonPage).isDisplayed());
		Assert.assertEquals(getDriver().findElement(implementationOfQueueInPythonPage).getText(), "Implementation of Queue in Python");
	}

	public void clickOnImplementationUsingCollectionsDeque() {
		getDriver().findElement(implementationUsingCollectionsDequeLink).click();
	}
	
	public void validateUserIsOnImplementationUsingCollectionsDequePage() {
		Assert.assertTrue(getDriver().findElement(implementaionUsingCollectionDequePage).isDisplayed());
		Assert.assertEquals(getDriver().findElement(implementaionUsingCollectionDequePage).getText(), "Implementation using collections.deque");	
	}
	
	public void clickOnImplementationUsingArray() {
		getDriver().findElement(implementationUsingArrayLink).click();
	}
	
	public void validateUserIsOnImplementationUsingArrayPage() {
		Assert.assertTrue(getDriver().findElement(implementationUsingCollectionsArrayPage).isDisplayed());
		Assert.assertEquals(getDriver().findElement(implementationUsingCollectionsArrayPage).getText(), "Implementation using array");
	}
	
	public void clickOnQueueOperations() {
		getDriver().findElement(queueOperationsLink).click();
	}
	
	public void validateUserIsOnQueueOperationsPage() {
		Assert.assertTrue(getDriver().findElement(queueOperationsPage).isDisplayed());
		Assert.assertEquals(getDriver().findElement(queueOperationsPage).getText(), "Queue Operations");
	}
	
}

