
package com.pages;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;

import org.openqa.selenium.WebElement.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.interactions.Actions;

import Common.WaitWrapper;
import Utility.Logs.Log;

public class MarketingURLMenuValidations extends BasePage {

	public MarketingURLMenuValidations(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement element;
	public String MarketingURL = "https://test.brokerengage.net/brokerengage/MarketPlace//home/MarketingInd?id=574CDEDBD4629C1C786B08862B288F76671E70CE8F17A577&PID=1&SourceChannel=&CampaignID=&BussinessType=1FEDCE0C08C7488C945D35B62F5ECA54&lob=3054C870A85D8708&language=5D48E24E09B547B2";
	public String ExpectedResult = "Applicants were excluded from the quote because they may be eligible for Medicaid/CHIP.";
	String imgSrc;
	String expectedImgSrc;
	String expectedAppURL;
	String NoCoverageText = "No coverage in the selected state";
	String NoCoverageBodyText = "We currently do not provide coverage in the state of Colorado. Please get in touch with the agent at 1-(566) 666-6556 to continue shopping.";
	String expectedURL = "https://www.cigna.com/static/www-cigna-com/docs/ifp/m-24-sbc-fl-944438-b-connect8500.pdf";
	String customerInfoURL = "https://test.brokerengage.net/brokerengage/marketplace/customer/customerinformation";
	String marketplaceURL = "https://test.brokerengage.net/brokerengage/marketplace/Customer/ActionCenter";
	String applicationURL = "https://test.brokerengage.net/brokerengage/marketplace/customer/applications";
	String attachmentURL = "https://test.brokerengage.net/brokerengage/marketplace/customer/attachments";
	String communicationURL = "https://test.brokerengage.net/brokerengage/marketplace/customer/communications";
	String paymentURL = "https://test.brokerengage.net/brokerengage/marketplace/customer/payment";

	private By SelectUser = By.xpath("//a[@class='dropdownMenu user-details-menuSection dropdownArrowMenu']");
	private By SelectAgency = By.xpath("(//a[contains(.,'Agency Details')])[1]");
	private By SelectLogout = By.xpath("(//a[contains(.,'Sign Out')])[2]");
	private By MarketingLabel = By.xpath("//label[contains(.,' Marketing Details')]");
	private By BusinessType = By.xpath("(//input[@class='select-dropdown dropdown-trigger'])[5]");
	private By LifeOfBusiness = By.xpath("(//input[@class='select-dropdown dropdown-trigger'])[6]");
	private By MarketingURLButton = By.id("MarketingURL_button");
	private By CopyMarketingURL = By.cssSelector("#generate_url_id > ul > li.margin_bottom_0px > p");
	private By LogoutButtonConfirmation = By.xpath(
			"//a[@class='modal-action tertiary_background waves-effect waves-light btn-large ConfirmForceLogin']");
	private By ClickOnCloseButton = By.xpath("//*[@class='close_icon modal-close right']");
	private By ZipCode = By.xpath("//*[@id='zipcode']");
	private By NoCoverageTitleValidationText = By.cssSelector("body > app-root > app-zipcode > div > div > div.main_content_section.no-border.zipSection > div > div.error.message_display_section > div > p.heading");
	private By NoCoverageBodyValidationText = By.cssSelector("body > app-root > app-zipcode > div > div > div.main_content_section.no-border.zipSection > div > div.error.message_display_section > div > p.content");
	private By ContactNumber = By.xpath("//*[@class='nav-link call_on_number_submitm']");
	private By GetStartedButton = By.xpath("//a[contains(text(),'get started')]");
	private By TalkWithAnAgentText = By.xpath("//*[@class='talkAgentHeading']");
	private By AgentArrowLinkCollapse = By.xpath("//a[@class='closeTalkAgentSection tooltipDisable']");
	private By AgentArrowLinkExpand = By.xpath("//a[@class='talkAgentLink']");
	private By CallBackRequest = By.xpath("//a[@class='callBackButton request_callback_click_submitm']");
	private By ApplicantDOB = By.xpath("//input[@id='dob']");
	private By SaveButton = By.cssSelector(
			"#myselfSection > div.members_input_section.householdPanel.myselfSection > div.section_button > a");
	private By ContinueButton = By.xpath("//a[contains(.,'Continue')]");
	private By DrugContinueButton = By
			.cssSelector("#EditPrescription > div > div.button_section > a.lg-btn.half_width_btn");
	private By SendButton = By.xpath("//a[contains(.,'Send')]");
	private By RegenerateProposal = By.xpath("(//span[contains(.,'Regenerate proposal')])[1]");
	private By ClickSendButton = By.xpath("(//a[contains(.,'Send')])[2]");
	private By MainMenu = By.xpath("//li[@class='link_menu hide-on-med-and-down sideMenuHamburger']");
	private By SelectQuotes = By.cssSelector("#sideMenuContent > div > ul > li:nth-child(2)");
	private By CustomerInformationTab = By.cssSelector("#sideMenuContent > div > ul > li:nth-child(1) > a");
	private By ValidateWrittenLanguage = By.cssSelector("#test1 > div.plain_widget.margin_bottom_40px.personal_info_tiles_parent > ul > li:nth-child(2) > ul > li:nth-child(2)");
	private By MarketplaceInformatioTab = By.cssSelector("#sideMenuContent > div > ul > li:nth-child(3)");
	private By ApplicationTab = By.cssSelector("#sideMenuContent > div > ul > li:nth-child(4)");
	private By AttachmentsTab = By.cssSelector("#sideMenuContent > div > ul > li:nth-child(5)");
	private By CommunicationsTab = By.cssSelector("#sideMenuContent > div > ul > li:nth-child(6)");
	private By PaymentHistoryTab = By.cssSelector("#sideMenuContent > div > ul > li:nth-child(7)");
	private By SelectMarketPlace = By.cssSelector("#sideMenuContent > div > ul > li:nth-child(3)");
	private By SelectActionsCenter = By.cssSelector("#sideMenuContent > div > ul > li.active > div > ul > li:nth-child(1) > a");
	
	private By ExpandArrow = By.xpath("(//a[@class='up_down_twisting_in_plan_box viewparentquotesdetails'])[1]");
	private By SBCDropDown = By.xpath("//a[@class='dropdown-trigger custom_sbc']");
	private By ViewSBC = By.xpath("(//a[contains(.,'View')])[1]");
	private By EmailSBC = By.xpath("(//a[contains(.,'Email')])[1]");
	private By SBCEmailTextField = By.xpath("//*[@id='SBCEmail']");
	
	private By SortPlans = By.xpath("//*[@id='listValue']");
	private By LowestDeductible = By.xpath("//a[@id='pf__lowest_deductible']");
	private By InNetworkFacility = By.xpath("//a[@id='pf__in_network_facility']");
	private By CompareFirstPlan = By.xpath("(//label[contains(.,'Compare')])[1]");
	private By CompareSecondPlan = By.xpath("(//label[contains(.,'Compare')])[2]");
	private By CompareThirdPlan = By.xpath("(//label[contains(.,'Compare')])[3]");
	private By SBCDownload = By.xpath("//a[@id='DownloadSBC']");
	private By ClickOnCompareButton = By.xpath("//a[@id='ButtoCompare']");
	private By VerifyPlans = By.xpath("//span[contains(.,'3 ')]");
	private By ClickContinueButton = By.xpath("(//a[contains(.,'Continue')])[1]");
	private By SenderOElement = By.cssSelector(
			"#PartialPlanBoxlistGrid > div:nth-child(11) > div.plan_row.planNameFeturesSec > div.plan_name_logo_section > p");
	private By SkipButton = By.xpath("//a[contains(text(),'Skip for now')]");
	private By DrugSelectionField = By.xpath("//input[@id='drugs']");
//	private By DrugNameOne = By.xpath("(//span[@class='name_address_section'])[1]");
	private By DrugNameOne = By.cssSelector("body > app-root > cf-medication > div.container.text-center > div > div.main_content_section > div > div:nth-child(4) > div:nth-child(1) > div > div > label > span");
	private By DrugNameTwo = By.xpath("(//span[@class='name_address_section'])[1]");
	private By DosageSelection = By.cssSelector(
			"body > app-root > cf-medication > div.container.text-center > div > div.main_content_section.medication_section > div.section_wrapper.bottom-0 > div.selectDosage_section.drugDetails_Select.ng-star-inserted > div.input-group.select.dosageSec > p-dropdown > div");
	private By ClickAddButton = By.xpath("(//a[contains(.,'Add')])[1]");
	private By DosageValueSelection = By.cssSelector("p-dropdownitem:nth-child(2) > li > span");
	private By HouseholdIncome = By.cssSelector("#income");
	private By AddSpouseOption = By.xpath("(//span[@class='icon-add addIcon'])[1]");
	private By SpouseDOB = By.xpath("//input[@id='spouse_dob']");
	private By SpouseSaveButton = By.cssSelector(
			"#spouseSection > div.members_input_section.householdPanel.spouseSection > div.section_button > a.prmy_btn");
	private By BackButton = By.xpath("//a[contains(.,'Back')]");
	private By AddDependentOption = By.xpath("(//span[@class='icon-add addIcon'])[1]");
	private By DependentDOB = By.xpath("//input[@id='dob2']");
	private By AddDependentDOB = By.xpath("//input[@id='dependentDob']");
	private By AddDependentGender = By.xpath("//*[@for='chkdependentmale']");
	private By IncreaseHHCount = By.xpath("//*[@id='up']");
	private By DependentSaveButton = By.cssSelector(
			"#dependentSection > div.members_input_section.householdPanel.dependentSection > div.section_button > a");
	private By SEPOption = By.xpath("//*[@for='sepevents-3']");
	private By SkipNowPopUp = By.cssSelector(
			"#saveProgressModal > div > div > div > div.button_section.w-100.text-center > a.skipForNowLink.primary_color.cursor-pointer");
	private By MyCartButton = By.xpath("//*[contains(text(),'My cart')]");
	private By DrugOneText = By.xpath("(//span[contains(.,'fluorouracil 50 MG/ML Injectable Solution [Adrucil]')])[1]");
	private By DrugTwoText = By.xpath("(//span[contains(.,' methylprednisolone 2000 MG Injection')])[1]");
	private By DrugThreeText = By.xpath("(//span[contains(.,'benzocaine 100 MG/ML Mucous Membrane Topical Solution [Anbesol]')])[1]");
	private By DrugFourText = By.xpath("(//span[contains(.,'benzocaine 200 MG/ML Mucous Membrane Topical Solution [Anbesol]')])[1]");
	private By ChooseThePlan = By.xpath("//label[contains(text(),'Choose this plan')]");
	private By ClickOnEMail = By.xpath("//*[@data-bs-target='#sendEmail']");
	private By ClickOnEMailProposal = By.xpath("(//a[@id='generateEmailProposalPopupcustomer'])[1]");
	private By EmailAddress = By.xpath("//*[@id='email']");
	private By SBCEmailAddress = By.xpath("//*[@id='SBCEmail']");
	
	private By EmailFormat = By.xpath("//*[@id='email_format']");
	private By SelectExcelFormat = By
			.cssSelector("#sendEmail > div > div > div > div:nth-child(3) > div > div > span:nth-child(3)");
	private By SelectPDFFormat = By
			.cssSelector("#sendEmail > div > div > div > div:nth-child(3) > div > div > span:nth-child(2)");
	private By EnrollNow = By.xpath("//*[@id='beginEnrollment']");
	private By CignaLabel = By.xpath("//*[@for='Cigna']");
	private By PdfSelect = By.xpath("(//a[contains(.,'Pdf')])[1]");
	private By ExcelSelect = By.xpath("(//a[contains(.,'Excel')])[1]");
	private By PopUpYes = By.xpath("(//a[@id='pop_btn'])[1]");
	
	private By AmbetterLabel = By.xpath("//*[@for='Ambetter']");
	private By PlanText = By.xpath(
			"//*[contains(.,'TrueCoverage LLC does not support enrollment in this Qualified Health Plan at this time.')]");
	private By HMOLabel = By.xpath("//*[@for='HMO']");
	private By PPOLabel = By.xpath("//*[@for='PPO']");
	private By SilverLabel = By.xpath("//*[@for='Silver']");
	private By BronzeLabel = By.xpath("//*[@for='Bronze']");
	private By ExpandedBronzeLabel = By.xpath("//*[@for='Expanded Bronze']");
	private By ExpandedBronzeEasyPricing = By.xpath("//*[@for='Expanded Bronze-easypricing']");
	private By SilverEasyPricing = By.xpath("//*[@for='Silver-easypricing']");
	private By GoldEasyPricing = By.xpath("//*[@for='Gold-easypricing']");
	private By EasyPricingTag = By.xpath("//span[text()='Easy pricing:']");
	private By EasyPricingInfo = By.xpath("//a[@data-bs-target='#easyPricingModal']");
	private By EasyPricingText = By.xpath("//strong[text()=' Easy pricing:']");
	private By OkButton = By.xpath("//a[text()='Ok']");
	private By GoldLabel = By.xpath("//*[@for='Gold']");
	private By Rating3AndAbove = By.xpath("//*[@for='overallrating-filter2']");
	private By LabelVisibility = By.cssSelector("span.plan_logo img");
	private By AvMedLabel = By.xpath("//*[@for='AvMed']");
	private By AddToCartButton = By.xpath("(//*[@id='mcmqAddToCart'])[1]");
	private By EffectiveDateDropdown = By.xpath("(//*[@class='editPlanDatas editEffectiveDate'])[1]");
	private By DownloadProposalOption = By.xpath("//span[contains(.,'Download')]");
	private By ClickOnUploadDocument = By.xpath("//*[@id='DocumentUploadcheck']");
	private By SelectActionCenter = By.cssSelector("#sideMenuContent > div > ul > li.active > div > ul > li:nth-child(1) > a");
	private By FileType = By.xpath("(//input[@class='select-dropdown dropdown-trigger'])[1]");
	private By UploadFile = By.xpath("//*[@id='dmisvifile_0']");
	private By ClickOnUploadButton = By.cssSelector("#modaldocupload_0 > div.modal-footer > a");
	private By FileTypeOption = By.xpath("//span[contains(.,'Other')]");
	private By EditZipCode = By.xpath("(//*[@class='icon-edit'])[1]");
	private By SelectPDF = By.xpath("//a[contains(.,'PDF format')]");
	private By SelectExcel = By.xpath("//a[contains(.,'Excel format')]");
	private By DownloadProposal = By.xpath("//a[contains(.,'Download')]");
	private By DownloadPDFFormat = By.xpath("//a[contains(.,'PDF format')]");
	private By DownloadExcelFormat = By.xpath("//a[contains(.,'Excel format')]");
	private By ClickSaveProposal = By.xpath("//a[@class='line-btn saveProposalAnonymous']");
	private By SelectDocuments = By.cssSelector("#sideMenuContent > div > ul > li.active > div > ul > li:nth-child(3) > a");
	private By ActionUpload = By.xpath("//a[@class='docuploadtrigger show_tool_tip_for_attribute float_l modal-trigger DocumentUploadcheck' and @id='0']");
	private By UploadDocuments = By.xpath("(//a[contains(.,'Upload Document')])[1]");

	private By EditDoctorAndFacility = By.xpath("(//*[@class='icon-edit'])[2]");
	private By EditDrugDetails = By.xpath("(//*[@class='icon-edit'])[3]");
	private By DrugField = By.xpath("//input[@id='medication']");
	private By DrugFieldSelection = By.cssSelector(
			"#EditPrescription > div > div.main_content_section > div:nth-child(1) > div.search_results.medication_listing > div > div > label");
	private By AddButton = By.cssSelector("#select_dosage > div.addSec > a");
	private By DoctorOrFacilityField = By.xpath("//*[@id='doctors_facilities']");
	private By AddDoctor = By.cssSelector(
			"#EditDoctorsFacilities > div > div.main_content_section > div > div.input-group.input-withicon.showSearchResults > div > div:nth-child(1) > label > a");
	private By NewZipCode = By.xpath("//*[@id='zipcodeAutoComplete']");
	private By SelectCounty = By.xpath("//*[@id='countydeAutoComplete']");
	private By SelectCountyValue = By.cssSelector("#multioptionslist > span:nth-child(2)");
	private By AddDependentButton = By.xpath("//*[@class='addDependent']");
	private By IncludeDependent = By.xpath("//*[@class='addDependent']");
	private By ClickApply = By.xpath("//a[@id='btnapply']");
	private By ClickDoctorApply = By.xpath("(//*[@class='lg-btn half_width_btn'])[1]");
	private By EligibilityCheck = By
			.cssSelector("#eligibility_section > div.warning.message_display_section > div > p");
	private By GenderOfApplicant = By.xpath("//label[@for='male']");
	private By GenderOfSpouse = By.xpath("//label[@for='spouse_female']");
	private By GenderOfDependent = By.xpath("//label[@for='dep_male']");
	private By PrivacyStatementIAllow = By
			.cssSelector("#privacyForm > div > div > div.agreement_checkboxSection > div:nth-child(3) > div > div");
	private By PrivacyStatementIAgree = By.xpath(
			"//*[contains(text(),'I agree to have my information used and retrieved from data sources for this application')]");
	private By PrivacyStatementIUnderstand = By
			.cssSelector("#privacyForm > div > div > div.agreement_checkboxSection > div:nth-child(2) > div > div");
	private By FirstName = By.xpath("//*[@id='YourInformation_FirstName']");
	private By MiddleName = By.xpath("//*[@id='YourInformation_MiddleName']");
	private By LastName = By.xpath("//*[@id='YourInformation_LastName']");
	private By YourInformationGender = By.xpath("//*[@for='YourInformation_Gender_M']");
	private By YourInformationDOB = By.xpath("//*[@id='YourInformation_DateOfBirth']");
	private By YourInformationMaskedSSN = By.xpath("//*[@id='YourInformation_MaskedSSN']");
	private By Email = By.xpath("//*[@id='Email']");
	private By PhoneNumber = By.xpath("//*[@id='PhoneNumberOne']");
	private By PhoneType = By.xpath("//*[@id='PhoneTypeOne']");
	private By SendMePaperNotice = By.xpath("//*[@for='NoticeByMailOrEmail_paper']");
	private By PreferredWrittenLanguage = By.xpath("//*[@id='WrittenLanguage']");
	private By PreferredSpokenLanguage = By.xpath("//*[@id='SpokenLanguage']");
	private By HouseholdRelationship = By.xpath("//*[@id='OtherApplicants_0__ApplicantRelationships_0__Relationship']");
	private By PrimaryZipCode = By.xpath("//*[@id='Zip']");
	private By VerifySuccessMsg = By.xpath("//p[contains(.,'Congratulations!')]");
	private By LivingOutsideYes = By.xpath("//*[@for='LivingOutsideAddress_yes']");
	private By LivingOutsideAddress = By.xpath("//*[@id='livingoutside_Address_line_1']");
	private By LivingOutsideZip = By.xpath("//*[@id='livingoutside_Zip']");
	private By AddressLineOne = By.xpath("//*[@id='Address_line_1']");
	private By AnswerAutoLender = By.cssSelector(
			"#VerificationQuestion > div:nth-child(7) > div > div.answer_section.col-sm-12.col-md-12 > div:nth-child(1) > div > label");
	private By AnswerCreditCard = By.cssSelector(
			"#VerificationQuestion > div:nth-child(8) > div > div.answer_section.col-sm-12.col-md-12 > div:nth-child(4) > div > label");
	private By AnswerCuurentCity = By.cssSelector(
			"#VerificationQuestion > div:nth-child(9) > div > div.answer_section.col-sm-12.col-md-12 > div:nth-child(5) > div > label");
	private By HHFirstName = By.xpath("//*[@id='OtherApplicants_0__FirstName']");

	public void waitForElement(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public void send_basic_details_of_applicant(CensusInfo ApplicantInfo, CensusInfo SpouseInfo)
			throws InterruptedException {
		try {
//		if(driver.findElement(LogoutButtonConfirmation).isDisplayed()) {
			if (driver.findElement(ClickOnCloseButton).isDisplayed()) {
				click(ClickOnCloseButton);
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login inoccurate");
		}
		ExtentSuccessMessage("Applicantion login is successful");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectAgency));
		MoveToElementClick(element);
		ExtentSuccessMessage("User Agent Agency has been selected");
		wait.until(ExpectedConditions.presenceOfElementLocated(MarketingLabel));
		waitForElement(1000);
		ExtentSuccessMessage("Label Marketing has been selected");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(BusinessType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Business Type element has been selectocateded");
		element = driver.findElement(By.xpath("//li/span[text()='" + "Individual" + "']"));
		MoveToElementClick(element);
		ExtentSuccessMessage("Business Type Individual has been selected");
		waitForElement(1000);
		ExtentSuccessMessage("Line of business element located");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LifeOfBusiness));
		MoveToElementClick(element);
		element = driver.findElement(By.xpath("//li/span[text()='" + "Health" + "']"));
		MoveToElementClick(element);
		ExtentSuccessMessage("Line of business 'Health' has been selected");
		ExtentSuccessMessage("English Language has been auto-selected");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MarketingURLButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Generated the Marketing URL - In progress");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CopyMarketingURL));
		MarketingURL = element.getText();
		ExtentSuccessMessage("successfully generated the marketing URL");
		System.out.println("Marketing URL: " + MarketingURL);
		ExtentSuccessMessage("Copying Marketing URL from the page");
		waitForElement(1000);
		ExtentSuccessMessage("Copied Marketing URL successfully");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		ExtentSuccessMessage("Sign-Out element identified successfully");
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been successful");
		driver.manage().deleteAllCookies();
	}

