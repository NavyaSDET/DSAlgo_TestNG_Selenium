package PageObjects;

import org.testng.Assert;

import StepDefinitions.Hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GraphPage {
	WebDriver driver=Hooks.getDriver();

	By GraphDetail=By.cssSelector("h4.bg-secondary");
	By topicsCovered = By.cssSelector("p.bg-secondary");
	By TopicsCoveredOptions =By.cssSelector("a.list-group-item");

	By graphLink=By.cssSelector("a[href='graph']");
	By graphText=By.cssSelector("strong .bg-secondary");

	By graphRepresentationsLink= By.cssSelector("a[href='graph-representations']");
	By graphRepresentationsText=By.cssSelector("strong .bg-secondary");
	By practiceQuestionsLink=By.cssSelector("a[href='/graph/practice']");

	public void validateUserIsOnGraphDetailPage(){
		Assert.assertEquals(driver.findElement(GraphDetail).getText(), "Graph"); 
		Assert.assertTrue(driver.findElement(GraphDetail).isDisplayed());
		Assert.assertEquals(driver.getCurrentUrl(),"https://dsportalapp.herokuapp.com/graph/");
		Assert.assertEquals(driver.findElement(topicsCovered).getText(),"Topics Covered");	
		Assert.assertTrue(driver.findElement(topicsCovered).isDisplayed());
		Assert.assertTrue(driver.findElement(TopicsCoveredOptions).isDisplayed());
	}

	public void clickOnGraphLinkUnderGraphDetails() {
		driver.findElement(graphLink).click();
	}

	public void clickonGraphRepresentations(){
		driver.findElement(graphRepresentationsLink).click();
	}

	public void validateUserIsOnGraphsUnderGraphDetails() {
		Assert.assertEquals(driver.findElement(graphText).getText(),"Graph");	
	}

	public void validateUserIsOnGraphRepresentations(){	
		Assert.assertEquals(driver.findElement(graphRepresentationsText).getText(),"Graph Representations");
	}	

	public void clickOnPracticeQuestionsLink() {
		driver.findElement(practiceQuestionsLink).click();
	}

}