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

public class VerifyingWgsOrderPageAndSections {

	public String baseUrl = "https://catalog-qa.baylorgenetics.com/search?";
	String driverPath = "C:\\Eclipse\\chromedriver.exe";
	public WebDriver driver;

	@BeforeTest
	public void setup(ITestContext ctx) {
		TestRunner runner = (TestRunner) ctx;
		runner.setOutputDirectory("J:\\zzQA Selenium Automation Suite\\Test Results");
	}

	@Test

	public void verifyingTheUrlAndSectionWgsOrderPage() throws InterruptedException {
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
		theSearchBar.getTheSearchBar().sendKeys("1800");

		// Initiate getmanifying icon as the allPanels class
		allPanels theMagnifyingIcon = new allPanels(driver);

		// Calling the getmagnifying method from class allPales and insert value
		theMagnifyingIcon.getMagnifyingGlass().click();

		// Clicking on the search result
		driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[2]/div[2]/div[1]/a")).click();
		Thread.sleep(1000);

		// Get the Text from the location and give it a pass or fail base on the text
		if (driver.findElement(By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[3]/div[1]/span")).getText()
				.equalsIgnoreCase("1800")) {
			System.out.println("Details Page Containa TC # Pass");
		} else {
			System.out.println("Details Page Contains TC # Fail");

		}
// Initiate gettheOrderButtonDetailsP icon as the allPanels class
		allPanels theOrderBDetailsPage = new allPanels(driver);

		// Calling the get the order button on the details page method from class
		// allPales and insert value
		theOrderBDetailsPage.gettheOrderButtonDetailsP().click();
		Thread.sleep(2000);

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

		driver.get("https://orders-qa.baylorgenetics.com/create?test=1800");
		Thread.sleep(3000);

		// Validate pass or fail by looking at the keyword in the url
		String url = driver.getCurrentUrl();
		boolean passed = url.contains("1800");
		if (passed) {
			System.out.println("URL Test Passed");
		} else {
			System.out.println("URL Test Failed");
			Assert.fail("This message will be printed in stacktrace if the assertion fails.");
		}

//Verifying the Test number and name on the Order page
		if (driver.findElement(By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[3]")).getText()
				.equalsIgnoreCase("1800WGS Trio")) {
			System.out.println("Order Page Contains 1800 | WGS Trio Pass");
		} else {
			System.out.println("Order Page Contains 1800 | WGS Trio Fail");
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

// #8
		// Assign additionalClinicalInfoSection variable
		allPanels additionalClinicalInfoSection = new allPanels(driver);
		additionalClinicalInfoSection.getAdditionalClinicInfoPanel();

		// Verify the indication-for-testing Primary panel
		if (additionalClinicalInfoSection.getAdditionalClinicInfoPanel() != null) {
			System.out.println("Additional-clinical Section             is Present");
		} else {
			System.out.println("Additional-clinical Section             is Absent");
		}

// #9
		// Assign diffDianosisSection variable
		allPanels diffDianosisSection = new allPanels(driver);
		diffDianosisSection.getDifferentDiagnosisPanel();

		// Verify the Differential-diagnosis section
		if (diffDianosisSection.getDifferentDiagnosisPanel() != null) {
			System.out.println("Differential-diagnosis Section           is Present");
		} else {
			System.out.println("Differential-diagnosis Section           is Absent");
		}

// #10
		// Assign ConsentSection variable
		allPanels ConsentSection = new allPanels(driver);
		ConsentSection.getConsentPanel();

		// Verify the Consent Panel section
		if (ConsentSection.getConsentPanel() != null) {
			System.out.println("Consent Panel  Section                    is Present");
		} else {
			System.out.println("Consent Panel  Section                    is Absent");
		}

// #11
		// Assign parentsConsentSectiontSection variable
		allPanels parentsConsentSectiontSection = new allPanels(driver);
		parentsConsentSectiontSection.getParentsConsentPanel();

		// Verify the Parents-consent section
		if (parentsConsentSectiontSection.getParentsConsentPanel() != null) {
			System.out.println("Parents-consentl  Section                   is Present");
		} else {
			System.out.println("Parents-consent  Section                    is Absent");
		}

// #12
		// Assign nyConsentSectiontSection variable
		allPanels nyConsentSectiontSection = new allPanels(driver);
		nyConsentSectiontSection.getNyConsentPanel();

		// Verify the The ny-consent section
		if (nyConsentSectiontSection.getNyConsentPanel() != null) {
			System.out.println("The ny-consent  Section                    is Present");
		} else {
			System.out.println("The ny-consent  Section                    is Absent");
		}

// #13
		// Assign additionalStudiesSection variable
		allPanels additionalStudiesRSection = new allPanels(driver);
		additionalStudiesRSection.getAdditionalStudiesResearchPanel();

		// Verify the Additional-studies/research section
		if (additionalStudiesRSection.getAdditionalStudiesResearchPanel() != null) {
			System.out.println("Additional-studies/research  Section         is Present");
		} else {
			System.out.println("Additional-studies/research  Section         is Absent");
		}

		Thread.sleep(2000);
		// Close browser
		driver.close();

	}
}