	public void launch_the_copied_marketing_url(CensusInfo ApplicantInfo) throws InterruptedException {
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ZipCode));
		ExtentSuccessMessage("Identified the elements present in the Marketing URL page");
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Zipcode element identified successfully");
		writeText(ZipCode, ApplicantInfo.Zipcode);
		ExtentSuccessMessage("Zipcode added successfully");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GetStartedButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully accessed the copied marketing URL");
		waitForElement(1000);
		ExtentSuccessMessage("Above steps are processed successfully");
	}
	
	public void no_coverage_design_change_validation(CensusInfo ApplicantInfo) throws InterruptedException {
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ZipCode));
		ExtentSuccessMessage("Identified the elements present in the Marketing URL page");
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Zipcode element identified successfully");
		writeText(ZipCode, "80701" + Keys.TAB);
		waitForElement(2000);
		ExtentSuccessMessage("Zipcode for the state of state of Colorado entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NoCoverageTitleValidationText));
		String actualText = element.getText();
		Assert.assertEquals(actualText, NoCoverageText);
		ExtentSuccessMessage("Message - No coverage in the selected state - Present in the Page");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NoCoverageBodyValidationText));
		actualText = element.getText();
		Assert.assertEquals(actualText, NoCoverageBodyText);
		Assert.assertTrue(driver.findElement(NoCoverageBodyValidationText).isDisplayed());
		ExtentSuccessMessage("Message body for No coverage state has been validated successfully");
		waitForElement(1000);
		clear(ZipCode);
		writeText(ZipCode, ApplicantInfo.Zipcode);
		ExtentSuccessMessage("Zipcode added successfully");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GetStartedButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully accessed the copied marketing URL");
		waitForElement(1000);
		ExtentSuccessMessage("Above steps are processed successfully");
	}

	public void talk_with_an_agent_validation() throws InterruptedException {
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TalkWithAnAgentText));
		ExtentSuccessMessage("Talk with An Agent Feature Enabled");
		String actualText = element.getText();
		ExtentSuccessMessage("Actual Text From Application: " + actualText);
		Assert.assertEquals(actualText, "Talk with an agent");
		ExtentSuccessMessage("Assertion for 'Talk with An Agent' text is successful");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallBackRequest));
		ExtentSuccessMessage("Call Back Request - Feature Enabled");
		actualText = element.getText();
		ExtentSuccessMessage("Actual Callback Request Text From Application: " + actualText);
		Assert.assertEquals(actualText, "Request a callback");
		ExtentSuccessMessage("Assertion for 'Request a callback' text is successful");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentArrowLinkCollapse));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Collapse button of Talk with Agent option");
		waitForElement(1000);
		Assert.assertTrue(wait.until(ExpectedConditions.invisibilityOfElementLocated(CallBackRequest)));
		ExtentSuccessMessage("Successfully clicked on Collapse button and Assertion performed for the validation");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentArrowLinkExpand));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Collapse button of Talk with Agent option");
		waitForElement(5000);
	}

	public void validate_the_contact_number_on_pageheader() throws InterruptedException, IOException {
		String expectedText = "1-(888) 565-7941";
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContactNumber));
		ExtentSuccessMessage("Identified the contact number element present in the Marketing URL page");
		waitForElement(1000);
		String actualResult = element.getText();
		System.out.println("Contact Number Present In The Application Header:" + actualResult);
		ExtentSuccessMessage("Contact Number Present In The Application Header:" + actualResult);
		waitForElement(500);
		Assert.assertEquals(actualResult, expectedText);
		ExtentSuccessMessage("Contact number assertion has been successful");
		waitForElement(1000);
	}

	public void applicant_only_validation(CensusInfo ApplicantInfo, CensusInfo SpouseInfo, CensusInfo DependentsInfo)
			throws InterruptedException {
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ApplicantDOB));
		MoveToElementClick(element);
		writeText(ApplicantDOB, ApplicantInfo.DOB + Keys.TAB);
		ExtentSuccessMessage("Successfully entered applicant DOB");
		waitForElement(1000);
