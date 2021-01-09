package qumu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qumu.util.BrowserSetup;

public class LoginPage extends BrowserSetup {
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="user-name") WebElement Username;
	@FindBy(id="password") WebElement password;
	@FindBy(id="login-button") WebElement loginbutton;
	
	public void Login(String UserNa, String UserPas) {
		Username.clear();
		Username.sendKeys(UserNa);
		password.clear();
		password.sendKeys(UserPas);
		executor.executeScript("arguments[0].click();",loginbutton);		

	}
	
}
