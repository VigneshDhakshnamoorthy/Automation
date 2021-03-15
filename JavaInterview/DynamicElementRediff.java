package trailtests;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicElementRediff {
	static WebDriver driver;
	@Test
	public void Rediff() throws Throwable {
		WebDriverManager.chromedriver().setup();
		
		
		driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupz");
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		List<WebElement> companyNames = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[1]"));
		
		File file= new File("C:/Users/vigne/Documents/Excel/moneydata.xlsx");
		FileOutputStream fout = new FileOutputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("Rediff");
		XSSFRow row;
		row = sh.createRow(0);
		row.createCell(0).setCellValue("Company");
		row.createCell(1).setCellValue("Group");
		row.createCell(2).setCellValue("PrevClose");
		row.createCell(3).setCellValue("CurrentPrice");
		row.createCell(4).setCellValue("Change");
		
		
		for ( int i =0 ; i <companyNames.size();i++) {
			
			String compna = companyNames.get(i).getText();
			String Company =driver.findElement(By.xpath("//*[contains(text(),'"+compna+"')]/ancestor::tr/td[1]")).getText();
			String Group =driver.findElement(By.xpath("//*[contains(text(),'"+compna+"')]/ancestor::tr/td[2]")).getText();
			String PrevClose  =driver.findElement(By.xpath("//*[contains(text(),'"+compna+"')]/ancestor::tr/td[3]")).getText();
			String CurrentPrice =driver.findElement(By.xpath("//*[contains(text(),'"+compna+"')]/ancestor::tr/td[4]")).getText();
			String Change =driver.findElement(By.xpath("//*[contains(text(),'"+compna+"')]/ancestor::tr/td[5]")).getText();
		
			row = sh.createRow(i+1);
			row.createCell(0).setCellValue(Company);
			row.createCell(1).setCellValue(Group);
			row.createCell(2).setCellValue(Double.parseDouble(PrevClose.replace(" ", "")));
			row.createCell(3).setCellValue(Double.parseDouble(CurrentPrice.replace(" ", "")));
			row.createCell(4).setCellValue(Double.parseDouble(Change.replace("+ ", "")));
		}
		wb.write(fout);
		
		FileInputStream fin = new FileInputStream (file);
		wb = new XSSFWorkbook(fin);
		sh = wb.getSheet("Rediff");
		int LastRow = sh.getLastRowNum();
		
		System.out.print(sh.getRow(0).getCell(1).getStringCellValue());
		System.out.print("  ");
		System.out.print(sh.getRow(0).getCell(2).getStringCellValue());
		System.out.print("  ");
		System.out.print(sh.getRow(0).getCell(3).getStringCellValue());
		System.out.print("  ");
		System.out.print(sh.getRow(0).getCell(4).getStringCellValue());
		System.out.print("  ");
		System.out.print(sh.getRow(0).getCell(0).getStringCellValue());
		System.out.println();
		
		for (int i =1; i<LastRow;i++) {
			
			
			System.out.print(sh.getRow(i).getCell(1).getStringCellValue());
			System.out.print("       ");
			System.out.print(sh.getRow(i).getCell(2).getNumericCellValue());
			System.out.print("       ");
			System.out.print(sh.getRow(i).getCell(3).getNumericCellValue());
			System.out.print("       ");
			System.out.print(sh.getRow(i).getCell(4).getNumericCellValue());
			System.out.print("       ");
			System.out.print(sh.getRow(i).getCell(0).getStringCellValue());
			System.out.println();
			
		}
		
		driver.quit();


	}









}
