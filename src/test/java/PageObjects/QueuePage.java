package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import StepDefinitions.Hooks;

public class QueuePage {
	WebDriver driver=Hooks.getDriver();


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
		Assert.assertEquals(driver.findElement(queuepage).getText(), "Queue");
		Assert.assertTrue(driver.findElement(queuepage).isDisplayed());
		Assert.assertEquals(driver.getCurrentUrl(),"https://dsportalapp.herokuapp.com/queue/");
		Assert.assertEquals(driver.findElement(topicsCovered).getText(),"Topics Covered");
		Assert.assertTrue(driver.findElement(topicsCovered).isDisplayed());
		Assert.assertTrue(driver.findElement(TopicsCoveredOptions).isDisplayed());
	}

	public void clickOnImplementationOfQueueInPython() {
		driver.findElement(implementationOfQueueInPythonLink).click();
	}

	public void validateUserIsOnQueueInPythonPage() {
		Assert.assertTrue(driver.findElement(implementationOfQueueInPythonPage).isDisplayed());
		Assert.assertEquals(driver.findElement(implementationOfQueueInPythonPage).getText(), "Implementation of Queue in Python");
	}

	public void clickOnImplementationUsingCollectionsDeque() {
		driver.findElement(implementationUsingCollectionsDequeLink).click();
	}

	public void validateUserIsOnImplementationUsingCollectionsDequePage() {
		Assert.assertTrue(driver.findElement(implementaionUsingCollectionDequePage).isDisplayed());
		Assert.assertEquals(driver.findElement(implementaionUsingCollectionDequePage).getText(), "Implementation using collections.deque");
	}

	public void clickOnImplementationUsingArray() {
		driver.findElement(implementationUsingArrayLink).click();
	}

	public void validateUserIsOnImplementationUsingArrayPage() {
		Assert.assertTrue(driver.findElement(implementationUsingCollectionsArrayPage).isDisplayed());
		Assert.assertEquals(driver.findElement(implementationUsingCollectionsArrayPage).getText(), "Implementation using array");
	}

	public void clickOnQueueOperations() {
		driver.findElement(queueOperationsLink).click();
	}

	public void validateUserIsOnQueueOperationsPage() {
		Assert.assertTrue(driver.findElement(queueOperationsPage).isDisplayed());
		Assert.assertEquals(driver.findElement(queueOperationsPage).getText(), "Queue Operations");
	}

}

