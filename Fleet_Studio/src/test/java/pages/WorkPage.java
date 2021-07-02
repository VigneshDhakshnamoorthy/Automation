package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WorkPage {
	public WorkPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[@class='md:text-xs text-black text-lg mb-2']")
	private List<WebElement>  projects_name;
	@FindBy(xpath="//select[@class='p-4 md:p-2 border uppercase border-gray-500 min-w-full md:min-w-max md:inline-block']")
	private WebElement  filter_by;
	@FindBy(xpath="//a[@class='custom-logo-link']")
	private WebElement  homepage_logo;
	
	private ArrayList<String> Companies = new ArrayList<String>();
	private void convert_listelement() {
		
		for ( WebElement proj : projects_name) {
			Companies.add(proj.getText());
		}
		
		
	}
	
	public int filterBy_checkcount(String filter_name) {
		
		Select filterBy = new Select(filter_by);
		filterBy.selectByVisibleText(filter_name);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return projects_name.size();
	
	}
	public boolean project_check(String pro_name) {
		convert_listelement();
		return Companies.contains(pro_name);
		 
		
		
	}
	
	public void navigate_homepage() {
		homepage_logo.click();
	}
}
