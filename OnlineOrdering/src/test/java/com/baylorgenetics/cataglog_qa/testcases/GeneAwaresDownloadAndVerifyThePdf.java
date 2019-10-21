package com.baylorgenetics.cataglog_qa.testcases;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GeneAwaresDownloadAndVerifyThePdf {
	
	public String baseUrl = "https://www.baylorgenetics.com/wp-content/uploads/2018/08/baylor-genetics-geneaware-req.pdf";
	String driverPath = "C:\\Eclipse\\geckodriver.exe";
	public WebDriver driver ; 
	
	@BeforeTest
	public void setup(ITestContext ctx) {
	    TestRunner runner = (TestRunner) ctx;
	    runner.setOutputDirectory("J:\\zzQA Selenium Automation Suite\\Test Results");
	}

	
  @Test
  public void VerifyGeneAwaresPreqPDF() throws Exception  {
	  
	  System.out.println("launching firefox browser"); 
		
	    System.setProperty("webdriver.gecko.driver", driverPath);
	    driver = new FirefoxDriver();
	    driver.get(baseUrl); 
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	    // this is to clicking  a button that has a link behind it if the button is available
	    //driver.findElement(By.linkText("baylor-genetics-geneaware-req")).click();
	    
		Assert.assertTrue(verifyPDFContent(driver.getCurrentUrl(), "baylor-genetics-geneaware-req"));
			
		//Get the current link
	    String url = driver.getCurrentUrl();
	    
	    //establish the condition statement
	    boolean passed = url.contains("baylor-genetics-geneaware-req");
	   		if (passed) {
		       System.out.println("Test Passed");
		   } else {
		       System.out.println("Test Failed");
		      

			    // Close browser
			    driver.close();
			    
		   }
		     
  }	



private Object verifyPDFContent(String currentUrl, String string) {
	// TODO Auto-generated method stub
	return null;
}
}

// this is to clicking  a button that has a link behind it if the button is avaialbe 
//driver.findElement(By.linkText("baylor-genetics-geneaware-req")).click();
