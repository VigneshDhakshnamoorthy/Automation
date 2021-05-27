package interview.sample;

import java.io.File;
import java.io.FileInputStream;
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
		
        String File_loc = "./src/test/java/excel/rediff.xlsx";
		WebDriver driver;
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.addArguments("--headless");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver(firefoxOptions);
		driver.get("https://money.rediff.com/gainers/bse/daily/groupz");
		List<WebElement> table1  = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td/a"));

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
        FileOutputStream rediff_excel = new FileOutputStream(File_loc);
		workbook.write(rediff_excel);
		
		File read_ex = new File(File_loc);
		FileInputStream read_exc = new FileInputStream(read_ex);
		XSSFWorkbook read_book = new XSSFWorkbook(read_exc);
		XSSFSheet read_sheet = read_book.getSheet("rediff");
		int Row_count = read_sheet.getLastRowNum()-read_sheet.getFirstRowNum();
		for ( int i =0; i<Row_count;i++) {
			XSSFRow read_row = read_sheet.getRow(i);
			XSSFCell read_cell = read_row.getCell(0);
			System.out.println(read_cell);
		}
		
		
		
		
	}

}
