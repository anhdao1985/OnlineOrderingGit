package com.baylorgenetics.catalog_qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import java.util.List;
import org.openqa.selenium.WebElement;




public class allPanels {
	

//Order Page objects	
	public WebDriver driver;
	
	//Patient Info Panel
	public static By patientInfoPanel  = By.id("patient-information");
	
	//Additional Info Panel
	public static By additionalRecInfoPanel = By.id("additional-recipients"); 
	
	//Payment Info Panel
	public static By paymentInfoPanel = By.id("payment-information"); 
	
	//Additional Test Option Panel
	public static By additionalTestOpPanel = By.id("additional-test-options"); 
	
	//Sample Information Panel
	public static By sampleInfoPanel = By.id("sample-information"); 
	
	//Parents Panel
	public static By parentsPanel = By.id("parents"); 
	
	//Indication For testing
	public static By indicationForTestingPanel = By.id("indication-for-testing"); 
	
	//Additional Clinical Info Panel
	public static By additionalClinicInfoPanel = By.id("additional-clinical-info"); 
	
	//Differential Diagnosis
	public static By differentDiagnosisPanel = By.id("differential-diagnosis"); 
	
	//Consent Panel
	public static By consentPanel = By.id("consent"); 
	
	//Parents consent Panel
	public static By parentsConsentPanel = By.id("parents-consent"); 
	
	//NY Consent
	public static By nyConsentPanel = By.id("ny-consent"); 
	
	//Additional Studies Panel
	public static By additionalStudiesPanel = By.id("additional-studies"); 
	
	//Previous Testing panel
	public static By previousTestingPanel = By.id("previous-testing"); 
	
	//Partner Consent Panel
	public static By partnerConsentPanel = By.id("partner-consent"); 
	
	//Gestational Info Panel
	public static By gestationalInfoPanel = By.id("gestational-information"); 
	
	//Clinical Findings
	public static By clinicalFindingsPanel = By.id("clinical-findings"); 
	
	//Additional Studies/Research
	public static By additionalStudiesResearchPanel = By.id("additional-studies"); 
	
	//Egg Donor
	
	//Disorder Specific Test
	
	//Save button
	
	//Submit button
	
	
// Login window	
	
	//The SignIn button
	public static By signInButton = (By.xpath("//div[@id='root']/div/header/div/div/div[2]/div[2]/button/span[1]"));
	
	//Username as Email
	public static By userNameEmail = By.id("email"); 
	
	//password 
	public static By passWord = By.id("password"); 
	
	//Login button on the Login window
	public static By windowLogInButton = By.id("btn-login"); 
	
	
// The Catalog page
	
	//The search bar
	public static By theSearchBar = By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[1]/form/div[1]/input");
	
	//The Magnifying glass icon
	public static By theMagnifyingGlassIcon = By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[1]/form/div[2]/button");
	
	
	
// The Details page
	
	//The order button
	public static By theOrderButtonDetailsP = By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[2]/div[2]/a[2]");
	
	
	
	
	
	public allPanels(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getPatientInfoPanel() {
		return driver.findElement(patientInfoPanel);
	}

	public WebElement getAdditionalRecipientsPanel() {
		return driver.findElement( additionalRecInfoPanel);
	}

	public WebElement getPaymentInfoPanel() {
		return driver.findElement(paymentInfoPanel);
	}

	public WebElement getAdditionalTestOpPanel() {
		return driver.findElement(additionalTestOpPanel);
	}

	public WebElement getSampleInfoPanel() {
		return driver.findElement(sampleInfoPanel);
	}

	public WebElement getParentsPanel() {
		return driver.findElement(parentsPanel);
	}

	public WebElement getIndicationForTestingPanel() {
		return driver.findElement(indicationForTestingPanel);
	}

	public WebElement getAdditionalClinicInfoPanel() {
		return driver.findElement(additionalClinicInfoPanel);
	}

	public WebElement getDifferentDiagnosisPanel() {
		return driver.findElement(additionalClinicInfoPanel);
	}

	public WebElement getConsentPanel() {
		return driver.findElement(additionalClinicInfoPanel);
	}

	public WebElement getParentsConsentPanel() {
		return driver.findElement(parentsConsentPanel);
	}

	public WebElement getNyConsentPanel() {
		return driver.findElement(nyConsentPanel);
	}

	public WebElement getAdditionalStudiesPanel() {
		return driver.findElement(additionalStudiesPanel);
	}

	public WebElement getPreviousTestingPanel() {
		return driver.findElement(previousTestingPanel);
	}

	public WebElement getPartnerConsentPanel() {
		return driver.findElement(partnerConsentPanel);
	}

	public WebElement getGestationalInfoPanel() {
		return driver.findElement(gestationalInfoPanel);
	}

	public WebElement getClinicalFindingsPanel() {
		return driver.findElement(clinicalFindingsPanel);
	}

	public WebElement getAdditionalStudiesResearchPanel() {
		return driver.findElement(additionalStudiesResearchPanel);
	}

// The Login window

	public WebElement getClickSignInButton() {
		return driver.findElement(signInButton);
	}

	public WebElement getInputUsernameEmail() {
		return driver.findElement(userNameEmail);
	}

	public WebElement getPassWord() {
		return driver.findElement(passWord);
	}

	public WebElement getWindowLogInButton() {
		return driver.findElement(windowLogInButton);
	}


// The Catalog page 
	
	public WebElement getTheSearchBar() {
		return driver.findElement(theSearchBar);
	}

	public WebElement getMagnifyingGlass() {
		return driver.findElement(theMagnifyingGlassIcon);
	}



//The Details page

	public WebElement gettheOrderButtonDetailsP() {
		return driver.findElement(theOrderButtonDetailsP);
	}




















	 
   
	}
	 
	 
	 
	
	
	
	
	


