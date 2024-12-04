package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSHomePage {
	
   DWSHomePage(WebDriver driver)
   {
	   PageFactory.initElements( driver,this);
   }
   @FindBy(xpath="//img[@alt='Tricentis Demo Web Shop']")
   WebElement dwsTitle;
  
   @FindBy(className ="ico-register")
	WebElement register_link;
   
   @FindBy(className ="ico-login")
  	WebElement login_link;
   
   @FindBy(xpath="//span[text()='Shopping cart']")
   WebElement Shopping_cart_link;
   
   @FindBy(xpath="//span[text()='Wishlist']")
   WebElement Wishlist_link;
   
   @FindBy(id =" small-searchterms")
 	WebElement search_field;
   
   @FindBy(xpath="//input[@value='Search']")
   WebElement search_button;
   
   @FindBy(xpath="(//a[contains(text(),'Books')])[1]")
   WebElement books_link;
   
   @FindBy(xpath="(//a[contains(text(),'Computers')])[1]")
   WebElement computers_link;
   
   @FindBy(xpath="(//a[contains(text(),'Electronics')])[1]")
   WebElement electronics_link;
   
   @FindBy(xpath="(//a[contains(text(),'Apparel & Shoes')])[1]")
   WebElement apparel_Shoes_link;

   
   @FindBy(xpath="(//a[contains(text(),'Digital downloads')])[1]")
   WebElement Digitaldownloads_link;
   
   @FindBy(xpath="(//a[contains(text(),'Jewelry')])[1]")
   WebElement jewelry_link;
   
   @FindBy(xpath="(//a[contains(text(),'Gift Cards')])[1]")
   WebElement giftcart_link;
   
   
   @FindBy(xpath="//strong[contains(text(),'Community poll')]")
   WebElement communityPoll;
   
   @FindBy(id =" pollanswers-1")
	WebElement excellent;
   @FindBy(id =" pollanswers-2")
  	WebElement good;
   @FindBy(id =" pollanswers-3")
  	WebElement poor;
   @FindBy(id =" pollanswers-4")
  	WebElement veryBad;
   
   @FindBy(xpath="//a[text()='Facebook']")
   WebElement facebook_link;
   @FindBy(xpath="//a[text()='Twitter']")
   WebElement twitter_link;
   @FindBy(xpath="//a[text()='RSS']")
   WebElement rSS_link;
   @FindBy(xpath="//a[text()='YouTube']")
   WebElement youTube_link;
   @FindBy(xpath="//a[text()='Google+']")
   WebElement google_link;
   
 
   
   
   
   



   
   
   
   
   
  
   
   

}
