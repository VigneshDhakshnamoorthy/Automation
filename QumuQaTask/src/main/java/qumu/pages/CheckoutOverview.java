package qumu.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qumu.util.BrowserSetup;

public class CheckoutOverview extends BrowserSetup {
	double ItemEachTotal = 0,ItemTotal,ItemEachTotalTax,ItemTotalTax;

	public CheckoutOverview(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"checkout_summary_container\"]/div/div[2]/div[5]") WebElement Total;
	@FindBy(xpath="//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]") WebElement TotalTax;
	@FindBy(xpath="//*[contains(@class,'inventory_item_price')]") List<WebElement> itemValue;
	public void itemTotal() {
		
		for (int i =0; i<itemValue.size();i++)
		{
			System.out.println("Item "+(i+1)+" Price : "+Double.parseDouble(itemValue.get(i).getText().replace("$", "")));
			ItemEachTotal=ItemEachTotal+Double.parseDouble(itemValue.get(i).getText().replace("$", ""));

		}

		System.out.println("ItemEachTotal: "+ItemEachTotal);
		ItemTotal=Double.parseDouble(Total.getText().replace("Item total: $", ""));
		System.out.println("ItemTotal: "+ItemTotal);
		if(Double.compare(ItemEachTotal,ItemTotal)==0) {
			System.out.println("ItemTotal Value is Correct");
		}else {
			System.out.println("ItemTotal Value is NOT Correct");
		}
	}

	public void CheckTax() {
		ItemEachTotalTax=Math.round((ItemEachTotal*8)/100*100.0)/100.0;
		System.out.println("ItemEachTotal Tax: "+ItemEachTotalTax);
		ItemTotalTax=Double.parseDouble(TotalTax.getText().replace("Tax: $", ""));
		System.out.println("ItemTotalTax Tax: "+ItemTotalTax);
		if(Double.compare(ItemEachTotalTax,ItemTotalTax)==0) {
			System.out.println("ItemTotal Tax is Correct");
		}else {
			System.out.println("ItemTotal Tax is NOT Correct");
		}


	}
}
