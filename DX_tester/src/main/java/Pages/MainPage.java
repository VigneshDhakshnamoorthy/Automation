package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BrowserSetup;

public class MainPage extends BrowserSetup {

	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="lbl_val") List<WebElement> Value_names;
	@FindBy(name="txt_val") List<WebElement> Value_amounts;	
	@FindBy(id="lbl_ttl_val") WebElement TotalBal;
	@FindBy(id="txt_ttl_val") WebElement TotalBal_amount;
	
	public static double d_amount,d_total,d_totalamount ;
	public static String s_amount,s_totalamount;


	public void ValuesNames() {

		for (WebElement names:Value_names) {
			System.out.println(names.getText());
		}

		
		if ( Value_names.size()==5)
		{
			System.out.println("Total "+Value_names.size()+" Count of Values is Correct");

		}else {
			System.out.println("Total "+Value_names.size()+" Count of Values is Wrong");
		}
		System.out.println();
	}

	public void ValueAmounts() {
	

		int am_count = 0;
		for (WebElement amount:Value_amounts) {
			s_amount=amount.getText().replace("$", "").replace(",", "");
			d_amount=Double.parseDouble(s_amount);
			if(d_amount>0) {
				System.out.println(d_amount);
				am_count++;
			}else {
				System.out.println(d_amount+" is Not Greater than 0");
			}
			
		}
		
		if (am_count == Value_amounts.size()) {
			System.out.println("All "+am_count+" Values are Greater Than 0");
		}else {
			System.out.println((Value_amounts.size()-am_count)+" Values are NOT Greater Than 0");
		}
		
		System.out.println();
	}
	
	
	public void TotalBal() {
		if (TotalBal_amount.getText().equalsIgnoreCase("$1,000,000.00")){
			
			System.out.println(TotalBal_amount.getText()+" is Correct as per Screen");
		}else {
			System.out.println(TotalBal_amount.getText()+" is Not Correct as per Screen");
		}
		
		System.out.println();
	}
	
	public void Currency() {
		
		int cur_count=0;
		for (WebElement amount:Value_amounts) {
			if(amount.getText().contains("$")) {
				System.out.println(amount.getText());
				cur_count++;
			}
		}
		
		if (cur_count==Value_amounts.size())
		{
			System.out.println("All "+cur_count+" Values are formatted as currencies $ ");
		}else {
			System.out.println((Value_amounts.size()-cur_count)+" Values are Not formatted as currencies $ ");
		}
		
		System.out.println();
	}

	public void Verify_TotalBal_Values() {
		
			
		
		for (WebElement amount:Value_amounts) {
			s_amount=amount.getText().replace("$", "").replace(",", "");
			d_amount=Double.parseDouble(s_amount);
			d_total=d_total+d_amount;
		}
		System.out.println("Total Balance as per Values is "+d_total);
	
		s_totalamount=TotalBal_amount.getText().replace("$", "").replace(",", "");
		d_totalamount=Double.parseDouble(s_totalamount);
		System.out.println("Total Balance as per Screen is "+d_totalamount);
		
		if (Double.compare(d_total, d_totalamount)==0) {
			
			System.out.println("Total Balance match");
		}else {
			System.out.println("Total Balance NOT match");
		}
		
	
	
	}




}
