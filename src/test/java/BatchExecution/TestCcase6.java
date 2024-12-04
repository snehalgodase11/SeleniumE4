package BatchExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCcase6 {
	@Test
	public void Myntra()
	{
		Reporter.log("i am myntra",false);
		//Reporter.log("i am honda",true);
		WebDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
	}
	
}
