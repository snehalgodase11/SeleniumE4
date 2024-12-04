package BatchExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCcase9 {
	@Test
	public void Makemytrip()
	{
		Reporter.log("i am makemytrip",false);
		//Reporter.log("i am honda",true);
		WebDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.makemytrip.com/");
	}
	
}
