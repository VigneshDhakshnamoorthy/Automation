		package utils;


import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup extends LoadProp {

	
	public static WebDriver driver;
	public static String Browsername;
	public static Properties prop; 
	public JavascriptExecutor executor = (JavascriptExecutor)driver;

	
	public static String getURL() {
		
		String URL=getproperty("URL").toString();
		return URL; 

	}
	
	public static void getBrowser(String URL) {
		
		Browsername=getproperty("browser");
		
		switch (Browsername.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		case "chromeheadless":
			ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);
            break;
            
		case "firefoxheadless":
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.addArguments("--headless");
			WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(firefoxOptions);
            break;
            
		default:
			System.out.println("Enter Browser Name From chrome,firefox,edge,chromeHeadless,firefoxHeadless");
			break;
		}
	
		System.out.println("Opening "+Browsername+" Browser...");
		System.out.println();		
		driver.get(URL);
	
		
			
	}

	
	public static void WaitCom(WebElement we) {
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(we)).click();
	}
	

	

	
	
	
}
