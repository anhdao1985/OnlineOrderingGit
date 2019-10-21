package com.baylorgenetics.cataglog_qa.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ValidatingTheSearchValueInURL {

	public String baseUrl = "https://catalog-qa.baylorgenetics.com/search?";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver ; 
	
	@BeforeTest
	public void setup(ITestContext ctx) {
	    TestRunner runner = (TestRunner) ctx;
	    runner.setOutputDirectory("J:\\zzQA Selenium Automation Suite\\Test Results");
	}

  @Test 
  public void validateValueinUrl() throws InterruptedException{
	  
	  
		 System.out.println("launching Chrome browser"); 
			
		 System.setProperty("webdriver.chrome.driver", driverPath);
		 driver = new ChromeDriver();
		 driver.get(baseUrl); 
		 driver.manage().window().maximize();
		    

		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//Click on the Signin button on the Page
		 driver.findElement(By.xpath("//div[@id='root']/div/header/div/div/div[2]/div[2]/button")).click();
			
		//Enter the user name
		 driver.findElement(By.xpath("//*[@id='email']")).sendKeys("automation@baylorgenetics.com");
			
		//Enter the password
		 driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Test@1234");
			
		//Click on the Signin button on the Signin window
		 driver.findElement(By.xpath("//*[@id='btn-login']")).click();
		 Thread.sleep(2000);

	    

		 //Enter TC # in the search bar
		 //driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/form/div[1]/input")).sendKeys("4900");
		 driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[2]/div[1]/div")).click();
		 Thread.sleep(1000);
			    
		    	
		 //Click the magnifying glass
		  driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[1]/form/div[2]/button")).click();
		  Thread.sleep(2000);
		
		   // Validate pass or fail by looking at the keyword in the url
		   String url = driver.getCurrentUrl();
		   boolean passed = url.contains("preconception");
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
		