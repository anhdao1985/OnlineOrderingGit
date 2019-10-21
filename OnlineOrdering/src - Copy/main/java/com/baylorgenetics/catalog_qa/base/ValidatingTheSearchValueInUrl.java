package com.baylorgenetics.catalog_qa.base;



//import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;




//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTheSearchValueInUrl {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://catalog-qa.baylorgenetics.com/search?");
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Click on the Signin button on the Page
	driver.findElement(By.xpath("//div[@id='root']/div/header/div/div/div[2]/div[2]/button")).click();
		
	//Enter the user name
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("b1@yahoo.com");
		
	//Enter the password
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Test@123456");
		
	//Click on the Signin button on the Signin window
	driver.findElement(By.xpath("//*[@id='btn-login']")).click();

    

	 //Click on Preconception icon
	 //driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/form/div[1]/input")).sendKeys("4900");
	 driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div[2]/div[1]/div")).click();
	 Thread.sleep(2000);
		    
	    	
	   //Click the magnifying glass
	   driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/form/div[2]/button/span[1] ")).click();
	   Thread.sleep(5000);
	
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
	
	 
	
//if(KeyWord.contains("preconception")

/*String keyword = Driver.getCurrentUrl().split("?")[1].split("=")[1];
boolean passed = keyword.equals("your keyword here");
if (passed) {
    System.out.println("Test Passed");
} else {
    System.out.println("Test Failed");
    Assert.fail("This message will be printed in stacktrace if the assertion fails.");
} */

