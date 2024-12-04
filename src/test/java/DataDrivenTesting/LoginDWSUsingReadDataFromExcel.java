package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDWSUsingReadDataFromExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement log = driver.findElement(By.xpath("//a[@class='ico-login']"));
		log.click();
		
		//adress of excel file
		  FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\DWSlogin.xlsx");
  		Workbook wb = WorkbookFactory.create(fis);
  	      org.apache.poi.ss.usermodel.Sheet sheet =  wb.getSheet("Sheet2");
  	      String email = sheet.getRow(0).getCell(0).toString();
  	      String pass = sheet.getRow(0).getCell(1).toString();
  	      String search = sheet.getRow(1).getCell(1).toString();
  	      
  	      //pass the value in dws
  	      driver.findElement(By.id("Email")).sendKeys(email);
  	    driver.findElement(By.id("Password")).sendKeys(pass);
  	  driver.findElement(By.id("RememberMe")).click();
  	  driver.findElement(By.cssSelector("input[Value='Log in']")).click();
  	      
  	      
	}

	
	
}
