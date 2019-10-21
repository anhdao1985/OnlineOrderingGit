package com.baylorgenetics.cataglog_qa.testcases;



//import java.util.List;
//import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.support.ui.Select;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class EthnicityDropdownSelectAfricanAmericanValueOrderpage {
	
	public String baseUrl = "https://orders-qa.baylorgenetics.com/create-order?testCode=60101";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver ; 
	
  @Test 
  public void ValidateEthnicityDropdown() throws Exception {
	  
		 System.out.println("launching Chrome browser"); 
			
		 System.setProperty("webdriver.chrome.driver", driverPath);
		 driver = new ChromeDriver();
		 driver.get(baseUrl); 
		 driver.manage().window().maximize();
		    
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
			// Select the drop down 
		     Select dropdown = new Select(driver.findElement(By.id("ethnicity")));
			// wait 1 second and select "African American"
			Thread.sleep(1000);
			dropdown.selectByVisibleText("African American");
			Thread.sleep(1000);
			
	
		
		 // Close browser
		   driver.close(); 
		   
		 
		 
		
			   
		 	
			    }
			}
			
	      
	    






















/*
 *  String[] exp = {"African American", "Ashkenazi Jewish", "East Asian (China, Japan, Korea)", "Finnish", "French Canadian", "Hispanic American", "Mennonite", "Middle Eastern (Saudi Arabia, Qatar, Iraq, Turkey", "Native American", "Northern Eauropean Caucasian (Scandinavian, UK, Germany)", "Pacific  Islander (Philippines, Micronesia, Malaysia, Indoneasia", "South Asian (India, Pakistan)", "Southeast Asian (Vietnam, Cambodia, Thailand)","Southern Eauropean Caucasian (Spain, Italy, Greece)", "Other"};
		 WebElement dropdown = driver.findElement(By.xpath("//div[@id='select-month']"));
		 Select ethicity = new Select(dropdown);

		 List<WebElement> options = ethicity.getOptions();
		 loop:  
		 for(WebElement we:options)  
		 {  
		  for (int i=0; i<exp.length; i++){
		      if (we.getText().equals(exp[i])){
		      System.out.println("Matched");
		      break loop;
		      } 
		   }

		 } 
		 
		 
 */















/*	 String[] exp = {"African American", "Ashkenazi Jewish", "East Asian (China, Japan, Korea)", "Finnish", "French Canadian", "Hispanic American", "Mennonite", "Middle Eastern (Saudi Arabia, Qatar, Iraq, Turkey", "Native American", "Northern Eauropean Caucasian (Scandinavian, UK, Germany)", "Pacific  Islander (Philippines, Micronesia, Malaysia, Indoneasia", "South Asian (India, Pakistan)", "Southeast Asian (Vietnam, Cambodia, Thailand)","Southern Eauropean Caucasian (Spain, Italy, Greece)", "Other"};

WebElement dropdown = driver.findElement(By.xpath("//*[@id='select-ethnicityName']"));
Select ethicity = new Select(dropdown);

List<WebElement> options = ethicity.getOptions();
loop:  
for(WebElement we:options)  
{  
 for (int i=0; i<exp.length; i++){
     if (we.getText().equals(exp[i])){
     System.out.println("Matched");
     break loop;
     } 
  }

} 
*/






/*int count = 0;
String[] exp = {"African American", "Ashkenazi Jewish", "East Asian (China, Japan, Korea)", "Finnish", "French Canadian", "Hispanic American", "Mennonite", "Middle Eastern (Saudi Arabia, Qatar, Iraq, Turkey", "Native American", "Northern Eauropean Caucasian (Scandinavian, UK, Germany)", "Pacific  Islander (Philippines, Micronesia, Malaysia, Indoneasia", "South Asian (India, Pakistan)", "Southeast Asian (Vietnam, Cambodia, Thailand)","Southern Eauropean Caucasian (Spain, Italy, Greece)", "Other"};

WebElement dropdown = driver.findElement(By.xpath("//*[@id='select-ethnicityName']"));
Select ethicity = new Select(dropdown);

List<WebElement> options = ethicity.getOptions();
loop:  
for(WebElement we:options)  
{  
 for (int i=0; i<exp.length; i++){
     if (we.getText().equals(exp[i])){
     System.out.println("Matched");
     break loop;
     } 
  }

} 
 */ 



/*	
String[] exp = {"African American", "Ashkenazi Jewish", "East Asian (China, Japan, Korea)", "Finnish", "French Canadian", "Hispanic American", "Mennonite", "Middle Eastern (Saudi Arabia, Qatar, Iraq, Turkey", "Native American", "Northern Eauropean Caucasian (Scandinavian, UK, Germany)", "Pacific  Islander (Philippines, Micronesia, Malaysia, Indoneasia", "South Asian (India, Pakistan)", "Southeast Asian (Vietnam, Cambodia, Thailand)","Southern Eauropean Caucasian (Spain, Italy, Greece)", "Other"};
WebElement divClick = driver.findElement("//div[@id='select-ethnicityName']");
divClick.click(); 
WebElement dropdown = driver.findElement(By.xpath("//div[@id='select-ethnicityName']"));  
Select select = new Select(dropdown); 
                   java.util.List<WebElement> options = select.getOptions(); 
                    for(WebElement item:options) 
                    {  
                     for (int i=0; i<exp.length; i++){
                         if (item.getText().equals(exp[i])){
                         System.out.println("Matched");
                         }
                       }
                     }  

*/