package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
	@org.testng.annotations.DataProvider(name="login")
	public Object[][] provider() throws EncryptedDocumentException, IOException{
	Object[][]obj=new Object[2][2];
//	obj[0][0]="admin01@gmail.com";
//	obj[0][1]="admin01";
//	obj[1][0]="admin02@gmail.com";
//	obj[1][1]="admin02";
	
//	FileInputStream fis=new FileInputStream("C:\\Users\\User\\Desktop\\seleniumExcel\\DWSlogin.xlsx");
//	Workbook wb=WorkbookFactory.create(fis);
//	wb.getSheet("sheet1");
	
	
	
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
