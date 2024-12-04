package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProviderwithLoop {
	public class DataProvider {
		@org.testng.annotations.DataProvider(name="login")
		public Object[][] provider() throws EncryptedDocumentException, IOException{
			
		//we are using this adress from resources
		FileInputStream fis=new FileInputStream(".\\src\\main\\resources\\DWSlogin.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet("sheet1");
		int row = sheet.getPhysicalNumberOfRows();
		int colm = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] obj=new Object[row][colm];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < colm; j++) {
				obj[i][j]=sheet.getRow(i).getCell(j).toString();
				
			}
			
		}
			
		
		
		
		
		
		return obj;
		
		}
		@Test(dataProvider = "login")
		public void receiver(String username,String password) throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get("https://demowebshop.tricentis.com/");	
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.id("RememberMe")).click();
			driver.findElement(By.cssSelector("input[value='Log in']")).click();
			driver.close();
		
			
		}
		

	}


}
