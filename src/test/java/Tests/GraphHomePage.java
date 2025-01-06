package Tests;

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
		ip.completeTheLOgin();
		ip.clickOnGetStartedButtonOfGraph();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_navigated_to_graph_details_page_when_clicked_on_get_started () {
		gp.validateUserIsOnGraphDetailPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Graph_in_Graph_page () {
		gp.validateUserIsOnGraphDetailPage();
		gp.clickOnGraphLinkUnderGraphDetails();
		gp.validateUserIsOnGraphsUnderGraphDetails();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_Try_here_link_page_from_graphs () {
		gp.clickOnGraphLinkUnderGraphDetails();
		gp.validateUserIsOnGraphsUnderGraphDetails();
		ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_Editor_for_graphs_page () {
		gp.clickOnGraphLinkUnderGraphDetails();
		gp.validateUserIsOnGraphsUnderGraphDetails();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says", "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_graphs_page () {
		gp.clickOnGraphLinkUnderGraphDetails();
		gp.validateUserIsOnGraphsUnderGraphDetails();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_graphs_runs_successfully () {
		gp.clickOnGraphLinkUnderGraphDetails();
		gp.validateUserIsOnGraphsUnderGraphDetails();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_navigate_to_Graph_Representations_page () {
		gp.validateUserIsOnGraphDetailPage();
		gp.clickonGraphRepresentations();
	    gp.validateUserIsOnGraphRepresentations();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Validate_user_can_click_on_Try_here_link_from_graph_representations_page () {
		gp.clickonGraphRepresentations();
	    gp.validateUserIsOnGraphRepresentations();
	    ip.clickOnTryHerebutton();
		ip.codeTryEditorPage();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Error_message_displayed_for_invalid_code_on_try_Editor_for_graph_representations_page  () {
		gp.clickonGraphRepresentations();
		gp.validateUserIsOnGraphRepresentations();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says", "NameError: name 'ABC' is not defined on line 1");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void No_error_message_displayed_for_empty_code_on_try_editor_for_graph_representations_page  () {
		gp.clickonGraphRepresentations();
		gp.validateUserIsOnGraphRepresentations();
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
		ip.validateNoConsoleOuput();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void Valid_code_on_try_editor_for_graph_representations_runs_successfully  () {
		gp.clickonGraphRepresentations();
		gp.validateUserIsOnGraphRepresentations();
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
		ip.validateConsoleOutput("hello");
	}
}