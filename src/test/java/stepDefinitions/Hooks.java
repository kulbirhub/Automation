package stepDefinitions;

import Cucumber.Automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{
	
	@Before("@MobileTest")
	public void beforeValidation() {
		System.out.println("Mobile Before ");
	}

	@After("@MobileTest")
	public void afterValidation() {
		System.out.println("Mobile After ");
	}
	
	@After("@GreenKartSearchRegression")
	public void afterGreenKartRegression() {
		driver.close();
	}
	
	@After("@GreenKartSearchSmoke")
	public void afterGreenKartSmoke() {
		driver.close();
	}
}
