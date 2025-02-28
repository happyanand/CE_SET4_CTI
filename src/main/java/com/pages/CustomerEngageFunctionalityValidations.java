package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.BasePackage.Base_Class;

public class CustomerEngageFunctionalityValidations extends BasePage {

	private static final String Annual = null;
	private static final String URL1 = null;
	HomePage HomePage = new HomePage(driver);
	Base_Class Base_Class = new Base_Class();
	CTI_Leadgridpage CTI_Leadgridpage = new CTI_Leadgridpage(driver);
	TelephonyPage TelephonyPage = new TelephonyPage(driver);
	// CustomerEngageFunctionalityValidations cfv = new
	// CustomerEngageFunctionalityValidations(driver);
	public static String Pagetitle;
	public static String Username1;
	public static String LoginUserName2;
	public static String Callingtimes;
	public static String Callingtime;
	public String pswd = null;
	public String URL = null;

	public CustomerEngageFunctionalityValidations(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement element;
	WebElement SelectUSerelement;
	public String MarketingURL;
	public String ExpectedResult = "Applicants were excluded from the quote because they may be eligible for Medicaid/CHIP.";
	String imgSrc;
	String expectedText;
	String savingsAmount;
	String AddedApplicantExpected = "Zip: 33433, 3 Applicants, Income: $25,000";
	String actualText;
	public String fullName;
	public String firstName;
	public String lastName;
	public String getEmailValue;
	public String agentUserName;
	public String getLastName;
	public String getFirstName;
	public String actualString = "Congratulations! Your application has been submitted successfully";
	public String EmailText;
	public String AgentText;
	public String NoteText;
	public String CarrierText;
	public String Campaign;
	public String ValidEmailText;
	public String NumberOutput;
	public String NumberOutput1;
	public String SelectUSerelementOutput1;
	public String RecordingDetails;
	public String UserNumberforCTI;
	public String time;
	public String textmsg;
	public String firstnumber;
	public String Custom_Status;
	public String quickdialtime;
	public String quickmessage;
	public String secondnumber;
	public String thirdnumber;
	public String username;

//	public String username;
	public String time2;

	By userID = By.id("user-name");// ------//for userid at Login page
	By pwd = By.id("password");// -------for password at home page
	By signIn = By.xpath("//*[@id='form-validation-button']");// -------for button on home page

	private By CheckUserLogin = By.xpath("//button[@class='positive md-button md-ink-ripple']");
	private By SelectUser = By.xpath("//a[@class='nav-link dropdown-toggle']");
	private By SelectLogout = By.xpath("(//a[contains(.,'Log Out')])[1]");

	private By AdminTile = By.xpath("//a[@class='glyphicon fa fa-fw fa-black-tie']");
	private By AdminUser = By.xpath("(//a[contains(.,'Users')])[2]");
	private By LogoutButtonConfirmation = By.xpath(
			"//a[@class='modal-action tertiary_background waves-effect waves-light btn-large ConfirmForceLogin']");
	private By CTIMinimizeIcon = By.xpath("//a[@class='fa fa-minus right-al']");
	private By SMSIcon = By.xpath("//a[@class='fa fa-commenting-o count-info ng-scope']");
	private By NEWMessage = By.xpath("//span[@class='message-new-icon']");
	private By InputNumber = By
			.xpath("//div[@class='new-message-forms']/input[@class='ng-pristine ng-untouched ng-valid ng-empty']");
	private By MessageTextArea = By
			.xpath("(//textarea[@class='new-message-textarea ng-pristine ng-untouched ng-valid ng-empty'])[2]");
	private By QASMSSection = By.xpath("//a[@class='fa fa-commenting-o count-info ng-scope']");
	private By MessageReceived = By.xpath("(//ul[@class='message-list'])[1]/li[1]");
	private By SendButton = By.xpath("(//a[@class='fa icon-btns send'])[2]");
	private By Qualatia1Number = By.xpath("//u[@title='Voice Number']");
	private By UATNumberField = By
			.xpath("//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
	private By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
	private By Qualtia1Number = By.xpath("(//div[@class='voice-call-ongoing-number']/span)[3]");
	private By Callnumberforwardedagent = By.xpath("(//div[@class=' voice-call-ongoing-number ']/span)[2]");
	private By CallAcceptButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[2]");
	private By CallDeclineButton = By.xpath(
			"//button[@class='voice-call-green-button-small fa fa-phone voice-decline'] | (//button[contains(@class,'voice-call-green-button-small fa fa-phone voice-decline')])[1]");
	private By CallDeclineButton1 = By
			.xpath("(//button[@class='voice-call-green-button-small fa fa-phone voice-decline'])[1]");
	private By CEUseroneNumber = By.xpath("//u[@title='Voice Number']");
	private By UatNumberinQualtia1 = By.xpath("(//div[@class='voice-call-ongoing-number']/span)[3]");
	private By LeadMinimize = By.xpath("//i[@class='acc glyphicon glyphicon-chevron-up']");
	private By CallTransferButton = By.xpath("//i[@class=' fa fa-calls-transfer ']");
	private By CallTransferButtonToQualtia2 = By.xpath("//span[@title='Qualitia Test2']/parent::*/button");
	private By CallTransferButtonToQualtia1 = By.xpath("//span[@title='Qualitia Test1']/parent::*/button");
	private By CallDeclineButtonInCeUserone = By
			.xpath("//button[@class=' voice-call-green-button-small fa fa-phone voice-decline ']");
	private By CallAcceptButtoninQualatia2 = By
			.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[2]");
	private By CallDeclineButtonInQualtia2 = By
			.xpath("//button[@class=' voice-call-green-button-small fa fa-phone voice-decline ']");
	private By CalltypeMissedcall = By.xpath("(//h5[contains(text(),'Call Type')]//parent::div//md-checkbox)[3]");
	private By CalltypeInboundcall = By.xpath("(//h5[contains(text(),'Call Type')]//parent::div//md-checkbox)[1]");
	private By CalltypeOutboundcall = By.xpath("(//h5[contains(text(),'Call Type')]//parent::div//md-checkbox)[2]");
	private By SMSTypeOutbondsms = By.xpath("(//h5[contains(text(),'SMS Type')]//parent::div//md-checkbox)[2]");
	private By SMSTypeInboundsms = By.xpath("(//h5[contains(text(),'SMS Type')]//parent::div//md-checkbox)[1]");
	private By ConfrenceAddButton = By
			.xpath("//*[@id=\"voice-call-window-draggable\"]/div[15]/div[1]/div[2]/div[5]/a[5]/i");
	private By ConfrenceNumberField = By.xpath(
			"(//div[@class='voice-call-dial-pad'])[2]/input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-empty']");
	private By CallConfreanceButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[2]");
	private By CallAcceptButtoninQualtia2 = By
			.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[2]");
	private By CallDeclineButtoninQualtia2 = By
			.xpath("//button[@class=' voice-call-green-button-small fa fa-phone voice-decline ']");
	private By CancelLead = By.xpath("//button[@name='Cancel']");
	private By L_ProfileStatus = By.xpath("//*[@class='profile']//span");
	private By YopmailInbox = By.xpath("//input[@id='login']");
	private By YopmailSubmit = By.xpath("//button[@title='Check Inbox @yopmail.com']");
	private By ClickHere = By.cssSelector("#mail > div > p:nth-child(5) > a");
	private By menubar = By.xpath("//span[@class='collpase-leftt glyphicon glyphicon-triangle-right']");

	// Asif Added new Xpaths

	private By CallMute = By.xpath("//*[contains(@ng-class,'{disabledMute')]");
	private By CallHold = By.xpath("//*[contains(@ng-class,'{disabledHold')]");
	private By CallTransfer = By.xpath("//*[contains(@class,'calls-transfer')]//parent::a[@aria-hidden='false']");
	private By CallAdd = By.xpath("//*[contains(@class,'plus')]//parent::a[@aria-hidden='false']");
	private By CallKeypad = By.xpath("//*[contains(@ng-click,'showDialPad(true)')]");
	private By CallEnd = By.xpath("//*[contains(@ng-click,'endActiveCall')]");
	private By CallRecording = By
			.xpath("//*[contains(text(),'Record')][contains(@ng-show,'record')][@aria-hidden='false']");
	private By CallonHoldIcon = By.xpath(
			"//*[contains(text(),'Hold')]//parent::a[contains(@ng-show,'primarayPhoneFlags.hold')][@aria-hidden='false']");
	private By CallUnmute = By.xpath("//*[contains(text(),'Unmute')]//parent::a[@aria-hidden='false']");
	private By CallRecordingon = By.xpath("//*[contains(text(),'Record')]//parent::a[@aria-hidden='false']");
	private By CallRecordinglist = By.xpath("(//*[@class='time-cont']//u)[1]");
	private By CallForwardAgent = By.xpath("(//*[contains(@ng-Click,'callForwardOnClick')])[1]");
	private By CallforwardAgentNumber = By.xpath(
			"((//*[contains(@ng-Click,'callForwardOnClick')])[1]//parent::span//span[@class='caller-ids ph-no']//u)[2]");
	private By CallAddAgentNumber = By.xpath(
			"(//*[contains(@class,' voice-user-active ')]//parent::span//u[@class='drag-not-allowed ng-binding'])[2]");
	private By QuickCallMuteIcon = By.xpath(
			"//*[@ng-show='!additionalDialog']//*[@class='voice-call-ongoing-quick-icons']//*[contains(@ng-click,'.mute')][@aria-hidden='false']");
	private By QuickCallHoldIcon = By.xpath(
			"//*[@ng-show='!additionalDialog']//*[@class='voice-call-ongoing-quick-icons']//*[contains(@ng-click,'.pause')][@aria-hidden='false']");
	private By QuickCallEndCallIcon = By.xpath(
			"//*[@ng-show='!additionalDialog']//*[@class='voice-call-ongoing-quick-icons']//*[@title='End Call']");
	private By QuickCallRecordIcon = By.xpath(
			"//*[@ng-show='!additionalDialog']//*[@class='voice-call-ongoing-quick-icons']//*[contains(@ng-click,'.record')][@aria-hidden='false']");
	private By AddANEWLEAD = By.xpath("//*[contains(@ng-click,'.addAsNewLead')]");
	private By LeadEmail = By.id("LeadEmail");
	private By CallAddAgent = By.xpath(
			"//*[contains(@class,'voice-call-green-button-small')][contains(@ng-click,'callSeconsaryOnClick(user.directNumber, user.userName)')]");
	private By SearchCallAddAgent = By
			.xpath("//*[contains(@class,'transferlookupicon')][contains(@ng-click,'getActiveUsersCallConfrence')]");
	private By LeadDOB = By.id("DOB");
	private By LeadGender = By.xpath("//*[@id='Gender']//parent::div[@class='select-input-container required']");
	private By LeadSubmitButton = By.name("SubmitButton");
	private By VerifyLeadEmail = By.xpath("//*[@ng-if='labelEmail']");
	private By LeadInformationWindow = By.xpath("//*[@class='acc glyphicon glyphicon-chevron-up']");
	private By LeadTelephonyTab = By.xpath("//*[contains(text(),'Telephony Logs')]");
	private By QuickcallRecordingTab = By
			.xpath("(//*[contains(@ng-click,'CTICtrl.dialFromCallLogs(log.calledNumber)')])[1]");
	private By DeleteRecordingTab = By.xpath("(//*[@title='Delete'])[1]");
	private By DeleteConfirmation = By.xpath("//*[@ng-click='confirmModalCtrl.Confirm()']");
	private By DeleteRecordingSuccessmsg = By.xpath("//*[text()='Recording deleted successfully.']");
	private By PlayRecording = By.xpath("(//*[@title='Play'])[1]");
	private By PlayrecoringValidation = By.xpath("//*[@class='recordingAudioElement show']");
	private By RecordingTime = By.xpath("(//*[@class='time-cont']//u[@class='ng-binding drag-not-allowed'])[1]");
	private By DownloadRecording = By.xpath("//*[@class='RecordingsActions show']//*[@title='Download']");
	private By Myprofile = By.xpath("//*[@ng-click='naavigateToMyProfile()']");
	private By L_ProfileSetting = By.xpath("//*[@title='Profile Settings']");
	private By L_AllAvailbleProfile = By.xpath("//h3[normalize-space()='All Available Profiles']");
	private By L_AllAvailbleProfileEdit = By.xpath("//i[@title='Edit']");
	private By L_Update = By.xpath("	//*[normalize-space()='Update']");
	private By L_ProfileNameField = By.xpath(
			"//div[@class='voice-call-window-content voice-call-signin available-connect voice-edit-profile']//input[@placeholder='Profile Name']");
	private By L_CallScriptspopup = By.xpath("//*[@data-ng-click='minimizePopup()']");
	private By L_CallScriptspopupCancel = By.name("Cancel");
	private By Call_Logs = By.xpath("//a[@title='Call Logs']");
	private By Input_Num = By.xpath("//*[contains(@ng-keyup,'CTICtrl.searchLogs')][contains(@ng-keyup,'CALLLOGS')]");
	private By call_logs = By.xpath("(//b[@class='message-heading cti-name'])[1]");
	private By Errormsg = By.xpath("//*[text()='Unable to connect the call. Please try again']");
	private By L_OkayButton = By.xpath("//*[contains(text(),'Ok')]//parent::button");
	private By L_Homepage = By.xpath("//*[@href='/#/home']");
	private By Agents = By.xpath("//md-tab-item[@role='tab']//span[@class='ng-scope'][normalize-space()='Agents']");
	private By FirstRowFromTable = By.xpath("(//*[@ng-click='grid.appScope.navigateToCallDetails(row.entity);'])[1]//a");
	private By CalltypeTransferedcall = By.xpath("(//h5[contains(text(),'Call Type')]//parent::div//md-checkbox)[4]");

	public void waitForElement(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public void login_CE_validations() throws InterruptedException {
		waitForElement(1000);
		WebElement checkUserLoginElement = null;

		try {
			checkUserLoginElement = driver.findElement(CheckUserLogin);

			if (checkUserLoginElement.isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login is successful");
			}
		} catch (NoSuchElementException e) {
			ExtentSuccessMessage(
					"CheckUserLogin element not found! So you currently Dont have an active session on another device, hence Login is successful");
		} catch (Exception e) {
			ExtentSuccessMessage("Application login inaccurate. Details: " + e.getMessage());
			e.printStackTrace();
		}
		waitForElement(15000);
	}

	public void logout_CE_validations() throws InterruptedException {
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed");
		waitForElement(5000);
		driver.manage().deleteAllCookies();
		waitForElement(3000);
	}

	public void validate_CallBack_Popup() throws InterruptedException, IOException {
		fetchNumber1();
		new_Tab();
		login_SecondUser_CallBack();
		login_CE_validations();
		call_FirstUser();
		TabSwitchToParent();
		validate_Callback_popup();
	}

	public void login_SecondUser_CallBack() throws InterruptedException, IOException {

		waitForElement(1000);
		String Url = configloader().getProperty("URL");
		String jenkinsUrl = System.getProperty("URL");
		if (jenkinsUrl != null && !jenkinsUrl.isEmpty()) {
			Url = jenkinsUrl;
		}
		waitForElement(1000);
		String username = configloader().getProperty("PLCA_SecondUser");
		String pswd = configloader().getProperty("PLCA_SecondPassword");
		waitForElement(1000);
		driver.get(Url);
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Broker Engage Username field");
		writeText(userID, username);
		ExtentSuccessMessage("Entered the Broker Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Broker Engage password field");
		writeText(pwd, pswd);
		ExtentSuccessMessage("Entered the Broker Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		waitForElement(4000);
		ExtentSuccessMessage("Logged into the Receiver Side");
	}

	public void validate_callDisconnect_Disposition() throws InterruptedException, IOException {
		fetchNumber1();
		new_Tab();
		login_SecondUser_CallDisconnected();
		login_CE_validations();
		call_FirstUser();
		TabSwitchToParent();
		validate_disposition_Popup();
		TabSwitchToChild();
		logout_CE_validations();
		TabSwitchToParent();
	}

	public void validate_notASale_Disposition() throws InterruptedException, IOException {

		fetchNumber1();
		new_Tab();
		login_SecondUser_NotASale();
		login_CE_validations();
		call_FirstUser();
		TabSwitchToParent();
		validate_Disposition_Popup();
		TabSwitchToChild();
		logout_CE_validations();
		TabSwitchToParent();
	}

	public void validate_Disposition_Popup() throws InterruptedException {

		By OwnerName = By.xpath("//span[@class='profile-name drag-not-allowed ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(OwnerName));
		String nameofowner = element.getText();
		System.out.println(nameofowner);

		waitForElement(2000);
		By AcceptCall = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been accepted");

		waitForElement(5000);
		By DispositionPopup = By.xpath("//div[@id='draggable-CTI-quickLead-window']");
		Assert.assertTrue(driver.findElement(DispositionPopup).isDisplayed());
		ExtentSuccessMessage("Disposition popup is visible");

		waitForElement(4000);
		By CallDecline = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDecline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on end call");

		String lastname = "Lead" + getRandomNumber();
		System.out.println(lastname);

		waitForElement(3000);
		if (driver.findElement(DispositionPopup).isDisplayed()) {
			waitForElement(2000);
			Assert.assertTrue(driver.findElement(By.xpath("//button[@name='NotASale']")).isDisplayed());
			ExtentSuccessMessage("Call disconnect Button is displayed");

			By LeadName = By.xpath("//input[@name='LeadFirstName']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadName));
			MoveToElementClick(element);
			String name = "Auto";
			writeText(LeadName, name);

			By LeadLastName = By.xpath("//input[@name='LeadLastName']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadLastName));
			MoveToElementClick(element);
			writeText(LeadLastName, lastname);

			waitForElement(2000);
			By NotASale = By.xpath("//button[@name='NotASale']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(NotASale));
			MoveToElementClick(element);
			ExtentSuccessMessage("Not a sale button is clicked");

		}

		waitForElement(5000);
		By CustomerNameLeadSection = By.xpath("(//div[@class='col-xs-12 col-sm-12 col-md-6 col-lg-6'])[1]/span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomerNameLeadSection));
		String name = element.getText();
		System.out.println(name);

		String namestring = StringUtils.substringAfter(name, " ");
		System.out.println(namestring);

		waitForElement(2000);
		Assert.assertEquals(namestring, lastname);
		ExtentSuccessMessage("Assertion for name is done");

		By Status = By.xpath("//li[@class='nav-item user-details']/span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Status));
		String status = element.getText();
		System.out.println(status);

		waitForElement(2000);
		Assert.assertEquals(status, "Rejected");
		ExtentSuccessMessage("Assertion for Status is done and Status is :-" + status);

		By OwnerNameAfterLeadCreation = By.xpath("(//div[@class='col-xs-12 col-sm-12 col-md-6 col-lg-6'])[14]/span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(OwnerNameAfterLeadCreation));
		String ownernameafterlead = element.getText();
		System.out.println(ownernameafterlead);

		waitForElement(2000);
		Assert.assertEquals(ownernameafterlead, nameofowner);
		ExtentSuccessMessage("Name of owner has been Validate");

		By EditLead = By.xpath("//i[@class='btn fa fa-pencil ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EditLead));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Edit Lead");

		waitForElement(4000);
		WebElement HRCADD = driver.findElement(By.xpath("//select[@name='HRACompleted']"));
		Select s = new Select(HRCADD);
		s.selectByVisibleText("Yes");
		ExtentSuccessMessage("HRCA DD is selected");

		waitForElement(2000);
		WebElement salestype = driver.findElement(By.xpath("//select[@name='SaleType']"));
		Select s1 = new Select(salestype);
		s1.selectByVisibleText("New");
		ExtentSuccessMessage("Sales DD is selected");

		waitForElement(2000);
		By ContactInfo = By.cssSelector(
				"#page-wrapper > div > ui-view > div:nth-child(3) > div.col-xl-9.col-lg-6.left-section.details > div:nth-child(2) > ng-include > div > div.col-md-12.pull-left > form > div.accordions > div:nth-child(3) > div > i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContactInfo));
		MoveToElementClick(element);
		ExtentSuccessMessage("Contact Information has been clicked");

		By LeadMobileNumber = By.xpath("//input[@name='LeadMobile']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadMobileNumber));
		element.clear();
		MoveToElementClick(element);
		writeText(LeadMobileNumber, "1111111111");
		ExtentSuccessMessage("Number has been edited");

		By SaveButton = By.xpath("(//button[@class='btn btn-default green'])[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SaveButton));
		MoveToElementClick(element);

	}

	public void validate_disposition_Popup() throws InterruptedException {

		By OwnerName = By.xpath("//span[@class='profile-name drag-not-allowed ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(OwnerName));
		String nameofowner = element.getText();
		System.out.println(nameofowner);

		waitForElement(2000);
		By AcceptCall = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been accepted");

		waitForElement(5000);
		By DispositionPopup = By.xpath("//div[@id='draggable-CTI-quickLead-window']");
		waitVisibility(DispositionPopup);
		Assert.assertTrue(driver.findElement(DispositionPopup).isDisplayed());
		ExtentSuccessMessage("Disposition popup is visible");

		waitForElement(5000);
		TabSwitchToChild();
		By CallDecline = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDecline));
		MoveToElementClick(element);
		TabSwitchToParent();
		String lastname = "Lead" + getRandomNumber();
		System.out.println(lastname);

		waitForElement(3000);
		if (driver.findElement(DispositionPopup).isDisplayed()) {

			waitForElement(3000);
			By MinimizeButton = By.xpath("//a[@class='acc fa fa-window-minimize popup-btns']");
			Assert.assertTrue(driver.findElement(MinimizeButton).isDisplayed());
			ExtentSuccessMessage("Assertion for Minimize button is done");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(MinimizeButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Minimize button has been clicked");

			waitForElement(3000);
			By MaximizeButton = By.xpath("//a[@class='voice-call-green-button-small fa fa-window-maximize']");
			Assert.assertTrue(driver.findElement(MaximizeButton).isDisplayed());
			ExtentSuccessMessage("Assertion for Minimize button is done");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(MaximizeButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Maximize button has been clicked");

			waitForElement(2000);
			Assert.assertTrue(driver.findElement(By.xpath("//button[@name='CallDisconnected']")).isDisplayed());
			ExtentSuccessMessage("Call disconnect Button is displayed");

			By LeadName = By.xpath("//input[@name='LeadFirstName']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadName));
			MoveToElementClick(element);
			String name = "Auto";
			writeText(LeadName, name);

			By LeadLastName = By.xpath("//input[@name='LeadLastName']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadLastName));
			MoveToElementClick(element);
			writeText(LeadLastName, lastname);

			waitForElement(2000);
			By CallNotConnectedButton = By.xpath("//button[@name='CallDisconnected']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallNotConnectedButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Call not connected button is clicked");

		}

		waitForElement(6000);

		By CustomerNameLeadSection = By.xpath("(//div[@class='col-xs-12 col-sm-12 col-md-6 col-lg-6'])[1]/span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomerNameLeadSection));
		String name = element.getText();
		System.out.println(name);

		String namestring = StringUtils.substringAfter(name, " ");
		System.out.println(namestring);

		waitForElement(2000);
		Assert.assertEquals(namestring, lastname);
		ExtentSuccessMessage("Assertion for name is done");

		By Status = By.xpath("//li[@class='nav-item user-details']/span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Status));
		String status = element.getText();
		System.out.println(status);

		waitForElement(2000);
		Assert.assertEquals(status, "Unqualified");
		ExtentSuccessMessage("Assertion for Status is done and Status is :-" + status);

		/*
		 * By SalesBreadCrumb = By.xpath("//a[contains(.,'Sales - Leads')]"); element =
		 * wait.until(ExpectedConditions.presenceOfElementLocated(SalesBreadCrumb));
		 * MoveToElementClick(element);
		 * 
		 * waitForElement(6000); By InputField = By.
		 * xpath("//input[@class='ng-valid md-input ng-valid-required ng-valid-minlength ng-valid-maxlength ng-dirty ng-valid-parse ng-empty ng-touched']"
		 * ); element =
		 * wait.until(ExpectedConditions.presenceOfElementLocated(InputField));
		 * MoveToElementClick(element); writeText(InputField,lastname + Keys.ENTER);
		 * ExtentSuccessMessage("Lead has been Searched");
		 * 
		 * 
		 * waitForElement(4000); By DispositionStatus =
		 * By.xpath("(//div[@class='ui-grid-cell-contents ng-binding ng-scope'])[5]");
		 * element =
		 * wait.until(ExpectedConditions.presenceOfElementLocated(DispositionStatus));
		 * String dispostatus=element.getText(); System.out.println(dispostatus);
		 * 
		 * 
		 * Assert.assertEquals(dispostatus, "Call Disconnected");
		 * ExtentSuccessMessage("Status has been validated");
		 * 
		 * By Lead =
		 * By.xpath("//div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-012H']/div/a"
		 * ); element = wait.until(ExpectedConditions.presenceOfElementLocated(Lead));
		 * MoveToElementClick(element); ExtentSuccessMessage("Lead has been created");
		 */

		waitForElement(3000);
		By EditLead = By.xpath("//i[@class='btn fa fa-pencil ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EditLead));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Edit Lead");

		waitForElement(4000);
		WebElement HRCADD = driver.findElement(By.xpath("//select[@name='HRACompleted']"));
		Select s = new Select(HRCADD);
		s.selectByVisibleText("Yes");
		ExtentSuccessMessage("HRCA DD is selected");

		waitForElement(2000);
		WebElement salestype = driver.findElement(By.xpath("//select[@name='SaleType']"));
		Select s1 = new Select(salestype);
		s1.selectByVisibleText("New");
		ExtentSuccessMessage("Sales DD is selected");

		waitForElement(2000);
		By ContactInfo = By.cssSelector(
				"#page-wrapper > div > ui-view > div:nth-child(3) > div.col-xl-9.col-lg-6.left-section.details > div:nth-child(2) > ng-include > div > div.col-md-12.pull-left > form > div.accordions > div:nth-child(3) > div > i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContactInfo));
		MoveToElementClick(element);
		ExtentSuccessMessage("Contact Information has been clicked");

		By LeadMobileNumber = By.xpath("//input[@name='LeadMobile']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadMobileNumber));
		element.clear();
		MoveToElementClick(element);
		writeText(LeadMobileNumber, "1111111111");
		ExtentSuccessMessage("Number has been edited");

		By SaveButton = By.xpath("(//button[@class='btn btn-default green'])[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SaveButton));
		MoveToElementClick(element);
	}

	public void login_SecondUser_NotASale() throws InterruptedException, IOException {

		waitForElement(1000);
		String Url = configloader().getProperty("URL");
		String jenkinsUrl = System.getProperty("URL");
		if (jenkinsUrl != null && !jenkinsUrl.isEmpty()) {
			Url = jenkinsUrl;
		}
		waitForElement(1000);
		String username = configloader().getProperty("PLCA_SecondUser");
		String pswd = configloader().getProperty("PLCA_SecondPassword");
		waitForElement(1000);
		driver.get(Url);
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Broker Engage Username field");
		writeText(userID, username);
		ExtentSuccessMessage("Entered the Broker Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Broker Engage password field");
		writeText(pwd, pswd);
		ExtentSuccessMessage("Entered the Broker Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		waitForElement(4000);
		ExtentSuccessMessage("Logged into the Receiver Side");

	}

	public void login_SecondUser_CallDisconnected() throws InterruptedException, IOException {

		waitForElement(1000);
		String Url = configloader().getProperty("URL");
		String jenkinsUrl = System.getProperty("URL");
		if (jenkinsUrl != null && !jenkinsUrl.isEmpty()) {
			Url = jenkinsUrl;
		}
		waitForElement(1000);
		String username = configloader().getProperty("PLCA_SecondUser");
		String pswd = configloader().getProperty("PLCA_SecondPassword");
		waitForElement(1000);
		driver.get(Url);
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Broker Engage Username field");
		writeText(userID, username);
		ExtentSuccessMessage("Entered the Broker Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Broker Engage password field");
		writeText(pwd, pswd);
		ExtentSuccessMessage("Entered the Broker Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		waitForElement(4000);
		ExtentSuccessMessage("Logged into the Receiver Side");
	}

	public void validate_DispositionPopup_Transfer() throws InterruptedException, IOException {
		fetchNumber1();
		new_Tab();
		login_SecondUser_TransferCall();
		login_CE_validations();
		fetchNumber3();
		new_Tab();
		login_ThirdUser_TransferCall();
		login_CE_validations();
		fetchNumber2();
		call_FirstUser();
		TabSwitchToChild();
		transfer_Call();
		TabSwitchToParent();
		transfer_Disposition();
		logout_CE_validations();
		TabSwitchToChild();
		logout_CE_validations();
		TabSwitchToThirdWindow();

	}

	public void validate_Callback_popup() throws InterruptedException {

		By OwnerName = By.xpath("//span[@class='profile-name drag-not-allowed ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(OwnerName));
		String nameofowner = element.getText();
		System.out.println(nameofowner);

		waitForElement(2000);
		By AcceptCall = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been accepted");

		waitForElement(8000);
		By DispositionPopup = By.xpath("//div[@id='draggable-CTI-quickLead-window']");
		Assert.assertTrue(driver.findElement(DispositionPopup).isDisplayed());
		ExtentSuccessMessage("Disposition popup is visible");

		waitForElement(4000);
		By CallDecline = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDecline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on end call");

		String lastname = "Lead" + getRandomNumber();
		System.out.println(lastname);

		waitForElement(3000);
		if (driver.findElement(DispositionPopup).isDisplayed()) {

			waitForElement(2000);
			Assert.assertTrue(driver.findElement(By.xpath("//button[@name='ViewCallBack']")).isDisplayed());
			ExtentSuccessMessage("Call disconnect Button is displayed");

			By LeadName = By.xpath("//input[@name='LeadFirstName']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadName));
			MoveToElementClick(element);
			String name = "Auto";
			writeText(LeadName, name);

			By LeadLastName = By.xpath("//input[@name='LeadLastName']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadLastName));
			MoveToElementClick(element);
			writeText(LeadLastName, lastname);

			waitForElement(2000);
			By CallBack = By.xpath("//button[@name='ViewCallBack']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallBack));
			MoveToElementClick(element);
			ExtentSuccessMessage("Not a sale button is clicked");

			waitForElement(2000);
			By CallBackCalendar = By.xpath("//div[@id='date']/input");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallBackCalendar));
			MoveToElementClick(element);
			By Date = By.xpath("(//td[@class='day active']/following-sibling::td)[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Date));
			MoveToElementClick(element);

			ExtentSuccessMessage("Call Back button has been clicked");

			waitForElement(2000);
			By CallBackConfirm = By.xpath("//i[@class='fa fa-check']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallBackConfirm));
			MoveToElementClick(element);
			ExtentSuccessMessage("Date has been selected");

		}

		waitForElement(7000);
		By CustomerNameLeadSection = By.xpath("(//div[@class='col-xs-12 col-sm-12 col-md-6 col-lg-6'])[1]/span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomerNameLeadSection));
		String name = element.getText();
		System.out.println(name);

		String namestring = StringUtils.substringAfter(name, " ");
		System.out.println(namestring);

		waitForElement(2000);
		Assert.assertEquals(namestring, lastname);
		ExtentSuccessMessage("Assertion for name is done");

		By Status = By.xpath("//li[@class='nav-item user-details']/span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Status));
		String status = element.getText();
		System.out.println(status);

		waitForElement(2000);
		Assert.assertEquals(status, "Qualified");
		ExtentSuccessMessage("Assertion for Status is done and Status is :-" + status);

		By OwnerNameAfterLeadCreation = By.xpath("(//div[@class='col-xs-12 col-sm-12 col-md-6 col-lg-6'])[14]/span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(OwnerNameAfterLeadCreation));
		String ownernameafterlead = element.getText();
		System.out.println(ownernameafterlead);

		waitForElement(2000);
		Assert.assertEquals(ownernameafterlead, nameofowner);
		ExtentSuccessMessage("Name of owner has been Validate");

		waitForElement(4000);
		By Task = By.xpath("(//i[@class='fa fa-calendar'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Task));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Task section");

		waitForElement(3000);
		By TaskCreated = By.xpath("//div[@id='fixed']");
		Assert.assertTrue(driver.findElement(TaskCreated).isDisplayed());
		ExtentSuccessMessage("Task is been created and visible under Task Section");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TaskCreated));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Task which is been created");

		waitForElement(3000);
		By Dashboard = By.xpath("//a[@id='menu_Dashboard']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Dashboard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Dashboard");

		waitForElement(2000);
		By MyTask = By.xpath("//a[@id='submenu_MyTasks']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MyTask));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on MyTask");

		waitForElement(10000);
		By TaskList = By.xpath("//div[@class='task-list']");
		Assert.assertTrue(driver.findElement(TaskList).isDisplayed());

		By Task1 = By.xpath("//div[@class='task-caller']");
		wait.until(ExpectedConditions.elementToBeClickable(Task1));
		click(Task1);

		waitForElement(4000);
		By EditLead = By.xpath("//i[@class='btn fa fa-pencil ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EditLead));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Edit Lead");

		waitForElement(4000);
		WebElement HRCADD = driver.findElement(By.xpath("//select[@name='HRACompleted']"));
		Select s = new Select(HRCADD);
		s.selectByVisibleText("Yes");
		ExtentSuccessMessage("HRCA DD is selected");

		waitForElement(2000);
		WebElement salestype = driver.findElement(By.xpath("//select[@name='SaleType']"));
		Select s1 = new Select(salestype);
		s1.selectByVisibleText("New");
		ExtentSuccessMessage("Sales DD is selected");

		waitForElement(2000);
		By ContactInfo = By.cssSelector(
				"#page-wrapper > div > ui-view > div:nth-child(3) > div.col-xl-9.col-lg-6.left-section.details > div:nth-child(2) > ng-include > div > div.col-md-12.pull-left > form > div.accordions > div:nth-child(3) > div > i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContactInfo));
		MoveToElementClick(element);
		ExtentSuccessMessage("Contact Information has been clicked");

		By LeadMobileNumber = By.xpath("//input[@name='LeadMobile']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadMobileNumber));
		element.clear();
		MoveToElementClick(element);
		writeText(LeadMobileNumber, "1111111111");
		ExtentSuccessMessage("Number has been edited");

		By SaveButton = By.xpath("(//button[@class='btn btn-default green'])[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SaveButton));
		MoveToElementClick(element);
	}

	public void transfer_Disposition() throws InterruptedException {

		waitForElement(3000);
		By FirstUserNumber = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-incoming-window > div.voice-call-ongoing-number > span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FirstUserNumber));
		String firstno = element.getText();
		System.out.println(firstno);

		Assert.assertEquals(secondnumber, firstno);
		ExtentSuccessMessage("First Number is bee displayed in CTI console");

		waitForElement(2000);
		By AcceptButton = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been acepted by third user");

		TabSwitchToChild();
		waitForElement(2000);
		By WarmTransfer = By
				.xpath("//button[@class='voice-call-green-button-small fa fa-phone fa fa-code-fork blue-bg']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(WarmTransfer));
		MoveToElementClick(element);
		TabSwitchToThirdWindow();
		waitForElement(2000);
		By CallDecline = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDecline));
		MoveToElementClick(element);
		TabSwitchToParent();

		waitForElement(8000);
		By CallDispoPopup = By.xpath(
				"//div[@class='voice-call-window call-list-window callgroup-list quick-lead-popup tc-leadpop ng-scope switchtoTopMost']");
		waitForElement(1000);
		Assert.assertTrue(driver.findElement(CallDispoPopup).isDisplayed());
		ExtentSuccessMessage("Call disposition popup is displayed");

		String lastname = "Lead" + getRandomNumber();
		System.out.println(lastname);

		waitForElement(3000);
		if (driver.findElement(CallDispoPopup).isDisplayed()) {
			waitForElement(2000);
			Assert.assertTrue(driver.findElement(By.xpath("//button[@name='CallDisconnected']")).isDisplayed());
			ExtentSuccessMessage("Call disconnect Button is displayed");

			By LeadName = By.xpath("//input[@name='LeadFirstName']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadName));
			MoveToElementClick(element);
			String name = "Auto";
			writeText(LeadName, name);

			By LeadLastName = By.xpath("//input[@name='LeadLastName']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadLastName));
			MoveToElementClick(element);
			writeText(LeadLastName, lastname);

			waitForElement(2000);
			By CallNotConnectedButton = By.xpath("//button[@name='CallDisconnected']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallNotConnectedButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Call not connected button is clicked");

		} else {
			ExtentSuccessMessage("Disposition popup is not visible");
		}

		waitForElement(6000);

		By CustomerNameLeadSection = By.xpath("(//div[@class='col-xs-12 col-sm-12 col-md-6 col-lg-6'])[1]/span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomerNameLeadSection));
		String name = element.getText();
		System.out.println(name);

		String namestring = StringUtils.substringAfter(name, " ");
		System.out.println(namestring);

		waitForElement(2000);
		Assert.assertEquals(namestring, lastname);
		ExtentSuccessMessage("Assertion for name is done");

		By Status = By.xpath("//li[@class='nav-item user-details']/span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Status));
		String status = element.getText();
		System.out.println(status);

		waitForElement(2000);
		Assert.assertEquals(status, "Unqualified");
		ExtentSuccessMessage("Assertion for Status is done and Status is :-" + status);

		waitForElement(3000);
		By EditLead = By.xpath("//i[@class='btn fa fa-pencil ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EditLead));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Edit Lead");

		waitForElement(4000);
		WebElement HRCADD = driver.findElement(By.xpath("//select[@name='HRACompleted']"));
		Select s = new Select(HRCADD);
		s.selectByVisibleText("Yes");
		ExtentSuccessMessage("HRCA DD is selected");

		waitForElement(2000);
		WebElement salestype = driver.findElement(By.xpath("//select[@name='SaleType']"));
		Select s1 = new Select(salestype);
		s1.selectByVisibleText("New");
		ExtentSuccessMessage("Sales DD is selected");

		waitForElement(2000);
		By ContactInfo = By.cssSelector(
				"#page-wrapper > div > ui-view > div:nth-child(3) > div.col-xl-9.col-lg-6.left-section.details > div:nth-child(2) > ng-include > div > div.col-md-12.pull-left > form > div.accordions > div:nth-child(3) > div > i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContactInfo));
		MoveToElementClick(element);
		ExtentSuccessMessage("Contact Information has been clicked");

		By LeadMobileNumber = By.xpath("//input[@name='LeadMobile']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadMobileNumber));
		element.clear();
		MoveToElementClick(element);
		writeText(LeadMobileNumber, "1111111111");
		ExtentSuccessMessage("Number has been edited");

		By SaveButton = By.xpath("(//button[@class='btn btn-default green'])[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SaveButton));
		MoveToElementClick(element);
	}

	public void transfer_Call() throws InterruptedException {

		waitForElement(2000);
		By CallAccept = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAccept));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been accepted from second user");

		waitForElement(7000);
		By MinimizeButton = By.xpath("//a[@class='acc fa fa-window-minimize popup-btns']");
		Assert.assertTrue(driver.findElement(MinimizeButton).isDisplayed());
		ExtentSuccessMessage("Assertion for Minimize button is done");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MinimizeButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Minimize button has been clicked");

		waitForElement(2000);
		By TransferCallButton = By.xpath("//i[@class=' fa fa-calls-transfer ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferCallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on call transfer button");

		waitForElement(5000);
		By TransferWindow = By.xpath("//div[@id='draggable-CTI-users-window']");
		Assert.assertTrue(driver.findElement(TransferWindow).isDisplayed());
		ExtentSuccessMessage("Clicked on call transfer button");

		if (driver.findElement(TransferWindow).isDisplayed()) {

			waitForElement(3000);
			By AgentSection = By.xpath("(//md-tab-item[@class='md-tab ng-scope ng-isolate-scope md-ink-ripple'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentSection));
			MoveToElementClick(element);
			ExtentSuccessMessage("Clicked on agent tab in transfer call popup");

			waitForElement(3000);
			By NPNUser = By.xpath("//span[@title='NPNTesttwo Usertwo']/parent::*/button");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(NPNUser));
			MoveToElementClick(element);
			ExtentSuccessMessage("Clicked on CEuserone Agent in Popup");

		}

		else {
			ExtentSuccessMessage("Transfer Call Popup is not visible");
		}

	}

	public void call_FirstUser() throws InterruptedException {
		waitForElement(2000);
		By CTIInputField = By.xpath(
				"//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");

		// String CEUserValidNumber = thirdnumber ;
		String CEUserValidNumber = firstnumber;
		writeText(CTIInputField, CEUserValidNumber);
		ExtentSuccessMessage("Number has been in input field" + CEUserValidNumber);

		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");
		Thread.sleep(3000);

		time = CurrentTime();
		System.out.println(time);

	}

	public void NavigateToMyProfile() throws InterruptedException {
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Myprofile));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on my profile option");
		waitForElement(5000);
		// driver.manage().deleteAllCookies();
		waitForElement(3000);
	}

	public void validate_DispositionPopup_Transfer_Outbound() throws InterruptedException, IOException {
		fetchNumber1();
		new_Tab();
		login_SecondUser_TransferCall();
		login_CE_validations();
		fetchNumber3();
		new_Tab();
		maximizeWindow();
		login_ThirdUser_TransferCall();
		login_CE_validations();
		fetchNumber2();
		outbound_CallValidation();
		logout_CE_validations();
		TabSwitchToChild();
		logout_CE_validations();
		TabSwitchToThirdWindow();
	}

	public void outbound_CallValidation() throws InterruptedException {
		TabSwitchToChild();
		waitForElement(2000);
		By CTIInputField = By.xpath(
				"//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");

		String CEUserValidNumber = secondnumber;
		writeText(CTIInputField, CEUserValidNumber);
		ExtentSuccessMessage("Number has been in input field" + CEUserValidNumber);

		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");
		Thread.sleep(3000);

		time = CurrentTime();
		System.out.println(time);
		TabSwitchToThirdWindow();

		waitForElement(4000);
		By ThirdUserNumber = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-incoming-window > div.voice-call-ongoing-number > span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ThirdUserNumber));
		String firstno = element.getText();
		System.out.println(firstno);
		Assert.assertEquals(thirdnumber, firstno);
		ExtentSuccessMessage("First user number is been displayed after calling at third user");

		waitForElement(2000);
		By CallAccept = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAccept));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been accepted from third user and call is connected");

		TabSwitchToChild();
		waitForElement(2000);
		By TransferCallButton = By.xpath("//i[@class=' fa fa-calls-transfer ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferCallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on call transfer button");

		waitForElement(5000);
		By TransferWindow = By.xpath("//div[@id='draggable-CTI-users-window']");
		Assert.assertTrue(driver.findElement(TransferWindow).isDisplayed());
		ExtentSuccessMessage("Clicked on call transfer button");

		if (driver.findElement(TransferWindow).isDisplayed()) {

			waitForElement(3000);
			By AgentSection = By.xpath("(//md-tab-item[@class='md-tab ng-scope ng-isolate-scope md-ink-ripple'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentSection));
			MoveToElementClick(element);
			ExtentSuccessMessage("Clicked on agent tab in transfer call popup");

			waitForElement(3000);
			By NPNTest = By.xpath("//span[@title='NPNTesttwo Usertwo']/parent::*/button");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(NPNTest));
			MoveToElementClick(element);
			ExtentSuccessMessage("Clicked on CEuserone Agent in Popup");

		}

		else {
			ExtentSuccessMessage("Transfer Call Popup is not visible");
		}

		TabSwitchToParent();
		waitForElement(2000);
		By FirstUserNumber = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-incoming-window > div.voice-call-ongoing-number > span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FirstUserNumber));
		String firstno1 = element.getText();
		System.out.println(firstno1);

		Assert.assertEquals(secondnumber, firstno1);
		ExtentSuccessMessage("First Number is been displayed in CTI console");

		waitForElement(1000);
		By AcceptButton = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been acepted by third user");

		TabSwitchToChild();
		waitForElement(2000);
		By WarmTransfer = By
				.xpath("//button[@class='voice-call-green-button-small fa fa-phone fa fa-code-fork blue-bg']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(WarmTransfer));
		MoveToElementClick(element);
		TabSwitchToThirdWindow();
		waitForElement(1000);
		By CallDecline = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDecline));
		MoveToElementClick(element);
		TabSwitchToParent();

		waitForElement(5000);
		By CallDispoPopup = By.xpath("//div[@id='draggable-CTI-quickLead-window']");
		Assert.assertTrue(driver.findElement(CallDispoPopup).isDisplayed());
		ExtentSuccessMessage("Call disposition popup is displayed");

		String lastname = "Lead" + getRandomNumber();
		System.out.println(lastname);

		waitForElement(3000);
		if (driver.findElement(CallDispoPopup).isDisplayed()) {

			waitForElement(2000);
			Assert.assertTrue(driver.findElement(By.xpath("//button[@name='CallDisconnected']")).isDisplayed());
			ExtentSuccessMessage("Call disconnect Button is displayed");

			By LeadName = By.xpath("//input[@name='LeadFirstName']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadName));
			MoveToElementClick(element);
			String name = "Auto";
			writeText(LeadName, name);

			By LeadLastName = By.xpath("//input[@name='LeadLastName']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadLastName));
			MoveToElementClick(element);
			writeText(LeadLastName, lastname);

			waitForElement(2000);
			By CallNotConnectedButton = By.xpath("//button[@name='CallDisconnected']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallNotConnectedButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Call not connected button is clicked");

		} else {
			ExtentSuccessMessage("Disposition popup is not visible");
		}

		waitForElement(6000);

		By CustomerNameLeadSection = By.xpath("(//div[@class='col-xs-12 col-sm-12 col-md-6 col-lg-6'])[1]/span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomerNameLeadSection));
		String name = element.getText();
		System.out.println(name);

		String namestring = StringUtils.substringAfter(name, " ");
		System.out.println(namestring);

		waitForElement(2000);
		Assert.assertEquals(namestring, lastname);
		ExtentSuccessMessage("Assertion for name is done");

		By Number = By.xpath("//a[@ng-if='labelPhone']/cti-call-btn");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Number));
		String number = element.getText();
		System.out.println(number);

		Assert.assertEquals(number, secondnumber);
		ExtentSuccessMessage("Assertion for number is done and outbound user number is visible");

		By Status = By.xpath("//li[@class='nav-item user-details']/span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Status));
		String status = element.getText();
		System.out.println(status);

		waitForElement(2000);
		Assert.assertEquals(status, "Unqualified");
		ExtentSuccessMessage("Assertion for Status is done and Status is :-" + status);

		waitForElement(3000);
		By EditLead = By.xpath("//i[@class='btn fa fa-pencil ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EditLead));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Edit Lead");

		waitForElement(4000);
		WebElement HRCADD = driver.findElement(By.xpath("//select[@name='HRACompleted']"));
		Select s = new Select(HRCADD);
		s.selectByVisibleText("Yes");
		ExtentSuccessMessage("HRCA DD is selected");

		waitForElement(2000);
		WebElement salestype = driver.findElement(By.xpath("//select[@name='SaleType']"));
		Select s1 = new Select(salestype);
		s1.selectByVisibleText("New");
		ExtentSuccessMessage("Sales DD is selected");

		waitForElement(2000);
		By ContactInfo = By.cssSelector(
				"#page-wrapper > div > ui-view > div:nth-child(3) > div.col-xl-9.col-lg-6.left-section.details > div:nth-child(2) > ng-include > div > div.col-md-12.pull-left > form > div.accordions > div:nth-child(3) > div > i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContactInfo));
		MoveToElementClick(element);
		ExtentSuccessMessage("Contact Information has been clicked");

		By LeadMobileNumber = By.xpath("//input[@name='LeadMobile']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadMobileNumber));
		element.clear();
		MoveToElementClick(element);
		writeText(LeadMobileNumber, "1111111111");
		ExtentSuccessMessage("Number has been edited");

		By SaveButton = By.xpath("(//button[@class='btn btn-default green'])[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SaveButton));
		MoveToElementClick(element);

	}

	public void login_ThirdUser_TransferCall() throws InterruptedException, IOException {

		waitForElement(1000);
		String Url = configloader().getProperty("URL2");
		String jenkinsUrl = System.getProperty("URL2");
		if (jenkinsUrl != null && !jenkinsUrl.isEmpty()) {
			Url = jenkinsUrl;
		}
		waitForElement(1000);
		String username = configloader().getProperty("PLCA_ThirdUser");
		String pswd = configloader().getProperty("PLCA_ThirdPassword");
		waitForElement(1000);
		driver.get(Url);
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Broker Engage Username field");
		writeText(userID, username);
		ExtentSuccessMessage("Entered the Broker Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Broker Engage password field");
		writeText(pwd, pswd);
		ExtentSuccessMessage("Entered the Broker Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		waitForElement(4000);
		ExtentSuccessMessage("Logged into the Receiver Side");
	}

	public void login_SecondUser_TransferCall() throws InterruptedException, IOException {

		waitForElement(1000);
		String Url = configloader().getProperty("URL");
		String jenkinsUrl = System.getProperty("URL");
		if (jenkinsUrl != null && !jenkinsUrl.isEmpty()) {
			Url = jenkinsUrl;
		}
		waitForElement(1000);
		String username = configloader().getProperty("PLCA_SecondUser");
		String pswd = configloader().getProperty("PLCA_SecondPassword");
		waitForElement(1000);
		driver.get(Url);
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Broker Engage Username field");
		writeText(userID, username);
		ExtentSuccessMessage("Entered the Broker Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Broker Engage password field");
		writeText(pwd, pswd);
		ExtentSuccessMessage("Entered the Broker Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		waitForElement(4000);
		ExtentSuccessMessage("Logged into the Receiver Side");

	}

	public void CheckProfileStatus() throws InterruptedException {
		waitVisibility(L_ProfileStatus);
		if (ElementDisplayed(L_ProfileStatus)) {
			WebElement checkboElement = driver.findElement(L_ProfileStatus);
			String GetStatus = checkboElement.getAttribute("class");
			Assert.assertEquals(GetStatus, "status AVAILABLE");
			ExtentSuccessMessage("Assertion has been done");
			ExtentSuccessMessage("Successfully user able to See 'Profile Status AS :- ' " + GetStatus);
		} else {
			ExtentErrorMessage(" Profile Status Not visible");
		}
	}

	public void login_ThirdUser() throws InterruptedException, IOException
	{	
		waitForElement(1000);
		String urlCE;
		String currentSystemURL = URL;
        System.out.println(currentSystemURL);
        if (currentSystemURL.contains("https://mme.benefitalign.com")) {
               urlCE = "https://ce-uat.benefitalign.com/mme/#/login";
        } else if (currentSystemURL.contains("https://ce-uat.benefitalign.com/")) {
               urlCE = "https://mme.benefitalign.com/mme/#/login";
        } else if (currentSystemURL.contains("https://ce-qa.benefitalign.com/")) {
               urlCE = "https://ce-uat.benefitalign.com/mme/#/login";
        } else if (currentSystemURL.contains("https://mme.brokerengage.net/")) {
               urlCE = "https://ce-uat.benefitalign.com/mme/#/login";
        } else {
               urlCE = "https://ce-dev.benefitalign.com/#/login";
        }
        driver.get(urlCE);
        String username = configloader().getProperty("PLCA_UserName7");
        String pswd = configloader().getProperty("PLCA_Password7");
        waitForElement(5000);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
        MoveToElementClick(element);
        ExtentSuccessMessage("Clicked on Customer Engage Username field");
        writeText(userID, username);
        ExtentSuccessMessage("Entered the Customer Engage Username");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
        MoveToElementClick(element);
        ExtentSuccessMessage("Clicked on Customer Engage password field");
        writeText(pwd, pswd);
        ExtentSuccessMessage("Entered the Customer Engage Password");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
        MoveToElementClick(element);
        ExtentSuccessMessage("Customer Engage Application Sign-In Done");
        waitForElement(6000);
        try {
               if (driver.findElement(CheckUserLogin).isDisplayed()) {
                     click(CheckUserLogin);
                     ExtentSuccessMessage(
                                   "You currently have an active session on another device hence Deactivated the other session!");
               } else {
                     ExtentSuccessMessage("Login has been successful");
               }
        } catch (Exception e) {
               ExtentSuccessMessage("Applicantion login successful");
        }
        waitForElement(4000);
        ExtentSuccessMessage("Logged into the Receiver Side");
	}
		
	public void CheckProfileStatusforOffline() throws InterruptedException {
		waitVisibility(L_ProfileStatus);
		if (ElementDisplayed(L_ProfileStatus)) {
			WebElement checkboElement = driver.findElement(L_ProfileStatus);
			String GetStatus = checkboElement.getAttribute("class");
			System.out.println(GetStatus);
			Assert.assertEquals(GetStatus, "status OFFLINE");
			ExtentSuccessMessage("Assertion has been done");
		} else {
			ExtentErrorMessage(" Profile Status Not visible");
		}
	}

	public void CheckProfileStatusforOnline() throws InterruptedException {
		waitVisibility(L_ProfileStatus);
		if (ElementDisplayed(L_ProfileStatus)) {
			WebElement checkboElement = driver.findElement(L_ProfileStatus);
			String GetStatus = checkboElement.getAttribute("class");
			System.out.println(GetStatus);
			Assert.assertEquals(GetStatus, "status OFFLINE");
			ExtentSuccessMessage("Assertion has been done");
		} else {
			ExtentErrorMessage(" Profile Status Not visible");
		}
	}

	public void Changed_Status() throws InterruptedException {
		waitForElement(3000);
		By UserIcon = By.xpath("//div[@class='profile-icon ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserIcon));
		MoveToElementClick(element);

		By OfflineStatus = By.xpath("(//span[contains(.,'Offline')])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(OfflineStatus));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on the Offline Buttons");
		By Username = By.xpath("//*[contains(@class,'profile-name')]");
		Username1 = GetElementText(Username);

	}

	public void validate_Offline_Status() throws InterruptedException, IOException {

		new_Tab();
		SecondUser();
		login_CE_validations();
		Changed_Status();
		CheckProfileStatusforOffline();
		TabSwitchToParent();
		Valid_Number();
		TabSwitchToChild();
		offline_Assertion();
		logout_CE_validations();
		TabSwitchToParent();

	}

	public void validate_MissedCall_Throug_UI() throws InterruptedException, IOException {

		new_Tab();
		SecondUser();
		login_CE_validations();
		CheckProfileStatus();
		TabSwitchToParent();
		Valid_Number();
		TabSwitchToChild();
		missed_Call_UI();
		logout_CE_validations();
		TabSwitchToParent();
	}

	public void validate_Missed_CallCount() throws InterruptedException, IOException {

		new_Tab();
		SecondUser();
		login_CE_validations();
		CheckProfileStatus();
		TabSwitchToParent();
		Valid_Number();
		TabSwitchToChild();
		missed_Call_Count();
		logout_CE_validations();
		TabSwitchToParent();

	}

	public void missedCall_Through_Mail() throws InterruptedException, IOException {
		new_Tab();
		SecondUser();
		login_CE_validations();
		CheckProfileStatus();
		TabSwitchToParent();
		Valid_Number();
		TabSwitchToChild();
		missedcall_Through_Mail();
		new_Tab();
		perform_email_validation_for_missedcall();
		TabSwitchToChild();
		logout_CE_validations();
		TabSwitchToParent();
	}

	public void confrence_Call() throws InterruptedException, IOException {
		splitthewindowscreen2("Right");// login ceuserone
		new_Tab();
		SecondUserForConfrence();
		login_CE_validations();
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Left");
		ThirdUser();
		login_CE_validations();
		TabSwitchToParent();
		valid_Number_Confrence();
		TabSwitchToChild();
		Confrence();
		TabSwitchToThirdWindow();
		Confrence_Assertion();
		logout_CE_validations();
		TabSwitchToChild();
		logout_CE_validations();
		TabSwitchToParent();

	}

	public void Onlineconfrence_Call() throws InterruptedException, IOException {
		By UserNumber = By.xpath("//u[@title='Voice Number']");	
		By Username =By.xpath("//*[@class='profile-name drag-not-allowed ng-binding']");
		//splitthewindowscreen2("Right");//login ceuserone
		String Firstusernumber=GetElementText(UserNumber);
		System.out.println(Firstusernumber);
		new_Tab();
		SecondUserForConfrence();
		login_CE_validations();
		waitVisibility(UserNumber);
		String Secondusernumber=GetElementText(UserNumber);
		System.out.println(Secondusernumber);
		String Secondusername=GetElementText(Username);
		System.out.println(Secondusername);		
		new_Window();
		maximizeWindow();
		//splitthewindowscreen2("Left");
		ThirdUser();
		login_CE_validations();	
		RefreshPage();
		waitForElement(18000);
		waitVisibility(UserNumber);
		String Thirdusernumber=GetElementText(UserNumber);
		System.out.println(Thirdusernumber);
		//		TabSwitchToParent();
		CalltoUser(Secondusernumber);
		String Firstusernumbe1=GetElementText(UserNumber);
		System.out.println(Firstusernumbe1);
		TabSwitchToChild();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1=element.getText();
		System.out.println(NumberOutput1);
		//		Assert.assertEquals(NumberOutput1, Firstusernumber);
		Assert.assertEquals(NumberOutput1, Thirdusernumber);
		ExtentSuccessMessage("Assertion has been done");
		//		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		System.out.println("CurrentTime1:-"+Currenttime());
		Thread.sleep(5000);
		ExtentSuccessMessage("Start_TC_CTI_Conference_Online_Admin_CallLogs");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceAddButton));
		MoveToElementClick(element);

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceNumberField));
		MoveToElementClick(element);

		//		writeText(ConfrenceNumberField, Thirdusernumber);
		writeText(ConfrenceNumberField, Firstusernumber);
		//		time = CurrentTime();
		//		System.out.println("Times:-"+time);
		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallConfreanceButton));
		MoveToElementClick(element);

		Thread.sleep(1000);
		Callingtime=Currenttime();
		//		TabSwitchToThirdWindow();
		TabSwitchToParent();
		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UatNumberinQualtia1));
		NumberOutput1 =element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, Thirdusernumber);
		ExtentSuccessMessage("Assertiion has been done for confrence");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		time = Currenttime();
		System.out.println("Times:-"+time);
		Thread.sleep(10000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		TelephonyPage.NavigateToTelephonySetpPage();
		Thread.sleep(15000);

		TelephonyPage.ClickOnCallSMSFAXLogsManagement();
		driver.manage().window().maximize();
		Thread.sleep(25000);

		//		MoveToElementClick(element);
		TelephonyPage.ClickOnCallTypeFilter();
		Thread.sleep(5000);
		click(CalltypeInboundcall);
		Thread.sleep(5000);
		//		TelephonyPage.EnterSearchBar(Firstusernumber);
		TelephonyPage.EnterSearchBar(Thirdusernumber);
		Thread.sleep(5000);
		validateCallLogsTime(time);
		validateMisscalledDetails(Thirdusernumber);
		validateMisscalledDetails(Secondusernumber);
		ClickonFirstRowId();
		Thread.sleep(8000);
		String TodaysDate =Currentdate();

		String Values = (Thirdusernumber+","+Secondusernumber+","+"Incoming Call"+","+"Connected"+","+TodaysDate+","+TodaysDate+" "+Callingtimes+","+TodaysDate+" "+Callingtime+","+"NA"+","+"Not DNC Number"+","+Secondusername.toUpperCase());
		VerifyBasicCAllsDetails(Values);


		//splitthewindowscreen2("Right");
		ExtentSuccessMessage("End_TC_CTI_Conference_Online_Admin_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");
		ExtentSuccessMessage("Start_TC_CTI_Conference_Online_CTI_CallLogs");
		HomePage.ClickedOnMaximiseDiller();
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Logs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call Logs icon has been clicked");
		waitForElement(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_Num));
		MoveToElementClick(element);
		writeText(Input_Num,Firstusernumber + Keys.ENTER);
		waitForElement(2000);
		if(ElementDisplayed(call_logs)) {
			waitForElement(3000);
			System.out.println(time);
			validateCTICallLogsTime(time);			
			ExtentSuccessMessage("Full Number Assertion Done");
		}
		ExtentSuccessMessage("End_TC_CTI_Conference_Online_CTI_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");		
		logout_CE_validations();
		TabSwitchToChild();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		waitForElement(1000);
		logout_CE_validations();
		//		TabSwitchToParent();
		TabSwitchToThirdWindow();

	}

	public void CustomStatusconfrence_Call() throws InterruptedException, IOException {
		By UserNumber = By.xpath("//u[@title='Voice Number']");	
		By Username =By.xpath("//*[@class='profile-name drag-not-allowed ng-binding']");
		//splitthewindowscreen2("Right");//login ceuserone
		String Firstusernumber=GetElementText(UserNumber);
		System.out.println(Firstusernumber);
		Admin_redirection();
		//Telephone_Setup();
		CUstom_Status_SetupWithtext("Custome_");
		new_Tab();
		SecondUserForConfrence();
		login_CE_validations();
		waitVisibility(UserNumber);
		String Secondusernumber=GetElementText(UserNumber);
		System.out.println(Secondusernumber);
		String Secondusername=GetElementText(Username);
		System.out.println(Secondusername);	
		new_Window();
		maximizeWindow();
		//splitthewindowscreen2("Left");
		ThirdUser();
		login_CE_validations();	
		RefreshPage();
		waitForElement(10000);
		waitVisibility(UserNumber);
		String Thirdusernumber=GetElementText(UserNumber);
		System.out.println(Thirdusernumber);


		//		TabSwitchToParent();
		CalltoUser(Secondusernumber);
		String Firstusernumbe1=GetElementText(UserNumber);
		System.out.println(Firstusernumbe1);
		TabSwitchToChild();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1=element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, Thirdusernumber);
		ExtentSuccessMessage("Assertion has been done");
		time = Currenttime();
		System.out.println("time2:-"+time+"-:time2");
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		time = Currenttime();
		System.out.println("time3:-"+time+"-:time3");
		Thread.sleep(5000);
		ExtentSuccessMessage("Start_TC_CTI_Conference_BeRight_Back_Admin_CallLogs");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceAddButton));
		MoveToElementClick(element);

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceNumberField));
		MoveToElementClick(element);

		writeText(ConfrenceNumberField, Firstusernumber);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallConfreanceButton));
		MoveToElementClick(element);
		time = Currenttime();
		System.out.println("time:-"+time+"-:time");
		Thread.sleep(1000);
		//				TabSwitchToThirdWindow();
		TabSwitchToParent();
		By MissedsmsPopup = By.xpath("//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight']");
		waitVisibility(MissedsmsPopup);
		if(ElementDisplayed(MissedsmsPopup)){
			Assert.assertTrue(driver.findElement(MissedsmsPopup).isDisplayed());
			ExtentSuccessMessage("Successfully user able to See the 'Missed sms Popup' ");
			time = Currenttime();
			System.out.println("time1:-"+time+"-:time1");
		}else {
			ExtentErrorMessage("UNSuccessfully user not able to See the 'Missed sms Popup' ");
		}
		//		Thread.sleep(4000);
		TabSwitchToChild();		
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		time = Currenttime();
		System.out.println("time6:-"+time+"-:time6");
		TabSwitchToParent();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ClickOnHomepage();
		Callingtime = Currenttime();
		System.out.println("time7:-"+Callingtime+"-:time7");
		TelephonyPage.NavigateToTelephonySetpPage();
		Thread.sleep(15000);
		TelephonyPage.ClickOnCallSMSFAXLogsManagement();
		driver.manage().window().maximize();
		RefreshPage();
		Thread.sleep(15000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		TelephonyPage.ClickOnCallTypeFilter();
		Thread.sleep(5000);
		click(CalltypeMissedcall);
		Thread.sleep(5000);
		TelephonyPage.EnterSearchBar(Firstusernumber);
		Thread.sleep(5000);
		validateCallLogsTime(time);
		validateMisscalledDetails(Firstusernumber);
		validateMisscalledDetails(Thirdusernumber);

		ClickonFirstRowId();
		Thread.sleep(8000);
		String TodaysDate =Currentdate();

		String Values = (Thirdusernumber+","+Secondusernumber+","+"Incoming Call"+","+"Completed"+","+TodaysDate+","+TodaysDate+" "+Callingtimes+","+TodaysDate+" "+Callingtime+","+"NA"+","+"Not DNC Number"+","+Secondusername.toUpperCase());
		VerifyBasicCAllsDetails(Values);

		//splitthewindowscreen2("Right");
		ExtentSuccessMessage("End_TC_CTI_Conference_BeRight_Back_Admin_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");
		ExtentSuccessMessage("Start_TC_CTI_Conference_BeRight_Back_CTI_CallLogs");
		HomePage.ClickedOnMaximiseDiller();
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Logs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call Logs icon has been clicked");
		waitForElement(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_Num));
		MoveToElementClick(element);
		writeText(Input_Num,Firstusernumber + Keys.ENTER);
		waitForElement(2000);
		if(ElementDisplayed(call_logs)) {
			waitForElement(3000);
			validateCTICallLogsTime(time);
			ExtentSuccessMessage("Full Number Assertion Done");
		}
		ExtentSuccessMessage("End_TC_CTI_Conference_BeRight_Back_CTI_CallLogs");	
		logout_CE_validations();
		TabSwitchToChild();
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		//		MoveToElementClick(element);
		waitForElement(1000);
		logout_CE_validations();
		//		TabSwitchToParent();
		TabSwitchToThirdWindow();

	}

	public void BeRight_Backconfrence_Call() throws InterruptedException, IOException {
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		//splitthewindowscreen2("Right");// login ceuserone
		String Firstusernumber = GetElementText(UserNumber);
		System.out.println(Firstusernumber);
		new_Tab();
		SecondUserForConfrence();
		login_CE_validations();
		waitVisibility(UserNumber);
		String Secondusernumber = GetElementText(UserNumber);
		System.out.println(Secondusernumber);
		new_Window();
		maximizeWindow();
		//splitthewindowscreen2("Left");
		ThirdUser();
		login_CE_validations();
		RefreshPage();
		waitForElement(10000);
		waitVisibility(UserNumber);
		String Thirdusernumber = GetElementText(UserNumber);
		System.out.println(Thirdusernumber);
		TabSwitchToParent();
		Admin_redirection();
		// Telephone_Setup();
		CUstom_Status_SetupWithtext("BeRight_Back");

		//		TabSwitchToParent();
		TabSwitchToThirdWindow();
		CalltoUser(Secondusernumber);
		String Firstusernumbe1 = GetElementText(UserNumber);
		System.out.println(Firstusernumbe1);
		TabSwitchToChild();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, Thirdusernumber);
		ExtentSuccessMessage("Assertion has been done");
//		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(5000);
		ExtentSuccessMessage("Start_TC_CTI_Conference_BeRight_Back_Admin_CallLogs");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceAddButton));
		MoveToElementClick(element);

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceNumberField));
		MoveToElementClick(element);

		writeText(ConfrenceNumberField, Firstusernumber);
		//time = CurrentTime();
		time = Currenttime();
		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallConfreanceButton));
		MoveToElementClick(element);
		Thread.sleep(1000);
		//		TabSwitchToThirdWindow();
		TabSwitchToParent();
		By MissedsmsPopup = By.xpath("//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight']");
		if (ElementDisplayed(MissedsmsPopup)) {
			Assert.assertTrue(driver.findElement(MissedsmsPopup).isDisplayed());
			ExtentSuccessMessage("Successfully user able to See the 'Missed sms Popup' ");
		} else if (ElementDisplayed(MissedsmsPopup)) {
			waitVisibility(MissedsmsPopup);
			Assert.assertTrue(driver.findElement(MissedsmsPopup).isDisplayed());
			ExtentSuccessMessage("Successfully user able to See the 'Missed sms Popup' ");
		} else {
			ExtentSuccessMessage("UNSuccessfully user not able to See the 'Missed sms Popup' ");
		}
		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ClickOnHomepage();
		TelephonyPage.NavigateToTelephonySetpPage();
		Thread.sleep(15000);
		TelephonyPage.ClickOnCallSMSFAXLogsManagement();
		driver.manage().window().maximize();
		RefreshPage();
		Thread.sleep(15000);
		TelephonyPage.ClickOnCallTypeFilter();
		Thread.sleep(5000);
		click(CalltypeMissedcall);
		Thread.sleep(5000);
		TelephonyPage.EnterSearchBar(Firstusernumber);
		Thread.sleep(5000);
		validateCallLogsTime(time);
		validateMisscalledDetails(Firstusernumber);
		validateMisscalledDetails(Thirdusernumber);
//		splitthewindowscreen2("Left");
//		splitthewindowscreen2("Right");
		ExtentSuccessMessage("End_TC_CTI_Conference_BeRight_Back_Admin_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");
		ExtentSuccessMessage("Start_TC_CTI_Conference_BeRight_Back_CTI_CallLogs");
		HomePage.ClickedOnMaximiseDiller();
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Logs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call Logs icon has been clicked");
		waitForElement(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_Num));
		MoveToElementClick(element);
		writeText(Input_Num, Firstusernumber + Keys.ENTER);
		waitForElement(2000);
		if (ElementDisplayed(call_logs)) {
			waitForElement(3000);
			validateCTICallLogsTime(time);
			ExtentSuccessMessage("Full Number Assertion Done");
		}
		ExtentSuccessMessage("End_TC_CTI_Conference_BeRight_Back_CTI_CallLogs");
		logout_CE_validations();
		TabSwitchToChild();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		waitForElement(1000);
		logout_CE_validations();
		//		TabSwitchToParent();
		TabSwitchToThirdWindow();

	}

	public void ClickOnHomepage() throws InterruptedException {
		if (ElementDisplayed(L_Homepage)) {
			ExtentSuccessMessage("Successfully user able to See 'Home Page' ");
			click(L_Homepage);
			ExtentSuccessMessage("Successfully user Clicked on 'Home Page Button' ");
		} else {
			ExtentSuccessMessage("UnSuccessfully user not able to See 'Home Page Button' ");
		}
		Thread.sleep(8000);
	}

	public void ClickoNMinimizecallscriptspopup() throws InterruptedException {
		if (ElementDisplayed(L_CallScriptspopup)) {
			ExtentSuccessMessage("Successfully user able to See 'Call Scripts popup Button' ");
			click(L_CallScriptspopup);
			ExtentSuccessMessage("Successfully user Clicked on 'Call Scripts popup Button' ");
		} else {
			ExtentSuccessMessage("UnSuccessfully user not able to See 'Call Scripts popup Button' ");
		}
	}

	public void ClickoNMinimizecallscriptspopupCancel() throws InterruptedException {
		if (ElementDisplayed(L_CallScriptspopupCancel)) {
			ExtentSuccessMessage("Successfully user able to See 'Call Scripts popup Cancel Button' ");
			click(L_CallScriptspopupCancel);
			ExtentSuccessMessage("Successfully user Clicked on 'Call Scripts popup Cancel Button' ");
		} else {
			ExtentErrorMessage("UnSuccessfully user not able to See 'Call Scripts popup Cancel Button' ");
		}
	}

	public void Transfer_Call() throws InterruptedException, IOException {
		new_Tab();
		SecondUserForTransfer();
		login_CE_validations();
		new_Tab();
		// TabSwitchToParent();
		new_Window();
		maximizeWindow();
//		splitthewindowscreen2("Right");
		ThirdUser();
		login_CE_validations();
		valid_Transfer();
		TabSwitchToParent();
		transferCall();
		TabSwitchToChild();
		transferAssertion();
		logout_CE_validations();
		TabSwitchToParent();

	}

	public void validate_MissedCallTab() throws InterruptedException, IOException {

		fetchNumber1();
		new_Tab();
		secondUser_MissedCall();
		fetchNumber();
		validate_MissedCall();

	}

	public void validate_Outbound_Confrence()
			throws InterruptedException, IOException, ParseException, java.text.ParseException {

		//		fetchNumber1();
		//		new_Tab();
		//		secondUser_Outbound_Confrence();
		//		fetchNumber();
		//		new_Tab();
		//		ThirdUserForOutbound();
		//		fetchNumber2();
		//		confrence_Validation();
		//		logout_CE_validations();
		//		TabSwitchToParent();


		By UserNumber = By.xpath("//u[@title='Voice Number']");	
		By Username =By.xpath("//*[@class='profile-name drag-not-allowed ng-binding']");
//		splitthewindowscreen2("Right");//login ceuserone
		String Firstusernumber=GetElementText(UserNumber);
		System.out.println(Firstusernumber);
		new_Tab();
		SecondUserForConfrence();
		login_CE_validations();
		waitVisibility(UserNumber);
		String Secondusernumber=GetElementText(UserNumber);
		System.out.println(Secondusernumber);
		String Secondusername=GetElementText(Username);
		System.out.println(Secondusername);		
		new_Window();
		maximizeWindow();
//		splitthewindowscreen2("Left");
		ThirdUser();
		login_CE_validations();	
		RefreshPage();
		waitForElement(18000);
		waitVisibility(UserNumber);
		String Thirdusernumber=GetElementText(UserNumber);
		System.out.println(Thirdusernumber);
		//		TabSwitchToParent();
		CalltoUser(Secondusernumber);
		String Firstusernumbe1=GetElementText(UserNumber);
		System.out.println(Firstusernumbe1);
		TabSwitchToChild();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1=element.getText();
		System.out.println(NumberOutput1);
		//		Assert.assertEquals(NumberOutput1, Firstusernumber);
		Assert.assertEquals(NumberOutput1, Thirdusernumber);
		ExtentSuccessMessage("Assertion has been done");
		//		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		String Timesd =Currenttime();
		System.out.println("CurrentTime1:-"+Currenttime());
		Thread.sleep(5000);
		ExtentSuccessMessage("Start_TC_CTI_Conference_Online_Admin_CallLogs");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceAddButton));
		MoveToElementClick(element);

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceNumberField));
		MoveToElementClick(element);

		//		writeText(ConfrenceNumberField, Thirdusernumber);
		writeText(ConfrenceNumberField, Firstusernumber);
		//		time = CurrentTime();
		//		System.out.println("Times:-"+time);
		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallConfreanceButton));
		MoveToElementClick(element);

		Thread.sleep(1000);
		Callingtime=Currenttime();
		//		TabSwitchToThirdWindow();
		TabSwitchToParent();
		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UatNumberinQualtia1));
		NumberOutput1 =element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, Thirdusernumber);
		ExtentSuccessMessage("Assertiion has been done for confrence");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		time = Currenttime();
		System.out.println("Times:-"+time);
		Thread.sleep(10000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		waitForElement(1000);

		TabSwitchToChild();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		TelephonyPage.NavigateToTelephonySetpPage();
		Thread.sleep(15000);

		TelephonyPage.ClickOnCallSMSFAXLogsManagement();
		driver.manage().window().maximize();
		Thread.sleep(25000);

		//		MoveToElementClick(element);
		TelephonyPage.ClickOnCallTypeFilter();
		Thread.sleep(5000);
		click(CalltypeInboundcall);
		Thread.sleep(5000);
		//		TelephonyPage.EnterSearchBar(Firstusernumber);
		TelephonyPage.EnterSearchBar(Thirdusernumber);
		Thread.sleep(5000);
		validateCallLogsTime(time);
		validateMisscalledDetails(Secondusernumber);
		validateMisscalledDetails(Thirdusernumber);
		ClickonFirstRowId();
		Thread.sleep(8000);
		String TodaysDate =Currentdate();

		String Values = (Thirdusernumber+","+Secondusernumber+","+"Incoming Call"+","+"Connected"+","+TodaysDate+","+TodaysDate+" "+Callingtimes+","+TodaysDate+" "+Callingtime+","+"NA"+","+"Not DNC Number"+","+Secondusername.toUpperCase());
		VerifyBasicCAllsDetails(Values);

//		splitthewindowscreen2("Right");
		ExtentSuccessMessage("End_TC_CTI_Conference_Online_Admin_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");
		ExtentSuccessMessage("Start_TC_CTI_Conference_Online_CTI_CallLogs");
		HomePage.ClickedOnMaximiseDiller();
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Logs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call Logs icon has been clicked");
		waitForElement(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_Num));
		MoveToElementClick(element);
		writeText(Input_Num,Thirdusernumber + Keys.ENTER);
		waitForElement(2000);
		if(ElementDisplayed(call_logs)) {
			waitForElement(3000);
			validateCTICallLogsTime(time);
			ExtentSuccessMessage("Full Number Assertion Done");
		}
		ExtentSuccessMessage("End_TC_CTI_Conference_Online_CTI_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");		
		logout_CE_validations();
		//		TabSwitchToChild();
		TabSwitchToParent();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		waitForElement(1000);
		logout_CE_validations();
		//		TabSwitchToParent();
		TabSwitchToThirdWindow();

	}

