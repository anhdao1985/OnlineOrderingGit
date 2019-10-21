package com.baylorgenetics.cataglog_qa.testcases;


import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
//import java.util.List;
//import java.util.Random;  //for any random method
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

//import com.baylorgenetics.catalog_qa.pages.GenerateData; // importing the GenerateData class into this class
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;


public class GestationalInfoYesPregLMP {
	
	public String baseUrl = "https://orders-qa.baylorgenetics.com/create-order?testCode=60101";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver ;
	//initiate NameofInsured as the GenerateData class
	//GenerateData NameOfAddrecipients;
	
	
  @Test
  public void yesPregnantLmp () throws InterruptedException {
	  
	  
	  
	     System.out.println("launching Chrome browser"); 
		 System.setProperty("webdriver.chrome.driver", driverPath);
		 driver = new ChromeDriver();
		 driver.get(baseUrl); 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    

		 //Expand the gestational-information
		        driver.findElement(By.id("gestational-information")).click();
	  
		 //Selecting Yes radio button for Pregnant
		        driver.findElement(By.id("pregnancy-yes")).click();
	  
		 
		 // Selecting Yes for Pregnant
		      //  driver.findElement(By.xpath("//*[starts-with(@id, '')]")).click();
		      //  Thread.sleep(1000);
	     
		    
		 // Selecting Last Menstrual period
			    driver.findElement(By.xpath("//*[starts-with(@id, 'last-menstrual-period')]")).click();
			    Thread.sleep(1000);  
		        
	 	    
		 // Set 2 months prior to today date
			     SimpleDateFormat df = new SimpleDateFormat("M"); // this is to pass in just the month into the field 
				 Date dt = new Date();
				 Calendar cl = Calendar.getInstance();
				 cl.setTime(dt);;
				 cl.add(Calendar.MONTH, -2);
				 dt=cl.getTime();
				 String str = df.format(dt);
		  System.out.println("the date today is " + str);
				
				 WebElement el = driver.findElement(By.id("lmp_us_date-month"));
				    el.sendKeys(str);
				   Thread.sleep(1000);  
			    
			    
		 // below is the portion to randomly select the day in the Day drop down
				
		 //Object of the Day Drop downlist
			 WebElement lmpDayList = driver.findElement(By.id("lmp_us_date-day"));
		 
			 //Using FindElements to create a List object
			 //List <WebElement> weblist = driver.findElements(By.xpath(".//*[@id='drpdwnTopics']/option"));
			 
		 //Using Select Class to fetch the count
			 Select objLmpDaySel = new Select(lmpDayList);
			 List <WebElement> weblistLmpDay = objLmpDaySel.getOptions();
		 
		 //Taking the count of items
			 int dCnt = weblistLmpDay.size();
			 //Using Random class to generate random values
		 
			 Random numLmpDay = new Random();
			 int dSelect = numLmpDay.nextInt(dCnt);
			 
		 //Selecting value from DropDownList
			 objLmpDaySel.selectByIndex(dSelect);
		 	
			 
		 //Print out Selected Value
			 System.out.println(lmpDayList.getAttribute("value"));
		 
		 
		 // below is the portion to randomly select the Year in the Year drop down	 
		 
		 
			/*Object of the Year Dropdownlist
			 WebElement lmpYearList = driver.findElement(By.id("lmp_us_date-year"));
		 
			 
			 //Using Select Class to fetch the count
			 Select objLmpYear = new Select(lmpYearList);
			 List <WebElement> lmpListYear = objLmpYear.getOptions();
		 
			 //Taking the count of items
			 int lmpYCnt = lmpListYear.size();
			 //Using Random class to generate random values
		 
			 Random numLmpYear = new Random();
			 int lmpYSelect = numLmpYear.nextInt(lmpYCnt);
			 
			 //Selecting value from DropDownList
			 objLmpYear.selectByIndex(lmpYSelect);
		 	
			 
			 //Print out Selected Value
			 System.out.println(lmpYearList.getAttribute("value"));
		 
	           */
	  
			 
		    //Selecting a year for the LMP drop down
		         Select dropdown = new Select(driver.findElement(By.id("lmp_us_date-year")));
			      
			// wait 1 second and select "2019"
		    	Thread.sleep(1000);
			    dropdown.selectByVisibleText("2019");
				
	  
	  
	  
	  
	  
	  
	  

		 
		     Thread.sleep(3000);
		// Close browser
			driver.close(); 
	  
  }
}
