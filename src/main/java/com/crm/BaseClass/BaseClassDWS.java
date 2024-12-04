package com.crm.BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClassDWS {
	
	public static WebDriver driver=null;
	@BeforeClass
	public  void preCondition() 
	{
		driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");	
	}
	 
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("snehalgodase2001@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("sneha@123");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	
	}
	@AfterMethod
	
	public  void logout()
	{
		driver.findElement(By.cssSelector("a[class='ico-logout']")).click();
	}
	@AfterClass
	public void postCondition()
	{
		driver.quit();
	}

}
