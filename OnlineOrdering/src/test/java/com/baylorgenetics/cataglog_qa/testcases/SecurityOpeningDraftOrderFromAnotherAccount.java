package com.baylorgenetics.cataglog_qa.testcases;


import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baylorgenetics.catalog_qa.pages.GenerateData;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;




public class SecurityOpeningDraftOrderFromAnotherAccount {
public String baseUrl = "https://orders-qa.baylorgenetics.com/";
	
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver;
	// initiate NameofInsured as the GenerateData class
	GenerateData NameOfInsured;

	@BeforeTest
	public void setup(ITestContext ctx) {
		TestRunner runner = (TestRunner) ctx;
		runner.setOutputDirectory("J:\\zzQA Selenium Automation Suite\\Test Results");
	}
	
	
  @Test
  public void openDraftOrderFromAnotherAccount() throws Exception  {
		NameOfInsured = new GenerateData();
		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Click on the Signin button on the Page
		// driver.findElement(By.xpath("//div[@id='root']/div/div/div/header/div/div/div[2]/div[2]/button")).click();

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("automation@baylorgenetics.com");

		// Enter the password
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Test@1234");

		// Click on the Signin button on the Signin window
		driver.findElement(By.xpath("//*[@id='btn-login']")).click();
		Thread.sleep(3000);

		// Load an order from another account
		driver.get("https://orders-qa.baylorgenetics.com/order/72aca403-bcf1-4570-9d0c-4159fdd6805e");
		Thread.sleep(2000);

		if (driver.getPageSource().contains("Page not found")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		// Close browser
		driver.close();

	}
}