	public void currenturl() throws InterruptedException {
		waitForElement(3000);
		URL = driver.getCurrentUrl();
		System.out.println("Current URL = " + URL);
	}

	public void validate_Voicemail_Tab() throws InterruptedException, IOException, AWTException, ParseException {
		User1();
		currenturl();
		new_Tab();
		secondUser_Voicemail();
		User2();
		//validate_Voicemail();
		//fetchNumber2();
		//Voicemail_Validation();
		voice_mail_validations();
		logout_CE_validations();
		TabSwitchToChild();

	}

	public void validate_Voicemail_Tab_Console()
			throws InterruptedException, IOException, AWTException, ParseException {
		fetchNumber1();
		new_Tab();
		secondUser_Voicemail();
		fetchNumber2();
		validate_Voicemail();
		logout_CE_validations();
		TabSwitchToChild();

	}

	public void validate_On_CallTab() throws InterruptedException, IOException {
		fetchNumber1();
		new_Tab();
		SecondUserForTransfer();
		new_Tab();
		ThirdUser();
		valid_Transfer_ONCall();
		TabSwitchToParent();
		transfer_Assertion_OnCall();
		logout_CE_validations();
		TabSwitchToParent();
	}

	public static String removeLeadingZero(String time) {
		// Split time into components
		String[] timeParts = time.split(" ");
		String timeOfDay = timeParts[0]; // Extracts "07:50"
		String period = timeParts[1]; // Extracts "AM" or "PM"

		// Further split time into hour and minutes
		String[] hourMinutes = timeOfDay.split(":");
		String hour = hourMinutes[0]; // Extracts "07"
		String minutes = hourMinutes[1]; // Extracts "50"

		// Remove leading zero from hour if present
		String formattedHour = hour.startsWith("0") ? hour.substring(1) : hour;

		// Rebuild the time string
		return formattedHour + ":" + minutes + " " + period;
	}

