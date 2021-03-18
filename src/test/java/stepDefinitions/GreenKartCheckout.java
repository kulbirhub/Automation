package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;
import Cucumber.Automation.Base;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import pageObjects.CheckoutPage;

@RunWith(Cucumber.class)
public class GreenKartCheckout extends Base{

	CheckoutPage checkoutPage;
	
    @Then("^Verify selected \"([^\"]*)\" items are displayed in Checkout page$")
    public void verify_selected_something_items_are_displayed_in_checkout_page(String strArg1) throws Throwable {
    	if(checkoutPage == null)
    		checkoutPage = new CheckoutPage(driver);
    	assertTrue(checkoutPage.getProductName().getText().contains(strArg1));
    }
}
