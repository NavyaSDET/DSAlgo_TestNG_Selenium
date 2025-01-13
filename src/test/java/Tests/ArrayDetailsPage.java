package Tests;


import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import Utilities.RetryAnalyzer;
import Utilities.TestDataProvider;
import BaseTest.BaseTest;
import PageObjects.ArrayPage;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;

public class ArrayDetailsPage extends BaseTest{

	public HomePage hp;
	public ArrayPage ap;
	public IntroductionPage ip;

	@BeforeMethod
	public void loginIntoApp() {
		hp = new HomePage();
		ap = new ArrayPage();
		ip =  new IntroductionPage();
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.completeTheLogin();
		ip.clickOnGetStartedButtonOfArray();
	}


	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_user_navigated_to_array_details_page_when_clicked_on_get_started(){
		Assert.assertEquals(ip.getTextForElement(ap.arrayDetail), "Array"); 
		Assert.assertTrue(ip.validateElementDisplayed(ap.arrayDetail));
		Assert.assertEquals(ip.getCurrentUrl(),"https://dsportalapp.herokuapp.com/array/");
		Assert.assertEquals(ip.getTextForElement(ap.topicsCovered),"Topics Covered");	
		Assert.assertTrue(ip.validateElementDisplayed(ap.topicsCovered));
		Assert.assertTrue(ip.validateElementDisplayed(ap.TopicsCoveredOptions));
		}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_user_can_navigate_to_Arrays_in_python (){
		ap.clickOnArrayInPythonLink();
		Assert.assertEquals(ip.getTextForElement(ap.arraysInPythonText),"Arrays in Python");	
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_user_can_try_here_link_page_from_arrays_in_python() {
		ap.clickOnArrayInPythonLink();
		Assert.assertEquals(ip.getTextForElement(ap.arraysInPythonText),"Arrays in Python");	
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "arrayInValidcodeTopics", dataProviderClass = TestDataProvider.class)
	public void Error_message_displayed_for_invalid_code_on_try_Editor (String topicNumber, String inValidCode) {
		ap.clickOnArrayTopListByPosition(Integer.parseInt(topicNumber));
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor(inValidCode);
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "arrayInValidcodeTopics", dataProviderClass = TestDataProvider.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor(String topicNumber, String validCode) {
		ap.clickOnArrayTopListByPosition(Integer.parseInt(topicNumber));
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(ip.validateElementDisplayed(ip.consoleOutput));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "arrayValidcodeTopics", dataProviderClass = TestDataProvider.class)
	public void Valid_code_on_try_editor_runs_successfully (String topicNumber, String validCode) {
		ap.clickOnArrayTopListByPosition(Integer.parseInt(topicNumber));
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor(validCode);
		ip.clickOnRunButton();
		Assert.assertEquals(ip.getTextForElement(ip.consoleOutput), "Hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Arrays_using_list () {
		ap.clickOnArrayUsingListLink();
		Assert.assertEquals(ip.getTextForElement(ap.arraysUsingListText),"Arrays Using List");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_Try_here_link_page_from_Array_using_list () {
		ap.clickOnArrayUsingListLink();
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_basic_opertaions_in_lists () {
		ap.clickOnBasicOperationsLink();
		Assert.assertEquals(ip.getTextForElement(ap.basicOperationsInListText),"Basic Operations in Lists");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_Try_here_link_page_from_Basic_operations_in_lists () {
		ap.clickOnBasicOperationsLink();
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_applications_of_array () {
		ap.clickOnApplicationOfArrayLink();
		Assert.assertEquals(ip.getTextForElement(ap.applicationsOfArrayText),"Applications of Array");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_Try_here_link_page_from_applications_of_array () {
		ap.clickOnApplicationOfArrayLink();
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_user_can_click_on_practicequestions () {
		ap.clickOnApplicationOfArrayLink();
		ap.clickOnPracticeQuestionsLink();
		Assert.assertEquals(ip.getCurrentUrl() ,"https://dsportalapp.herokuapp.com/array/practice");
		Assert.assertTrue(ip.validateElementDisplayed(ap.practiceQuestion1));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_user_able_to_navigate_to_practice_question_page_for_search_the_array_question () {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();  
		ap.clickOnSearchArrayQuestionLink();
		Assert.assertEquals(ip.getCurrentUrl(), "https://dsportalapp.herokuapp.com/question/1");
		Assert.assertTrue(ip.validateElementDisplayed(ap.practiceQuestionPageHeader));
		Assert.assertEquals(ip.getTextForElement(ap.practiceQuestionPageHeader), "QUESTION");
		Assert.assertTrue(ip.validateElementDisplayed(ap.practiceQuestionSubmitButton));
		Assert.assertTrue(ip.validateElementDisplayed(ap.practiceQuestionRunButton));
		Assert.assertEquals(ip.getTextForElement(ap.practiceQuestionFirstLine),
				"Write a Python Program to check if an element is present in the input array.");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_user_able_to_navigate_to_practice_question_page_for_max_consecutive_ones_question () {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();  
		ap.clickOnMaxConsecutiveQuestionLink();
		Assert.assertEquals(ip.getCurrentUrl(), "https://dsportalapp.herokuapp.com/question/2");
		Assert.assertTrue(ip.validateElementDisplayed(ap.practiceQuestionPageHeader));
		Assert.assertEquals(ip.getTextForElement(ap.practiceQuestionPageHeader), "QUESTION");
		Assert.assertTrue(ip.validateElementDisplayed(ap.practiceQuestionSubmitButton));
		Assert.assertTrue(ip.validateElementDisplayed(ap.practiceQuestionRunButton));
		Assert.assertEquals(ip.getTextForElement(ap.practiceQuestionFirstLine),
				"Given a binary array nums, return the maximum number of consecutive 1's");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_user_able_to_navigate_to_practice_question_page_for_even_number_question () {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();  
		ap.clickOnEvenNumbersQuestionLink();
		Assert.assertEquals(ip.getCurrentUrl(), "https://dsportalapp.herokuapp.com/question/3");
		Assert.assertTrue(ip.validateElementDisplayed(ap.practiceQuestionPageHeader));
		Assert.assertEquals(ip.getTextForElement(ap.practiceQuestionPageHeader), "QUESTION");
		Assert.assertTrue(ip.validateElementDisplayed(ap.practiceQuestionSubmitButton));
		Assert.assertTrue(ip.validateElementDisplayed(ap.practiceQuestionRunButton));
		Assert.assertEquals(ip.getTextForElement(ap.practiceQuestionFirstLine),
				"Given an array nums of integers, return how many of them contain");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_user_able_to_navigate_to_practice_question_page_for_sorted_array_question () {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();  
		ap.clickOnSortedArrayQuestionLink();
		Assert.assertEquals(ip.getCurrentUrl(), "https://dsportalapp.herokuapp.com/question/4");
		Assert.assertTrue(ip.validateElementDisplayed(ap.practiceQuestionPageHeader));
		Assert.assertEquals(ip.getTextForElement(ap.practiceQuestionPageHeader), "QUESTION");
		Assert.assertTrue(ip.validateElementDisplayed(ap.practiceQuestionSubmitButton));
		Assert.assertTrue(ip.validateElementDisplayed(ap.practiceQuestionRunButton));
		Assert.assertEquals(ip.getTextForElement(ap.practiceQuestionFirstLine),
				"Given an integer array nums sorted in non-decreasing order,");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "pythoCodeRow0", dataProviderClass = TestDataProvider.class)
	public void validate_user_is_able_to_run_the_code_in_tryEditor_for_Search_the_array_link (String sheetName, int rowNumber) throws InvalidFormatException, InterruptedException, IOException, OpenXML4JException {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();
		ap.clickOnSearchArrayQuestionLink();
		ap.enterPythonCode(sheetName, rowNumber);
		ap.clickOnRunButton();
		String runResultText = ap.getTheRunResultText(sheetName, rowNumber);	
		Assert.assertEquals(ip.getTextForElement(ap.practiceQuestionOutPut), runResultText);
	}


	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "pythonCodeRow1", dataProviderClass = TestDataProvider.class)
	public void validate_user_is_able_to_submit_the_code_in_tryEditor_for_Search_the_array_link (String sheetName, int rowNumber) throws InvalidFormatException, InterruptedException, IOException, OpenXML4JException {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();
		ap.clickOnSearchArrayQuestionLink();
		ap.enterPythonCode(sheetName, rowNumber);
		ap.clickOnSubmitButton();		
		String runResultText = ap.getTheRunResultText(sheetName, rowNumber);		
		Assert.assertEquals(ip.getTextForElement(ap.practiceQuestionOutPut), runResultText);
	}


	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_user_is_presented_with_error_message_for_the_code_with_the_invalid_syntax_in_tryEditor_for_search_the_array_link () {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();
		ap.clickOnSearchArrayQuestionLink();
		ap.clickOnRunButton();
		Assert.assertEquals(ip.getAlertText(), "SyntaxError: bad input on line 2");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "pythonCodeRow2", dataProviderClass = TestDataProvider.class)
	public void validate_user_is_able_to_run_the_code_in_tryEditor_for_Max_Consecutive_Ones (String sheetName, int rowNumber) throws InvalidFormatException, InterruptedException, IOException, OpenXML4JException {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();
		ap.clickOnMaxConsecutiveQuestionLink();
		ap.enterPythonCode(sheetName, rowNumber);
		ap.clickOnRunButton();
		String runResultText = ap.getTheRunResultText(sheetName, rowNumber);
		Assert.assertEquals(ip.getTextForElement(ap.practiceQuestionOutPut), runResultText);
	}


	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "pythonCodeRow3", dataProviderClass = TestDataProvider.class)
	public void validate_user_is_able_to_submit_the_code_in_tryEditor_for_Max_Consecutive_Ones (String sheetName, int rowNumber) throws InvalidFormatException, InterruptedException, IOException, OpenXML4JException {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();
		ap.clickOnMaxConsecutiveQuestionLink();
		ap.enterPythonCode(sheetName, rowNumber);
		ap.clickOnSubmitButton();
		String runResultText = ap.getTheRunResultText(sheetName, rowNumber);
		Assert.assertEquals(ip.getTextForElement(ap.practiceQuestionOutPut), runResultText);
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_user_is_presented_with_error_message_for_the_code_with_the_invalid_syntax_in_tryEditor_for_Max_Consecutive_Ones () {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();
		ap.clickOnMaxConsecutiveQuestionLink();
		ap.clickOnRunButton();
		Assert.assertEquals(ip.getAlertText(), "SyntaxError: bad input on line 2");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "pythonCodeRow4", dataProviderClass = TestDataProvider.class)
	public void validate_user_is_able_to_run_the_code_in_tryEditor_for_Even_number_of_digits (String sheetName, int rowNumber) throws InvalidFormatException, InterruptedException, IOException, OpenXML4JException {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();
		ap.clickOnEvenNumbersQuestionLink();
		ap.enterPythonCode(sheetName, rowNumber);
		ap.clickOnRunButton();
		Thread.sleep(1000);
		String runResultText = ap.getTheRunResultText(sheetName, rowNumber);		
		Assert.assertEquals(ip.getTextForElement(ap.practiceQuestionOutPut), runResultText);
	}


	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "pythonCodeRow5", dataProviderClass = TestDataProvider.class)
	public void validate_user_is_able_to_submit_the_code_in_tryEditor_for_Even_number_of_digits (String sheetName, int rowNumber) throws InvalidFormatException, InterruptedException, IOException, OpenXML4JException {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();
		ap.clickOnEvenNumbersQuestionLink();
		ap.enterPythonCode(sheetName, rowNumber);
		ap.clickOnSubmitButton();
		Thread.sleep(3000);
		String runResultText = ap.getTheRunResultText(sheetName, rowNumber);		
		Assert.assertEquals(ip.getTextForElement(ap.practiceQuestionOutPut), runResultText);
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_user_is_presented_with_error_message_for_the_code_with_the_invalid_syntax_in_tryEditor_for_Even_number_of_digits () {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();
		ap.clickOnEvenNumbersQuestionLink();
		ap.clickOnRunButton();
		Assert.assertEquals(ip.getAlertText(), "SyntaxError: bad input on line 2");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "pythonCodeRow6", dataProviderClass = TestDataProvider.class)
	public void validate_user_is_able_to_run_the_code_in_tryEditor_for_Squares_of_a_Sorted_Array (String sheetName, int rowNumber) throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();
		ap.clickOnSortedArrayQuestionLink();
		ap.enterPythonCode(sheetName, rowNumber);
		ap.clickOnRunButton();
		Thread.sleep(1000);
		String runResultText = ap.getTheRunResultText(sheetName, rowNumber);		
		Assert.assertEquals(ip.getTextForElement(ap.practiceQuestionOutPut), runResultText);
	}


	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "pythonCodeRow7", dataProviderClass = TestDataProvider.class)
	public void validate_user_is_able_to_submit_the_code_in_tryEditor_for_squares_of_a_Sorted_Array (String sheetName, int rowNumber) throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();
		ap.clickOnSortedArrayQuestionLink();
		ap.enterPythonCode(sheetName, rowNumber);
		ap.clickOnSubmitButton();
		String runResultText = ap.getTheRunResultText(sheetName, rowNumber);		
		Assert.assertEquals(ip.getTextForElement(ap.practiceQuestionOutPut), runResultText);
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validate_user_is_presented_with_error_message_for_the_code_with_the_invalid_syntax_in_tryEditor_for_Squares_of_a_Sorted_Array () {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();
		ap.clickOnSortedArrayQuestionLink();
		ap.clickOnRunButton();
		Assert.assertEquals(ip.getAlertText(), "SyntaxError: bad input on line 2");
	}

}
