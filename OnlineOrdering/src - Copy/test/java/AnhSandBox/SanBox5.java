package AnhSandBox;

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



public class SanBox5 {
	

	public String baseUrl = "https://orders-qa.baylorgenetics.com/create-order?testCode=60101";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver ;
	//initiate NameofInsured as the GenerateData class
	//GenerateData NameOfAddrecipients;
	
  @Test
  public void sanBox5 () throws InterruptedException {
	  
	  System.out.println("launching Chrome browser"); 
		 System.setProperty("webdriver.chrome.driver", driverPath);
		 driver = new ChromeDriver();
		 driver.get(baseUrl); 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		 String patientinfo = "//*[@id='patient-information']";
		 driver.findElement(By.xpath(patientinfo)).click();
		 
		 
		
		 //driver.FindElement(By.XPath("//*[@id='InputDay']/option[@value='23']")).Click();
		
		 //Select Female only
		// List<WebElement> options1 = driver.findElements(By.xpath("//*[starts-with(@id, 'patient-discharged-from-facility')]")) ;
		// Random randomDischarged = new Random();
		// int indexDischarged = randomDischarged.nextInt(options1.size());
		// options1.get(indexDischarged).click(); 
//
 
 
		 
		/* 
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 Calendar c = Calendar.getInstance();
		 c.setTime(new Date()); // Now use today date.
		 c.add(Calendar.MONTH, -2); // sub
		 sdf.format(c.getTime());
		 int month = c.get(Calendar.MONTH)+ 1;
		 int day = c.get(Calendar.DAY_OF_MONTH);
		 System.out.println("Month : " + month + " day : " + day);
		 
		
		
		 SimpleDateFormat df = new SimpleDateFormat("MM/dd/YYYY");
		 Date dt = new Date();
		 Calendar cl = Calendar.getInstance();
		 cl.setTime(dt);;
		 cl.add(Calendar.DAY_OF_MONTH, -15);
		 dt=cl.getTime();
		 String str = df.format(dt);
		     System.out.println("the date today is " + str);
		      WebElement el = driver.findElement(By.id("birth-date-month"));
		    el.sendKeys(str);
		    */
		 // Set 2 months prior to today date
		    SimpleDateFormat df = new SimpleDateFormat("MM");
			 Date dt = new Date();
			 Calendar cl = Calendar.getInstance();
			 cl.setTime(dt);;
			 cl.add(Calendar.MONTH, -2);
			 dt=cl.getTime();
			 String str = df.format(dt);
			     System.out.println("the date today is " + str);
			
			 
			 WebElement el = driver.findElement(By.id("birth-date-month"));
			    el.sendKeys(str);
			 
	  
  }

//private String getRandomInteger(int i, int j) {
//	// TODO Auto-generated method stub
//	return null;
}

