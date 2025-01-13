package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Utilities.RetryAnalyzer;
import Utilities.TestDataProvider;
import BaseTest.BaseTest;
import PageObjects.GraphPage;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;

public class GraphHomePage extends BaseTest{

	public GraphPage gp;
	public HomePage hp;
	public IntroductionPage ip;

	@BeforeMethod
	public void loginIntoApp() {
		hp = new HomePage();
		gp = new GraphPage();
		ip =  new IntroductionPage();
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.completeTheLogin();
		ip.clickOnGetStartedButtonOfGraph();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_navigated_to_graph_details_page_when_clicked_on_get_started () {
		Assert.assertEquals(ip.getTextForElement(gp.GraphDetail), "Graph"); 
		Assert.assertTrue(ip.validateElementDisplayed(gp.GraphDetail));
		Assert.assertEquals(ip.getCurrentUrl(),"https://dsportalapp.herokuapp.com/graph/");
		Assert.assertEquals(ip.getTextForElement(gp.topicsCovered),"Topics Covered");	
		Assert.assertTrue(ip.validateElementDisplayed(gp.topicsCovered));
		Assert.assertTrue(ip.validateElementDisplayed(gp.TopicsCoveredOptions));	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Graph_in_Graph_page () {
		gp.clickOnGraphLinkUnderGraphDetails();
		Assert.assertEquals(ip.getTextForElement(gp.graphText),"Graph");	;
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_Try_here_link_page_from_graphs () {
		gp.clickOnGraphLinkUnderGraphDetails();
		Assert.assertEquals(ip.getTextForElement(gp.graphText),"Graph");	;
		ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "graphInValidcodeTopics", dataProviderClass = TestDataProvider.class)
	public void Error_message_displayed_for_invalid_code_on_try_Editor (String topicNumber, String inValidCode) {
		gp.clickOnGraphTopListByPosition(Integer.parseInt(topicNumber));
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor(inValidCode);
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "graphInValidcodeTopics", dataProviderClass = TestDataProvider.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor(String topicNumber, String inValidCode) {
		gp.clickOnGraphTopListByPosition(Integer.parseInt(topicNumber));
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(ip.validateElementDisplayed(ip.consoleOutput));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "graphValidcodeTopics", dataProviderClass = TestDataProvider.class)
	public void Valid_code_on_try_editor_runs_successfully (String topicNumber, String validCode) {
		gp.clickOnGraphTopListByPosition(Integer.parseInt(topicNumber));
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor(validCode);
		ip.clickOnRunButton();
		Assert.assertEquals(ip.getTextForElement(ip.consoleOutput), "Hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Graph_Representations_page () {
		gp.clickonGraphRepresentations();
	    Assert.assertEquals(ip.getTextForElement(gp.graphRepresentationsText),"Graph Representations");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_click_on_Try_here_link_from_graph_representations_page () {
		gp.clickonGraphRepresentations();
	    Assert.assertEquals(ip.getTextForElement(gp.graphRepresentationsText),"Graph Representations");
	    ip.clickOnTryHerebutton();
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}
}