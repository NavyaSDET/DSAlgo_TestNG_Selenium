package StepDefinitions;
import org.openqa.selenium.WebDriver;

import PageObjects.RegistrationPage;
import PageObjects.TreePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tree {

	public WebDriver driver = Hooks.driver;
	public RegistrationPage RGPage = new RegistrationPage(driver);
	TreePage treePage = new TreePage(driver);



	/*@Given("The user is on DS_algo home page")
	public void the_user_is_on_ds_algo_home_page() {

		RGPage.Land_On_RegistrationPage();
		RGPage.enterUsernameAndPswdAndConfirmPswdAndClickRegisterBtn("tri0ck340", "dfghj1234", "dfghj1234");

	}*/


	@When("User clicks on Get Started button from Tree panel")
	public void user_clicks_on_get_started_button_from_tree_panel() {
		treePage = new TreePage(driver);
		//RGPage = new RegistrationPage(driver);
		treePage.clickTree_GetStartedBtn_HomePage();

	}

	@Then("The user is redirected to Tree page.")
	public void the_user_is_redirected_to_tree_page() {

		treePage.checkIfOn_TreesPage();
	}

	@When("The user select Tree from the Data Structure dropdown menu")
	public void the_user_select_tree_from_the_data_structure_dropdown_menu() {

		treePage.clickDataStructures_DropDownBtn();
	    treePage.click_Tree_FromDropDown();
	}

	@When("The user clicks Overview of Trees link")
	public void the_user_clicks_overview_of_trees_link() {

	    treePage.clickOverviewOfTrees();
	}

	@Then("The user is redirected to Overview of Trees page.")
	public void the_user_is_redirected_to_overview_of_trees_page() {

		treePage.checkIfOn_OverviewOfTreesPage();
	}

	@Given("The user is on the Overview of Trees page") //////////////////////////  DUPLICATE
	public void the_user_is_on_the_overview_of_trees_page() {
		treePage.clickOverviewOfTrees();
	}

	@When("The user clicks Try Here button")  //////////////////////////  DUPLICATE
	public void the_user_clicks_try_here_button() {

	    treePage.click_TryHereBtn_TreePage();
	}

	@Then("The user is redirected to a page having Editor and run button")
	public void the_user_is_redirected_to_a_page_having_editor_and_run_button() {

	    treePage.checkIfOn_TryHereEditorPage();

	}
//////////////////////////////////////////////////////////////  EDITOR ACTION- NO CODE, VALID CODE, INVALID CODE

	@When("The user writes no code inside editor window and clicks on Run button")
	public void the_user_writes_no_code_inside_editor_window_and_clicks_on_run_button() {

	    treePage.writeInTryEditorWindow("");
	}

	@Then("Nothing happens to the Editor page and no error message is displayed")
	public void nothing_happens_to_the_editor_page_and_no_error_message_is_displayed() {

	    treePage.check_When_EmptyCode_In_Editor();
	}

	@When("The user writes the valid python code and clicks on Run button")
	public void the_user_writes_the_valid_python_code_and_clicks_on_run_button() {

		 treePage.writeInTryEditorWindow("print('hello')");
	}

	@Then("The user is able to see the output inside the console.")
	public void the_user_is_able_to_see_the_output_inside_the_console() {

	    treePage.check_When_ValidCode_In_Editor("hello");
	}
	@When("The user writes the invalid python code and clicks on Run button")
	public void the_user_writes_the_invalid_python_code_and_clicks_on_run_button() {

		treePage.writeInTryEditorWindow("printf(hello)");
	}

	@Then("The user see error msg in alert window")
	public void the_user_see_error_msg_in_alert_window() {

	    treePage.check_When_InvalidCode_In_Editor("dsportalapp.herokuapp.com says", "NameError: name 'printf' is not defined on line 1");
	}


	@When("The user clicks Terminologies link")
	public void the_user_clicks_terminologies_link() {

	    treePage.click_TreeDetails_Terminologies();
	}

	@Then("The user is redirected to Terminologies page")
	public void the_user_is_redirected_to_terminologies_page() {

	    treePage.checkIfOn_TerminologiesPage();
	}

	@Given("The user is on the Terminologies page")
	public void the_user_is_on_the_terminologies_page() {

		treePage.clickTerminologies();

	}

	@When("The user clicks Types of Trees link")
	public void the_user_clicks_types_of_trees_link() {

	    treePage.clickTypesOfTrees();
	}

	@When("The user clicks Types of Trees link from TerminologiesPage")
	public void the_user_clicks_types_of_trees_link_from_TerminologiesPage() {

	    treePage.click_TreeDetails_TypesOfTrees();
	}

	@Then("The user is redirected to Types of Trees page.")
	public void the_user_is_redirected_to_types_of_trees_page() {

	    treePage.checkIfOn_TypesOfTreesPage();
	}

	@Given("The user is on the Types of Trees page")
	public void the_user_is_on_the_types_of_trees_page() {


		treePage.clickTypesOfTrees();
		}

	@When("The user clicks Tree Traversals link")
	public void the_user_clicks_tree_traversals_link() {

	    treePage.click_TreeDetails_TreeTraversals();
	}

	@Then("The user is redirected to Tree Traversals page")
	public void the_user_is_redirected_to_tree_traversals_page() {

	    treePage.checkIfOn_TreeTraversals();
	}

	@Given("The user is on the Tree Traversals page")
	public void the_user_is_on_the_tree_traversals_page() {


		treePage.clickTreeTraversals();

	}


	@When("The user clicks Traversals-Illustration link")
	public void the_user_clicks_traversals_illustration_link() {

	    treePage.click_TreeDetails_Traversals_Illustration();
	}

	@Then("The user is redirected to Traversals-Illustration page")
	public void the_user_is_redirected_to_traversals_illustration_page() {

	    treePage.checkIfOn_Traversals_IllustrationPage();
	}

	@Given("The user is on the Traversals-Illustration page")
	public void the_user_is_on_the_traversals_illustration_page() {


		treePage.clickTraversals_Illustration();
	}

	@When("The user clicks Binary Trees link")
	public void the_user_clicks_binary_trees_link() {

	    treePage.click_TreeDetails_BinaryTrees();
	}

	@Then("The user is redirected to Binary Trees page.")
	public void the_user_is_redirected_to_binary_trees_page() {

	    treePage.checkIfOn_BinaryTreesPage();
	}

	@Given("The user is on the Binary Trees page")
	public void the_user_is_on_the_binary_trees_page() {


		treePage.clickBinaryTrees();
	}

	@When("The user clicks Types of Binary Trees link")
	public void the_user_clicks_types_of_binary_trees_link() {


	    treePage.click_TreeDetails_TypesOfBinaryTrees();

	}

	@Then("The user is redirected to Types of Binary Trees page.")
	public void the_user_is_redirected_to_types_of_binary_trees_page() {

	    treePage.checkIfOn_TreeDetails_TypesOfBinaryTreesPage();
	}

	@Given("The user is on the Types of Binary Trees page")
	public void the_user_is_on_the_types_of_binary_trees_page() {


		treePage.clickTypesOfBinaryTrees();

	}

	@When("The user clicks Implementation in Python Trees link")
	public void the_user_clicks_implementation_in_python_trees_link() {

	    treePage.click_TreeDetails_ImplementationInPython();
	}

	@Then("The user is redirected to Implementation in Python page.")
	public void the_user_is_redirected_to_implementation_in_python_page() {

	    treePage.checkIfOn_ImplementationInPythonPage();
	}

	@Given("The user is on the Implementation in Python page")
	public void the_user_is_on_the_implementation_in_python_page() {


		treePage.clickImplementationInPython();
	}

	@When("The user clicks Binary Tree Traversals link")
	public void the_user_clicks_binary_tree_traversals_link() {

	    treePage.click_TreeDetails_BinaryTreeTraversals();
	}

	@Then("The user is redirected to Binary Tree Traversals page.")
	public void the_user_is_redirected_to_binary_tree_traversals_page() {

	    treePage.checkIfOn_BinaryTreeTraversalsPage();
	}

	@Given("The user is on the Binary Tree Traversals page")
	public void the_user_is_on_the_binary_tree_traversals_page() {


		treePage.clickBinaryTreeTraversals();

	}

	@When("The user clicks Implementation of Binary Trees button")
	public void the_user_clicks_implementation_of_binary_trees_button() {

	    treePage.click_TreeDetails_ImplementationOfBinaryTrees();
	}

	@Then("The user is redirected to Implementation of Binary Trees page.")
	public void the_user_is_redirected_to_implementation_of_binary_trees_page() {

	    treePage.checkIfOn_ImplementationOfBinaryTreesPage();
	}


	@Given("The user is on the Implementation of Binary Trees page")
	public void the_user_is_on_the_implementation_of_binary_trees_page() {


		treePage.clickImplementationOfBinaryTrees();
	}

	@When("The user clicks Applications of Binary trees link")
	public void the_user_clicks_applications_of_binary_trees_link() {

	    treePage.click_TreeDetails_ApplicationsOfBinaryTrees();
	}

	@Then("The user is redirected to Applications of Binary trees page.")
	public void the_user_is_redirected_to_applications_of_binary_trees_page() {

	    treePage.checkIfOn_ApplicationsOfBinaryTreesPage();
	}

	@Given("The user is on the Applications of Binary trees page")
	public void the_user_is_on_the_applications_of_binary_trees_page() {


		treePage.clickApplicationsOfBinaryTrees();
	}

	@When("The user clicks Binary Search Trees link")
	public void the_user_clicks_binary_search_trees_link() {

	    treePage.click_TreeDetails_BinarySearchTrees();
	}

	@Then("The user is redirected to Binary Search Trees page.")
	public void the_user_is_redirected_to_binary_search_trees_page() {

	    treePage.checkIfOn_BinarySearchTreesPage();
	}

	@Given("The user is on the Binary Search Trees page")
	public void the_user_is_on_the_binary_search_trees_page() {


		treePage.clickBinarySearchTrees();
	}

	@When("The user clicks Implementation Of BST link")
	public void the_user_clicks_implementation_of_bst_link() {

	    treePage.click_TreeDetails_ImplementationOfBST();
	}

	@Then("The user is redirected to Implementation Of BST page.")
	public void the_user_is_redirected_to_implementation_of_bst_page() {

	    treePage.checkIfOn_ImplementationOfBSTPage();
	}

	@Given("The user is on the Implementation Of BST page")
	public void the_user_is_on_the_implementation_of_bst_page() {


		treePage.clickImplementationOfBST();
	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {

	    treePage.click_TreeDetails_PracticeQuestionsLink();
	}

	@Then("The user is redirected to Practice Questions page.")
	public void the_user_is_redirected_to_practice_questions_page() {

	    treePage.checkIfOn_PracticePage();
	}

	@When("The user clicks the ok button in the alert window")
	public void the_user_clicks_the_ok_button_in_the_alert_window() {

		treePage.clickOnOKBtnFromEditorErrorAlert();
	}

    @Then("Alert message window is dismissed and user stays on Editor page")
    public void Alert_message_window_is_dismissed_and_user_stays_on_Editor_page()
    {
    	treePage.check_When_EmptyCode_In_Editor();
    }

}
