package com.baylorgenetics.cataglog_qa.testcases;

import org.testng.annotations.Test;

import java.util.List;
//import java.util.List;
//import java.util.concurrent.TimeUnit;


import org.openqa.selenium.support.ui.Select;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;


public class VerifyingAllValuesInTheEthnicityDropDown {
	
	public String baseUrl = "https://orders-qa.baylorgenetics.com/create-order?testCode=4900";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver; 
	
	
	
  @Test (priority=1)
  public void ValidateAllValueEthnicity() throws Exception {

		 System.out.println("launching Chrome browser"); 
			
		 System.setProperty("webdriver.chrome.driver", driverPath);
		 driver = new ChromeDriver();
		 driver.get(baseUrl); 
		 driver.manage().window().maximize();
		 Thread.sleep(1000);    
	  

		 int count = 0;
		 String[] exp = {"","African American", "Ashkenazi Jewish", "East Asian (China, Japan, Korea)", "Finnish", "French Canadian", "Hispanic American", "Mennonite", "Middle Eastern (Saudi Arabia, Qatar, Iraq, Turkey)", "Native American", "Northern European Caucasian (Scandinavian, UK, Germany)", "Pacific Islander (Philippines, Micronesia, Malaysia, Indonesia)", "South Asian (India, Pakistan)", "Southeast Asian (Vietnam, Cambodia, Thailand)","Southern European Caucasian (Spain, Italy, Greece)", "Other"};
		 WebElement dropdown = driver.findElement(By.id("ethnicity"));
		 Select select = new Select(dropdown);

		 List<WebElement> options = select.getOptions();
		 for (WebElement we : options) {
	        for (int i = 0; i < exp.length; i++) {
	            if (we.getText().equals(exp[i])) {
	                count++;
	            }
	        }
		 }
		 if (count == exp.length) {
	        System.out.println("matched");
		 } else {
	        System.out.println("Missing or invalid value in the drop down.");
	        
	        
	    	//To keep the web browser stay for 1s
			Thread.sleep(1000);
			 // Close browser
			   driver.close(); 
}
}
}
    

