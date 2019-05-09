package stepdefinition;
import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

public class Steps {
	@RunWith(Cucumber.class)
	public class MyStepDefinitions {

	    @Given("^user is on homepage.$")
	    public void user_is_on_homepage1() throws Throwable {
	        throw new PendingException();
	    }

	    @When("^navigates to login page and user enters (.+) and (.+).$")
	    public void navigates_to_login_page_and_user_enters_and_(String username, String password) throws Throwable {
	        throw new PendingException();
	    }

	    @When("^navigates to T-SHIRTS and select Faded Short Sleeve T-shirt and add to cart.$")
	    public void navigates_to_tshirts_and_select_faded_short_sleeve_tshirt_and_add_to_cart() throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^login is successfully.$")
	    public void login_is_successfully() throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^Shirt is added to the cart.$")
	    public void shirt_is_added_to_the_cart() throws Throwable {
	        throw new PendingException();
	    }
	    
	    @Given("^user is on homepage.$")
	    public void user_is_on_homepage() throws Throwable {
	        throw new PendingException();
	    }

	    @When("^navigates to Update personal information and select First name and change and save it.$")
	    public void navigates_to_update_personal_information_and_select_first_name_and_change_and_save_it() throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^First name gets changed.$")
	    public void first_name_gets_changed() throws Throwable {
	        throw new PendingException();
	    }

	}

}
