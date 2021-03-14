package qumu.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qumu.util.BrowserSetup;

public class CartPage extends BrowserSetup {

	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//*[@class='cart_footer']/*[text()='CHECKOUT']") WebElement clickoncheckout;
	@FindBy(xpath="//*[@class=\"btn_secondary btn_inventory\"]") WebElement RemoveCart;
	@FindBy(xpath="//*[@id=\"inventory_item_container\"]/div/button") WebElement Back;
	@FindBy(xpath="//*[contains(@class,'cart_quantity')]") List<WebElement> count;
	public void QTYcounitem(int itemcount) {
		
		for (int i =1; i<=itemcount;i++)
		{
			System.out.println("Item "+i+" Qty : "+count.get(i).getText());
		}

	}

	public void removeProduct(String ProNam) {
		
		executor.executeScript("arguments[0].click();",driver.findElement(By.linkText(ProNam)));
		executor.executeScript("arguments[0].click();",RemoveCart);
		executor.executeScript("arguments[0].click();",Back);
		
	}

	public void clickCheckout() {
		
		BrowserSetup.WaitCom(clickoncheckout);
		
	}


}
