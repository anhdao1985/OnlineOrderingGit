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
	
	
	
	
//The Merged Couple Report Panel
	
	public static By mergedCoupleReportPanel = By.id("merged-couple-report");
	
	//The Last Name field 
	public static By mergedCoupleLastName = By.id("last-name");
	
	//The First Name field
	public static By mergedCoupleFirstName = By.id("first-name");
	
	//The Birth month drop down under Merged couple report panel
	public static By mergedCoupleBirthMonth = By.id("birthdate-month");
	
	//The Birth day drop down under Merged couple report panel
	public static By mergedCoupleBirthDay = By.id("birthdate-day");
	
	//The Birth year drop down under Merged couple report panel
	public static By mergedCoupleBirthYear = By.id("birthdate-year");
	
	//The Search button under the merged couple report panel
	public static By mergedCoupleSearchButton = By.id("search");
	
	
	
	//The order-kits button
	public static By theOrderKitsButton = By.id("order-kits");
	
	
//----------------objects under the Parents panel-------------
	
	//The Maternal info sub panel
	public static By theMaternalInfosubPanel = By.id("maternal-information");
	
	//The first name field under the Maternal Info sub panel
	public static By theFirstNameMaternal = By.id("parent-first-Maternal");
	
	//The middle name field under the Maternal Info sub panel
	public static By theMiddleNameMaternal = By.id("parent-middle-Maternal");
	
	//The last name field under the Maternal Info sub panel
	public static By theLastNameMaternal = By.id("parent-last-Maternal");
	
	//The parent birthdate month field under the Maternal Info sub panel
	public static By theBDMonthMaternal = By.id("parent-birthdate-Maternal-month");
	
	//The parent birthdate day field under the Maternal Info sub panel
	public static By theBDDayMaternal = By.id("parent-birthdate-Maternal-day");
	
	//The parent birthdate Year field under the Maternal Info sub panel
	public static By theBDYearMaternal = By.id("parent-birthdate-Maternal-year");
	
	//The Asymptomatic radio button under the Maternal Info sub panel
	public static By theAsymptomaticMaternal = By.id("parent-sympto-Maternal"); // dev needs to change this to parent-asymptomatic-maternal
	
	//The Symptomatic radio button under the Maternal Info sub panel
	public static By theSymptomaticMaternal = By.id("parent-sympto-Maternal"); 
	
	//The collected month under the Maternal Info sub panel
	public static By theParentCollectedMonthMaternal = By.id("parent-collected-Maternal-month"); 
	
	//The collected day under the Maternal Info sub panel
	public static By theParentCollectedDayMaternal = By.id("parent-collected-Maternal-month"); 
	
	//The collected year under the Maternal Info sub panel
	public static By theParentCollectedYearMaternal = By.id("parent-collected-Maternal-year"); 
	
	//The sample type under the Maternal Info sub panel
	public static By theParentSampleTypeMaternal = By.id("parent-sample-type-Maternal"); 
	
	//The Paternal info sub panel
	public static By thePaternalInfosubPanel = By.id("paternal-information");

	//The first name field under the Paternal info sub panel
	public static By thePaternalInfoFirstName = By.id("parent-first-Paternal");
	
	//The middle name field under the Paternal info sub panel
	public static By thePaternalInfoMiddleName = By.id("parent-middle-Paternal");
	
	//The last name field under the Paternal info sub panel
	public static By thePaternalInfoLastName = By.id("parent-last-Paternal");
	
	//The birth date month under the Paternal info sub panel
	public static By thePaternalInfoBDMonth = By.id("parent-birthdate-Paternal-month");
	
	//The birth date day under the Paternal info sub panel
	public static By thePaternalInfoBDDay = By.id("parent-birthdate-Paternal-day");
	
	//The birth date day under the Paternal info sub panel
	public static By thePaternalInfoBDYear = By.id("parent-birthdate-Paternal-year");
	
	//The Asymptomatic radio button under the Paternal info sub panel
	public static By thePaternalInfoAsymptomatic1 = By.id("parent-sympto-Paternal"); //Dev need to change this to Asymptomatic
	
	//The Symptomatic radio button under the Paternal info sub panel
	public static By thePaternalInfoSymptomatic1 = By.id("parent-sympto-Paternal");
	
	//The month drop down under the Paternal info sub panel
	public static By thePaternalInfoMonthDropDown1 = By.id("parent-collected-Paternal-month");
	
	//The day drop down under the Paternal info sub panel
	public static By thePaternalInfoDayDropDown1 = By.id("parent-collected-Paternal-day");
	
	//The year drop down under the Paternal info sub panel
	public static By thePaternalInfoYearDropDown1 = By.id("parent-collected-Paternal-year");
	
	//The sample type drop down under the Paternal info sub panel
	public static By thePaternalInfoSampleType1 = By.id("parent-sample-type-Paternal");
	
	
	
	
	
