package stepDefinations;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.WorkPage;
import utils.BrowserSetup;

public class StepDefinations extends BrowserSetup {
	HomePage homepage;
	WorkPage workpage;
	
	@Given("navigate to workpage")
	public void navigate_to_workpage() {
		homepage = PageFactory.initElements(driver,HomePage.class);
		homepage.Clickon_WorkPage();
		
	}
	@When("filter by {string} and check projects count is {int}")
	public void filter_by_and_check_projects_count_is(String filter_name, Integer count) {
		workpage = PageFactory.initElements(driver,WorkPage.class);
		Integer Actual_Count = workpage.filterBy_checkcount(filter_name);
		Integer Require_Count = count;
		assertEquals(Actual_Count, Require_Count);

	}
	
	@Then("check company {string} is display in {string} filter")
	public void check_company_is_display_in_filter(String pro_name, String filter) {
		Assert.assertTrue(workpage.project_check(pro_name));
	
	}

	@Then("navigate to homepage")
	public void navigate_to_homepage() {
		workpage.navigate_homepage();
		
		
	}
	
	}

