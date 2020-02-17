package com.baylorgenetics.cataglog_qa.testcases;




//import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

import com.baylorgenetics.catalog_qa.pages.GenerateData;
//import com.baylorgenetics.catalog_qa.pages.allPanels;




//import java.io.File;

//import java.io.FileInputStream;

//import java.io.IOException;

//import org.apache.poi.hssf.usermodel.HSSFWorkbook;

//import org.apache.poi.ss.usermodel.Row;

//import org.apache.poi.ss.usermodel.Sheet;

//import org.apache.poi.ss.usermodel.Workbook;

//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SecurityOpeningCompletedOrderFromAnotherAccount {
	public String baseUrl = "https://orders-qa.baylorgenetics.com/";
	
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver;
	//initiate NameofInsured as the GenerateData class
	GenerateData NameOfInsured;

		
	@BeforeTest
	public void setup(ITestContext ctx) {
	    TestRunner runner = (TestRunner) ctx;
	    runner.setOutputDirectory("C:\\Users\\atd0623\\Desktop\\Automation Results");
	}
	
	
	
  @Test 
  public void openAcompletedOrderFromAnotherAccount() throws Exception  {
	  
	    NameOfInsured = new GenerateData();
	    System.out.println("launching Chrome browser");
	    System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Click on the Signin button on the Page
		//driver.findElement(By.xpath("//div[@id='root']/div/div/div/header/div/div/div[2]/div[2]/button")).click();
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("automation@baylorgenetics.com");

		// Enter the password
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Test@1234");

		// Click on the Signin button on the Signin window
		driver.findElement(By.xpath("//*[@id='btn-login']")).click();
		Thread.sleep(3000);

		// Load an order from another account
		driver.get("https://orders-qa.baylorgenetics.com/order/97cf490a-e656-4b1e-8cb7-6fb6c1be09cc");
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