//---------------All panels---------------
	
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
	
	//Additional Clinical Info Panel text field
	public static By additionalClinicInfoPanelTextField = By.id("additional-clinical-info"); 
		
	//Differential Diagnosis
	public static By differentDiagnosisPanel = By.id("differential-diagnosis"); 
	
	//Differential Diagnosis Text field
	public static By differentDiagnosisPanelTextField = By.id("differential-diagnosis-info"); 
	
	
	
//----------------------------------
	//Consent Panel
	public static By consentPanel = By.id("consent"); 
	
	//Yes radio button Medically Actionable under Consent
	public static By yesRadioMedicallyAc = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[12]/div/div/div[2]/label[1]/span[2]/p"));
	
	//No radio button Medically Actionable under Consent
	public static By noRadioMedicallyAc = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[12]/div/div/div[2]/label[2]/span[2]/p"));
	
	//Yes radio button Carrier Status for Autosomal
	public static By yesRadioCarrierStatus = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[12]/div/div/div[4]/label[1]/span[2]/p"));
	
	//No radio button Carrier Status for Autosomal
	public static By noRadioCarrierStatus = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[12]/div/div/div[4]/label[2]/span[2]/p"));
	
	//Yes radio button Samples Submitted NY
	public static By yesRadioSamplesSubmittedNY = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[12]/div/div/div[7]/label[1]/span[2]/p"));
	
	//No radio button Samples Submitted From NY
	public static By noRadioSamplesSubmittedNY = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[12]/div/div/div[7]/label[2]/span[2]/p"));
	
	

	
//----------------------------------------------------------	
	//Parents consent Panel
	public static By parentsConsentPanel = By.id("parents-consent"); 
	
	//Maternal Options secondary panel
	public static By maternalOptionsSecPanel = By.id("maternal-options");
	
	//Paternal Options secondary panel
	public static By paternalOptionsSecPanel = By.id("paternal-options");
	
	//Maternal Yes Medically actionable
	public static By yesMedicallyMaternalActionable = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[13]/div/div/div[1]/div/div[2]/label[1]/span[2]/p"));
	
	//Maternal No Medically actionable
	public static By noMedicallyMaternalActionable = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[13]/div/div/div[1]/div/div[2]/label[2]/span[2]/p"));
	
	//Maternal yes Carrier Status for Autosomal
	public static By yesCarrierMaternalActionable = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[13]/div/div/div[1]/div/div[3]/label[1]/span[2]/p"));
	
	//Maternal No carrier Status for Autosomal
	public static By noCarrierMaternalActionable = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[13]/div/div/div[1]/div/div[3]/label[2]/span[2]/p"));
	
	//Maternal Yes Samples Submitted NY
	public static By yesMaternalSampleSubNYActionable = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[13]/div/div/div[1]/div/div[4]/label[1]/span[2]/p"));
	
	//Maternal No samples Submitted NY
	public static By noMaternalSampleSubNYActionable = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[13]/div/div/div[1]/div/div[4]/label[2]/span[2]/p"));
	
	//Paternal Yes Medically Actionable
	public static By yesPaternalMedicallyActionable = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[13]/div/div/div[2]/div/div[2]/label[1]/span[2]/p"));
	
	//Paternal No Medically Actionable
	public static By noPaternalMedicallyActionable = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[13]/div/div/div[2]/div/div[2]/label[2]/span[2]/p"));
	
	//Paternal yes Carrier Status
	public static By yesPaternalCarrierStatus = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[13]/div/div/div[2]/div/div[3]/label[1]/span[2]/p"));
	
	//Paternal No carrier status
	public static By noPaternalCarrierStatus = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[13]/div/div/div[2]/div/div[3]/label[2]/span[2]/p"));
	
	//Paternal Yes Samples Submitted NY
	public static By yesPaternalSamplesSubmittedNY = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[13]/div/div/div[2]/div/div[4]/label[1]/span[2]/p"));
	
	//Paternal No samples Submitted NY
	public static By noPaternalSamplesSubmittedNY = (By.xpath("//div[@id='root']///*[@id=\"root\"]/div/div/div[1]/div[2]/div/div[13]/div/div/div[2]/div/div[4]/label[2]/span[2]/p"));
	
	
	
	
	
	
	
