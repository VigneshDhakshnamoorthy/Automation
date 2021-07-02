package Page_auto;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.WorkPage;
import utils.BrowserSetup;

public class fleet_studio_stepDef extends BrowserSetup {
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
		System.out.println(workpage.filterBy_checkcount(filter_name));
	}
	@Then("check {string} is display in this filter")
	public void check_is_display_in_this_filter(String pro_name) {
		System.out.println(workpage.project_check(pro_name));
	}

	@Then("navigate to homepage")
	public void navigate_to_homepage() {
		workpage.navigate_homepage();
	}
	
	}

