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
	
	//Insurance sub tab / icon
	public static By insuranceIcon = By.id("insurance");

	//Self pay icon
	public static By selfPayIcon = By.id("self-pay");
	
	//flag use Patient info
	public static By flagUsePatientInfo = By.id("use-patient-info");
	
	//Patient's RElationship to insured drop down
	public static By patientRelationshipToInsuredDrp = By.id("insured-relationship-insurance-1");
	
	//Insurance Co. Name field under payment
	public static By insuranceCoNameField =  By.id("insurance-name-insurance-0");
	
	//Insurance Co. Phone field under payment
	public static By insuranceCoPhoneField = By.id("insurance-phone-insurance-0");
		
	//Insurance Member Policy Number under payment
	public static By memberPolicyNumberField = By.id("insured-policy-number-insurance-0");
				
	//Insurance Member Group Number under payment
	public static By memberGroupNumberField =  By.id("insured-group-number-insurance-0");
						
	
	//Pay with sample radio button
	public static By payWithSampleRadioButton = By.id("pay-with-sample");
	
	//Bill to patient radio button
	public static By billTopatientRadioButton = By.id("bill-to-patient");
	
	//Institution billing icon
	public static By institutionBillingIcon = By.id("institution-billing");
	

// Secondary under insurance
	
	//Secondary insured name
	public static By secondaryInsuredNameInsurance = By.id("insured-name-insurance-1");
	
	//Secondary insured dob month
	public static By dobInsuranceMonthDropdown = By.id("dob-insurance-1-month");
	
	//Secondary dob insurance day
	public static By dobInsuranceDayDropdown = By.id("dob-insurance-1-day");
	
	//Secondary dob insurance year
	public static By dobInsuranceYearDropdown = By.id("dob-insurance-1-year");
	
	//Secondary insured relationship insurance field 
	public static By secondaryInsuredRelationship = By.id("insured-relationship-insurance-1");
	
	//Secondary insured phone insurance
	public static By secondaryInsuredPhone = By.id("insured-phone-insurance-1");
	
	//Secondary insured address insurance
	public static By secondaryInsuredAddress = By.id("insured-address-insurance-1");
	
	//Secondary insured zip insurance
	public static By secondaryInsuredZip = By.id("insured-zip-insurance-1");
	
	//Secondary insured state insurance
	public static By secondaryInsuredState = By.id("insured-state-insurance-1");
	
	
	//Secondary insured city insurance
	public static By secondaryCity = By.id ("insured-city-insurance-1");
	
	//Secondary insured name insurance 
	public static By secondaryName = By.id("insurance-name-insurance-1");
	
	//Secondary insured phone insurance
	public static By secondaryPhone = By.id("insurance-phone-insurance-1");
	
	//Secondary insured policy number insurance
	public static By secondaryPolicyNumber = By.id("insured-policy-number-insurance-1");
	
	//Secondary insured group number insurance
	public static By secondaryGroupNumber = By.id("insured-group-number-insurance-1");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//The order-kits button
	public static By theOrderKitsButton = By.id("order-kits");
	
	
	
	
	
	

	
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
	public static By previousTestingPanel = By.id("previous-testings"); 
	
	//Partner Consent Panel
	public static By partnerConsentPanel = By.id("partner-consent"); 
	
	//Gestational Info Panel
	public static By gestationalInfoPanel = By.id("gestational-information"); 
	
	//Clinical Findings
	public static By clinicalFindingsPanel = By.id("clinical-findings"); 
	
	//Additional Studies/Research
	public static By additionalStudiesResearchPanel = By.id("additional-studies"); 
	
	//Documents Panel
	public static By documentsPanel = By.id("document-section"); 
	
	
	
	public static By documentTtitleField = By.id("document-title"); 
	
	//Document type drop down
	public static By documentTypeDropdown = By.id("document-type"); 
	
	//Doc Description field
	public static By documentDescriptionField = By.id("document-description"); 
	
	//Upload button
	public static By uploadButton  = By.id("download-file"); 
	
	//Select file button
	public static By selectFileButton  =  By.id("select-file"); 
	
	
	
	//Egg Donor
	
	//Disorder Specific Test
	
