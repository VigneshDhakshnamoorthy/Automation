package Page_auto;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.WaitFor.Unit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fleet_Studio {
	@FindBy(xpath="//p[@class='md:text-xs text-black text-lg mb-2']")
	static List<WebElement>  Projec;
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://fleetstudio.com/");
		driver.findElement(By.id("menu-item-313")).click();
		List<WebElement> projects = driver.findElements(By.xpath("//p[@class='md:text-xs text-black text-lg mb-2']"));
		for (WebElement pro :  projects) {
			System.out.println(pro.getText());
		}
		for (WebElement pro :  Projec) {
			System.out.println(pro.getText());
		}
	}

}
