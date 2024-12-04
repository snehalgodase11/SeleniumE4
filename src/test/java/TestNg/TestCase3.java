package TestNg;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClassDWS;
//import com.crm.BaseClass.CrossBrowsingBaseClass;


public class TestCase3 extends BaseClassDWS{

	@Test
	public void testCase3() throws InterruptedException {
	                                                        
		WebElement digital_download = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')][1]"));
		String parent = driver.getWindowHandle();
		String expected_digitalurl="https://demowebshop.tricentis.com/digital-downloads";
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(digital_download).perform();
		
//		List<WebElement> add_cart = driver.findElements(By.xpath("//div[@class='add-info']/div/input"));
//		for (WebElement web : add_cart) {
//			 digital_download = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')][1]"));
//			 add_cart = driver.findElements(By.xpath("//div[@class='add-info']/div/input"));
//			 web.click();
//		}
		
		
		Set<String> childs = driver.getWindowHandles();
		for (String str : childs) {
			driver.switchTo().window(str);
			Thread.sleep(1000);
			String actual_digitalUrl = driver.getCurrentUrl();
			if(expected_digitalurl.equals(actual_digitalUrl)) {
				List<WebElement> add_cart = driver.findElements(By.xpath("//div[@class='add-info']/div/input"));
				for (WebElement web : add_cart) {
					digital_download = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')][1]"));
					add_cart = driver.findElements(By.xpath("//div[@class='add-info']/div/input"));
					web.click();
					Thread.sleep(2000);
				}
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='product-unit-price']"));
		double highestPrice =0;
		WebElement highestPriceProduct = null;
		
		for (WebElement web : price) {
			double priceValue = Double.parseDouble(web.getText().replace("$", ""));
			if(priceValue>highestPrice) {
				highestPrice = priceValue;
				highestPriceProduct = web.findElement(By.xpath("//input[@name='removefromcart']"));
			}
		}
		highestPriceProduct.click();
	}
}