package pages;

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
	private List<WebElement>  Projec;
	@FindBy(xpath="//select[@class='p-4 md:p-2 border uppercase border-gray-500 min-w-full md:min-w-max md:inline-block']")
	private WebElement  filter_by;
	
	public int filterBy_checkcount() {
		
		Select filterBy = new Select(filter_by);
		filterBy.selectByVisibleText("QA");
		return Projec.size();
	
	}
	public void project_check() {
		Select filterBy = new Select(filter_by);
		String Selected_option = filterBy.getFirstSelectedOption().getText();
		if (Selected_option.equalsIgnoreCase("QA")) {
			
		}
		
		
	}
	

}
