package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSLogin {
	
	public DWSLogin(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	 
	@FindBy(className="ico-login")
	WebElement login_link;
	@FindBy(id="Email")
	WebElement email;
	@FindBy(name="Password")
	WebElement password;
	@FindBy(css="input[id='RememberMe']")
	WebElement remember_me;
	@FindBy(xpath="//input[@value='Log in']")
	WebElement login_button;
	
	public void login(String email1,String password1)
	{
		login_link.click();
		email.sendKeys(email1);
		password.sendKeys(password1);
		remember_me.click();
		login_button.click();
		
		
	}
	
	
	
	
//	public void loginLink()
//	{
//		login_link.click();
//	}
//	public void email(String data)
//	{
//		email.sendKeys(data);
//	}
//	public void password(String data)
//	{
//		password.sendKeys(data);
//	}
//    public void rememberMe()
//    {
//    	remember_me.click();
//    }
//    public void loginButton()
//    {
//    	login_button.click();
//    }
}