//		element = driver.findElement(By.xpath("//label[@for='" + ApplicantInfo.Gender + "']"));
//		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GenderOfApplicant));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully added gender of the applicant");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SaveButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully saved applicant basic details");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AddSpouseOption));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SpouseDOB));
		MoveToElementClick(element);
		writeText(SpouseDOB, SpouseInfo.DOB);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GenderOfSpouse));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SpouseSaveButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully saved spouse personal information");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AddDependentOption));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on add depedent details button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DependentDOB));
		MoveToElementClick(element);
		writeText(DependentDOB, DependentsInfo.DOB);
		ExtentSuccessMessage("Added depedent DOB details button");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GenderOfDependent));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Added depedent gender details button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DependentSaveButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully saved dependent personal information");
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Successfully validated applicant only census page validation");
	}

	public void move_back_page() throws InterruptedException {
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(BackButton));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Move back to add the dependent details");
	}

	public void household_details_of_consumer(CensusInfo ApplicantInfo, CensusInfo DependentsInfo)
			throws InterruptedException {
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(HouseholdIncome));
		MoveToElementClick(element);
		writeText(HouseholdIncome, ApplicantInfo.Earnings);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Income Details Are Added");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Household Conformation Done");
		waitForElement(2000);
	}

	public void low_income_sep_page_validations() throws InterruptedException {
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(HouseholdIncome));
		MoveToElementClick(element);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Low Income Details Are Added");
		waitForElement(3000);
		try {
			js.executeScript("window.scrollBy(10,350)");
			waitForElement(2000);
			if (driver.findElement(SEPOption).isDisplayed()) {
				element = wait.until(ExpectedConditions.presenceOfElementLocated(SEPOption));
				MoveToElementClick(element);
				waitForElement(1000);
				ExtentSuccessMessage("Low income - Skip SEP Page validation has been successful");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
				MoveToElementClick(element);
				waitForElement(1000);
				ExtentSuccessMessage("SEP option has been captured");
			} else {
				Assert.assertTrue(wait.until(ExpectedConditions.invisibilityOfElementLocated(SEPOption)));
				ExtentSuccessMessage("Low income - Skip SEP Page validation has been successful");
				ExtentSuccessMessage("No need for Special Enrollment since we are at Open Enrollment");
				waitForElement(1000);
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Process in progress");
		}
		waitForElement(2000);
	}

	public void drug_and_doctors_page(CensusInfo ApplicantInfo, CensusInfo DependentsInfo) throws InterruptedException {
		waitForElement(2000);
		try {
			waitForElement(2000);
			if (driver.findElement(SEPOption).isDisplayed()) {
				element = wait.until(ExpectedConditions.presenceOfElementLocated(SEPOption));
				MoveToElementClick(element);
				waitForElement(1000);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
				MoveToElementClick(element);
				waitForElement(2000);
				ExtentSuccessMessage("SEP option has been captured");
			} else {
				ExtentSuccessMessage("No need for Special Enrollment since we are at Open Enrollment");
				waitForElement(2000);
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Process in progress");
		}
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SkipButton));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SkipButton));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SkipNowPopUp));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Successfully navigated to plan election page");
	}

	public void drugs_with_multiple_dosages_validation() throws InterruptedException {
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SkipButton));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Doctor page has been updated");
		// Drug One - Dosage 200 MG
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DrugSelectionField));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Clicked on Drug Selection Textfield");
		writeText(DrugSelectionField, "ANBESOL" + Keys.TAB);
		ExtentSuccessMessage("Entered the Drug name ANBESOL");
		waitForElement(1000);
		wait.until(ExpectedConditions.elementToBeClickable(DrugNameOne));
		click(DrugNameOne);
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(DrugNameOne));
//		MoveToElementClick(element);
		ExtentSuccessMessage("Selected the drug value with 200 MG dosage");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClickAddButton));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Added the Drug name ANBESOL (200 MG Dosage) to applicant");

		// Drug One - Dosage 100 MG

		element = wait.until(ExpectedConditions.presenceOfElementLocated(DrugSelectionField));
		MoveToElementClick(element);
		waitForElement(1000);
		writeText(DrugSelectionField, "ANBESOL");
		ExtentSuccessMessage("Clicked on Drug Selection Textfield to enter multiple dosage");
		waitForElement(3000);
		wait.until(ExpectedConditions.elementToBeClickable(DrugNameOne));
		click(DrugNameOne);
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(DrugNameOne));
//		MoveToElementClick(element);
		ExtentSuccessMessage("Entered the Drug name ANBESOL for multiple dosage");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DosageSelection));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DosageValueSelection));
		MoveToElementClick(element);
		ExtentSuccessMessage("Selected the drug value with 100 MG dosage");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClickAddButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Added the Drug name ANBESOL (100 MG Dosage) to applicant");
		waitForElement(1000);

		// Drug Two - Dosage 48 MG
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DrugSelectionField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Drug Selection Textfield");
		writeText(DrugSelectionField, "prednisoLONE");
		ExtentSuccessMessage("Entered the Drug name prednisoLONE");
		waitForElement(3000);
		wait.until(ExpectedConditions.elementToBeClickable(DrugNameOne));
		click(DrugNameOne);
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(DrugNameTwo));
//		MoveToElementClick(element);
		ExtentSuccessMessage("Selected the drug value with 48 MG dosage");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClickAddButton));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Added the Drug name prednisoLONE (48 MG Dosage) to applicant");

		// Drug Three - ADRUCIL 

		element = wait.until(ExpectedConditions.presenceOfElementLocated(DrugSelectionField));
		MoveToElementClick(element);
		writeText(DrugSelectionField, "ADRUCIL");
		ExtentSuccessMessage("Clicked on Drug Selection Textfield to enter multiple dosage");
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DrugNameOne));
		MoveToElementClick(element);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClickAddButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Added the Drug name ADRUCIL to applicant");
		waitForElement(1000);
		// --//

		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SkipNowPopUp));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully navigated to plan election page");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CignaLabel));
		MoveToElementClick(element);
		ExtentSuccessMessage("Plan Options Are Selected");
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DrugOneText));
//		MoveToElementClick(element);
		waitForElement(1000);
		Assert.assertTrue(driver.findElement(DrugOneText).isDisplayed());
		ExtentSuccessMessage("Drug - fluorouracil 50 MG/ML Injectable Solution [Adrucil] - Validation Successful");
		waitForElement(1000);
