package PageObjects;

import DriverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GraphPage {
	public WebDriver driver = DriverManager.getDriver();

	public By GraphDetail=By.cssSelector("h4.bg-secondary");
	public By topicsCovered = By.cssSelector("p.bg-secondary");
	public By TopicsCoveredOptions =By.cssSelector("a.list-group-item");

	public By graphLink=By.cssSelector("a[href='graph']");
	public By graphText=By.cssSelector("strong .bg-secondary");

	public By graphRepresentationsLink= By.cssSelector("a[href='graph-representations']");
	public By graphRepresentationsText=By.cssSelector("strong .bg-secondary");
	public By practiceQuestionsLink=By.cssSelector("a[href='/graph/practice']");

	public void clickOnGraphLinkUnderGraphDetails() {
		driver.findElement(graphLink).click();
	}

	public void clickonGraphRepresentations(){
		driver.findElement(graphRepresentationsLink).click();
	}

	public void clickOnPracticeQuestionsLink() {
		driver.findElement(practiceQuestionsLink).click();
	}

}