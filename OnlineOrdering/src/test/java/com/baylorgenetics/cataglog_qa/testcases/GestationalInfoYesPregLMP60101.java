package com.baylorgenetics.cataglog_qa.testcases;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baylorgenetics.catalog_qa.pages.allPanels;

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
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class GestationalInfoYesPregLMP60101 {

	public String baseUrl = "https://orders-qa.baylorgenetics.com/create?test=60101";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver;
	// initiate NameofInsured as the GenerateData class
	// GenerateData NameOfAddrecipients;

	@BeforeTest
	public void setup(ITestContext ctx) {
		TestRunner runner = (TestRunner) ctx;
		runner.setOutputDirectory("J:\\zzQA Selenium Automation Suite\\Test Results");
	}

	@Test
	public void yesPregnantLmp() throws InterruptedException {

		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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

		Thread.sleep(3000);

		//driver.get("https://orders-qa.baylorgenetics.com/create?test=60101");
		//Thread.sleep(3000);

		// Expand the gestational-information
		driver.findElement(By.id("gestational-information")).click();

		// Selecting Yes radio button for Pregnant
		driver.findElement(By.id("pregnancy-yes")).click();

		// Selecting Yes for Pregnant
		// driver.findElement(By.xpath("//*[starts-with(@id, '')]")).click();
		Thread.sleep(3500);

		// Selecting Last Menstrual period
		driver.findElement(By.xpath("//*[starts-with(@id, 'last-menstrual-period')]")).click();
		Thread.sleep(1000);

		// Set 2 months prior to today date
		SimpleDateFormat df = new SimpleDateFormat("M"); // this is to pass in just the month into the field
		Date dt = new Date();
		Calendar cl = Calendar.getInstance();
		cl.setTime(dt);
		;
		cl.add(Calendar.MONTH, -2);
		dt = cl.getTime();
		String str = df.format(dt);
		System.out.println("the date today is " + str);

		WebElement el = driver.findElement(By.id("lmp_us_date-month"));
		el.sendKeys(str);
		Thread.sleep(1000);

		// below is the portion to randomly select the day in the Day drop down

		// Object of the Day Drop downlist
		WebElement lmpDayList = driver.findElement(By.id("lmp_us_date-day"));

		// Using FindElements to create a List object
		// List <WebElement> weblist =
		// driver.findElements(By.xpath(".//*[@id='drpdwnTopics']/option"));

		// Using Select Class to fetch the count
		Select objLmpDaySel = new Select(lmpDayList);
		List<WebElement> weblistLmpDay = objLmpDaySel.getOptions();

		// Taking the count of items
		int dCnt = weblistLmpDay.size();
		// Using Random class to generate random values

		Random numLmpDay = new Random();
		int dSelect = numLmpDay.nextInt(dCnt);

		// Selecting value from DropDownList
		objLmpDaySel.selectByIndex(dSelect);

		// Print out Selected Value
		System.out.println(lmpDayList.getAttribute("value"));

		// below is the portion to randomly select the Year in the Year drop down

		/*
		 * Object of the Year Dropdownlist WebElement lmpYearList =
		 * driver.findElement(By.id("lmp_us_date-year"));
		 * 
		 * 
		 * //Using Select Class to fetch the count Select objLmpYear = new
		 * Select(lmpYearList); List <WebElement> lmpListYear = objLmpYear.getOptions();
		 * 
		 * //Taking the count of items int lmpYCnt = lmpListYear.size(); //Using Random
		 * class to generate random values
		 * 
		 * Random numLmpYear = new Random(); int lmpYSelect =
		 * numLmpYear.nextInt(lmpYCnt);
		 * 
		 * //Selecting value from DropDownList objLmpYear.selectByIndex(lmpYSelect);
		 * 
		 * 
		 * //Print out Selected Value
		 * System.out.println(lmpYearList.getAttribute("value"));
		 * 
		 */

		// Selecting a year for the LMP drop down
		Select dropdown = new Select(driver.findElement(By.id("lmp_us_date-year")));

		// wait 1 second and select "2019"
		Thread.sleep(1000);
		dropdown.selectByVisibleText("2019");

		/// Initiate the Submit button
		allPanels saveButtonOnOrderPage = new allPanels(driver);

		// Calling the submit button and then click
		WebElement element2 = saveButtonOnOrderPage.gettheSaveButtonOnOrderForm();
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(element2).click().build().perform();

	
		
		
		
		Thread.sleep(3000);
		// Close browser
		driver.close();

	}
}
