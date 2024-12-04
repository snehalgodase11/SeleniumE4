package TestNg2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Adidas {
	@Test(groups  ="smoke")
	public void adidas()
	{
		Reporter.log("i am Adidas",false);
		
		WebDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.adidas.co.in/");
	}

}
