package com.baylorgenetics.cataglog_qa.testcases;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baylorgenetics.catalog_qa.pages.allPanels;

import java.util.List;
//import java.util.List;
//import java.util.concurrent.TimeUnit;


import org.openqa.selenium.support.ui.Select;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;


public class VerifyingAllValuesInTheEthnicityDropDown {
	
	public String baseUrl = "https://orders-qa.baylorgenetics.com/create?test=60101";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver; 
	
	
	@BeforeTest
	public void setup(ITestContext ctx) {
	    TestRunner runner = (TestRunner) ctx;
	    runner.setOutputDirectory("J:\\zzQA Selenium Automation Suite\\Test Results");
	}

  @Test 
  public void ValidateAllValueEthnicity() throws Exception {

		 System.out.println("launching Chrome browser"); 
			
		 System.setProperty("webdriver.chrome.driver", driverPath);
		 driver = new ChromeDriver();
		 driver.get(baseUrl); 
		 driver.manage().window().maximize();
		 Thread.sleep(1000);   
		 
		 
		// Initiate username email as the allPanels class
			allPanels userEmail = new allPanels(driver);

			// Calling the usernameEmail method from the class allPanels and insert value
			userEmail.getInputUsernameEmail().sendKeys("automation@baylorgenetics.com");

			// Initiate password email as the allPanels class
			allPanels password = new allPanels(driver);

			// Calling the password method from class allPales and insert value
			password.getPassWord().sendKeys("Test@1234");

			// Initiate the login button on the login window as the allPanels class
			allPanels windowLogInButton = new allPanels(driver);

			// Calling the password method from class allPales and insert value
			windowLogInButton.getWindowLogInButton().click();
			Thread.sleep(5000);
			
			
			//driver.get("https://orders-qa.baylorgenetics.com/create?test=60101");
			
			//Thread.sleep(2000);


		 int count = 0;
		 String[] exp = {"","African American", "Ashkenazi Jewish", "East Asian (China, Japan, Korea)", "Finnish", "French Canadian", "Hispanic American", "Mennonite", "Middle Eastern (Saudi Arabia, Qatar, Iraq, Turkey)", "Native American", "Northern European Caucasian (Scandinavian, UK, Germany)", "Pacific Islander (Philippines, Micronesia, Malaysia, Indonesia)", "Southeast Asian (Vietnam, Cambodia, Thailand)","South Asian (India, Pakistan)","Southern European Caucasian (Spain, Italy, Greece)", "Other (Specify): "};
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
    

