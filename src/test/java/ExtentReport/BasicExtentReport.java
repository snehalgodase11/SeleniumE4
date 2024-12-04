package ExtentReport;

import java.awt.Window;
import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicExtentReport {
	@Test
	public void main() throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//create extentSpark report
		File path=new File("./src/main/resources/Sample.html");
		ExtentSparkReporter  spark=new ExtentSparkReporter(path);
		//configure spark
		spark.config().setDocumentTitle("CRMVtiger");
		spark.config().setReportName("snehal");
		spark.config().setTheme(Theme.DARK);
		//create extent report
		ExtentReports report=new ExtentReports();
		//configure extent report
		report.setSystemInfo("Browser", "Chrome-101");
		
		//atach the spark to extent report
		report.attachReporter(spark);
		//create extent test
		ExtentTest test=report.createTest("main");
		driver.close();
		report.flush();
		
}
}

