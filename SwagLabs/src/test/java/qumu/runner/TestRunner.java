package qumu.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features="src/test/resources/Features/UI-Test.feature",
		glue= {"qumu.stepDefinations"},
		monochrome = true,
		dryRun=false,
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"pretty", "html:target/cucumber-report/single",
				"rerun:rerun/failed_scenarios.txt"}

		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
