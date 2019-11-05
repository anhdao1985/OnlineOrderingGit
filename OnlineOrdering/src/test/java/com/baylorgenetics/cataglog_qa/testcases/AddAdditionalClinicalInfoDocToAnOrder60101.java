package com.baylorgenetics.cataglog_qa.testcases;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import java.util.Iterator;
import java.util.List;
import java.util.Random;
//import java.util.Set;
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

public class AddAdditionalClinicalInfoDocToAnOrder60101 {
	public String baseUrl = "https://catalog-qa.baylorgenetics.com/details/60101";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver;
	GenerateData NameOfInsured;

	@BeforeTest
	public void setup(ITestContext ctx) {
		TestRunner runner = (TestRunner) ctx;
		runner.setOutputDirectory("J:\\zzQA Selenium Automation Suite\\Test Results");
	}

	@Test
	public void addAditionalClinicalInfoDoc() throws InterruptedException, AWTException {
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

		// Generate The First Name of Insured using the GenerateData class
		// driver.findElement(By.xpath("//*[@id='simple-tabpanel-2']/div/div/div[1]/div[2]/div/div[1]/div/div/input")).sendKeys(NameOfInsured.generateRandomAlphaNumeric(8));
		driver.findElement(By.id("first-name")).sendKeys(NameOfInsured.generateRandomString(10));

		// Generate The Middle Name of Insured using the GenerateData class
		driver.findElement(By.id("middle-name")).sendKeys(NameOfInsured.generateRandomString(10));

		// Generate The Last Name of Insured using the GenerateData class
		driver.findElement(By.id("last-name")).sendKeys(NameOfInsured.generateRandomString(10));
		Thread.sleep(1000);


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
		Thread.sleep(3000);

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
		Thread.sleep(3000);

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

		 * Select the radio button randomly List<WebElement> options =
		 * driver.findElements(By.xpath("//*[starts-with(@id, 'patinet-gender')]")) ;
		 * Random randomGender = new Random(); int index =
		 * randomGender.nextInt(options.size()); options.get(index).click();
		 */
		// Selecting female radio button
		driver.findElement(By.xpath("//*[starts-with(@id, 'patient-gender-0')]")).click();
		Thread.sleep(5000);

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
		if (eSelect == 15) {
			// if(ethnicityObjSel.selectedValue.equals("Other"){
			driver.findElement(By.xpath(
					"//div[@id='root']/div/div/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[7]/div/div/input"))
					.sendKeys(NameOfInsured.generateRandomAlphaNumeric(8));

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

		// Object of the Day Drop down list
		WebElement lmpDayList = driver.findElement(By.id("collection-date-day"));

		// Using FindElements to create a List object
		// List <WebElement> weblist =
		// driver.findElements(By.xpath(".//*[@id='drpdwnTopics']/option"));
		Thread.sleep(2000);

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

		// Initiate getDocumentsPanel panel
		allPanels documentsPanel = new allPanels(driver);

		// Click on the Document panel
		documentsPanel.getDocumentsPanel().click();
		Thread.sleep(1000);

		// initiate the select file button
		allPanels theSelectFileButton = new allPanels(driver);

		// click on the Select file button
		theSelectFileButton.getselectFileButton().click();
		Thread.sleep(2000);

		// Click on the Select file button
		// driver.findElement(By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[10]/div/div[2]/div[5]/button/span[1]")).click();
		// Thread.sleep(2000);

		// Paste the file location into the path
		StringSelection ss = new StringSelection("C:\\Users\\atd0623\\Desktop\\Automation test files\\1png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// native key strokes for CTRL, V and ENTER keys
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		// initiate the title field
		allPanels theTitleField = new allPanels(driver);

		// Enter a value in field
		theTitleField.getdocumentTtitleField().sendKeys("png");
		Thread.sleep(1000);

		// Initiate the Doc type drop down
		Select docTypeDropdown = new Select(driver.findElement(By.id("document-type")));

		// wait 1 second and select "Other"
		Thread.sleep(1000);
		docTypeDropdown.selectByVisibleText("Additional Clinical Information");

		// initiate the Description field
		allPanels theDescriptionField = new allPanels(driver);
		Thread.sleep(1000);

		// Enter value in the Description field
		theDescriptionField.getdocumentDescriptionField().sendKeys("png");

		// Initiate the Upload file button
		allPanels theUploadFileButton = new allPanels(driver);

		Thread.sleep(2000);
		// Click on the Upload file button
		theUploadFileButton.getuploadButton().click();

		// Checking for the username and hospital code on the details page
		WebElement username1 = driver.findElement(
				By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[10]/div/div[3]/table/tbody/tr/th"));
		assertEquals(username1.getText().trim(), "png");

		allPanels theSaveButton = new allPanels(driver);

		WebElement element = theSaveButton.gettheSaveButtonOnOrderForm();
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();

		// Close browser
		driver.close();

	}
}