//--------------------------------------------------------------------------------------------
	
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
	
//---------- Indication for testing TestCode 1500
	
	
	
	
	
	
	
	
	
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
	
	//Hospital/medical records#
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
	
	
	
	
//---------------------The Previous Testing Panel ------------------------------------------
	
	//The Metabolic sub panel
	public static By metabolicSubPanel = By.id("previous-testings"); 
	
	//The Metabolic text box
	public static By metabolicTextBox = By.id("Metabolic Testing-details"); 
	
	//The Baylor Genetics check box under Metabolic
	public static By baylorGeneticsFlagMetabolic = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[8]/div/div/div/div[1]/div/div/div/div/fieldset/div/label[1]/span[1]/span[1]/input"));
	
	//The Another Laboratory check box under Metabolic
	public static By anotherLaboratoryFlagMetabolic = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[8]/div/div/div/div[1]/div/div/div/div/fieldset/div/label[2]/span[1]/span[1]/input"));
	
	//The Chromosomal Microarray analysis
	public static By chromosomalMicroarray = By.id("chromosomal-microarray-analysis"); 
	
	//The Chromosomal Microarray analysis text box
	public static By chromosomalMicroarrayTextBox = By.id("Chromosomal Microarray Analysis-details"); 
	
	//The Baylor Genetics check box under Chromosomal Microarray
	public static By baylorGeneticsFlagChromosomal = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[8]/div/div/div/div[2]/div/div/div/div/fieldset/div/label[1]/span[1]/span[1]/input"));
	
	//The Another Laboratory check box under Chromosomal
	public static By anotherLaboratoryFlagChromosomal = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[8]/div/div/div/div[2]/div/div/div/div/fieldset/div/label[2]/span[1]/span[1]/input"));
	
	//The genetic analysis sub panel
	public static By geneticAnalysisSubPanel = By.id("genetic-analysis"); 
	
	//The genetic analysis text box
	public static By geneticAnalysisTextBox = By.id("Genetic Analysis-details"); 
	
	//The Baylor Genetics check box under Genetic Analysis
	public static By baylorGeneticsFlagGeneAnalysis = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[8]/div/div/div/div[3]/div/div/div/div/fieldset/div/label[1]/span[1]/span[1]/input"));
	
	//The Another Laboratory check box under genetic analysis
	public static By anotherLaboratoryFlagGeneAnalysis = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[8]/div/div/div/div[3]/div/div/div/div/fieldset/div/label[2]/span[1]/span[1]/input"));
	
	
	
