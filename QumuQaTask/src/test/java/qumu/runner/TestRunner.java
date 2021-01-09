package qumu.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="src/test/resources/Features",
		glue= {"qumu.stepDefinations"},
		monochrome = true,
		dryRun=false	
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
