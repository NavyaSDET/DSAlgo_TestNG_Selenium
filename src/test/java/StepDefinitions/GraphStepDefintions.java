package StepDefinitions;

import PageObjects.GraphPage;
import PageObjects.IntroductionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphStepDefintions {
	
	public GraphPage gp = new GraphPage();
	public IntroductionPage ip =  new IntroductionPage();

	@When("The user clicks on Get Started link for graph")
	public void the_user_clicks_on_get_started_link_for_graph() {
		ip.clickOnGetStartedButtonOfGraph();
	}
	
	@Then("The user is on the graph details page")
	public void the_user_is_on_the_graph_details_page() {
		gp.validateUserIsOnGraphDetailPage();
	}
	
	@When("The user click on graph link in graph details page")
	public void the_user_click_on_graph_link_in_graph_details_page() {
	   gp.clickOnGraphLinkUnderGraphDetails();
	}

	@Then("the user is navigated to graph page under graph details")
	public void the_user_is_navigated_to_graph_page_under_graph_details() {
	    gp.validateUserIsOnGraphsUnderGraphDetails();
	}

	@Given("The user is on the graphs page under graph detials")
	public void the_user_is_on_the_graphs_page_under_graph_detials() {
	    gp.clickOnGraphLinkUnderGraphDetails();
	    gp.validateUserIsOnGraphsUnderGraphDetails();
	}

	@When("The user click on graph representations link")
	public void the_user_click_on_graph_representations_link() {
	    gp.clickonGraphRepresentations();
	}

	@Then("the user is navigated to graph representations page")
	public void the_user_is_navigated_to_graph_representations_page() {
	    gp.validateUserIsOnGraphRepresentations();
	}

	@Given("The user is on the graphs representations page")
	public void the_user_is_on_the_graphs_representations_page() {
	    gp.clickonGraphRepresentations();
	    gp.validateUserIsOnGraphRepresentations();
	}
}