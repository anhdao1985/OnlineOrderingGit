package com.baylorgenetics.cataglog_qa.testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class LogInFireFox {
	public String baseUrl = "https://catalog-qa.baylorgenetics.com/search?";
	String driverPath = "C:\\Eclipse\\geckodriver.exe";
	public WebDriver driver ; 
  
	
	@Test 
	public void logInFireFox() throws InterruptedException {
		System.out.println("launching firefox browser"); 
	
	    System.setProperty("webdriver.gecko.driver", driverPath);
	    driver = new FirefoxDriver();
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
			 Thread.sleep(1000);

			//Click on Preconception icon
			driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[2]/div[1]/div")).click();
		    Thread.sleep(1000);
		    
		    //Click Backpage
		    driver.navigate().back();
		    
		    Thread.sleep(1000);
		    //Click on Prenatal icon
		    driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[2]/div[2]/div")).click();
		    Thread.sleep(1000);
			
		    //Click Backpage
		    driver.navigate().back();
			
		    Thread.sleep(1000);
		    //Click on the Pediatric icon
		    driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[2]/div[3]/div")).click();
		    Thread.sleep(1000);
		    
		   //Click Backpage
		    driver.navigate().back();
		    
		    Thread.sleep(1000);
		    //Click on the Adult icon
		    driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[2]/div[4]/div")).click();
		    Thread.sleep(1000);
		    
		    //Click Backpage
		    driver.navigate().back();
		    
		    Thread.sleep(1000);
			//Click on the Oncology icon
		    driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[2]/div[5]/div")).click();
		    Thread.sleep(1000);
		    
		    //Click Backpage
		    driver.navigate().back();
		    
		    Thread.sleep(1000);
		    //Enter TestCode and click Enter
			driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[1]/form/div[1]/input")).sendKeys("4900");
			driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[1]/form/div[2]/button ")).sendKeys(Keys.ENTER);
			
			//Click on the result
			driver.findElement(By.linkText("Global Metabolomic Assisted Pathway Screen (Global MAPS)®")).click();
			Thread.sleep(1000);
			
			//Expand the Primary panel
		    driver.findElement(By.xpath("//div[@id='root']/div[2]/div/div[3]/div[7]/button/span[1]")).click();
		    Thread.sleep(1000);
		    
		    //Expand the Primary panel
		    driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[3]/div[8]/button/span[1]")).click();
		    Thread.sleep(1000);
		    
		    //Expand the Primary panel
		    driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[3]/div[9]/button/span[1]")).click();
		    Thread.sleep(1000);
		    
		    //Expand the Primary panel
		    driver.findElement(By.xpath("//div[@id='root']/div[2]/div/div[3]/div[10]/button/span[1]")).click();
		    Thread.sleep(1000);
		    
		    //Expand the Primary panel
		    driver.findElement(By.xpath("//div[@id='root']/div[2]/div/div[3]/div[11]/button/span[1]")).click();
		    Thread.sleep(1000);
		    
		    //Click on the Logout button on the page
		    driver.findElement(By.xpath("//div[@id='root']/div/header/div/div/div[2]/div[2]/button/span[1]")).click();
		    
		


	      //Close out the window
	      driver.close();
	  }
	}