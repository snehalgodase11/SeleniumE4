package PageObjectModel;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DWSRegister;

public class register {
	@Test
	public void main() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		assertEquals("https://demowebshop.tricentis.com/",driver.getCurrentUrl());
		DWSRegister ref=new DWSRegister(driver);
		
		ref.Register("snehal","godase","snehalgodase2001@gmail.com","sneha@123","sneha@123");
	}


}