//---------------------	Additional studies/research panels----------------------------
	
	//We need to check with Dev so that they can use different id for the fields below


	
	//The additional Study Yes radio button
	public static By additiionalStudiesYesRadio = By.id("additionalStudy-yes"); 
	
	//The additional Study No radio button
	public static By additiionalStudiesNoRadio = By.id("additionalStudy-no"); 
		
	//The use patient info flag
	public static By additiionalStudiesUsePatientFlag = By.id("use-patient-info"); 
	
	//The first name under the Studies/Research
	public static By additiionalStudiesFirstName = By.id("first-name"); // need to have ID change by DEv
	
	//The Middle Name under the Studies/Research
	public static By additiionalStudiesMName = By.id("middle-name"); // need to have ID change by DEv
	
	//The Last Name under the Studies/Research
	public static By additiionalStudiesLName = By.id("last-name"); // need to have ID change by DEv
	
	//The BD month under the Studies/research 
	public static By additiionalStudiesBDmonth = By.id("birth-date-month"); // need to have ID change by DEv
	
	//The BD day under the Studies/research
	public static By additiionalStudiesBDday = By.id("birth-date-day"); // need to have ID change by DEv
	
	//The BD year under the Studies/research
	public static By additiionalStudiesBDyear = By.id("birth-date-year"); // need to have ID change by DEv
	
	//The Phone number under the Studies/research
	public static By additiionalStudiesPhoneNumber = By.id("phone-number"); // need to have ID change by DEv
	
	//The alt phone number under the Studies/Research
	public static By additiionalStudiesAltPhone = By.id("alt-phone-number");
	
	//The address-1 under the Studies/Research
	public static By additiionalStudiesAddress1 = By.id("address-1"); // need to have ID change by DEv
	
	//The address-2 optional
	public static By additiionalStudiesaddress2 = (By.xpath("//div[@id='root']/div/div/div[1]/div[2]/div/div[8]/div/div/div/div[3]/div/div/div/div/fieldset/div/label[2]/span[1]/span[1]/input")); // need to have ID change by DEv
	
	//The city under the Studies/Research
	public static By additiionalStudiesCity = By.id("city"); // need to have ID change by DEv
	
	//The zipcode under the Studies/Research
	public static By additiionalStudiesZipcode = By.id("zip-code"); // need to have ID change by DEv
	
	//The state under the Studies/Research
	public static By additiionalStudiesState = By.id("state"); // need to have ID change by DEv
		
	//The email under the Studies/Research
	public static By additiionalStudiesEmail = By.id("email");
	
	//The preferred contact method-0 under the Studies/Research
	public static By additiionalPreferredContactMethod0 = By.id("preferred-contact-method-0");
	
	//The preferred contact method-1 under the Studies/Research
	public static By additiionalPreferredContactMethod1 = By.id("preferred-contact-method-1");
	
	//The preferred contact method-2 under the Studies/Research
	public static By additiionalPreferredContactMethod2 = By.id("preferred-contact-method-2");
		
	//The preferred contact method-3 under the Studies/Research
	public static By additiionalPreferredContactMethod3 = By.id("preferred-contact-method-3");
	
	
	
	
	
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

// Additional Clinical Info Panel	
	public WebElement getAdditionalClinicInfoPanel() {
		return driver.findElement(additionalClinicInfoPanel);
	}

	public WebElement getadditionalClinicInfoPanelTextField() {
		return driver.findElement(additionalClinicInfoPanelTextField);
	}

// Different Diagnosis Panel	
	public WebElement getDifferentDiagnosisPanel() {
		return driver.findElement(additionalClinicInfoPanel);
	}

	public WebElement getdifferentDiagnosisPanelTextField() {
		return driver.findElement(differentDiagnosisPanelTextField);
	}

	
	
	
//-----------------Consent----------------------------	
	public WebElement getConsentPanel() {
		return driver.findElement(additionalClinicInfoPanel);
	}

	public WebElement getyesRadioMedicallyAc() {
		return driver.findElement(yesRadioMedicallyAc);
	}
	
	public WebElement getnoRadioMedicallyAc() {
		return driver.findElement(noRadioMedicallyAc);
	}
	
	public WebElement getyesRadioCarrierStatus() {
		return driver.findElement(yesRadioCarrierStatus);
	}
	
	public WebElement getnoRadioCarrierStatus() {
		return driver.findElement(noRadioCarrierStatus);
	}	
	
	public WebElement getyesRadioSamplesSubmittedNY() {
		return driver.findElement(yesRadioSamplesSubmittedNY);
	}	
		
	public WebElement getnoRadioSamplesSubmittedNY() {
		return driver.findElement(noRadioSamplesSubmittedNY);
	}		
		
	
	
//----------------------Parent consents-----------------------------------	
	public WebElement getParentsConsentPanel() {
		return driver.findElement(parentsConsentPanel);
	}
	
	public WebElement getmaternalOptionsSecPanel() {
		return driver.findElement(maternalOptionsSecPanel);
	}

	public WebElement getpaternalOptionsSecPanel() {
		return driver.findElement(paternalOptionsSecPanel);
	}

	public WebElement getyesMedicallyMaternalActionable() {
		return driver.findElement(yesMedicallyMaternalActionable);
	}
	
	public WebElement getnoMedicallyMaternalActionable() {
		return driver.findElement(noMedicallyMaternalActionable);
	}
	
	public WebElement getyesCarrierMaternalActionable() {
		return driver.findElement(yesCarrierMaternalActionable);
	}

	public WebElement getnoCarrierMaternalActionable() {
		return driver.findElement(noCarrierMaternalActionable);
	}
	
	public WebElement getYesMaternalSampleSubNYActionable() {
		return driver.findElement(yesMaternalSampleSubNYActionable);
	}
	
	public WebElement getNoMaternalSampleSubNYActionable() {
		return driver.findElement(noMaternalSampleSubNYActionable);
	}	
		
	public WebElement getYesPaternalMedicallyActionable() {
		return driver.findElement(yesPaternalMedicallyActionable);
	}	
		
	public WebElement getNoPaternalMedicallyActionable() {
		return driver.findElement(noPaternalMedicallyActionable);
	}	
		
	public WebElement getYesPaternalCarrierStatus() {
		return driver.findElement(yesPaternalCarrierStatus);
	}	
		
	public WebElement getNoPaternalCarrierStatus() {
		return driver.findElement(noPaternalCarrierStatus);
	}	
			
	public WebElement getYesPaternalSamplesSubmittedNY() {
		return driver.findElement(yesPaternalSamplesSubmittedNY);
	}	
		
	public WebElement getNoPaternalSamplesSubmittedNY() {
		return driver.findElement(noPaternalSamplesSubmittedNY);
	}	
		
		

	
	
