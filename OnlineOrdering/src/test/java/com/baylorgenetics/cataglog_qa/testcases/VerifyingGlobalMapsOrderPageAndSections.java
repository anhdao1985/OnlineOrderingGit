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

public class VerifyingGlobalMapsOrderPageAndSections {
	public String baseUrl = "https://catalog-qa.baylorgenetics.com/search?";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver;

	@BeforeTest
	public void setup(ITestContext ctx) {
		TestRunner runner = (TestRunner) ctx;
		runner.setOutputDirectory("C:\\Users\\atd0623\\Desktop\\Automation Results");
	}

	@Test
	public void verifyingTheUrlAndSectionWestGlobalMapsOrderPage() throws InterruptedException {

		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

// The Login window
		/*
		 * // Initiate patientInfo as the allPanels class allPanels
		 * theSignInButtonButtons = new allPanels(driver);
		 * 
		 * // Calling the getpatientInfoPanel method from the class allPanels
		 * theSignInButtonButtons.getClickSignInButton().click();
		 */

		// Initiate the search bar as the allPanels class
		allPanels theSearchBar = new allPanels(driver);

		// Calling the Search bar method from class allPales and insert value
		theSearchBar.getTheSearchBar().sendKeys("4900");

		// Initiate getmanifying icon as the allPanels class
		allPanels theMagnifyingIcon = new allPanels(driver);

		// Calling the getmagnifying method from class allPales and insert value
		theMagnifyingIcon.getMagnifyingGlass().click();

		// Clicking on the search result
		driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[2]/div[2]/div[1]/a")).click();

// Initiate gettheOrderButtonDetailsP icon as the allPanels class
		allPanels theOrderBDetailsPage = new allPanels(driver);

// Calling the get the order button on the details page method from class
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

		driver.get("https://orders-qa.baylorgenetics.com/create?test=4900");
		Thread.sleep(3000);

		// Validate pass or fail by looking at the keyword in the url
		String url = driver.getCurrentUrl();
		boolean passed = url.contains("4900");
		if (passed) {
			System.out.println("URL Test Passed");
		} else {
			System.out.println("URL Test Failed");
			Assert.fail("This message will be printed in stacktrace if the assertion fails.");
		}

		/*
		 * // Get the Text from the Order page location and give it a pass or fail base
		 * on // the text if (driver.findElement(By.xpath(
		 * "//div[@id='root']/div/div/div[1]/div[2]/div/div[1]/span[2]")).getText()
		 * .equalsIgnoreCase("TC 4900 - ORDER FORM")) {
		 * System.out.println("Order Page Contains TC # Pass"); } else {
		 * System.out.println("Order Page Contains TC # Fail"); }
		 */

// Verifying the Test number and name on the Order page
		if (driver.findElement(By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[3]")).getText()
				.equalsIgnoreCase("4900Global Metabolomic Assisted Pathway Screen (Global MAPS)®")) {
			System.out.println(
					"Order Page Contains 4900 | Global Metabolomic Assisted Pathway Screen (Global MAPS)® Pass");
		} else {
			System.out.println(
					"Order Page Contains 4900 | Global Metabolomic Assisted Pathway Screen (Global MAPS)® Fail");
		}
//#1			
		// Assign patientInfo variable
		allPanels patientInfo = new allPanels(driver);
		patientInfo.getPatientInfoPanel();

		// Verify the Patient Info Primary panel
		if (patientInfo.getPatientInfoPanel() != null) {
			System.out.println("Patient Info                           is Present");
		} else {
			System.out.println("Patient Info                           is Absent");
		}

//#2			
		// Assign paymentInfo variable
		allPanels paymentInfo = new allPanels(driver);
		paymentInfo.getPaymentInfoPanel();

		// Verify the Payment Info Primary panel
		if (paymentInfo.getPatientInfoPanel() != null) {
			System.out.println("Payment Info                           is Present");
		} else {
			System.out.println("Payment Info                           is Absent");
		}

//#3			
		// Assign sampleInfo variable
		allPanels sampleInfo = new allPanels(driver);
		sampleInfo.getSampleInfoPanel();

		// Verify the sample-information Primary panel (we have to use null instead of
		// !=0 because this method return a single value)
		if (sampleInfo.getSampleInfoPanel() != null) {
			System.out.println("Sample-information                    is Present");
		} else {
			System.out.println("Sample-information                    is Absent");
		}

//#4
		// Assign indicationForTTingInfo variable
		allPanels indicationForTTingInfo = new allPanels(driver);
		indicationForTTingInfo.getIndicationForTestingPanel();

		// Verify the indication-for-testing Primary panel
		if (indicationForTTingInfo.getIndicationForTestingPanel() != null) {
			System.out.println("Indication-for-testing                 is Present");
		} else {
			System.out.println("Indication-for-testing                 is Absent");
		}

//#5			
		// Assign previousTestInfo variable
		allPanels previousTestInfo = new allPanels(driver);
		previousTestInfo.getPreviousTestingPanel();

		// Verify the Previous testing Primary panel
		if (previousTestInfo.getPreviousTestingPanel() != null) {
			System.out.println("The previous-testing Section           is Present");
		} else {
			System.out.println("The previous-testing Section           is Absent");
		}

//#6			
		// Assign indicationForTTingInfo variable
		allPanels aditionalStInfo = new allPanels(driver);
		aditionalStInfo.getAdditionalStudiesResearchPanel();

		// Verify the Additional Studies/Research Primary panel
		if (aditionalStInfo.getAdditionalStudiesResearchPanel() != null) {
			System.out.println("The additional-studies Section        is Present");
		} else {
			System.out.println("The additional-studies Section        is Absent");
		}

		Thread.sleep(2000);

		// Close browser
		driver.close();

		/*
		 * // Verify the Payment Info Primary panel (we use !=0 here because this method
		 * return an array) if
		 * (driver.findElements(By.xpath("//*[@id='payment-information']")).size() != 0)
		 * { System.out.println("Payment Info         is Present"); } else {
		 * System.out.println("Payment Info          is Absent"); }
		 * 
		 * // Verify the sample-information Primary panel if
		 * (driver.findElements(By.xpath("//*[@id='sample-information']")).size() != 0)
		 * { System.out.println("Sample-information  is Present"); } else {
		 * System.out.println("Sample-information  is Absent"); }
		 * 
		 * // Verify the indication-for-testing Primary panel if
		 * (driver.findElements(By.xpath("//*[@id='indication-for-testing']")).size() !=
		 * 0) { System.out.println("Indication-for-testing is Present"); } else {
		 * System.out.println("Indication-for-testing is Absent"); }
		 * 
		 * // Verify the Previous testing Primary panel if
		 * (driver.findElements(By.xpath("//*[@id='previous-testing']")).size() != 0) {
		 * System.out.println("The previous-testing Section is Present"); } else {
		 * System.out.println("The previous-testing Section is Absent"); }
		 * 
		 * // Verify the Additional Studies/Research Primary panel if
		 * (driver.findElements(By.xpath("//*[@id='additional-studies']")).size() != 0)
		 * { System.out.println("The additional-studies Section is Present"); } else {
		 * System.out.println("The additional-studies Section is Absent"); }
		 */

	}
}
