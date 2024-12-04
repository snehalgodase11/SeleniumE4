package BatchExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCcase1 {
	@Test
	public void honda()
	{
		Reporter.log("i am honda",false);
		//Reporter.log("i am honda",true);
		WebDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.honda2wheelersindia.com/");
	}
	@Test
	public void kawasaki()
	{
		Reporter.log("i am Kawasaki",false);
		WebDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://kawasaki-india.com/");
	}

	@Test
	public void royal()
	{
		Reporter.log("i am RoyelEnfield",false);
		
		WebDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalenfield.com/");
	}
}
