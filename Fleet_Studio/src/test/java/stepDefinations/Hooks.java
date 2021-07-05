package stepDefinations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.*;
import utils.BrowserSetup;

public class Hooks extends BrowserSetup {
	
	
	
	@Before
	public static void initializeTest(Scenario scenario) {
		getBrowser(getURL());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	

	}

	
	@After
	public void screenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	        scenario.attach(screenshot, "image/png", "image"); 
		} else {
			System.out.println("---------------Test Successful------------------------");
		}
		
        driver.quit();
       
    }

}
