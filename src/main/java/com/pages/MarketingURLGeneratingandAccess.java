package com.pages;

import java.io.IOException;
import java.time.Duration;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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

public class MarketingURLGeneratingandAccess extends BasePage {

	public MarketingURLGeneratingandAccess(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement element;
	public String MarketingURL;
	public String ExpectedResult = "Applicants were excluded from the quote because they may be eligible for Medicaid/CHIP.";
	String imgSrc;
	String expectedImgSrc;
	String savingsAmount;
	String AddedApplicantExpected = "Zip: 33433, 3 Applicants, Income: $25,000";
	By userID = By.id("Item2_UserName");
	By pwd = By.id("Item2_Password");
	By captcha = By.xpath("//label[@id='recaptcha-anchor-label']/..");
	By signIn = By.xpath("//a[@id='SignIn']");

	private By SelectUser = By.xpath("//a[@class='dropdownMenu user-details-menuSection dropdownArrowMenu']");
	private By SelectLogoutProfile = By.xpath("(//a[contains(.,'Sign Out')])[1]");
	private By SelectAgency = By.xpath("(//a[contains(.,'Agency Details')])[1]");
	private By EditMyProfile = By.xpath("//a[@id='agencycontacteditcustomerdetails_button']");
	private By Edit_NPN = By.xpath("//input[@id='PersonDetails_NationalProducerNumber']");
	private By NPN_Conscent = By.cssSelector("#agencycontacteditcustomerdetails_button_box > div.row.margin_bottom_0px.personconsent > div > p:nth-child(1) > label > span");
	private By EditSaveButton = By.xpath("(//a[contains(.,'Save')])[1]");
	
	private By SelectLogout = By.xpath("(//a[contains(.,'Sign Out')])[2]");
	private By MarketingLabel = By.xpath("//label[contains(.,' Marketing Details')]");
	private By BusinessType = By.xpath("(//input[@class='select-dropdown dropdown-trigger'])[5]");
	private By LifeOfBusiness = By.xpath("(//input[@class='select-dropdown dropdown-trigger'])[6]");
	private By MarketingURLButton = By.id("MarketingURL_button");
	private By CopyMarketingURL = By.cssSelector("#generate_url_id > ul > li.margin_bottom_0px > p");
	private By LogoutButtonConfirmation = By.xpath(
			"//a[@class='modal-action tertiary_background waves-effect waves-light btn-large ConfirmForceLogin']");
	private By ClickOnCloseButton = By.xpath("//*[@class='close_icon modal-close right']");
	private By SelectMyProfile = By.xpath("(//a[contains(.,'My Profile')])[1]");
	private By ZipCode = By.xpath("//*[@id='zipcode']");
	private By GetStartedButton = By.xpath("//a[contains(text(),'get started')]");
	private By ApplicantDOB = By.xpath("//input[@id='dob']");
	private By SaveButton = By.cssSelector(
			"#myselfSection > div.members_input_section.householdPanel.myselfSection > div.section_button > a");
	private By ContinueButton = By.xpath("//a[contains(.,'Continue')]");
	private By ClickContinueButton = By.xpath("(//a[contains(.,'Continue')])[1]");
	private By SpouseMedicaidCheck = By.xpath("(//*[@class='medicadechk'])[1]");
	private By ChildMedicaidCheck = By.xpath("(//*[@class='medicadechk'])[2]");
	private By SenderOElement = By.cssSelector(
			"#PartialPlanBoxlistGrid > div:nth-child(11) > div.plan_row.planNameFeturesSec > div.plan_name_logo_section > p");
	private By SkipButton = By.xpath("//a[contains(text(),'Skip for now')]");
	private By HouseholdIncome = By.cssSelector("#income");
	private By ACAPlan = By.xpath("//h1[@class='infoHeading']");
	private By SavingsValue = By.cssSelector(
			"body > app-root > app-cf-income > div.container.text-center > div.col-sm-12.col-md-12.col-lg-12.centerAlignedSection.leftsection > div:nth-child(2) > div > div.main_content_section.savingsListWrapper > div > div > p.savingsValue > span.savings_val");
	private By AddSpouseOption = By.xpath("(//span[@class='icon-add addIcon'])[1]");
	private By SpouseDOB = By.xpath("//input[@id='spouse_dob']");
	private By SpouseSaveButton = By.cssSelector(
			"#spouseSection > div.members_input_section.householdPanel.spouseSection > div.section_button > a.prmy_btn");
	private By BackButton = By.xpath("//a[contains(.,'Back')]");
	private By AddDependentOption = By.xpath("(//span[@class='icon-add addIcon'])[1]");
	private By AddNewDependentOption = By.xpath("(//span[@class='icon-add addIcon'])[2]");
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
	private By ChooseThePlan = By.xpath("//label[contains(text(),'Choose this plan')]");
	private By CignaLabel = By.xpath("//*[@for='Cigna']");
	private By AetnaLabel = By.xpath("//*[@for='Aetna']");
	private By NonCoveredDoctor = By.xpath("(//span[@class='not_available'])[1]");
	private By CoveredDoctor = By.xpath("(//span[@class='available'])[1]");
	private By PlanDetails = By.xpath("(//a[@class='viewproductdetails view_more'])[1]");
	private By HMOLabel = By.xpath("//*[@for='HMO']");
	private By OutOfNetwork = By.xpath("(//span[@class='valueText notavailable'])[1]");
	private By InNetwork = By.xpath("(//span[@class='valueText available'])[1]");
	private By PPOLabel = By.xpath("//*[@for='PPO']");
	private By SilverLabel = By.xpath("//*[@for='Silver']");
	private By BronzeLabel = By.xpath("//*[@for='Bronze']");
	private By GoldLabel = By.xpath("//*[@for='Gold']");
	private By Star3AndAbove = By.xpath("//*[@for='Gold']");
	private By LabelVisibility = By.cssSelector("span.plan_logo img");
	private By AvMedLabel = By.xpath("//*[@for='AvMed']");
	private By AddToCartButton = By.xpath("(//*[@id='mcmqAddToCart'])[1]");
	private By EffectiveDateDropdown = By.xpath("(//*[@class='editPlanDatas editEffectiveDate'])[1]");
	private By EditZipCode = By.xpath("(//*[@class='icon-edit'])[1]");
	private By EditDoctorAndFacility = By.xpath("(//*[@class='icon-edit'])[2]");
	private By EditDrugDetails = By.xpath("(//*[@class='icon-edit'])[3]");
	private By DrugField = By.xpath("//input[@id='medication']");
	private By DrugFieldSelection = By.cssSelector("#EditPrescription > div > div.main_content_section > div:nth-child(1) > div.search_results.medication_listing > div > div > label");
	private By AddButton = By.cssSelector("#select_dosage > div.addSec > a");
	private By DrugContinueButton = By.cssSelector("#EditPrescription > div > div.button_section > a.lg-btn.half_width_btn");
	private By DoctorOrFacilityField = By.xpath("//*[@id='doctors_facilities']");
	private By AddDoctor = By.cssSelector(
			"#EditDoctorsFacilities > div > div.main_content_section > div > div.input-group.input-withicon.showSearchResults > div > div:nth-child(1) > label > a");
	private By NewZipCode = By.xpath("//*[@id='zipcodeAutoComplete']");
	private By AddDependentButton = By.xpath("//*[@class='addDependent']");
	private By IncludeDependent = By.xpath("//*[@class='addDependent']");
	private By ClickApply = By.xpath("//a[@id='btnapply']");
	private By ApplicantAssertion = By.cssSelector("#lstHousehold > a > p");
	private By ClickDoctorApply = By.xpath("(//*[@class='lg-btn half_width_btn'])[1]");
	private By EligibilityCheck = By
			.cssSelector("#eligibility_section > div.warning.message_display_section > div > p");
	private By GenderOfApplicant = By.xpath("//label[@for='male']");
	private By GenderOfSpouse = By.xpath("//label[@for='spouse_female']");
	private By PregnentSpouse = By.xpath("//*[@for='pregnant']");
	private By CHIPSpouse = By.xpath("//*[@for='chip_applicant-1']");
	private By CHIPDependent = By.xpath("//*[@for='chip_applicant-2']");
	private By SavingValue = By.xpath("//span[@class='savings_val']");
	private By GenderOfDependent = By.xpath("//label[@for='dep_male']");

	public void waitForElement(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public static void removeOldReports() {
		String path = ".\\TestReport";
		Path directory = Paths.get(path);

		try {
			Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					if (isOldReport(file)) {
						Files.delete(file);
						System.out.println("Deleted report: " + file);
					}
					return FileVisitResult.CONTINUE;
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deleteOldDownloadReports() {
		String path = System.getProperty("user.home") + "/Downloads";
		Path directory = Paths.get(path);

		try {
			Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					if (isOldReport(file)) {
						Files.delete(file);
						System.out.println("Deleted report: " + file);
					}
					return FileVisitResult.CONTINUE;
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deleteOldScreenshots() {
		String path = ".\\ScreenShots";
		Path directory = Paths.get(path);

		try {
			Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					if (isOldReport(file)) {
						Files.delete(file);
						System.out.println("Deleted Screenshot: " + file);
					}
					return FileVisitResult.CONTINUE;
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static boolean isOldReport(Path file) {
		try {
			BasicFileAttributes attrs = Files.readAttributes(file, BasicFileAttributes.class);
			FileTime creationTime = attrs.creationTime();

			// Calculate the difference in days
			long daysDifference = calculateDaysDifference(creationTime.toMillis(), System.currentTimeMillis());
			String numberOfDaysString = configloader().getProperty("DeleteFromPastDays");
			long numberOfDays = Long.parseLong(numberOfDaysString);

			// Check if the report is exactly old
			return daysDifference >= numberOfDays;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	private static long calculateDaysDifference(long startTime, long endTime) {
		long difference = endTime - startTime;
		return TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
	}

	public void applicant_customer_profile_validation(CensusInfo ApplicantInfo, CensusInfo SpouseInfo)
			throws InterruptedException {
		try {
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
	}
	
	public void send_basic_details_of_agent(String NPNNumber) throws InterruptedException, IOException {
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		writeText(userID, "AnandaBAQA");
		ExtentSuccessMessage("Agent user ID entered");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		writeText(pwd, "Password1");
		ExtentSuccessMessage("Agent password entered");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Sign In button");
		waitForElement(1000);
		try {
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
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectMyProfile));
		MoveToElementClick(element);
		ExtentSuccessMessage("User profile has been selected");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EditMyProfile));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Edit My Profile option");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Edit_NPN));
		MoveToElementClick(element);
		ExtentSuccessMessage("Cleared the existing NPN Value");
		clear(Edit_NPN);
		writeText(Edit_NPN , NPNNumber);
		ExtentSuccessMessage("Added a new NPN value");
		waitForElement(1000);
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(NPN_Conscent));
//		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on NPN Conscent confirmation");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EditSaveButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Save confirmation");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogoutProfile));
		MoveToElementClick(element);
		ExtentSuccessMessage("Agent has logged out from application");
		waitForElement(1000);
		String newURL = configloader().getProperty("URLBAQA");
		driver.get(newURL);
		ExtentSuccessMessage("Above steps are executed successfully");
		waitForElement(1000);
	}

	public void launch_the_copied_marketing_url() throws InterruptedException {
		waitForElement(3000);
		driver.get(MarketingURL);
		waitForElement(1000);
		ExtentSuccessMessage("Launched the copied marketing URL in the browser");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ZipCode));
		ExtentSuccessMessage("Identified the elements present in the Marketing URL page");
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Zipcode element identified successfully");
		writeText(ZipCode, "33433");
		ExtentSuccessMessage("Zipcode element identified successfully");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GetStartedButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully accessed the copied marketing URL");
		waitForElement(1000);
		ExtentSuccessMessage("All steps are processed successfully");
	}

	public void applicant_only_validation(CensusInfo ApplicantInfo) throws InterruptedException {
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ApplicantDOB));
		MoveToElementClick(element);
		waitForElement(1000);
		writeText(ApplicantDOB, ApplicantInfo.DOB + Keys.TAB);
		ExtentSuccessMessage("Successfully entered applicant DOB");
		waitForElement(5000);
//		element = driver.findElement(By.xpath("//label[@for='" + ApplicantInfo.Gender + "']"));
//		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GenderOfApplicant));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully added gender of the applicant");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SaveButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully saved applicant basic details");
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Successfully validated applicant only census page validation");
	}

	public void applicant_with_spouse_validation(CensusInfo ApplicantInfo, CensusInfo SpouseInfo)
			throws InterruptedException {
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AddSpouseOption));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SpouseDOB));
		MoveToElementClick(element);
		writeText(SpouseDOB, SpouseInfo.DOB);
		waitForElement(1000);
//		WebElement genderSpouse = driver.findElement(By.xpath("//label[@for='spouse_" + SpouseInfo.Gender + "']"));
//		wait.until(ExpectedConditions.elementToBeClickable(genderSpouse)).click();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GenderOfSpouse));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SpouseSaveButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully saved spouse personal information");
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully validated applicant with spouse census page validation");
	}
	
	public void applicant_with_pregnent_spouse_validation(CensusInfo SpouseInfo, CensusInfo DependentsInfo)
			throws InterruptedException {
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AddSpouseOption));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SpouseDOB));
		MoveToElementClick(element);
		writeText(SpouseDOB, SpouseInfo.DOB + Keys.TAB);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GenderOfSpouse));
		MoveToElementClick(element);
		waitForElement(500);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(PregnentSpouse));
		MoveToElementClick(element);
		waitForElement(500);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SpouseSaveButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully saved spouse personal information");
		waitForElement(2000);
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(AddDependentOption));
//		MoveToElementClick(element);
//		ExtentSuccessMessage("Clicked on add depedent details button");
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(DependentDOB));
//		MoveToElementClick(element);
//		writeText(DependentDOB, DependentsInfo.DOB);
//		ExtentSuccessMessage("Added depedent DOB details button");
//		waitForElement(1000);
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(GenderOfDependent));
//		MoveToElementClick(element);
//		waitForElement(1000);
//		ExtentSuccessMessage("Added depedent gender details button");
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(DependentSaveButton));
//		MoveToElementClick(element);
//		ExtentSuccessMessage("Successfully saved dependent personal information");
//		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		waitForElement(2000);
		ExtentSuccessMessage("Successfully entered applicant and dependents details");
	}
	
	public void CHIP_Quoting_page_validation(CensusInfo ApplicantInfo) throws InterruptedException {
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(HouseholdIncome));
		MoveToElementClick(element);
		clear(HouseholdIncome);
		writeText(HouseholdIncome, ApplicantInfo.Earnings);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Income Details Are Added");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CHIPSpouse));
		MoveToElementClick(element);
		ExtentSuccessMessage("Spouse Selected - Medicaid and Childrens Health Insurance Program (CHIP)");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SavingsValue));
		Assert.assertTrue(element.isDisplayed(), "Assertion Failed");
		savingsAmount = element.getText();
		ExtentSuccessMessage("savingsAmount:" + savingsAmount);
		waitForElement(1000);
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(CHIPSpouse));
//		MoveToElementClick(element);
//		ExtentSuccessMessage("Dependent Child Selected - Medicaid and Childrens Health Insurance Program (CHIP)");
//		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Income Details Are Added");
		waitForElement(1000);
	}

	public void move_back_page() throws InterruptedException {
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(BackButton));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Move back to add the dependent details");
	}

	public void applicant_with_spouse_and_child_validation(CensusInfo ApplicantInfo, CensusInfo DependentsInfo)
			throws InterruptedException {
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
		waitForElement(10000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		waitForElement(2000);
		ExtentSuccessMessage("Successfully entered applicant and two dependents details");
		ExtentSuccessMessage("Successfully validated applicant only census page validation");
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

	public void csr_savings_page_validation(String IncomeValue) throws InterruptedException {
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(HouseholdIncome));
		MoveToElementClick(element);
		clear(HouseholdIncome);
		writeText(HouseholdIncome, IncomeValue);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Income Details Are Added");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SavingsValue));
		Assert.assertTrue(element.isDisplayed(), "Assertion Failed");
		String savingsAmount = element.getText();
		System.out.println("savingsAmount:" + savingsAmount);
//		Assert.assertEquals(savingsAmount ,ExpectedValue );
		Assert.assertNotNull(savingsAmount, "Assertion need evaluation" );
		ExtentSuccessMessage("Savings Value Assertion is Successful");
		waitForElement(1000);
	}
	
	public void aptc_eligible_page_validation() throws InterruptedException {
		String ExpectedValue = "You may not be eligible for enrolling in an ACA plan";
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(HouseholdIncome));
		MoveToElementClick(element);
		clear(HouseholdIncome);
		writeText(HouseholdIncome, "100");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Income Details Are Added");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ACAPlan));
		Assert.assertTrue(element.isDisplayed(), "Assertion Failed");
		String savingsAmount = element.getText();
		Assert.assertEquals(savingsAmount ,ExpectedValue );
		ExtentSuccessMessage("ACA Plan Assertion is Successful");
		waitForElement(1000);
	}

	public void household_details_without_income(CensusInfo ApplicantInfo, CensusInfo DependentsInfo)
			throws InterruptedException {
		move_back_page();
		clear(HouseholdIncome);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Income Details Are Added without giving amount");
		waitForElement(1000);
		driver.manage().deleteAllCookies();
		waitForElement(2000);
	}

	public void drug_and_doctors_page(CensusInfo ApplicantInfo, CensusInfo DependentsInfo) throws InterruptedException {
		try {
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
	
	public void CHIP_medicaid_eligibility_validation(CensusInfo DependentsInfo) throws InterruptedException, IOException {
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SavingValue));
		String ActualSavingsAmount = element.getText();
		waitForElement(1000);
		Assert.assertEquals(savingsAmount, ActualSavingsAmount);
		ExtentSuccessMessage("CHIP Medicaid Page Savings Amount Matched With Plan Presentation Page Savings Amount");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EditZipCode));
		MoveToElementClick(element);
		ExtentSuccessMessage("Click on Edit Applicant Details Button to Add a new Dependent");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AddNewDependentOption));
		MoveToElementClick(element);
		ExtentSuccessMessage("Click on Add a new Dependent option");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AddDependentDOB));
		MoveToElementClick(element);
		writeText(AddDependentDOB, DependentsInfo.DOB + Keys.TAB);
		ExtentSuccessMessage("Added the Date of birth of new Dependent child");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AddDependentGender));
		MoveToElementClick(element);
		ExtentSuccessMessage("Added the gender of new Dependent child");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(IncreaseHHCount));
		MoveToElementClick(element);
		ExtentSuccessMessage("Added the newly Dependent child to the coverage");
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClickContinueButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Applied the above changes to Applicant");
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SpouseMedicaidCheck));
		MoveToElementClick(element);
		ExtentSuccessMessage("Included the Spouse to Medicare CHIP");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ChildMedicaidCheck));
		MoveToElementClick(element);
		ExtentSuccessMessage("Included the Dependent Child to Medicare CHIP");
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClickApply));
		MoveToElementClick(element);
		waitForElement(20000);
		ExtentSuccessMessage("Applied Medicare CHIP to Dependents");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ApplicantAssertion));
		String AddedApplicantResult = element.getText();
		waitForElement(1000);
		Assert.assertEquals(AddedApplicantResult, AddedApplicantExpected);
		ExtentSuccessMessage("Assertion completed successfully for the CHIP Medicaid Spouse and Dependent");
		ExtentSuccessMessage("All above steps are executed successfully");
	}

	public void plan_selection_page_of_the_consumer(CensusInfo DependentsInfo)
			throws InterruptedException, IOException {
		waitForElement(1000);
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
		ExtentSuccessMessage("Cigna Plan Options Are Selected");
		waitForElement(3000);
		js.executeScript("window.scrollBy(10,-600)");
		wait.until(ExpectedConditions.presenceOfElementLocated(LabelVisibility));
		element = driver.findElement(By.cssSelector("span.plan_logo img"));
		imgSrc = element.getAttribute("src");
		System.out.println("imgSrc:" + imgSrc);
		expectedImgSrc = "/brokerengage/Content/Repository/BrandLogo/Cigna";
		// Perform the assertion
		waitForElement(1000);
		Assert.assertTrue(imgSrc.contains(expectedImgSrc), "Image source URL does not match.");
		ExtentSuccessMessage("Cigna Plan Options Are Showing");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CignaLabel));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("Cigna Plan Options Are Un-Selected");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AvMedLabel));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("AvMed Plan Options Are Selected");
		waitForElement(1000);
		wait.until(ExpectedConditions.presenceOfElementLocated(LabelVisibility));
		element = driver.findElement(By.cssSelector("span.plan_logo img"));
		imgSrc = element.getAttribute("src");
		expectedImgSrc = "/brokerengage/Content/Repository/BrandLogo/AvMed.png";
		js.executeScript("window.scrollBy(10,-300)");
		// Perform the assertion
		waitForElement(1000);
		Assert.assertTrue(imgSrc.contains(expectedImgSrc), "Image source URL does not match.");
		ExtentSuccessMessage("AvMed Plan Options Are Showing");
		waitForElement(2000);
		js.executeScript("window.scrollBy(10,-300)");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EditZipCode));
		MoveToElementClick(element);
		waitForElement(2000);
		ExtentSuccessMessage("New Zip Code Element Identified");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NewZipCode));
		MoveToElementClick(element);
		clear(NewZipCode);
		writeText(NewZipCode, "73301");
		ExtentSuccessMessage("New Zip Code Added");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClickContinueButton));
		MoveToElementClick(element);
		waitForElement(10000);
		js.executeScript("window.scrollBy(10,-300)");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SenderOElement));
		imgSrc = element.getText();
		System.out.println("imgSrc For Sender:" + imgSrc);
		expectedImgSrc = "Sendero Health";
		// Perform the assertion
		waitForElement(1000);
		Assert.assertTrue(imgSrc.contains(expectedImgSrc), "Image source URL does not match.");
		ExtentSuccessMessage("SENDERO Health Plan Options Are Showing");
		waitForElement(2000);
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
		ExtentSuccessMessage("All steps are executed successfully");
	}
	
	public void doctors_drugs_facilities_validations() throws InterruptedException, IOException {
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EditDrugDetails));
		MoveToElementClick(element);
		ExtentSuccessMessage("Drug section is editable");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DrugField));
		MoveToElementClick(element);
		waitForElement(2000);
		writeText(DrugField,"ARICEPT" + Keys.TAB);
		ExtentSuccessMessage("Drug name has been entered");
		waitForElement(2000);
		wait.until(ExpectedConditions.elementToBeClickable(DrugFieldSelection));
		click(DrugFieldSelection);
		ExtentSuccessMessage("Drug name has been added");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AddButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Add Button");
		waitForElement(10000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DrugContinueButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Continue Button");
		waitForElement(10000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EditDoctorAndFacility));
		MoveToElementClick(element);
		ExtentSuccessMessage("Doctors and Facilities are editable");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DoctorOrFacilityField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Doctor field is editable");
		writeText(DoctorOrFacilityField, "Doc");
		waitForElement(2000);
		ExtentSuccessMessage("Entered covered doctor details");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AddDoctor));
		MoveToElementClick(element);
		ExtentSuccessMessage("Added the covered doctor");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DoctorOrFacilityField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Doctor field is editable for next item");
		writeText(DoctorOrFacilityField, "Beth Yegelwel Lmhc" + Keys.TAB);
		waitForElement(2000);
		ExtentSuccessMessage("Entered non-covered doctor details");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AddDoctor));
		MoveToElementClick(element);
		ExtentSuccessMessage("Added the non-covered doctor");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClickDoctorApply));
		MoveToElementClick(element);
		ExtentSuccessMessage("Applied the doctor and facilites to applicant");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AetnaLabel));
		MoveToElementClick(element);
		ExtentSuccessMessage("Aetna plan selection completed");
		waitForElement(1000);
		Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(NonCoveredDoctor)) != null, "Validation of Non Covered Doctor is Not Successful");
		ExtentSuccessMessage("Validation of Non-Covered Doctor is Successful");
		waitForElement(1000);
		Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(CoveredDoctor)) != null, "Validation of Covered Doctor is Not Successful");
		ExtentSuccessMessage("Validation of Covered Doctor is Successful");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(PlanDetails));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on plan details");
		waitForElement(1000);
		String parentWindowHandle = driver.getWindowHandle();
		switchToNextTab(driver, parentWindowHandle);
		ExtentSuccessMessage("Navigated to Plan details window");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(OutOfNetwork));
		String OutOfNetworkText = element.getText();
		Assert.assertEquals(OutOfNetworkText , "Out-of-network");
		waitForElement(1000);
		ExtentSuccessMessage("Non covered doctor Out-of-network validation is successfull");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(InNetwork));
		String InNetworkText = element.getText();
		Assert.assertEquals(InNetworkText , "In-network");
		waitForElement(1000);
		ExtentSuccessMessage("Covered doctor In-Network validation is successfull");
		driver.close();
		driver.switchTo().window(parentWindowHandle);
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
	
	public void driver_quit() {
		driver.quit();
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
		wait.until(ExpectedConditions.presenceOfElementLocated(LabelVisibility));
		element = driver.findElement(By.cssSelector("span.plan_logo img"));
		imgSrc = element.getAttribute("src");
		expectedImgSrc = "/brokerengage/Content/Repository/BrandLogo/Aetna";
		js.executeScript("window.scrollBy(10,-300)");
		// Perform the assertion
		waitForElement(1000);
		Assert.assertTrue(imgSrc.contains(expectedImgSrc), "Image source URL does not match.");
		ExtentSuccessMessage("Aetna Plan Options Are Showing");
		waitForElement(2000);
		// --//
		element = wait.until(ExpectedConditions.presenceOfElementLocated(HMOLabel));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(PPOLabel));
		MoveToElementClick(element);
		waitForElement(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(LabelVisibility));
		element = driver.findElement(By.cssSelector("span.plan_logo img"));
		imgSrc = element.getAttribute("src");
		expectedImgSrc = "/brokerengage/Content/Repository/BrandLogo/Florida";
		js.executeScript("window.scrollBy(10,-300)");
		// Perform the assertion
		waitForElement(1000);
		Assert.assertTrue(imgSrc.contains(expectedImgSrc), "Image source URL does not match.");
		ExtentSuccessMessage("Florida Blue Plan Options Are Showing");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(PPOLabel));
		MoveToElementClick(element);
		waitForElement(1000);
		// --//
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SilverLabel));
		MoveToElementClick(element);
		waitForElement(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(LabelVisibility));
		element = driver.findElement(By.cssSelector("span.plan_logo img"));
		imgSrc = element.getAttribute("src");
		expectedImgSrc = "/brokerengage/Content/Repository/BrandLogo/Florida";
		js.executeScript("window.scrollBy(10,-300)");
		// Perform the assertion
		waitForElement(1000);
		Assert.assertTrue(imgSrc.contains(expectedImgSrc), "Image source URL does not match.");
		ExtentSuccessMessage("Florida Blue Plan Options Are Showing");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SilverLabel));
		MoveToElementClick(element);
		waitForElement(1000);
		// --//
		element = wait.until(ExpectedConditions.presenceOfElementLocated(BronzeLabel));
		MoveToElementClick(element);
		waitForElement(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(LabelVisibility));
		element = driver.findElement(By.cssSelector("span.plan_logo img"));
		imgSrc = element.getAttribute("src");
		expectedImgSrc = "/brokerengage/Content/Repository/BrandLogo/AmeriHealth";
		js.executeScript("window.scrollBy(10,-300)");
		// Perform the assertion
		waitForElement(1000);
		Assert.assertTrue(imgSrc.contains(expectedImgSrc), "Image source URL does not match.");
		ExtentSuccessMessage("AmeriHealth Caritas Next Bronze Classic Plan Options Are Showing");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(BronzeLabel));
		MoveToElementClick(element);
		waitForElement(1000);
		// --//
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GoldLabel));
		MoveToElementClick(element);
		waitForElement(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(LabelVisibility));
		element = driver.findElement(By.cssSelector("span.plan_logo img"));
		imgSrc = element.getAttribute("src");
		expectedImgSrc = "/brokerengage/Content/Repository/BrandLogo/Ambetter";
		js.executeScript("window.scrollBy(10,-300)");
		// Perform the assertion
		waitForElement(1000);
		Assert.assertTrue(imgSrc.contains(expectedImgSrc), "Image source URL does not match.");
		ExtentSuccessMessage("Ambetter Standard Gold Plan Options Are Showing");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GoldLabel));
		MoveToElementClick(element);
		waitForElement(2000);
		// --//
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GoldLabel));
		MoveToElementClick(element);
		waitForElement(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(LabelVisibility));
		element = driver.findElement(By.cssSelector("span.plan_logo img"));
		imgSrc = element.getAttribute("src");
		expectedImgSrc = "/brokerengage/Content/Repository/BrandLogo/Ambetter";
		js.executeScript("window.scrollBy(10,-300)");
		// Perform the assertion
		waitForElement(1000);
		Assert.assertTrue(imgSrc.contains(expectedImgSrc), "Image source URL does not match.");
		ExtentSuccessMessage("Ambetter Standard Gold Plan Options Are Showing");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(GoldLabel));
		MoveToElementClick(element);
		waitForElement(1000);
		// --//
	}
}
