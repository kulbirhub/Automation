package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;

@RunWith(Cucumber.class)
public class CucumberSearchSteps {
	WebDriver driver;
	HomePage homePage;
	CheckoutPage checkoutPage;
    @Given("^User is on GreenKart landing page$")
    public void user_is_on_greenkart_landing_page() throws Throwable {
    	driver = Base.getDriver();
    }

    @When("^User search for \"([^\"]*)\" vegetable$")
    public void user_search_for_something_vegetable(String strArg1) throws Throwable {
    	if(homePage == null)
    		homePage = new HomePage(driver);
    	
    	homePage.getSearch().sendKeys(strArg1);
    	Thread.sleep(5000);
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	if(homePage == null)
    		homePage = new HomePage(driver);
    	assertTrue(homePage.getProductName().getText().contains(strArg1));
    }
    
    
    
    @And("^Added items to cart$")
    public void added_items_to_cart() throws Throwable {
    	driver.findElement(By.cssSelector("a.increment")).click();
    	driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
    }

    @And("^Proceed to checkout page for purchase$")
    public void proceed_to_checkout_page_for_purchase() throws Throwable {
    	
    	driver.findElement(By.xpath("//header/div[1]/div[3]/a[4]/img[1]")).click();
    	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
    	
    }
    
    @When("^User searched for (.+) vegetables$")
    public void user_searched_for_vegetables(String name) throws Throwable {
    	if(homePage == null)
    		homePage = new HomePage(driver);	
    	homePage.getSearch().sendKeys(name);
    	Thread.sleep(5000);
    }
    
    @Then("^Verify selected (.+) items are displayed in Checkout pages$")
    public void verify_selected_items_are_displayed_in_checkout_pages(String name) throws Throwable {
    	if(checkoutPage == null)
    		checkoutPage = new CheckoutPage(driver);
    	assertTrue(checkoutPage.getProductName().getText().contains(name));
    }

    
//    @Then("^Verify selected \"([^\"]*)\" items are displayed in Checkout page$")
//    public void verify_selected_something_items_are_displayed_in_checkout_page(String strArg1) throws Throwable {
//
//    	assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
//    }
}
