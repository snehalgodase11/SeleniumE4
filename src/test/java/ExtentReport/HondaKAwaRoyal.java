package ExtentReport;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.crm.Listeners.DWSExtentReport.class)
public class HondaKAwaRoyal {
@Test
public void honda()
{
	Reporter.log("i am honda",false);
	//Reporter.log("i am honda",true);
	WebDriver  driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.honda2wheelersindia.com/");
	
	assertEquals("snehal", "snehal");
}
@Test
public void kawasaki()
{
	Reporter.log("i am Kawasaki",false);
	WebDriver  driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://kawasaki-india.com/");
	assertEquals("snehal", "sneha");

}
@Test(dependsOnMethods = "kawasaki")
public void royal()
{
	Reporter.log("i am RoyelEnfield",false);
	
	WebDriver  driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.royalenfield.com/");
}
}
