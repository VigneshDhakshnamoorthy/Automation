package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features="src/test/resources/Features/Workpage.feature",
		glue= {"stepDefinations"},
		monochrome = true,
		dryRun=true,
		plugin = {
				"pretty", "html:target/cucumber-report/single",
				"rerun:rerun/failed_scenarios.txt"}

		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
