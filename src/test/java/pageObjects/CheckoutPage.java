package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	WebDriver driver;
	
	By productName = By.cssSelector("p.product-name");
	
	public CheckoutPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebElement getProductName()
	{
		return driver.findElement(productName);
	}
}
