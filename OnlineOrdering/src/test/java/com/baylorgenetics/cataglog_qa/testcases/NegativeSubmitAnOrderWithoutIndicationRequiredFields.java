package com.baylorgenetics.cataglog_qa.testcases;


//import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
//import java.util.List;
//import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.baylorgenetics.catalog_qa.pages.GenerateData;
import com.baylorgenetics.catalog_qa.pages.allPanels;

public class NegativeSubmitAnOrderWithoutIndicationRequiredFields {
	public String baseUrl = "https://catalog-qa.baylorgenetics.com/search?";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver;
	GenerateData NameOfInsured;

	@BeforeTest
	public void setup(ITestContext ctx) {
		TestRunner runner = (TestRunner) ctx;
		runner.setOutputDirectory("J:\\zzQA Selenium Automation Suite\\Test Results");
	}

	@Test
	public void negativeSubmitOrderWithoutRequiredIndicationRequiredF() throws InterruptedException {

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

		// Initiate the search bar as the allPanels class
		allPanels theSearchBar = new allPanels(driver);

		// Calling the Search bar method from class allPales and insert value
		theSearchBar.getTheSearchBar().sendKeys("60101");

		// Initiate getmanifying icon as the allPanels class
		allPanels theMagnifyingIcon = new allPanels(driver);

		// Calling the getmagnifying method from class allPales and insert value
		theMagnifyingIcon.getMagnifyingGlass().click();

		// Clicking on the search result
		driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[2]/div[2]/div[1]/a")).click();
		Thread.sleep(1000);

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

		Thread.sleep(2000);

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
*/
		// Selecting female radio button
		driver.findElement(By.xpath("//*[starts-with(@id, 'patient-gender-0')]")).click();
		Thread.sleep(1000);

		// below is the portion to randomly select the ethnicity in the ethnicity drop
		// down
		// Object of the e
		WebElement ethnicityDropDownList = driver.findElement(By.id("ethnicity"));

		// Using Select Class to fetch the count
		Select ethnicityObjSel = new Select(ethnicityDropDownList);
		List<WebElement> webListEthinicty = ethnicityObjSel.getOptions();

		// Taking the count of items
		int eCnt = webListEthinicty.size();
		// Using Random class to generate random values

		Random numEthnicity = new Random();
		int eSelect = numEthnicity.nextInt(eCnt);

		// Selecting value from DropDownList
		ethnicityObjSel.selectByIndex(eSelect);

		ethnicityObjSel.selectByIndex(eSelect);
		if (eSelect == 11) {
			// if(ethnicityObjSel.selectedValue.equals("Other"){
			driver.findElement(By.name("specifiedEthnicity")).sendKeys(NameOfInsured.generateRandomAlphaNumeric(8));
		} else {
			System.out.println(ethnicityDropDownList.getAttribute("value"));
		}

		// Assign value for address 1 under Patient info section
		driver.findElement(By.id("address-1")).sendKeys("555 Main Street");

		// Assign value for address 1 under Patient info section
		driver.findElement(By.id("address-2")).sendKeys("PO BOX 102");

		// Assign value for City under Patient info section
		driver.findElement(By.id("city")).sendKeys("San Jose");

		// Assign value for Zip under Patient info section
		driver.findElement(By.id("zip-code")).sendKeys("95116");

		// Assign value for state under Patient info section
		driver.findElement(By.id("state")).sendKeys("CA");

		// Assign value for Phone# under Patient info section
		driver.findElement(By.id("address-type")).sendKeys("B");

		// Assign value for phone under Patient info section
		driver.findElement(By.id("phone-number")).sendKeys("1408-555-8888");

		// Selecting a random value in the Reference drop down

		WebElement referenceDropDownList = driver.findElement(By.id("preference"));

		// Using Select Class to fetch the count
		Select referenceObjSel = new Select(referenceDropDownList);
		List<WebElement> webListreference = referenceObjSel.getOptions();

		// Taking the count of items
		int reCnt = webListreference.size();
		// Using Random class to generate random values

		Random numReference = new Random();
		int reSelect = numReference.nextInt(reCnt);

		// Selecting value from DropDownList
		referenceObjSel.selectByIndex(reSelect);

		// Print out Selected Value
		System.out.println(referenceDropDownList.getAttribute("value"));

		// Assign value for Medical record # under Patient info section
		driver.findElement(By.id("medical-record-number")).sendKeys(NameOfInsured.generateRandomAlphaNumeric(10));

		// Assign value for Accession # under Patient info section
		driver.findElement(By.id("accession-number")).sendKeys(NameOfInsured.generateRandomNumber(10));

		// Selecting NO for Discharged
		driver.findElement(By.id("discharged-Yes-1")).click();
		Thread.sleep(1000);

		// Initiate the sample info panel
		allPanels sampleinfopanel = new allPanels(driver);

		// Calling the sampleinfo panel
		sampleinfopanel.getSampleInfoPanel().click();
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

		Thread.sleep(1000);
		WebElement el = driver.findElement(By.id("collection-date-month"));
		el.sendKeys(str);
		Thread.sleep(1000);

		// below is the portion to randomly select the day in the Day drop down

		// Object of the Day Drop downlist
		WebElement lmpDayList = driver.findElement(By.id("collection-date-day"));

		// Using FindElements to create a List object
		// List <WebElement> weblist =
		// driver.findElements(By.xpath(".//*[@id='drpdwnTopics']/option"));
		Thread.sleep(1000);

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

		Thread.sleep(1000);
		// Selecting a year for the LMP drop down
		Select dropdown = new Select(driver.findElement(By.id("collection-date-year")));

		// wait 1 second and select "2019"
		Thread.sleep(1000);
		dropdown.selectByVisibleText("2019");

		// Selecting a value in the Sample Type drop down
		Select dropdownSampleType = new Select(driver.findElement(By.id("sample-type")));

		// wait 1 second and select "2019"
		Thread.sleep(1000);
		dropdownSampleType.selectByVisibleText("Blood");

		// Initiate the Indication for testing panel
		allPanels indicationPanelOrderPage = new allPanels(driver);

		// Click on the Indication For Testing panel
		indicationPanelOrderPage.getIndicationForTestingPanel().click();

		// Check the NO Family History check box
		driver.findElement(By.xpath(
				"//div[@id='root']/div/div/div[1]/div[2]/div/div[7]/div/div/div/div/div[9]/div/div[1]/label/span[2]"))
				.click();

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

		Thread.sleep(5000);

		// Check for the Login and institution
		WebElement username2 = driver.findElement(By.xpath("//div[@id='root']/div[3]"));
		assertEquals(username2.getText().trim(), "Unable to submit order. Please correct any errors and try again.");
		
		// Close browser
		driver.close();

		

	}
}
