package com.baylorgenetics.cataglog_qa.testcases;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baylorgenetics.catalog_qa.pages.GenerateData;


public class VerifyingTheFooterURLOrderKitsCatalogPage {
	public String baseUrl = "https://catalog-qa.baylorgenetics.com/search?";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver;
	GenerateData NameOfInsured;

	@BeforeTest
	public void setup(ITestContext ctx) {
		TestRunner runner = (TestRunner) ctx;
		runner.setOutputDirectory("C:\\Users\\atd0623\\Desktop\\Automation Results");
	}

	@Test
	public void verifyingFooterUrlOrderKitsCatalog() throws InterruptedException {
		// This is how i call the class GenerateData
		NameOfInsured = new GenerateData();

		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		String currentWindow = driver.getWindowHandle();
		driver.switchTo().window(currentWindow);
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Clicking on Order Kit in the footer in the Catalog page
		driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div/div[2]/ul/li[5]/a")).click();
		Thread.sleep(1000);

		// Validate pass or fail by looking at the keyword in the url
		String url = driver.getCurrentUrl();
		boolean passed = url.contains("https://www.baylorgenetics.com/testing/order-kits/");
		if (passed) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
			Assert.fail("This message will be printed in stacktrace if the assertion fails.");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Close browser
		driver.close();

	}
}