//------------------------------------------------	
	

	
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

//---------------Merged couple -----
//Select the Merged COuple Report Panel
	public WebElement getmergedCoupleReportPanel() {
		return driver.findElement(mergedCoupleReportPanel);
	}			
	
//Select the Last Name field under the Merged Couple Report	
	public WebElement getmergedCoupleLastName() {
		return driver.findElement(mergedCoupleLastName);
	}			
	
//Select the First Name field under the Merged Couple Report	
	public WebElement getmergedCoupleFirstName() {
		return driver.findElement(mergedCoupleFirstName);
	}			
			
//Select Birth month drop down under Merged couple report panel
	public WebElement getmergedCoupleBirthMonth() {
		return driver.findElement( mergedCoupleBirthMonth);
	}			
		
//Select the Birth day drop down under Merged couple report panel				
	public WebElement getmergedCoupleBirthDay() {
		return driver.findElement(mergedCoupleBirthDay);
	}			
	
//Select The Birth year drop down under Merged couple report panel			
	public WebElement getmergedCoupleBirthYear() {
		return driver.findElement(mergedCoupleBirthYear);
	}			
			
//Select The Search button under Merged couple report panel			
	public WebElement getmergedCoupleSearchButton() {
		return driver.findElement(mergedCoupleSearchButton);
	}			
				
	
//-----------------------The Previous Testing Panel-------------------- 	
	
//Select The Metabolic sub panel
	public WebElement getmetabolicSubPanel() {
		return driver.findElement(metabolicSubPanel);
	}			
		
//The Metabolic text box	
	public WebElement getmetabolicTextBox() {
		return driver.findElement(metabolicTextBox);
	}			
		
//The Baylor Genetics check box under Metabolic	
	public WebElement getbaylorGeneticsFlagMetabolic() {
		return driver.findElement(baylorGeneticsFlagMetabolic);
	}
	
//The Another Laboratory check box under Metabolic	
	public WebElement getanotherLaboratoryFlagMetabolic() {
		return driver.findElement(anotherLaboratoryFlagMetabolic);
	}
	
//The Chromosomal Microarray analysis	
	public WebElement getchromosomalMicroarray() {
		return driver.findElement(chromosomalMicroarray);
	}
		
//The Chromosomal Microarray analysis text box	
	public WebElement getchromosomalMicroarrayTextBox() {
		return driver.findElement(chromosomalMicroarrayTextBox);
	}
			
//The Baylor Genetics check box under Chromosomal Microarray		
	public WebElement getbaylorGeneticsFlagChromosomal() {
		return driver.findElement(baylorGeneticsFlagChromosomal);
	}
		
//The Another Laboratory check box under Chromosomal		
	public WebElement getanotherLaboratoryFlagChromosomal() {
		return driver.findElement(anotherLaboratoryFlagChromosomal);
	}	
	
//The genetic analysis sub panel	
	public WebElement getgeneticAnalysisSubPanel() {
		return driver.findElement(geneticAnalysisSubPanel);
	}	
	
//The genetic analysis text box	
	public WebElement getgeneticAnalysisTextBox () {
		return driver.findElement(geneticAnalysisTextBox);
	}
	
//The Baylor Genetics check box under Genetic Analysis	
	public WebElement getbaylorGeneticsFlagGeneAnalysis () {
		return driver.findElement(baylorGeneticsFlagGeneAnalysis);
	}
		
