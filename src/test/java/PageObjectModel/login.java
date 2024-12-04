package PageObjectModel;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DWSLogin;

public class login {
	@Test
	public void main()
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");	
		assertEquals("https://demowebshop.tricentis.com/", driver.getCurrentUrl());
		DWSLogin ref=new DWSLogin(driver);
		ref.login("admin01@gmail.com","admin01@");
		
//	    ref.loginLink();
//		ref.email("snehalgodase2001@gmail.com");
//		ref.password("Snehal2001@");
//		ref.rememberMe();		ref.loginButton();
		
	}

}
