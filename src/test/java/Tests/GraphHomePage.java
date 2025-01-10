package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Utilities.RetryAnalyzer;
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
		Assert.assertEquals(driver.findElement(gp.GraphDetail).getText(), "Graph"); 
		Assert.assertTrue(driver.findElement(gp.GraphDetail).isDisplayed());
		Assert.assertEquals(driver.getCurrentUrl(),"https://dsportalapp.herokuapp.com/graph/");
		Assert.assertEquals(driver.findElement(gp.topicsCovered).getText(),"Topics Covered");	
		Assert.assertTrue(driver.findElement(gp.topicsCovered).isDisplayed());
		Assert.assertTrue(driver.findElement(gp.TopicsCoveredOptions).isDisplayed());	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Graph_in_Graph_page () {
		gp.clickOnGraphLinkUnderGraphDetails();
		Assert.assertEquals(driver.findElement(gp.graphText).getText(),"Graph");	;
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_Try_here_link_page_from_graphs () {
		gp.clickOnGraphLinkUnderGraphDetails();
		Assert.assertEquals(driver.findElement(gp.graphText).getText(),"Graph");	;
		ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_Editor_for_graphs_page () {
		gp.clickOnGraphLinkUnderGraphDetails();
		Assert.assertEquals(driver.findElement(gp.graphText).getText(),"Graph");	;
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
		Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_graphs_page () {
		gp.clickOnGraphLinkUnderGraphDetails();
		Assert.assertEquals(driver.findElement(gp.graphText).getText(),"Graph");	;
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_graphs_runs_successfully () {
		gp.clickOnGraphLinkUnderGraphDetails();
		Assert.assertEquals(driver.findElement(gp.graphText).getText(),"Graph");	;
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Graph_Representations_page () {
		gp.clickonGraphRepresentations();
	    Assert.assertEquals(driver.findElement(gp.graphRepresentationsText).getText(),"Graph Representations");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_click_on_Try_here_link_from_graph_representations_page () {
		gp.clickonGraphRepresentations();
	    Assert.assertEquals(driver.findElement(gp.graphRepresentationsText).getText(),"Graph Representations");
	    ip.clickOnTryHerebutton();
		Assert.assertTrue(driver.findElement(ip.codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(ip.runButton).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_Editor_for_graph_representations_page  () {
		gp.clickonGraphRepresentations();
		Assert.assertEquals(driver.findElement(gp.graphRepresentationsText).getText(),"Graph Representations");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		String alertMessage = ip.getAlertText();
		ip.acceptAlert();
		Assert.assertEquals(alertMessage, "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_graph_representations_page  () {
		gp.clickonGraphRepresentations();
		Assert.assertEquals(driver.findElement(gp.graphRepresentationsText).getText(),"Graph Representations");
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		Assert.assertFalse(driver.findElement(ip.consoleOutput).isDisplayed());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_graph_representations_runs_successfully  () {
		gp.clickonGraphRepresentations();
		Assert.assertEquals(driver.findElement(gp.graphRepresentationsText).getText(),"Graph Representations");
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		Assert.assertEquals(driver.findElement(ip.consoleOutput).getText(), "hello");
	}
}