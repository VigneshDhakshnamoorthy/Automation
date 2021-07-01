package selenium.samples;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import browser.setup.browser_class;

public class dropdown_select {
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver = browser_class.getBrowser("firefox");
//		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
//		
//		Select drop_lists_sel = new Select(driver.findElement(By.id("select-demo")));
//		List <WebElement> options = drop_lists_sel.getOptions();
//		options.forEach(option -> {System.out.println(option.getText());});
//		Thread.sleep(5000);
		driver.navigate().to("https://www.seleniumeasy.com/test/bootstrap-dual-list-box-demo.html");
		List <WebElement> List_opts = driver.findElements(By.xpath("//*[@class='well text-right']//li"));
		List_opts.forEach(List_opt -> {System.out.println(List_opt.getText());});
		for (WebElement List_opt:List_opts) {
			if (List_opt.getText().equals("Dapibus ac facilisis in")) {
				List_opt.click();
				break;
			}
		}
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		driver.switchTo().window(iterator.next());
		driver.quit();
	}
	

}
