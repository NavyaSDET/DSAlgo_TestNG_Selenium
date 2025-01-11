package PageObjects;

import DriverManager.DriverManager;
import Utilities.ExcelReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class ArrayPage {

	public WebDriver driver = DriverManager.getDriver();

	public By arrayDetail=By.cssSelector("h4.bg-secondary");
	public By topicsCovered = By.cssSelector("p.bg-secondary");
	public By TopicsCoveredOptions =By.cssSelector("a.list-group-item");
	public By arrayInPythonLink=By.cssSelector("a[href='arrays-in-python']");
	public By arraysInPythonText=By.cssSelector("strong .bg-secondary");

	public By arraysUsingListLink = By.cssSelector("a[href='arrays-using-list']");	
	public By arraysUsingListText=By.cssSelector("strong .bg-secondary");
	public By basicOperationsInListLink = By.cssSelector("a[href=basic-operations-in-lists]");
	public By basicOperationsInListText=By.cssSelector("strong .bg-secondary");
	public By applicationsOfArrayLink = By.cssSelector("a[href='applications-of-array']");
	public By applicationsOfArrayText=By.cssSelector("strong .bg-secondary");
	public By practiceQuestionsLink=By.cssSelector("a[href='/array/practice']");
	public By practiceQuestion1 = By.cssSelector("a[href='/question/1']");
	
	public By searchTheArrayQuestion = By.cssSelector("a[href='/question/1']");
	public By maxConsecutiveOneQuestion = By.cssSelector("a[href='/question/2']");
	public By evenNumberQuestion = By.cssSelector("a[href='/question/3']");
	public By sortedArrayQuestion4 = By.cssSelector("a[href='/question/4']");
	public By arrayTopicsList = By.cssSelector("ul a.list-group-item");

	public By practiceQuestionpage = By.cssSelector("div.container");
	public By practiceQuestionPageHeader = By.cssSelector(".question h2");
	public By practiceQuestionFirstLine = By.cssSelector("#questionText p:nth-child(1)");
	public By practiceQuestionInput = By.cssSelector(".code-area textarea[tabindex=\"0\"]");
	public By practiceQuestionSearchPage = By.cssSelector("div.CodeMirror-scroll");
	public By practiceQuestionRunButton = By.cssSelector("button[type='button']");
	public By practiceQuestionSubmitButton = By.cssSelector("input[type='submit']");
	public By practiceQuestionOutPut = By.cssSelector("#output");

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
	
	public void clickOnArrayTopListByPosition(int position) {
		driver.findElements(arrayTopicsList).get(position).click();
	}

	public String getTheRunResultText(String sheetName, int rowNumber)
			throws InterruptedException,
			InvalidFormatException, IOException,
			OpenXML4JException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetName);

		String expectedOutput = testdata.get(rowNumber).get("Result");
		return expectedOutput;
	}
	
	public void clickOnPracticeQuestionsLink() {
		driver.findElement(practiceQuestionsLink).click();
	}

	public void clickOnSearchArrayQuestionLink() {
		driver.findElement(searchTheArrayQuestion).click();
	}

	public void clickOnMaxConsecutiveQuestionLink() {
		driver.findElement(maxConsecutiveOneQuestion).click();
	}

	public void clickOnEvenNumbersQuestionLink() {
		driver.findElement(evenNumberQuestion).click();
	}

	public void clickOnSortedArrayQuestionLink() {
		driver.findElement(sortedArrayQuestion4).click();
	}

	public void clickOnSubmitButton() throws InterruptedException {
		driver.findElement(practiceQuestionSubmitButton).click();
		Thread.sleep(1000);
	}

	public void clickOnRunButton() {
		driver.findElement(practiceQuestionRunButton).click();
	}

	public void enterPythonCode(String sheetname, int rownumber) throws InvalidFormatException, IOException, OpenXML4JException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetname);

		driver.findElement(practiceQuestionInput);
		// Focus on the input field, select all text, and clear it
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();

		Actions actions = new Actions(driver);

		String code = testdata.get(rownumber).get("pythonCode");
		code = code.replaceAll("\t", "");
		String[] splittedCode = code.split("\n");
		for (int i =0; i<splittedCode.length; i++) {
			if(splittedCode[i].equalsIgnoreCase("\\xc")) {
				actions.sendKeys(Keys.BACK_SPACE);
			}
			else {
				System.out.println(splittedCode[i]);
				actions.sendKeys(splittedCode[i]).perform();
				actions.sendKeys("\n").perform();
			}
		}
	}

}