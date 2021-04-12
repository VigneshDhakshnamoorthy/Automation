package stepDefinations;



import org.openqa.selenium.support.PageFactory;

import Pages.MainPage;
import io.cucumber.java.en.*;

import util.BrowserSetup;

public class StepDefination extends BrowserSetup {
	MainPage Main ;

	@Given("Open URL")
	public void open_url() {
		System.out.println("We Are on URL : "+driver.getCurrentUrl());
		
	}

	@Given("Need to verify the right count of values appear on the screen")
	public void need_to_verify_the_right_count_of_values_appear_on_the_screen() {
		Main = PageFactory.initElements(driver, MainPage.class);
		Main.ValuesNames();
	}

	@Given("Need to verify the values on the screen are greater than {int}")
	public void need_to_verify_the_values_on_the_screen_are_greater_than(Integer int1) {
		Main.ValueAmounts();
	}

	@Given("Need to verify the total balance is correct based on the values listed on the screen")
	public void need_to_verify_the_total_balance_is_correct_based_on_the_values_listed_on_the_screen() {
		Main.TotalBal();
	}

	@Given("Need to verify the values are formatted as currencies")
	public void need_to_verify_the_values_are_formatted_as_currencies() {
		Main.Currency();
	}

	
	@Given("Need to verify the total balance matches the sum of the values")
	public void need_to_verify_the_total_balance_matches_the_sum_of_the_values() {
		Main.Verify_TotalBal_Values();
	}

}
