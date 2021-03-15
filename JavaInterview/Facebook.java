package trailtests;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	static WebDriver chrome;
	static JavascriptExecutor exe = (JavascriptExecutor)chrome;
	
	
	public static void main(String[] args) throws Throwable {	
		
		
		
		WebDriverManager.chromedriver().setup();
		chrome= new ChromeDriver();
		chrome.get("http://www.facebook.com");
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chrome.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		chrome.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		chrome.findElement(By.name("firstname")).sendKeys("KMDV");
		chrome.findElement(By.name("lastname")).sendKeys("KMDV");
		chrome.findElement(By.name("reg_email__")).sendKeys("KMDV@gmail.com");
		chrome.findElement(By.name("reg_email_confirmation__")).sendKeys("KMDV@gmail.com");
		chrome.findElement(By.name("reg_passwd__")).sendKeys("KMDV@1990");
		Select birthday_day = new Select(chrome.findElement(By.name("birthday_day")));
		Select birthday_month = new Select(chrome.findElement(By.name("birthday_month")));
		Select birthday_year = new Select(chrome.findElement(By.name("birthday_year")));
		
		birthday_day.selectByVisibleText("6");		
		birthday_month.selectByVisibleText("Apr");		
		birthday_year.selectByVisibleText("1990");
		
		
	
		Collection<String> day = new LinkedList <String> ();
		Collection<String> month = new LinkedList <String> ();
		Collection<String> year = new LinkedList <String> ();
		
		List <WebElement> birD = birthday_day.getOptions();
		for (WebElement bds:birD) {
			day.add(bds.getText());
			
		}
		List <WebElement> birM = birthday_month.getOptions();
		for (WebElement bds:birM) {
			month.add(bds.getText());
		}
		List <WebElement> birY = birthday_year.getOptions();
		for (WebElement bds:birY) {
			year.add(bds.getText());
		}
		day.remove("Day");
		month.remove("Month");
		year.remove("Year");
		
	
		
		
		WebElement birSEL =birthday_month.getFirstSelectedOption();
		System.out.println(birSEL.getText());
		boolean bmim =birthday_month.isMultiple();
		System.out.println(bmim);
		
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
		
		
		
		
	
		chrome.findElement(By.xpath("//*[@class='_5k_3']/span[2]//*[@class='_8esa']")).click();
		
		Actions acc = new Actions(chrome);
		acc.moveToElement(chrome.findElement(By.xpath("//*[@class='_8idr img']"))).click().perform();
		Thread.sleep(2000);
		acc.contextClick(chrome.findElement(By.xpath("//*[@id='reg_pages_msg']/a"))).perform();
		
		Robot rob = new Robot();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(2000);
		String home = chrome.getWindowHandle();
		Set<String> tabs = chrome.getWindowHandles();
		String Child = null;
		
	
		
		System.out.println(tabs.size());
		for (String tab:tabs) {
			if (!tab.equals(home)) {
				Child = tab;
			}
		}
		
		Thread.sleep(2000);
		chrome.switchTo().window(Child);
		Thread.sleep(2000);
		chrome.switchTo().window(home);
		Thread.sleep(2000);
		chrome.switchTo().window(Child);
		Thread.sleep(2000);
		chrome.quit();
		
		
	}
	

}