	public void validate_Voicemail() throws InterruptedException, AWTException, ParseException {
		TabSwitchToParent();
		waitForElement(2000);
		By CTIInputField = By.xpath(
				"//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		String number = firstnumber;
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Input field has been clicked and number has been entered");

		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		time = CurrentTime();
		System.out.println(time);
		String timee = removeLeadingZero(time);
		System.out.println(timee);
		ExtentSuccessMessage("Call button has been clicked and call has been triggered");

		TabSwitchToParent();
		waitForElement(1000);
		By CallDecline = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-incoming-window > button.voice-call-green-button-small.fa.fa-phone.voice-decline");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDecline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been declined");
		TabSwitchToChild();

		waitForElement(1000);
		By Keypad = By.xpath("//a[@ng-click='CTICtrl.showDialPad(true)']/i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Keypad));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on call keypad");

		waitForElement(8000);
		By Asterik = By.xpath("((//div[@class='voice-call-dial-pad-dialer'])[2]/a)[11]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Asterik));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Asterik on dialer pad");
		TabSwitchToChild();
		waitForElement(3000);
		String voicemailtime = CurrentTime2();
		String voicemail = removeLeadingZero(voicemailtime);
		System.out.println(voicemailtime + "--Voice mail time");

		TabSwitchToParent();

		ExtentSuccessMessage("************************* Voice Mail SSE *************************");
		// waitForElement(3000);
		By VoiceMaillSSE = By.xpath(
				"//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight'] | //span[@class='label label-warning ng-binding'][normalize-space()='1']");
		waitVisibility(VoiceMaillSSE);
		Assert.assertTrue(driver.findElement(VoiceMaillSSE).isDisplayed());
		ExtentSuccessMessage("voice mail SSE notification is enabled");

		ExtentSuccessMessage("*************************Voice Mail Count *************************");

		waitForElement(8000);
		By MissedCallCount = By.xpath("//a[@title='Voice Mails']/span[2]");
		Assert.assertTrue(driver.findElement(MissedCallCount).isDisplayed());
		ExtentSuccessMessage("Assertion for missed call Count is done");

		By VoiceMail = By.xpath("//a[@title='Voice Mails']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(VoiceMail));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Voice Mail Section");

		ExtentSuccessMessage("************************* Number Search *************************");
		By Input_num = By.xpath("//div[@class='voice-call-window-content-right-section right-al cti-noscroll-padding ng-scope']//input[@placeholder='Search']");

		By calluser = By.xpath("(//i[@class='cl-bklink ng-binding ng-scope'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_num));
		MoveToElementClick(element);
		writeText(Input_num, secondnumber + Keys.ENTER);
		waitForElement(2000);
		ExtentSuccessMessage("Phone Number has been entered");
		waitForElement(1000);
		if (ElementDisplayed(calluser)) {
			ExtentSuccessMessage("Full Number Assertion Done");
		}
		clear(Input_num);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_num));
		MoveToElementClick(element);
		String PartialNumber = secondnumber.substring(0, 9);
		writeText(Input_num, PartialNumber + Keys.ENTER);
		waitForElement(2000);
		if (ElementDisplayed(calluser)) {
			ExtentSuccessMessage("Partial Number Assertion Done");
		}

		ExtentSuccessMessage("************************* Quick Dial *************************");

		By MissedCall = By.xpath("//a[@title='Missed Calls']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Missed Call Section");

		Thread.sleep(3000);
		By QuickDial = By.xpath("//u[contains(.,'" + timee
				+ "')]/ancestor::li/button[@class='voice-call-green-button-small fa fa-phone voice-decline message-list-icon fa fa-arrow-left red-color']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(QuickDial));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Quick Dial Button");

		Thread.sleep(4000);

		By Decline = By.cssSelector("#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Decline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Decline Button");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(VoiceMail));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Voice Mail Section");

		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);

		Thread.sleep(2000);
		if (currenturl.contains("https://mme.benefitalign.com")) {
			System.out.println("Prod");
			ExtentSuccessMessage("Production Env cannot download voice mail");
		} else {

			ExtentSuccessMessage("************************* Play voicemail *************************");
			By Play_btn = By.xpath("//u[contains(.,'" + voicemail + "')]/ancestor::li/button[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Play_btn));
			MoveToElementClick(element);
			ExtentSuccessMessage("Clicked on Play voicemail Button");
			waitForElement(2000);
			By Delete_Icon = By.xpath("//u[contains(.,'" + voicemail + "')]/ancestor::li/button[2]");
			Assert.assertTrue(driver.findElement(Delete_Icon).isDisplayed());
			ExtentSuccessMessage("Delete Icon Assertion has been done");
			By Download_Icon = By.xpath("(//button[@title='Download'])[1]");
			Assert.assertTrue(driver.findElement(Download_Icon).isDisplayed());
			ExtentSuccessMessage("Download Icon Assertion has been done");
			By Player = By.xpath("//audio[@class='recordingAudioElement show']");
			Assert.assertTrue(driver.findElement(Player).isDisplayed());
			ExtentSuccessMessage("Player Assertion has been done and it is been displayed");
			ExtentSuccessMessage("Play Voicemail Assertion has been done");

			ExtentSuccessMessage("************************* Download VoiceMail *************************");
			ClickonDownoadRecordings();

		}


		Thread.sleep(4000);
		By AdminTile = By.xpath("//a[@class='glyphicon fa fa-fw fa-black-tie']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AdminTile));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on AdminTile");

		waitForElement(3000);
		By TelephonySetup = By.cssSelector(
				"#NavigationMenuRegion > div > div.col-md-12.subcontsection.pad-lt.pad-rt.pull-right.overflow-visible.dashboard > div.col-md-12.pull-left.pad-lt > div > ul > li.admin-box.box.animate-box.fade-in > ul > li:nth-child(2) > a");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TelephonySetup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Telephony setup");

		waitForElement(2000);
		By calllog = By.id("viceCallLogsBtn");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(calllog));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call/SMS/FAX Logs Management");

		waitForElement(2000);
		By CallType = By.xpath("(//div[@class='accordion-container grid-style-height'])[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call type");

		By Missedcall = By.xpath("//md-checkbox[@value='Missed Call,Missed Call Group']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Missedcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Missed call button");

		validateCallLogsTime(time);