//------Patient Information Panel-----------------------------------------------	
	
	//Save button
	public static By theSaveButtonOnOrderForm  =  By.id("save-order"); 
	
	
	//Submit button
	public static By theSubmitButtonOnOrderForm  = By.id("submit-order"); 
	
	//FirstName
	public static By FNameorderPage = By.id("first-name"); 
	
	//LastName
	public static By LNameorderPage = By.id("last-name"); 
	
	//MiddleName
	public static By MNameorderPage = By.id("middle-name"); 
	
	//Ethnicity drop down
	public static By ethnicityOnOrderPage = By.id("ethnicity"); 
	
	//Address 1 
	public static By address1OrderPage = By.id("address-1"); 
	
	//Address 2
	public static By address2OrderPage = By.id("address-2"); 
	
	//City
	public static By cityfieldOrderPage = By.id("city"); 
	
	//Zip code
	public static By zipcodeFieldOrderPage = By.id("zip-code"); 
	
	//State
	public static By stateDropDownOrderPage = By.id("state"); 
	
	//Address Type
	public static By addressTypeDropDownOrderPage = By.id("address-type"); 
	
	//Phone #
	public static By phoneNumberFieldOrderPage = By.id("phone-number"); 
	
	//Phone type
	public static By phoneTypeDropDownOrderPage = By.id("preference"); 
	
	//Hospital/medical records# (Removed from the UI)
	public static By hospitalMedicalRecordNumberOrderPage = By.id("medical-record-number"); 
	
	//Accession #
	public static By acessionNumberOrderPage = By.id("accession-number"); 
	
	//Birth Month
	public static By birthMonthOrderPage = By.id("birth-date-month");
	
	//Birth Day
	public static By birthDayOrderPage = By.id("birth-date-day");
	
	//Birth Year
	public static By birthYearOrderPage = By.id("birth-date-year");
	
	
//Catalog page
	public static By theLoginButton = By.id("log-in");
	
	
	
	
	
//----------Sample Information Panel-----------------------------------------------
	
	//Sample Type drop down
	public static By sampleTypeDropDownOrderPage = By.id("sample-type"); 
	
	//Collected Month
	public static By sampleCollectedMonth = By.id("collection-date-month");
	
	//Collected day
	public static By sampleCollectedDay = By.id("collection-date-day");
		
	//Collected year
	public static By sampleCollectedYear = By.id("collection-date-year");
		
	
	
// Login window	
	
	//The SignIn button
	public static By signInButton = (By.xpath("//div[@id='root']/div/header/div/div/div[2]/div[2]/button/span[1]"));
	
	//Username as Email
	public static By userNameEmail = By.id("email"); 
	
	//password 
	public static By passWord = By.id("password"); 
	
	//Login button on the Login window
	public static By windowLogInButton = By.id("btn-login"); 
	
	
	//---------------------------------------------------------------
	
	
// The Catalog page
	
	//The search bar
	public static By theSearchBar = By.id("test-search-bar"); 
	
	//The Magnifying glass icon
	public static By theMagnifyingGlassIcon = By.id("search"); 
	
	//The preconception icon
	public static By thePreconceptionIcon = By.id("preconception");
	
	//The Prenatal icon
	public static By thePrenatalIcon = By.id("prenatal");
	
	//The Pediatric icon
	public static By thePediatricIcon = By.id("pediatric");
	
	//The Adult icon
	public static By theAdultIcon = By.id("adult");
	
	//The oncology icon
	public static By theOcologyIcon = By.id("oncology");
	
	
	//---------------------------------------------------------------
	
	
