package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// PRACTICE WEBSITE : https://rahulshettyacademy.com/seleniumPractise/#/

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features"
		,glue={"stepDefinitions"}
		,tags = "@GreenKartSearchRegression" // and @SmokeTest,   RegTest" ,@GreenKartSearchSmoke
		,plugin= {"pretty","html:target/cucumber.html","junit:target/cukes.xml"}
		)
public class TestRunner {

}
