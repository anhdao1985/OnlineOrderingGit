package com.baylorgenetics.cataglog_qa.testcases;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baylorgenetics.catalog_qa.pages.GenerateData;
import com.baylorgenetics.catalog_qa.pages.allPanels;

public class VerifyingTheOrderKitsLinkandButton {
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
	public void verifyTheOrderkitsURLandButton() throws InterruptedException {
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

		// Click the Order Kits button
		allPanels theOrderKitsButtonOntheDetailsPage = new allPanels(driver);

		// Initiate the orderkit button
		theOrderKitsButtonOntheDetailsPage.gettheOrderKitsButton().click();

		// Validate pass or fail by looking at the keyword in the url
		String url = driver.getCurrentUrl();
		boolean passed = url.contains("https://www.baylorgenetics.com/testing/order-kits/");
		if (passed) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
			Assert.fail("This message will be printed in stacktrace if the assertion fails.");
		}

		// Close browser
		driver.close();

	}
}
