package stepDefinations;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.*;
import utils.BrowserSetup;

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
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		if (scenario.isFailed()) {
			String timeStamp = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(Calendar.getInstance().getTime());
			String screenShotFilename = timeStamp+" -- "+Browsername+" -- "+driver.getTitle()+".png";
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        File desFile = new File(getproperty("ScreenshotLocation")+screenShotFilename);
	        try {
	            FileUtils.copyFile(scrFile, desFile);
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	        
			
		} else {
			System.out.println("---------------Test Successful------------------------");
		}
	
        driver.quit();
       
    }

}
