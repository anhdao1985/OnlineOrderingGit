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
	public static By flagUsePatientInfo = (By.xpath("//div[@id='simple-tabpanel-Insurance']/div/div/div[2]/div[1]/div[2]/label/span[1]/span[1]"));
	
	//Patient's RElationship to insured drop down
	public static By patientRelationshipToInsuredDrp = By.id("insuredRelationship");
	
	//Insurance Co. Name field under payment
	public static By insuranceCoNameField = (By.xpath("//div[@id='simple-tabpanel-Insurance']/div/div/div[2]/div[2]/div/div[9]/div/div/input"));
	
	//Insurance Co. Phone field under payment
	public static By insuranceCoPhoneField = (By.xpath("//div[@id='simple-tabpanel-Insurance']/div/div/div[2]/div[2]/div/div[10]/div/div/input"));
		
	//Insurance Member Policy Number under payment
	public static By memberPolicyNumberField = (By.xpath("//div[@id='simple-tabpanel-Insurance']/div/div/div[2]/div[2]/div/div[11]/div/div/input"));
				
	//Insurance Member Group Number under payment
	public static By memberGroupNumberField = (By.xpath("//div[@id='simple-tabpanel-Insurance']/div/div/div[2]/div[2]/div/div[12]/div/div/input"));
								
				
	
	
	
	
	
	
	
	//Institution billing icon
	public static By institutionBillingIcon = By.id("institution-billing");
	
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
	
	//Documents Panel
	public static By documentsPanel = By.id("document-section"); 
	
	//Document title field C:\Users\atd0623\Desktop\Automation test files\1
	
	public static By documentTtitleField = By.id("document-title"); 
	
	//Document type drop down
	public static By documentTypeDropdown = By.id("document-type"); 
	
	//Doc Description field
	public static By documentDescriptionField = By.id("document-description"); 
	
	//Upload button
	public static By uploadButton  = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[10]/div/div[2]/div[6]/button"));
	
	//Select file button
	public static By selectFileButton  = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[10]/div/div[2]/div[5]/button/span[1]"));
	
	
	
	//Egg Donor
	
	//Disorder Specific Test
	
//------Patient Information Panel-----------------------------------------------	
	
	//Save button
	public static By theSaveButtonOnOrderForm  = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[1]/div[2]/button[1]"));
	
	
	//Submit button
	public static By theSubmitButtonOnOrderForm  = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[1]/div[2]/button[2]"));
	
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
	
	//Hospital/medical records#
	public static By hospitalMedicalRecordNumberOrderPage = By.id("medical-record-number"); 
	
	//Accession #
	public static By acessionNumberOrderPage = By.id("accession-number"); 
	
	
	
//----------Sample Information Panel-----------------------------------------------
	
	//Sample Type drop down
	public static By sampleTypeDropDownOrderPage = By.id("accession-number"); 
	
	
	
	
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
	public static By theSearchBar = By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[1]/form/div[1]/input");
	
	//The Magnifying glass icon
	public static By theMagnifyingGlassIcon = By.xpath("//div[@id='root']/div/div[1]/div[2]/div/div[1]/form/div[2]/button");
	
	
	
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
	
//hospital - medical record number
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
	
//Sample type drop down under Sample Information panel	
	public WebElement getsampleTypeDropDownOrderPage () {
		return driver.findElement(sampleTypeDropDownOrderPage);
	}
	
	
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
	
	

	

	
	

	
	
	 
   
	}
	 
	 
	 
	
	
	
	
	


