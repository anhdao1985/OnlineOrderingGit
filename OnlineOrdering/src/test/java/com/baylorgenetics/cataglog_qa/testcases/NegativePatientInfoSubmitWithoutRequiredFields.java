package com.baylorgenetics.cataglog_qa.testcases;

import org.testng.Assert;
//import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
//import java.util.List;
//import java.util.Random;
import java.util.Set;
//import java.util.List;
//import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

import com.baylorgenetics.catalog_qa.pages.GenerateData;
import com.baylorgenetics.catalog_qa.pages.allPanels;

public class NegativePatientInfoSubmitWithoutRequiredFields {
	public String baseUrl = "https://catalog-qa.baylorgenetics.com/search?";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver;
	GenerateData NameOfInsured;

	@BeforeTest
	public void setup(ITestContext ctx) {
		TestRunner runner = (TestRunner) ctx;
		runner.setOutputDirectory("C:\\Users\\atd0623\\Desktop\\Automation Results");
	}

	@Test
	public void NegativePatientInfoNorequiredFieldsNoSubmitAndSaveButton() throws InterruptedException {
		// This is how i call the class GenerateData
		NameOfInsured = new GenerateData();

		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		String currentWindow = driver.getWindowHandle();
		driver.switchTo().window(currentWindow);
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// The Login window
		/*
		 * // Initiate patientInfo as the allPanels class allPanels
		 * theSignInButtonButtons = new allPanels(driver);
		 * 
		 * // Calling the getpatientInfoPanel method from the class allPanels
		 * theSignInButtonButtons.getClickSignInButton().click();
		 */

		// Initiate the search bar as the allPanels class
		allPanels theSearchBar = new allPanels(driver);

		// Calling the Search bar method from class allPales and insert value
		theSearchBar.getTheSearchBar().sendKeys("1500");

		// Initiate getmanifying icon as the allPanels class
		allPanels theMagnifyingIcon = new allPanels(driver);

		// Calling the getmagnifying method from class allPales and insert value
		theMagnifyingIcon.getMagnifyingGlass().click();

		// Clicking on the search result
		driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[2]/div[2]/div[1]/a")).click();
		Thread.sleep(1000);

	
		
		//Verify the Test# and title of the test on the order page
		WebElement username3 = driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[3]/div[1]"));
		assertEquals(username3.getText().trim(), "1500Proband Whole Exome Sequencing");
		
		
		

		// Initiate gettheOrderButtonDetailsP icon as the allPanels class
		allPanels theOrderBDetailsPage = new allPanels(driver);

		// Calling the get the order button on the details page method from class
		// allPales and insert value
		theOrderBDetailsPage.gettheOrderButtonDetailsP().click();
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

		Thread.sleep(3000);

		// driver.get("https://orders-qa.baylorgenetics.com/create?test=1500");
		// Thread.sleep(3000);

		// Validate pass or fail by looking at the keyword in the url
		String url = driver.getCurrentUrl();
		boolean passed = url.contains("1500");
		if (passed) {
			System.out.println("URL Test Passed");
		} else {
			System.out.println("URL Test Failed");
			Assert.fail("This message will be printed in stacktrace if the assertion fails.");
		}

		// Generate The First Name of Insured using the GenerateData class
		// driver.findElement(By.xpath("//*[@id='simple-tabpanel-2']/div/div/div[1]/div[2]/div/div[1]/div/div/input")).sendKeys(NameOfInsured.generateRandomAlphaNumeric(8));
		driver.findElement(By.id("first-name")).sendKeys(NameOfInsured.generateRandomString(10));

		// Generate The Middle Name of Insured using the GenerateData class
		driver.findElement(By.id("middle-name")).sendKeys(NameOfInsured.generateRandomString(10));

		// Generate The Middle Name of Insured using the GenerateData class
		driver.findElement(By.id("last-name")).sendKeys(NameOfInsured.generateRandomString(10));


		//Initiate the Birth Month
		allPanels dropMonthDownList = new allPanels(driver);
		
		//Enter 10/October
		dropMonthDownList.getbirthMonthOrderPage().sendKeys("10");
		
		//Initiate the Birth Day
		allPanels dropDayDownList = new allPanels(driver);
		
		//Enter 20 
		 dropDayDownList.getbirthDayOrderPage().sendKeys("20");
			
		//Initiate the year drop down
		allPanels drpYearDwnList = new allPanels(driver);
		
		//Enter 1985 
		drpYearDwnList.getbirthYearOrderPage().sendKeys("1985");
		
		
/*		
		// below is the portion to randomly select the Month in the Month drop down
		// Object of the Month Dropdownlist
		WebElement drpDwnList = driver.findElement(By.id("birth-date-month"));
		Thread.sleep(2000);
		// Using FindElements to create a List object
		// List <WebElement> weblist =
		// driver.findElements(By.xpath(".//*[@id='drpdwnTopics']/option"));

		// Using Select Class to fetch the count
		Select objSel = new Select(drpDwnList);
		List<WebElement> weblist = objSel.getOptions();

		// Taking the count of items
		int iCnt = weblist.size();
		// Using Random class to generate random values

		Random num = new Random();
		int iSelect = num.nextInt(iCnt);

		// Selecting value from DropDownList
		objSel.selectByIndex(iSelect);

		// Print out Selected Value
		System.out.println(drpDwnList.getAttribute("value"));

		// below is the portion to randomly select the day in the Day drop down

		// Object of the Day Dropdownlist
		WebElement drpDayDwnList = driver.findElement(By.id("birth-date-day"));

		// Using FindElements to create a List object
		// List <WebElement> weblist =
		// driver.findElements(By.xpath(".//*[@id='drpdwnTopics']/option"));
		Thread.sleep(2000);

		// Using Select Class to fetch the count
		Select objOneSel = new Select(drpDayDwnList);
		List<WebElement> weblistDay = objOneSel.getOptions();

		// Taking the count of items
		int aCnt = weblistDay.size();
		// Using Random class to generate random values

		Random numDay = new Random();
		int aSelect = numDay.nextInt(aCnt);

		// Selecting value from DropDownList
		objOneSel.selectByIndex(aSelect);

		// Print out Selected Value
		System.out.println(drpDayDwnList.getAttribute("value"));

		// below is the portion to randomly select the Year in the Year drop down

		// Object of the Year Dropdownlist
		WebElement drpYearDwnList = driver.findElement(By.id("birth-date-year"));

		Thread.sleep(2000);

		// Using Select Class to fetch the count
		Select objYearSel = new Select(drpYearDwnList);
		List<WebElement> weblistYear = objYearSel.getOptions();

		// Taking the count of items
		int yCnt = weblistYear.size();
		// Using Random class to generate random values

		Random numYear = new Random();
		int ySelect = numYear.nextInt(yCnt);

		// Selecting value from DropDownList
		objYearSel.selectByIndex(ySelect);

		// Print out Selected Value
		System.out.println(drpYearDwnList.getAttribute("value"));


		// Initiate the Submit button
		allPanels submitButtonOnOrderPage = new allPanels(driver);

		// Calling the submit button and then click
		WebElement element1 = submitButtonOnOrderPage.gettheSubmitButtonOnOrderForm();
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(element1).click().build().perform();
		
		
		// Store the parent window
		String parentWindowHandler = driver.getWindowHandle();
		String subWindowHandler = null;

		// get all window handles
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();

		subWindowHandler = iterator.next();
		driver.switchTo().window(subWindowHandler);

		// click the cancel button
		WebElement cancelOnMessage = driver.findElement(By.xpath("//html/body/div[3]/div[3]/div/div[3]/button[1]"));
		cancelOnMessage.click();


		/// Initiate the Submit button
		allPanels submitButtonAgainOnOrderPage = new allPanels(driver);

		// Calling the submit button and then click
		WebElement element2 = submitButtonAgainOnOrderPage.gettheSubmitButtonOnOrderForm();
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(element2).click().build().perform();

		// Selecting absolute xpath and click the Confirm button
		WebElement confirmOnMessage = driver.findElement(By.xpath("//html/body/div[3]/div[3]/div/div[3]/button[2]"));
		confirmOnMessage.click();

		driver.switchTo().window(parentWindowHandler);

		// Clicking verify the Error message after clicking the submit

		Thread.sleep(5000);

		// Check for the Login and institution
		WebElement username2 = driver.findElement(By.xpath("//div[@id='root']/div[3]"));
		assertEquals(username2.getText().trim(), "Unable to submit order. Please correct any errors and try again.");

		// Close browser
		driver.close();
*/

//Check to see if the Submit button is disable or enable	
		WebElement element = driver.findElement(By.id("submit-order"));
		boolean actualValue = element.isEnabled();
		if(actualValue) {
			 System.out.println("DisabledEnabled");
			 Assert.fail("This message will be printed in stacktrace if the assertion fails."); //This will fail the testcase if the button become enable in this scenario
		} else {
			System.out.println("Disabled");
			
		}
		
		// Close browser
			driver.close();	
		
	}
}