//The Another Laboratory check box under genetic analysis	
	public WebElement getanotherLaboratoryFlagGeneAnalysis () {
		return driver.findElement(anotherLaboratoryFlagGeneAnalysis);
	}	
		
		
//--------------------------Additional Studies/Research--------------
	
	
//The Additional Studies/Research panel	
	
	
//The additional Study Yes radio button	
	public WebElement getadditiionalStudiesYesRadio () {
		return driver.findElement(additiionalStudiesYesRadio);
	}		
	
//The additional Study No radio button	
	public WebElement getadditiionalStudiesNoRadio () {
		return driver.findElement(additiionalStudiesNoRadio);
	}	
	
//The use patient info flag	
	public WebElement getadditiionalStudiesUsePatientFlag () {
		return driver.findElement(additiionalStudiesUsePatientFlag);
	}	
	
//The first name under the Studies/Research
	public WebElement getadditiionalStudiesFirstName () {
		return driver.findElement(additiionalStudiesFirstName);
	}
	
//The Middle Name under the Studies/Research	
	public WebElement getadditiionalStudiesMName () {
		return driver.findElement(additiionalStudiesMName);
	}

//The Last Name under the Studies/Research		
	public WebElement getadditiionalStudiesLName () {
		return driver.findElement(additiionalStudiesLName);
	}
	
//The BD month under the Studies/research 	
	public WebElement getadditiionalStudiesBDmonth () {
		return driver.findElement(additiionalStudiesBDmonth);
	}
		
//The BD day under the Studies/research	
	public WebElement getadditiionalStudiesBDday () {
		return driver.findElement(additiionalStudiesBDday);
	}
		
//The BD year under the Studies/research	
	public WebElement getadditiionalStudiesBDyear () {
		return driver.findElement(additiionalStudiesBDyear);
	}
		
//The Phone number under the Studies/research		
	public WebElement getadditiionalStudiesPhoneNumber () {
		return driver.findElement(additiionalStudiesPhoneNumber);
	}	
		
//The alt phone number under the Studies/Research		
	public WebElement getadditiionalStudiesAltPhone  () {
		return driver.findElement(additiionalStudiesAltPhone );
	}	
		
//The address-1 under the Studies/Research		
	public WebElement getadditiionalStudiesAddress1  () {
		return driver.findElement(additiionalStudiesAddress1 );
	}	
		
//The address-2 optional
	public WebElement getadditiionalStudiesaddress2  () {
		return driver.findElement(additiionalStudiesaddress2);
	}
	
//The city under the Studies/Research	
	public WebElement getadditiionalStudiesCity () {
		return driver.findElement(additiionalStudiesCity );
	}
	
//The zipcode under the Studies/Research		
	public WebElement getadditiionalStudiesZipcode () {
		return driver.findElement( additiionalStudiesZipcode );
	}	
	
//The state under the Studies/Research		
	public WebElement getadditiionalStudiesState() {
		return driver.findElement( additiionalStudiesState );
	}	
	
//The email under the Studies/Research	
	public WebElement getadditiionalStudiesEmail() {
		return driver.findElement(additiionalStudiesEmail);
	}	
		
//The preferred contact method-0 under the Studies/Research	
	public WebElement getadditiionalPreferredContactMethod0 () {
		return driver.findElement( additiionalPreferredContactMethod0 );
	}	
	
//The preferred contact method-1 under the Studies/Research	
	public WebElement getadditiionalPreferredContactMethod1  () {
		return driver.findElement(additiionalPreferredContactMethod1);
	}	
	
//The preferred contact method-2 under the Studies/Research		
	public WebElement getadditiionalPreferredContactMethod2() {
		return driver.findElement(additiionalPreferredContactMethod2);
	}	
		
//The preferred contact method-3 under the Studies/Research
	public WebElement getadditiionalPreferredContactMethod3() {
		return driver.findElement(additiionalPreferredContactMethod3);
	}	
	
		
//----------------objects under the Parents panel-------------		
		
//The Maternal info sub panel
	public WebElement gettheMaternalInfosubPanel() {
		return driver.findElement(theMaternalInfosubPanel);
	}	
		
//The first name field under the Maternal Info sub panel	
	public WebElement gettheFirstNameMaternal() {
		return driver.findElement(theFirstNameMaternal);
	}
	
