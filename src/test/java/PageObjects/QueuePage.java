package PageObjects;

import DriverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QueuePage {
	public WebDriver driver = DriverManager.getDriver();

	public By queueGetStartedButton= By.cssSelector("a[href='queue']");
	public By queuepage=By.cssSelector("h4.bg-secondary");
	public By implementationOfQueueInPythonLink=By.cssSelector("a[href='implementation-lists']");
	public By implementationOfQueueInPythonPage=By.cssSelector("strong .bg-secondary");
	public By implementationUsingCollectionsDequeLink=By.cssSelector("a[href='implementation-collections']");
	public By implementaionUsingCollectionDequePage=By.cssSelector("strong .bg-secondary");
	public By topicsCovered = By.cssSelector("p.bg-secondary");
	public By TopicsCoveredOptions =By.cssSelector("a.list-group-item");
	public By implementationUsingArrayLink=By.cssSelector("a[href='Implementation-array']");

	public By implementationUsingCollectionsArrayPage=By.cssSelector("strong .bg-secondary");
	public By queueOperationsLink=By.cssSelector("a[href='QueueOp']");
	public By queueOperationsPage=By.cssSelector("strong .bg-secondary");
	
	public void clickOnImplementationOfQueueInPython() {
		driver.findElement(implementationOfQueueInPythonLink).click();
	}

	public void clickOnImplementationUsingCollectionsDeque() {
		driver.findElement(implementationUsingCollectionsDequeLink).click();
	}
	
	public void clickOnImplementationUsingArray() {
		driver.findElement(implementationUsingArrayLink).click();
	}
	
	public void clickOnQueueOperations() {
		driver.findElement(queueOperationsLink).click();
	}
	
}

