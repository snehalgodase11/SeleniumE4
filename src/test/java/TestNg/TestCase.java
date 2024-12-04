package TestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClassDWS;

public class TestCase extends BaseClassDWS {
	String Expected_url="https://demowebshop.tricentis.com/news/rss/1";
	@Test
	public void testCase1() throws InterruptedException
	{
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li"));
		for (WebElement web : links) {
			web.click();
			Thread.sleep(3000);
			String Actual_url=driver.getCurrentUrl();
			if(Expected_url.equals(Actual_url))
			{
				driver.navigate().back();
			}
			
			Thread.sleep(3000);
		}
		System.out.println("testCase 1");
	}
	@Test
	public void testCase2()
	{
		driver.findElement(By.id("small-searchterms")).sendKeys("jwellery");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println("testCase 2");
	}

}
