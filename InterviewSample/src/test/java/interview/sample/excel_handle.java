package interview.sample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class excel_handle {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver;
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.addArguments("--headless");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver(firefoxOptions);
		driver.get("https://money.rediff.com/gainers/bse/daily/groupz");
		List<WebElement> table1  = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td/a"));
		
		for(WebElement tab:table1) {
			
			System.out.println(tab.getText());
		}
		
		XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("rediff");
        int count = 0;
        for(WebElement tab:table1) {
        	   XSSFRow row = sheet.createRow(count);
        	   XSSFCell cell = row.createCell(0);
        	   cell.setCellValue(tab.getText());
        	   count++;
        			
        	
        }
        driver.quit();
        FileOutputStream rediff_excel = new FileOutputStream("./src/test/java/excel/rediff.xlsx");
		workbook.write(rediff_excel);
	}

}
