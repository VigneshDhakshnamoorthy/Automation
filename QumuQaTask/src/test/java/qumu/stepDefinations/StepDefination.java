package qumu.stepDefinations;

import java.util.List;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.*;
import qumu.pages.CartPage;
import qumu.pages.CheckoutInform;
import qumu.pages.CheckoutOverview;
import qumu.pages.HomePage;
import qumu.pages.LoginPage;
import qumu.util.BrowserSetup;


public class StepDefination extends BrowserSetup {
	
	LoginPage Log ;
	HomePage Product;
	CartPage cart;
	CheckoutInform Chinf;
	CheckoutOverview Chove;
	int items;
	List<String> addproductdata,userdata,removeproductdata;
	

	
	@Given("I am on the home page")
	public void i_am_on_the_home_page() {
		
		System.out.println("i_am_on_the_home_page : "+driver.getTitle());		
		
	}

	@Given("I login in with the following details")
	public void i_login_in_with_the_following_details(io.cucumber.datatable.DataTable dataTable) {
		
		userdata = dataTable.row(1);
		Log = PageFactory.initElements(driver,LoginPage.class);
		Log.Login(userdata.get(0).toString(),userdata.get(1).toString());			
	
	}

	@Given("I add the following items to the basket")
	public void i_add_the_following_items_to_the_basket(io.cucumber.datatable.DataTable dataTable) {
		addproductdata = dataTable.asList();
		Product= PageFactory.initElements(driver,HomePage.class);
		for (int i=0;i<addproductdata.size();i++)
		{
			Product.AddProduct(addproductdata.get(i).toString());
		}
		
	}
	@Given("I  should see {int} items added to the shopping cart")
	public void i_should_see_items_added_to_the_shopping_cart(Integer int1) {
		
		items = Product.Check_Cart_item_count();		
		
		if (int1== items) {
			System.out.println("ItemCount is Right: "+items);
		}else {
			System.out.println("ItemCount is Wrong: "+items);
		}
		
	}
	
	@Given("I click on the shopping cart")
	public void i_click_on_the_shopping_cart() {
		Product.clickonCart();
	    
	}
	@Given("I verify that the QTY count for each item should be {int}")
	public void i_verify_that_the_qty_count_for_each_item_should_be(Integer int1) {
		
		cart = PageFactory.initElements(driver,CartPage.class);
		cart.QTYcounitem(items);	 
	}

	@Given("I remove the following item:")
	public void i_remove_the_following_item(io.cucumber.datatable.DataTable dataTable) {
		removeproductdata = dataTable.asList();
		for (int i=0;i<removeproductdata.size();i++)
		{
	    cart.removeProduct(removeproductdata.get(i).toString());
		}
	}

	@Given("I click on the CHECKOUT button")
	public void i_click_on_the_checkout_button() {
		cart.clickCheckout();
	}
	
	@Given("I type {string} for First Name")
	public void i_type_for_first_name(String Fname) {
		Chinf = new CheckoutInform(driver);
		Chinf.EnterFirstName(Fname);
	   
	}

	@Given("I type {string} for Last Name")
	public void i_type_for_last_name(String Lname) {
		Chinf.EnterLastName(Lname);
	}

	@Given("I type {string} for ZIP\\/Postal Code")
	public void i_type_for_zip_postal_code(String Zip) {
		Chinf.EnterZipCode(Zip);
	  
	}
	
	
	@When("I click on the CONTINUE button")
	public void i_click_on_the_continue_button() {
		
		Chinf.ClickContinue();
		
	}
	
	@Then("Item total will be equal to the total of items on the list")
	public void item_total_will_be_equal_to_the_total_of_items_on_the_list() {
	  
		Chove = PageFactory.initElements(driver,CheckoutOverview.class);
		Chove.itemTotal();
		
	}
	
	@Then("a Tax rate of {int} % is applied to the total")
	public void a_tax_rate_of_is_applied_to_the_total(Integer int1) {
		Chove.CheckTax();
	}

	
	
	
}
