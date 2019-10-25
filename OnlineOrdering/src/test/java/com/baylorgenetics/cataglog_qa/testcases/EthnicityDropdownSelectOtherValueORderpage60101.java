package com.baylorgenetics.cataglog_qa.testcases;

//import java.util.List;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.support.ui.Select;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baylorgenetics.catalog_qa.pages.allPanels;

public class EthnicityDropdownSelectOtherValueORderpage {

	public String baseUrl = "https://orders-qa.baylorgenetics.com/create?test=60101";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver;

	@BeforeTest
	public void setup(ITestContext ctx) {
		TestRunner runner = (TestRunner) ctx;
		runner.setOutputDirectory("J:\\zzQA Selenium Automation Suite\\Test Results");
	}

	@Test
	public void ValidateOtherInDropdown() throws Exception {

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
		//Thread.sleep(5000);

		// Select the drop down
		Select dropdown = new Select(driver.findElement(By.id("ethnicity")));
		// wait 1 second and select "Other"
		Thread.sleep(1000);

		dropdown.selectByVisibleText("Other (Specify): ");

		// dropdown.selectByVisibleText("Other");
		// pause for 1s
		Thread.sleep(1000);

		driver.findElement(By.name("specifiedEthnicity")).sendKeys("Slavic");

		// Tabbing out of the free form field into the next field
		WebElement e = driver.findElement(By.id("address-1"));
		e.sendKeys(Keys.TAB);
		Actions action = new Actions(driver);
		action.sendKeys(e, Keys.TAB).build().perform();

		// To keep the web browser stay for 3s
		Thread.sleep(2000);

		// Close browser
		driver.close();

	}
}
