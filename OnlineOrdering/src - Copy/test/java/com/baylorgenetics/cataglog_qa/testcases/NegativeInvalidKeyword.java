package com.baylorgenetics.cataglog_qa.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NegativeInvalidKeyword {
	
	public String baseUrl = "https://catalog-qa.baylorgenetics.com/search?";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver ; 
	
  @Test 
  public void NegativeNoSearchResultsFound() throws InterruptedException {
	  
		 System.out.println("launching Chrome browser"); 
			
		 System.setProperty("webdriver.chrome.driver", driverPath);
		 driver = new ChromeDriver();
		 driver.get(baseUrl); 
		 driver.manage().window().maximize();
		    
		

		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			//Click on the Signin button on the Page
			driver.findElement(By.xpath("//div[@id='root']/div/header/div/div/div[2]/div[2]/button")).click();
			
			//Enter the user name
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("b1@yahoo.com");
			
			//Enter the password
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Test@123456");
			
			//Click on the Signin button on the Signin window
			driver.findElement(By.xpath("//*[@id='btn-login']")).click();
			 Thread.sleep(2000);
		 
			
			driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[1]/form/div[1]/input")).sendKeys("adfggghddd");
			driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[1]/form/div[2]/button")).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
		 
	
			if(driver.getPageSource().contains("No search results"))
			  {
			    System.out.println("Pass");
			  }
			else
			  {
			    System.out.println("Fail");
			  }
		 

			  // Close browser
		       driver.close();
  }
}
