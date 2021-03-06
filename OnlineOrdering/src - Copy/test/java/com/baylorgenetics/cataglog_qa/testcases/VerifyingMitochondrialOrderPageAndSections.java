package com.baylorgenetics.cataglog_qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import com.baylorgenetics.catalog_qa.pages.allPanels;

public class VerifyingMitochondrialOrderPageAndSections {

	public String baseUrl = "https://catalog-qa.baylorgenetics.com/search?";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver;

	@Test
	public void verifyingTheUrlAndSectionMitOrderPage() throws InterruptedException {

		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// The Login window
		// Initiate patientInfo as the allPanels class
		allPanels theSignInButtonButtons = new allPanels(driver);

		// Calling the getpatientInfoPanel method from the class allPanels
		theSignInButtonButtons.getClickSignInButton().click();

		// Initiate username email as the allPanels class
		allPanels userEmail = new allPanels(driver);

		// Calling the usernameEmail method from the class allPanels and insert value
		userEmail.getInputUsernameEmail().sendKeys("b1@yahoo.com");

		// Initiate password email as the allPanels class
		allPanels password = new allPanels(driver);

		// Calling the password method from class allPales and insert value
		password.getPassWord().sendKeys("Test@123456");

		// Initiate the login button on the login window as the allPanels class
		allPanels windowLogInButton = new allPanels(driver);

		// Calling the password method from class allPales and insert value
		windowLogInButton.getWindowLogInButton().click();

		// Initiate the search bar as the allPanels class
		allPanels theSearchBar = new allPanels(driver);

		// Calling the Search bar method from class allPales and insert value
		theSearchBar.getTheSearchBar().sendKeys("2055");

		// Initiate getmanifying icon as the allPanels class
		allPanels theMagnifyingIcon = new allPanels(driver);

		// Calling the getmagnifying method from class allPales and insert value
		theMagnifyingIcon.getMagnifyingGlass().click();

		// Clicking on the search result
		driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[2]/div[2]/div[1]/a")).click();
		Thread.sleep(1000);

		// Get the Text from the location and give it a pass or fail base on the text
		if (driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[3]/div[1]/span")).getText()
				.equalsIgnoreCase("2055")) {
			System.out.println("Details Page Containa TC # Pass");
		} else {
			System.out.println("Details Page Contains TC # Fail");

		}
// Initiate gettheOrderButtonDetailsP icon as the allPanels class
		allPanels theOrderBDetailsPage = new allPanels(driver);

		// Calling the get the order button on the details page method from class
		// allPales and insert value
		theOrderBDetailsPage.gettheOrderButtonDetailsP().click();
		Thread.sleep(1000);

		// Validate pass or fail by looking at the keyword in the url
		String url = driver.getCurrentUrl();
		boolean passed = url.contains("2055");
		if (passed) {
			System.out.println("URL Test Passed");
		} else {
			System.out.println("URL Test Failed");
			Assert.fail("This message will be printed in stacktrace if the assertion fails.");
		}

		// Get the Text from the Order page location and give it a pass or fail base on
		// the text
		if (driver.findElement(By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[1]/span[2]")).getText()
				.equalsIgnoreCase("TC 2055 - ORDER FORM")) {
			System.out.println("Order Page Contains TC # Pass");
		} else {
			System.out.println("Order Page Contains TC # Fail");
		}

// #1
		// Assign patientInfo variable
		allPanels patientInfo = new allPanels(driver);
		patientInfo.getPatientInfoPanel();

		// Verify the Patient Section
		if (patientInfo.getPatientInfoPanel() != null) {
			System.out.println("Patient Info Section                is Present");
		} else {
			System.out.println("Patient Info Section                is Absent");
		}

// #2
		// Assign addRecipientsSection variable
		allPanels addRecipientsSection = new allPanels(driver);
		addRecipientsSection.getAdditionalRecipientsPanel();

		// Verify the Additional Recipients Section
		if (addRecipientsSection.getAdditionalRecipientsPanel() != null) {
			System.out.println("Additional Recipients Section        is Present");
		} else {
			System.out.println("Additional Recipients Section        is Absent");
		}

// #3
		// Assign paymentInfo variable
		allPanels paymentInfo = new allPanels(driver);
		paymentInfo.getPaymentInfoPanel();

		// Verify the Payment Section
		if (paymentInfo.getPatientInfoPanel() != null) {
			System.out.println("Payment Info                         is Present");
		} else {
			System.out.println("Payment Info                         is Absent");
		}

// #4
		// Assign addTestOpInfo variable
		allPanels addTestOpInfo = new allPanels(driver);
		addTestOpInfo.getAdditionalTestOpPanel();

		// Verify the Additional Test Option Section Primary panel
		if (addTestOpInfo.getAdditionalTestOpPanel() != null) {
			System.out.println("Additional Test Option Section        is Present");
		} else {
			System.out.println("Additional Test Option Section        is Absent");
		}

// #5
		// Assign sampleInfo variable
		allPanels sampleInfo = new allPanels(driver);
		sampleInfo.getSampleInfoPanel();

		// Verify the sample-information Primary panel (we have to use null instead of
		// !=0 because this method return a single value)
		if (sampleInfo.getSampleInfoPanel() != null) {
			System.out.println("Sample-information Section           is Present");
		} else {
			System.out.println("Sample-information Section           is Absent");
		}

// #6
		// Assign parentsSection variable
		allPanels parentsSection = new allPanels(driver);
		parentsSection.getParentsPanel();

		// Verify the Parents Section
		// !=0 because this method return a single value)
		if (parentsSection.getParentsPanel() != null) {
			System.out.println("The Parents Section                   is Present");
		} else {
			System.out.println("The Parents Section                   is Absent");
		}

// #7
		// Assign indicationForTTingInfo variable
		allPanels indicationForTTingInfo = new allPanels(driver);
		indicationForTTingInfo.getIndicationForTestingPanel();

		// Verify the indication-for-testing Primary panel
		if (indicationForTTingInfo.getIndicationForTestingPanel() != null) {
			System.out.println("Indication-for-testing Section        is Present");
		} else {
			System.out.println("Indication-for-testing Section        is Absent");
		}

		Thread.sleep(2000);
		// Close browser
		driver.close();

	}
}
