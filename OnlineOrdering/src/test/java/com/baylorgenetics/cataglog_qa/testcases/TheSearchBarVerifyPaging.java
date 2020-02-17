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

public class TheSearchBarVerifyPaging {
	public String baseUrl = "https://catalog-qa.baylorgenetics.com/search?";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver;

	@BeforeTest
	public void setup(ITestContext ctx) {
		TestRunner runner = (TestRunner) ctx;
		runner.setOutputDirectory("C:\\Users\\atd0623\\Desktop\\Automation Results");
	}

	@Test
	public void countTheResultsSearchBarVerifyPaging() throws InterruptedException {

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
		Thread.sleep(2000);

		// Initiate the draft icon
		allPanels draftIcon = new allPanels(driver);

		// Calling and click on the draft icon
		draftIcon.gettheDraftButton().click();

//We can remove this once the bug for login is fixed		
		// Initiate username email as the allPanels class
		allPanels userEmail2 = new allPanels(driver);

		// Calling the usernameEmail method from the class allPanels and insert value
		userEmail2.getInputUsernameEmail().sendKeys("automation@baylorgenetics.com");

		// Initiate password email as the allPanels class
		allPanels password2 = new allPanels(driver);

		// Calling the password method from class allPales and insert value
		password2.getPassWord().sendKeys("Test@1234");

		// Initiate the login button on the login window as the allPanels class
		allPanels windowLogInButton2 = new allPanels(driver);

		// Calling the password method from class allPales and insert value
		windowLogInButton2.getWindowLogInButton().click();

		// Initiate the Results page drop down
		allPanels resultPageDropDown = new allPanels(driver);

		// Calling the Results page drop down
		resultPageDropDown.gettheResultsPerPage().sendKeys("25");

		// Verify the 25th row in the search grid -
		if (driver.findElement(By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[3]/div[27]/div[1]")).getText()
				.contains("Draft")) {
			System.out.println("25 fifth Draft is found");
		} else {
			System.out.println("25fifth Draft not found");
			Assert.fail("The result grid does not have 25 results as expected");
		}

		// This is to check for the 26th result in the result grid - since the result
		// page is set to 25 then it should not be able to find the 26th in the grid
		if (driver.findElement(By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[3]/div[28]/div[1]")).getText()
				.contains("Draft")) {
			System.out.println("More than 25 results in the search grid Failed");
			Assert.fail("The result grid does not have 25 results as expected");
		} else {
			System.out.println("");

		}

		// Close browser
		driver.close();

	}
}
