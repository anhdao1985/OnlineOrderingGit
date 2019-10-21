
// WAITING FOR MICROSOFT TO RELEASE A NEW WEB DRIVER FOR EDGE


package com.baylorgenetics.catalog_qa.base;

//import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.interactions.Actions;


public class LogInIE {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Eclipse\\MicrosoftWebDriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://catalog-qa.baylorgenetics.com/search?");
		

		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Click on the Signin button on the Page
		driver.findElement(By.xpath("//div[@id='root']/div/header/div/div/div[2]/div[2]/button")).click();
		
		//Enter the user name
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("b1@yahoo.com");
		
		//Enter the password
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Test@123456");
		
		//Click on the Signin button on the Signin window
		driver.findElement(By.xpath("//*[@id='btn-login']")).click();

		
		
		//Click on Preconception icon
		driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div[2]/div[1]/div")).click();
	    Thread.sleep(2000);
	    
	    //Click Backpage
	    driver.navigate().back();
	    
	    Thread.sleep(2000);
	    //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    //Click on Prenatal icon
	    driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div[2]/div[2]/div")).click();
	    Thread.sleep(2000);
		
	    //Click Backpage
	    driver.navigate().back();
		
	     Thread.sleep(2000);
	    //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    //Click on the Pediatric icon
	    driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div[2]/div[3]/div")).click();
	    Thread.sleep(1000);
	    
	    //Click Backpage
	    driver.navigate().back();
	    
	    Thread.sleep(2000);
	    //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    //Click on the Adult icon
	    driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div[2]/div[4]/div")).click();
	    Thread.sleep(2000);
	    
	    //Click Backpage
	    driver.navigate().back();
	    
	     Thread.sleep(2000);
	    //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Click on the Oncology icon
	    driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div[2]/div[5]/div")).click();
	    Thread.sleep(2000);
	    
	    //Click Backpage
	    driver.navigate().back();
	    
	    Thread.sleep(2000);
	    //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    //Enter TestCode and click Enter
		driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/form/div[1]/input")).sendKeys("4900");
		driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/form/div[2]/button")).sendKeys(Keys.ENTER);
		
		//Click on the result
		driver.findElement(By.linkText("Global Metabolomic Assisted Pathway Screen (Global MAPS)®")).click();
		Thread.sleep(2000);
		
		//Expand the Primary panel
	    driver.findElement(By.xpath("//div[@id='root']/div[2]/div[2]/div[4]/div[5]/button/span[1]/span[2]")).click();
	    Thread.sleep(2000);
	    
	    //Expand the Primary panel
	    driver.findElement(By.xpath("//div[@id='root']/div[2]/div[2]/div[4]/div[6]/button/span[1]/span[2]")).click();
	    Thread.sleep(2000);
	    
	    //Expand the Primary panel
	    driver.findElement(By.xpath("//div[@id='root']/div[2]/div[2]/div[4]/div[7]/button/span[1]/span[2]")).click();
	    Thread.sleep(2000);
	    
	    
	    //Click on the Logout button on the page
	    driver.findElement(By.xpath("//div[@id='root']/header/div/div/div[2]/div[2]/button")).click();
	    
	  
	    //We assign baseUrl variable as a string and assign it with the url we want 
	    String baseUrl = "https://catalog-qa.baylorgenetics.com/search?";
	    String expectedTitle = "Baylor Genetics - Test Catalog";
	    String actualTitle = "";


	    //launch Fire fox and direct it to the Base URL
	    driver.get(baseUrl);

	    //get the actual value of the title
	    actualTitle = driver.getTitle();
	    System.out.println();
	    /*
	     * compare the actual title of the page with the expected one and print
	     * the result as "Passed" or "Failed"
	     */
	    if (actualTitle.contentEquals(expectedTitle)){
	       System.out.println("Test Passed!");
	    } else {
	        System.out.println("Test Failed");
	    }

	    // Close browser
	 //  driver.close();
	
	}
	    
	    
}

