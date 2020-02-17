package com.baylorgenetics.cataglog_qa.testcases;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import com.baylorgenetics.catalog_qa.pages.allPanels;

public class TheSearchOrderBarOnActive {
	public String baseUrl = "https://catalog-qa.baylorgenetics.com/search?";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver;

	@BeforeTest
	public void setup(ITestContext ctx) {
		TestRunner runner = (TestRunner) ctx;
		runner.setOutputDirectory("C:\\Users\\atd0623\\Desktop\\Automation Results");
	}

	@Test
	public void testTheSearchOrderBarActivePage() throws InterruptedException {
		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Initiate the Login button on the Search page
		allPanels LoginButtonSearchpage = new allPanels(driver);

		// Calling and click on the login button
		LoginButtonSearchpage.gettheLoginButton().click();

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

		// Calling the password method from class allPanels and insert value
		windowLogInButton.getWindowLogInButton().click();

		// Initiate the draft icon
		allPanels activeIcon = new allPanels(driver);

		// Calling and click on the draft icon
		activeIcon.gettheActiveButton().click();

//We can remove this once the bug for login is fixed		
		// Initiate username email as the allPanels class
		allPanels userEmail2 = new allPanels(driver);

		// Calling the usernameEmail method from the class allPanels and insert value
		userEmail2.getInputUsernameEmail().sendKeys("automation@baylorgenetics.com");

		// Initiate password email as the allPanels class
		allPanels password2 = new allPanels(driver);

		// Calling the password method from class allPales and insert value
		password2.getPassWord().sendKeys("Test@1234");

		Thread.sleep(2000);
		// Initiate the login button on the login window as the allPanels class
		allPanels windowLogInButton2 = new allPanels(driver);

		// Calling the password method from class allPales and insert value
		windowLogInButton2.getWindowLogInButton().click();

		// --------- Searching for Lab#----------------

		// Initiate the searchorder bar on draft page
		allPanels searchOrderBarDraftLabN = new allPanels(driver);

		// Send value into the search bar on draft page
		searchOrderBarDraftLabN.getsearchOrderBarDraftActiveComplete().sendKeys("60101");

		// Initiate the Manifying glass icon on draft page
		allPanels magnifIconDraftPageLabN = new allPanels(driver);

		// Click on the magnifying glass icon to conduct the search
		magnifIconDraftPageLabN.getmagnifyingGlassIconDraftActiveComplete().click();

		// Check the result grid for Lab#
		Thread.sleep(1000);
		// Check the result grid for 60101
		if (driver.getPageSource().contains("60101")) {
			System.out.println("60101 Found");
		} else {
			System.out.println("60101 Not Found");
			Assert.fail("Could not find  in the Result page"); // This will fail the testcase if the button become
																// enable in this scenario
		}

		// --------------------Searching for First Name-----------------------
		// Initiate the search order bar on draft page
		allPanels searchOrderBarDraft2 = new allPanels(driver);

		// Send value into the search bar on draft page
		searchOrderBarDraft2.getsearchOrderBarDraftActiveComplete().sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Thread.sleep(1000);

		// Initiate the searchorder bar on draft page
		allPanels searchOrderBarDraftFN = new allPanels(driver);

		// Send value into the search bar on draft page
		searchOrderBarDraftFN.getsearchOrderBarDraftActiveComplete().sendKeys("9999Automation");

		// Initiate the Manifying glass icon on draft page
		allPanels magnifIconDraftPageFN = new allPanels(driver);

		// Click on the magnifying glass icon to conduct the search
		magnifIconDraftPageFN.getmagnifyingGlassIconDraftActiveComplete().click();

		// Check the result grid for Lab#
		Thread.sleep(1000);
		// Check the result grid for First Name
		if (driver.getPageSource().contains("9999Automation")) {
			System.out.println("9999Automation Found");
		} else {
			System.out.println("9999Automation Not Found");
			Assert.fail("Could not find  in the Result page"); // This will fail the testcase if the button become
																// enable in this scenario
		}

		// --------------------Searching for Last Name-----------------------
		// Initiate the search order bar on draft page
		allPanels searchOrderBarDraft3 = new allPanels(driver);

		// Send value into the search bar on draft page
		searchOrderBarDraft3.getsearchOrderBarDraftActiveComplete().sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Thread.sleep(1000);

		// Initiate the searchorder bar on draft page
		allPanels searchOrderBarDraftLN = new allPanels(driver);

		// Send value into the search bar on draft page
		searchOrderBarDraftLN.getsearchOrderBarDraftActiveComplete().sendKeys("777Automation");

		// Initiate the Manifying glass icon on draft page
		allPanels magnifIconDraftPageLN = new allPanels(driver);

		// Click on the magnifying glass icon to conduct the search
		magnifIconDraftPageLN.getmagnifyingGlassIconDraftActiveComplete().click();

		// Check the result grid for Lab#
		Thread.sleep(1000);
		// Check the result grid for Last Name
		if (driver.getPageSource().contains("777Automation")) {
			System.out.println("777Automation Found");
		} else {
			System.out.println("777Automation Not Found");
			Assert.fail("Could not find  in the Result page"); // This will fail the testcase if the button become
																// enable in this scenario
		}

		// --------------------Searching for DOB-----------------------
		// Initiate the search order bar on draft page
		allPanels searchOrderBarDraft4 = new allPanels(driver);

		// Send value into the search bar on draft page
		searchOrderBarDraft4.getsearchOrderBarDraftActiveComplete().sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Thread.sleep(1000);

		// Initiate the searchorder bar on draft page
		allPanels searchOrderBarDraftDOB = new allPanels(driver);

		// Send value into the search bar on draft page
		searchOrderBarDraftDOB.getsearchOrderBarDraftActiveComplete().sendKeys("10/20/1985");

		// Initiate the Manifying glass icon on draft page
		allPanels magnifIconDraftPageDOB = new allPanels(driver);

		// Click on the magnifying glass icon to conduct the search
		magnifIconDraftPageDOB.getmagnifyingGlassIconDraftActiveComplete().click();

		// Check the result grid for DOB
		Thread.sleep(1000);
		// Check the result grid for DOB
		if (driver.getPageSource().contains("10/20/1985")) {
			System.out.println("10/20/1985 Found");
		} else {
			System.out.println("10/20/1985 Not Found");
			Assert.fail("Could not find  in the Result page"); // This will fail the testcase if the button become
																// enable in this scenario
		}

		// --------------------Searching for Accession Number-----------------------
		// Initiate the search order bar on draft page
		allPanels searchOrderBarDraft5 = new allPanels(driver);

		// Send value into the search bar on draft page
		searchOrderBarDraft5.getsearchOrderBarDraftActiveComplete().sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Thread.sleep(1000);

		// Initiate the searchorder bar on draft page
		allPanels searchOrderBarDraftACN = new allPanels(driver);

		// Send value into the search bar on draft page
		searchOrderBarDraftACN.getsearchOrderBarDraftActiveComplete().sendKeys("8786945208");

		// Initiate the Manifying glass icon on draft page
		allPanels magnifIconDraftPageACN = new allPanels(driver);

		// Click on the magnifying glass icon to conduct the search
		magnifIconDraftPageACN.getmagnifyingGlassIconDraftActiveComplete().click();

		// Check the result grid for ACN
		Thread.sleep(1000);
		// Check the result grid for ACN
		if (driver.getPageSource().contains("8786945208")) {
			System.out.println("Accession # Found");
		} else {
			System.out.println("Accession #  Not Found");
			Assert.fail("Could not find  in the Result page"); // This will fail the testcase if the button become
																// enable in this scenario
		}

// --------------------Searching for Medical Record number-----------------------
		// Initiate the search order bar on draft page
		allPanels searchOrderBarDraft6 = new allPanels(driver);

		// Send value into the search bar on draft page
		searchOrderBarDraft6.getsearchOrderBarDraftActiveComplete().sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Thread.sleep(1000);

		// Initiate the searchorder bar on draft page
		allPanels searchOrderBarDraftMDN = new allPanels(driver);

		// Send value into the search bar on draft page
		searchOrderBarDraftMDN.getsearchOrderBarDraftActiveComplete().sendKeys("MzRXsVLSVf");

		// Initiate the Manifying glass icon on draft page
		allPanels magnifIconDraftPageMDN = new allPanels(driver);

		// Click on the magnifying glass icon to conduct the search
		magnifIconDraftPageMDN.getmagnifyingGlassIconDraftActiveComplete().click();

		// Check the result grid for ACN
		Thread.sleep(1000);
		// Check the result grid for ACN
		if (driver.getPageSource().contains("MzRXsVLSVf")) {
			System.out.println("Medical Record Number Found");
		} else {
			System.out.println("Medical Record Number Not Found");
			Assert.fail("Could not find  in the Result page"); // This will fail the testcase if the button become
																// enable in this scenario
		}

		// Search for the lab number-----------------------
		allPanels searchOrderBarDraft7 = new allPanels(driver);

		// Send value into the search bar on draft page
		searchOrderBarDraft7.getsearchOrderBarDraftActiveComplete().sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Thread.sleep(1000);

		// Initiate the searchorder bar on draft page
		allPanels searchOrderBarDraftMDN7 = new allPanels(driver);

		// Send value into the search bar on draft page
		searchOrderBarDraftMDN7.getsearchOrderBarDraftActiveComplete().sendKeys("5465486");

		// Initiate the Manifying glass icon on draft page
		allPanels magnifIconDraftPageMDN7 = new allPanels(driver);

		// Click on the magnifying glass icon to conduct the search
		magnifIconDraftPageMDN7.getmagnifyingGlassIconDraftActiveComplete().click();

		// Check the result grid for ACN
		Thread.sleep(1000);
		// Check the result grid for ACN
		if (driver.getPageSource().contains("5465486")) {
			System.out.println("Lab # Found");
		} else {
			System.out.println("Lab # Not Found");
			Assert.fail("Could not find  in the Result page"); // This will fail the testcase if the button become
																// enable in this scenario
		}

		// Close browser
		driver.close();
	}
}
