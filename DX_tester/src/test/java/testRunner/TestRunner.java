package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="src/test/resources/Features",
		glue= {"stepDefinations"},
		monochrome = true,
		dryRun=false	
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