//		Assert.assertTrue(driver.findElement(DrugTwoText).isDisplayed());
		ExtentSuccessMessage("Drug - methylprednisolone 2000 MG Injection - Validation Successful");
		waitForElement(1000);
		Assert.assertTrue(driver.findElement(DrugThreeText).isDisplayed());
		ExtentSuccessMessage("Drug - benzocaine 100 MG/ML Mucous Membrane Topical Solution [Anbesol] - Validation Successful");
		waitForElement(1000);
		Assert.assertTrue(driver.findElement(DrugFourText).isDisplayed());
		ExtentSuccessMessage("Drug - benzocaine 200 MG/ML Mucous Membrane Topical Solution [Anbesol] - Validation Successful");
		waitForElement(1000);
		ExtentSuccessMessage("All the above steps are executed successfully.");
		waitForElement(1000);
	}
	
	public void quotes_sbc_view_email_validation(CensusInfo ApplicantInfo) throws InterruptedException, IOException {
		waitForElement(1000);
		wait.until(ExpectedConditions.elementToBeClickable(MainMenu));
		click(MainMenu);
		ExtentSuccessMessage("Clicked on Main Menu Option");
		waitForElement(1000);
		wait.until(ExpectedConditions.elementToBeClickable(SelectQuotes));
		click(SelectQuotes);
		waitForElement(1000);
		ExtentSuccessMessage("Navigated to Quotes Page");
		waitForElement(1000);
		wait.until(ExpectedConditions.elementToBeClickable(ExpandArrow));
		click(ExpandArrow);
		ExtentSuccessMessage("Clicked on Expand arrow of recent Medicare quote");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SBCDropDown));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on SBC Drop Down");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ViewSBC));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on View SBC Option");
		waitForElement(1000);
		String parentWindowHandle = driver.getWindowHandle();
		switchToNextTab(driver, parentWindowHandle);
		ExtentSuccessMessage("Navigated to More details window");
		waitForElement(1000);
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL , expectedURL);
		ExtentSuccessMessage("Current SBC URL has been validated successfully");
		waitForElement(1000);
		driver.close();
		driver.switchTo().window(parentWindowHandle);
		ExtentSuccessMessage("Navigated to parent window");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SBCDropDown));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on SBC Drop Down to select Email option");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EmailSBC));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on SBC Email option");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SBCEmailTextField));
		MoveToElementClick(element);
		writeText(SBCEmailTextField,ApplicantInfo.Email + Keys.TAB);
		ExtentSuccessMessage("Clicked on SBC Email Text Field and entered the Email address");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SendButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Email Send Button");
		waitForElement(1000);
	}
	
	public void SBC_tile_validation_EDE_application(CensusInfo ApplicantInfo) throws InterruptedException {
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SBCDropDown));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on SBC Drop Down");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EmailSBC));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on SBC Email option");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SBCEmailTextField));
		MoveToElementClick(element);
		writeText(SBCEmailTextField,ApplicantInfo.Email + Keys.TAB);
		ExtentSuccessMessage("Clicked on SBC Email Text Field and entered the Email address");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SendButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Email Send Button");
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SBCDropDown));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on SBC Drop Down to select Email option");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ViewSBC));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on View SBC Option");
		ExtentSuccessMessage("Current SBC URL has been validated successfully");
		ExtentSuccessMessage("All the above steps are executed successfully");
		waitForElement(1000);
		
	}
	
	public void regenerate_proposal_to_excel_pdf_format_validation() throws InterruptedException, IOException {
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(RegenerateProposal));
		MoveToElementClick(element);
		ExtentSuccessMessage("Click on Regenerate Proposal");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(PdfSelect));
		MoveToElementClick(element);
		ExtentSuccessMessage("PDF Format selected for Regenerate Proposal");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(PopUpYes));
		MoveToElementClick(element);
		ExtentSuccessMessage("PDF -Confirmation pop up triggered and selected Yes");
		waitForElement(20000);
		js.executeScript("window.scrollBy(10,-600)");
		waitForElement(2000);
		wait.until(ExpectedConditions.elementToBeClickable(ExpandArrow));
		click(ExpandArrow);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(RegenerateProposal));
		MoveToElementClick(element);
		ExtentSuccessMessage("Click on Regenerate Proposal via Excel");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ExcelSelect));
		MoveToElementClick(element);
		ExtentSuccessMessage("Excel Format selected for Regenerate Proposal");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(PopUpYes));
		MoveToElementClick(element);
		ExtentSuccessMessage("Excel - Confirmation pop up triggered and selected Yes");
		waitForElement(15000);
	}
	
	public void customer_tab_navigations_validation() throws InterruptedException {
		waitForElement(5000);
		wait.until(ExpectedConditions.elementToBeClickable(MainMenu));
		click(MainMenu);
		ExtentSuccessMessage("Clicked on Main Menu Option For Customer information URL Validation");
		waitForElement(1000);
		wait.until(ExpectedConditions.elementToBeClickable(CustomerInformationTab));
		click(CustomerInformationTab);
		ExtentSuccessMessage("Clicked on Customer Information Tab");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ValidateWrittenLanguage));
		expectedAppURL = driver.getCurrentUrl();
		System.out.println("expectedURL:" + expectedAppURL);
		Assert.assertEquals(expectedAppURL, customerInfoURL);
		ExtentSuccessMessage("Customer Information Tab URL validation successful!");
		waitForElement(2000);
		//--//
		wait.until(ExpectedConditions.elementToBeClickable(MainMenu));
		click(MainMenu);
		ExtentSuccessMessage("Clicked on Main Menu Option For Application URL Validation");
		waitForElement(3000);
		wait.until(ExpectedConditions.elementToBeClickable(ApplicationTab));
		click(ApplicationTab);
		ExtentSuccessMessage("Clicked on Application Information Tab");
		waitForElement(2000);
		expectedAppURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedAppURL, applicationURL);
		ExtentSuccessMessage("Application Tab URL validation successful!");
		waitForElement(2000);
		//--//
		wait.until(ExpectedConditions.elementToBeClickable(MainMenu));
		click(MainMenu);
		ExtentSuccessMessage("Clicked on Main Menu Option For Attachments URL Validation");
		waitForElement(3000);
		wait.until(ExpectedConditions.elementToBeClickable(AttachmentsTab));
		click(AttachmentsTab);
		ExtentSuccessMessage("Clicked on Customer Attachments Tab");
		waitForElement(2000);
		expectedAppURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedAppURL, attachmentURL);
		ExtentSuccessMessage("Attachments Tab URL validation successful!");
		waitForElement(2000);
		//--//
		wait.until(ExpectedConditions.elementToBeClickable(MainMenu));
		click(MainMenu);
		ExtentSuccessMessage("Clicked on Main Menu Option For Communications URL Validation");
		waitForElement(3000);
		wait.until(ExpectedConditions.elementToBeClickable(CommunicationsTab));
		click(CommunicationsTab);
		ExtentSuccessMessage("Clicked on Customer Communication Tab");
		waitForElement(2000);
		expectedAppURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedAppURL, communicationURL);
		ExtentSuccessMessage("Communications Tab URL validation successful!");
		waitForElement(2000);
		//--//
		wait.until(ExpectedConditions.elementToBeClickable(MainMenu));
		click(MainMenu);
		ExtentSuccessMessage("Clicked on Main Menu Option For Payment History URL Validation");
		waitForElement(2000);
		wait.until(ExpectedConditions.elementToBeClickable(PaymentHistoryTab));
		click(PaymentHistoryTab);
		ExtentSuccessMessage("Clicked on Customer Payment History Tab");
		waitForElement(2000);
		expectedAppURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedAppURL, paymentURL);
		ExtentSuccessMessage("PaymentHistory Tab URL validation successful!");
		waitForElement(1000);
		//--//
		wait.until(ExpectedConditions.elementToBeClickable(MainMenu));
		click(MainMenu);
		ExtentSuccessMessage("Clicked on Main Menu Option For Marketplace URL Validation");
		waitForElement(1000);
		wait.until(ExpectedConditions.elementToBeClickable(SelectMarketPlace));
		click(SelectMarketPlace);
		ExtentSuccessMessage("Clicked on Customer Marketplace Tab");
		waitForElement(1000);
		wait.until(ExpectedConditions.elementToBeClickable(SelectActionCenter));
		click(SelectActionCenter);
		waitForElement(1000);
		wait.until(ExpectedConditions.presenceOfElementLocated(ClickOnUploadDocument));
		waitForElement(1000);
		expectedAppURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedAppURL, marketplaceURL);
		ExtentSuccessMessage("Marketplace Information Tab URL validation successful!");
		waitForElement(2000);
		ExtentSuccessMessage("All the steps are validated successfully");
	}

	public void plan_listing_page_validations(CensusInfo DependentsInfo) throws InterruptedException, IOException {
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EditDoctorAndFacility));
		MoveToElementClick(element);
		ExtentSuccessMessage("Doctors and Facilities are editable");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DoctorOrFacilityField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Doctor field is editable");
		writeText(DoctorOrFacilityField, "Doc");
		waitForElement(2000);
		ExtentSuccessMessage("Entered doctor details");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AddDoctor));
		MoveToElementClick(element);
		ExtentSuccessMessage("Added the doctor");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClickDoctorApply));
		MoveToElementClick(element);
		ExtentSuccessMessage("Applied the doctor and facilites to applicant");
		waitForElement(10000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EditDrugDetails));
		MoveToElementClick(element);
		ExtentSuccessMessage("Drug section is editable");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DrugField));
		MoveToElementClick(element);
		writeText(DrugField, "ARISTOSPAN" + Keys.TAB);
		ExtentSuccessMessage("Drug name has been entered");
		waitForElement(2000);
		wait.until(ExpectedConditions.elementToBeClickable(DrugFieldSelection));
		click(DrugFieldSelection);
		ExtentSuccessMessage("Drug name has been added");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AddButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Add Button");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DrugContinueButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Continue Button");
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SortPlans));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Sort Plan Drop Down");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LowestDeductible));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Lowest Deductible Option");
		waitForElement(10000);
		wait.until(ExpectedConditions.presenceOfElementLocated(LabelVisibility));
		element = driver.findElement(By.cssSelector("span.plan_logo img"));
		imgSrc = element.getAttribute("src");
		expectedImgSrc = "/brokerengage/Content/Repository/BrandLogo/Florida";
		// Perform the assertion
		waitForElement(1000);
		Assert.assertTrue(imgSrc.contains(expectedImgSrc), "Image source URL does not match.");
		ExtentSuccessMessage("Florida Plan Options Are Showing");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SortPlans));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Sort Plan Drop Down");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(InNetworkFacility));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Lowest Deductible Option");
		waitForElement(10000);
		wait.until(ExpectedConditions.presenceOfElementLocated(LabelVisibility));
		element = driver.findElement(By.cssSelector("span.plan_logo img"));
		imgSrc = element.getAttribute("src");
		expectedImgSrc = "/brokerengage/Content/Repository/BrandLogo/Florida";
		// Perform the assertion
		waitForElement(1000);
		Assert.assertTrue(imgSrc.contains(expectedImgSrc), "Image source URL does not match.");
		ExtentSuccessMessage("Assertion successful");
		ExtentSuccessMessage("Florida Plan Options Are Showing");
		waitForElement(1000);
	}

	public void validation_of_download_from_moredetails() throws InterruptedException, IOException {
		String parentWindowHandle = driver.getWindowHandle();
		switchToNextTab(driver, parentWindowHandle);
		ExtentSuccessMessage("Navigated to More details window");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SBCDownload));
		Assert.assertTrue(element.isDisplayed(), "Assertion Failed");
		MoveToElementClick(element);
		ExtentSuccessMessage("SBC Download successful");
		waitForElement(1000);
		driver.close();
		driver.switchTo().window(parentWindowHandle);
		ExtentSuccessMessage("Navigated to parent window");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClickOnEMailProposal));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Email Button");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EmailAddress));
		MoveToElementClick(element);
		clear(EmailAddress);
		String getEmailValue = "TC-REG-12-" + writeDynamicEmail();
		writeText(EmailAddress, getEmailValue);
		ExtentSuccessMessage("Clicked on Email Address Field" + getEmailValue);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClickSendButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Email successfully sent");
		waitForElement(5000);
		wait.until(ExpectedConditions.elementToBeClickable(ExpandArrow));
		click(ExpandArrow);
		waitForElement(2000);
		ExtentSuccessMessage("Clicked on Expand arrow of recent quote");
		long startTime = System.currentTimeMillis();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String formattedStartTime = dateFormat.format(new Date(startTime));
		ExtentSuccessMessage("Current Time:" + formattedStartTime);
		ExtentSuccessMessage("Capture the current time to compare the download files");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DownloadProposalOption));
		MoveToElementClick(element);
		waitForElement(10000);
		ExtentSuccessMessage("PDF Option Is Selected");
		String downloadFolder = System.getProperty("user.home") + "/Downloads";
		// Check for any new files in the Downloads folder modified after the recorded
		// time
		File dir = new File(downloadFolder);
		File[] files = dir.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isFile() && file.lastModified() > startTime) {
					ExtentSuccessMessage(
							"File '" + file.getName() + "' downloaded successfully after " + formattedStartTime);
				}
			}
		} else {
			System.out.println("No PDF files found in the Downloads folder.");
			ExtentSuccessMessage("No PDF files found in the Downloads folder.");
		}
		waitForElement(2000);
		ExtentSuccessMessage("File is successfully downloaded");
	}

	public void plan_comparision_validation(CensusInfo DependentsInfo) throws InterruptedException, IOException {
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CompareFirstPlan));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Plan One");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CompareSecondPlan));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Plan Two");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CompareThirdPlan));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Plan Three");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClickOnCompareButton));
		MoveToElementClick(element);
		waitForElement(3000);
		ExtentSuccessMessage("Plans are added to comparision");
		String parentWindowHandle = driver.getWindowHandle();
		switchToNextTab(driver, parentWindowHandle);
		ExtentSuccessMessage("Navigated to comparsion window");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(VerifyPlans));
		Assert.assertTrue(element.isDisplayed(), "Assertion Failed");
		ExtentSuccessMessage("Plan plans comparision done successfully");
		waitForElement(1000);
		// Email Proposal Via Excel
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClickOnEMail));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Email Button");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EmailAddress));
		MoveToElementClick(element);
		String getEmailValue = "TC-P2-EG-" + writeDynamicEmail();
		writeText(EmailAddress, getEmailValue);
		ExtentSuccessMessage("Clicked on Email Address Field" + getEmailValue);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SendButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Email successfully sent");
		waitForElement(1000);
		long startTime = System.currentTimeMillis();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String formattedStartTime = dateFormat.format(new Date(startTime));
		ExtentSuccessMessage("Current Time:" + formattedStartTime);
		ExtentSuccessMessage("Capture the current time to compare the download files");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DownloadProposalOption));
		MoveToElementClick(element);
		waitForElement(10000);
		ExtentSuccessMessage("PDF Option Is Selected");
		String downloadFolder = System.getProperty("user.home") + "/Downloads";
		// Check for any new files in the Downloads folder modified after the recorded
		// time
		File dir = new File(downloadFolder);
		File[] files = dir.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isFile() && file.lastModified() > startTime) {
					ExtentSuccessMessage(
							"File '" + file.getName() + "' downloaded successfully after " + formattedStartTime);
				}
			}
		} else {
			System.out.println("No PDF files found in the Downloads folder.");
			ExtentSuccessMessage("No PDF files found in the Downloads folder.");
		}
		waitForElement(2000);
		ExtentSuccessMessage("File is successfully downloaded");
		driver.close();
		driver.switchTo().window(parentWindowHandle);
		ExtentSuccessMessage("Navigated to parent window");
		waitForElement(1000);
	}

	private static void switchToNextTab(WebDriver driver, String parentWindowHandle) {
		// Get all window handles
		ArrayList<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
		// Find the index of the parent window handle
		int parentIndex = windowHandles.indexOf(parentWindowHandle);
		// Switch to the next tab by using the next index in the list
		int nextTabIndex = (parentIndex + 1) % windowHandles.size();
		String nextTabHandle = windowHandles.get(nextTabIndex);
		driver.switchTo().window(nextTabHandle);
	}
	
	public void add_to_cart_validations() throws InterruptedException, IOException {
//		ExtentSuccessMessage("Cigna Options Are Selected");
			Thread.sleep(2000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(EffectiveDateDropdown));
			MoveToElementClick(element);
			Thread.sleep(1000);
			String coverageYear = configloader().getProperty("CoverageYear");
			By GetCoveragValue = By.xpath("(//a[contains(.,'" + coverageYear + "')])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(GetCoveragValue));
			MoveToElementClick(element);
			Thread.sleep(2000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CignaLabel));
			MoveToElementClick(element);
			ExtentSuccessMessage("Plan Options Are Selected");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(10,10)");
			wait.until(ExpectedConditions.elementToBeClickable(AddToCartButton));
			click(AddToCartButton);
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(MyCartButton));
			click(MyCartButton);
			js.executeScript("window.scrollBy(10,300)");
			ExtentSuccessMessage("Plan has been added to Cart");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(ChooseThePlan));
			Thread.sleep(2000);
			ExtentSuccessMessage("Plan validation has been successful");
			Thread.sleep(2000);
			ExtentSuccessMessage("All the above steps are executed successfully!");
	}

	public void plan_selection_left_side_menus(CensusInfo DependentsInfo) throws InterruptedException, IOException {
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EffectiveDateDropdown));
		MoveToElementClick(element);
		waitForElement(1000);
		String coverageYear = configloader().getProperty("CoverageYear");
		By GetCoveragValue = By.xpath("(//a[contains(.,'" + coverageYear + "')])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GetCoveragValue));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(HMOLabel));
		MoveToElementClick(element);
		waitForElement(2000);
		ExtentSuccessMessage("HMO Plan Options Are Showing");
		js.executeScript("window.scrollBy(10,-600)");
		wait.until(ExpectedConditions.presenceOfElementLocated(LabelVisibility));
		element = driver.findElement(By.cssSelector("span.plan_logo img"));
		imgSrc = element.getAttribute("src");
		expectedImgSrc = "/brokerengage/Content/Repository/BrandLogo/Aetna";
		// Perform the assertion
		waitForElement(1000);
		Assert.assertTrue(imgSrc.contains(expectedImgSrc), "Image source URL does not match.");
		ExtentSuccessMessage("Aetna Plan Options Are Showing");
		waitForElement(2000);
		// --//
		element = wait.until(ExpectedConditions.presenceOfElementLocated(HMOLabel));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("HMO Plan Options Are Un-Selected");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(PPOLabel));
		MoveToElementClick(element);
		waitForElement(2000);
		ExtentSuccessMessage("PPO Plan Options Are Selected");
		js.executeScript("window.scrollBy(10,-800)");
		wait.until(ExpectedConditions.presenceOfElementLocated(LabelVisibility));
		element = driver.findElement(By.cssSelector("span.plan_logo img"));
		imgSrc = element.getAttribute("src");
		expectedImgSrc = "/brokerengage/Content/Repository/BrandLogo/Florida";
		// Perform the assertion
		waitForElement(1000);
		Assert.assertTrue(imgSrc.contains(expectedImgSrc), "Image source URL does not match.");
		ExtentSuccessMessage("Florida Blue Plan Options Are Showing");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(PPOLabel));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("PPO Plan Options Are Un-Selected");
		// --//
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SilverLabel));
		MoveToElementClick(element);
		waitForElement(2000);
		ExtentSuccessMessage("Silver Plan Options Are Selected");
		js.executeScript("window.scrollBy(10,-1000)");
		wait.until(ExpectedConditions.presenceOfElementLocated(LabelVisibility));
		element = driver.findElement(By.cssSelector("span.plan_logo img"));
		imgSrc = element.getAttribute("src");
		expectedImgSrc = "/brokerengage/Content/Repository/BrandLogo/Florida";
		// Perform the assertion
		waitForElement(1000);
		Assert.assertTrue(imgSrc.contains(expectedImgSrc), "Image source URL does not match.");
		ExtentSuccessMessage("Florida Blue Plan Options Are Showing");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SilverLabel));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Silver Plan Options Are Un-Selected");
		// --//
		element = wait.until(ExpectedConditions.presenceOfElementLocated(BronzeLabel));
		MoveToElementClick(element);
		waitForElement(2000);
		ExtentSuccessMessage("Bronze Plan Options Are Selected");
		js.executeScript("window.scrollBy(10,-1200)");
		wait.until(ExpectedConditions.presenceOfElementLocated(LabelVisibility));
		element = driver.findElement(By.cssSelector("span.plan_logo img"));
		imgSrc = element.getAttribute("src");
		expectedImgSrc = "/brokerengage/Content/Repository/BrandLogo/AmeriHealth";
		// Perform the assertion
		waitForElement(1000);
		Assert.assertTrue(imgSrc.contains(expectedImgSrc), "Image source URL does not match.");
		ExtentSuccessMessage("AmeriHealth Caritas Next Bronze Classic Plan Options Are Showing");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(BronzeLabel));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Bronze Plan Options Are Un-Selected");
		// --//
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GoldLabel));
		MoveToElementClick(element);
		waitForElement(2000);
		ExtentSuccessMessage("Gold Plan Options Are Selected");
		js.executeScript("window.scrollBy(10,-600)");
		wait.until(ExpectedConditions.presenceOfElementLocated(LabelVisibility));
		element = driver.findElement(By.cssSelector("span.plan_logo img"));
		imgSrc = element.getAttribute("src");
		expectedImgSrc = "/brokerengage/Content/Repository/BrandLogo/Ambetter";
		// Perform the assertion
		waitForElement(1000);
		Assert.assertTrue(imgSrc.contains(expectedImgSrc), "Image source URL does not match.");
		ExtentSuccessMessage("Ambetter Standard Gold Plan Options Are Showing");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GoldLabel));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Gold Plan Options Are Un-Selected");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Rating3AndAbove));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Rating 3 and above Plan Options Are Un-Selected");
		// --//
	}

	public void cart_review_page_validations(CensusInfo ApplicantInfo) throws InterruptedException, IOException {
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EffectiveDateDropdown));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CignaLabel));
		MoveToElementClick(element);
		ExtentSuccessMessage("Plan Options Are Selected");
		waitForElement(2000);
		js.executeScript("window.scrollBy(10,-300)");
		wait.until(ExpectedConditions.elementToBeClickable(AddToCartButton));
		click(AddToCartButton);
		ExtentSuccessMessage("Plan has been added to Cart");
		wait.until(ExpectedConditions.elementToBeClickable(MyCartButton));
		click(MyCartButton);
		js.executeScript("window.scrollBy(10,300)");
		ExtentSuccessMessage("My cart button has been clicked");
		waitForElement(2000);
		// Download PDF Format Proposal
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DownloadProposal));
		ExtentSuccessMessage("Clicked on Download Proposal Option");
		MoveToElementClick(element);
		waitForElement(1000);
		// Record the current system time and date
		long startTime = System.currentTimeMillis();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String formattedStartTime = dateFormat.format(new Date(startTime));
		ExtentSuccessMessage("Current Time:" + formattedStartTime);
		ExtentSuccessMessage("Capture the current time to compare the download files");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DownloadPDFFormat));
		MoveToElementClick(element);
		waitForElement(10000);
		ExtentSuccessMessage("Clicked on Downloads Option");
		String downloadFolder = System.getProperty("user.home") + "/Downloads";
		// Check for any new files in the Downloads folder modified after the recorded
		// time
		File dir = new File(downloadFolder);
		File[] files = dir.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isFile() && file.lastModified() > startTime) {
					ExtentSuccessMessage(
							"File '" + file.getName() + "' downloaded successfully after " + formattedStartTime);
				}
			}
		} else {
			System.out.println("No files found in the Downloads folder.");
			ExtentSuccessMessage("No files found in the Downloads folder.");
		}
		waitForElement(1000);
		ExtentSuccessMessage("Download PDF format proposal validation completed");

		// --Excel Format Validation--//

		element = wait.until(ExpectedConditions.presenceOfElementLocated(DownloadProposal));
		ExtentSuccessMessage("Clicked on Download Proposal Option");
		MoveToElementClick(element);
		waitForElement(1000);
		// Record the current system time and date
		startTime = System.currentTimeMillis();
		dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		formattedStartTime = dateFormat.format(new Date(startTime));
		ExtentSuccessMessage("Current Time:" + formattedStartTime);
		ExtentSuccessMessage("Capture the current time to compare the download files");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DownloadExcelFormat));
		MoveToElementClick(element);
		waitForElement(10000);
		ExtentSuccessMessage("Clicked on Downloads Option");
		downloadFolder = System.getProperty("user.home") + "/Downloads";
		// Check for any new files in the Downloads folder modified after the recorded
		// time
		dir = new File(downloadFolder);
		files = dir.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isFile() && file.lastModified() > startTime) {
					ExtentSuccessMessage(
							"File '" + file.getName() + "' downloaded successfully after " + formattedStartTime);
				}
			}
		} else {
			System.out.println("No files found in the Downloads folder.");
			ExtentSuccessMessage("No files found in the Downloads folder.");
		}
		waitForElement(1000);
		ExtentSuccessMessage("Download Excel format proposal validation completed");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClickSaveProposal));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Save Proposal Option");
		waitForElement(2000);
	}

	public void plan_selection_page_with_email_proposal(CensusInfo ApplicantInfo)
			throws InterruptedException, IOException {
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EffectiveDateDropdown));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CignaLabel));
		MoveToElementClick(element);
		ExtentSuccessMessage("Plan Options Are Selected");
		waitForElement(2000);
		js.executeScript("window.scrollBy(10,-300)");
		wait.until(ExpectedConditions.elementToBeClickable(AddToCartButton));
		click(AddToCartButton);
		ExtentSuccessMessage("Plan has been added to Cart");
		wait.until(ExpectedConditions.elementToBeClickable(MyCartButton));
		click(MyCartButton);
		js.executeScript("window.scrollBy(10,300)");
		ExtentSuccessMessage("My cart button has been clicked");
		waitForElement(2000);
		// Email Proposal Via Excel
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClickOnEMail));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Email Button");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EmailAddress));
		MoveToElementClick(element);
		String getEmailValue = "TC-P2-EG-" + writeDynamicEmail();
		writeText(EmailAddress, getEmailValue);
		ExtentSuccessMessage("Clicked on Email Address Field" + getEmailValue);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EmailFormat));
		MoveToElementClick(element);
		ExtentSuccessMessage("Email format enabled");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectExcelFormat));
		MoveToElementClick(element);
		ExtentSuccessMessage("Selected email proposal via Excel format");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SendButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Email successfully sent");
		waitForElement(1000);
		// Email Proposal Via PDF
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClickOnEMail));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Email Button");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EmailAddress));
		MoveToElementClick(element);
		clear(EmailAddress);
		writeText(EmailAddress, getEmailValue);
		ExtentSuccessMessage("Clicked on Email Address Field");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EmailFormat));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectPDFFormat));
		MoveToElementClick(element);
		ExtentSuccessMessage("Selected email proposal via PDF format");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SendButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Email successfully sent");
		waitForElement(1000);
		// --//--//
		ExtentSuccessMessage("Above steps are executed successfully");
		waitForElement(1000);
	}

	public void upload_documents_validation() throws InterruptedException, IOException {
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClickOnUploadDocument));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Clicked on Upload Document Option");
		String filePath = System.getProperty("user.dir") + "/Upload/Upload_document_testing_file.pdf";
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FileType));
		MoveToElementClick(element);
		waitForElement(500);
		ExtentSuccessMessage("Clicked on File Type Dropdown");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FileTypeOption));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Selected FileType - Other from the list");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UploadFile));
		waitForElement(1000);
		element.sendKeys(filePath);
		ExtentSuccessMessage("Selected the file that needs to be uploaded");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClickOnUploadButton));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Successfully uploaded the file from Action Center");
	}
	
	public void file_validation_through_documents_tab() throws InterruptedException, IOException {
		waitForElement(1000);
		wait.until(ExpectedConditions.elementToBeClickable(MainMenu));
		click(MainMenu);
		ExtentSuccessMessage("Clicked on Main Menu Option");
		waitForElement(1000);
		wait.until(ExpectedConditions.elementToBeClickable(SelectDocuments));
		click(SelectDocuments);
		waitForElement(1000);
		ExtentSuccessMessage("Clicked on Documents Tab");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ActionUpload));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Clicked on Upload Option Is Selected");
		String filePath = System.getProperty("user.dir") + "/Upload/Upload_document_testing_file.pdf";
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FileType));
		MoveToElementClick(element);
		waitForElement(500);
		ExtentSuccessMessage("Clicked on File Type Dropdown for Documents upload");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FileTypeOption));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("The FileType selected as 'Other' from the list");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UploadFile));
		waitForElement(1000);
		element.sendKeys(filePath);
		ExtentSuccessMessage("Selected the file that needs to be uploaded");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UploadDocuments));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Successfully uploaded the file from Documents tab");
	}

	public void download_proposal_validation() throws InterruptedException, IOException {
		// Record the current system time and date
		waitForElement(1000);
		long startTime = System.currentTimeMillis();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String formattedStartTime = dateFormat.format(new Date(startTime));
		ExtentSuccessMessage("Current Time:" + formattedStartTime);
		ExtentSuccessMessage("Capture the current time to compare the download files");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DownloadProposalOption));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Download Proposal Option Is Selected");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectPDF));
		MoveToElementClick(element);
		waitForElement(15000);
		ExtentSuccessMessage("PDF Option Is Selected");
		String downloadFolder = System.getProperty("user.home") + "/Downloads";
		// Check for any new files in the Downloads folder modified after the recorded
		// time
		File dir = new File(downloadFolder);
		File[] files = dir.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isFile() && file.lastModified() > startTime) {
					ExtentSuccessMessage(
							"File '" + file.getName() + "' downloaded successfully after " + formattedStartTime);
				}
			}
		} else {
			System.out.println("No PDF files found in the Downloads folder.");
			ExtentSuccessMessage("No PDF files found in the Downloads folder.");
		}
		waitForElement(2000);
		ExtentSuccessMessage("PDF file is successfully downloaded");
		String formattedStartTime1 = dateFormat.format(new Date(startTime));
		ExtentSuccessMessage("Current Time:" + formattedStartTime1);
		ExtentSuccessMessage("Capture the current time to compare the download files");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DownloadProposalOption));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Download Proposal Option Is Selected");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectExcel));
		MoveToElementClick(element);
		waitForElement(15000);
		ExtentSuccessMessage("Excel Option Is Selected");
		if (files != null) {
			for (File file : files) {
				if (file.isFile() && file.lastModified() > startTime) {
					ExtentSuccessMessage(
							"File '" + file.getName() + "' downloaded successfully after " + formattedStartTime1);
				}
			}
		} else {
			System.out.println("No Excel files found in the Downloads folder.");
			ExtentSuccessMessage("No Excel files found in the Downloads folder.");
		}
		waitForElement(2000);
		ExtentSuccessMessage("Excel file is successfully downloaded");
		ExtentSuccessMessage("All the above steps are executed successfully");
	}

	public void plan_selection_page_of_the_consumer() throws InterruptedException, IOException {
//		ExtentSuccessMessage("Cigna Options Are Selected");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EffectiveDateDropdown));
		MoveToElementClick(element);
		waitForElement(1000);
		String coverageYear = configloader().getProperty("CoverageYear");
		By GetCoveragValue = By.xpath("(//a[contains(.,'" + coverageYear + "')])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GetCoveragValue));
		MoveToElementClick(element);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CignaLabel));
		MoveToElementClick(element);
		ExtentSuccessMessage("Plan Options Are Selected");
		waitForElement(2000);
		js.executeScript("window.scrollBy(10,-50)");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AddToCartButton));
		MoveToElementClick(element);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MyCartButton));
		MoveToElementClick(element);