//		System.out.println(time);
//		By Time = By.xpath("(//div[@class='ui-grid-cell-contents ng-binding ng-scope'])[2]");
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(Time));
//		String admintime =element.getText();
//		System.out.println(admintime);
//		
//		String timeString = StringUtils.substringAfter(admintime," ");
//        System.out.println("---------"+timeString);
//        boolean isTimeMatching =areTimesMatching(timeString, time, 1);
//		System.out.println(isTimeMatching); 
//        if (isTimeMatching) {
//			System.out.println("Times match or are within the acceptable range.");
//			ExtentSuccessMessage("Times match or are within the acceptable range.");
//		} else {
//			System.err.println("Times do not match.");
//			ExtentErrorMessage("Times do not match.");
//		}
		ExtentSuccessMessage("Time assertion is done and call logs details are present in Admin Telephony Setup");

		waitForElement(1000);
		By VoiceMail1 = By.xpath("//a[@title='Voice Mails']");
		waitVisibility(VoiceMail1);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(VoiceMail1));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on VoiceMail");

		//		By TimeInCTI = By.xpath("(//i[@class='time-cont'])[1]");
		//		waitVisibility(TimeInCTI);
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeInCTI));
		//		String time1=element.getText();
		//		System.out.println("Time1 = " +time1);
		//		String timeString = StringUtils.substringAfter(time1," ");
		//		System.out.println("---------"+timeString);
		//		System.out.println("---------"+time);
		//		boolean isTimeMatching =areTimesMatching(timeString, time, 1);
		//		System.out.println(isTimeMatching); 
		//		if (isTimeMatching) {
		//			System.out.println("Times match or are within the acceptable range.");
		//			ExtentSuccessMessage("Times match or are within the acceptable range.");
		//		} else {
		//			System.err.println("Times do not match.");
		//			ExtentErrorMessage("Times do not match.");
		//		}
		//		ExtentSuccessMessage("Assertion has been done");
		//		
		//		waitForElement(2000);
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		//		MoveToElementClick(element);
		//		ExtentSuccessMessage("User has been selected");
		//		
		//		By MyProfile = By.xpath("//i[@class='fa fa-fw fa-user']/parent::a");
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(MyProfile));
		//		MoveToElementClick(element);
		//		ExtentSuccessMessage("Clicked on my profile");
		//		
		//		
		//		By EmailId = By.xpath("//input[@name='EmailId']");
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(EmailId));
		//		MoveToElementClick(element);
		//		String getemail = element.getAttribute("value");
		//		System.out.println(getemail);
		//		
		//		//new_Tab();
		//		
		//		waitForElement(2000);
		ExtentSuccessMessage("Clicked on Transfered call button");

		By Time = By.xpath("(//div[@class='ui-grid-cell-contents ng-binding ng-scope'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Time));
		String admintime = element.getText();
		System.out.println(admintime);

		String timeString = StringUtils.substringAfter(admintime, " ");
		System.out.println("---------" + timeString);

		waitForElement(4000);
		Assert.assertTrue(time.contains(timeString));
		ExtentSuccessMessage("Time assertion is done and call logs details are present in Admin Telephony Setup");

		waitForElement(2000);
		By VoiceMail2 = By.xpath("//a[@title='Voice Mails']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(VoiceMail2));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on VoiceMail");

		waitForElement(2000);
		By TimeInCTI = By.xpath("(//i[@class='time-cont'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeInCTI));
		MoveToElementClick(element);
		String ctitime = element.getText();
		System.out.println(ctitime);

		String timeString1 = StringUtils.substringAfter(ctitime, " ");
		System.out.println("---------" + timeString1);
		waitForElement(3000);
		Assert.assertTrue(voicemailtime.contains(timeString1));
		ExtentSuccessMessage("Transfred call is been display in CTI CallLog Status");

		waitForElement(2000);

	}

	public void Voicemail_Validation() throws InterruptedException {
		TabSwitchToParent();

		waitForElement(2000);
		By CTIInputField = By.xpath(
				"//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		String number = secondnumber;
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Input field has been clicked and number has been entered");

		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		time = CurrentTime();
		System.out.println(time);
		ExtentSuccessMessage("Call button has been clicked and call has been triggered");

		TabSwitchToChild();
		waitForElement(1000);
		By CallDecline = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-incoming-window > button.voice-call-green-button-small.fa.fa-phone.voice-decline");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDecline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been declined");
		TabSwitchToParent();

		waitForElement(1000);
		By Keypad = By.xpath("//a[@ng-click='CTICtrl.showDialPad(true)']/i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Keypad));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on call keypad");

		waitForElement(8000);
		By Asterik = By.xpath("((//div[@class='voice-call-dial-pad-dialer'])[2]/a)[11]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Asterik));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Asterik on dialer pad");
		TabSwitchToChild();

		waitForElement(3000);
		By VoiceMaillSSE = By.xpath(
				"//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight'] | //span[@class='label label-warning ng-binding'][normalize-space()='1']");
		waitVisibility(VoiceMaillSSE);
		Assert.assertTrue(driver.findElement(VoiceMaillSSE).isDisplayed());
		ExtentSuccessMessage("voice mail SSE notification is enabled");

		By AdminTile = By.xpath("//a[@class='glyphicon fa fa-fw fa-black-tie']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AdminTile));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on AdminTile");

		waitForElement(3000);
		By TelephonySetup = By.cssSelector(
				"#NavigationMenuRegion > div > div.col-md-12.subcontsection.pad-lt.pad-rt.pull-right.overflow-visible.dashboard > div.col-md-12.pull-left.pad-lt > div > ul > li.admin-box.box.animate-box.fade-in > ul > li:nth-child(2) > a");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TelephonySetup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Telephony setup");

		waitForElement(2000);
		By calllog = By.id("viceCallLogsBtn");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(calllog));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call/SMS/FAX Logs Management");

		waitForElement(2000);
		By CallType = By.xpath("(//div[@class='accordion-container grid-style-height'])[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call type");

		By Missedcall = By.xpath("//md-checkbox[@value='Missed Call,Missed Call Group']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Missedcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Missed call button");

		validateCallLogsTime(time);

		//		System.out.println(time);
		//		By Time = By.xpath("(//div[@class='ui-grid-cell-contents ng-binding ng-scope'])[2]");
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(Time));
		//		String admintime =element.getText();
		//		System.out.println(admintime);
		//		
		//		String timeString = StringUtils.substringAfter(admintime," ");
		//        System.out.println("---------"+timeString);
		//        boolean isTimeMatching =areTimesMatching(timeString, time, 1);
		//		System.out.println(isTimeMatching); 
		//        if (isTimeMatching) {
		//			System.out.println("Times match or are within the acceptable range.");
		//			ExtentSuccessMessage("Times match or are within the acceptable range.");
		//		} else {
		//			System.err.println("Times do not match.");
		//			ExtentErrorMessage("Times do not match.");
		//		}
		ExtentSuccessMessage("Time assertion is done and call logs details are present in Admin Telephony Setup");

		waitForElement(1000);
		By VoiceMail = By.xpath("//a[@title='Voice Mails']");
		waitVisibility(VoiceMail);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(VoiceMail));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on VoiceMail");

		//		By TimeInCTI = By.xpath("(//i[@class='time-cont'])[1]");
		//		waitVisibility(TimeInCTI);
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeInCTI));
		//		String time1=element.getText();
		//		System.out.println("Time1 = " +time1);
		//		String timeString = StringUtils.substringAfter(time1," ");
		//		System.out.println("---------"+timeString);
		//		System.out.println("---------"+time);
		//		boolean isTimeMatching =areTimesMatching(timeString, time, 1);
		//		System.out.println(isTimeMatching); 
		//		if (isTimeMatching) {
		//			System.out.println("Times match or are within the acceptable range.");
		//			ExtentSuccessMessage("Times match or are within the acceptable range.");
		//		} else {
		//			System.err.println("Times do not match.");
		//			ExtentErrorMessage("Times do not match.");
		//		}
		//		ExtentSuccessMessage("Assertion has been done");
		//		
		//		waitForElement(2000);
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		//		MoveToElementClick(element);
		//		ExtentSuccessMessage("User has been selected");
		//		
		//		By MyProfile = By.xpath("//i[@class='fa fa-fw fa-user']/parent::a");
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(MyProfile));
		//		MoveToElementClick(element);
		//		ExtentSuccessMessage("Clicked on my profile");
		//		
		//		
		//		By EmailId = By.xpath("//input[@name='EmailId']");
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(EmailId));
		//		MoveToElementClick(element);
		//		String getemail = element.getAttribute("value");
		//		System.out.println(getemail);
		//		
		//		//new_Tab();
		//		
		//		waitForElement(2000);

	}

	public void voice_mail_validations() throws InterruptedException {

		TabSwitchToParent();
		waitForElement(2000);
		By CTIInputField = By.xpath(
				"//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		String number = firstnumber;
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Input field has been clicked and number has been entered");

		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		time = Currenttime();
		System.out.println(time);
		String timee = removeLeadingZero(time);
		System.out.println(timee);
		ExtentSuccessMessage("Call button has been clicked and call has been triggered");

		TabSwitchToParent(); 
		waitForElement(1000);
		By CallDecline = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-incoming-window > button.voice-call-green-button-small.fa.fa-phone.voice-decline");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDecline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been declined");
		TabSwitchToChild();

		waitForElement(1000); 
		By Keypad = By.xpath("//a[@ng-click='CTICtrl.showDialPad(true)']/i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Keypad));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on call keypad");

		waitForElement(8000);
		By Asterik = By.xpath("((//div[@class='voice-call-dial-pad-dialer'])[2]/a)[11]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Asterik));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Asterik on dialer pad");
		TabSwitchToChild();	
		waitForElement(3000);
		String voicemailtime = CurrentTime2();
		System.out.println(voicemailtime + "--Voice mail time");

		TabSwitchToParent();

		ExtentSuccessMessage("************************* Voice Mail SSE *************************");
		//waitForElement(3000);
		By VoiceMaillSSE = By.xpath("//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight'] | //span[@class='label label-warning ng-binding'][normalize-space()='1']");
		waitVisibility(VoiceMaillSSE);
		Assert.assertTrue(driver.findElement(VoiceMaillSSE).isDisplayed());
		ExtentSuccessMessage("voice mail SSE notification is enabled");

		ExtentSuccessMessage("*************************Voice Mail Count *************************");


		waitForElement(10000);
		By MissedCallCount = By.xpath("//a[@title='Voice Mails']/span[2]");
		waitVisibility(MissedCallCount);
		Assert.assertTrue(driver.findElement(MissedCallCount).isDisplayed());
		ExtentSuccessMessage("Assertion for missed call Count is done");

		By VoiceMail = By.xpath("//a[@title='Voice Mails']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(VoiceMail));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Voice Mail Section");

		By AdminTile = By.xpath("//a[@class='glyphicon fa fa-fw fa-black-tie']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AdminTile));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on AdminTile");

		waitForElement(3000);
		By TelephonySetup = By.cssSelector(
				"#NavigationMenuRegion > div > div.col-md-12.subcontsection.pad-lt.pad-rt.pull-right.overflow-visible.dashboard > div.col-md-12.pull-left.pad-lt > div > ul > li.admin-box.box.animate-box.fade-in > ul > li:nth-child(2) > a");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TelephonySetup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Telephony setup");

		waitForElement(2000);
		By calllog = By.id("viceCallLogsBtn");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(calllog));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call/SMS/FAX Logs Management");

		waitForElement(2000);
		By CallType = By.xpath("(//div[@class='accordion-container grid-style-height'])[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call type");

		By Missedcall = By.xpath("//md-checkbox[@value='Missed Call,Missed Call Group']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Missedcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Missed call button");

		validateCallLogsTime(time);

	}


	public void ClickonDownoadRecordings() throws InterruptedException, AWTException, ParseException {
		By Download_btn = By.xpath("(//button[@title='Download'])[1]");
		if (ElementDisplayed(Download_btn)) {
			ExtentSuccessMessage("Successfully user able to See 'DownloadRecording Recording Tab Button' ");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Download_btn));
			MoveToElementClick(element);
			ExtentSuccessMessage("Successfully user Clicked on 'DownloadRecording Recording Tab Button' ");
			Thread.sleep(2000);
			//			Base_Class.switchtabwithindex(2);
			Thread.sleep(5000);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			Thread.sleep(4000);
			Base_Class.DownloadFileWithRobot();
			Thread.sleep(3000);
			Base_Class.switchtabwithindex(0);
		} else {

			ExtentErrorMessage("UnSuccessfully user not able to See'Play Recording Tab Button' ");
		}

		Thread.sleep(4000);

	}

	public void validate_Outbound_SMS() throws InterruptedException {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SMSIcon));
		MoveToElementClick(element);
		ExtentSuccessMessage("SMS icon has been clicked");
		WebElement SenderNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String NumberOutput = SenderNumber.getText();
		System.out.println(NumberOutput);
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NEWMessage));
		MoveToElementClick(element);
		ExtentSuccessMessage("New Message Button has been clicked");
		waitForElement(6000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(InputNumber));
		MoveToElementClick(element);
		driver.switchTo().window(tabs.get(1));
		WebElement ReceiveNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String Number = ReceiveNumber.getText();
		driver.switchTo().window(tabs.get(0));
		writeText(InputNumber, Number);
		ExtentSuccessMessage("Sender Number has been Entered");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MessageTextArea));
		MoveToElementClick(element);
		textmsg = "Hello, These is Automated Text!!!";
		writeText(MessageTextArea, textmsg);
		ExtentSuccessMessage("Message has been Entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SendButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Send Button has been Clicked");
		Thread.sleep(3000);
		time = Currenttime();
		driver.switchTo().window(tabs.get(1));
		// waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(QASMSSection));
		MoveToElementClick(element);
		ExtentSuccessMessage("SMS section has been opened ");
		wait.until(ExpectedConditions.elementToBeClickable(MessageReceived));
		click(MessageReceived);
		Thread.sleep(2000);
	}

	public void inboundsmsvalidation() throws InterruptedException {
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(QASMSSection));
		MoveToElementClick(element);
		ExtentSuccessMessage("SMS section has been opened ");
		wait.until(ExpectedConditions.elementToBeClickable(MessageReceived));
		click(MessageReceived);
		Thread.sleep(2000);
	}

	public void SendSMS(String value) throws InterruptedException {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SMSIcon));
		MoveToElementClick(element);
		ExtentSuccessMessage("SMS icon has been clicked");
		WebElement SenderNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String NumberOutput = SenderNumber.getText();
		System.out.println(NumberOutput);
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NEWMessage));
		MoveToElementClick(element);
		ExtentSuccessMessage("New Message Button has been clicked");
		waitForElement(6000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(InputNumber));
		MoveToElementClick(element);
		driver.switchTo().window(tabs.get(1));
		WebElement ReceiveNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String Number = ReceiveNumber.getText();
		driver.switchTo().window(tabs.get(0));
		writeText(InputNumber, Number);
		ExtentSuccessMessage("Sender Number has been Entered");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MessageTextArea));
		MoveToElementClick(element);
		textmsg = value;
		writeText(MessageTextArea, textmsg);
		ExtentSuccessMessage("Message has been Entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SendButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Send Button has been Clicked");
		// Thread.sleep(3000);
		time = CurrentTime();

		// Thread.sleep(2000);
	}

	public void validate_SMSOnAdminlogsTab() throws InterruptedException, IOException {
		splitthewindowscreen2("Right");// login QU1
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Left");
		secondUser_MissedCall();
		login_CE_validations();
		fetchNumber();
		Changed_Status();
		TabSwitchToParent();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println(NumberOutput);
		ExtentSuccessMessage("Number of First user is :" + NumberOutput);
		validate_Outbound_SMS();
		Thread.sleep(2000);
		TabSwitchToParent();
		// Thread.sleep(2000);
		// TelephonyPage.NavigateToTelephonySetpPage();
		// Thread.sleep(10000);
		// TelephonyPage.ClickOnCallSMSFAXLogsManagement();
		// driver.manage().window().maximize();
		// Thread.sleep(10000);
		// TelephonyPage.ClickOnSMSLogs();
		// Thread.sleep(10000);
		// TelephonyPage.ClickOnSMSTypeFilter();
		// Thread.sleep(10000);
		// click(SMSTypeOutbondsms);
		// Thread.sleep(5000);
		// splitthewindowscreen2("Right");
		// Thread.sleep(5000);
		// TelephonyPage.EnterSearchBar(NumberOutput);
		// Thread.sleep(5000);
		// validateMisscalledDetails(time);
		// validateMisscalledDetails(NumberOutput);
		// validateMisscalledDetails(UserNumberforCTI);
		// validateMisscalledDetails(textmsg);
		// logout_CE_validations();
		// TabSwitchToChild();

		Thread.sleep(2000);
		TelephonyPage.NavigateToTelephonySetpPage();
		Thread.sleep(10000);
		TelephonyPage.ClickOnCallSMSFAXLogsManagement();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		TelephonyPage.ClickOnSMSLogs();
		Thread.sleep(10000);
		TelephonyPage.ClickOnSMSTypeFilter();
		Thread.sleep(10000);
		click(SMSTypeOutbondsms);
		Thread.sleep(5000);
		splitthewindowscreen2("Right");
		Thread.sleep(5000);
		TelephonyPage.EnterSearchBar(NumberOutput);
		Thread.sleep(5000);
		validateMisscalledDetails(time);
		validateMisscalledDetails(NumberOutput);
		validateMisscalledDetails(UserNumberforCTI);
		validateMisscalledDetails(textmsg);
		logout_CE_validations();
		TabSwitchToChild();

	}

	public void validate_inboundSMSOnAdminlogsTab() throws InterruptedException, IOException {
		ExtentSuccessMessage(
				"*******Start Customer Engage TC_CTI_AdminSMS_Call_Fax_Tab_Validation_SMS_MMS_Inbound***************");
		URL = driver.getCurrentUrl();
		System.out.println("Current URL= " + URL);
		// splitthewindowscreen2("Right");//login QU1
		// new_Window();
		new_Tab();
		// maximizeWindow();
		// splitthewindowscreen2("Left");
		secondUser_Call();
		login_CE_validations();
		User();
		Changed_Status();
		TabSwitchToParent();
		waitVisibility(Qualatia1Number);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println(NumberOutput);
		ExtentSuccessMessage("Number of First user is :" + NumberOutput);
		validate_Outbound_SMS();
		Thread.sleep(3000);
		ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToTelephonySetpPage();
		Thread.sleep(2000);
		TelephonyPage.ClickOnCallSMSFAXLogsManagement();
		// driver.manage().window().maximize();
		Thread.sleep(2000);
		TelephonyPage.ClickOnSMSLogs();

		waitForElement(2000);
		By SMSType = By.xpath("(//div[@class='accordion-container grid-style-height'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SMSType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on SMS type");
		waitForElement(2000);
		By Inboundsms = By.xpath("//span[normalize-space()='Inbound SMS']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Inboundsms));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Inboundsms button");

//		Thread.sleep(2000);
//		TelephonyPage.ClickOnSMSTypeFilter();
//		Thread.sleep(2000);
//		click(SMSTypeInboundsms);
		Thread.sleep(2000);
		TelephonyPage.EnterSearchBar(NumberOutput);
		Thread.sleep(2000);
		validateSMSLogsTime(time);
		validateMisscalledDetails(NumberOutput);
		validateMisscalledDetails(UserNumberforCTI);
		validateMisscalledDetails(textmsg);
		// splitthewindowscreen2("Left");
		Thread.sleep(2000);
		ExtentSuccessMessage(
				"*******End Customer Engage TC_CTI_AdminSMS_Call_Fax_Tab_Validation_SMS_MMS_Inbound***************");
		TabSwitchToParent();
		ExtentSuccessMessage(
				"*******Start Customer Engage TC_CTI_AdminSMS_Call_Fax_Tab_Validation_SMS_MMS_Outbound***************");
		Thread.sleep(2000);
		TelephonyPage.NavigateToTelephonySetpPage();
		Thread.sleep(2000);
		TelephonyPage.ClickOnCallSMSFAXLogsManagement();
		// driver.manage().window().maximize();
		RefreshPage();
		Thread.sleep(5000);
		ClickOnMinimizeCallwindow();
		Thread.sleep(2000);
		TelephonyPage.ClickOnSMSLogs();
		waitForElement(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(SMSType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on SMS type");
		waitForElement(2000);
		By Outboundsms = By.xpath("//span[normalize-space()='Outbound SMS']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Outboundsms));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Outbound sms button");

//		TelephonyPage.ClickOnSMSTypeFilter();
//		Thread.sleep(2000);
//		waitVisibility(SMSTypeOutbondsms);
//		click(SMSTypeOutbondsms);
//		Thread.sleep(5000);
		TelephonyPage.EnterSearchBar(NumberOutput);
		Thread.sleep(5000);
		validateSMSLogsTime(time);
		validateMisscalledDetails(NumberOutput);
		validateMisscalledDetails(UserNumberforCTI);
		validateMisscalledDetails(textmsg);
		// splitthewindowscreen2("Right");
		Thread.sleep(2000);
		logout_CE_validations();
		TabSwitchToChild();
		ExtentSuccessMessage("*******End Customer Engage TC_CTI_AdminSMS_Call_Fax_Tab_Validation_SMS_MMS_Outbound***************");

	}

	public void validate_InboundSMSOnSSE_notification_CTI_Logs_Email_notifiation()
			throws InterruptedException, IOException {
		String Firstmsg = "First Hello, These is Automated Text!!!";
		String Secondmsg = "2nd Hello, These is Automated Text!!!";
		currenturl();
		// splitthewindowscreen2("Right");//login QU1
		new_Window();
		// maximizeWindow();
		// splitthewindowscreen2("Left");
		secondUser_Call();
		login_CE_validations();
		User();
		TabSwitchToParent();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println(NumberOutput);
		ExtentSuccessMessage("Number of First user is :" + NumberOutput);
		SendSMS(Firstmsg);
		ExtentSuccessMessage("*******Start Inbound SMS On SSE_notification Tab***************");
		TabSwitchToChild();
		By MissedsmsPopup = By.xpath(
				"//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight'] | //a[@title='Message']//span[@class='label label-warning ng-binding']");
		if (ElementDisplayed(MissedsmsPopup)) {
			Assert.assertTrue(driver.findElement(MissedsmsPopup).isDisplayed());
			ExtentSuccessMessage("Successfully user able to See the 'Missed sms Popup' ");
		} else if (ElementDisplayed(MissedsmsPopup)) {
			waitVisibility(MissedsmsPopup);
			Assert.assertTrue(driver.findElement(MissedsmsPopup).isDisplayed());
			ExtentSuccessMessage("Successfully user able to See the 'Missed sms Popup' ");
		} else {
			ExtentSuccessMessage("UNSuccessfully user not able to See the 'Missed sms Popup' ");
		}
		ExtentSuccessMessage("Assertion for missed SMS popup is done");
		ExtentSuccessMessage("*******End Inbound SMS On SSE_notification Tab***************");
		ExtentSuccessMessage("*******Start Inbound SMS On CTI Logs Tab***************");

		inboundsmsvalidation();
		ExtentSuccessMessage("*******End Inbound SMS On CTI Logs Tab***************");

		ExtentSuccessMessage("*******Start Inbound SMS On Email Notification Tab***************");

		Changed_Status();
		TabSwitchToParent();
		RefreshPage();
		Thread.sleep(30000);
		SendSMS(Secondmsg);
		TabSwitchToChild();
		//		TelephonyPage.NavigateToUSerTab();
		//		Thread.sleep(5000);
		//
		//		// driver.manage().window().maximize();
		//		RefreshPage();
		//		Thread.sleep(15000);
		//		TelephonyPage.EnterSearchBar(Username1);
		//		Thread.sleep(15000);
		//		By Emial = By.xpath("(//*[contains(text(),'@yopmail.com')])[1]");
		//		String EmailID = GetElementText(Emial);
		//		yopmail_validation(EmailID);
		//		driver.close();
		//		//driver.manage().window().maximize();
		//		RefreshPage();		
		//		Thread.sleep(15000);
		//		ClickOnMinimizeCallwindow();
		//		TelephonyPage.EnterSearchBar(Username1);
		//		Thread.sleep(15000);
		//		By Email = By.xpath("(//*[contains(text(),'@yopmail.com')])[1]");
		//		String EmailID =GetElementText(Email);
		//		System.out.println(EmailID);
		//		yopmail_validation(EmailID);
		//		driver.close();

		TabSwitchToParent();
		logout_CE_validations();
		TabSwitchToChild();
		ExtentSuccessMessage("*******End Inbound SMS On Email Notification Tab***************");
		ExtentSuccessMessage("*******End Customer Engage TC_CTI_AdminSMS_Call_Fax_Tab_Validation_SMS_MMS_Inbound***************");

	}

	public void yopmail_validation(String mail) throws InterruptedException {
		new_Tab();
		waitForElement(3000);

		driver.get("https://yopmail.com/wm");
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(YopmailInbox));
		MoveToElementClick(element);
		//		String getemail = null;
		//		String CEMail = getemail;
		//		writeText(YopmailInbox, CEMail);
		System.out.println(mail);
		String CEuseroneMail = mail;
		writeText(YopmailInbox, CEuseroneMail);
		ExtentSuccessMessage("Navigated to mailbox");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(YopmailSubmit));
		MoveToElementClick(element);
		ExtentSuccessMessage("Navigated to inbox of agent email");
		waitForElement(15000);
		driver.switchTo().frame("ifmail");
		waitForElement(1000);
		By NewVoiceMailTitle = By.xpath("//div[@class='ellipsis nw b f18']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NewVoiceMailTitle));
		String expectedProduct = element.getText();
		System.out.println(expectedProduct);
		Assert.assertTrue(expectedProduct.contains("New VoiceMail From"));
		ExtentSuccessMessage("Assertion for voice mail has been done");

		TabSwitchToChild();

	}

	public void validate_MissedCallOnAdminlogsTab() throws InterruptedException, IOException {
		URL = driver.getCurrentUrl();
		System.out.println("Current URL = " + URL);
		// splitthewindowscreen2("Right");//login QU1
		new_Window();
		// maximizeWindow();
		// splitthewindowscreen2("Left");
		secondUser_Call();
		login_CE_validations();
		User();
		Changed_Status();
		TabSwitchToParent();
		valid_Number();
		TabSwitchToChild();
		Thread.sleep(3000);
		TelephonyPage.NavigateToTelephonySetpPage();
		Thread.sleep(5000);
		TelephonyPage.ClickOnCallSMSFAXLogsManagement();
		// driver.manage().window().maximize();
		RefreshPage();
		Thread.sleep(7000);
		//ClickOnMinimizeCallwindow();
		Thread.sleep(10000);
		By CallType = By.xpath("(//div[@class='accordion-container grid-style-height'])[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call type");
		waitForElement(2000);
		By Missedcall = By.xpath("//md-checkbox[@value='Missed Call,Missed Call Group']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Missedcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Missed call button");
		Thread.sleep(5000);
		// splitthewindowscreen2("Left");
		ClickOnMinimizeCallwindow();
		TelephonyPage.EnterSearchBar(UserNumberforCTI);
		Thread.sleep(5000);
		validateCallLogsTime(time);
		validateMisscalledDetails(UserNumberforCTI);
		logout_CE_validations();
		TabSwitchToParent();
		TelephonyPage.ClickOnMinimizeCallwindow();
	}

	public void validateMisscalledDetails(String Value) throws InterruptedException {
		By elements = By.xpath("(//*[@class='ui-grid-canvas']//*[contains(text(),'" + Value + "')])[1]");
		if (ElementDisplayed(elements)) {
			ExtentSuccessMessage("Successfully user able to See the '" + Value + "'inside the web table ");

		} else {
			String Values[] =Value.split(":");
			String Valuesj[]=Values[1].split(" ");
			int Minute =Integer.valueOf(Valuesj[0]);
			int Minutes=Minute+1;
			String newvalue=Values[0]+":"+Minutes+" "+Valuesj[1];
			System.out.println("newvalue:-"+newvalue);
			By element = By.xpath("(//*[@class='ui-grid-canvas']//*[contains(text(),'" + newvalue + "')])[1]");
			if (ElementDisplayed(element)) {
				ExtentSuccessMessage("Successfully user able to See the '" + newvalue + "'inside the web table ");
			} else {			
				ExtentErrorMessage("Unsuccessfully  '" + newvalue + "' Not visible inside the web table");
			}
		}

	}

	public static boolean areTimesMatching(String time1, String time2, int tolerance) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");

		try {
			// Parse both times into LocalTime objects
			LocalTime t1 = LocalTime.parse(time1, formatter);
			LocalTime t2 = LocalTime.parse(time2, formatter);

			// Calculate the absolute difference in minutes
			long differenceInMinutes = Math.abs(Duration.between(t1, t2).toMinutes());

			// Return true if the times match exactly or are within the tolerance
			return differenceInMinutes <= tolerance;

		} catch (Exception e) {
			// Handle parsing errors
			System.err.println("Error parsing times: " + e.getMessage());
			return false;
		}
	}

	public static boolean areTimesMatching1(String time1, String time2, int tolerance) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mma");

		try {
			// Parse both times into LocalTime objects
			LocalTime t1 = LocalTime.parse(time1, formatter);
			LocalTime t2 = LocalTime.parse(time2, formatter);

			// Calculate the absolute difference in minutes
			long differenceInMinutes = Math.abs(Duration.between(t1, t2).toMinutes());

			// Return true if the times match exactly or are within the tolerance
			return differenceInMinutes <= tolerance;

		} catch (Exception e) {
			// Handle parsing errors
			System.err.println("Error parsing times: " + e.getMessage());
			return false;
		}
	}

	public void validateCallLogsTime(String Value) throws InterruptedException {
		System.out.println("Time = " + Value);
		// By elements =By.xpath("(//div[contains(.,'"+Value+"')])[14]");
		By elements = By.xpath("(//div[@role='gridcell'])[7]");
		waitForElement(7000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(elements));
		String time1 = element.getText();
		System.out.println("Time1 = " + time1);
		String timeString = StringUtils.substringAfter(time1, " ");
		System.out.println("---------" + timeString);
		System.out.println("---------" + time);
		boolean isTimeMatching = areTimesMatching(timeString, time, 1);
		System.out.println(isTimeMatching);
		if (isTimeMatching) {
			System.out.println("Times match or are within the acceptable range.");
			ExtentSuccessMessage("Times match or are within the acceptable range.");
		} else {
			System.err.println("Times do not match.");
			ExtentErrorMessage("Times do not match.");
		}
	}
	
	public void validateCTICallLogsTime(String Value) throws InterruptedException {
		System.out.println("Time = " + Value);
		// By elements =By.xpath("(//div[contains(.,'"+Value+"')])[14]");
		By elements = By.xpath("(//span[@class='call-time-section'])[1]");
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(elements));
		String time1 = element.getText();
		System.out.println("Time1 = " + time1);
		String Timesd =RemoveSeconds(time1);
