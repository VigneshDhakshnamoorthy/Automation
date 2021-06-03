package selenium.samples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import browser.setup.browser_class;

public class dropdown_select {
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver = browser_class.getBrowser("firefox");
		driver.get("https://www.seleniumeasy.com/test/bootstrap-dual-list-box-demo.html");
		
		Select drop_lists_sel = new Select(driver.findElement(By.xpath("")));
		System.out.println(drop_lists_sel.getOptions());
		Thread.sleep(5000);
		driver.quit();

	}
	

}
