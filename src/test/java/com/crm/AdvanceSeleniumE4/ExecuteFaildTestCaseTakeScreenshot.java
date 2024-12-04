package com.crm.AdvanceSeleniumE4;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClassDWS;
@Listeners(com.crm.Listeners.DWSExtentReport.class)
public class ExecuteFaildTestCaseTakeScreenshot  extends BaseClassDWS{
	@Test
	public void main() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
		List<WebElement> products = driver.findElements(By.cssSelector("input[value='Add to cart']"));
		for (WebElement web : products)
		{
			web.click();
			Thread.sleep(3000);	
		}
    assertEquals("java", "selenium");
}}
