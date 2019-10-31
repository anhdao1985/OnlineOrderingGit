package com.baylorgenetics.cataglog_qa.testcases;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Random;
//import java.util.Set;
//import java.util.List;
//import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.support.ui.Select;
import com.baylorgenetics.catalog_qa.pages.GenerateData;
import com.baylorgenetics.catalog_qa.pages.allPanels;

public class LoginFlowSigninAtDetailsPage {
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
	public void SignInAtDetailsgPage() throws InterruptedException {
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
		Thread.sleep(2000);

		// Clicking on the search result
		driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[2]/div[2]/div[1]/a")).click();
		Thread.sleep(3000);

		// Innitiate the login button on the catalog page
		allPanels loginButtonDetailsPage = new allPanels(driver);

		// Calling the login button method from class allPanels
		loginButtonDetailsPage.getClickSignInButton().click();

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

		// Checking for the username and hospital code on the catalog page
		WebElement username = driver.findElement(By.className("MuiButton-label"));
		assertEquals(username.getText().trim(), "CLARA ADAMS (AUTOTEST)");

		// Initiate gettheOrderButtonDetailsP icon as the allPanels class
		allPanels theOrderBDetailsPage = new allPanels(driver);

		// allPales and insert value
		theOrderBDetailsPage.gettheOrderButtonDetailsP().click();

		//Verify the Test# and title of the test on the order page
		WebElement username3 = driver.findElement(By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[3]"));
		assertEquals(username3.getText().trim(), "4900Global Metabolomic Assisted Pathway Screen (Global MAPS)®");
				

		// Checking for the username and hospital code on the order page
		WebElement username2 = driver.findElement(By.className("MuiButton-label"));
		assertEquals(username2.getText().trim(), "CLARA ADAMS (AUTOTEST) ▼");

		// To keep the web browser stay for 3s
		Thread.sleep(3000);
		// Close browser
		driver.close();

	}
}




