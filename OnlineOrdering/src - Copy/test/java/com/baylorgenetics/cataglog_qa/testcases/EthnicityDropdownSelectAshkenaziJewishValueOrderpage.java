package com.baylorgenetics.cataglog_qa.testcases;

//import java.util.List;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.support.ui.Select;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EthnicityDropdownSelectAshkenaziJewishValueOrderpage {

	public String baseUrl = "https://orders-qa.baylorgenetics.com/create-order?testCode=60101";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver ; 
	
  @Test 
  public void ValidateAshkenaziJewishInDropdown() throws Exception  {
	  
	  System.out.println("launching Chrome browser"); 
		
		 System.setProperty("webdriver.chrome.driver", driverPath);
		 driver = new ChromeDriver();
		 driver.get(baseUrl); 
		 driver.manage().window().maximize();
		    
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Select the drop down 
	     Select dropdown = new Select(driver.findElement(By.id("ethnicity")));
	     
		// wait 1 second and select "Ashkenazi Jewish"
		Thread.sleep(1000);
		dropdown.selectByVisibleText("Ashkenazi Jewish");
		
		
		//To keep the web browser stay for 1s
		Thread.sleep(1000);
		
		 // Close browser
		   driver.close(); 
	      }
	    
	  
	  
  }

