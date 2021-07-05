package qumu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qumu.util.BrowserSetup;

public class HomePage extends BrowserSetup {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']") WebElement Cart_item_count;
	@FindBy(xpath="//a[@class='shopping_cart_link']") WebElement clickonCart;
	@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory']") WebElement AddCart;
	@FindBy(xpath="//button[@class='btn btn_secondary back btn_large inventory_details_back_button']") WebElement Back;
	
	public void AddProduct(String ProNam) {
				
		executor.executeScript("arguments[0].click();",driver.findElement(By.linkText(ProNam)));		
		executor.executeScript("arguments[0].click();",AddCart);		
		executor.executeScript("arguments[0].click();",Back);
		
	}
	
	public int Check_Cart_item_count() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		return Integer.parseInt(Cart_item_count.getText());

	}
	
	public void clickonCart() {
		executor.executeScript("arguments[0].click();",clickonCart);

	}

}