// The Details page
	
	//The order button
	public static By theOrderButtonDetailsP = By.id("order-test");
	
	
	
	//-------&&&&--------------------------------------------------------&&&&&-----------------------------------------&&&------------
	
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


	public WebElement getinsuranceIcon() {
		return driver.findElement(insuranceIcon);
	}

	public WebElement getselfPayIcon () {
		return driver.findElement(selfPayIcon );
	}

	public WebElement getinstitutionBillingIcon() {
		return driver.findElement(institutionBillingIcon);
	}
	
	public WebElement getflagUsePatientInfo() {
		return driver.findElement(flagUsePatientInfo);
	}
	
	public WebElement getpatientRelationshipToInsuredDrp() {
		return driver.findElement(patientRelationshipToInsuredDrp);
	}
	
	public WebElement getinsuranceCoNameField() {
		return driver.findElement(insuranceCoNameField);
	}
	
	public WebElement getinsuranceCoPhoneField() {
		return driver.findElement(insuranceCoPhoneField);
	}
	
	public WebElement getmemberPolicyNumberField() {
		return driver.findElement(memberPolicyNumberField);
	}
	
	public WebElement getmemberGroupNumberField () {
		return driver.findElement(memberGroupNumberField );
	}
	
	//pay with sample radio button
	public WebElement getpayWithSampleRadioButton () {
		return driver.findElement(payWithSampleRadioButton);
	}
	
	//Bill to patient radio button
	public WebElement getbillTopatientRadioButton () {
		return driver.findElement(billTopatientRadioButton);
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

	public WebElement getDocumentsPanel() {
		return driver.findElement(documentsPanel);
	}
	
	
	
	
	
	
	//---------------------------------------------------------------
	
	
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

	
	//---------------------------------------------------------------

// The Catalog page 
	
	public WebElement getTheSearchBar() {
		return driver.findElement(theSearchBar);
	}

	public WebElement getMagnifyingGlass() {
		return driver.findElement(theMagnifyingGlassIcon);
	}
	

	//---------------------------------------------------------------

	
//The Details page

	public WebElement gettheOrderButtonDetailsP() {
		return driver.findElement(theOrderButtonDetailsP);
	}


	
	
	
	
	
	
//The save button

	public WebElement gettheSaveButtonOnOrderForm () {
		return driver.findElement(theSaveButtonOnOrderForm);
	}


// The submit button
	public WebElement gettheSubmitButtonOnOrderForm () {
		return driver.findElement(theSubmitButtonOnOrderForm);
	}

// Address 1
	public WebElement getaddress1OrderPage () {
		return driver.findElement(address1OrderPage);
	}

// Address 2
	public WebElement getaddress2OrderPage () {
		return driver.findElement(address2OrderPage);
	}

// City
	public WebElement getcityfieldOrderPage () {
		return driver.findElement(cityfieldOrderPage);
	}
	
//zip-code	
	public WebElement getzipcodeFieldOrderPage () {
		return driver.findElement(zipcodeFieldOrderPage);
	}
	
//state
	public WebElement getstateDropDownOrderPage () {
		return driver.findElement(stateDropDownOrderPage);
	}
	
//Address Type drop down	
	public WebElement getaddressTypeDropDownOrderPage () {
		return driver.findElement(addressTypeDropDownOrderPage);
	}
	
//phoneNumberFieldOrderPage	
	public WebElement getphoneNumberFieldOrderPage () {
		return driver.findElement(phoneNumberFieldOrderPage);
	}
	
//Phone Type drop down	
	public WebElement getphoneTypeDropDownOrderPage () {
		return driver.findElement(phoneTypeDropDownOrderPage);
	}
	
//hospital - medical record number (REmoved from the UI)
	public WebElement gethospitalMedicalRecordNumberOrderPage () {
		return driver.findElement(hospitalMedicalRecordNumberOrderPage);
	}
	
//Accession number	
	public WebElement getacessionNumberOrderPage () {
		return driver.findElement(acessionNumberOrderPage);
	}
	
//First Name
	public WebElement getFNameorderPage () {
		return driver.findElement(FNameorderPage);
	}	
		
//First Name
	public WebElement getLNameorderPage () {
		return driver.findElement(LNameorderPage);
	}	
			
//Middle Name
	public WebElement getMNameorderPage () {
		return driver.findElement(MNameorderPage);
	}	
				
//Ethnicity
	public WebElement getethnicityOnOrderPage () {
		return driver.findElement(ethnicityOnOrderPage);
	}	
	
//Birth Month
	public WebElement getbirthMonthOrderPage() {
		return driver.findElement(birthMonthOrderPage);
	}	
			
//Birth Day
	public WebElement getbirthDayOrderPage() {
		return driver.findElement(birthDayOrderPage);
	}	
				
//Birth Year
	public WebElement getbirthYearOrderPage() {
		return driver.findElement(birthYearOrderPage);
	}	
					
			
	
	
	
	
	
	

	
	
	

		
	
	
	
//Sample type drop down under Sample Information panel	
	public WebElement getsampleTypeDropDownOrderPage () {
		return driver.findElement(sampleTypeDropDownOrderPage);
	}
	
	//Collected Month
	public WebElement getsampleCollectedMonth () {
		return driver.findElement(sampleCollectedMonth);
	}
	
	//Collected Day
	public WebElement getsampleCollectedDay () {
		return driver.findElement(sampleCollectedDay);
	}
		
	//Collected  year
	public WebElement getsampleCollectedYear () {
		return driver.findElement(sampleCollectedYear);
	}
			
	
	
	
	
	
// Login window	
	
	
	
	
//Document title field 	
	public WebElement getdocumentsPanel () {
		return driver.findElement(documentsPanel);
	}


//Document type field
	public WebElement getdocumentTtitleField () {
		return driver.findElement(documentTtitleField);
	}


//Document type drop down 
	public WebElement getdocumentTypeDropdown () {
		return driver.findElement(documentTypeDropdown);
	}

//Document upload button
	public WebElement getuploadButton () {
		return driver.findElement(uploadButton);
	}

//Select file button
	public WebElement getselectFileButton () {
		return driver.findElement(selectFileButton);
	}
	
//Select file button
	public WebElement getdocumentDescriptionField() {
		return driver.findElement(documentDescriptionField);
	}	
	
	
//Select the orders-kits
	public WebElement gettheOrderKitsButton() {
		return driver.findElement(theOrderKitsButton);
	}	
	

//Select the Preconception icon
	public WebElement getthePreconceptionIcon() {
		return driver.findElement(thePreconceptionIcon);
	}	
			
	
//Select the Prenatal icon
	public WebElement getthePrenatalIcon() {
		return driver.findElement(thePrenatalIcon);
	}	
	
	
//Select the Prenatal icon
	public WebElement getthePediatricIcon() {
		return driver.findElement(thePediatricIcon);
	}	
				
	
//Select the Prenatal icon
	public WebElement gettheAdultIcon() {
		return driver.findElement(theAdultIcon);
	}	
	
	
//Select the Prenatal icon
	public WebElement gettheOcologyIcon() {
		return driver.findElement(theOcologyIcon);
	}	
						
			
//Secondary under insurance
	
	
//Select Secondary insured name
	public WebElement getsecondaryInsuredNameInsurance() {
		return driver.findElement(secondaryInsuredNameInsurance);
	}	
	
//Select Secondary insured dob month
	public WebElement getdobInsuranceMonthDropdown () {
		return driver.findElement(dobInsuranceMonthDropdown );
	}		
	
//Select Secondary dob insurance day
	public WebElement getdobInsuranceDayDropdown () {
		return driver.findElement(dobInsuranceDayDropdown);
	}		
			
//Select Secondary dob insurance year
	public WebElement getdobInsuranceYearDropdown() {
		return driver.findElement(dobInsuranceYearDropdown);
	}		
	
//Select Secondary insured relationship insurance field 
	public WebElement getsecondaryInsuredRelationship() {
		return driver.findElement(secondaryInsuredRelationship);
	}		
			
//Select Secondary insured phone insurance
	public WebElement getsecondaryInsuredPhone() {
		return driver.findElement(secondaryInsuredPhone);
	}		
				
//Select Secondary insured address insurance
	public WebElement getsecondaryInsuredAddress() {
		return driver.findElement(secondaryInsuredAddress);
	}	
		
//Select Secondary insured zip insurance
	public WebElement getsecondaryInsuredZip() {
		return driver.findElement(secondaryInsuredZip);
	}	
		
//Select Secondary insured state insurance
	public WebElement getsecondaryInsuredState() {
		return driver.findElement(secondaryInsuredState);
	}	
		
//Select Secondary insured city insurance
	public WebElement getsecondaryCity() {
		return driver.findElement(secondaryCity);
	}	
		
//Select Secondary insured name insurance 
	public WebElement getsecondaryName() {
		return driver.findElement( secondaryName);
	}		
		
//Select Secondary insured phone insurance 
	public WebElement getsecondaryPhone() {
		return driver.findElement(secondaryPhone);
	}
	
//Select Secondary insured policy number insurance
	public WebElement getsecondaryPolicyNumber() {
		return driver.findElement(secondaryPolicyNumber);
	}
	
//Select Secondary insured group number insurance
	public WebElement getsecondaryGroupNumber() {
		return driver.findElement(secondaryGroupNumber);
	}		
		
		

	
	
	
	
	
	
	
	
	
	
	 
   
	}
	 
	 
	 
	
	
	
	
	