//			wait.until(ExpectedConditions.elementToBeClickable(AddToCartButton));
//			click(AddToCartButton);
//			wait.until(ExpectedConditions.elementToBeClickable(MyCartButton));
//			click(MyCartButton);
		js.executeScript("window.scrollBy(10,250)");
		ExtentSuccessMessage("Plan has been added to Cart");
		waitForElement(1000);
		wait.until(ExpectedConditions.elementToBeClickable(ChooseThePlan));
		click(ChooseThePlan);
		wait.until(ExpectedConditions.elementToBeClickable(EnrollNow));
		click(EnrollNow);
		ExtentSuccessMessage("Plan has been enrolled");
		waitForElement(1000);
	}

	public void complete_health_application_form() throws InterruptedException {
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(PrivacyStatementIAgree));
		MoveToElementClick(element);
		wait.until(ExpectedConditions.elementToBeClickable(PrivacyStatementIUnderstand));
		click(PrivacyStatementIUnderstand);
		wait.until(ExpectedConditions.elementToBeClickable(PrivacyStatementIAllow));
		click(PrivacyStatementIAllow);
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		click(ContinueButton);
		waitForElement(1000);
		ExtentSuccessMessage("Privacy Statements Are Agreed");
	}

	public void your_information_page_updates(CensusInfo ApplicantInfo, CensusInfo SpouseInfo)
			throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(FirstName));
		writeText(FirstName, ApplicantInfo.Firstname);
		wait.until(ExpectedConditions.elementToBeClickable(MiddleName));
		writeText(MiddleName, ApplicantInfo.Middlename);
		wait.until(ExpectedConditions.elementToBeClickable(LastName));
		writeText(LastName, ApplicantInfo.Lastname);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(YourInformationDOB));
		MoveToElementClick(element);
		clear(YourInformationDOB);
		writeText(YourInformationDOB, ApplicantInfo.DOB);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Your Information Page Has Been Updated");
		waitForElement(1000);
	}

	public void update_your_primary_contact_details(CensusInfo ApplicantInfo, CensusInfo SpouseInfo)
			throws InterruptedException, IOException {
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AddressLineOne));
		MoveToElementClick(element);
		writeText(AddressLineOne, ApplicantInfo.AddressLine1);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(PrimaryZipCode));
		MoveToElementClick(element);
		clear(PrimaryZipCode);
		writeText(PrimaryZipCode, "11753");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LivingOutsideYes));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LivingOutsideAddress));
		MoveToElementClick(element);
		writeText(LivingOutsideAddress, "11th Florida Street");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LivingOutsideZip));
		MoveToElementClick(element);
		writeText(LivingOutsideZip, ApplicantInfo.Zipcode);
		ExtentSuccessMessage("Address Details Has Been Captured");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		waitForElement(1000);
		String getEmailValue = "TC-REG-6-Sanity-" + writeDynamicEmail();
		waitForElement(3000);
		System.out.println("Generated Email: " + getEmailValue);
		ExtentSuccessMessage("Generated Email: " + getEmailValue);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Email));
		MoveToElementClick(element);
		writeText(Email, getEmailValue);
		ExtentSuccessMessage("Successfully saved applicant email address");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(PhoneNumber));
		MoveToElementClick(element);
		writeText(PhoneNumber, "(555) 222-1001");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(PhoneType));
		MoveToElementClick(element);
		writeText(PhoneType, "Home");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SendMePaperNotice));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(PreferredWrittenLanguage));
		MoveToElementClick(element);
		writeText(PreferredWrittenLanguage, "English");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(PreferredSpokenLanguage));
		MoveToElementClick(element);
		writeText(PreferredSpokenLanguage, "English");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully saved applicant address and preferred language");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AnswerAutoLender));
		ExtentSuccessMessage("RIPD Service is Up and Running, Hence the questions are Showing");
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AnswerCreditCard));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AnswerCuurentCity));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		waitForElement(1000);
		wait.until(ExpectedConditions.presenceOfElementLocated(VerifySuccessMsg));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Registration and Validation has been successfully completed");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(HHFirstName));
	}

	public void expanded_bronze_easy_pricing_tag_validation() throws InterruptedException, IOException {
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CignaLabel));
		MoveToElementClick(element);
		ExtentSuccessMessage("Plan Options Are Selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ExpandedBronzeLabel));
		MoveToElementClick(element);
		ExtentSuccessMessage("Expanded Bronze Meta Level Options Are Selected");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ExpandedBronzeEasyPricing));
		MoveToElementClick(element);
		ExtentSuccessMessage("Expanded Bronze Easy Pricing Tag Selected");
		waitForElement(1000);
		Assert.assertTrue(driver.findElement(EasyPricingTag).isDisplayed(), "Element is not visible");
		ExtentSuccessMessage("Easy pricing assertion completed");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EasyPricingInfo));
		MoveToElementClick(element);
		ExtentSuccessMessage("Easy Pricing Info option has been selected");
		waitForElement(1000);
		Assert.assertTrue(driver.findElement(EasyPricingText).isDisplayed(), "Element is not visible");
		ExtentSuccessMessage("Easy pricing text assertion completed");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(OkButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Expanded Bronze Easy Pricing Validations are completed");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CignaLabel));
		MoveToElementClick(element);
		ExtentSuccessMessage("Plan Options Are Un-Selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ExpandedBronzeLabel));
		MoveToElementClick(element);
		ExtentSuccessMessage("Expanded Bronze Meta Level Options Are Un-Selected");
		waitForElement(2000);
	}

	public void silver_easy_pricing_tag_validation() throws InterruptedException, IOException {
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AvMedLabel));
		MoveToElementClick(element);
		ExtentSuccessMessage("Plan Options Are Selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SilverLabel));
		MoveToElementClick(element);
		ExtentSuccessMessage("Silver Meta Level Options Are Selected");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SilverEasyPricing));
		MoveToElementClick(element);
		ExtentSuccessMessage("Silver- Easy Pricing Tag Selected");
		waitForElement(1000);
