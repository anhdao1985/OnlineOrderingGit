package com.baylorgenetics.cataglog_qa.testcases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.*;

import com.baylorgenetics.catalog_qa.pages.allPanels;

public class LogInFireFox {
	public String baseUrl = "https://catalog-qa.baylorgenetics.com/search?";
	String driverPath = "C:\\Eclipse\\geckodriver.exe";
	public WebDriver driver;

	@BeforeTest
	public void setup(ITestContext ctx) {
		TestRunner runner = (TestRunner) ctx;
		runner.setOutputDirectory("J:\\zzQA Selenium Automation Suite\\Test Results");
	}

	@Test
	public void logInFireFox() throws InterruptedException {
		System.out.println("launching firefox browser");

		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Click on Preconception icon
		driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[2]/div[1]/div")).click();
		Thread.sleep(1000);

		// Click Backpage
		driver.navigate().back();

		Thread.sleep(1000);
		// Click on Prenatal icon
		driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[2]/div[2]/div")).click();
		Thread.sleep(1000);

		// Click Backpage
		driver.navigate().back();

		Thread.sleep(1000);
		// Click on the Pediatric icon
		driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[2]/div[3]/div")).click();
		Thread.sleep(1000);

		// Click Backpage
		driver.navigate().back();

		Thread.sleep(1000);
		// Click on the Adult icon
		driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[2]/div[4]/div")).click();
		Thread.sleep(1000);

		// Click Backpage
		driver.navigate().back();

		Thread.sleep(1000);
		// Click on the Oncology icon
		driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[2]/div[5]/div")).click();
		Thread.sleep(1000);

		// Click Backpage
		driver.navigate().back();

		Thread.sleep(1000);
		// Enter TestCode and click Enter
		driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[1]/form/div[1]/input"))
				.sendKeys("4900");
		driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[1]/form/div[2]/button "))
				.sendKeys(Keys.ENTER);

		// Click on the result
		driver.findElement(By.linkText("Global Metabolomic Assisted Pathway Screen (Global MAPS)®")).click();
		Thread.sleep(1000);

		// click on the login button details page
		allPanels loginButtonDetailsPage = new allPanels(driver);

		// calling the loginbutton on details page
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
		
		Thread.sleep(4000);
/*		
// Get the Text from the location and give it a pass or fail base on the text
		if (driver.findElement(By.className("MuiButton-label")).getText()
				.equalsIgnoreCase("  CLARA ADAMS ▼")) {
			System.out.println("CLARA ADAMS (autotest) ▼ Pass");
		} else {
			System.out.println("CLARA ADAMS (autotest) ▼ Fail");

		}
*/
   //Check for the Login and institution
		WebElement username = driver.findElement(By.className("MuiButton-label"));
		assertEquals(username.getText().trim(), "CLARA ADAMS (AUTOTEST)");

// Use this to get the text in an element
//	 WebElement webElement = driver.findElement(By.className("MuiButton-label"));
//	 System.out.println(webElement.getText());

		Thread.sleep(3000);
		// Expand the Primary panel
		driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[3]/div[7]/button/span[1]")).click();
		Thread.sleep(1000);

		// Expand the Primary panel
		driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[3]/div[8]/button/span[1]")).click();
		Thread.sleep(1000);

		// Expand the Primary panel
		driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[3]/div[9]/button/span[1]")).click();
		Thread.sleep(1000);

		/*
		 * //Expand the Primary panel driver.findElement(By.xpath(
		 * "//div[@id='root']/div/div[1]/div[2]/div/div[3]/div[10]/button/span[1]")).
		 * click(); Thread.sleep(1000);
		 * 
		 * //Expand the Primary panel driver.findElement(By.xpath(
		 * "//div[@id='root']/div/div[1]/div[2]/div/div[3]/div[11]/button/span[1]")).
		 * click(); Thread.sleep(1000);
		 * 
		 * 
		 * //Expand the Primary panel driver.findElement(By.xpath(
		 * "//div[@id='root']/div/header/div/div/div[2]/div[2]/button/span[1]")).click()
		 * ; Thread.sleep(1000);
		 */

		// Click on the Logout button on the page
		// driver.findElement(By.xpath("//*[@id='sign-out']")).click();

		// driver.navigate().refresh();

		// Close out the window
		driver.close();
	}
}