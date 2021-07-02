package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features="@rerun/failed_scenarios.txt",
		glue= {"stepDefinations"},
		monochrome = true,
		dryRun=false,
		plugin = {
				"pretty", "html:target/cucumber-report/single"}

		)

public class FailureReRunner extends AbstractTestNGCucumberTests {

}
