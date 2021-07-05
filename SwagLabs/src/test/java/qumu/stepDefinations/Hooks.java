package qumu.stepDefinations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.*;
import qumu.util.BrowserSetup;

public class Hooks extends BrowserSetup {
	
	
	
	@Before
	public static void initializeTest() {
		getBrowser(getURL());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

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
