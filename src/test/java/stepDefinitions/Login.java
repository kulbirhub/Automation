package stepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class Login {
	
    @Given("^Validate the browser$")
    public void validate_the_browser(){
    	 System.out.println("Validated Browser");
    }

    @When("^Browser is triggred$")
    public void browser_is_triggred(){
    	 System.out.println("Browser is Triggered");
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started(){
    	 System.out.println("Browser is started");
    }
    
    
	 @Given("^User is on landing page$")
	    public void user_is_on_landing_page() throws Throwable {
	       // code for navigating to landing page
		 System.out.println("Navigated to Login URL");
	    }

//	    @When("^User login into application with username and password$")
//	    public void user_login_into_application_with_username_and_password() throws Throwable {
//	        // code to login into application
//	    	System.out.println("Logged in Successfully");
//	    }

	 @When("User login into application with {string} and password {string}")
	 public void user_login_into_application_with_and_password(String arg1, String arg2) {
	     // Write code here that turns the phrase above into concrete actions
		 System.out.println(arg1 +" Logged in Successfully with password "+ arg2);
	 }
	 
	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	        // code for validating home page
	    	System.out.println("Validated Home Page");
	    }

//	    @And("^Cards are displayed$")
//	    public void cards_are_displayed() throws Throwable {
//	        //code for validating the cards
//	    	System.out.println("Validated Cards");
//	    }

	    
	    @Then("Cards displayed are {string}")
	    public void cards_displayed_are(String status) {
	        // Write code here that turns the phrase above into concrete actions
	    	System.out.println("Validated Cards :"+ status); 
	    }
	    
	    @When("User signup with following details")
	    public void user_signup_with_following_details(DataTable dataTable) {
	        List<List<String>> obj = dataTable.asLists();
	        System.out.println(obj.get(0).get(0));
	        System.out.println(obj.get(0).get(1));
	        System.out.println(obj.get(0).get(2));
	        System.out.println(obj.get(0).get(3));
	        System.out.println(obj.get(0).get(4));
	        
	    }
	    
	    
	    @When("^User login in to application with (.+) and password (.+)$")
	    public void user_login_in_to_application_with_and_password(String username, String password) {

	    	System.out.println(username +" Logged in Successfully with password "+ password);
	    }
}
