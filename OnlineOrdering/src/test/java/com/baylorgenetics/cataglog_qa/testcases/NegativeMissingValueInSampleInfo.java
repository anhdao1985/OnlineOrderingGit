package com.baylorgenetics.cataglog_qa.testcases;

//import org.testng.Assert;
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
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.support.ui.Select;
import com.baylorgenetics.catalog_qa.pages.GenerateData;
import com.baylorgenetics.catalog_qa.pages.allPanels;

public class NegativeMissingValueInSampleInfo {
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
	public void negativeSubmitOrderWithMissingValuesInSampleInfo() throws InterruptedException {
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

// Click on the Order button to log in instead of the login button on the details page

		// Initiate gettheOrderButtonDetailsP icon as the allPanels class
		allPanels theOrderBDetailsPage = new allPanels(driver);

		// allPales and insert value
		theOrderBDetailsPage.gettheOrderButtonDetailsP().click();

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

		// driver.get("https://orders-qa.baylorgenetics.com/create?test=60101");
		// Thread.sleep(3000);

		// Get the Text from the location and give it a pass or fail base on the text
		if (driver.findElement(By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[2]")).getText()
				.equalsIgnoreCase("60101GeneAware Complete Panel Version 2 (Female)")) {
			System.out.println("Details Page Contains 60101 GeneAware Complete Panel Version 2 (Female) # Pass");
		} else {
			System.out.println("Details Page Contains 60101 GeneAware Complete Panel Version 2 (Female) # Fail");

		}

		// Check for the Login and institution
		WebElement username1 = driver.findElement(By.className("MuiButton-label"));
		assertEquals(username1.getText().trim(), "CLARA ADAMS (AUTOTEST)");

//Use this to get the text in an element 
		// WebElement webElement = driver.findElement(By.className("MuiButton-label"));
		// System.out.println(webElement.getText());

		// Initiate First name value
		allPanels insertValueinFirstName = new allPanels(driver);
		// Calling the FirstName method and send key
		insertValueinFirstName.getFNameorderPage().sendKeys(NameOfInsured.generateRandomString(10));

		// Initiate Last name value
		allPanels insertValueinLastName = new allPanels(driver);
		// Calling the FirstName method and send key
		insertValueinLastName.getLNameorderPage().sendKeys(NameOfInsured.generateRandomString(10));

		// Initiate Middle name value
		allPanels insertValueinmiddleName = new allPanels(driver);
		// Calling the FirstName method and send key
		insertValueinmiddleName.getMNameorderPage().sendKeys(NameOfInsured.generateRandomString(10));

		// below is the portion to randomly select the Month in the Month drop down
		// Object of the Month Dropdownlist
		WebElement drpDwnList = driver.findElement(By.id("birth-date-month"));

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
			driver.findElement(By.className("specifiedEthnicity"))
					.sendKeys(NameOfInsured.generateRandomAlphaNumeric(8));

		} else {
			System.out.println(ethnicityDropDownList.getAttribute("value"));
		}

		// Initiate address1
		allPanels addressOneOnOrderPage = new allPanels(driver);

		// Calling address one from the allPanels class
		addressOneOnOrderPage.getaddress1OrderPage().sendKeys("555 Main Street");

		// Initiate address2
		allPanels addressTwoOnOrderPage = new allPanels(driver);

		// Calling address2 from the allPanels class
		addressTwoOnOrderPage.getaddress2OrderPage().sendKeys("PO BOX 102");

		// Initiate City
		allPanels cityOnOrderPage = new allPanels(driver);

		// Calling city from the allPanels class
		cityOnOrderPage.getcityfieldOrderPage().sendKeys("San Jose");

		// Initiate Zip-code
		allPanels zipcodeOnOrderPage = new allPanels(driver);

		// Calling address from the allPanels class
		zipcodeOnOrderPage.getzipcodeFieldOrderPage().sendKeys("95116");

		// Initiate State
		allPanels stateOnOrderPage = new allPanels(driver);

		// Calling state from the allPanels class
		stateOnOrderPage.getstateDropDownOrderPage().sendKeys("CA");

		// Initiate Address type
		allPanels addressTypeOnOrderPage = new allPanels(driver);

		// Calling address type
		addressTypeOnOrderPage.getaddressTypeDropDownOrderPage().sendKeys("B");

		// Initiate phone#
		allPanels phoneNumberOnOrderPage = new allPanels(driver);

		// Calling phone number
		phoneNumberOnOrderPage.getphoneTypeDropDownOrderPage().sendKeys("1408-555-8888");

		// Initiate PHone type
		allPanels phoneTypeOnOrderPage = new allPanels(driver);

		// Calling Phone type
		phoneTypeOnOrderPage.getphoneTypeDropDownOrderPage().sendKeys("H");

		// Initiate medical record
		allPanels medicalRecordOnOrderPage = new allPanels(driver);

		// Calling medical record
		medicalRecordOnOrderPage.gethospitalMedicalRecordNumberOrderPage()
				.sendKeys(NameOfInsured.generateRandomAlphaNumeric(10));

		// Initiate Accession #
		allPanels accessionNumberOnOrderPage = new allPanels(driver);

		// Calling Accession Number
		accessionNumberOnOrderPage.getacessionNumberOrderPage().sendKeys(NameOfInsured.generateRandomNumber(10));

		// Initiate Sample info panel
		allPanels sampleInfoPanelOnOrderPage = new allPanels(driver);

		// Calling Sample info panel
		sampleInfoPanelOnOrderPage.getSampleInfoPanel().click();

//Setting Month, Day and years for sample info 		 

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

		WebElement el = driver.findElement(By.id("collection-date-month"));
		el.sendKeys(str);
		Thread.sleep(1000);

		// below is the portion to randomly select the day in the Day drop down

		// Object of the Day Drop downlist
		WebElement bdDayList = driver.findElement(By.id("collection-date-day"));

		// Using FindElements to create a List object
		// List <WebElement> weblist =
		// driver.findElements(By.xpath(".//*[@id='drpdwnTopics']/option"));

		// Using Select Class to fetch the count
		Select objBdDaySel = new Select(bdDayList);
		List<WebElement> weblistLmpDay = objBdDaySel.getOptions();

		// Taking the count of items
		int dCnt = weblistLmpDay.size();
		// Using Random class to generate random values

		Random numLmpDay = new Random();
		int dSelect = numLmpDay.nextInt(dCnt);

		// Selecting value from DropDownList
		objBdDaySel.selectByIndex(dSelect);

		// Print out Selected Value
		System.out.println(bdDayList.getAttribute("value"));

		// Selecting a year for the LMP drop down
		Select dropdown = new Select(driver.findElement(By.id("birth-date-year")));

		// wait 1 second and select "2019"
		Thread.sleep(1000);
		dropdown.selectByVisibleText("1985");

		// Selecting female radio button
		driver.findElement(By.xpath("//*[starts-with(@id, 'patient-gender-0')]")).click();
		Thread.sleep(1000);

		// Initiate Sample type dropdown
		// allPanels sampleTypeDrpOnOrderPage = new allPanels(driver);

		// Calling the sample type and Selecting blood
		// sampleTypeDrpOnOrderPage.getsampleTypeDropDownOrderPage().sendKeys("B");

		// Initiate the Submit button
		allPanels submitButtonOnOrderPage = new allPanels(driver);

		// Calling the submit button and then click
		WebElement element1 = submitButtonOnOrderPage.gettheSubmitButtonOnOrderForm();
		Actions actions = new Actions(driver);
		actions.moveToElement(element1).click().build().perform();

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

		Thread.sleep(3000);
		// Close browser
		driver.close();

	}
}
