package com.baylorgenetics.cataglog_qa.testcases;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random; //for any random method
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import com.baylorgenetics.catalog_qa.pages.GenerateData; // importing the GenerateData class into this class
import com.baylorgenetics.catalog_qa.pages.allPanels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MalePatientInformation {

	public String baseUrl = "https://orders-qa.baylorgenetics.com/create?test=60101";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver;
	// initiate NameofInsured as the GenerateData class
	GenerateData NameOfInsured;

	@BeforeTest
	public void setup(ITestContext ctx) {
		TestRunner runner = (TestRunner) ctx;
		runner.setOutputDirectory("J:\\zzQA Selenium Automation Suite\\Test Results");
	}

	@Test
	public void male() throws InterruptedException {

		// This is how i call the class GenerateData
		NameOfInsured = new GenerateData();

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

		driver.get("https://orders-qa.baylorgenetics.com/create?test=60101");
		Thread.sleep(3000);

		// Expand the Payment info
		// driver.findElement(By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[5]/div/button/span[1]")).click();

		// Open the Insurance tab
		// driver.findElement(By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[5]/div/div/div[1]/div/div/button[3]/span[1]")).click();
		// Thread.sleep(1000);

		// Generate The First Name of Insured using the GenerateData class
		// driver.findElement(By.xpath("//*[@id='simple-tabpanel-2']/div/div/div[1]/div[2]/div/div[1]/div/div/input")).sendKeys(NameOfInsured.generateRandomAlphaNumeric(8));
		driver.findElement(By.id("first-name")).sendKeys(NameOfInsured.generateRandomString(10));

		// Generate The Middle Name of Insured using the GenerateData class
		driver.findElement(By.id("middle-name")).sendKeys(NameOfInsured.generateRandomString(10));

		// Generate The Last Name of Insured using the GenerateData class
		driver.findElement(By.id("last-name")).sendKeys(NameOfInsured.generateRandomString(10));
		Thread.sleep(1000);

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

		/*
		 * Select the radio button randomly List<WebElement> options =
		 * driver.findElements(By.xpath("//*[starts-with(@id, 'patinet-gender')]")) ;
		 * Random randomGender = new Random(); int index =
		 * randomGender.nextInt(options.size()); options.get(index).click();
		 */

		// Selecting Male radio button
		driver.findElement(By.xpath("//*[starts-with(@id, 'patient-gender-1')]")).click();
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
		if (eSelect == 15) {
			// if(ethnicityObjSel.selectedValue.equals("Other"){
			driver.findElement(By.xpath(
					"//div[@id='root']/div/div/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[7]/div/div/input "))
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

		// Assign value for Zip under Patient info section
		driver.findElement(By.id("state")).sendKeys("CA");

		// Assign value for Phone# under Patient info section
		driver.findElement(By.id("address-type")).sendKeys("B");

		// Assign value for phone under Patient info section
		driver.findElement(By.id("phone-number")).sendKeys("1408-522-7788");

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

		// To keep the web browser stay for 3s
		Thread.sleep(3000);
		// Close browser
		driver.close();

	}

}