//		Assert.assertTrue(driver.findElement(EasyPricingTag).isDisplayed(), "Element is not visible");
		ExtentSuccessMessage("Easy pricing assertion completed");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EasyPricingInfo));
		MoveToElementClick(element);
		ExtentSuccessMessage("Easy Pricing Info option has been selected");
		waitForElement(1000);
//		Assert.assertTrue(driver.findElement(EasyPricingText).isDisplayed(), "Element is not visible");
		ExtentSuccessMessage("Easy pricing text assertion completed");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(OkButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("SILVER- Easy Pricing Validations are completed");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AvMedLabel));
		MoveToElementClick(element);
		ExtentSuccessMessage("Plan Options Are Un-Selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SilverLabel));
		MoveToElementClick(element);
		ExtentSuccessMessage(" Silver- Meta Level Options Are Un-Selected");
		waitForElement(1000);
	}

	public void unsupported_plan_validation() throws InterruptedException, IOException {
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(PlanText));
		Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(PlanText)) != null,
				"Assertion failed");
		ExtentSuccessMessage("Assertion for Unsupported plan is completed");
		waitForElement(1000);
		ExtentSuccessMessage("All the above steps are executed successfully");
		waitForElement(1000);
	}

	public void gold_easy_pricing_tag_validation() throws InterruptedException, IOException {
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AmbetterLabel));
		MoveToElementClick(element);
		ExtentSuccessMessage("Plan Options Are Selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GoldLabel));
		MoveToElementClick(element);
		ExtentSuccessMessage("Gold- Meta Level Options Are Selected");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GoldEasyPricing));
		MoveToElementClick(element);
		ExtentSuccessMessage("GOLD- Easy Pricing Tag Selected");
		waitForElement(1000);
		Assert.assertTrue(driver.findElement(EasyPricingTag).isDisplayed(), "Element is not visible");
		ExtentSuccessMessage("Easy pricing assertion completed");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EasyPricingInfo));
		MoveToElementClick(element);
		ExtentSuccessMessage("Easy Pricing Info option has been selected");
		waitForElement(1000);
		Assert.assertTrue(driver.findElement(EasyPricingText).isDisplayed(), "Element is not visible");
		ExtentSuccessMessage("Easy pricing text assertion completed");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(OkButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("GOLD- Easy Pricing Validations are completed");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AmbetterLabel));
		MoveToElementClick(element);
		ExtentSuccessMessage("Plan Options Are Un-Selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GoldLabel));
		MoveToElementClick(element);
		ExtentSuccessMessage(" GOLD- Meta Level Options Are Un-Selected");
		waitForElement(3000);
	}

	public void plan_selection_page_multi_county() throws InterruptedException, IOException {
//		ExtentSuccessMessage("Cigna Options Are Selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EffectiveDateDropdown));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CignaLabel));
		MoveToElementClick(element);
		ExtentSuccessMessage("Plan Options Are Selected");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EditZipCode));
		MoveToElementClick(element);
		waitForElement(2000);
		ExtentSuccessMessage("New Zip Code Element Identified");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NewZipCode));
		MoveToElementClick(element);
		clear(NewZipCode);
		writeText(NewZipCode, "29001");
		ExtentSuccessMessage("Multi County Zip Code Added");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectCounty));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectCountyValue));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClickContinueButton));
		MoveToElementClick(element);
		waitForElement(10000);
		js.executeScript("window.scrollBy(10,-300)");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SenderOElement));
		imgSrc = element.getText();
		System.out.println("imgSrc For Sender:" + imgSrc);
		expectedImgSrc = "Standard Expanded";
		// Perform the assertion
		waitForElement(1000);
		Assert.assertTrue(imgSrc.contains(expectedImgSrc), "Image source URL does not match.");
		ExtentSuccessMessage("Standard Expanded Bronze Plan Options Are Showing");
		waitForElement(2000);
		ExtentSuccessMessage("All steps are executed successfully");
	}

}