//The middle name field under the Maternal Info sub panel	
	public WebElement gettheMiddleNameMaternal() {
		return driver.findElement(theMiddleNameMaternal);
	}
	
//The last name field under the Maternal Info sub panel
	public WebElement gettheLastNameMaternal() {
		return driver.findElement(theLastNameMaternal);
	}
	
//The parent birthdate month field under the Maternal Info sub panel
	public WebElement gettheBDMonthMaternal() {
		return driver.findElement(theBDMonthMaternal);
	}
	
//The parent birthdate day field under the Maternal Info sub panel
	public WebElement gettheBDDayMaternal() {
		return driver.findElement(theBDDayMaternal);
	}
	
//The parent birthdate Year field under the Maternal Info sub panel	
	public WebElement gettheBDYearMaternal() {
		return driver.findElement(theBDYearMaternal);
	}	

//The Asymptomatic radio button under the Maternal Info sub panel		
	public WebElement gettheAsymptomaticMaternal() {
		return driver.findElement(theAsymptomaticMaternal);
	}
		
//The Symptomatic radio button under the Maternal Info sub panel
	public WebElement gettheSymptomaticMaternal() {
		return driver.findElement(theSymptomaticMaternal);
	}
	
//The collected month under the Maternal Info sub panel	
	public WebElement gettheParentCollectedMonthMaternal() {
		return driver.findElement(theParentCollectedMonthMaternal);
	}
	
//The collected day under the Maternal Info sub panel	
	public WebElement gettheParentCollectedDayMaternal() {
		return driver.findElement(theParentCollectedDayMaternal);
	}
	
//The collected year under the Maternal Info sub panel		
	public WebElement gettheParentCollectedYearMaternal() {
		return driver.findElement(theParentCollectedYearMaternal);
	}	
	
//The sample type under the Maternal Info sub panel		
	public WebElement gettheParentSampleTypeMaternal() {
		return driver.findElement(theParentSampleTypeMaternal);
	}
		
//The Paternal info sub panel
	public WebElement getthePaternalInfosubPanel() {
		return driver.findElement(thePaternalInfosubPanel);
	}
		
//The first name field under the Paternal info sub panel	
	public WebElement getthePaternalInfoFirstName () {
		return driver.findElement(thePaternalInfoFirstName );
	}	
	
//The middle name field under the Paternal info sub panel
	public WebElement getthePaternalInfoMiddleName() {
		return driver.findElement(thePaternalInfoMiddleName);
	}
		
//The last name field under the Paternal info sub panel		
	public WebElement getthePaternalInfoLastName() {
		return driver.findElement(thePaternalInfoLastName);
	}
	
//The birth date month under the Paternal info sub panel	
	public WebElement getthePaternalInfoBDMonth() {
		return driver.findElement(thePaternalInfoBDMonth);
	}
	
//The birth date day under the Paternal info sub panel	
	public WebElement getthePaternalInfoBDDay() {
		return driver.findElement(thePaternalInfoBDDay);
	}	
	

	//The birth date day under the Paternal info sub panel		
		public WebElement getthePaternalInfoBDYear() {
			return driver.findElement(thePaternalInfoBDYear);
		}	
			
	//The Asymptomatic radio button under the Paternal info sub panel	
		public WebElement getthePaternalInfoAsymptomatic() {
			return driver.findElement(thePaternalInfoAsymptomatic1);
		}	
		
	//The Symptomatic radio button under the Paternal info sub panel		
		public WebElement getthePaternalInfoSymptomatic() {
			return driver.findElement(thePaternalInfoSymptomatic1);
		}	
		
	//The month drop down under the Paternal info sub panel	
		public WebElement getthePaternalInfoMonthDropDown() {
			return driver.findElement(thePaternalInfoMonthDropDown1);
		}
			
	//The day drop down under the Paternal info sub panel		
		public WebElement getthePaternalInfoDayDropDown() {
			return driver.findElement(thePaternalInfoDayDropDown1);
		}
			
	//The year drop down under the Paternal info sub panel		
		public WebElement getthePaternalInfoYearDropDown() {
			return driver.findElement(thePaternalInfoYearDropDown1);
		}	
			
	//The sample type drop down under the Paternal info sub panel		
		public WebElement getthePaternalInfoSampleType() {
			return driver.findElement(thePaternalInfoSampleType1);
		}	
				
		
	
	
	
	
		
	 
   
	}
	 
	 
	 
	
	
	
	
	


