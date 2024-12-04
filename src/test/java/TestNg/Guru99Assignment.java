package TestNg;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Guru99Assignment {
	@Test(priority = 0)
	public void rightClickMe() throws InterruptedException
	{
		
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
						
			
			Actions act =new Actions(driver);			
			WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
			
			act.moveToElement(rightclick).contextClick().perform();
			List<WebElement> listElement = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
			for (WebElement web : listElement) 
			{
				web.click();
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
				act.moveToElement(rightclick).contextClick().perform();
				
			}
			driver.close();
	}
	
	@Test
	public void  doubleClick()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act1 =new Actions(driver);	
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act1.doubleClick(doubleclick).perform();
		driver.switchTo().alert().accept();
					
	}
	
	

}