//		String timeString = StringUtils.substringAfter(time1, " ");
		System.out.println("---------" + Timesd);
		System.out.println("---------" + Value);
		boolean isTimeMatching = areTimesMatching(Timesd, Value, 1);
		System.out.println(isTimeMatching);
		if (isTimeMatching) {
			System.out.println("Times match or are within the acceptable range.");
			ExtentSuccessMessage("Times match or are within the acceptable range.");
		} else {
			System.err.println("Times do not match.");
			ExtentErrorMessage("Times do not match.");
		}
	}

	public void validateSMSLogsTime(String Value) throws InterruptedException {
		System.out.println("Time = " + Value);
		// By elements =By.xpath("(//div[contains(.,'"+Value+"')])[14]");
		By elements = By.xpath("(//div[@role='gridcell'])[6]");
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(elements));
		String time1 = element.getText();
		System.out.println("Time1 = " + time1);
		String timeString = StringUtils.substringAfter(time1, " ");
		System.out.println("---------" + timeString);
		System.out.println("---------" + time);
		boolean isTimeMatching = areTimesMatching(timeString, time, 1);
		System.out.println(isTimeMatching);
		if (isTimeMatching) {
			System.out.println("Times match or are within the acceptable range.");
			ExtentSuccessMessage("Times match or are within the acceptable range.");
		} else {
			System.err.println("Times do not match.");
			ExtentErrorMessage("Times do not match.");
		}
	}

	public void validate_parent_Missedcall() throws InterruptedException {
		waitForElement(2000);
		By MissedCallSection = By.xpath("//a[@title='Missed Calls']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCallSection));
		MoveToElementClick(element);

		waitForElement(3000);
		By TimeCount = By.xpath("(//i[@class='time-cont'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
		String count = element.getText();
		System.out.println(count);
		String timeString = StringUtils.substringAfter(count, " ");
		System.out.println("---------" + timeString);

		//		waitForElement(5000)
		//		Assert.assertTrue(quickdialtime.contains(timeString));
		//		ExtentSuccessMessage("Assertion for quick call is done for second user");
		//		

		boolean isTimeMatching = areTimesMatching(quickdialtime, timeString, 1);
		System.out.println(isTimeMatching);

		if (isTimeMatching) {
			System.out.println("Times match or are within the acceptable range.");
			ExtentSuccessMessage("Times match or are within the acceptable range.");

		} else {
//			System.err.println("Times do not match.");
//			ExtentErrorMessage("Times do not match.");

		}

		ExtentSuccessMessage("Assertion for missed call time is done");

		By Message = By.xpath("//a[@title='Message']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Message));
		MoveToElementClick(element);

		By MessageTime = By.xpath("(//div[@class='timer-section ng-binding'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MessageTime));
		String time1 = element.getText();
		String timeString1 = StringUtils.substringAfter(time1, " ");
		System.out.println(timeString1);

		waitForElement(3000);
		Assert.assertTrue(quickmessage.contains(timeString1));
		ExtentSuccessMessage("Assertion for quick message is done for first user");

		boolean isTimeMatching1 = areTimesMatching(quickmessage, timeString1, 1);
		System.out.println(isTimeMatching1);

		if (isTimeMatching1) {
			System.out.println("Times match or are within the acceptable range.");
//			ExtentSuccessMessage("Times match or are within the acceptable range.");

		} else {
//			System.err.println("Times do not match.");
//			ExtentErrorMessage("Times do not match.");

		}

	}

	public void valid_Number() throws InterruptedException {

		waitForElement(4000);
		By CTIInputField = By.xpath(
				"//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");

		String CEUserValidNumber = UserNumberforCTI;
		writeText(CTIInputField, CEUserValidNumber);
		ExtentSuccessMessage("Number has been in input field" + CEUserValidNumber);

		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");
		time = Currenttime();
		System.out.println(time);

		time2 = removeLeadingZero(time);
		System.out.println(time2);

	}

	public void validate_MissedCall() throws InterruptedException {

		waitForElement(4000);
		By CTIInputField = By.xpath(
				"//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");

		String CEUserValidNumber = firstnumber;
		writeText(CTIInputField, CEUserValidNumber);
		ExtentSuccessMessage("Number has been in input field" + CEUserValidNumber);

		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");
		String time = CurrentTime();
		System.out.println(time);

		String time2 = removeLeadingZero(time);
		System.out.println(time2);

		TabSwitchToParent();

		waitForElement(5000);
		By CallDeclineButton = By
				.xpath("(//button[@class='voice-call-green-button-small fa fa-phone voice-decline'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been declined");

		waitForElement(4000);
		By MissedCallPopup = By
				.xpath("//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight']");
		Assert.assertTrue(driver.findElement(MissedCallPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for missed call popup is done");
 
		TabSwitchToChild();
		waitForElement(2000);
		By Decline = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Decline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been declined");

		String declinetime = CurrentTime();
		System.out.println(declinetime);

		String declinetime2 = removeLeadingZero(declinetime);
		System.out.println(declinetime2);

		waitForElement(5000);
		Thread.sleep(5000);
		try {

			By element2 = By.xpath("(//label[@class='label-header-main'])[1]");
			if (driver.findElement(element2).isDisplayed()) {
				By CancelButton = By.xpath("//button[@name='Cancel']");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CancelButton));
				MoveToElementClick(element);
				ExtentSuccessMessage("Clicked on Cancel Button");

			}
		} catch (NoSuchElementException e) {
		} catch (Exception e) {
			ExtentSuccessMessage("Lead Dsposition Not Visible");
		}

		TabSwitchToParent();

		waitForElement(8000);
		By MissedCallCount = By.xpath("//a[@title='Missed Calls']/span[@class='label label-warning ng-binding']");
		Assert.assertTrue(driver.findElement(MissedCallCount).isDisplayed());
		ExtentSuccessMessage("Assertion for missed call Count is done");

		waitForElement(2000);
		By MissedCallSection = By.xpath("//a[@title='Missed Calls']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCallSection));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Missed Call Section");

		By MissedCallValidation = By.xpath("//u[contains(.,'" + declinetime2 + "')]");
		System.out.println(MissedCallValidation);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCallValidation));
		ExtentSuccessMessage("Missed Call is Visible under MissedCa;; Section");

		ExtentSuccessMessage("Assertion for missed call time is done");

		waitForElement(1000);
		By QuickDial = By.xpath(
				"(//button[@class='voice-call-green-button-small fa fa-phone voice-decline message-list-icon fa fa-arrow-left red-color'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(QuickDial));
		MoveToElementClick(element);
		ExtentSuccessMessage("Quick dial has been clicked");

		quickdialtime = CurrentTime();
		System.out.println(quickdialtime + "quickdialtime");

		String quickdialtime2 = removeLeadingZero(quickdialtime);
		System.out.println(quickdialtime2);

		waitForElement(15000);
		By CallDisconnectButton = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDisconnectButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Quick dialer has been verified");

		waitForElement(10000);
		Thread.sleep(5000);
		try {

			By element2 = By.xpath("(//label[@class='label-header-main'])[1]");
			if (driver.findElement(element2).isDisplayed()) {
				By CancelButton = By.xpath("//button[@name='Cancel']");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CancelButton));
				MoveToElementClick(element);
				ExtentSuccessMessage("Clicked on Cancel Button");

			}
		} catch (NoSuchElementException e) {
		} catch (Exception e) {
			ExtentSuccessMessage("Lead Dsposition Not Visible");
		}

		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCallSection));
		MoveToElementClick(element);

		waitForElement(3000);
		By QuickMessage = By.xpath("(//i[@title='Send Message'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(QuickMessage));
		MoveToElementClick(element);

		waitForElement(2000);
		By MessageTextField = By
				.xpath("(//textarea[@class='new-message-textarea ng-pristine ng-untouched ng-valid ng-empty'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MessageTextField));
		MoveToElementClick(element);
		String message = "Sorry I am unable to answer your call now!!";
		writeText(MessageTextField, message);

		waitForElement(2000);
		By SendMessageButton = By.xpath("(//a[@title='Send Message'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SendMessageButton));
		MoveToElementClick(element);

		quickmessage = CurrentTime();
		System.out.println(quickmessage + "quickMessage");

		String quickmessage1 = removeLeadingZero(quickmessage);
		System.out.println(quickmessage1);

		waitForElement(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCallSection));
		MoveToElementClick(element);

		waitForElement(2000);
		By InputSearchField = By.xpath("(//input[@placeholder='Search'])[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(InputSearchField));
		MoveToElementClick(element);
		String number = UserNumberforCTI;
		System.out.println(number);
		writeText(InputSearchField, number + Keys.ENTER);

		waitForElement(1000);
		By Time = By.xpath("(//i[@class='time-cont'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Time));
		String time1 = element.getText();

		String timeString2 = StringUtils.substringAfter(time1, " ");
		waitForElement(5000);
		Assert.assertTrue(time1.contains(timeString2));
		ExtentSuccessMessage("Assertion for serach number is done");

		waitForElement(2000);
		By ClearSection = By.xpath("(//i[@class='fa fa-close ng-scope'])[4]");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClearSection));
		MoveToElementClick(element);

		String number1 = StringUtils.substringAfter(firstnumber, " ");
		System.out.println(number1);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(InputSearchField));
		MoveToElementClick(element);
		writeText(InputSearchField, number1 + Keys.ENTER);

		waitForElement(2000);
		By CallList = By.xpath("//ul[@class='voice-team-members-list records8 missed-call-list no-name to-text']");
		Assert.assertTrue(driver.findElement(CallList).isDisplayed());
		ExtentSuccessMessage("Missed call after search is present");

		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClearSection));
		MoveToElementClick(element);

		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(InputSearchField));
		MoveToElementClick(element);
		String name = "Auto Lead";
		writeText(InputSearchField, name + Keys.ENTER);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClearSection));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(InputSearchField));
		MoveToElementClick(element);
		String name1 = "Lead";
		writeText(InputSearchField, name1 + Keys.ENTER);

		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClearSection));
		MoveToElementClick(element);

		logout_CE_validations();
		TabSwitchToChild();

		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCallSection));
		MoveToElementClick(element);

		waitForElement(3000);
		By TimeCount = By.xpath("//u[contains(.,'" + quickdialtime2 + "')]");
		System.out.println(TimeCount);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
		ExtentSuccessMessage("Quick dail is visible under missed call");
		ExtentSuccessMessage("Assertion for missed call time is done");

		By Message = By.xpath("//a[@title='Message']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Message));
		MoveToElementClick(element);

		By MessageTime = By.xpath("(//div[contains(.,'" + quickmessage1 + "')])[9]");
		System.out.println(MessageTime);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MessageTime));
		ExtentSuccessMessage("Assertion for Quick Message is Done");

	}


	public String CurrentTime() {
		// Set the time zone to USA Eastern Time (New York)
		ZoneId zoneId = ZoneId.of("America/New_York");
		// Get current time in the specified time zone
		LocalTime currentTime = LocalTime.now(zoneId);
		// Define a time formatter to format the time as needed
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
		// Format the current time
		String formattedTime = currentTime.format(formatter);
		// Print the formatted time
		System.out.println("Current time in USA (Eastern Time - New York): " + formattedTime);
		return formattedTime;
	}
	
	public String Currenttime() {
		// Set the time zone to USA Eastern Time (New York)
		ZoneId zoneId = ZoneId.of("America/New_York");
		// Get current time in the specified time zone
		LocalTime currentTime = LocalTime.now(zoneId);
		// Define a time formatter to format the time as needed
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
		// Format the current time
		String formattedTime = currentTime.format(formatter);
		// Print the formatted time
		System.out.println("Current time in USA (Eastern Time - New York): " + formattedTime);
		return formattedTime;
	}
	
	public String CurrentTimes() {
		// Set the time zone to USA Eastern Time (New York)
		ZoneId zoneId = ZoneId.of("America/New_York");
		// Get current time in the specified time zone
		LocalTime currentTime = LocalTime.now(zoneId);		
		// Define a time formatter to format the time as needed
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		// Format the current time
		String formattedTime = currentTime.format(formatter);
		// Print the formatted time
		System.out.println("Current time in USA (Eastern Time - New York): " + formattedTime);
		return formattedTime;
	}

	public String CurrentTime2() {
		// Set the time zone to USA Eastern Time (New York)
		ZoneId zoneId = ZoneId.of("America/New_York");
		// Get current time in the specified time zone
		LocalTime currentTime = LocalTime.now(zoneId);
		// Define a time formatter to format the time as needed
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
		// Format the current time
		String formattedTime = currentTime.format(formatter);
		// Print the formatted time
		System.out.println("Current time in USA (Eastern Time - New York): " + formattedTime);
		return formattedTime;
	}

	public void FileUpload(String Path) throws InterruptedException, AWTException {
		Robot robot = new Robot();
		String filePath = System.getProperty("user.dir") + Path;// Upload/Commission-Setup-Criteria-Percentage.xlsx
		StringSelection stringSelection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);

		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		ExtentSuccessMessage("File is been Uploaded");
		waitForElement(3000);
	}

	public void fetchNumber1() throws InterruptedException {
		Thread.sleep(10000);
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber));
		firstnumber = element.getText();
		System.out.println("FirstNumber" + firstnumber);

		Thread.sleep(3000);
		URL = driver.getCurrentUrl();
		System.out.println(URL);

		By UserName = By.xpath("//span[@class='profile-name drag-not-allowed ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserName));
		username = element.getText();
		System.out.println(username);

	}

	public void User1() throws InterruptedException {
		Thread.sleep(10000);
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber));
		firstnumber = element.getText();
		System.out.println("FirstNumber" + firstnumber);
		URL = driver.getCurrentUrl();
		System.out.println("Current URL = " + URL);

	}


	public void fetchNumber2() throws InterruptedException {
		Thread.sleep(6000);
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber));
		secondnumber = element.getText();
		System.out.println("Second number" + secondnumber);

	}

	public void User2() throws InterruptedException
	{
		Thread.sleep(6000);
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		waitVisibility(UserNumber);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber));
		secondnumber=element.getText();
		System.out.println("Second number" +secondnumber);

	}

	public void fetchNumber3() throws InterruptedException {
		Thread.sleep(4000);
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber));
		thirdnumber = element.getText();
		System.out.println("Second number" + thirdnumber);

	}

	public void User3() throws InterruptedException {
		Thread.sleep(4000);
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber));
		thirdnumber = element.getText();
		System.out.println("Second number" + thirdnumber);

	}


	public void transferAssertion() throws InterruptedException {

		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, NumberOutput);
		ExtentSuccessMessage("Assertion has been done");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButtoninQualatia2));
		MoveToElementClick(element);

		Thread.sleep(12000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButtonInQualtia2));
		MoveToElementClick(element);

		By LeadCancelButton = By.xpath("//button[@class='grey pull-right md-button md-button']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadCancelButton));
		MoveToElementClick(element);

		waitForElement(6000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);// clicking on DashBoard tiles

	}

	public void Admin_redirection() throws InterruptedException {
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		Thread.sleep(2000);
		By Admin_Tile = By.xpath("(//a[@class='glyphicon fa fa-fw fa-black-tie'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(3000);

	}

	public void Telephone_Setup() throws InterruptedException {
		By Telephonesetup = By.xpath("//a[@href='#/admin/manage-account']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);

		By Click_On_Viewcall = By.xpath("//button[@id='viceCallLogsBtn']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Viewcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");
		Thread.sleep(5000);

	}

	public void transfer_Assertion_OnCall() throws InterruptedException {

		waitForElement(2000);
		By CallAccept = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAccept));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been accepted from third user and call is connected");

		waitForElement(2000);
		By MuteButton = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > div.voice-call-ongoing-quick-icons > a:nth-child(1) > i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MuteButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked On Mute Button");

		waitForElement(2000);
		By UnmuteButton = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > div.voice-call-ongoing-quick-icons > a:nth-child(2) > i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UnmuteButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked On UNMute Button");

		waitForElement(2000);
		By HoldButton = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > div.voice-call-ongoing-quick-icons > a:nth-child(4) > i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(HoldButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked On Hold Button");

		waitForElement(2000);
		By UnHoldButton = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > div.voice-call-ongoing-quick-icons > a:nth-child(5) > i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UnHoldButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked On UNHold Button");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransferButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked On CallTransfer Button");

		Thread.sleep(3000);
		By InputField = By.xpath("(//input[@placeholder=' Enter Phone Number or Click the icon '])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(InputField));
		MoveToElementClick(element);
		writeText(InputField, secondnumber);
		ExtentSuccessMessage("Entered the Number for Transfer");

		Thread.sleep(3000);
		By CallForward = By
				.cssSelector("#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallForward));
		MoveToElementClick(element);

		TabSwitchToChild();
		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		System.out.println(secondnumber);
		Assert.assertEquals(NumberOutput1, thirdnumber);
		ExtentSuccessMessage("Assertion has been done");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButtoninQualatia2));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been accepted by qualitia.test2");

		TabSwitchToParent();
		By WarmTransfer = By
				.xpath("//button[@class='voice-call-green-button-small fa fa-phone fa fa-code-fork blue-bg']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(WarmTransfer));
		MoveToElementClick(element);
		ExtentSuccessMessage("Warm transfer has been clicked");

		TabSwitchToChild();

		By LeadOnCTI = By.xpath("(//a[@title='Lead'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadOnCTI));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Leads on CTI Dialer");

		Thread.sleep(12000);
		By LeadTab = By.xpath("(//div[@class='tab-content'])[1]");
		Assert.assertTrue(driver.findElement(LeadTab).isDisplayed());
		ExtentSuccessMessage("User has been navigated to lead section");

		By CustomerTab = By.xpath("(//a[@title='Customer'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomerTab));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer on CTI Dialer");

		Thread.sleep(12000);
		Assert.assertTrue(driver.findElement(LeadTab).isDisplayed());
		ExtentSuccessMessage("User has been navigated to Customer section");

		Thread.sleep(4000);
		By CallEndButton = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallEndButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call end button and call has been ended");

	}

	public void confrence_Validation() throws InterruptedException, ParseException, java.text.ParseException {

		TabSwitchToParent();

		waitForElement(2000);
		By CTIInputField = By.xpath(
				"//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		String number = secondnumber;
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Input field has been clicked and number has been entered");

		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked and call has been triggered");

		TabSwitchToThirdWindow();

		By FirstUserNumber = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-incoming-window > div.voice-call-ongoing-number");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FirstUserNumber));
		String number1 = element.getText();
		System.out.println(number1);

		Assert.assertEquals(number1, firstnumber);
		ExtentSuccessMessage("First User number is been displayed and ");

		By CallAccept = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAccept));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been accepted from third user and call is connected");

		TabSwitchToParent();

		By TransferButton = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > div.voice-call-ongoing-quick-icons > a:nth-child(6) > i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Transfer Button has been clicked ");

		waitForElement(3000);
		By numberSearchField = By.xpath("(//input[@placeholder=' Enter Phone Number or Click the icon '])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(numberSearchField));
		MoveToElementClick(element);
		writeText(numberSearchField, UserNumberforCTI);
		ExtentSuccessMessage("Number has been entered for confrence");

		waitForElement(2000);
		By CallTransferbutton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransferbutton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Number has been entered for confrence and call button has been clicked");

		String time = CurrentTime();
		System.out.println(time);

		TabSwitchToChild();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAccept));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been accepted from second user");

		waitForElement(1000);
		By MinmizeCTI = By.xpath("//a[@class='fa fa-minus right-al']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MinmizeCTI));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on CTI Minimize icon");

		waitForElement(1000);
		By AdminTile = By.xpath("//a[@class='glyphicon fa fa-fw fa-black-tie']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AdminTile));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on AdminTile");

		waitForElement(3000);
		By TelephonySetup = By.cssSelector(
				"#NavigationMenuRegion > div > div.col-md-12.subcontsection.pad-lt.pad-rt.pull-right.overflow-visible.dashboard > div.col-md-12.pull-left.pad-lt > div > ul > li.admin-box.box.animate-box.fade-in > ul > li:nth-child(2) > a");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TelephonySetup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Telephony setup");

		waitForElement(2000);
		By calllog = By.id("viceCallLogsBtn");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(calllog));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call/SMS/FAX Logs Management");

		waitForElement(2000);
		By CallType = By.xpath("(//div[@class='accordion-container grid-style-height'])[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call type");

		By Transferedcall = By.xpath("//md-checkbox[@name='Transferred Call']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Transferedcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfered call button");

		By Time = By.xpath("(//div[@class='ui-grid-cell-contents ng-binding ng-scope'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Time));
		String admintime = element.getText();
		System.out.println(admintime);

		String timeString = StringUtils.substringAfter(admintime, " ");
		System.out.println("---------" + timeString);

		waitForElement(4000);
		Assert.assertTrue(time.contains(timeString));

		By Transferred = By.xpath("(//div[@class='ng-isolate-scope'])[12]/div[1]/div[contains(.,' Transferred')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Transferred));
		String transfer = element.getText();
		System.out.println(transfer);

		Assert.assertEquals(transfer, "Transferred");
		ExtentSuccessMessage("Assertion for Transferedcall is done in admin section and call is Transfered call");

		waitForElement(1000);
		By MaximzeCTI = By.xpath("//a[@title='Maximize']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MaximzeCTI));
		MoveToElementClick(element);
		ExtentSuccessMessage("CTI has been maximized");

		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been declined");

		waitForElement(2000);
		By CallLogs = By.xpath("//a[@title='Call Logs']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallLogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on call logs");

		By TimeInCTI = By.xpath("//u[@class='message-time date-txt drag-not-allowed ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeInCTI));
		MoveToElementClick(element);
		String ctitime = element.getText();
		System.out.println(ctitime);

		String timeString1 = StringUtils.substringAfter(ctitime, " ");
		System.out.println("---------" + timeString1);
		waitForElement(3000);
		// Assert.assertTrue(time.contains(timeString1));
		ExtentSuccessMessage("Transfred call is been display in CTI CallLog Status");

		By TimeCount = By.xpath("//u[@class='message-time date-txt drag-not-allowed ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
		String count = element.getText();
		System.out.println(count);
		String timeString2 = StringUtils.substringAfter(count, " ");
		System.out.println("---------" + timeString);
		String Formatted_Time = removeSeconds(timeString2);
		System.out.println("---------" + Formatted_Time);

		waitForElement(8000);
		Assert.assertTrue(time.contains(Formatted_Time));
		ExtentSuccessMessage("Assertion for Outbound confrence is done in CTI");

	}

	public static String removeSeconds(String timeStr) throws ParseException, java.text.ParseException {
		// Define the input and output date formats
		SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ss a");
		SimpleDateFormat outputFormat = new SimpleDateFormat("hh:mm a");

		// Parse the input time string to a Date object
		Date date = inputFormat.parse(timeStr);

		// Format the Date object to the desired output format
		return outputFormat.format(date);
	}

	public void Admin_Validations_Calltransfer() {
		By Call_State = By.xpath("(//div[@class='ng-scope'][normalize-space()='Transferred'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_State));
		ExtentSuccessMessage("Call Transfered succesfuly validated");

		By Transfer_State = By.xpath("(//div[@title='Yes'][normalize-space()='Yes'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Transfer_State));
		ExtentSuccessMessage("Call Transfered State succesfuly validated");

	}

	public void Admin_Validations() {

	}

	public void transferCall() throws InterruptedException {

		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(1000);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransferButton));
		MoveToElementClick(element);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransferButtonToQualtia2));
		MoveToElementClick(element);

	}

	public void transferCall_Admin() throws InterruptedException {

		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(1000);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransferButton));
		MoveToElementClick(element);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransferButtonToQualtia1));
		MoveToElementClick(element);

	}

	public void valid_Transfer() throws IOException, InterruptedException {

		String Url = configloader().getProperty("URL");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println(NumberOutput);
		ExtentSuccessMessage("Number of First user is :" + NumberOutput);

		waitForElement(2000);
		By CTIInputField = By.xpath(
				"//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");

		if (Url.contains("https://mme.brokerengage.net/")) {
			String QualitiaValidNumber = "(850) 880-8396";
			writeText(CTIInputField, QualitiaValidNumber);
			ExtentSuccessMessage("Number has been in input field" + QualitiaValidNumber);

			By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Call button has been clicked");

		}

		else if (Url.contains("https://ce-qa.benefitalign.com/")) {

			String QualitiaValidNumber = "(479) 333-1769";// Qualatia test 1
			writeText(CTIInputField, QualitiaValidNumber);
			ExtentSuccessMessage("Number has been in input field" + QualitiaValidNumber);

			By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Call button has been clicked");

		}

		else if (Url.contains("https://ce-uat.benefitalign.com/")) {

			String QualitiaValidNumber = "(386) 703-3867";
			writeText(CTIInputField, QualitiaValidNumber);
			ExtentSuccessMessage("Number has been in input field" + QualitiaValidNumber);

			By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Call button has been clicked");
		}

		else {

			System.out.println("DEV ENV");

		}

		Thread.sleep(3000);

	}

	public void valid_Transfer_Admin() throws IOException, InterruptedException {

		String Url = configloader().getProperty("URL");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println(NumberOutput);
		ExtentSuccessMessage("Number of First user is :" + NumberOutput);

		waitForElement(2000);
		By CTIInputField = By.xpath(
				"//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");

		if (Url.contains("https://mme.brokerengage.net/")) {
			String QualitiaValidNumber = "(850) 880-8396";
			writeText(CTIInputField, QualitiaValidNumber);
			ExtentSuccessMessage("Number has been in input field" + QualitiaValidNumber);

			By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Call button has been clicked");

		}

		else if (Url.contains("https://ce-qa.benefitalign.com/")) {

			String QualitiaValidNumber = "(386) 703-3867";// Qualatia test 2
			writeText(CTIInputField, QualitiaValidNumber);
			ExtentSuccessMessage("Number has been in input field" + QualitiaValidNumber);
		}

		else if (Url.contains("https://ce-qa.benefitalign.com/")) {

			String QualitiaValidNumber = "(479) 333-1769";
			writeText(CTIInputField, QualitiaValidNumber);
			ExtentSuccessMessage("Number has been in input field" + QualitiaValidNumber);

			By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Call button has been clicked");

		}

		else if (Url.contains("https://ce-uat.benefitalign.com/")) {

			String QualitiaValidNumber = "(386) 703-3867";
			writeText(CTIInputField, QualitiaValidNumber);
			ExtentSuccessMessage("Number has been in input field" + QualitiaValidNumber);

			By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Call button has been clicked");
		}

		else if (Url.contains("https://ce-uat.benefitalign.com/")) {

			String QualitiaValidNumber = "";
			writeText(CTIInputField, QualitiaValidNumber);
			ExtentSuccessMessage("Number has been in input field" + QualitiaValidNumber);

			By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Call button has been clicked");
		}

		else {

			System.out.println("DEV ENV");

		}

		Thread.sleep(3000);

	}

	public void valid_Transfer_ONCall() throws IOException, InterruptedException {

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println(NumberOutput);
		ExtentSuccessMessage("Number of First user is :" + NumberOutput);

		waitForElement(2000);
		By CTIInputField = By.xpath(
				"//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		String number = firstnumber;
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Input field has been clicked and number has been Entered");

		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

	}

	public void Confrence_Assertion() throws InterruptedException {

		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UatNumberinQualtia1));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, NumberOutput);
		ExtentSuccessMessage("Assertiion has been done for confrence");

		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Declined");

		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);

	}

	public void Confrence() throws InterruptedException {
		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UatNumberinQualtia1));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, NumberOutput);
		ExtentSuccessMessage("Assertiion has been done");

		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceAddButton));
		MoveToElementClick(element);

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceNumberField));
		MoveToElementClick(element);

		String currentSystemURL = driver.getCurrentUrl();

		if (currentSystemURL.contains("https://mme.brokerengage.net/")) {
			String CEUsertwoNumberInPP = "(850) 920-7465";
			writeText(ConfrenceNumberField, CEUsertwoNumberInPP);
		}

		else if (currentSystemURL.contains("https://ce-qa.benefitalign.com/")) {

			// only qa is added for now
			String CEUsertwoNumberInQA = "(850) 920-7465";
			writeText(ConfrenceNumberField, CEUsertwoNumberInQA);
		}

		else if (currentSystemURL.contains("https://ce-uat.benefitalign.com/")) {

			String CEUsertwoNumberINUat = "(386) 703-3867";
			writeText(ConfrenceNumberField, CEUsertwoNumberINUat);
		}

		else {

			System.out.println("DEV ENV");

		}

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallConfreanceButton));
		MoveToElementClick(element);
		Thread.sleep(1000);

	}

	public void splitthewindowscreen(String position) {
		// Get the screen dimensions
		Dimension screenSize = driver.manage().window().getSize();
		// Calculate the dimensions for each split
		int width = screenSize.getWidth() / 2;
		int height = screenSize.getHeight();

		if (position.toUpperCase().contains("RIGHT")) {
			// Set the window position and size for the second split
			driver.manage().window().setPosition(new Point(0, 0));
			driver.manage().window().setSize(new Dimension(width, height));
		}
		if (position.toUpperCase().contains("LEFT")) {
			// Set the window position and size for the first split
			driver.manage().window().setPosition(new Point(680, 0));
			driver.manage().window().setSize(new Dimension(width, height));
		}
	}

	public void splitthewindowscreen2(String position) {

		// Get the screen dimensions
		Dimension screenSize = driver.manage().window().getSize();
		// Calculate the dimensions for each split
		int width = screenSize.getWidth() / 2;
		int height = screenSize.getHeight();

		if (position.toUpperCase().contains("RIGHT")) {
			// Set the window position and size for the second split
			driver.manage().window().setPosition(new Point(0, 0));
			driver.manage().window().setSize(new Dimension(width, height));
		}
		if (position.toUpperCase().contains("LEFT")) {
			// Set the window position and size for the first split
			driver.manage().window().setPosition(new Point(680, 0));
			driver.manage().window().setSize(new Dimension(width, height));
		}
	}

	public void email_Field_Validation() throws InterruptedException, IOException {

		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);

		waitForElement(6000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AdminTile));
		MoveToElementClick(element);
		ExtentSuccessMessage("Agency Tile has been clicked");

		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AdminUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("Admin User has been clicked");

		waitForElement(2000);
		By UserSearchFiled = By.xpath(
				"//input[@class='ng-pristine ng-untouched md-input ng-empty ng-valid-minlength ng-valid-maxlength ng-valid ng-valid-required']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserSearchFiled));
		MoveToElementClick(element);
		String Username = configloader().getProperty("PLCA_UserName1");
		writeText(UserSearchFiled, Username + Keys.ENTER);

		waitForElement(2000);
		By UserMailSection = By.xpath("(//div[@class='ui-grid-cell-contents ng-binding ng-scope'])[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserMailSection));
		String EmailId = element.getText();
		System.out.println(EmailId);

		waitForElement(2000);
		Assert.assertTrue(driver.findElement(UserMailSection).isDisplayed());
		ExtentSuccessMessage("Assertion has been done that email is visible");

		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");

		By ProfileContact = By.xpath("//a[contains(.,'My Profile')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ProfileContact));
		MoveToElementClick(element);
		ExtentSuccessMessage("My profile has been selected");

		waitForElement(1000);
		By EmailSection = By.xpath(
				"//input[@class='ng-pristine ng-untouched ng-valid md-input ng-not-empty ng-valid-required ng-valid-email']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EmailSection));
		MoveToElementClick(element);
		getEmailValue = element.getAttribute("value");
		System.out.println(getEmailValue);

		waitForElement(1000);
		Assert.assertEquals(EmailId, getEmailValue);
		ExtentSuccessMessage("Assertion has been done and both mail are same");

	}

	public void perform_email_validation_for_missedcall() throws InterruptedException {
		waitForElement(4000);
		driver.get("https://yopmail.com/wm");
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(YopmailInbox));
		MoveToElementClick(element);
		String CEuseroneMail = "ceuserone@yopmail.com";
		writeText(YopmailInbox, CEuseroneMail);
		ExtentSuccessMessage("Navigated to mailbox");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(YopmailSubmit));
		MoveToElementClick(element);
		ExtentSuccessMessage("Navigated to inbox of agent email");
		waitForElement(15000);
		// element =
		// wait.until(ExpectedConditions.presenceOfElementLocated(YopmailInboxText));
		// MoveToElementClick(element);
		driver.switchTo().frame("ifmail");
		waitForElement(1000);
		By NewVoiceMailTitle = By.xpath("//div[@class='ellipsis nw b f18']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NewVoiceMailTitle));
		String expectedProduct = element.getText();
		System.out.println(expectedProduct);
		Assert.assertTrue(expectedProduct.contains("New VoiceMail From"));
		ExtentSuccessMessage("Assertion for voice mail has been done");
		// String parentWindowHandle = driver.getWindowHandle();
		// switchToNextTab(driver, parentWindowHandle);

	}

	public void missed_Call_UI() throws InterruptedException {

		Thread.sleep(3000);

		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been declined");

		waitForElement(3200);
		By MissedCallPopup = By
				.xpath("//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight']");
		Assert.assertTrue(driver.findElement(MissedCallPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for missed call popup is done");

		waitForElement(800);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);

	}

	public void missed_Call_Count() throws InterruptedException {

		Thread.sleep(5000);

		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Declined");

		waitForElement(3200);
		By MissedCallPopup = By
				.xpath("//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight']");
		Assert.assertTrue(driver.findElement(MissedCallPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for missed call popup is done");

		waitForElement(2000);
		By MissedCallCount = By.xpath("//a[@title='Missed Calls']/span[@class='label label-warning ng-binding']");
		Assert.assertTrue(driver.findElement(MissedCallCount).isDisplayed());
		ExtentSuccessMessage("Assertion for missed call Count is done");

		By MissedCallSection = By.xpath("//a[@title='Missed Calls']/span[@class='fa fa-phone']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCallSection));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on missed call section");

	}

	public void missedcall_Through_Mail() throws InterruptedException {

		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Declined");

		waitForElement(3200);
		By MissedCallPopup = By
				.xpath("//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight']");
		Assert.assertTrue(driver.findElement(MissedCallPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for missed call popup is done");
		Thread.sleep(5000);

	}

	public void Newly_Created_Profile() throws InterruptedException {
		waitForElement(4000);

		By CTIInputField = By.xpath(
				"//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");

		Assert.assertTrue(driver.findElement(CTIInputField).isDisplayed());
		ExtentSuccessMessage("Assertion for CTI Input Field is Done");

		waitForElement(1000);
		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");

		Assert.assertTrue(driver.findElement(CallButton).isDisplayed());
		ExtentSuccessMessage("Assertion for Call Button is Done");

		waitForElement(2000);
		By Message = By.xpath("//a[@title='Message']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Message));
		MoveToElementClick(element);

		By NewMessageIcon = By.xpath("//span[@class='message-new-icon']");
		Assert.assertTrue(driver.findElement(NewMessageIcon).isEnabled());
		ExtentSuccessMessage("Assertion for New Message Button is Done");

	}

	public void User_Login() throws InterruptedException {
		Thread.sleep(2000);
		WebElement AvailableStatus = driver.findElement(By.xpath("//a[@title='CTI - Logged In']"));

		String Colorvalue = AvailableStatus.getCssValue("Color");
		System.out.println(Colorvalue);

		String hexColor = Color.fromString(Colorvalue).asHex();
		System.out.println("Color value (hex): " + hexColor);

	}

	public void User_Contact_Number() throws InterruptedException {

		waitForElement(2000);

		By UserNumber = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber));

		String Number = element.getText();
		System.out.println(Number);

		Assert.assertTrue(driver.findElement(UserNumber).isDisplayed());
		ExtentSuccessMessage("Assertion for Call Number is Done");

	}

	public void Valid_Number() throws InterruptedException {
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println(NumberOutput);
		ExtentSuccessMessage("Number of First user is :" + NumberOutput);

		waitForElement(2000);
		By CTIInputField = By.xpath(
				"//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		writeText(CTIInputField, UserNumberforCTI);
		ExtentSuccessMessage("Number has been in input field" + UserNumberforCTI);

		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		Thread.sleep(3000);

	}

	public void CalltoUser(String Value) throws InterruptedException {
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UATNumberField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(UATNumberField, Value);
		ExtentSuccessMessage("Number has been in input field" + Value);
		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");
		waitForElement(5000);
		if (ElementDisplayed(Errormsg)) {
			ExtentErrorMessage("Unsuccessfully user found 'Unable to connect the call. Please try again' ");
			click(L_OkayButton);
			RefreshPage();
			waitForElement(10000);
			waitForElement(2000);
			waitVisibility(UATNumberField);
			waitForElement(10000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(UATNumberField));
			MoveToElementClick(element);
			ExtentSuccessMessage("Input field has been clicked");
			writeText(UATNumberField, Value);
			ExtentSuccessMessage("Number has been in input field" + Value);
			CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Call button has been clicked");
			waitForElement(10000);
		} else {

		}
		ClickOnMuteCallIconIsvisible();

	}

	public void valid_Number_Confrence() throws IOException, InterruptedException {

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println(NumberOutput);
		ExtentSuccessMessage("Number of First user is :" + NumberOutput);

		waitForElement(2000);
		By CTIInputField = By.xpath(
				"//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");

		String CurrentUrl = driver.getCurrentUrl();

		// As here the number should be Qualitia1 and awspp user only for confrence
		// purpose
		if (CurrentUrl.contains("https://mme.brokerengage.net/")) {
			String CEUseroneValidNumber = "(850) 880-8396";
			writeText(CTIInputField, CEUseroneValidNumber);
			ExtentSuccessMessage("Number has been in input field" + CEUseroneValidNumber);

			By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Call button has been clicked");

		}

		else if (CurrentUrl.contains("https://ce-qa.benefitalign.com/")) {

			String CEUseroneValidNumber = "(707) 466-0803";
			writeText(CTIInputField, CEUseroneValidNumber);
			ExtentSuccessMessage("Number has been in input field" + CEUseroneValidNumber);

			By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Call button has been clicked");

		}

		else if (CurrentUrl.contains("https://ce-uat.benefitalign.com/")) {

			String CEUseroneValidNumber = "";
			writeText(CTIInputField, CEUseroneValidNumber);
			ExtentSuccessMessage("Number has been in input field" + CEUseroneValidNumber);

			By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Call button has been clicked");
		}else {
			System.out.println("DEV ENV");
		}

		Thread.sleep(3000);

	}

	public void TabSwitchToParent() throws InterruptedException {
//		Thread.sleep(2000);
		ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(Tabs.size());
		driver.switchTo().window(Tabs.get(0));
		ExtentSuccessMessage("Tab Switched from child to parent");
//		Thread.sleep(4000);
	}

	public void TabSwitchToChild() throws InterruptedException {
		ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(Tabs.size());
		driver.switchTo().window(Tabs.get(1));
		ExtentSuccessMessage("Tab Switched from parent to child");

	}

	public void TabSwitchToSubChild() throws InterruptedException {
		ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(Tabs.size());
		driver.switchTo().window(Tabs.get(2));
//		Thread.sleep(3000);
		ExtentSuccessMessage("Tab Switched from parent to child");
//		Thread.sleep(2000);

	}

	public void offline_Assertion() throws InterruptedException {

		Thread.sleep(2000);

		By MissedCallPopup = By
				.xpath("//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight']");
		Assert.assertTrue(driver.findElement(MissedCallPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for missed call popup is done");

		Thread.sleep(1000);

	}

	public void TabSwitchToThirdWindow() throws InterruptedException {
		ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(Tabs.size());
		driver.switchTo().window(Tabs.get(2));
//		Thread.sleep(5000);
		ExtentSuccessMessage("Tab Switched from parent to child");
//		Thread.sleep(4000);
	}


	public void fetchNumber() throws InterruptedException {
		waitForElement(4000);
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		waitVisibility(UserNumber);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber));
		UserNumberforCTI = element.getText();
		System.out.println(UserNumberforCTI);

		Thread.sleep(2000);
		By Username = By.xpath("//span[@class='profile-name drag-not-allowed ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Username));
		username = element.getText();
		System.out.println(username);

	}

	public void User() throws InterruptedException
	{
		waitForElement(4000);
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		waitVisibility(UserNumber);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber));
		UserNumberforCTI = element.getText();
		firstnumber = element.getText();
		System.out.println(UserNumberforCTI);
		System.out.println(firstnumber);
	}

	public void Number_Assertion() throws InterruptedException {

		Thread.sleep(9000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, secondnumber);
		ExtentSuccessMessage("Assertion has been done"); 

		waitForElement(1000);
		By CallAccept = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAccept));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Accepted");

		Thread.sleep(3000);
		By Icons = By.xpath("//div[@class='voice-call-ongoing-quick-icons']");
		Assert.assertTrue(driver.findElement(Icons).isDisplayed());
		ExtentSuccessMessage("Icon is Displayed Call has been Connected");

		Thread.sleep(3000); 
		By DeclineButton = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Decline button");

		driver.navigate().refresh();
		Thread.sleep(7000);

		Thread.sleep(3000);
		By DashBoard = By.xpath("//a[@class='glyphicon fa fa-fw fa-dashboard']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DashBoard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Dashboard Tile");

		By AgentDashBoard = By.xpath("//a[contains(.,'Agent Dashboard')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentDashBoard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on AgentDashBoard Tile");

		By Frame = By.xpath("//iframe[@class='ng-scope ng-isolate-scope']");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(3000);

		Thread.sleep(3000);
		By CTIStatus = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ username + "')]/td[2]/div/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIStatus));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		Thread.sleep(2000);
		String ctistatus = element.getText();
		System.out.println(ctistatus);

		Assert.assertEquals(ctistatus, "Ready");
		ExtentSuccessMessage("Agent Status is displaying as Ready in CTI Dashboard");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Thread.sleep(7000);
		By Profile = By.xpath("//div[@class='profile']/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Profile));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Profile button");

		Thread.sleep(2000);
		By Offline = By.xpath("(//span[contains(.,'Offline')])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Offline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Offline Status");

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIStatus));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		Thread.sleep(5000);
		String ctistatusoffline = element.getText();
		System.out.println(ctistatusoffline);

		Thread.sleep(4000);
		Assert.assertEquals(ctistatusoffline, "Offline");
		ExtentSuccessMessage("Agent Status is displaying as Offline in dashboard After Changing Status as offline");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		TabSwitchToChild();

		waitForElement(2000);
		By CTIInputField = By.xpath("//input[@placeholder='Enter Phone Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		writeText(CTIInputField, firstnumber);
		ExtentSuccessMessage("Number has been in input field" + firstnumber);

		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		String SMS_Time11 = CurrentTime(); // stored
		System.out.println(SMS_Time11);
		String smstime11 = removeLeadingZero(SMS_Time11);
		System.out.println(smstime11);

		TabSwitchToParent();

		waitForElement(900);
		By MissedCallPopup = By
				.xpath("//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight']");
		Assert.assertTrue(driver.findElement(MissedCallPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for missed call popup is done");

		TabSwitchToChild();
		By Decline = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Decline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Decline");
		TabSwitchToParent();

		Thread.sleep(2000);
		By MissedCall = By.xpath("//a[@title='Missed Calls']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Missed call has been clicked");

		Thread.sleep(3000);
		By Validation = By.xpath("//u[contains(.,'" + smstime11 + "')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Validation));
		ExtentSuccessMessage("Missed call is visible under Missed call section");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Profile));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Profile button");

		By AutoStatus = By.xpath("(//span[contains(.,'AutoStatus')])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AutoStatus));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on AutoStatus button");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(AutoStatus));
		String autostatus = element.getText();
		System.out.println(autostatus);

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIStatus));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		Thread.sleep(2000);
		String ctistatuscustom = element.getText();
		System.out.println(ctistatuscustom);

		Thread.sleep(4000);
		//        Assert.assertEquals(ctistatuscustom, "Offline");
		ExtentSuccessMessage("Agent Status is displaying as Offline in dashboard After Changing Status as offline");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		TabSwitchToChild();

		driver.navigate().refresh();
		Thread.sleep(7000);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		writeText(CTIInputField, firstnumber);
		ExtentSuccessMessage("Number has been in input field" + firstnumber);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		String SMS_Time1 = CurrentTime(); // stored
		System.out.println(SMS_Time1);
		String smstime1 = removeLeadingZero(SMS_Time1);
		System.out.println(smstime1);

		TabSwitchToParent();
		Thread.sleep(4000);
		//		Assert.assertTrue(driver.findElement(MissedCallPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for missed call popup is done for Custom Status");

		TabSwitchToChild();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Decline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Decline");
		TabSwitchToParent();

		Thread.sleep(3000);
		By Validationn = By.xpath("//u[contains(.,'" + smstime1 + "')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Validationn));
		ExtentSuccessMessage("Missed call is visible under Missed call section");

	}

	public void Number_AssertionAndAcceptCall() throws InterruptedException {

		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, NumberOutput);
		ExtentSuccessMessage("Assertion has been done");

		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Accepted");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Declined");

		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);

	}

	public void callAccept() throws InterruptedException {

		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Accepted");

		Thread.sleep(9000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Declined");

		waitForElement(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);

	}

	public void ConfrenceCall() throws InterruptedException {
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println(NumberOutput);
		ExtentSuccessMessage("Number of First user is :" + NumberOutput);

		waitForElement(2000);
		By CTIInputField = By.xpath(
				"//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");

		String currentSystemURL = driver.getCurrentUrl();

		if (currentSystemURL.contains("https://mme.brokerengage.net/")) {
			String CEUserValidNumber = "(850) 880-8396";
			writeText(CTIInputField, CEUserValidNumber);
			ExtentSuccessMessage("Number has been in input field" + CEUserValidNumber);

			By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Call button has been clicked");

		}

		else if (currentSystemURL.contains("https://ce-qa.benefitalign.com/")) {

			String CEUserValidNumber = "(707) 466-0803";
			writeText(CTIInputField, CEUserValidNumber);
			ExtentSuccessMessage("Number has been in input field" + CEUserValidNumber);

			By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Call button has been clicked");

		}

		else if (currentSystemURL.contains("https://ce-uat.benefit-test.com/")) {

			String CEUserValidNumber = "(938) 222-3276";
			writeText(CTIInputField, CEUserValidNumber);
			ExtentSuccessMessage("Number has been in input field" + CEUserValidNumber);

			By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Call button has been clicked");
		}

		else {

			System.out.println("DEV ENV");

		}

		Thread.sleep(3000);

	}

	public void new_Tab() throws InterruptedException {

		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		ExtentSuccessMessage("New Tab has been Opened");

	}

	public void new_Window() throws InterruptedException {

		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(3000);

		ExtentSuccessMessage("New Window has been opened");

	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void SecondUser() throws InterruptedException, IOException {

		waitForElement(2000);
		//		String urlCE = configloader().getProperty("CEURL");
		String urlCE;
		String currentSystemURL = configloader().getProperty("URL");
		System.out.println(currentSystemURL);
		if (URL.contains("https://mme.benefitalign.com")) {
			urlCE = "https://ce-uat.benefitalign.com/";
		} else if (URL.contains("https://ce-uat.benefitalign.com/")) {
			urlCE = "https://ce-qa.benefitalign.com/";
		} else if (URL.contains("https://ce-qa.benefitalign.com/")) {
			urlCE = "https://ce-uat.benefitalign.com/";
		} else if (URL.contains("https://mme.brokerengage.net/")) {
			urlCE = "https://mme.brokerengage.net/";
		} else {
			urlCE = "https://ce-dev.benefitalign.com/#/login";
		}
		driver.get(urlCE);
		String username = configloader().getProperty("PLCA_ThirdUser");
		String pswd = configloader().getProperty("PLCA_ThirdPassword");
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, username);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, pswd);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}
		waitForElement(10000);
		fetchNumber2();
	}

	public void ThirdUserForOutbound() throws InterruptedException, IOException {
		waitForElement(1000);
		String urlCE;
		System.out.println(URL);
		String currentSystemURL = URL;
		System.out.println(currentSystemURL);
		if (currentSystemURL.contains("https://mme.benefitalign.com")) {
			urlCE = "https://ce-uat.benefitalign.com/";
			driver.get(urlCE);
			username = configloader().getProperty("PLCA_UATSecondUser");
			pswd = configloader().getProperty("PLCA_SecondPassword");

		} else if (currentSystemURL.contains("https://ce-uat.benefitalign.com/")) {
			urlCE = "https://mme.benefitalign.com";
			driver.get(urlCE);
			username = configloader().getProperty("PLCA_PRODSecondUser");
			pswd = configloader().getProperty("PLCA_SecondPassword");

		} else if (currentSystemURL.contains("https://ce-qa.benefitalign.com/")) {
			urlCE = "https://ce-uat.benefitalign.com/";
			driver.get(urlCE);
			username = configloader().getProperty("PLCA_UATSecondUser");
			pswd = configloader().getProperty("PLCA_SecondPassword");
		} else if (currentSystemURL.contains("https://mme.brokerengage.net/")) {
			urlCE = "https://ce-uat.benefitalign.com/";
		} else {
			urlCE = "https://ce-dev.benefitalign.com/#/login";
		}
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, username);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, pswd);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(6000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}
		waitForElement(4000);
		ExtentSuccessMessage("Logged into the Receiver Side");

		//		String Url = configloader().getProperty("URL");
		//		String jenkinsUrl = System.getProperty("URL");
		//		if (jenkinsUrl != null && !jenkinsUrl.isEmpty()) {
		//			Url = jenkinsUrl;
		//		}
		//		waitForElement(1000);
		//		String username = configloader().getProperty("PLCA_SecondUser");
		//		String pswd = configloader().getProperty("PLCA_SecondPassword");
		//		waitForElement(1000);
		//		driver.get(Url);
		//		waitForElement(5000);
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		//		MoveToElementClick(element);
		//		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		//		writeText(userID, username);
		//		ExtentSuccessMessage("Entered the Customer Engage Username");
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		//		MoveToElementClick(element);
		//		ExtentSuccessMessage("Clicked on Customer Engage password field");
		//		writeText(pwd, pswd);
		//		ExtentSuccessMessage("Entered the Customer Engage Password");
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		//		MoveToElementClick(element);
		//		waitForElement(4000);

		login_CE_validations();
	}

	public void secondUser_Call() throws InterruptedException, IOException {

		waitForElement(1000);
		String urlCE;
		System.out.println(URL);
		String currentSystemURL = URL;
		System.out.println(currentSystemURL);
		if (currentSystemURL.contains("https://mme.benefitalign.com")) {
			urlCE = "https://ce-uat.benefitalign.com/mme/#/login";
			driver.get(urlCE);
			username = configloader().getProperty("PLCA_UserName8");
			pswd = configloader().getProperty("PLCA_Password8");
			
		} else if (currentSystemURL.contains("https://ce-uat.benefitalign.com/")) {
			urlCE = "https://mme.benefitalign.com/mme/#/login";
			driver.get(urlCE);
			username = configloader().getProperty("PLCA_UserName8");
			pswd = configloader().getProperty("PLCA_Password8");

		} else if (currentSystemURL.contains("https://ce-qa.benefitalign.com/")) {
			urlCE = "https://ce-uat.benefitalign.com/mme/#/login";
			driver.get(urlCE);
			username = configloader().getProperty("PLCA_UserName8");
			pswd = configloader().getProperty("PLCA_Password8");
		} else if (currentSystemURL.contains("https://mme.brokerengage.net/")) {
			urlCE = "https://ce-uat.benefitalign.com/mme/#/login";
		}else if (currentSystemURL.contains("https://mme.brokerengage.net/mme/")) {
			urlCE = "https://ce-uat.benefitalign.com/mme/#/login";
			driver.get(urlCE);
			username = configloader().getProperty("PLCA_UserName8");
			pswd = configloader().getProperty("PLCA_Password8");
		} else {
			urlCE = "https://ce-dev.benefitalign.com/#/login";
		}

		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, username);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, pswd);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(6000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}
		waitForElement(4000);
		ExtentSuccessMessage("Logged into the Receiver Side");
	}

	public void secondUser_MissedCall() throws InterruptedException, IOException {

		waitForElement(2000);
		//		String urlCE = configloader().getProperty("CEURL");
		String urlCE;
//		String currentSystemURL = configloader().getProperty("URL");
//		System.out.println(currentSystemURL);
		if (URL.contains("https://mme.benefitalign.com")) {
			urlCE = "https://mme.benefitalign.com";
		} else if (URL.contains("https://ce-uat.benefitalign.com/")) {
			urlCE = "https://mme.benefitalign.com";
		} else if (URL.contains("https://ce-qa.benefitalign.com/")) {
			urlCE = "https://ce-uat.benefitalign.com/";
		} else if (URL.contains("https://mme.brokerengage.net/")) {
			urlCE = "https://ce-uat.benefitalign.com/";
		}

		else {
			urlCE = "https://ce-dev.benefitalign.com/#/login";
		}
		driver.get(urlCE);
		String username = configloader().getProperty("PLCA_SecondUser");
		String pswd = configloader().getProperty("PLCA_SecondPassword");
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, username);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, pswd);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}
		waitForElement(10000);

	}

	public void secondUser_Outbound_Confrence() throws InterruptedException, IOException {

		waitForElement(1000);
		String Url = configloader().getProperty("URL");
		String jenkinsUrl = System.getProperty("URL");
		if (jenkinsUrl != null && !jenkinsUrl.isEmpty()) {
			Url = jenkinsUrl;
		}
		waitForElement(1000);
		String username = configloader().getProperty("PLCA_QAUserNameR");
		String pswd = configloader().getProperty("PLCA_QAPasswordR");
		waitForElement(1000);
		driver.get(Url);
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, username);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, pswd);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		waitForElement(4000);
		ExtentSuccessMessage("Logged into the Receiver Side");
		login_CE_validations();

	}

	public void secondUser_Voicemail() throws InterruptedException, IOException {

		waitForElement(1000);
		String urlCE;
		System.out.println(URL);
		String currentSystemURL = URL;
		System.out.println(currentSystemURL);
		if (currentSystemURL.contains("https://mme.benefitalign.com")) {
			urlCE = "https://ce-uat.benefitalign.com/mme/#/login";
			driver.get(urlCE);
			username = configloader().getProperty("PLCA_UserName8");
			pswd = configloader().getProperty("PLCA_Password8");

		} else if (currentSystemURL.contains("https://ce-uat.benefitalign.com/")) {
			urlCE = "https://mme.benefitalign.com/mme/#/login";
			driver.get(urlCE);
			username = configloader().getProperty("PLCA_UserName8");
			pswd = configloader().getProperty("PLCA_Password8");

		} else if (currentSystemURL.contains("https://ce-qa.benefitalign.com/")) {
			urlCE = "https://ce-uat.benefitalign.com/mme/#/login";
			driver.get(urlCE);
			username = configloader().getProperty("PLCA_UserName8");
			pswd = configloader().getProperty("PLCA_Password8");
		} else if (currentSystemURL.contains("https://mme.brokerengage.net/mme/")) {
			urlCE = "https://ce-uat.benefitalign.com/mme/#/login";
			driver.get(urlCE);
			username = configloader().getProperty("PLCA_UserName8");
			pswd = configloader().getProperty("PLCA_Password8");
		} else {
			urlCE = "https://ce-dev.benefitalign.com/#/login";
		}
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, username);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, pswd);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(6000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}
		waitForElement(4000);
		ExtentSuccessMessage("Logged into the Receiver Side");
		login_CE_validations();

		//		String Url = configloader().getProperty("URL");
		//		String jenkinsUrl = System.getProperty("URL");
		//		if (jenkinsUrl != null && !jenkinsUrl.isEmpty()) {
		//			Url = jenkinsUrl;
		//		}
		//		waitForElement(1000);
		//		String username = configloader().getProperty("PLCA_SecondUser");
		//		String pswd = configloader().getProperty("PLCA_SecondPassword");
		//		waitForElement(1000);
		//		driver.get(Url);
		//		waitForElement(5000);
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		//		MoveToElementClick(element);
		//		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		//		writeText(userID, username);
		//		ExtentSuccessMessage("Entered the Customer Engage Username");
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		//		MoveToElementClick(element);
		//		ExtentSuccessMessage("Clicked on Customer Engage password field");
		//		writeText(pwd, pswd);
		//		ExtentSuccessMessage("Entered the Customer Engage Password");
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		//		MoveToElementClick(element);
		//		waitForElement(4000);
		//		ExtentSuccessMessage("Logged into the Receiver Side");

	}

	public void secondUser_Recording() throws InterruptedException, IOException {

		waitForElement(2000);
		//		String urlCE = configloader().getProperty("CEURL");
		String urlCE;
		String currentSystemURL = configloader().getProperty("URL");
		System.out.println(currentSystemURL);
		if (currentSystemURL.contains("https://mme.benefitalign.com")) {
			urlCE = "https://ce-uat.benefitalign.com/";
		} else if (currentSystemURL.contains("https://ce-uat.benefitalign.com/")) {
			urlCE = "https://ce-qa.benefitalign.com/mme";
		} else if (currentSystemURL.contains("https://ce-qa.benefitalign.com/")) {
			urlCE = "https://ce-uat.benefitalign.com/";
		} else if (currentSystemURL.contains("https://mme.brokerengage.net/")) {
			urlCE = "https://ce-uat.benefitalign.com/";
		}

		else {
			urlCE = "https://ce-dev.benefitalign.com/#/login";
		}
		driver.get(urlCE);
		String username = configloader().getProperty("PLCA_SecondUserr");
		String pswd = configloader().getProperty("PLCA_SecondPasswordd");
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, username);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, pswd);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}
		waitForElement(10000);

	}

	public void SecondUserForConfrence() throws InterruptedException, IOException {
		waitForElement(1000);
		String Url = configloader().getProperty("URL");
		String jenkinsUrl = System.getProperty("URL");
		if (jenkinsUrl != null && !jenkinsUrl.isEmpty()) {
			Url = jenkinsUrl;
		}

		String UserName = null;
		String Password = null;
		String ReferenceLogin = "PLCA";

		for (String key : configloader().stringPropertyNames()) {
			String value = configloader().getProperty(key);
			if (key.contains(ReferenceLogin) && 
					Url.contains("https://mme.brokerengage.net/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", 
						"");
				if (replaceKeyValue.contains("PPSecondUser")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("PPSecondPassword")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}




			if (key.contains(ReferenceLogin) && 
					Url.contains("https://ce-qa.benefitalign.com/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", 
						"");
				if (replaceKeyValue.contains("QASecondUser")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("QASecondPassword")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}

			if (key.contains(ReferenceLogin) && Url.contains("https://mme.benefitalign.com/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", "");
				if (replaceKeyValue.contains("PRODSecondUser")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("PRODSecondPassword")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}

			if (key.contains(ReferenceLogin) && 
					Url.contains("https://ce-uat.benefitalign.com/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", 
						"");
				if (replaceKeyValue.contains("UATSecondUser")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("UATSecondPassword")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}


			else { }

		}
		System.out.println("Final username fetch :" + UserName);
		LoginUserName2=UserName;
		System.out.println("Final username fetch :" + Password);
		String username = UserName;
		String pswd = Password;
		driver.get(Url);
		waitForElement(7000);
		waitVisibility(userID);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, username);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, pswd);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		waitForElement(6000);
		ExtentSuccessMessage("Logged into the Receiver Side");

	}

	public void SecondUserForTransfer() throws InterruptedException, IOException {

		waitForElement(2000);
		//		String urlCE = configloader().getProperty("CEURL");
		String urlCE;
		String currentSystemURL = configloader().getProperty("URL");
		System.out.println(currentSystemURL);
		if (currentSystemURL.contains("https://mme.benefitalign.com")) {
			urlCE = "https://mme.benefitalign.com";
		} else if (currentSystemURL.contains("https://ce-uat.benefitalign.com/")) {
			urlCE = "https://ce-uat.benefitalign.com/";
		} else if (currentSystemURL.contains("https://ce-qa.benefitalign.com/")) {
			urlCE = "https://ce-qa.benefitalign.com/";
		} else if (currentSystemURL.contains("https://mme.brokerengage.net/")) {
			urlCE = "https://mme.brokerengage.net/";
		} else {
			urlCE = "https://ce-dev.benefitalign.com/#/login";
		}
		driver.get(urlCE);
		String username = configloader().getProperty("PLCA_ThirdUser");
		String pswd = configloader().getProperty("PLCA_ThirdPassword");
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, username);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, pswd);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}
		waitForElement(10000);
		fetchNumber2();
	}

	public void ThirdUser() throws InterruptedException, IOException {


		String Url = configloader().getProperty("URL");
		String jenkinsUrl = System.getProperty("URL");
		if (jenkinsUrl != null && !jenkinsUrl.isEmpty()) {
			Url = jenkinsUrl;
		}
		String urlCE;
		String currentSystemURL =Url;
		System.out.println(currentSystemURL);
		if (currentSystemURL.contains("https://mme.benefitalign.com")) {
			urlCE = "https://ce-uat.benefitalign.com/mme/#/login";
		} else if (currentSystemURL.contains("https://ce-uat.benefitalign.com/")) {
			urlCE = "https://mme.benefitalign.com/mme/#/login";
		} else if (currentSystemURL.contains("https://ce-qa.benefitalign.com/")) {
			urlCE = "https://ce-uat.benefitalign.com/";
		} else if (currentSystemURL.contains("https://mme.brokerengage.net/")) {
			urlCE = "https://ce-uat.benefitalign.com/";
		}else if (currentSystemURL.contains("https://mme.brokerengage.net/mme/")) {
			urlCE = "https://ce-uat.benefitalign.com/";
		}

		else {
			urlCE = "https://ce-dev.benefitalign.com/#/login";
		}
		String UserName = null;
		String Password = null;
		String ReferenceLogin = "PLCA";

		for (String key : configloader().stringPropertyNames()) {
			String value = configloader().getProperty(key);
			if (key.contains(ReferenceLogin) && 
					urlCE.contains("https://mme.brokerengage.net/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", 
						"");
				if (replaceKeyValue.contains("PPThirdUser")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("PPThirdPassword")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}
			if (key.contains(ReferenceLogin) && 
					urlCE.contains("https://ce-qa.benefitalign.com/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", 
						"");
				if (replaceKeyValue.contains("QAThirdUser")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("QAThirdPassword")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}

			if (key.contains(ReferenceLogin) && urlCE.contains("https://mme.benefitalign.com/mme/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", "");
				if (replaceKeyValue.contains("PRODThirdUser")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("PRODThirdPassword")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}

			if (key.contains(ReferenceLogin) && 
					urlCE.contains("https://ce-uat.benefitalign.com/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", 
						"");
				if (replaceKeyValue.contains("UATThirdUser")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("UATThirdPassword")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}


			else { }

		}
		System.out.println("Final username fetch :" + UserName);
		System.out.println("Final Password fetch :" + Password);
		String username = UserName;
		String pswd = Password;
		driver.get(urlCE);
		//		String username = configloader().getProperty("PLCA_ThirdUser");
		//		String pswd = configloader().getProperty("PLCA_ThirdPassword");
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, username);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, pswd);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}
		waitForElement(10000);
		fetchNumber3();
	}

	public void Invalid_Number() throws InterruptedException {
		waitForElement(5000);
		By CTIInputField = By.xpath(
				"//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		String InvalidNumber = "(479) 333-17";
		writeText(CTIInputField, InvalidNumber);
		ExtentSuccessMessage("Number has been in input field" + InvalidNumber);

		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		By ErrorMessage = By.xpath("//div[@id='divErrors']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ErrorMessage));

		waitForElement(1000);
		String Message = element.getText();
		System.out.println("--------------" + Message + "----------------");

		waitForElement(500);
		String InvalidMessage = "Invalid Phone Number Format";
		Assert.assertEquals(Message, InvalidMessage);
		ExtentSuccessMessage("Assertion for Invalid Number has been Done");

	}

	public String employerName() {
		String allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String ssn = "";
		String temp = RandomStringUtils.random(10, allowedChars);
		ssn = temp.substring(0, temp.length() - 5);
		return ssn;
	}

	public String agentName() {
		String allowedChars = "AEIOU" + "bcdfghjklmnpqrstvwxyz";
		String ssn = "";
		String temp = RandomStringUtils.random(12, allowedChars);
		ssn = temp.substring(0, temp.length() - 5);
		return ssn;
	}

	public int getRandomNumber() {
		Random r = new Random();
		int ran = r.nextInt(1000);
		return ran;
	}

	public static Properties configloader() throws IOException {
		FileInputStream File = new FileInputStream(".\\src\\test\\resources\\config.properties");
		Properties properties = new Properties();
		properties.load(File);
		return properties;
	}

	public static void DeleteFiles(String Path) {
		File directory = new File(Path);
		if (!directory.exists())
			directory.mkdir();

		for (File file : Objects.requireNonNull(directory.listFiles())) {
			if (!file.isDirectory()) {
				file.delete();
			}
		}
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

	public void validate_the_widget_after_accepted_the_Inbound_Calls() throws InterruptedException, IOException {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		splitthewindowscreen("RIGHT");
		Thread.sleep(15000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		String SecondNumberOutput = element.getText();
		System.out.println("DebugSecondNumberOutput:- " + SecondNumberOutput);
		String ReferenceLogin = "PLCA";
		String UserName = null;
		String Password = null;
		for (String key : configloader().stringPropertyNames()) {
			String value = configloader().getProperty(key);
			if (key.contains(ReferenceLogin) && currentUrl.contains("https://mme.brokerengage.net/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", "");
				if (replaceKeyValue.contains("SecondUser")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("SecondPassword")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}

			if (key.contains(ReferenceLogin) && currentUrl.contains("https://ce-qa.benefitalign.com/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", "");
				if (replaceKeyValue.contains("QAUserName1")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("QAPassword1")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}

			else {
			}

		}
		System.out.println("Final username fetch :" + UserName);
		System.out.println("Final username fetch :" + Password);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		splitthewindowscreen("LEFT");

		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(1));
		driver.get(currentUrl);
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, UserName);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, Password);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}

		Thread.sleep(35000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println("Debug" + NumberOutput);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UATNumberField));
		MoveToElementClick(element);
		String QualtiaNumber = SecondNumberOutput;
		// String QualtiaNumber = "(386) 703-3867";
		writeText(UATNumberField, QualtiaNumber);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		Thread.sleep(20000);
		driver.switchTo().window(tabs.get(0));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, NumberOutput);
		ExtentSuccessMessage("Assertion has been done");
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(9000);

		CheckCallKeypadIconIsvisible();
		CheckCallAddIconIsvisible();
		CheckCallHoldIconIsvisible();
		CheckCallMuteIconIsvisible();
		CheckCallTransferIconIsvisible();
		CheckCallCancelIconIsvisible();
		Thread.sleep(9000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);

		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed!");
		waitForElement(1000);

		// driver.switchTo().window(tabs.get(0));
		Thread.sleep(2000);

		driver.switchTo().window(tabs.get(1));
	}

	public void CheckCallKeypadIconIsvisible() throws InterruptedException {
		waitVisibility(CallKeypad);
		if (ElementDisplayed(CallKeypad)) {
			ExtentSuccessMessage("Successfully user able to See 'CallKeypad Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'CallKeypad Icon' Not visible");
		}
	}

	public void CheckCallAddIconIsvisible() throws InterruptedException {
		waitVisibility(CallAdd);
		if (ElementDisplayed(CallAdd)) {
			ExtentSuccessMessage("Successfully user able to See 'CallAdd Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'CallAdd Icon' Not visible");
		}
	}

	public void CheckCallMuteIconIsvisible() throws InterruptedException {
		waitVisibility(CallMute);
		if (ElementDisplayed(CallMute)) {
			ExtentSuccessMessage("Successfully user able to See 'CallMute Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'CallMute Icon' Not visible");
		}
	}

	public void CheckCallHoldIconIsvisible() throws InterruptedException {
		waitVisibility(CallHold);
		if (ElementDisplayed(CallHold)) {
			ExtentSuccessMessage("Successfully user able to See 'CallHold Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'CallHold Icon' Not visible");
		}
	}

	public void CheckCallTransferIconIsvisible() throws InterruptedException {
		waitVisibility(CallTransfer);
		if (ElementDisplayed(CallTransfer)) {
			ExtentSuccessMessage("Successfully user able to See 'CallTransfer Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'CallTransfer Icon' Not visible");
		}
	}

	public void ClickOnCallTransferIconIsvisible() throws InterruptedException {
		waitVisibility(CallTransfer);
		if (ElementDisplayed(CallTransfer)) {
			ExtentSuccessMessage("Successfully user able to See 'CallTransfer Icon' ");
			click(CallTransfer);
			ExtentSuccessMessage("Successfully user Clicked on 'CallTransfer Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'CallTransfer Icon' Not visible");
		}
	}

	public void CheckCallCancelIconIsvisible() throws InterruptedException {
		waitVisibility(CallEnd);
		if (ElementDisplayed(CallEnd)) {
			ExtentSuccessMessage("Successfully user able to See 'CallEnd Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'CallEnd Icon' Not visible");
		}
	}

	public void validate_by_clicking_cancel_call_option() throws InterruptedException, IOException {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		splitthewindowscreen("RIGHT");
		Thread.sleep(15000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		String SecondNumberOutput = element.getText();
		System.out.println("DebugSecondNumberOutput:- " + SecondNumberOutput);
		String ReferenceLogin = "PLCA";
		String UserName = null;
		String Password = null;
		for (String key : configloader().stringPropertyNames()) {
			String value = configloader().getProperty(key);
			if (key.contains(ReferenceLogin) && currentUrl.contains("https://mme.brokerengage.net/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", "");
				if (replaceKeyValue.contains("SecondUser")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("SecondPassword")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}

			if (key.contains(ReferenceLogin) && currentUrl.contains("https://ce-qa.benefitalign.com/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", "");
				if (replaceKeyValue.contains("QAUserName1")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("QAPassword1")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}

			else {
			}

		}
		System.out.println("Final username fetch :" + UserName);
		System.out.println("Final username fetch :" + Password);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		splitthewindowscreen("LEFT");

		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(1));
		driver.get(currentUrl);
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, UserName);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, Password);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}
		Thread.sleep(35000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println("Debug" + NumberOutput);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UATNumberField));
		MoveToElementClick(element);
		String QualtiaNumber = SecondNumberOutput;
		// String QualtiaNumber = "(386) 703-3867";
		writeText(UATNumberField, QualtiaNumber);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		Thread.sleep(20000);
		driver.switchTo().window(tabs.get(0));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, NumberOutput);
		ExtentSuccessMessage("Assertion has been done");
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(9000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Decline Button'");
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed!");
		waitForElement(1000);
		driver.switchTo().window(tabs.get(1));
	}

	public void validate_the_Icon_after_Customer_accepted_the_Outbound_Calls()
			throws InterruptedException, IOException {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		splitthewindowscreen("RIGHT");
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		splitthewindowscreen("LEFT");
		String Username1 = null;
		String Password1 = null;
		String Username2 = null;
		String Password2 = null;
		driver.get(currentUrl);
		if (currentUrl.contains("qa")) {
			Username1 = configloader().getProperty("QA_UserName1");
			Password1 = configloader().getProperty("QA_Password1");
			Username2 = configloader().getProperty("QA_UserName2");
			Password2 = configloader().getProperty("QA_Password2");
		} else if (currentUrl.contains("uat")) {
			Username1 = configloader().getProperty("UAT_UserName1");
			Password1 = configloader().getProperty("UAT_Password1");
			Username2 = configloader().getProperty("UAT_UserName2");
			Password2 = configloader().getProperty("UAT_Password2");
		} else if (currentUrl.contains("mme.")) {
			Username1 = configloader().getProperty("PP_UserName1");
			Password1 = configloader().getProperty("PP_Password1");
			Username2 = configloader().getProperty("PP_UserName2");
			Password2 = configloader().getProperty("PP_Password2");
		}
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, Username1);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, Password1);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}

		Thread.sleep(15000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		String SecondNumberOutput = element.getText();
		System.out.println("Debug" + SecondNumberOutput);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(0));
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, Username2);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, Password2);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}

		Thread.sleep(35000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println("Debug" + NumberOutput);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UATNumberField));
		MoveToElementClick(element);
		String QualtiaNumber = SecondNumberOutput;
		writeText(UATNumberField, QualtiaNumber);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		Thread.sleep(20000);
		driver.switchTo().window(tabs.get(1));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, NumberOutput);
		ExtentSuccessMessage("Assertion has been done");
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(9000);
		driver.switchTo().window(tabs.get(0));
		CheckCallAddIconIsvisible();
		CheckCallHoldIconIsvisible();
		CheckCallMuteIconIsvisible();
		CheckCallTransferIconIsvisible();
		CheckCallCancelIconIsvisible();
		// CheckOnRecordingCallIconIsvisible();
		Thread.sleep(9000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed!");
		waitForElement(1000);
		driver.switchTo().window(tabs.get(1));
	}

	public void validate_after_Customer_Cancel_the_Outbound_Calls() throws InterruptedException, IOException {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		splitthewindowscreen("RIGHT");
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		splitthewindowscreen("LEFT");
		String Username1 = null;
		String Password1 = null;
		String Username2 = null;
		String Password2 = null;
		driver.get(currentUrl);
		if (currentUrl.contains("qa")) {
			Username1 = configloader().getProperty("QA_UserName1");
			Password1 = configloader().getProperty("QA_Password1");
			Username2 = configloader().getProperty("QA_UserName2");
			Password2 = configloader().getProperty("QA_Password2");
		} else if (currentUrl.contains("uat")) {
			Username1 = configloader().getProperty("UAT_UserName1");
			Password1 = configloader().getProperty("UAT_Password1");
			Username2 = configloader().getProperty("UAT_UserName2");
			Password2 = configloader().getProperty("UAT_Password2");
		} else if (currentUrl.contains("mme.")) {
			Username1 = configloader().getProperty("PP_UserName1");
			Password1 = configloader().getProperty("PP_Password1");
			Username2 = configloader().getProperty("PP_UserName2");
			Password2 = configloader().getProperty("PP_Password2");
		}
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, Username1);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, Password1);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}

		Thread.sleep(15000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		String SecondNumberOutput = element.getText();
		System.out.println("Debug" + SecondNumberOutput);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(0));
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, Username2);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, Password2);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}

		Thread.sleep(15000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println("Debug" + NumberOutput);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UATNumberField));
		MoveToElementClick(element);
		String QualtiaNumber = SecondNumberOutput;
		writeText(UATNumberField, QualtiaNumber);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		Thread.sleep(10000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, NumberOutput);
		ExtentSuccessMessage("Assertion has been done");
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(5000);
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		// click(CallDeclineButton1);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);

		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed!");
		waitForElement(1000);
		driver.switchTo().window(tabs.get(1));
	}

	public void validate_after_Customer_Mute_the_Outbound_Calls() throws InterruptedException, IOException {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		splitthewindowscreen("RIGHT");
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		splitthewindowscreen("LEFT");
		String Username1 = null;
		String Password1 = null;
		String Username2 = null;
		String Password2 = null;
		driver.get(currentUrl);
		if (currentUrl.contains("qa")) {
			Username1 = configloader().getProperty("QA_UserName1");
			Password1 = configloader().getProperty("QA_Password1");
			Username2 = configloader().getProperty("QA_UserName2");
			Password2 = configloader().getProperty("QA_Password2");
		} else if (currentUrl.contains("uat")) {
			Username1 = configloader().getProperty("UAT_UserName1");
			Password1 = configloader().getProperty("UAT_Password1");
			Username2 = configloader().getProperty("UAT_UserName2");
			Password2 = configloader().getProperty("UAT_Password2");
		} else if (currentUrl.contains("mme.")) {
			Username1 = configloader().getProperty("PP_UserName1");
			Password1 = configloader().getProperty("PP_Password1");
			Username2 = configloader().getProperty("PP_UserName2");
			Password2 = configloader().getProperty("PP_Password2");
		}
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, Username1);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, Password1);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}

		Thread.sleep(15000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		String SecondNumberOutput = element.getText();
		System.out.println("Debug" + SecondNumberOutput);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(0));
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, Username2);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, Password2);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}

		Thread.sleep(35000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println("Debug" + NumberOutput);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UATNumberField));
		MoveToElementClick(element);
		String QualtiaNumber = SecondNumberOutput;
		writeText(UATNumberField, QualtiaNumber);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		Thread.sleep(10000);
		driver.switchTo().window(tabs.get(1));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, NumberOutput);
		ExtentSuccessMessage("Assertion has been done");
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(9000);
		driver.switchTo().window(tabs.get(0));
		ClickOnMuteCallIconIsvisible();
		Thread.sleep(5000);
		CheckCallUnmuteIconIsvisible();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Decline Button'");
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed!");
		waitForElement(1000);
		driver.switchTo().window(tabs.get(1));

	}

	public void ClickOnMuteCallIconIsvisible() throws InterruptedException {
		waitVisibility(CallMute);
		if (ElementDisplayed(CallMute)) {
			ExtentSuccessMessage("Successfully user able to See 'CallMute Icon' ");
			click(CallMute);
			ExtentSuccessMessage("Successfully user Clicked on 'CallMute Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'CallMute Icon' Not visible");
		}
	}

	public void CheckCallUnmuteIconIsvisible() throws InterruptedException {
		waitVisibility(CallUnmute);
		if (ElementDisplayed(CallUnmute)) {
			ExtentSuccessMessage("Successfully user able to See 'CallUnmute Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'CallUnmute Icon' Not visible");
		}
	}

	public void validate_by_clicking_mute_call_option() throws InterruptedException, IOException {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		splitthewindowscreen("RIGHT");
		Thread.sleep(15000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		String SecondNumberOutput = element.getText();
		System.out.println("DebugSecondNumberOutput:- " + SecondNumberOutput);
		String ReferenceLogin = "PLCA";
		String UserName = null;
		String Password = null;
		for (String key : configloader().stringPropertyNames()) {
			String value = configloader().getProperty(key);
			if (key.contains(ReferenceLogin) && currentUrl.contains("https://mme.brokerengage.net/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", "");
				if (replaceKeyValue.contains("SecondUser")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("SecondPassword")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}

			if (key.contains(ReferenceLogin) && currentUrl.contains("https://ce-qa.benefitalign.com/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", "");
				if (replaceKeyValue.contains("QAUserName1")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("QAPassword1")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}

			else {
			}

		}
		System.out.println("Final username fetch :" + UserName);
		System.out.println("Final username fetch :" + Password);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		splitthewindowscreen("LEFT");

		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(1));
		driver.get(currentUrl);
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, UserName);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, Password);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}
		Thread.sleep(35000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println("Debug" + NumberOutput);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UATNumberField));
		MoveToElementClick(element);
		String QualtiaNumber = SecondNumberOutput;
		// String QualtiaNumber = "(386) 703-3867";
		writeText(UATNumberField, QualtiaNumber);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		Thread.sleep(20000);
		driver.switchTo().window(tabs.get(0));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, NumberOutput);
		ExtentSuccessMessage("Assertion has been done");
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(19000);
		driver.switchTo().window(tabs.get(1));
		ClickOnMuteCallIconIsvisible();
		Thread.sleep(5000);
		CheckCallUnmuteIconIsvisible();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Decline Button'");
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed!");
		waitForElement(1000);
		driver.switchTo().window(tabs.get(0));
	}

	public void validate_by_clicking_hold_call_option() throws InterruptedException, IOException {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		splitthewindowscreen("RIGHT");
		Thread.sleep(15000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		String SecondNumberOutput = element.getText();
		System.out.println("DebugSecondNumberOutput:- " + SecondNumberOutput);
		String ReferenceLogin = "PLCA";
		String UserName = null;
		String Password = null;
		for (String key : configloader().stringPropertyNames()) {
			String value = configloader().getProperty(key);
			if (key.contains(ReferenceLogin) && currentUrl.contains("https://mme.brokerengage.net/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", "");
				if (replaceKeyValue.contains("SecondUser")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("SecondPassword")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}

			if (key.contains(ReferenceLogin) && currentUrl.contains("https://ce-qa.benefitalign.com/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", "");
				if (replaceKeyValue.contains("QAUserName1")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("QAPassword1")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}

			else {
			}

		}
		System.out.println("Final username fetch :" + UserName);
		System.out.println("Final username fetch :" + Password);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		splitthewindowscreen("LEFT");

		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(1));
		driver.get(currentUrl);
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, UserName);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, Password);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}
		Thread.sleep(35000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println("Debug" + NumberOutput);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UATNumberField));
		MoveToElementClick(element);
		String QualtiaNumber = SecondNumberOutput;
		// String QualtiaNumber = "(386) 703-3867";
		writeText(UATNumberField, QualtiaNumber);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		Thread.sleep(20000);
		driver.switchTo().window(tabs.get(0));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, NumberOutput);
		ExtentSuccessMessage("Assertion has been done");
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(19000);
		ClickOnHoldCallIconIsvisible();
		Thread.sleep(5000);
		CheckCallonholdIconIsvisible();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Decline Button'");
	}

	public void ValidateRecordingTab() throws InterruptedException, IOException, AWTException, ParseException {

		fetchNumber1();
		new_Tab();
		secondUser_Recording();
		fetchNumber2();

		waitForElement(5000);
		By CTIInputField = By.xpath(
				"//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");

		String CEUserValidNumber = firstnumber;
		writeText(CTIInputField, CEUserValidNumber);
		ExtentSuccessMessage("Number has been in input field" + CEUserValidNumber);

		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");
		time = CurrentTime();
		System.out.println(time);
		String timee = removeLeadingZero(time);
		System.out.println(timee);
		Thread.sleep(2000);

		TabSwitchToParent();

		Thread.sleep(1000);
		By Accept = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Accept));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been Accepted");

		Thread.sleep(9000);
		try {

			By element2 = By.xpath("//i[@class='fa fa-bullseye']");
			if (driver.findElement(element2).isDisplayed()) {
				By Minimize = By.xpath("//a[@class='acc fa fa-window-minimize popup-btns']");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
				MoveToElementClick(element);
				ExtentSuccessMessage("Clicked on Minimize Button");

			}
		} catch (NoSuchElementException e) {
		} catch (Exception e) {
			ExtentSuccessMessage("Lead Created");
		}

		Thread.sleep(4000);

		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);

		Thread.sleep(2000);
		if (currenturl.contains("https://mme.benefitalign.com/")) {
			By RecordButton = By.cssSelector(
					"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > div.voice-call-ongoing-quick-icons > span > a:nth-child(1) > i");
			wait.until(ExpectedConditions.elementToBeClickable(RecordButton));
			click(RecordButton);
			ExtentSuccessMessage("Clicked on Record Button Button");

		} else {
			System.out.println("Not a prod env");
		}

		Thread.sleep(9000);
		By Decline = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Decline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Decline Button");

		Thread.sleep(3000);

		driver.navigate().refresh();

		Thread.sleep(9000);

		By CallRecording = By.xpath("//a[@title='Recordings']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallRecording));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Recording Button");

		Thread.sleep(3000);
		By QuickDial = By.xpath("//i[contains(.,' " + time + "')]/ancestor::span/i[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(QuickDial));
		MoveToElementClick(element);
		String name = element.getText();
		System.out.println(name + "-----name");
		ExtentSuccessMessage("Clicked on QuickDial Button");

		String time2 = CurrentTime();
		System.out.println(time);
		String timeee = removeLeadingZero(time2);
		System.out.println(timeee);

		Thread.sleep(6000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Decline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Decline Button");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallRecording));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Recording Button");

		Thread.sleep(3000);
		By PlayButton = By.xpath("//i[contains(.,'" + time + "')]/ancestor::li/button[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(PlayButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Recording Button");

		Thread.sleep(2000);

		Thread.sleep(8000);
		By DownloadButton = By.xpath("//u[contains(.,'" + time + "')]/ancestor::li/div/button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DownloadButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Download Button");

		Thread.sleep(4000);

		ClickonDownoadRecordings();

		Thread.sleep(4000);
		By SearchField = By.cssSelector(
				"#voice-call-window-draggable > div.voice-call-window-content-right-section.right-al.cti-noscroll-padding.ng-scope > div.cti-search-section > div > input");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchField));
		MoveToElementClick(element);
		writeText(SearchField, secondnumber + Keys.ENTER);
		ExtentSuccessMessage("Name has been searched on name field");

		Thread.sleep(2000);
		By TimeValidation = By.xpath("//u[contains(.,'" + time + "')]");
		Assert.assertTrue(driver.findElement(TimeValidation).isDisplayed());
		ExtentSuccessMessage("Latest Recording is Visible after number Search");

		Thread.sleep(2000);
		By Remove = By.xpath("(//i[@class='fa fa-close ng-scope'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Remove));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Remove Icon");

		Thread.sleep(3000);
		By SearchField2 = By.cssSelector(
				"#voice-call-window-draggable > div.voice-call-window-content-right-section.right-al.cti-noscroll-padding.ng-scope > div.cti-search-section > div > input");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchField2));
		MoveToElementClick(element);
		String numberString = StringUtils.substringAfter(secondnumber, " ");
		System.out.println(numberString);
		writeText(SearchField2, numberString + Keys.ENTER);
		ExtentSuccessMessage("Searched with Partial Number");

		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(TimeValidation).isDisplayed());
		ExtentSuccessMessage("Latest Recording is Visible after Partialnumber Search");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Remove));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Remove Icon");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchField2));
		MoveToElementClick(element);
		String namee = getFirstTwoWords(name);
		System.out.println(namee);
		writeText(SearchField2, namee + Keys.ENTER);
		ExtentSuccessMessage("Entered full name");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Remove));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Remove Icon");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchField2));
		MoveToElementClick(element);
		String nameString = StringUtils.substringAfter(namee, " ");
		writeText(SearchField2, nameString + Keys.ENTER);
		ExtentSuccessMessage("Entered Partial Name");

		logout_CE_validations();

		TabSwitchToChild();

	}

	public static String getFirstTwoWords(String input) {
		String[] words = input.split(" ");

		if (words.length < 2) {
			return input;
		}

		return words[0] + " " + words[1];
	}

	public void validate_by_clicking_Recording_call_option() throws InterruptedException, IOException {
		String QAURL = configloader().getProperty("QA_URL");
		driver.get(QAURL);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		splitthewindowscreen("RIGHT");
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		splitthewindowscreen("LEFT");
		String Username1 = null;
		String Password1 = null;
		String Username2 = null;
		String Password2 = null;
		driver.get(currentUrl);
		if (currentUrl.contains("qa")) {
			Username1 = configloader().getProperty("QA_UserName1");
			Password1 = configloader().getProperty("QA_Password1");
			Username2 = configloader().getProperty("QA_UserName2");
			Password2 = configloader().getProperty("QA_Password2");
		} else if (currentUrl.contains("uat")) {
			Username1 = configloader().getProperty("UAT_UserName1");
			Password1 = configloader().getProperty("UAT_Password1");
			Username2 = configloader().getProperty("UAT_UserName2");
			Password2 = configloader().getProperty("UAT_Password2");
		} else if (currentUrl.contains("mme.")) {
			Username1 = configloader().getProperty("PP_UserName1");
			Password1 = configloader().getProperty("PP_Password1");
			Username2 = configloader().getProperty("PP_UserName2");
			Password2 = configloader().getProperty("PP_Password2");
		}
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		// writeText(userID, configloader().getProperty("QA_UserName2"));
		writeText(userID, Username2);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, Password2);
		// writeText(pwd, configloader().getProperty("QA_Password2"));
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}

		Thread.sleep(45000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		String SecondNumberOutput = element.getText();
		System.out.println("Debug" + SecondNumberOutput);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(0));
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		// writeText(userID, "syncautomationagent");
		writeText(userID, Username1);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		// writeText(pwd, "P@ssword123!");
		writeText(pwd, Password1);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);

		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}

		Thread.sleep(25000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println("Debug" + NumberOutput);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UATNumberField));
		MoveToElementClick(element);
		String QualtiaNumber = SecondNumberOutput;
		// String QualtiaNumber = "(386) 703-3867";
		writeText(UATNumberField, QualtiaNumber);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		Thread.sleep(20000);
		driver.switchTo().window(tabs.get(1));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, NumberOutput);
		ExtentSuccessMessage("Assertion has been done");
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(9000);
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(3000);
		ClickOnRecordingCallIconIsvisible();
		Thread.sleep(5000);
		CheckCallRecordingOnIconIsvisible();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Decline Button'");
		String CurrentTime = CurrentTime();
		RefreshPage();
		HomePage.ClickedOnRecordingPage();

		String CurrentDate = Currentdate();
		if (ElementDisplayed(CallRecordinglist)) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallRecordinglist));
			RecordingDetails = element.getText();
			System.out.println("RecordingDetails;-" + RecordingDetails);
			Assert.assertEquals(RecordingDetails, CurrentDate + " " + CurrentTime);
		} else {
			ExtentErrorMessage("Unsuccessfully user not able to find the latest recording from the list");

		}

	}

	public void CheckCallRecordingOnIconIsvisible() throws InterruptedException {
		waitVisibility(CallRecordingon);
		if (ElementDisplayed(CallRecordingon)) {
			ExtentSuccessMessage("Successfully user able to See 'Call Recording on Icon' ");
			click(CallRecordingon);
			ExtentSuccessMessage("Successfully user Clicked on 'CallRecording Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'Call Recording on Icon' Not visible");
		}
	}

	public void ClickOnRecordingCallIconIsvisible() throws InterruptedException {
		waitVisibility(CallRecording);
		if (ElementDisplayed(CallRecording)) {
			ExtentSuccessMessage("Successfully user able to See 'CallRecording Icon' ");
			click(CallRecording);
			ExtentSuccessMessage("Successfully user Clicked on 'CallRecording Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'CallRecording Icon' Not visible");
		}
	}

	public void CheckOnRecordingCallIconIsvisible() throws InterruptedException {
		waitVisibility(CallRecording);
		if (ElementDisplayed(CallRecording)) {
			ExtentSuccessMessage("Successfully user able to See 'CallRecording Icon' ");

		} else {
			ExtentErrorMessage("Unsuccessfully 'CallRecording Icon' Not visible");
		}
	}

	public void ClickOnHoldCallIconIsvisible() throws InterruptedException {
		waitVisibility(CallHold);
		if (ElementDisplayed(CallHold)) {
			ExtentSuccessMessage("Successfully user able to See 'CallHold Icon' ");
			click(CallHold);
			ExtentSuccessMessage("Successfully user Clicked on 'CallHold Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'CallHold Icon' Not visible");
		}
	}

	public void CheckCallonholdIconIsvisible() throws InterruptedException {
		waitVisibility(CallonHoldIcon);
		if (ElementDisplayed(CallonHoldIcon)) {
			ExtentSuccessMessage("Successfully user able to See 'Call on Hold ' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'Call on Hold' Not visible");
		}
	}

	// public void ClickonSearchCallAddAgent() throws InterruptedException {
	// if(ElementDisplayed(SearchCallAddAgent)) {
	// ExtentSuccessMessage("Successfully user able to See 'Search Call Add Agent
	// Button' ");
	// click(SearchCallAddAgent);
	// ExtentSuccessMessage("Successfully user Clicked on 'Search Call Add Agent
	// Button' ");
	// }else {
	//
	// ExtentErrorMessage("UnSuccessfully user not able to See 'Search Call Add
	// Agent Button' ");
	// }
	// }
	// public void ClickonCallAddAgent() throws InterruptedException {
	// if(ElementDisplayed(CallAddAgent)) {
	// ExtentSuccessMessage("Successfully user able to See 'CallAddAgent Button' ");
	// click(CallAddAgent);
	// ExtentSuccessMessage("Successfully user Clicked on 'CallAddAgent Button' ");
	// }else {
	//
	// ExtentErrorMessage("UnSuccessfully user not able to See 'CallAddAgent Button'
	// ");
	// }
	// }
	// public void ClickOnCallAddIconIsvisible() throws InterruptedException {
	// waitVisibility(CallAdd);
	// if(ElementDisplayed(CallAdd)) {
	// ExtentSuccessMessage("Successfully user able to See 'CallAdd Icon' ");
	// click(CallAdd);
	// ExtentSuccessMessage("Successfully user Clicked on 'CallAdd Icon' ");
	// }else {
	// ExtentErrorMessage("Unsuccessfully 'CallAdd Icon' Not visible");
	// }
	// }
	// public void ClickonAgentCallForward() throws InterruptedException {
	// if(ElementDisplayed(CallForwardAgent)) {
	// ExtentSuccessMessage("Successfully user able to See 'Call Forward Agent
	// Button' ");
	// click(CallForwardAgent);
	// ExtentSuccessMessage("Successfully user Clicked on 'Call Forward Agent
	// Button' ");
	// }else {
	//
	// ExtentErrorMessage("UnSuccessfully user not able to See 'Call Forward Agent
	// Button' ");
	// }
	// }
	public void validate_by_clicking_forwarding_call_option() throws InterruptedException, IOException {

		Thread.sleep(8000);
		URL = driver.getCurrentUrl();
		System.out.println("Current URL = " + URL);
		User();
		// splitthewindowscreen2("Right");
		new_Window();
		// maximizeWindow();
		// splitthewindowscreen2("Left");
		secondUser_Call();
		login_CE_validations();
	
		driver.switchTo().newWindow(WindowType.TAB);
		ExtentSuccessMessage("New Tab has been Opened");
		login_ThirdUser();
		login_CE_validations();
		By UserNumber3 = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber3));
		String thirdnumber=element.getText();
		System.out.println(thirdnumber);
		waitForElement(2000);
		TabSwitchToChild();

		String QualtiaNumber = UserNumberforCTI;
		writeText(UATNumberField, QualtiaNumber);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		Thread.sleep(2000);
		TabSwitchToParent();
		Thread.sleep(10000);
		waitVisibility(Qualtia1Number);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		//Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(2000);
		TabSwitchToChild();
		ClickOnCallTransferIconIsvisible();
		Thread.sleep(5000);
		if (URL.contains("https://ce-qa.benefitalign.com/")) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Agents));
			MoveToElementClick(element);
		}
		if(ElementDisplayed(Agents)) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Agents));
			MoveToElementClick(element);
		}
		waitForElement(2000);
		By Search = By.xpath("//div[@class='input-group col-md-12']//input[@id='example-search-input']");
		waitVisibility(Search);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Search));
		MoveToElementClick(element);
		String user = "CEuserone CTI";
		writeText(Search, user);
		Base_Class.KeyOperation("ENTER");
		waitForElement(2000);
		By CEAgent = By.xpath("//span[@title='"+user+"']/parent::*/button");
		waitVisibility(CEAgent);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CEAgent));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		wait.until(ExpectedConditions.presenceOfElementLocated(CEAgent));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CEAgent));
		if(ElementDisplayed(CallforwardAgentNumber)) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallforwardAgentNumber));
			String FrowardAgentNumber = element.getText();
			System.out.println("FrowardAgentNumber:- " + FrowardAgentNumber);
			ClickonAgentCallForward();
			Thread.sleep(2000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Callnumberforwardedagent));
			String VerifyFrowardAgentNumber = element.getText();
			System.out.println("FrowardAgentNumber:- " + VerifyFrowardAgentNumber);
			Assert.assertEquals(VerifyFrowardAgentNumber, FrowardAgentNumber);
			Thread.sleep(1000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Successfully user clicked on 'Call Decline Button'");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Successfully user clicked on 'Call Decline Button'");	
		} else {
			ExtentSuccessMessage("UnSuccessfully Call Forward Number not there");
		}	
		
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed!");
		waitForElement(1000);
		TabSwitchToParent();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed!");
		waitForElement(1000);
		TabSwitchToThirdWindow();
		
	}

	public void validate_by_clicking_call_Add_option() throws InterruptedException, IOException {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		splitthewindowscreen("RIGHT");
		Thread.sleep(15000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		String SecondNumberOutput = element.getText();
		System.out.println("DebugSecondNumberOutput:- " + SecondNumberOutput);
		String ReferenceLogin = "PLCA";
		String UserName = null;
		String Password = null;
		for (String key : configloader().stringPropertyNames()) {
			String value = configloader().getProperty(key);
			if (key.contains(ReferenceLogin) && currentUrl.contains("https://mme.brokerengage.net/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", "");
				if (replaceKeyValue.contains("SecondUser")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("SecondPassword")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}

			if (key.contains(ReferenceLogin) && currentUrl.contains("https://ce-qa.benefitalign.com/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", "");
				if (replaceKeyValue.contains("QAUserName1")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("QAPassword1")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}

			else {
			}

		}
		System.out.println("Final username fetch :" + UserName);
		System.out.println("Final username fetch :" + Password);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		splitthewindowscreen("LEFT");

		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(1));
		driver.get(currentUrl);
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, UserName);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, Password);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}
		Thread.sleep(35000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println("Debug" + NumberOutput);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UATNumberField));
		MoveToElementClick(element);
		String QualtiaNumber = SecondNumberOutput;
		// String QualtiaNumber = "(386) 703-3867";
		writeText(UATNumberField, QualtiaNumber);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		Thread.sleep(20000);
		driver.switchTo().window(tabs.get(0));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, NumberOutput);
		ExtentSuccessMessage("Assertion has been done");
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(19000);
		driver.switchTo().window(tabs.get(0));
		ClickOnCallAddIconIsvisible();
		Thread.sleep(5000);
		ClickonSearchCallAddAgent();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAddAgentNumber));
		String AddAgentNumber = element.getText();
		System.out.println("AddAgentNumber:- " + AddAgentNumber);
		ClickonCallAddAgent();
		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Callnumberforwardedagent));
		String VerifyAddAgentNumber = element.getText();
		System.out.println("AddAgentNumber:- " + VerifyAddAgentNumber);
		Assert.assertEquals(VerifyAddAgentNumber, AddAgentNumber);
		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Decline Button'");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Decline Button'");
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed!");
		waitForElement(1000);
		driver.switchTo().window(tabs.get(1));
	}

	public void validate_by_minimize_the_widget_option() throws InterruptedException, IOException {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		splitthewindowscreen("RIGHT");
		Thread.sleep(15000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		String SecondNumberOutput = element.getText();
		System.out.println("DebugSecondNumberOutput:- " + SecondNumberOutput);
		String ReferenceLogin = "PLCA";
		String UserName = null;
		String Password = null;
		for (String key : configloader().stringPropertyNames()) {
			String value = configloader().getProperty(key);
			if (key.contains(ReferenceLogin) && currentUrl.contains("https://mme.brokerengage.net/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", "");
				if (replaceKeyValue.contains("SecondUser")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("SecondPassword")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}

			if (key.contains(ReferenceLogin) && currentUrl.contains("https://ce-qa.benefitalign.com/")) {
				String KeyValue = key + ";" + value;
				String replaceKeyValue = KeyValue.replace(ReferenceLogin + "_", "");
				if (replaceKeyValue.contains("QAUserName1")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("QAPassword1")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}

			else {
			}

		}
		System.out.println("Final username fetch :" + UserName);
		System.out.println("Final username fetch :" + Password);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		splitthewindowscreen("LEFT");

		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(1));
		driver.get(currentUrl);
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		writeText(userID, UserName);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, Password);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}
		Thread.sleep(35000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println("Debug" + NumberOutput);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UATNumberField));
		MoveToElementClick(element);
		String QualtiaNumber = SecondNumberOutput;
		// String QualtiaNumber = "(386) 703-3867";
		writeText(UATNumberField, QualtiaNumber);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		Thread.sleep(20000);
		driver.switchTo().window(tabs.get(0));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, NumberOutput);
		ExtentSuccessMessage("Assertion has been done");
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(19000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Minimize Icon'");
		if (currentUrl.contains("qa")) {
			CheckThequickMuteIcon();
			CheckThequickHOldIcon();
			CheckThequickEndCallIcon();
			CheckTheQuickCallRecordIcon();
		} else if (currentUrl.contains("uat")) {
			CheckThequickMuteIcon();
			CheckThequickHOldIcon();
			CheckThequickEndCallIcon();
			CheckTheQuickCallRecordIcon();
		} else if (currentUrl.contains("mme.")) {
			CheckThequickMuteIcon();
			CheckThequickHOldIcon();
			CheckThequickEndCallIcon();
		}

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Decline Button'");
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed!");
		waitForElement(1000);
		driver.switchTo().window(tabs.get(0));
	}

	public void ClickOnCallAddIconIsvisible() throws InterruptedException {
		waitVisibility(CallAdd);
		if (ElementDisplayed(CallAdd)) {
			ExtentSuccessMessage("Successfully user able to See 'CallAdd Icon' ");
			click(CallAdd);
			ExtentSuccessMessage("Successfully user Clicked on 'CallAdd Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'CallAdd Icon' Not visible");
		}
	}

	public void CheckThequickMuteIcon() throws InterruptedException {
		if (ElementDisplayed(QuickCallMuteIcon)) {
			ExtentSuccessMessage("Successfully user able to See 'QuickCallMuteIcon Button' ");
		} else {

			ExtentErrorMessage("UnSuccessfully user not able to See 'QuickCallMuteIcon Button' ");
		}
	}

	public void CheckThequickEndCallIcon() throws InterruptedException {
		if (ElementDisplayed(QuickCallEndCallIcon)) {
			ExtentSuccessMessage("Successfully user able to See 'QuickCallEndCallIcon Button' ");
		} else {

			ExtentErrorMessage("UnSuccessfully user not able to See 'QuickCallEndCallIcon Button' ");
		}
	}

	public void CheckThequickHOldIcon() throws InterruptedException {
		if (ElementDisplayed(QuickCallHoldIcon)) {
			ExtentSuccessMessage("Successfully user able to See 'QuickCallHoldIcon Button' ");
		} else {

			ExtentErrorMessage("UnSuccessfully user not able to See 'QuickCallHoldIcon Button' ");
		}
	}

	public void CheckTheQuickCallRecordIcon() throws InterruptedException {
		if (ElementDisplayed(QuickCallRecordIcon)) {
			ExtentSuccessMessage("Successfully user able to See 'QuickCallRecordIcon Button' ");
		} else {

			ExtentErrorMessage("UnSuccessfully user not able to See 'QuickCallRecordIcon Button' ");
		}
	}

	public void validate_by_caller_details_displaye_Inbound_Calls() throws InterruptedException, IOException {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		splitthewindowscreen("RIGHT");
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		splitthewindowscreen("LEFT");
		String Username1 = null;
		String Password1 = null;
		String Username2 = null;
		String Password2 = null;
		driver.get(currentUrl);
		if (currentUrl.contains("qa")) {
			Username1 = configloader().getProperty("QA_UserName1");
			Password1 = configloader().getProperty("QA_Password1");
			Username2 = configloader().getProperty("QA_UserName2");
			Password2 = configloader().getProperty("QA_Password2");
		} else if (currentUrl.contains("uat")) {
			Username1 = configloader().getProperty("UAT_UserName1");
			Password1 = configloader().getProperty("UAT_Password1");
			Username2 = configloader().getProperty("UAT_UserName2");
			Password2 = configloader().getProperty("UAT_Password2");
		} else if (currentUrl.contains("mme.")) {
			Username1 = configloader().getProperty("PP_UserName1");
			Password1 = configloader().getProperty("PP_Password1");
			Username2 = configloader().getProperty("PP_UserName2");
			Password2 = configloader().getProperty("PP_Password2");
		}
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		// writeText(userID, "syncautomationagent");
		writeText(userID, Username1);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		// writeText(pwd, "P@ssword123!");
		writeText(pwd, Password1);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}

		Thread.sleep(15000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		String SecondNumberOutput = element.getText();
		System.out.println("Debug" + SecondNumberOutput);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(0));
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		// writeText(userID, "Selenium.awsuser1");
		writeText(userID, Username2);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		// writeText(pwd, "P@ssword123!");
		writeText(pwd, Password2);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}

		Thread.sleep(35000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		NumberOutput = element.getText();
		System.out.println("Debug" + NumberOutput);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UATNumberField));
		MoveToElementClick(element);
		String QualtiaNumber = SecondNumberOutput;
		// String QualtiaNumber = "(386) 703-3867";
		writeText(UATNumberField, QualtiaNumber);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		System.out.println("Clicked on Call Button");
		Thread.sleep(15000);
		driver.switchTo().window(tabs.get(1));
		System.out.println("Switched 2nd windows");
		SelectUSerelement = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		SelectUSerelementOutput1 = SelectUSerelement.getText();
		System.out.println("SelectUSerelement" + SelectUSerelementOutput1);
		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println("NumberOutput1" + NumberOutput1);
		Assert.assertEquals(NumberOutput1, NumberOutput);
		System.out.println("Assertion has been done");
		ExtentSuccessMessage("Assertion has been done");
		Thread.sleep(1000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(19000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Minimize Icon'");
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Decline Button'");
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed!");
		waitForElement(1000);
		driver.switchTo().window(tabs.get(1));
	}

	public void validate_call_response_based_on_the_accepted(CensusInfo ApplicantInfo)
			throws InterruptedException, IOException {
		String QAURL = configloader().getProperty("QA_URL");
		driver.get(QAURL);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		splitthewindowscreen("RIGHT");
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		splitthewindowscreen("LEFT");
		String Username1 = null;
		String Password1 = null;
		String Username2 = null;
		String Password2 = null;
		driver.get(currentUrl);
		if (currentUrl.contains("qa")) {
			Username1 = configloader().getProperty("QA_UserName1");
			Password1 = configloader().getProperty("QA_Password1");
			Username2 = configloader().getProperty("QA_UserName2");
			Password2 = configloader().getProperty("QA_Password2");
		} else if (currentUrl.contains("uat")) {
			Username1 = configloader().getProperty("UAT_UserName1");
			Password1 = configloader().getProperty("UAT_Password1");
			Username2 = configloader().getProperty("UAT_UserName2");
			Password2 = configloader().getProperty("UAT_Password2");
		} else if (currentUrl.contains("mme.")) {
			Username1 = configloader().getProperty("PP_UserName1");
			Password1 = configloader().getProperty("PP_Password1");
			Username2 = configloader().getProperty("PP_UserName2");
			Password2 = configloader().getProperty("PP_Password2");
		}
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		// writeText(userID, configloader().getProperty("QA_UserName2"));
		writeText(userID, Username2);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, Password2);
		// writeText(pwd, configloader().getProperty("QA_Password2"));
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}

		Thread.sleep(45000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		String SecondNumberOutput = element.getText();
		System.out.println("Debug" + SecondNumberOutput);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(0));
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		// writeText(userID, "syncautomationagent");
		writeText(userID, Username1);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		// writeText(pwd, "P@ssword123!");
		writeText(pwd, Password1);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);

		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}

		Thread.sleep(25000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Minimize Icon'");

		CTI_Leadgridpage.CreateLead(SecondNumberOutput, ApplicantInfo.Email);
		driver.switchTo().window(tabs.get(1));

		System.out.println("Switched 2nd windows");
		SelectUSerelement = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		SelectUSerelementOutput1 = SelectUSerelement.getText();
		System.out.println("SelectUSerelement" + SelectUSerelementOutput1);
		Thread.sleep(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println("NumberOutput1" + NumberOutput1);
		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(10000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Decline Button'");
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed!");
		waitForElement(1000);
		driver.switchTo().window(tabs.get(0));
	}

	public void validate_call_Commented_Added(CensusInfo ApplicantInfo)
			throws InterruptedException, IOException, AWTException {

		String QAURL = configloader().getProperty("QA_URL");
		driver.get(QAURL);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		splitthewindowscreen("RIGHT");
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		splitthewindowscreen("LEFT");
		String Username1 = null;
		String Password1 = null;
		String Username2 = null;
		String Password2 = null;
		driver.get(currentUrl);
		if (currentUrl.contains("qa")) {
			Username1 = configloader().getProperty("QA_UserName1");
			Password1 = configloader().getProperty("QA_Password1");
			Username2 = configloader().getProperty("QA_UserName2");
			Password2 = configloader().getProperty("QA_Password2");
		} else if (currentUrl.contains("uat")) {
			Username1 = configloader().getProperty("UAT_UserName1");
			Password1 = configloader().getProperty("UAT_Password1");
			Username2 = configloader().getProperty("UAT_UserName2");
			Password2 = configloader().getProperty("UAT_Password2");
		} else if (currentUrl.contains("mme.")) {
			Username1 = configloader().getProperty("PP_UserName1");
			Password1 = configloader().getProperty("PP_Password1");
			Username2 = configloader().getProperty("PP_UserName2");
			Password2 = configloader().getProperty("PP_Password2");
		}
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		// writeText(userID, configloader().getProperty("QA_UserName2"));
		writeText(userID, Username2);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, Password2);
		// writeText(pwd, configloader().getProperty("QA_Password2"));
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}

		Thread.sleep(45000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		String SecondNumberOutput = element.getText();
		System.out.println("Debug" + SecondNumberOutput);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(0));
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		// writeText(userID, "syncautomationagent");
		writeText(userID, Username1);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		// writeText(pwd, "P@ssword123!");
		writeText(pwd, Password1);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);

		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}

		Thread.sleep(25000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Minimize Icon'");
		CTI_Leadgridpage.CreateLeadAddComment(SecondNumberOutput, ApplicantInfo.Email);
		driver.switchTo().window(tabs.get(1));

		System.out.println("Switched 2nd windows");
		SelectUSerelement = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		SelectUSerelementOutput1 = SelectUSerelement.getText();
		System.out.println("SelectUSerelement" + SelectUSerelementOutput1);
		Thread.sleep(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println("NumberOutput1" + NumberOutput1);
		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(10000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Decline Button'");
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed!");
		waitForElement(1000);
		driver.switchTo().window(tabs.get(0));
	}

	public void ClickonAgentCallForward() throws InterruptedException {

		if (ElementDisplayed(CallForwardAgent)) {

			ExtentSuccessMessage("Successfully user able to See 'Call Forward Agent Button' ");

			click(CallForwardAgent);

			ExtentSuccessMessage("Successfully user Clicked on 'Call Forward Agent Button' ");

		} else {

			ExtentErrorMessage("UnSuccessfully user not able to See 'Call Forward Agent Button' ");

		}

	}

	public void ClickonSearchCallAddAgent() throws InterruptedException {

		if (ElementDisplayed(SearchCallAddAgent)) {

			ExtentSuccessMessage("Successfully user able to See 'Search Call Add Agent Button' ");

			click(SearchCallAddAgent);

			ExtentSuccessMessage("Successfully user Clicked on 'Search Call Add Agent Button' ");

		} else {

			ExtentErrorMessage("UnSuccessfully user not able to See 'Search Call Add Agent Button' ");

		}

	}

	public void ClickonCallAddAgent() throws InterruptedException {

		if (ElementDisplayed(CallAddAgent)) {

			ExtentSuccessMessage("Successfully user able to See 'CallAddAgent Button' ");

			click(CallAddAgent);

			ExtentSuccessMessage("Successfully user Clicked on 'CallAddAgent Button' ");

		} else {

			ExtentErrorMessage("UnSuccessfully user not able to See 'CallAddAgent Button' ");

		}

	}

	public void validate_call_history_tab_on_lead_details(CensusInfo ApplicantInfo)
			throws InterruptedException, IOException, AWTException {

		String QAURL = configloader().getProperty("QA_URL");
		driver.get(QAURL);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		splitthewindowscreen("RIGHT");
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		splitthewindowscreen("LEFT");
		String Username1 = null;
		String Password1 = null;
		String Username2 = null;
		String Password2 = null;
		driver.get(currentUrl);
		if (currentUrl.contains("qa")) {
			Username1 = configloader().getProperty("QA_UserName1");
			Password1 = configloader().getProperty("QA_Password1");
			Username2 = configloader().getProperty("QA_UserName2");
			Password2 = configloader().getProperty("QA_Password2");
		} else if (currentUrl.contains("uat")) {
			Username1 = configloader().getProperty("UAT_UserName1");
			Password1 = configloader().getProperty("UAT_Password1");
			Username2 = configloader().getProperty("UAT_UserName2");
			Password2 = configloader().getProperty("UAT_Password2");
		} else if (currentUrl.contains("mme.")) {
			Username1 = configloader().getProperty("PP_UserName1");
			Password1 = configloader().getProperty("PP_Password1");
			Username2 = configloader().getProperty("PP_UserName2");
			Password2 = configloader().getProperty("PP_Password2");
		}
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		// writeText(userID, configloader().getProperty("QA_UserName2"));
		writeText(userID, Username2);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, Password2);
		// writeText(pwd, configloader().getProperty("QA_Password2"));
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}

		Thread.sleep(45000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		String SecondNumberOutput = element.getText();
		System.out.println("Debug" + SecondNumberOutput);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(0));
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		// writeText(userID, "syncautomationagent");
		writeText(userID, Username1);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		// writeText(pwd, "P@ssword123!");
		writeText(pwd, Password1);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);

		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}

		Thread.sleep(25000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Minimize Icon'");
		String Title = CTI_Leadgridpage.CreateLeadAddComment(SecondNumberOutput, ApplicantInfo.Email);
		driver.switchTo().window(tabs.get(1));

		System.out.println("Switched 2nd windows");
		SelectUSerelement = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		SelectUSerelementOutput1 = SelectUSerelement.getText();
		System.out.println("SelectUSerelement" + SelectUSerelementOutput1);
		Thread.sleep(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println("NumberOutput1" + NumberOutput1);
		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(10000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Decline Button'");
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(0));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Minimize Icon'");

		By LeadTitle = By.xpath("//*[@title='" + Title + "']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadTitle));
		MoveToElementClick(element);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadTelephonyTab));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Lead Telephony Tab'");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed!");
		waitForElement(1000);
		driver.switchTo().window(tabs.get(0));
	}

	public void validate_Cancel_Incoming_Call(CensusInfo ApplicantInfo)
			throws InterruptedException, IOException, AWTException {

		String QAURL = configloader().getProperty("QA_URL");
		driver.get(QAURL);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		splitthewindowscreen("RIGHT");
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		splitthewindowscreen("LEFT");
		String Username1 = null;
		String Password1 = null;
		String Username2 = null;
		String Password2 = null;
		driver.get(currentUrl);
		if (currentUrl.contains("qa")) {
			Username1 = configloader().getProperty("QA_UserName1");
			Password1 = configloader().getProperty("QA_Password1");
			Username2 = configloader().getProperty("QA_UserName2");
			Password2 = configloader().getProperty("QA_Password2");
		} else if (currentUrl.contains("uat")) {
			Username1 = configloader().getProperty("UAT_UserName1");
			Password1 = configloader().getProperty("UAT_Password1");
			Username2 = configloader().getProperty("UAT_UserName2");
			Password2 = configloader().getProperty("UAT_Password2");
		} else if (currentUrl.contains("mme.")) {
			Username1 = configloader().getProperty("PP_UserName1");
			Password1 = configloader().getProperty("PP_Password1");
			Username2 = configloader().getProperty("PP_UserName2");
			Password2 = configloader().getProperty("PP_Password2");
		}
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		// writeText(userID, configloader().getProperty("QA_UserName2"));
		writeText(userID, Username2);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, Password2);
		// writeText(pwd, configloader().getProperty("QA_Password2"));
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);
		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}

		Thread.sleep(45000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualatia1Number));
		String SecondNumberOutput = element.getText();
		System.out.println("Debug" + SecondNumberOutput);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(0));
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage Username field");
		// writeText(userID, "syncautomationagent");
		writeText(userID, Username1);
		ExtentSuccessMessage("Entered the Customer Engage Username");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		// writeText(pwd, "P@ssword123!");
		writeText(pwd, Password1);
		ExtentSuccessMessage("Entered the Customer Engage Password");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Customer Engage Application Sign-In Done");
		waitForElement(3000);

		try {
			if (driver.findElement(CheckUserLogin).isDisplayed()) {
				click(CheckUserLogin);
				ExtentSuccessMessage(
						"You currently have an active session on another device hence Deactivated the other session!");
			} else {
				ExtentSuccessMessage("Login has been successful");
			}
		} catch (Exception e) {
			ExtentSuccessMessage("Applicantion login successful");
		}

		Thread.sleep(25000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Minimize Icon'");
		String Title = CTI_Leadgridpage.CreateLeadAddComment(SecondNumberOutput, ApplicantInfo.Email);
		driver.switchTo().window(tabs.get(1));

		System.out.println("Switched 2nd windows");
		SelectUSerelement = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		SelectUSerelementOutput1 = SelectUSerelement.getText();
		System.out.println("SelectUSerelement" + SelectUSerelementOutput1);
		Thread.sleep(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println("NumberOutput1" + NumberOutput1);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Decline Button'");
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(0));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Minimize Icon'");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed!");
		waitForElement(1000);
		driver.switchTo().window(tabs.get(1));
	}

	public void ClickOnDeleteRecordingTab() throws InterruptedException {
		waitVisibility(DeleteRecordingTab);
		if (ElementDisplayed(DeleteRecordingTab)) {
			ExtentSuccessMessage("Successfully user able to See 'Delete Recording Tab Button' ");
			click(DeleteRecordingTab);
			ExtentSuccessMessage("Successfully user Clicked on 'Delete Recording Tab Button' ");
			waitVisibility(DeleteConfirmation);
			click(DeleteConfirmation);
			ExtentSuccessMessage("Successfully user Clicked on 'Delete Confirmation Recording Tab Button' ");
			Thread.sleep(2000);
			if (ElementDisplayed(DeleteRecordingSuccessmsg)) {
				ExtentSuccessMessage("Successfully user able to See 'Delete Recording Succcess message' ");
			} else {
				ExtentErrorMessage("UnSuccessfully user not able to See 'Delete Recording Succcess message' ");
			}
		} else {

			ExtentErrorMessage("UnSuccessfully user not able to See 'Delete Recording Tab Button' ");
		}
	}

	public void ClickOnPlayRecordingRecordingTab() throws InterruptedException {
		if (ElementDisplayed(PlayRecording)) {
			ExtentSuccessMessage("Successfully user able to See 'Play Recording Tab Button' ");
			click(PlayRecording);
			ExtentSuccessMessage("Successfully user Clicked on 'Play Recording Tab Button' ");
			Thread.sleep(2000);
			if (ElementDisplayed(PlayrecoringValidation)) {
				ExtentSuccessMessage("Successfully user able to See 'audio player' ");
			} else {
				ExtentErrorMessage("UnSuccessfully user not able to See 'audio player' ");
			}
		} else {

			ExtentErrorMessage("UnSuccessfully user not able to See'Play Recording Tab Button' ");
		}
	}

	public void ClickonDownoadRecording() throws InterruptedException, AWTException, ParseException {
		if (ElementDisplayed(DownloadRecording)) {
			ExtentSuccessMessage("Successfully user able to See 'DownloadRecording Recording Tab Button' ");
			click(DownloadRecording);
			ExtentSuccessMessage("Successfully user Clicked on 'DownloadRecording Recording Tab Button' ");
			Thread.sleep(2000);
			Base_Class.switchtabwithindex(2);
			Thread.sleep(5000);
			Base_Class.DownloadFileWithRobot();
			Base_Class.switchtabwithindex(0);
		} else {

			ExtentErrorMessage("UnSuccessfully user not able to See'Play Recording Tab Button' ");
		}
	}

	public void ClickOnPlayerPlay() throws InterruptedException, AWTException {
		if (ElementDisplayed(PlayrecoringValidation)) {
			ExtentSuccessMessage("Successfully user able to See 'Player Play' ");
			click(PlayrecoringValidation);
			// Base_Class.RobotKeyOperation("TAB");
			// Base_Class.RobotKeyOperation("TAB");
			// Base_Class.RobotKeyOperation("TAB");
			Base_Class.RobotKeyOperation("TAB");
			Base_Class.RobotKeyOperation("ENTER");
			ExtentSuccessMessage("Successfully user Clicked on 'Player Play' ");
		} else {

			ExtentErrorMessage("UnSuccessfully user not able to See'Player Play' ");
		}
	}

	public void ClickOnPlayerPause() throws InterruptedException, AWTException {
		if (ElementDisplayed(PlayrecoringValidation)) {
			ExtentSuccessMessage("Successfully user able to See 'Player Play' ");
			click(PlayrecoringValidation);
			// Base_Class.RobotKeyOperation("TAB");
			// Base_Class.RobotKeyOperation("TAB");
			// Base_Class.RobotKeyOperation("TAB");
			Base_Class.RobotKeyOperation("TAB");
			Base_Class.RobotKeyOperation("ENTER");
			ExtentSuccessMessage("Successfully user Clicked on 'Player Play' ");
		} else {

			ExtentErrorMessage("UnSuccessfully user not able to See'Player Play' ");
		}
	}

	public void ClickOnQuickcallRecordingTab() throws InterruptedException {
		if (ElementDisplayed(QuickcallRecordingTab)) {
			ExtentSuccessMessage("Successfully user able to See 'Quick call Recording Tab Button' ");
			click(QuickcallRecordingTab);
			ExtentSuccessMessage("Successfully user Clicked on 'Quick call Recording Tab Button' ");
		} else {

			ExtentErrorMessage("UnSuccessfully user not able to See'Quick call Recording Tab Button' ");
		}
	}

	public void ClickonAddNewLead() throws InterruptedException {
		if (!ElementDisplayed(LeadInformationWindow)) {
			if (ElementDisplayed(AddANEWLEAD)) {
				ExtentSuccessMessage("Successfully user able to See 'Add A NEW LEAD Button' ");
				click(AddANEWLEAD);
				ExtentSuccessMessage("Successfully user Clicked on 'Add A NEW LEAD  Button' ");
			} else {

				ExtentErrorMessage("UnSuccessfully user not able to See 'Add A NEW LEAD  Button' ");
			}
		}
	}

	public void ClickonAddNewLeadSubmitButton() throws InterruptedException {
		if (ElementDisplayed(LeadSubmitButton)) {
			ExtentSuccessMessage("Successfully user able to See 'Add A NEW LEAD Submit Button' ");
			// click(LeadSubmitButton);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadSubmitButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Successfully user Clicked on 'Add A NEW LEAD Submit  Button' ");
		} else {

			ExtentErrorMessage("UnSuccessfully user not able to See 'Add A NEW LEAD Submit Button' ");
		}
	}

	public void EnterLeadEmail(String value) throws InterruptedException {
		System.out.println("Lead Email :-" + value);
		if (ElementDisplayed(LeadEmail)) {
			ExtentSuccessMessage("Successfully user able to See 'Lead Email Field' ");
			writeText(LeadEmail, value);
			ExtentSuccessMessage("Successfully user enter  'Lead Email' " + value);
		} else {
			ExtentErrorMessage("UnSuccessfully user not able to See 'Lead Email Field' ");
		}
	}

	public void EnterLeadDOB(String value) throws InterruptedException {
		System.out.println("Lead DOB :-" + value);
		if (ElementDisplayed(LeadDOB)) {
			ExtentSuccessMessage("Successfully user able to See 'Lead DOB Field' ");
			writeText(LeadDOB, value);
			ExtentSuccessMessage("Successfully user enter  'Lead DOB' " + value);
		} else {

			ExtentErrorMessage("UnSuccessfully user not able to See 'Lead DOB Field' ");
		}
	}

	public void SelectLeadGender(String value) throws InterruptedException {
		System.out.println("Lead Gender :-" + value);
		if (ElementDisplayed(LeadGender)) {
			ExtentSuccessMessage("Successfully user able to See 'Lead Gender dropdown' ");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadGender));
			// MoveToElementClick(element);
			Base_Class.select(value, LeadGender);
			// writeText(LeadDOB,value);
			ExtentSuccessMessage("Successfully user Select the  'Lead Gender as' " + value);
			// MoveToElementClick(element);
			System.out.println("");
		} else {

			ExtentErrorMessage("UnSuccessfully user not able to See 'Lead Gender dropdown' ");
		}
	}

	public void Validate_Settings_Edit_profile_Name() throws InterruptedException {
		By Username = By.xpath("//*[contains(@class,'profile-name')]");
		Username1 = GetElementText(Username);
		System.out.println("Username1:- " + Username1);
		ClickonProfilesetting();
		ClickonAllAvailbleProfile();
		ClickonAllAvailbleProfileEdit();
		String Newname = Username1 + generateRandomText();

		System.out.println("Newname:- " + Newname);
		EnterProfileNameField(Newname);
		ClickonUpdateProfile();
		String NewUsername = GetElementText(Username);
		System.out.println("NewUsername:- " + NewUsername);
		Assert.assertEquals(Newname, NewUsername);
		ExtentSuccessMessage("Successfully user able to See ' Updated Profile Name' ");
		ClickonAllAvailbleProfileEdit();
		EnterProfileNameField(Username1);
		ClickonUpdateProfile();
		String OlduserName = GetElementText(Username);
		System.out.println("OlduserName:- " + OlduserName);
		Assert.assertEquals(OlduserName, Username1);
		ExtentSuccessMessage("Successfully user able to See old ' Updated Profile Name' ");

	}

	public void EnterProfileNameField(String value) throws InterruptedException {
		waitVisibility(L_ProfileNameField);
		if (ElementDisplayed(L_ProfileNameField)) {
			ExtentSuccessMessage("Successfully user able to See 'Profile Name Field Icon' ");
			click(L_ProfileNameField);
			cleartextField(L_ProfileNameField);
			input(L_ProfileNameField, value);
			ExtentSuccessMessage("Successfully user entered the 'Profile Name inside field' " + value);
		} else {
			ExtentErrorMessage("Unsuccessfully 'Profile Name Field' Not visible");
		}
	}

	public void ClickonAllAvailbleProfile() throws InterruptedException {
		if (ElementDisplayed(L_AllAvailbleProfile)) {
			ExtentSuccessMessage("Successfully user able to See 'All Availble Profile' ");
			click(L_AllAvailbleProfile);
			ExtentSuccessMessage("Successfully user Clicked on 'All Availble Profile' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'All Availble Profile' Not visible");
		}
	}

	public void ClickonUpdateProfile() throws InterruptedException {
		if (ElementDisplayed(L_Update)) {
			ExtentSuccessMessage("Successfully user able to See 'Update Profile' ");
			click(L_Update);
			ExtentSuccessMessage("Successfully user Clicked on 'Update Profile' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'Update Profile' Not visible");
		}
	}

	public void ClickonAllAvailbleProfileEdit() throws InterruptedException {
		if (ElementDisplayed(L_AllAvailbleProfileEdit)) {
			ExtentSuccessMessage("Successfully user able to See 'All Availble Profile Edit' ");
			click(L_AllAvailbleProfileEdit);
			ExtentSuccessMessage("Successfully user Clicked on 'All Availble Profile Edit' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'All Availble Profile Edit' Not visible");
		}
	}

	public void ClickonProfilesetting() throws InterruptedException {
		if (ElementDisplayed(L_ProfileSetting)) {
			ExtentSuccessMessage("Successfully user able to See 'Profile setting Icon' ");
			click(L_ProfileSetting);
			ExtentSuccessMessage("Successfully user Clicked on 'Profile setting Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'Profile setting Icon' Not visible");
		}
	}

	public void ValidateDillerPadbutton() throws InterruptedException, IOException {

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		splitthewindowscreen("RIGHT");
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		splitthewindowscreen("LEFT");
		secondUser_MissedCall();
		login_CE_validations();
		String SecondNumberOutput = GetElementText(Qualatia1Number);
		System.out.println("Debug" + SecondNumberOutput);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(0));
		ExtentSuccessMessage("*******Start TC_CTI_Dailer_Minimize********");
		ClickOnMinimizeCallwindow();
		ExtentSuccessMessage("*******End TC_CTI_Dailer_Minimize********");
		ExtentSuccessMessage("*************************************************************************");
		ExtentSuccessMessage("*******Start TC_CTI_Dailer_Maximise********");
		HomePage.ClickedOnMaximiseDiller();
		ExtentSuccessMessage("*******End TC_CTI_Dailer_Maximise********");
		ExtentSuccessMessage("*************************************************************************");
		ExtentSuccessMessage("*******Start TC_CTI_Dailer_Pad********");

		NumberOutput = GetElementText(Qualatia1Number);
		System.out.println("Debug" + NumberOutput);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UATNumberField));
		MoveToElementClick(element);
		String QualtiaNumber = SecondNumberOutput;
		writeText(UATNumberField, QualtiaNumber);
		ExtentSuccessMessage("*******End TC_CTI_Dailer_Pad********");
		ExtentSuccessMessage("*************************************************************************");
		ExtentSuccessMessage("*******Start TC_CTI_Dailer_Button********");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("*******End TC_CTI_Dailer_Button********");
		ExtentSuccessMessage("*************************************************************************");
		Thread.sleep(20000);
		driver.switchTo().window(tabs.get(1));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, NumberOutput);
		ExtentSuccessMessage("Assertion has been done");
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(19000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Successfully user clicked on 'Call Decline Button'");
		logout_CE_validations();
		TabSwitchToParent();
	}

	public void ClickOnMinimizeCallwindow() throws InterruptedException {
		if (ElementDisplayed(CTIMinimizeIcon)) {
			ExtentSuccessMessage("Successfully user able to See 'Minimize Icon' ");
			waitVisibility(CTIMinimizeIcon);
			click(CTIMinimizeIcon);
			ExtentSuccessMessage("Successfully user Clicked on 'Minimize Icon' ");
		} else {
			ExtentSuccessMessage("Unsuccessfully 'Minimize' Not visible");
		}
	}

	public void CUstom_Status_Setup() throws InterruptedException {
		By Telephonesetup = By.xpath("//a[@href='#/admin/manage-account']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);
		By CLick_ON_CustomCti_Status = By.xpath("(//button[@id='manageCallGroupsBtn'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CLick_ON_CustomCti_Status));
		MoveToElementClick(element);
		Thread.sleep(8000);
		RefreshPage();

		//		WebElement Add_Custom = driver.findElement(By.xpath("//button[@id='createNewStatusBtn']"));
		//		//element = wait.until(ExpectedConditions.presenceOfElementLocated(Add_Custom));
		//		
		//		if (Add_Custom.isDisplayed() && element.isEnabled()) {
		//            // Perform the click action
		//			MoveToElementClick(Add_Custom);
		//            
		//            System.out.println("Add custom status was present and clickable");
		//            By Custom_Popup = By.xpath("//h2[normalize-space()='Add Custom Status']");
		//            element = wait.until(ExpectedConditions.presenceOfElementLocated(Custom_Popup));
		//            
		//            By Custom_Name = By.xpath("//input[@id='CustomStatus']");
		//            click(Custom_Name);
		//            Custom_Status = "Test"+generateRandom3DigitNumber();
		//            writeText(Custom_Name,Custom_Status);
		//            By Status_Dropdown = By.xpath("//md-select[@id='CTIStatus']");
		//            click(Status_Dropdown);
		//            By Status_Select = By.xpath("//div[@class='md-text'][normalize-space()='OFFLINE']");
		//            click(Status_Select);
		//            By Save = By.xpath("//span[contains(.,'Save')]");
		//            element = wait.until(ExpectedConditions.presenceOfElementLocated(Save));
		//    		MoveToElementClick(element);
		//    		ExtentSuccessMessage("Clicked on save custom status");
		//    		
		//    		driver.navigate().refresh();
		//            
		//            
		//            
		//        } else {
		waitForElement(8000);
		System.out.println("Add status Button is not clickable.");
		By Edit_Satus = By.xpath("(//i[@class='glyphicon glyphicon-pencil'])[3]");
		waitVisibility(Edit_Satus);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Edit_Satus));
		MoveToElementClick(element);

		waitForElement(3000);

		By Edit_Custom_STatus_Popup = By.xpath("//h2[normalize-space()='Edit Custom Status']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Edit_Custom_STatus_Popup));
		ExtentSuccessMessage("Edit status popup is present");

		By Custom_DD = By.xpath("//input[@id='CustomStatus']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Custom_DD));
		MoveToElementClick(element);
		// element = wait.until(ExpectedConditions.presenceOfElementLocated(Custom_DD));
		clear(Custom_DD);
		Thread.sleep(2000);
		Custom_Status = "Test" + generateRandom3DigitNumber();
		writeText(Custom_DD, Custom_Status);
		By Save = By.xpath("//span[contains(.,'Save')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Save));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on save custom status");
		//		   element = wait.until(ExpectedConditions.presenceOfElementLocated(Success_Message));
		// 		   ExtentSuccessMessage("Save Custom message succes validation");
		driver.navigate().refresh();
		Thread.sleep(9000);

		waitForElement(3000);
		By UserIcon = By.xpath("//div[@class='profile-icon ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserIcon));
		MoveToElementClick(element);

		By CustomStatus = By.xpath("//span[contains(text(),'" + Custom_Status + "')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomStatus));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on the Offline Customset Buttons");

		//// div[@id='divSuccess']

	}

	public void CUstom_Status_SetupWithtext(String Value) throws InterruptedException {
		By Telephonesetup = By.xpath("//a[@href='#/admin/manage-account']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);
		By CLick_ON_CustomCti_Status = By.xpath("(//button[@id='manageCallGroupsBtn'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CLick_ON_CustomCti_Status));
		MoveToElementClick(element);
		Thread.sleep(8000);
		RefreshPage();

		//		WebElement Add_Custom = driver.findElement(By.xpath("//button[@id='createNewStatusBtn']"));
		//		//element = wait.until(ExpectedConditions.presenceOfElementLocated(Add_Custom));
		//		
		//		if (Add_Custom.isDisplayed() && element.isEnabled()) {
		//            // Perform the click action
		//			MoveToElementClick(Add_Custom);
		//            
		//            System.out.println("Add custom status was present and clickable");
		//            By Custom_Popup = By.xpath("//h2[normalize-space()='Add Custom Status']");
		//            element = wait.until(ExpectedConditions.presenceOfElementLocated(Custom_Popup));
		//            
		//            By Custom_Name = By.xpath("//input[@id='CustomStatus']");
		//            click(Custom_Name);
		//            Custom_Status = "Test"+generateRandom3DigitNumber();
		//            writeText(Custom_Name,Custom_Status);
		//            By Status_Dropdown = By.xpath("//md-select[@id='CTIStatus']");
		//            click(Status_Dropdown);
		//            By Status_Select = By.xpath("//div[@class='md-text'][normalize-space()='OFFLINE']");
		//            click(Status_Select);
		//            By Save = By.xpath("//span[contains(.,'Save')]");
		//            element = wait.until(ExpectedConditions.presenceOfElementLocated(Save));
		//    		MoveToElementClick(element);
		//    		ExtentSuccessMessage("Clicked on save custom status");
		//    		
		//    		driver.navigate().refresh();
		//            
		//            
		//            
		//        } else {
		waitForElement(8000);
		System.out.println("Add status Button is not clickable.");
		By Edit_Satus = By.xpath("(//i[@class='glyphicon glyphicon-pencil'])[3]");
		waitVisibility(Edit_Satus);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Edit_Satus));
		MoveToElementClick(element);

		waitForElement(3000);

		By Edit_Custom_STatus_Popup = By.xpath("//h2[normalize-space()='Edit Custom Status']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Edit_Custom_STatus_Popup));
		ExtentSuccessMessage("Edit status popup is present");

		By Custom_DD = By.xpath("//input[@id='CustomStatus']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Custom_DD));
		MoveToElementClick(element);
		// element = wait.until(ExpectedConditions.presenceOfElementLocated(Custom_DD));
		clear(Custom_DD);
		Thread.sleep(2000);
		Custom_Status = "Test" + Value;
		writeText(Custom_DD, Custom_Status);
		By Save = By.xpath("//span[contains(.,'Save')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Save));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on save custom status");
		//		   element = wait.until(ExpectedConditions.presenceOfElementLocated(Success_Message));
		// 		   ExtentSuccessMessage("Save Custom message succes validation");
		driver.navigate().refresh();
		Thread.sleep(9000);

		waitForElement(3000);
		By UserIcon = By.xpath("//div[@class='profile-icon ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserIcon));
		MoveToElementClick(element);

		By CustomStatus = By.xpath("//span[contains(text(),'" + Custom_Status + "')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomStatus));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on the Offline Customset Buttons");

		//// div[@id='divSuccess']

	}

	public static int generateRandom3DigitNumber() {
		Random random = new Random();
		return 100 + random.nextInt(900); // Generates a number between 100 and 999
	}
	public void ClickonFirstRowId() throws InterruptedException {		
		if(ElementDisplayed(FirstRowFromTable)) {
			ExtentSuccessMessage("Successfully user able to See 'FirstRowFromTable ID' ");
			click(FirstRowFromTable);
			ExtentSuccessMessage("Successfully user Clicked on 'FirstRowFromTable ID' ");
		} else {
			waitVisibility(FirstRowFromTable);
			if(ElementDisplayed(FirstRowFromTable)) {
				ExtentSuccessMessage("Successfully user able to See 'FirstRowFromTable ID' ");
				click(FirstRowFromTable);
				ExtentSuccessMessage("Successfully user Clicked on 'FirstRowFromTable ID' ");
			} else {
				waitVisibility(FirstRowFromTable);
				ExtentSuccessMessage("Unsuccessfully 'FirstRowFromTable ID' Not visible");
			}
		}

	}


	public void VerifyBasicCAllsDetails(String Values) throws InterruptedException {
		String[] ExpectedColnumname =Values.split(",");
		for(int i=0;i<=9;i++) {
			int j = i+1;
			Thread.sleep(2000);
			By Elements =By.xpath("(//*[@class='row basicInfoForm']//div//p[2])["+j+"]");
			waitVisibility(Elements);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Elements));
			String ActualColunmName =GetElementText(Elements);
			if(i == 5 || i == 6) {				
				if(ActualColunmName.contains(ExpectedColnumname[i])) {
					ExtentSuccessMessage("Successfully user found the expected Value:- Expected "+ExpectedColnumname[i]+" Actual "+ActualColunmName+"");
				}
			}else {
				if(i == 9) {
					System.out.println("ActualColunmName"+j+""+ActualColunmName.toUpperCase());
					Assert.assertEquals(ExpectedColnumname[i], ActualColunmName.toUpperCase());
					ExtentSuccessMessage("Successfully user found the expected Value:- Expected "+ExpectedColnumname[i]+" Actual "+ActualColunmName.toUpperCase()+"");

				}
				if(i == 4) {
					if(ActualColunmName.contains("Connected")) {
						Assert.assertEquals("Connected", ActualColunmName);
						ExtentSuccessMessage("Successfully user found the expected Value:- Expected "+"Connected"+" Actual "+ActualColunmName+"");

					}else {
						System.out.println("ActualColunmName"+j+""+ActualColunmName);
						Assert.assertEquals(ExpectedColnumname[i], ActualColunmName);
						ExtentSuccessMessage("Successfully user found the expected Value:- Expected "+ExpectedColnumname[i]+" Actual "+ActualColunmName+"");	
					}
				}

				else {
					if(ActualColunmName.contains(ExpectedColnumname[i])) {
						System.out.println("ActualColunmName"+j+""+ActualColunmName);
						Assert.assertEquals(ExpectedColnumname[i], ActualColunmName);
						ExtentSuccessMessage("Successfully user found the expected Value:- Expected "+ExpectedColnumname[i]+" Actual "+ActualColunmName+"");
					}

				}

			}
		}
	}


}