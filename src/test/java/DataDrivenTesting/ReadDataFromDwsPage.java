package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromDwsPage{

	
		public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
			// TODO Auto-generated method stub
			String Expected_url="https://demowebshop.tricentis.com/";
			//open browser
			ChromeDriver driver=new ChromeDriver();
			
			//maximize
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			driver.get("https://demowebshop.tricentis.com/");
			
			//slepp condition
			Thread.sleep(3000);
			
		String Actual_Result=driver.getCurrentUrl();
		if(Expected_url.equals(Actual_Result))
		{
			System.out.println("i am in right page");
			System.out.println("i am in dws page");
			driver.findElement(By.linkText("Log in")).click();
			FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\DWSlogin.xlsx");
				Workbook wb = WorkbookFactory.create(fis);
			      org.apache.poi.ss.usermodel.Sheet sheet =  wb.getSheet("Sheet2");
			      String email1 = sheet.getRow(0).getCell(0).toString();
			      String pass1=sheet.getRow(0).getCell(1).toString();
			    String search=sheet.getRow(1).getCell(0).toString();
			     
			driver.findElement(By.id("Email")).sendKeys(email1);
			driver.findElement(By.id("Password")).sendKeys(pass1);
			driver.findElement(By.id("RememberMe")).click();
			driver.findElement(By.cssSelector("input[value='Log in']")).click();
			driver.findElement(By.id("small-searchterms")).sendKeys(search);
			//driver.findElement(By.className("button-1 search-box-button")).click();
			Thread.sleep(3000);
			driver.findElement(By.className("ico-logout")).click();
			
			
		
		}
		else
		{
			System.out.println("i am not in right page");
		}
	}

}
