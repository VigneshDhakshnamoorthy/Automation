package qumu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qumu.util.BrowserSetup;

public class CheckoutInform extends BrowserSetup {
	
	public CheckoutInform(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first-name") WebElement firstname;
	@FindBy(id="last-name") WebElement lastname;
	@FindBy(id="postal-cod") WebElement postalcode;
	@FindBy(xpath="//*[@class=\"btn_primary cart_button\"]") WebElement ClickContinue;
	
	public void EnterFirstName(String Fname) {
		firstname.sendKeys(Fname);

	}
	public void EnterLastName(String Lname) {
		lastname.sendKeys(Lname);

	}
	public void EnterZipCode(String Zipcode) {
		postalcode.sendKeys(Zipcode);

	}
	
	public void ClickContinue() {
		executor.executeScript("arguments[0].click();",ClickContinue);
	}
}
