package com.baylorgenetics.catalog_qa.testcases;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import java.util.List;
//import java.util.Random;  //for any random method
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import com.baylorgenetics.catalog_qa.pages.GenerateData; // importing the GenerateData class into this class
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class AddingMoreThanOneAdditionalRecipients {
	
	public String baseUrl = "https://orders-qa.baylorgenetics.com/create-order?testCode=60101";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver ;
	//initiate NameofInsured as the GenerateData class
	GenerateData NameOfAddrecipients;
	
	@BeforeTest
	public void setup(ITestContext ctx) {
	    TestRunner runner = (TestRunner) ctx;
	    runner.setOutputDirectory("J:\\zzQA Selenium Automation Suite\\Test Results");
	}

  @Test
  public  void additionalRecipients () throws InterruptedException {
	  
	  //This is how i call the class GenerateData 
	  NameOfAddrecipients = new GenerateData();
	  
	     System.out.println("launching Chrome browser"); 
		 System.setProperty("webdriver.chrome.driver", driverPath);
		 driver = new ChromeDriver();
		 driver.get(baseUrl); 
		 driver.manage().window().maximize();
		    
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
		 //Expand the Additional info 
		 driver.findElement(By.id("additional-recipients")).click();
				 
	  
		 // Generate First Name of additional recipients
		 driver.findElement(By.id("recipient-name-0")).sendKeys(NameOfAddrecipients.generateRandomAlphaNumeric(10));  
		 
		 //Generate email
		// driver.findElement(By.id("")).sendKeys(NameOfAddrecipients.generateRandomAlphaNumeric(10) + "@gmail.com");  // This also work
		 driver.findElement(By.id("recipient-email-0")).sendKeys(NameOfAddrecipients.generateEmail(20));  
		 
		 
		 // Creating Fax #
		 driver.findElement(By.id("recipient-fax-0")).sendKeys(NameOfAddrecipients.generateRandomNumber(9)); 
		
		// driver.findElement(By.id("reciepient-fax-0")).sendKeys("1408-125-8758"); 
		
		 
		// Add more additional recipients
		 driver.findElement(By.id("add-recipient")).click();
		 
		// Generate First Name of additional recipients #2
		driver.findElement(By.id("recipient-name-1")).sendKeys(NameOfAddrecipients.generateRandomAlphaNumeric(10));  
				 
		 //Generate email #2
		// driver.findElement(By.id("")).sendKeys(NameOfAddrecipients.generateRandomAlphaNumeric(10) + "@gmail.com");  // This also work
		 driver.findElement(By.id("recipient-email-1")).sendKeys(NameOfAddrecipients.generateEmail(20));  
				 		 
		 // Creating Fax # - #2
		 driver.findElement(By.id("recipient-fax-1")).sendKeys(NameOfAddrecipients.generateRandomNumber(9)); 
			
		 
		// Add more additional recipients
		 driver.findElement(By.id("add-recipient")).click();
			 
		// Generate First Name of additional recipients #3
		driver.findElement(By.id("recipient-name-2")).sendKeys(NameOfAddrecipients.generateRandomAlphaNumeric(10));  
					 
		//Generate email #3
		// driver.findElement(By.id("")).sendKeys(NameOfAddrecipients.generateRandomAlphaNumeric(10) + "@gmail.com");  // This also work
		driver.findElement(By.id("recipient-email-2")).sendKeys(NameOfAddrecipients.generateEmail(20));  
					 		 
		// Creating Fax # - #3
		driver.findElement(By.id("recipient-fax-2")).sendKeys(NameOfAddrecipients.generateRandomNumber(9)); 
				
		 
		 //Removing an additonal recipients 
		 
		driver.findElement(By.id("delete-recipient-2")).click();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 Thread.sleep(3000);
			// Close browser
			driver.close();  
		 
  }
}
