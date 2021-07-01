package Guru_Search_check;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru_check {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.guru.com/");
		driver.findElement(By.id("topnav-find-a-job")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement filter_btn = driver.findElement(By.xpath("//div[@class='filterLayout__btn']/button[@class='module_btn outline_btn outline_btn--secondary lonely_btn']"));
		wait.until(ExpectedConditions.visibilityOf(filter_btn)).click();
		

		List<WebElement> country = driver.findElements(By.xpath("//div[@class='rhythmMargin1']/following-sibling::div/ul/li"));
		for ( WebElement li : country) {
			String act_count = li.getText();
			String exp_count = "United States (146)";
			System.out.println(li.getText());
			if (act_count.equalsIgnoreCase(exp_count)) {
				li.click();
			}
			
		}

		driver.findElement(By.cssSelector("html#ctl00_html_tag body.responsive.resp form#aspnetForm.responsive.resp main.mainContent main#search-app div section div.container div.module_pageControls div.filterLayout div.filterLayout__btn.open div.resp-dropdown.resp-dropdown--right div.resp-dropdown__wrapper div.resp-dropdown__actions button.module_btn.primary_btn.lonely_btn")).click();
		

		
	}
	
}
