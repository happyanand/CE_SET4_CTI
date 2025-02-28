package com.pages;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.BasePackage.Base_Class;

//import bsh.ParseException;

public class Call_Sequences extends BasePage {
	Base_Class Base_Class = new Base_Class();

	public Call_Sequences(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	JavascriptExecutor js = (JavascriptExecutor) driver;
	TelephonyPage TelephonyPage = new TelephonyPage(driver);
	HomePage HomePage = new HomePage(driver);
	CustomerEngageFunctionalityValidations CustomerEngageFunctionalityValidations = new CustomerEngageFunctionalityValidations(
			driver);
	WebElement element;
	public String NumberOutput;
	public String Offline_time;
	public String NumberOutput1;
	public String Present_time;
	public String firstnumber;
	public String Custom_Status;
	public String Session1_Number;
	public String Session2_Number;
	
	public String Session3_Number;
	public String Session2_Name;
	public String Groupnumber;
	public String number3;
	public String Conference_time;
	public String time;
	public String secondnumber;
	public String profilename;
	public String username;
	public String url;
	public static String LoginUserName2;
	public static String Callingtimes;
	public static String Callingtime;

	private By CTIMinimizeIcon = By.xpath("//a[@class='fa fa-minus right-al']");
	private By Qualtia1Number = By.xpath("(//div[@class='voice-call-ongoing-number']/span)[3]");
	private By Callnumberforwardedagent = By.xpath("(//div[@class=' voice-call-ongoing-number ']/span)[2]");
	private By UatNumberinQualtia1 = By.xpath("(//div[@class='voice-call-ongoing-number']/span)[3]");
	private By LeadMinimize = By.xpath("//i[@class='acc glyphicon glyphicon-chevron-up']");
	private By CallGroupNumber = By.name("GroupNumber");
	private By Gruopnumberfirst = By.xpath("(//*[contains(@class,'dropDown md-active md-clickable')]//md-option)[1]");
	private By CallAcceptButtoninQualatia2 = By
			.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[2]");
	private By CallDeclineButtonInQualtia2 = By
			.xpath("//button[@class=' voice-call-green-button-small fa fa-phone voice-decline ']");
	private By Success_Message = By.xpath("div[@id='divSuccess']");
	private By Errormsg = By.xpath("//*[text()='Unable to connect the call. Please try again']");
	private By L_OkayButton = By.xpath("//*[contains(text(),'Ok')]//parent::button");
	private By UATNumberField = By
			.xpath("//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
	private By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");

	private By CallTransferButton = By.xpath("//i[@class=' fa fa-calls-transfer ']");
	private By CallTransferButtonToQualtia1 = By.xpath("//span[@title='Qualitia Test1']/parent::*/button");
	private By CallDeclineButtonInCeUserone = By
			.xpath("//button[@class=' voice-call-green-button-small fa fa-phone voice-decline ']");
	private By CallAcceptButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[2]");

	private By CallDeclineButton = By.xpath(
			"//button[@class='voice-call-green-button-small fa fa-phone voice-decline'] | (//button[contains(@class,'voice-call-green-button-small fa fa-phone voice-decline')])[1]");
	// private By ConfrenceAddButton = By.xpath("//i[@class='fa fa-plus']");
	// private By CallDeclineButton =
	// By.xpath("//button[@class='voice-call-green-button-small fa fa-phone
	// voice-decline'] | (//button[contains(@class,'voice-call-green-button-small fa
	// fa-phone voice-decline')])[1]");
//	private By ConfrenceAddButton = By.xpath("//*[@id=\"voice-call-window-draggable\"]/div[15]/div[1]/div[2]/div[5]/a[5]/i");
	private By ConfrenceAddButton = By.xpath(
			"//*[@id=\"voice-call-window-draggable\"]/div[15]/div[1]/div[2]/div[5]/a[5]/i | //*[contains(@ng-click,'CTICtrl.initiateSecondaryCall()')]");
	private By ConfrenceNumberField = By.xpath(
			"(//div[@class='voice-call-dial-pad'])[2]/input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-empty']");
	private By CallConfreanceButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[2]");

	By userID = By.id("user-name");// ------//for userid at Login page
	By pwd = By.id("password");// -------for password at home page
	By signIn = By.xpath("//*[@id='form-validation-button']");// -------for button on home page
	private By Qualatia1Number = By.xpath("//u[@title='Voice Number']");
	private By CheckUserLogin = By.xpath("//button[@class='positive md-button md-ink-ripple']");
	private By SelectUser = By.xpath("//a[@class='nav-link dropdown-toggle']");
	private By SelectLogout = By.xpath("(//a[contains(.,'Log Out')])[1]");
	private By AdminTile = By.xpath("//a[@class='glyphicon fa fa-fw fa-black-tie']");
	private By AdminUser = By.xpath("(//a[contains(.,'Users')])[2]");

	private By TransfetCallnumberfield = By.xpath(
			"//div[@class='voice-call-dial-pad']//input[contains(@placeholder,'Enter Phone Number or Click the icon')]");
	private By LogoutButtonConfirmation = By.xpath(
			"//a[@class='modal-action tertiary_background waves-effect waves-light btn-large ConfirmForceLogin']");

	// private By CTIMinimizeIcon = By.xpath("//a[@class='fa fa-minus right-al']");

	// private By TransfetCallnumberfield
	// =By.xpath("//div[@class='voice-call-dial-pad']//input[contains(@placeholder,'Enter
	// Phone Number or Click the icon')]");
	// private By LogoutButtonConfirmation = By.xpath("//a[@class='modal-action
	// tertiary_background waves-effect waves-light btn-large ConfirmForceLogin']");
	private By CalltypeMissedcall = By.xpath("(//h5[contains(text(),'Call Type')]//parent::div//md-checkbox)[3]");
	private By CalltypeInboundcall = By.xpath("(//h5[contains(text(),'Call Type')]//parent::div//md-checkbox)[1]");
	private By Call_Logs = By.xpath("//a[@title='Call Logs']");
	private By Input_Num = By.xpath("//*[contains(@ng-keyup,'CTICtrl.searchLogs')][contains(@ng-keyup,'CALLLOGS')]");
	private By call_logs = By.xpath("(//b[@class='message-heading cti-name'])[1]");
	private By DeleteGroup = By.xpath("(//i[@title='Deactivate Call Group'])[1]");
	private By ConfirmDeleteGroup = By
			.xpath("//button[text()='Deactivate'][@class='btn btn-primary btn-default green ng-binding']");
	private By SuccessMessage = By.xpath("//*[@id='divSuccess']");
	private By GroupnameFromCTIDailler = By.xpath("//div[@ng-show='!CTICtrl.CTIContext.primarayPhoneFlags.minimized']//div[@class='voice-call-ongoing-number cti-group-name ng-scope']");
	private By GroupnameFromCTIDailler1 = By.xpath("//div[@class='voice-call-incoming-window']//div[@class='voice-call-ongoing-number cti-group-name ng-scope']");
//	private By GroupnameFromCTIDailler =By.xpath("//div[@ng-show='!CTICtrl.CTIContext.primarayPhoneFlags.minimized']//div[@class='voice-call-ongoing-number cti-group-name ng-scope']");
	private By FirstRowFromTable = By.xpath("(//*[@ng-click='grid.appScope.navigateToCallDetails(row.entity);'])[1]//a");
	private By L_Homepage =By.xpath("//*[@href='/#/home']");
	private By CallMute = By.xpath("//*[contains(@ng-class,'{disabledMute')]");
	

	
	
	
	// private By CTIMinimizeIcon = By.xpath("//a[@class='fa fa-minus right-al']");

	public static int generateRandom3DigitNumber() {
		Random random = new Random();
		return 100 + random.nextInt(900); // Generates a number between 100 and 999
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
		waitForElement(10000);
	}

	public void logout_CE_validations() throws InterruptedException {
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed");
		waitForElement(1000);
		driver.manage().deleteAllCookies();
		waitForElement(3000);
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

	public void waitForElement(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public void SecondUser() throws InterruptedException, IOException {
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

	public void SecondUserForTransfer() throws InterruptedException, IOException {
		waitForElement(2000);
//		String urlCE = configloader().getProperty("CEURL");
		String urlCE;
		String currentSystemURL = configloader().getProperty("URL");
		System.out.println(currentSystemURL);
		if (url.contains("https://mme.benefitalign.com")) {
			urlCE = "https://mme.benefitalign.com";
		} else if (url.contains("https://ce-uat.benefitalign.com/")) {
			urlCE = "https://ce-uat.benefitalign.com/";
		} else if (url.contains("https://ce-qa.benefitalign.com/")) {
			urlCE = "https://ce-qa.benefitalign.com/";
		} else if (url.contains("https://mme.brokerengage.net/")) {
			urlCE = "https://mme.brokerengage.net/";
		} else { 
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
		waitForElement(10000);
		fetchNumber2();

	}

	public void SecondUserForBC() throws InterruptedException, IOException {
		waitForElement(2000);
//		String urlCE = configloader().getProperty("CEURL");
		String urlCE;
		String currentSystemURL = driver.getCurrentUrl();
		System.out.println(currentSystemURL);
		if (url.contains("https://mme.benefitalign.com/")) {
			urlCE = "https://mme.benefitalign.com";
		} else if (url.contains("https://ce-uat.benefitalign.com/")) {
			urlCE = "https://ce-uat.benefitalign.com/";
		} else if (url.contains("https://ce-qa.benefitalign.com/")) {
			urlCE = "https://ce-qa.benefitalign.com/";
		} else if (url.contains("https://mme.brokerengage.net/")) {
			urlCE = "https://mme.brokerengage.net/";
		} else {
			urlCE = "https://ce-dev.benefitalign.com/#/login";
		}
		driver.get(urlCE);
		String username = configloader().getProperty("PLCA_UserName1");
		String pswd = configloader().getProperty("PLCA_password1");
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
		waitForElement(10000);
		fetchNumber2();

	}

	public void fetchNumber2() throws InterruptedException {
		Thread.sleep(15000);
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber));
		secondnumber = element.getText();
		System.out.println("Second number" + secondnumber);

		Thread.sleep(2000);
		By ProfileName = By.xpath("//span[@class='profile-name drag-not-allowed ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ProfileName));
		profilename = element.getText();
		System.out.println(profilename);

	}

	public void SecondLoginUser() throws InterruptedException, IOException {
		waitForElement(2000);
//		String urlCE = configloader().getProperty("CEURL");
		String urlCE;
		String currentSystemURL = configloader().getProperty("URL");
		System.out.println(currentSystemURL);
		if (currentSystemURL.contains("https://mme.benefitalign.com")) {
			urlCE = "https://mme.benefitalign.com/mme/#/login";
		} else if (currentSystemURL.contains("https://ce-uat.benefitalign.com/")) {
			urlCE = "https://ce-uat.benefitalign.com/mme/#/login";
		} else if (currentSystemURL.contains("https://ce-qa.benefitalign.com/")) {
			urlCE = "https://ce-qa.benefitalign.com/mme/#/login";
		} else if (currentSystemURL.contains("https://mme.brokerengage.net/")) {
			urlCE = "https://mme.brokerengage.net/mme/#/login";
		}else if (currentSystemURL.contains("https://mme.brokerengage.net/mme/")) {
			urlCE = "https://mme.brokerengage.net/mme/";
		}

		else {
			urlCE = "https://ce-dev.benefitalign.com/#/login";
		}
		driver.get(urlCE);
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
				if (replaceKeyValue.contains("CognitoSecondUser")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("CognitoSecondPassword")) {
					Password = replaceKeyValue;
					String[] arrOfPassword = Password.split(";");
					Password = arrOfPassword[1];
				}
			}
			if (key.contains(ReferenceLogin) && 
					urlCE.contains("https://mme.brokerengage.net/")) {
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
					urlCE.contains("https://ce-qa.benefitalign.com/")) {
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

			if (key.contains(ReferenceLogin) && urlCE.contains("https://mme.benefitalign.com")) {
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
					urlCE.contains("https://ce-uat.benefitalign.com/")) {
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
		System.out.println("Final Password fetch :" + Password);
		String username = UserName;
		String pswd = Password;
		
//		String username = configloader().getProperty("PLCA_SecondUser");
//		String pswd = configloader().getProperty("PLCA_SecondPassword");
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

	public void TabSwitchToParent() throws InterruptedException {
//		Thread.sleep(2000);
		ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
//		System.out.println(Tabs.size());
		driver.switchTo().window(Tabs.get(0));
		ExtentSuccessMessage("Tab Switched from child to parent");

//		Thread.sleep(3000);
	}

	public void TabSwitchToChild() throws InterruptedException {
		ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(Tabs.size());
		driver.switchTo().window(Tabs.get(1));
//		Thread.sleep(3000);
		ExtentSuccessMessage("Tab Switched from parent to child");

	}

	public void TabSwitchToSubChild() throws InterruptedException {
		ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(Tabs.size());
		driver.switchTo().window(Tabs.get(2));
//		Thread.sleep(3000);
		ExtentSuccessMessage("Tab Switched to subchild");
//		Thread.sleep(2000);

	}

	public void Accept_Call() throws InterruptedException {
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(1000);
		ExtentSuccessMessage("Call been picked up");
	}

	public void Ountbound_transferCall(String Username) throws InterruptedException {

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransferButton));
		MoveToElementClick(element);
		Present_time = CurrentTime();

		System.out.println(Present_time);
		Thread.sleep(3000);
		By Click_Agent = By.xpath("(//span[@class='ng-scope'][normalize-space()='Agents'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_Agent));
		MoveToElementClick(element);
		// By CallTransferButton = By.xpath("//span[@title='" + Username +
		// "']/parent::*/button");
		By CallTransferButton = By.xpath("//span[@title='" + Username + "']/parent::*/button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransferButton));
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
		Present_time = CurrentTime();

		System.out.println(Present_time);
		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransferButtonToQualtia1));
		MoveToElementClick(element);

	}

	public void transferToagentCall(String Value) throws InterruptedException {

		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(1000);
		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransferButton));
		MoveToElementClick(element);

		Thread.sleep(3000);
		By Close_Transfer = By.xpath("//a[@title='Close']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Close_Transfer));
		MoveToElementClick(element);
		Thread.sleep(3000);

		By Enter_Transfer_Number = By.xpath(
				"//div[@class='voice-call-dial-pad']//input[@placeholder=' Enter Phone Number or Click the icon ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Enter_Transfer_Number));

		// String Number_To_Transfer = firstnumber;
		writeText(Enter_Transfer_Number, Value);
		ExtentSuccessMessage("Entered the Online Number to Transfer");

		Thread.sleep(3000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		By Click_Transfer = By.xpath("(//button[@ng-show='CTICtrl.CTIContext.primarayPhoneFlags.showCallForward'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_Transfer));
		jsExecutor.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on manual transfer button");

		Offline_time = CurrentTime();
		System.out.println(Offline_time);

		Present_time = CurrentTime();
		System.out.println(Present_time);

	}

	public void transferToagentBFRinglessCall(String Value) throws InterruptedException {

//		Thread.sleep(1000);
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
//		MoveToElementClick(element);
		Thread.sleep(1000);
		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransferButton));
		MoveToElementClick(element);

		Thread.sleep(3000);
		By Close_Transfer = By.xpath("//a[@title='Close']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Close_Transfer));
		MoveToElementClick(element);
		Thread.sleep(3000);

		By Enter_Transfer_Number = By.xpath(
				"//div[@class='voice-call-dial-pad']//input[@placeholder=' Enter Phone Number or Click the icon ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Enter_Transfer_Number));

		// String Number_To_Transfer = firstnumber;
		writeText(Enter_Transfer_Number, Value);
		ExtentSuccessMessage("Entered the Online Number to Transfer");

		Thread.sleep(3000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		By Click_Transfer = By.xpath("(//button[@ng-show='CTICtrl.CTIContext.primarayPhoneFlags.showCallForward'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_Transfer));
		jsExecutor.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on manual transfer button");
		Present_time = CurrentTime();
		System.out.println(Present_time);

	}

	public void transferCall_Admin_Offline() throws InterruptedException {

		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(1000);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransferButton));
		MoveToElementClick(element);

		Thread.sleep(3000);
		By Close_Transfer = By.xpath("//a[@title='Close']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Close_Transfer));
		MoveToElementClick(element);

		Thread.sleep(3000);
		By Enter_Transfer_Number = By.xpath(
				"//div[@class='voice-call-dial-pad']//input[@placeholder=' Enter Phone Number or Click the icon ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Enter_Transfer_Number));

		writeText(Enter_Transfer_Number, firstnumber);
		ExtentSuccessMessage("Entered the Offline Number to Transfer");

		Thread.sleep(3000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		By Click_Transfer = By.xpath("(//button[@ng-show='CTICtrl.CTIContext.primarayPhoneFlags.showCallForward'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_Transfer));
		jsExecutor.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on manual transfer button");
		Offline_time = CurrentTime();
		System.out.println(Present_time);

		// element =
		// wait.until(ExpectedConditions.presenceOfElementLocated(CallTransferButtonToQualtia1));
		// MoveToElementClick(element);

		Thread.sleep(15000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButtonInQualtia2));
		MoveToElementClick(element);

	}

	public void Outbound_transferCall_Admin_Offline() throws InterruptedException {

		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(1000);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransferButton));
		MoveToElementClick(element);

		Thread.sleep(3000);
		By Close_Transfer = By.xpath("//a[@title='Close']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Close_Transfer));
		MoveToElementClick(element);

		Thread.sleep(3000);
		By Enter_Transfer_Number = By.xpath(
				"//div[@class='voice-call-dial-pad']//input[@placeholder=' Enter Phone Number or Click the icon ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Enter_Transfer_Number));

		// String Number_To_Transfer = firstnumber;
		writeText(Enter_Transfer_Number, firstnumber);
		ExtentSuccessMessage("Entered the Offline Number to Transfer");

		Thread.sleep(3000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		By Click_Transfer = By.xpath("(//button[@ng-show='CTICtrl.CTIContext.primarayPhoneFlags.showCallForward'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_Transfer));
		jsExecutor.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on manual transfer button");
		Offline_time = CurrentTime();
		System.out.println(Offline_time);

		// element =
		// wait.until(ExpectedConditions.presenceOfElementLocated(CallTransferButtonToQualtia1));
		// MoveToElementClick(element);

		Thread.sleep(15000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButtonInQualtia2));
		MoveToElementClick(element);

	}

	public void ThirdUser() throws InterruptedException, IOException {
		waitForElement(2000);
//		String urlCE = configloader().getProperty("CEURL");
		String urlCE;
		String currentSystemURL = configloader().getProperty("URL");
		System.out.println(currentSystemURL);
		if (currentSystemURL.contains("https://mme.benefitalign.com")) {
			urlCE = "https://ce-uat.benefitalign.com/";
		} else if (currentSystemURL.contains("https://ce-uat.benefitalign.com/")) {
			urlCE = "https://mme.benefitalign.com/mme/";
		} else if (currentSystemURL.contains("https://ce-qa.benefitalign.com/")) {
			urlCE = "https://ce-uat.benefitalign.com/";
		} else if (currentSystemURL.contains("https://mme.brokerengage.net/")) {
			urlCE = "https://mme.brokerengage.net/";
		} else {
			urlCE = "https://ce-uat.benefitalign.com/";
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
					urlCE.contains("https://ce-qa.benefitalign.com/")) {
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

			if (key.contains(ReferenceLogin) && urlCE.contains("https://mme.benefitalign.com/mme/")) {
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
					urlCE.contains("https://ce-uat.benefitalign.com/")) {
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
		System.out.println("Final Password fetch :" + Password);
		String username = UserName;
		String pswd = Password;
		waitForElement(1000);		
		driver.get(urlCE);
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

	public void ThirdUserforTransfer() throws InterruptedException, IOException {
		waitForElement(2000);
//		String urlCE = configloader().getProperty("CEURL");
		String urlCE;
		String currentSystemURL = driver.getCurrentUrl();
//		System.out.println(currentSystemURL);
		if (url.contains("https://mme.benefitalign.com/")) {
			urlCE = "https://ce-uat.benefitalign.com/";
		} else if (url.contains("https://ce-uat.benefitalign.com/")) {
			urlCE = "https://mme.benefitalign.com";
		} else if (url.contains("https://ce-qa.benefitalign.com/")) {
			urlCE = "https://ce-uat.benefitalign.com/";
		} else if (url.contains("https://mme.brokerengage.net/")) {
			urlCE = "https://ce-uat.benefitalign.com/";
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
		fetchNumber3();

	}

	public void ThirdUserLogin() throws InterruptedException, IOException {
		waitForElement(1000);
		String urlCE;
		String Url = configloader().getProperty("URL");
		String jenkinsUrl = System.getProperty("URL");
		if (jenkinsUrl != null && !jenkinsUrl.isEmpty()) {
			Url = jenkinsUrl;
			
		}
		urlCE=Url;
//		String Url = configloader().getProperty("URL");
		System.out.println(urlCE);
		if (urlCE.contains("https://mme.benefitalign.com")) {
			Url = "https://ce-uat.benefitalign.com/mme/#/login";
		} else if (urlCE.contains("https://ce-uat.benefitalign.com/")) {
			Url = "https://mme.benefitalign.com/mme/#/login";
		} else if (urlCE.contains("https://ce-qa.benefitalign.com/")) {
			Url = "https://ce-uat.benefitalign.com/mme/#/login";
		} else if (urlCE.contains("https://mme.brokerengage.net/")) {
			Url = "https://ce-uat.benefitalign.com/mme/#/login";
		}

		else {
			Url = "https://ce-dev.benefitalign.com/#/login";
		}
		waitForElement(1000);
//		String username = configloader().getProperty("PLCA_ThirdUser");
//		String pswd = configloader().getProperty("PLCA_ThirdPassword");
//		waitForElement(1000);
		driver.get(Url);
		waitForElement(5000);
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
					Url.contains("https://ce-qa.benefitalign.com/")) {
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

			if (key.contains(ReferenceLogin) && Url.contains("https://mme.benefitalign.com/")) {
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
					Url.contains("https://ce-uat.benefitalign.com/")) {
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
		System.out.println("Final password fetch :" + Password);
		String username = UserName;
		String pswd = Password;
		waitVisibility(userID);
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

	public void valid_Transfer_Admin() throws IOException, InterruptedException, ParseException {

		waitForElement(2000);
		By CTIInputField = By.xpath("//input[@placeholder='Enter Phone Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, firstnumber);
		ExtentSuccessMessage("Number has been in input field" + firstnumber);

		Thread.sleep(3000);
		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		String SMS_Time = CurrentTime(); // stored
		System.out.println(SMS_Time);
		String smstime = removeLeadingZero(SMS_Time);
		System.out.println(smstime);

		TabSwitchToParent();

		Thread.sleep(5000);
		By NumberValidation = By.xpath("(//div[@class='voice-call-ongoing-number'])[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NumberValidation));
		String numbertext = element.getText();
		System.out.println(numbertext);

		Assert.assertEquals(numbertext, number3);
		ExtentSuccessMessage("Third User Number is displayed after initiating ther call");

		By AcceptCall = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Accepted by first user");

		Thread.sleep(2000);

		By TransferCall = By.xpath("//i[@class=' fa fa-calls-transfer ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfer Call By First User");

		Thread.sleep(3000);

		By AgentsTab = By.xpath("(//span[contains(.,'Agents')])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentsTab));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Agents Tab");

		Thread.sleep(4000);
		By SearchFiled = By.xpath("(//input[@value='search'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchFiled));
		MoveToElementClick(element);
		writeText(SearchFiled, profilename + Keys.ENTER);
		ExtentSuccessMessage("Name Searched for Second User to Transfer");

		Thread.sleep(3000);
		By TransferButton = By.xpath("(//span[contains(.,'" + profilename + "')])[2]/u/ancestor::span/button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfer Button");

		String SMS_Time1 = CurrentTime();
		System.out.println(SMS_Time1);
		String smstime1 = removeLeadingZero(SMS_Time1);
		System.out.println(smstime1);

		TabSwitchToChild();

		Thread.sleep(1500);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(NumberValidation));
		String numbertext1 = element.getText();
		System.out.println(numbertext1);

		Assert.assertEquals(numbertext1, number3);
		ExtentSuccessMessage("Third User Number is displayed after Transfering the call from first User");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call which is been transfered is accepted by Second user");

		TabSwitchToParent();

		By WarmTransfer = By
				.xpath("//button[@class='voice-call-green-button-small fa fa-phone fa fa-code-fork blue-bg']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(WarmTransfer));
		MoveToElementClick(element);
		ExtentSuccessMessage("Warm Transfer has been done from first user to second user");
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(3000);

		TabSwitchToChild();

		Thread.sleep(8000);

		By DeclineCall = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DeclineCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been declined by second user");

		driver.navigate().refresh();

		Thread.sleep(8000);

		By CalLogs = By.xpath("//a[@title='Call Logs']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CalLogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call logs has been opened");
		Thread.sleep(2000);

		By TimeCount = By.xpath("(//u[@class='message-time date-txt drag-not-allowed ng-binding'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
		String count = element.getText();
		System.out.println(count);
		String timeString = StringUtils.substringAfter(count, " ");
		System.out.println("---------" + timeString);
		String Formatted_Time = removeSeconds(timeString);
		System.out.println("---------" + Formatted_Time);

		boolean isTimeMatching = areTimesMatching(SMS_Time1, Formatted_Time, 1);
		System.out.println(isTimeMatching);

		if (isTimeMatching) {
			System.out.println("Times match or are within the acceptable range.");
			ExtentSuccessMessage("Times match or are within the acceptable range.");

		} else {
			System.err.println("Times do not match.");
			ExtentErrorMessage("Times do not match.");

		}

		ExtentSuccessMessage("Assertion for missed call time is done");

		Thread.sleep(6000);
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
				+ profilename + "')]/td[2]/div/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIStatus));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		Thread.sleep(2000);
		String ctistatus = element.getText();
		System.out.println(ctistatus);

		Assert.assertEquals(ctistatus, "Ready");
		ExtentSuccessMessage("Agent Status is displaying as Ready in CTI Dashboard");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Thread.sleep(4000);
		By Home_Redirection = By.xpath("//a[@id='menu_home']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home_Redirection));
		MoveToElementClick(element);
		Thread.sleep(2000);
		ExtentSuccessMessage("Clicked on the home button");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		Thread.sleep(2000);
		By Admin_Tile = By.xpath("//span[normalize-space()='Admin']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(8000);

		By Telephonesetup = By.xpath("//a[@href='#/admin/manage-account']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);

		Thread.sleep(5000);
		By Click_On_Viewcall = By.xpath("//button[@id='viceCallLogsBtn']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Viewcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");
		Thread.sleep(5000);

		By RecentCall = By.xpath("(//div[@class='accordion-container grid-style-height'])[1]/i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		By CreatedToday = By.xpath("//md-radio-button[@value='Created Today']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		By CallType = By.xpath("(//div[@class='accordion-container grid-style-height'])[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(2000);
		By TransferedCall = By.xpath("//md-checkbox[@name='Transferred Call']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferedCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfered Call");

		Thread.sleep(4000);

		By Direction = By.xpath("(//div[contains(.,'" + Formatted_Time
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Direction));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		MoveToElementClick(element);
		String direction = element.getText();
		System.out.println(direction);

		Assert.assertEquals(direction, "Transferred");
		ExtentSuccessMessage("Assertion for Direction is done");

		By FromNumber = By.xpath("(//div[contains(.,'" + Formatted_Time
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FromNumber));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String fromnumber = element.getText();
		System.out.println(fromnumber);

		Assert.assertEquals(fromnumber, number3);
		ExtentSuccessMessage("Assertion for From Number is Done");

		By ToNumber = By.xpath("(//div[contains(.,'" + Formatted_Time
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ToNumber));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String tonumber = element.getText();
		System.out.println(tonumber);

		Assert.assertEquals(tonumber, secondnumber);
		ExtentSuccessMessage("Assertion for To Number is Done");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home_Redirection));
		MoveToElementClick(element);
		Thread.sleep(2000);
		ExtentSuccessMessage("Clicked on the home button");

		TabSwitchToParent();

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(6000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Viewcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(4000);
		By InboundCall = By.xpath("//md-checkbox[@name='Inbound Call']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(InboundCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on InboundCall Call");

		Thread.sleep(4000);

		By Direction1 = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Direction1));
		String direction2 = element.getText();
		System.out.println(direction2);

		Assert.assertEquals(direction2, "Inbound");
		ExtentSuccessMessage("Assertion for direction is done");

		By From1 = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(From1));
		String from1 = element.getText();
		System.out.println(from1);

		Assert.assertEquals(from1, number3);
		ExtentSuccessMessage("Assertion for from nuber is done");

		By To1 = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(To1));
		String to1 = element.getText();
		System.out.println(from1);

		Assert.assertEquals(to1, firstnumber);
		ExtentSuccessMessage("Assertion for To nuber is done");

		By CDRID = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[1]/div/a");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CDRID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on CDR ID");

		Thread.sleep(15000);

		By CallFrom = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[1]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallFrom));
		String callfrom = element.getText();
		System.out.println(callfrom);

		Assert.assertEquals(callfrom, number3);
		ExtentSuccessMessage("Assertion for CallFrom is done in CDR");

		By CallTo = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[2]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTo));
		String callto = element.getText();
		System.out.println(callto);

		Assert.assertEquals(callto, firstnumber);
		ExtentSuccessMessage("Assertion for CallTo is done in CDR");

		By CallTypee = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[3]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTypee));
		String calltype = element.getText();
		System.out.println(calltype);

		Assert.assertEquals(calltype, "Incoming Call");
		ExtentSuccessMessage("Assertion for Call Type is done in CDR");

		By CallStatus = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[4]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallStatus));
		String callstatus = element.getText();
		System.out.println(callstatus);

		Assert.assertEquals(callstatus, "Completed");
		ExtentSuccessMessage("Assertion for Call Status is done in CDR");

		By SID = By.xpath("//div[@class='col-lg-3 col-md-3 col-sm-6 col-xs-12']/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SID));
		String sid = element.getText();
		System.out.println(sid);

		By Typee = By.xpath("//span[contains(.,'" + number3 + "')]/ancestor::tr/td[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Typee));
		System.out.println(Typee);
		String type = element.getText();
		System.out.println(type);

		Assert.assertEquals(type, "Caller");
		ExtentSuccessMessage("Assertion for Caller type is Done");

		By Type2 = By.xpath("//span[contains(.,'" + username + "')]/ancestor::tr/td[2]");
		System.out.println(Type2);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Type2));
		String type2 = element.getText();
		System.out.println(type2);

		Assert.assertEquals(type2, "Callee");
		ExtentSuccessMessage("Assertion for Caller type is Done");

		driver.navigate().back();
		Thread.sleep(4000);

		ExtentSuccessMessage("----------OnlineTransferCompleted--------");

		TabSwitchToChild();
		Thread.sleep(3000);
//		offline transfer started
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home_Redirection));
		MoveToElementClick(element);
		Thread.sleep(2000);
		ExtentSuccessMessage("Clicked on the home button");

		By CTIConsole = By.xpath("//a[@class='nav-link AVAILABLE']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIConsole));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on CTI Console button");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DashBoard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Dashboard Tile");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentDashBoard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on AgentDashBoard Tile");

		Thread.sleep(2000);
		By Profile = By.xpath("//div[@class='profile']/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Profile));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Profile button");

		Thread.sleep(2000);
		By Offline = By.xpath("(//span[contains(.,'Offline')])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Offline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Offline Status");

		Thread.sleep(5000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIStatus));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		Thread.sleep(2000);
		String ctistatusoffline = element.getText();
		System.out.println(ctistatusoffline);

		Thread.sleep(4000);
		Assert.assertEquals(ctistatusoffline, "Offline");
		ExtentSuccessMessage("Agent Status is displaying as Offline in dashboard After Changing Status as offline");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home_Redirection));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on the home button");

		Thread.sleep(4000);

		TabSwitchToSubChild();

		waitForElement(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, firstnumber);
		ExtentSuccessMessage("Number has been in input field" + Session1_Number);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		String SMS_Offline = CurrentTime();
		System.out.println(SMS_Offline);
		String smstoffline = removeLeadingZero(SMS_Offline);
		System.out.println(smstoffline + "------Offlinetime");

		TabSwitchToParent();

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Accepted by first user");

		Thread.sleep(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfer Call By First User");

		Thread.sleep(3000);
		By Inputt = By.xpath("(//input[@placeholder=' Enter Phone Number or Click the icon '])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Inputt));
		MoveToElementClick(element);
		writeText(Inputt, secondnumber);
		ExtentSuccessMessage("Entered Second User Number for Transfer");

		By CallTransfer = By
				.cssSelector("#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransfer));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Transfer Button");

		String SMS_Offline2 = CurrentTime();
		System.out.println(SMS_Offline2);
		String smstoffline2 = removeLeadingZero(SMS_Offline2);
		System.out.println(smstoffline2 + "------Offlinetime");

		TabSwitchToChild();

		By MissedCallSSE = By.cssSelector("body > div.col-xs-11.col-sm-3.alert.alert-pastel-info.animated.fadeInRight");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCallSSE));
		Assert.assertTrue(driver.findElement(MissedCallSSE).isDisplayed());
		ExtentSuccessMessage("SSE Notification For Transfered call is diaplayed");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CalLogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call logs has been opened");
		Thread.sleep(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
		String count1 = element.getText();
		System.out.println(count1);
		String timeString1 = StringUtils.substringAfter(count1, " ");
		System.out.println("---------" + timeString);
		String Formatted_Time1 = removeSeconds(timeString1);
		System.out.println("---------" + Formatted_Time1);

		Thread.sleep(2000);
		boolean isTimeMatching1 = areTimesMatching(SMS_Offline2, Formatted_Time1, 1);
		System.out.println(isTimeMatching1);

		if (isTimeMatching1) {
			System.out.println("Times match or are within the acceptable range.");
			ExtentSuccessMessage("Times match or are within the acceptable range.");

		} else {
			System.err.println("Times do not match.");
			ExtentErrorMessage("Times do not match.");

		}

		By MissedCalllogs = By.xpath("//a[@title='Missed Calls']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCalllogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Misswd Call Section");

		Thread.sleep(4000);
		By MissedCallTime = By.xpath("//u[contains(.,'" + smstoffline2 + "')]");
		Assert.assertTrue(driver.findElement(MissedCallTime).isDisplayed());
		ExtentSuccessMessage("Assertion for Offline Missed call is done");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(6000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Viewcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(4000);
		By MissedCall = By.xpath("//md-checkbox[@name='Missed Call,Missed Call Group']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfered Call");

		Thread.sleep(4000);

		By Directionn = By.xpath("(//div[contains(.,'" + smstoffline2
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Directionn));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		MoveToElementClick(element);
		String direction1 = element.getText();
		System.out.println(direction1);

		Assert.assertEquals(direction1, "Missed");
		ExtentSuccessMessage("Assertion for Direction is done");

		By FromNumber1 = By.xpath("(//div[contains(.,'" + smstoffline2
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FromNumber1));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String fromnumber1 = element.getText();
		System.out.println(fromnumber1);

		Assert.assertEquals(fromnumber1, number3);
		ExtentSuccessMessage("Assertion for From Number is Done");

		By ToNumber1 = By.xpath("(//div[contains(.,'" + smstoffline2
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ToNumber1));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String tonumber1 = element.getText();
		System.out.println(tonumber1);

		Assert.assertEquals(tonumber1, secondnumber);
		ExtentSuccessMessage("Assertion for To Number is Done");

		ExtentSuccessMessage("----------Completed ONline and Offline Transfer------------------");

		logout_CE_validations();

		TabSwitchToParent();

		driver.navigate().refresh();
		Thread.sleep(4000);

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(4000);
		By InboundCall2 = By.xpath("//md-checkbox[@name='Inbound Call']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(InboundCall2));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on InboundCall Call");

		Thread.sleep(4000);

		By Direction2 = By.xpath("(//div[contains(.,'" + smstoffline2
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Direction2));
		String direction3 = element.getText();
		System.out.println(direction3);

		Assert.assertEquals(direction3, "Inbound");
		ExtentSuccessMessage("Assertion for direction is done");

		By From2 = By.xpath("(//div[contains(.,'" + smstoffline2
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(From2));
		String from2 = element.getText();
		System.out.println(from2);

		Assert.assertEquals(from2, number3);
		ExtentSuccessMessage("Assertion for from nuber is done");

		By To2 = By.xpath("(//div[contains(.,'" + smstoffline2
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(To2));
		String to2 = element.getText();
		System.out.println(to2);

		Assert.assertEquals(to2, firstnumber);
		ExtentSuccessMessage("Assertion for To nuber is done");

		By CDRID1 = By.xpath("(//div[contains(.,'" + smstoffline2
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[1]/div/a");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CDRID1));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on CDR ID");

		Thread.sleep(25000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallFrom));
		String callfrom1 = element.getText();
		System.out.println(callfrom1);

		Assert.assertEquals(callfrom1, number3);
		ExtentSuccessMessage("Assertion for CallFrom is done in CDR");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTo));
		String callto1 = element.getText();
		System.out.println(callto1);

		Assert.assertEquals(callto1, firstnumber);
		ExtentSuccessMessage("Assertion for CallTo is done in CDR");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTypee));
		String calltype1 = element.getText();
		System.out.println(calltype1);

		Assert.assertEquals(calltype1, "Incoming Call");
		ExtentSuccessMessage("Assertion for Call Type is done in CDR");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallStatus));
		String callstatus1 = element.getText();
		System.out.println(callstatus1);

		Assert.assertEquals(callstatus1, "Completed");
		ExtentSuccessMessage("Assertion for Call Status is done in CDR");

		By SID1 = By.xpath("//div[@class='col-lg-3 col-md-3 col-sm-6 col-xs-12']/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SID1));
		String sid1 = element.getText();
		System.out.println(sid1);

		By Typee1 = By.xpath("//span[contains(.,'" + number3 + "')]/ancestor::tr/td[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Typee1));
		System.out.println(Typee);
		String type1 = element.getText();
		System.out.println(type1);

		Assert.assertEquals(type1, "Caller");
		ExtentSuccessMessage("Assertion for Caller type is Done");

		By Type12 = By.xpath("//span[contains(.,'" + username + "')]/ancestor::tr/td[2]");
		System.out.println(Type12);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Type12));
		String type12 = element.getText();
		System.out.println(type12);

		Assert.assertEquals(type12, "Callee");
		ExtentSuccessMessage("Assertion for Caller type is Done");

	}

	public void transfer_Outbound_Online_Offline() throws InterruptedException, ParseException {

		TabSwitchToParent();
		waitForElement(2000);
		By CTIInputField = By.xpath("//input[@placeholder='Enter Phone Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number3);
		ExtentSuccessMessage("Number has been in input field" + firstnumber);

		Thread.sleep(3000);
		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		String SMS_Time = CurrentTime();
		System.out.println(SMS_Time);
		String smstime = removeLeadingZero(SMS_Time);
		System.out.println(smstime);

		TabSwitchToSubChild();

		Thread.sleep(4000);
		By NumberValidation = By.xpath("(//div[@class='voice-call-ongoing-number'])[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NumberValidation));
		String numbertext = element.getText();
		System.out.println(numbertext);

		Assert.assertEquals(numbertext, firstnumber);
		ExtentSuccessMessage("First User Number is displayed after initiating Outbound call");

		By AcceptCall = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Accepted by first user");

		Thread.sleep(2000);

		TabSwitchToParent();

		By TransferCall = By.xpath("//i[@class=' fa fa-calls-transfer ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfer Call By First User");

		Thread.sleep(3000);

		By AgentsTab = By.xpath("(//span[contains(.,'Agents')])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentsTab));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Agents Tab");

		Thread.sleep(4000);
		By SearchFiled = By.xpath("(//input[@value='search'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchFiled));
		MoveToElementClick(element);
		writeText(SearchFiled, profilename + Keys.ENTER);
		ExtentSuccessMessage("Name Searched for Second User to Transfer");

		Thread.sleep(3000);
		By TransferButton = By.xpath("(//span[contains(.,'" + profilename + "')])[2]/u/ancestor::span/button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfer Button");

		String SMS_Time1 = CurrentTime();
		System.out.println(SMS_Time1);
		String smstime1 = removeLeadingZero(SMS_Time1);
		System.out.println(smstime1);

		TabSwitchToChild();

		Thread.sleep(1500);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(NumberValidation));
		String numbertext1 = element.getText();
		System.out.println(numbertext1);

		Assert.assertEquals(numbertext1, number3);
		ExtentSuccessMessage("Third User Number is displayed after Transfering the call from first User");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call which is been transfered is accepted by Second user");

		TabSwitchToParent();

		By WarmTransfer = By
				.xpath("//button[@class='voice-call-green-button-small fa fa-phone fa fa-code-fork blue-bg']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(WarmTransfer));
		MoveToElementClick(element);
		ExtentSuccessMessage("Warm Transfer has been done from first user to second user");
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(3000);

		TabSwitchToChild();

		Thread.sleep(8000);

		By DeclineCall = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DeclineCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been declined by second user");

		driver.navigate().refresh();

		Thread.sleep(8000);

		By CalLogs = By.xpath("//a[@title='Call Logs']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CalLogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call logs has been opened");
		Thread.sleep(2000);

		By TimeCount = By.xpath("(//u[@class='message-time date-txt drag-not-allowed ng-binding'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
		String count = element.getText();
		System.out.println(count);
		String timeString = StringUtils.substringAfter(count, " ");
		System.out.println("---------" + timeString);
		String Formatted_Time = removeSeconds(timeString);

		boolean isTimeMatching = areTimesMatching(SMS_Time1, Formatted_Time, 1);
		System.out.println(isTimeMatching);

		if (isTimeMatching) {
			System.out.println("Times match or are within the acceptable range.");
			ExtentSuccessMessage("Times match or are within the acceptable range.");

		} else {
			System.err.println("Times do not match.");
			ExtentErrorMessage("Times do not match.");

		}

		ExtentSuccessMessage("Assertion for call log time is done");

		Thread.sleep(6000);
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
				+ profilename + "')]/td[2]/div/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIStatus));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		Thread.sleep(2000);
		String ctistatus = element.getText();
		System.out.println(ctistatus);

		Assert.assertEquals(ctistatus, "Ready");
		ExtentSuccessMessage("Agent Status is displaying as Ready in CTI Dashboard");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Thread.sleep(4000);
		By Home_Redirection = By.xpath("//a[@id='menu_home']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home_Redirection));
		MoveToElementClick(element);
		Thread.sleep(2000);
		ExtentSuccessMessage("Clicked on the home button");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		Thread.sleep(2000);
		By Admin_Tile = By.xpath("//span[normalize-space()='Admin']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(8000);

		By Telephonesetup = By.xpath("//a[@href='#/admin/manage-account']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);

		Thread.sleep(5000);
		By Click_On_Viewcall = By.xpath("//button[@id='viceCallLogsBtn']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Viewcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");
		Thread.sleep(5000);

		By RecentCall = By.xpath("(//div[@class='accordion-container grid-style-height'])[1]/i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		By CreatedToday = By.xpath("//md-radio-button[@value='Created Today']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		By CallType = By.xpath("(//div[@class='accordion-container grid-style-height'])[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(2000);
		By TransferedCall = By.xpath("//md-checkbox[@name='Transferred Call']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferedCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfered Call");

		Thread.sleep(4000);

		By Direction = By.xpath("(//div[contains(.,'" + Formatted_Time
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Direction));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		MoveToElementClick(element);
		String direction = element.getText();
		System.out.println(direction);

		Assert.assertEquals(direction, "Transferred");
		ExtentSuccessMessage("Assertion for Direction is done");

		By FromNumber = By.xpath("(//div[contains(.,'" + Formatted_Time
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FromNumber));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String fromnumber = element.getText();
		System.out.println(fromnumber);

		Assert.assertEquals(fromnumber, number3);
		ExtentSuccessMessage("Assertion for From Number is Done");

		By ToNumber = By.xpath("(//div[contains(.,'" + Formatted_Time
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ToNumber));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String tonumber = element.getText();
		System.out.println(tonumber);

		Assert.assertEquals(tonumber, secondnumber);
		ExtentSuccessMessage("Assertion for To Number is Done");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home_Redirection));
		MoveToElementClick(element);
		Thread.sleep(2000);
		ExtentSuccessMessage("Clicked on the home button");

		TabSwitchToParent();

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(6000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Viewcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(4000);
		By OutboundCall = By.xpath("//md-checkbox[@name='Outbound Call']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(OutboundCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Outbound Call");

		Thread.sleep(4000);

		By Direction1 = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Direction1));
		String direction2 = element.getText();
		System.out.println(direction2);

		Assert.assertEquals(direction2, "Outbound");
		ExtentSuccessMessage("Assertion for direction is done:-" + direction2);

		By From1 = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(From1));
		String from1 = element.getText();
		System.out.println(from1);

		Assert.assertEquals(from1, firstnumber);
		ExtentSuccessMessage("Assertion for from number is done");

		By To1 = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(To1));
		String to1 = element.getText();
		System.out.println(from1);

		Assert.assertEquals(to1, number3);
		ExtentSuccessMessage("Assertion for To nuber is done");

		By CDRID = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[1]/div/a");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CDRID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on CDR ID");

		Thread.sleep(15000);

		By CallFrom = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[1]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallFrom));
		String callfrom = element.getText();
		System.out.println(callfrom);

		Assert.assertEquals(callfrom, firstnumber);
		ExtentSuccessMessage("Assertion for CallFrom is done in CDR");

		By CallTo = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[2]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTo));
		String callto = element.getText();
		System.out.println(callto);

		Assert.assertEquals(callto, number3);
		ExtentSuccessMessage("Assertion for CallTo is done in CDR");

		By CallTypee = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[3]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTypee));
		String calltype = element.getText();
		System.out.println(calltype);

		Assert.assertEquals(calltype, "Outgoing Call");
		ExtentSuccessMessage("Assertion for Call Type is done in CDR");

		By CallStatus = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[4]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallStatus));
		String callstatus = element.getText();
		System.out.println(callstatus);

		Assert.assertEquals(callstatus, "Completed");
		ExtentSuccessMessage("Assertion for Call Status is done in CDR");

		By SID = By.xpath("//div[@class='col-lg-3 col-md-3 col-sm-6 col-xs-12']/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SID));
		String sid = element.getText();
		System.out.println(sid);

		By Typee = By.xpath("//span[contains(.,'" + number3 + "')]/ancestor::tr/td[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Typee));
		System.out.println(Typee);
		String type = element.getText();
		System.out.println(type);

		Assert.assertEquals(type, "Callee");
		ExtentSuccessMessage("Assertion for Caller type is Done");

		By Type2 = By.xpath("//span[contains(.,'" + username + "')]/ancestor::tr/td[2]");
		System.out.println(Type2);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Type2));
		String type2 = element.getText();
		System.out.println(type2);

		Assert.assertEquals(type2, "Caller");
		ExtentSuccessMessage("Assertion for Caller type is Done");

		driver.navigate().back();
		Thread.sleep(4000);

		ExtentSuccessMessage("----------OnlineOfflineOutboundTransferCompleted--------");

		TabSwitchToChild();

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home_Redirection));
		MoveToElementClick(element);
		Thread.sleep(2000);
		ExtentSuccessMessage("Clicked on the home button");

		TabSwitchToParent();
		driver.navigate().refresh();
		Thread.sleep(3000);

		TabSwitchToSubChild();
		driver.navigate().refresh();
		Thread.sleep(3000);

		TabSwitchToChild();
		Thread.sleep(4000);

		By CTIConsole = By.xpath("//a[@class='nav-link AVAILABLE']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIConsole));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on CTI Console button");

		Thread.sleep(2000);
		By Profile = By.xpath("//div[@class='profile']/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Profile));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Profile button");

		Thread.sleep(2000);
		By Offline = By.xpath("(//span[contains(.,'Offline')])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Offline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Offline Status");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DashBoard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Dashboard Tile");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentDashBoard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on AgentDashBoard Tile");

		Thread.sleep(8000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIStatus));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		Thread.sleep(2000);
		String ctistatusoffline = element.getText();
		System.out.println(ctistatusoffline);

		Thread.sleep(4000);
		Assert.assertEquals(ctistatusoffline, "Offline");
		ExtentSuccessMessage("Agent Status is displaying as Offline in dashboard After Changing Status as offline");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home_Redirection));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on the home button");

		Thread.sleep(4000);

		TabSwitchToParent();

		waitForElement(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number3);
		ExtentSuccessMessage("Number has been in input field" + number3);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		String SMS_Offline = CurrentTime();
		System.out.println(SMS_Offline);
		String smstoffline = removeLeadingZero(SMS_Offline);
		System.out.println(smstoffline + "------Offlinetime");

		TabSwitchToSubChild();

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Accepted by Third user");

		Thread.sleep(2000);

		TabSwitchToParent();

		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfer Call By First User");

		Thread.sleep(3000);
		By Inputt = By.xpath("(//input[@placeholder=' Enter Phone Number or Click the icon '])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Inputt));
		MoveToElementClick(element);
		writeText(Inputt, secondnumber);
		ExtentSuccessMessage("Entered Second User Number for Transfer");

		By CallTransfer = By
				.cssSelector("#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransfer));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Transfer Button");

		String SMS_Offline2 = CurrentTime();
		System.out.println(SMS_Offline2);
		String smstoffline2 = removeLeadingZero(SMS_Offline2);
		System.out.println(smstoffline2 + "------Offlinetime");

		TabSwitchToChild();

		Thread.sleep(1000);
		By MissedCallSSE = By.cssSelector("body > div.col-xs-11.col-sm-3.alert.alert-pastel-info.animated.fadeInRight");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCallSSE));
		Assert.assertTrue(driver.findElement(MissedCallSSE).isDisplayed());
		ExtentSuccessMessage("SSE Notification For Transfered call is diaplayed");

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CalLogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call logs has been opened");
		Thread.sleep(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
		String count1 = element.getText();
		System.out.println(count1);
		String timeString1 = StringUtils.substringAfter(count1, " ");
		System.out.println("---------" + timeString);
		String Formatted_Time1 = removeSeconds(timeString1);
		System.out.println("---------" + Formatted_Time1);

		boolean isTimeMatching1 = areTimesMatching(SMS_Offline2, Formatted_Time1, 1);
		System.out.println(isTimeMatching1);

		if (isTimeMatching1) {
			System.out.println("Times match or are within the acceptable range.");
			ExtentSuccessMessage("Times match or are within the acceptable range.");

		} else {
			System.err.println("Times do not match.");
			ExtentErrorMessage("Times do not match.");

		}

		ExtentSuccessMessage("Assertion for call log time is done for outbound Transfer");

		Thread.sleep(5000);
		By MissedCall1 = By.xpath("//a[@title='Missed Calls']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCall1));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");

		By MissedCallValidation = By.xpath("//u[contains(.,'" + smstoffline2 + "')]");
		Assert.assertTrue(driver.findElement(MissedCallValidation).isDisplayed());
		ExtentSuccessMessage("Missed Call is displayed under Missed call section");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(6000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Viewcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(4000);
		By MissedCall = By.xpath("//md-checkbox[@name='Missed Call,Missed Call Group']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfered Call");

		Thread.sleep(4000);

		By Directionn = By.xpath("(//div[contains(.,'" + smstoffline2
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Directionn));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		MoveToElementClick(element);
		String direction1 = element.getText();
		System.out.println(direction1);

		Assert.assertEquals(direction1, "Missed");
		ExtentSuccessMessage("Assertion for Direction is done");

		By FromNumber1 = By.xpath("(//div[contains(.,'" + smstoffline2
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FromNumber1));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String fromnumber1 = element.getText();
		System.out.println(fromnumber1);

		Assert.assertEquals(fromnumber1, number3);
		ExtentSuccessMessage("Assertion for From Number is Done");

		By ToNumber1 = By.xpath("(//div[contains(.,'" + smstoffline2
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ToNumber1));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String tonumber1 = element.getText();
		System.out.println(tonumber1);

		Assert.assertEquals(tonumber1, secondnumber);
		ExtentSuccessMessage("Assertion for To Number is Done");

		ExtentSuccessMessage("----------Completed Outbound Online and Offline Transfer------------------");

		logout_CE_validations();

		TabSwitchToParent();

		driver.navigate().refresh();

		Thread.sleep(4000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(OutboundCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Outbound Call");

		Thread.sleep(4000);

		By Direction3 = By.xpath("(//div[contains(.,'" + SMS_Offline
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Direction3));
		String direction3 = element.getText();
		System.out.println(direction3);

		Assert.assertEquals(direction3, "Outbound");
		ExtentSuccessMessage("Assertion for direction is done:-" + direction2);

		By From3 = By.xpath("(//div[contains(.,'" + SMS_Offline
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(From3));
		String from3 = element.getText();
		System.out.println(from3);

		Assert.assertEquals(from3, firstnumber);
		ExtentSuccessMessage("Assertion for from number is done");

		By To2 = By.xpath("(//div[contains(.,'" + SMS_Offline
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(To2));
		String to2 = element.getText();
		System.out.println(to2);

		Assert.assertEquals(to2, number3);
		ExtentSuccessMessage("Assertion for To nuber is done");

		By CDRID1 = By.xpath("(//div[contains(.,'" + SMS_Offline
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[1]/div/a");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CDRID1));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on CDR ID");

		Thread.sleep(15000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallFrom));
		String callfrom1 = element.getText();
		System.out.println(callfrom1);

		Assert.assertEquals(callfrom1, firstnumber);
		ExtentSuccessMessage("Assertion for CallFrom is done in CDR");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTo));
		String callto1 = element.getText();
		System.out.println(callto1);

		Assert.assertEquals(callto1, number3);
		ExtentSuccessMessage("Assertion for CallTo is done in CDR");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTypee));
		String calltype1 = element.getText();
		System.out.println(calltype1);

		Assert.assertEquals(calltype, "Outgoing Call");
		ExtentSuccessMessage("Assertion for Call Type is done in CDR");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallStatus));
		String callstatus1 = element.getText();
		System.out.println(callstatus1);

		Assert.assertEquals(callstatus1, "Completed");
		ExtentSuccessMessage("Assertion for Call Status is done in CDR");

		By SID1 = By.xpath("//div[@class='col-lg-3 col-md-3 col-sm-6 col-xs-12']/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SID1));
		String sid1 = element.getText();
		System.out.println(sid1);

		By Typee1 = By.xpath("//span[contains(.,'" + number3 + "')]/ancestor::tr/td[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Typee1));
		System.out.println(Typee1);
		String type1 = element.getText();
		System.out.println(type1);

		Assert.assertEquals(type1, "Callee");
		ExtentSuccessMessage("Assertion for Callee type is Done");

		By Type12 = By.xpath("//span[contains(.,'" + username + "')]/ancestor::tr/td[2]");
		System.out.println(Type12);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Type12));
		String type12 = element.getText();
		System.out.println(type12);

		Assert.assertEquals(type12, "Caller");
		ExtentSuccessMessage("Assertion for Caller type is Done");

		driver.navigate().back();
		Thread.sleep(4000);

	}
	

	public void Out_Bound_Transfer_Custom() throws InterruptedException, IOException, ParseException	{
		By UserNumber = By.xpath("//u[@title='Voice Number']");	
		By Username =By.xpath("//*[@class='profile-name drag-not-allowed ng-binding']");
//		splitthewindowscreen2("Right");//login ceuserone
		String Firstusernumber=GetElementText(UserNumber);
		System.out.println(Firstusernumber);
		Admin_redirection();
		//Telephone_Setup();
		CUstom_Status_SetupWithtext("BeRight_Back");
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
		waitForElement(10000);
		waitVisibility(UserNumber);
		String Thirdusernumber=GetElementText(UserNumber);
		System.out.println(Thirdusernumber);


		//		TabSwitchToParent();
		CalltoUser(Secondusernumber);
		String Firstusernumbe1=GetElementText(UserNumber);
		System.out.println(Firstusernumbe1);
		TabSwitchToChild();
		waitVisibility(Qualtia1Number);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1=element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, Thirdusernumber);
		ExtentSuccessMessage("Assertion has been done");
//		time = CurrentTime();
//		System.out.println("time2:-"+time+"-:time2");
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
//		time = CurrentTime();
//		System.out.println("time3:-"+time+"-:time3");
		Thread.sleep(5000);
		ExtentSuccessMessage("Start_TC_CTI_Conference_Custom_Status_Admin_CallLogs");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceAddButton));
		MoveToElementClick(element);

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceNumberField));
		MoveToElementClick(element);

		writeText(ConfrenceNumberField, Firstusernumber);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallConfreanceButton));
		MoveToElementClick(element);
//		time = CurrentTime();
//		System.out.println("time:-"+time+"-:time");
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
		//		TabSwitchToChild();		
		TabSwitchToThirdWindow();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
//		time = CurrentTime();
//		System.out.println("time6:-"+time+"-:time6");
		//		TabSwitchToParent();
		TabSwitchToChild();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ClickOnHomepage();
		Callingtime = Currenttime();
		System.out.println("time7:-"+Callingtime+"-:time7");
		//		time = CurrentTime();
		//		System.out.println("time6:-"+time+"-:time6");
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

		String Values = (Thirdusernumber+","+Secondusernumber+","+"Incoming Call"+","+"Connected"+","+TodaysDate+","+TodaysDate+" "+Callingtimes+","+TodaysDate+" "+Callingtime+","+"NA"+","+"Not DNC Number"+","+Secondusername.toUpperCase());
		VerifyBasicCAllsDetails(Values);

//		splitthewindowscreen2("Right");
		ExtentSuccessMessage("End_TC_CTI_Conference_Custom_Status_Admin_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");
		ExtentSuccessMessage("Start_TC_CTI_Conference_Custom_Status_CTI_CallLogs");
		TabSwitchToParent();
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
		ExtentSuccessMessage("End_TC_CTI_Conference_Custom_Status_CTI_CallLogs");	
		logout_CE_validations();
		TabSwitchToChild();
		//		TabSwitchToParent();
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		//		MoveToElementClick(element);
		waitForElement(1000);
		logout_CE_validations();
		//		TabSwitchToParent();
		TabSwitchToThirdWindow();


}



	public void transfer_BRB_CustomMessage() throws InterruptedException, ParseException {
		TabSwitchToChild();

		Thread.sleep(4000);
		By Profile = By.xpath("//div[@class='profile']/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Profile));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Profile button");

		Thread.sleep(2000);
		By Offline = By.xpath("(//span[contains(.,'Be Right Back')])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Offline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Be Right Back Status");

		Thread.sleep(6000);
		By DashBoard = By.xpath("//a[@class='glyphicon fa fa-fw fa-dashboard']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DashBoard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Dashboard Tile");

		By AgentDashBoard = By.xpath("//a[contains(.,'Agent Dashboard')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentDashBoard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on AgentDashBoard Tile");

		Thread.sleep(8000);
		By Frame = By.xpath("//iframe[@class='ng-scope ng-isolate-scope']");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(3000);
		By CTIStatus = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[2]/div/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIStatus));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		Thread.sleep(2000);
		String ctistatusoffline = element.getText();
		System.out.println(ctistatusoffline);

		Thread.sleep(4000);
		Assert.assertEquals(ctistatusoffline, "Be Right Back");
		ExtentSuccessMessage("Agent Status is displaying as Offline in dashboard After Changing Status as offline");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Thread.sleep(2000);
		By Home_Redirection = By.xpath("//a[@id='menu_home']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home_Redirection));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on the home button");

		TabSwitchToSubChild();

		waitForElement(4000);
		By CTIInputField = By.xpath("//input[@placeholder='Enter Phone Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, firstnumber);
		ExtentSuccessMessage("Number has been in input field" + firstnumber);

		Thread.sleep(3000);
		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		String SMS_Time = CurrentTime();
		System.out.println(SMS_Time);
		String smstime = removeLeadingZero(SMS_Time);
		System.out.println(smstime);

		TabSwitchToParent();

		Thread.sleep(1000);
		By NumberValidation = By.xpath("(//div[@class='voice-call-ongoing-number'])[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NumberValidation));
		String numbertext = element.getText();
		System.out.println(numbertext);

		Assert.assertEquals(numbertext, number3);
		ExtentSuccessMessage("Third User Number is displayed after initiating ther call");

		By AcceptCall = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Accepted by first user");

		Thread.sleep(2000);

		By TransferCall = By.xpath("//i[@class=' fa fa-calls-transfer ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfer Call By First User");

		Thread.sleep(3000);
		By Inputt = By.xpath("(//input[@placeholder=' Enter Phone Number or Click the icon '])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Inputt));
		MoveToElementClick(element);
		writeText(Inputt, secondnumber);
		ExtentSuccessMessage("Entered Second User Number for Transfer");

		Thread.sleep(4000);
		By CallTransfer = By
				.cssSelector("#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransfer));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Transfer Button");

		String SMS_Time1 = CurrentTime();
		System.out.println(SMS_Time1);
		String smstime1 = removeLeadingZero(SMS_Time1);
		System.out.println(smstime1);

		TabSwitchToChild();

		Thread.sleep(1000);
		By MissedCallSSE = By.cssSelector("body > div.col-xs-11.col-sm-3.alert.alert-pastel-info.animated.fadeInRight");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCallSSE));
		Assert.assertTrue(driver.findElement(MissedCallSSE).isDisplayed());
		ExtentSuccessMessage("SSE Notification For Transfered call is diaplayed");

		By CalLogs = By.xpath("//a[@title='Call Logs']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CalLogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call logs has been opened");
		Thread.sleep(2000);

		By TimeCount = By.xpath("(//u[@class='message-time date-txt drag-not-allowed ng-binding'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
		String count = element.getText();
		System.out.println(count);
		String timeString = StringUtils.substringAfter(count, " ");
		System.out.println("---------" + timeString);
		String Formatted_Time = removeSeconds(timeString);
		System.out.println("---------" + Formatted_Time);

		boolean isTimeMatching = areTimesMatching(SMS_Time1, Formatted_Time, 1);
		System.out.println(isTimeMatching);

		if (isTimeMatching) {
			System.out.println("Times match or are within the acceptable range.");
			ExtentSuccessMessage("Times match or are within the acceptable range.");

		} else {
			System.err.println("Times do not match.");
			ExtentErrorMessage("Times do not match.");

		}

		By MissedCalllogs = By.xpath("//a[@title='Missed Calls']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCalllogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Missed Call Section");

		Thread.sleep(5000);
		By MissedCallTime = By.xpath("//u[contains(.,'" + smstime1 + "')]");
		System.out.println(MissedCallTime);
		Assert.assertTrue(driver.findElement(MissedCallTime).isDisplayed());
		ExtentSuccessMessage("Assertion for Offline Missed call is done");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		Thread.sleep(2000);
		By Admin_Tile = By.xpath("//span[normalize-space()='Admin']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(8000);

		By Telephonesetup = By.xpath("//a[@href='#/admin/manage-account']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);

		Thread.sleep(5000);
		By Click_On_Viewcall = By.xpath("//button[@id='viceCallLogsBtn']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Viewcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");
		Thread.sleep(5000);

		By RecentCall = By.xpath("(//div[@class='accordion-container grid-style-height'])[1]/i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		By CreatedToday = By.xpath("//md-radio-button[@value='Created Today']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		By CallType = By.xpath("(//div[@class='accordion-container grid-style-height'])[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(2000);
		By TransferedCall = By.xpath("//md-checkbox[@name='Missed Call,Missed Call Group']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferedCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfered Call");

		Thread.sleep(4000);

		By Direction = By.xpath("(//div[contains(.,'" + Formatted_Time
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Direction));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		MoveToElementClick(element);
		String direction = element.getText();
		System.out.println(direction);

		Assert.assertEquals(direction, "Missed");
		ExtentSuccessMessage("Assertion for Direction is done");

		By FromNumber = By.xpath("(//div[contains(.,'" + Formatted_Time
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FromNumber));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String fromnumber = element.getText();
		System.out.println(fromnumber);

		Assert.assertEquals(fromnumber, number3);
		ExtentSuccessMessage("Assertion for From Number is Done");

		By ToNumber = By.xpath("(//div[contains(.,'" + Formatted_Time
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ToNumber));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String tonumber = element.getText();
		System.out.println(tonumber);

		Assert.assertEquals(tonumber, secondnumber);
		ExtentSuccessMessage("Assertion for To Number is Done");

		TabSwitchToParent();
		driver.navigate().refresh();
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(6000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Viewcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(4000);
		By InboundCall = By.xpath("//md-checkbox[@name='Inbound Call']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(InboundCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on InboundCall ");

		Thread.sleep(4000);

		By Direction1 = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Direction1));
		String direction2 = element.getText();
		System.out.println(direction2);

		Assert.assertEquals(direction2, "Inbound");
		ExtentSuccessMessage("Assertion for direction is done");

		By From1 = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(From1));
		String from1 = element.getText();
		System.out.println(from1);

		Assert.assertEquals(from1, number3);
		ExtentSuccessMessage("Assertion for from nuber is done");

		By To1 = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(To1));
		String to1 = element.getText();
		System.out.println(from1);

		Assert.assertEquals(to1, firstnumber);
		ExtentSuccessMessage("Assertion for To number is done");

		By CDRID = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[1]/div/a");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CDRID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on CDR ID");

		Thread.sleep(15000);

		By CallFrom = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[1]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallFrom));
		String callfrom = element.getText();
		System.out.println(callfrom);

		Assert.assertEquals(callfrom, number3);
		ExtentSuccessMessage("Assertion for CallFrom is done in CDR");

		By CallTo = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[2]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTo));
		String callto = element.getText();
		System.out.println(callto);

		Assert.assertEquals(callto, firstnumber);
		ExtentSuccessMessage("Assertion for CallTo is done in CDR");

		By CallTypee = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[3]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTypee));
		String calltype = element.getText();
		System.out.println(calltype);

		Assert.assertEquals(calltype, "Incoming Call");
		ExtentSuccessMessage("Assertion for Call Type is done in CDR");

		By CallStatus = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[4]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallStatus));
		String callstatus = element.getText();
		System.out.println(callstatus);

		Assert.assertEquals(callstatus, "Completed");
		ExtentSuccessMessage("Assertion for Call Status is done in CDR");

		By SID = By.xpath("//div[@class='col-lg-3 col-md-3 col-sm-6 col-xs-12']/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SID));
		String sid = element.getText();
		System.out.println(sid);

		By Typee = By.xpath("//span[contains(.,'" + number3 + "')]/ancestor::tr/td[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Typee));

		System.out.println(Typee);
		String type = element.getText();
		System.out.println(type);

		Assert.assertEquals(type, "Caller");
		ExtentSuccessMessage("Assertion for Caller type is Done");

		By Type2 = By.xpath("//span[contains(.,'" + username + "')]/ancestor::tr/td[2]");
		System.out.println(Type2);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Type2));
		String type2 = element.getText();
		System.out.println(type2);

		Assert.assertEquals(type2, "Callee");
		ExtentSuccessMessage("Assertion for Caller type is Done");

		driver.navigate().back();
		Thread.sleep(4000);

		ExtentSuccessMessage("----------BeRightBackTransferCompleted--------");
		TabSwitchToChild();
		Thread.sleep(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home_Redirection));
		MoveToElementClick(element);
		Thread.sleep(2000);
		ExtentSuccessMessage("Clicked on the home button");

		Thread.sleep(4000);
		By CTILogo = By.cssSelector("#topNavbarMain > ul > li.nav-item.ng-scope > a");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTILogo));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on CTI logo button");

		TabSwitchToSubChild();

		driver.navigate().refresh();

		Thread.sleep(4000);

		TabSwitchToParent();

		driver.navigate().refresh();

		Thread.sleep(4000);
		TabSwitchToChild();

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DashBoard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Dashboard Tile");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentDashBoard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on AgentDashBoard Tile");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Profile));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Profile button");

		Thread.sleep(2000);
		By CustomMessage = By.xpath("(//span[contains(.,'AutoStatus')])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomMessage));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Offline Status");

		Thread.sleep(5000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIStatus));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		Thread.sleep(2000);
		String ctistatusauto = element.getText();
		System.out.println(ctistatusauto);

		Thread.sleep(4000);
		Assert.assertEquals(ctistatusauto, "AutoStatus");
		ExtentSuccessMessage("Agent Status is displaying as Offline in dashboard After Changing Status as offline");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home_Redirection));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on the home button");

		TabSwitchToSubChild();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, firstnumber);
		ExtentSuccessMessage("Number has been in input field" + Session1_Number);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		String SMS_Offline = CurrentTime();
		System.out.println(SMS_Offline);
		String smstoffline = removeLeadingZero(SMS_Offline);
		System.out.println(smstoffline + "------Offlinetime");

		TabSwitchToParent();

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Accepted by first user");

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfer Call By First User");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Inputt));
		MoveToElementClick(element);
		writeText(Inputt, secondnumber);
		ExtentSuccessMessage("Entered Second User Number for Transfer");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransfer));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Transfer Button");

		String SMS_Offline2 = CurrentTime();
		System.out.println(SMS_Offline2);
		String smstoffline2 = removeLeadingZero(SMS_Offline2);
		System.out.println(smstoffline2 + "------Offlinetime");

		TabSwitchToChild();

		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCallSSE));
		Assert.assertTrue(driver.findElement(MissedCallSSE).isDisplayed());
		ExtentSuccessMessage("SSE Notification For Transfered call is diaplayed");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CalLogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call logs has been opened");
		Thread.sleep(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
		String count1 = element.getText();
		System.out.println(count1);
		String timeString1 = StringUtils.substringAfter(count1, " ");
		System.out.println("---------" + timeString);
		String Formatted_Time1 = removeSeconds(timeString1);
		System.out.println("---------" + Formatted_Time1);

		boolean isTimeMatching1 = areTimesMatching(SMS_Offline2, Formatted_Time1, 1);
		System.out.println(isTimeMatching1);

		if (isTimeMatching1) {
			System.out.println("Times match or are within the acceptable range.");
			ExtentSuccessMessage("Times match or are within the acceptable range.");

		} else {
			System.err.println("Times do not match.");
			ExtentErrorMessage("Times do not match.");

		}

		By MissedCalllogs1 = By.xpath("//a[@title='Missed Calls']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCalllogs1));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Misswd Call Section");

		Thread.sleep(4000);
		By MissedCallTime1 = By.xpath("//u[contains(.,'" + smstoffline2 + "')]");
		System.out.println(MissedCallTime1);
		Assert.assertTrue(driver.findElement(MissedCallTime1).isDisplayed());
		ExtentSuccessMessage("Assertion for Offline Missed call is done");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(6000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Viewcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(4000);
		By MissedCall = By.xpath("//md-checkbox[@name='Missed Call,Missed Call Group']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfered Call");

		Thread.sleep(4000);

		By Directionn = By.xpath("(//div[contains(.,'" + smstoffline2
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Directionn));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		MoveToElementClick(element);
		String direction1 = element.getText();
		System.out.println(direction1);

		Assert.assertEquals(direction1, "Missed");
		ExtentSuccessMessage("Assertion for Direction is done");

		By FromNumber1 = By.xpath("(//div[contains(.,'" + smstoffline2
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FromNumber1));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String fromnumber1 = element.getText();
		System.out.println(fromnumber1);

		Assert.assertEquals(fromnumber1, number3);
		ExtentSuccessMessage("Assertion for From Number is Done");

		By ToNumber1 = By.xpath("(//div[contains(.,'" + smstoffline2
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ToNumber1));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String tonumber1 = element.getText();
		System.out.println(tonumber1);

		Assert.assertEquals(tonumber1, secondnumber);
		ExtentSuccessMessage("Assertion for To Number is Done");

		logout_CE_validations();

		TabSwitchToParent();

		driver.navigate().refresh();
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		Thread.sleep(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(4000);
		By InboundCall1 = By.xpath("//md-checkbox[@name='Inbound Call']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(InboundCall1));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on InboundCall Call");

		Thread.sleep(4000);

		By Direction2 = By.xpath("(//div[contains(.,'" + smstoffline
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Direction2));
		String direction3 = element.getText();
		System.out.println(direction3);

		Assert.assertEquals(direction2, "Inbound");
		ExtentSuccessMessage("Assertion for direction is done");

		By From2 = By.xpath("(//div[contains(.,'" + smstoffline
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(From2));
		String from2 = element.getText();
		System.out.println(from2);

		Assert.assertEquals(from2, number3);
		ExtentSuccessMessage("Assertion for from number is done");

		By To2 = By.xpath("(//div[contains(.,'" + smstoffline
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(To2));
		String to2 = element.getText();
		System.out.println(to2);

		Assert.assertEquals(to2, firstnumber);
		ExtentSuccessMessage("Assertion for To number is done");

		By CDRID1 = By.xpath("(//div[contains(.,'" + smstoffline
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[1]/div/a");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CDRID1));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on CDR ID");

		Thread.sleep(15000);

		By CallFrom1 = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[1]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallFrom1));
		String callfrom1 = element.getText();
		System.out.println(callfrom1);

		Assert.assertEquals(callfrom1, number3);
		ExtentSuccessMessage("Assertion for CallFrom is done in CDR");

		By CallTo1 = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[2]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTo1));
		String callto1 = element.getText();
		System.out.println(callto1);

		Assert.assertEquals(callto, firstnumber);
		ExtentSuccessMessage("Assertion for CallTo is done in CDR");

		By CallTypee1 = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[3]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTypee1));
		String calltype1 = element.getText();
		System.out.println(calltype1);

		Assert.assertEquals(calltype1, "Incoming Call");
		ExtentSuccessMessage("Assertion for Call Type is done in CDR");

		By CallStatus1 = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[4]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallStatus1));
		String callstatus1 = element.getText();
		System.out.println(callstatus1);

		Assert.assertEquals(callstatus, "Completed");
		ExtentSuccessMessage("Assertion for Call Status is done in CDR");

		By SID1 = By.xpath("//div[@class='col-lg-3 col-md-3 col-sm-6 col-xs-12']/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SID1));
		String sid1 = element.getText();
		System.out.println(sid1);

		By Typee1 = By.xpath("//span[contains(.,'" + number3 + "')]/ancestor::tr/td[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Typee1));

		System.out.println(Typee1);
		String type1 = element.getText();
		System.out.println(type1);

		Assert.assertEquals(type, "Caller");
		ExtentSuccessMessage("Assertion for Caller type is Done");

		By Type12 = By.xpath("//span[contains(.,'" + username + "')]/ancestor::tr/td[2]");
		System.out.println(Type2);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Type12));
		String type12 = element.getText();
		System.out.println(type12);

		Assert.assertEquals(type12, "Callee");
		ExtentSuccessMessage("Assertion for Caller type is Done");

		ExtentSuccessMessage("----------Completed BRB and CustomeMessage Transfer------------------");

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

	public void inbound_BMW() throws InterruptedException {
		waitForElement(5000);
		By CTIInputField = By.xpath("//input[@placeholder='Enter Phone Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, firstnumber);
		ExtentSuccessMessage("Number has been in input field" + Session1_Number);

		Thread.sleep(3000);
		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		String SMS_Time = CurrentTime();
		System.out.println(SMS_Time);
		String smstime = removeLeadingZero(SMS_Time);
		System.out.println(smstime);

		TabSwitchToParent();

		Thread.sleep(1000);
		By NumberValidation = By.xpath("(//div[@class='voice-call-ongoing-number'])[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NumberValidation));
		String numbertext = element.getText();
		System.out.println(numbertext);

		Assert.assertEquals(numbertext, number3);
		ExtentSuccessMessage("Third User Number is displayed after initiating ther call");

		By AcceptCall = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Accepted by first user");

		Thread.sleep(2000);
		By mute = By.xpath("//a[@ng-show='!CTICtrl.CTIContext.primarayPhoneFlags.mute']//i[contains(@class,'fa')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(mute));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call  has been muted");

		TabSwitchToChild();

		Thread.sleep(3000);
		By Dashboard = By.xpath("//a[@class='glyphicon fa fa-fw fa-dashboard']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Dashboard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on dashboard");

		By drop_down_telephone_setup = By.xpath("//a[@ng-click='navigateToTelephony()']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(drop_down_telephone_setup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on telephone setup dropdown");

		Thread.sleep(4000);
		By Minimize = By.xpath("//a[@title='Minimize']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
		MoveToElementClick(element);

		Thread.sleep(2000);

		By Frame = By.xpath("//iframe[@class='ng-scope ng-isolate-scope']");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(3000);

		Thread.sleep(3000);
		By CustomerNumber = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ username + "')]/td[7]/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomerNumber));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String number = element.getText();
		System.out.println(number);

		Assert.assertEquals(number, number3);
		ExtentSuccessMessage("Assertion for Third number is done as a customer Number");

		Thread.sleep(3000);
		By Whisper = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ username + "')]/td[16]/div/div/button/i[@class='fa fa-wifi']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Whisper));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Whisper Icon");

		Thread.sleep(2000);
		By WhisperPopup = By.xpath("//div[@aria-labelledby='swal2-title']");
		Assert.assertTrue(driver.findElement(WhisperPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for Whisper popup is done");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		By WhisperCall = By.xpath("//div[@class='voice-call-window-minimized admin-action ng-scope']");
		Assert.assertTrue(driver.findElement(WhisperCall).isDisplayed());

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(4000);
		By EndWhispering = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ username + "')]/td[16]/div/div/button[@title='End Whispering']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EndWhispering));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on End Whisper Icon");

		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(WhisperPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for Whisper popup is done after ending the call");

		ExtentSuccessMessage("---------------Whisper Completed-----------------");

		By Monitor = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ username + "')]/td[16]/div/div/button/i[@class='fa fa-eye']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Monitor));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Start Monitor Icon");

		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(WhisperPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for Monitor popup is done");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Assert.assertTrue(driver.findElement(WhisperCall).isDisplayed());
		ExtentSuccessMessage("Monitor CTI Popup is Visible");

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(4000);
		By EndMonitoring = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ username + "')]/td[16]/div/div/button[@title='End Monitoring']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EndMonitoring));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on End Monitor Icon");

		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(WhisperPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for Monitor popup is done after ending the call");

		ExtentSuccessMessage("---------------Monitor Completed-----------------");

		Thread.sleep(3000);
		By Barge = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ username + "')]/td[16]/div/div/button[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Barge));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Start Barge Icon");

		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(WhisperPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for Barge popup is done");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(WhisperCall).isDisplayed());
		ExtentSuccessMessage("Barge CTI Popup is Visible");

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(4000);
		By EndBarging = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ username + "')]/td[16]/div/div/button[@title='End Barging']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EndBarging));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on End Barging Icon");

		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(WhisperPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for Barging popup is done after ending the call");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

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

		// By LeadCancelButton = By.xpath("//button[@class='grey pull-right md-button
		// md-button']");
		// element =
		// wait.until(ExpectedConditions.presenceOfElementLocated(LeadCancelButton));
		// MoveToElementClick(element);

		waitForElement(6000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);// clicking on DashBoard tiles

	}

	public void outbound_Transfer_Assertion() throws InterruptedException {

		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);

		Assert.assertEquals(NumberOutput1, Session3_Number);
		Assert.assertEquals(NumberOutput1, Session3_Number);
		ExtentSuccessMessage("Assertion has been done");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButtoninQualatia2));
		MoveToElementClick(element);

		Thread.sleep(12000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButtonInQualtia2));
		MoveToElementClick(element);

		Thread.sleep(12000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButtonInQualtia2));
		MoveToElementClick(element);

		waitForElement(6000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);// clicking on DashBoard tiles

	}

	public void end_call() throws InterruptedException {
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButtonInQualtia2));
		MoveToElementClick(element);
	}

	public void Offline_Assertion() throws InterruptedException {

		waitForElement(3200);
		By MissedCallPopup = By
				.xpath("//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight']");
		Assert.assertTrue(driver.findElement(MissedCallPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for missed call popup is done");
	}

	public void Admin_redirection() throws InterruptedException {
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		Thread.sleep(2000);
		By Admin_Tile = By.xpath("//span[normalize-space()='Admin']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(8000);

	}

	public void Telephone_Setup() throws InterruptedException {
		By Telephonesetup = By.xpath("//a[@href='#/admin/manage-account']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);

		Thread.sleep(5000);
		By Click_On_Viewcall = By.xpath("//button[@id='viceCallLogsBtn']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Viewcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");
		Thread.sleep(5000);

	}

	public void CUstom_Status_Setup() throws InterruptedException {
		By Telephonesetup = By.xpath("//a[@href='#/admin/manage-account']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);
		By CLick_ON_CustomCti_Status = By.xpath("(//button[@id='manageCallGroupsBtn'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CLick_ON_CustomCti_Status));
		MoveToElementClick(element);
		Thread.sleep(8000);

		// WebElement Add_Custom =
		// driver.findElement(By.xpath("//button[@id='createNewStatusBtn']"));
		// //element =
		// wait.until(ExpectedConditions.presenceOfElementLocated(Add_Custom));
		//
		// if (Add_Custom.isDisplayed() && element.isEnabled()) {
		// // Perform the click action
		// MoveToElementClick(Add_Custom);
		//
		// System.out.println("Add custom status was present and clickable");
		// By Custom_Popup = By.xpath("//h2[normalize-space()='Add Custom Status']");
		// element =
		// wait.until(ExpectedConditions.presenceOfElementLocated(Custom_Popup));
		//
		// By Custom_Name = By.xpath("//input[@id='CustomStatus']");
		// click(Custom_Name);
		// Custom_Status = "Test"+generateRandom3DigitNumber();
		// writeText(Custom_Name,Custom_Status);
		// By Status_Dropdown = By.xpath("//md-select[@id='CTIStatus']");
		// click(Status_Dropdown);
		// By Status_Select =
		// By.xpath("//div[@class='md-text'][normalize-space()='OFFLINE']");
		// click(Status_Select);
		// By Save = By.xpath("//span[contains(.,'Save')]");
		// element = wait.until(ExpectedConditions.presenceOfElementLocated(Save));
		// MoveToElementClick(element);
		// ExtentSuccessMessage("Clicked on save custom status");
		//
		// driver.navigate().refresh();
		//
		//
		//
		// } else {

		System.out.println("Add status Button is not clickable.");
		waitForElement(8000);
		driver.navigate().refresh();

		waitForElement(8000);
		Cti_Minimize();
		By Edit_Satus = By.xpath("(//i[@class='glyphicon glyphicon-pencil'])[3]");
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
		// element =
		// wait.until(ExpectedConditions.presenceOfElementLocated(Success_Message));
		// ExtentSuccessMessage("Save Custom message succes validation");
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

	public void CUstom_Status_Setup_Online() throws InterruptedException {
		By Telephonesetup = By.xpath("//a[@href='#/admin/manage-account']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);
		By CLick_ON_CustomCti_Status = By.xpath("(//button[@id='manageCallGroupsBtn'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CLick_ON_CustomCti_Status));
		MoveToElementClick(element);
		Thread.sleep(8000);

//		
		System.out.println("Add status Button is not clickable.");
		waitForElement(8000);
		driver.navigate().refresh();

		waitForElement(8000);
		Cti_Minimize();
		By Edit_Satus = By.xpath("(//i[@class='glyphicon glyphicon-pencil'])[3]");
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
		By CTI_Status_dd = By.xpath("//md-select-value");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTI_Status_dd));
		MoveToElementClick(element);

		By CLick_Available = By.xpath("(//div[@class='md-text'][normalize-space()='AVAILABLE'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CLick_Available));
		MoveToElementClick(element);
		ExtentSuccessMessage("Set to active custom status");

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

	public void Admin_Validations_Calltransfer() throws InterruptedException {
		Thread.sleep(8000);
		By Call_State = By.xpath(
				"(//div[@ng-if=\"!!row.entity.TransferredFlag && row.entity.TransferredFlag.fieldValue==='Yes' && row.entity.Direction.fieldValue!=='Missed Call' && row.entity.Direction.fieldValue!=='Missed Call Group' && row.entity.Direction.fieldValue!=='Voicemail'\"])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_State));
		ExtentSuccessMessage("Call Transfered succesfuly validated");

		validateTransfercalledDetails(Present_time);

		// By Transfer_State =
		// By.xpath("(//div[@title='Yes'][normalize-space()='Yes'])[1]");
		// //ScrollUntilElementVisible(Transfer_State) ;
		// element =
		// wait.until(ExpectedConditions.presenceOfElementLocated(Transfer_State));
		// ExtentSuccessMessage("Call Transfered State succesfuly validated");
		//
		// By Transfer_agent = By.xpath("(//div[@title='Qualitia
		// Test2'][normalize-space()='Qualitia Test2'])[1]");
		// element =
		// wait.until(ExpectedConditions.presenceOfElementLocated(Transfer_agent));
		// ExtentSuccessMessage("Call Transfered agent succesfuly validated");

	}

	public void Transfer_Admin_Validations_Call_Offline() throws InterruptedException {

		By Call_State = By.xpath("(//div[@ng-if=\"row.entity.Direction.fieldValue==='Missed Call'\"])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_State));
		ExtentSuccessMessage("Call Transfered succesfuly validated");

		validateTransfercalledDetails(Conference_time);
	}

	public void Transfer_Admin_Validations_Call_Offline(String Time) throws InterruptedException {

		By Call_State = By.xpath("(//div[@ng-if=\"row.entity.Direction.fieldValue==='Missed Call'\"])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_State));
		ExtentSuccessMessage("Call Transfered succesfuly validated");

		validateTransfercalledDetails(Time);
	}

	public void Admin_Validations_Call_Offline() throws InterruptedException {

		By Call_State = By.xpath("(//div[@ng-if=\"row.entity.Direction.fieldValue==='Missed Call'\"])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_State));
		ExtentSuccessMessage("Call Transfered succesfuly validated");

		validateTransfercalledDetails(Offline_time);

	}

	public void validateTransfercalledDetails(String Value) throws InterruptedException {
		By elements = By.xpath("(//*[@class='ui-grid-canvas']//*[contains(text(),'" + Value + "')])[1]");
		if (ElementDisplayed(elements)) {
			ExtentSuccessMessage("Successfully user able to See the '" + Value + "'inside the web table ");

		} else {
			ExtentErrorMessage("Unsuccessfully  '" + Value + "' Not visible inside the web table");
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

	}

	public void Changed_Status_Custom() throws InterruptedException {
		waitForElement(3000);
		By UserIcon = By.xpath("//div[@class='profile-icon ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserIcon));
		MoveToElementClick(element);

		By CustomStatus = By.xpath("//span[contains(text(),'BRB')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomStatus));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on the Offline Customset Buttons");

	}

	public void fetchNumber() throws InterruptedException {
		Thread.sleep(4000);
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber));
		firstnumber = element.getText();
		System.out.println(firstnumber);

	}

	public void fetchNumber3() throws InterruptedException {
		Thread.sleep(15000);
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber));
		number3 = element.getText();
		System.out.println(number3 + "-----ThirdNumber");

	}

	public void fetchNumber1() throws InterruptedException {
		Thread.sleep(10000);
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber));
		firstnumber = element.getText();
		System.out.println("FirstNumber" + firstnumber);

		By UserName = By.xpath("//b[@class='ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserName));
		username = element.getText();
		System.out.println(username);

		url = driver.getCurrentUrl();
		System.out.println(url);

	}

	public void fetchNumber_3() throws InterruptedException {
		Thread.sleep(4000);
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber));
		Session3_Number = element.getText();
		System.out.println("Third  logged users number:" + Session3_Number);

	}

	public void fetchNumber_2() throws InterruptedException {
		Thread.sleep(4000);
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber));
		Session2_Number = element.getText();
		System.out.println("Third  logged users number:" + Session3_Number);

	}

	public void Home_Redirection() throws InterruptedException {
		By Home_Redirection = By.xpath("//a[@id='menu_home']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home_Redirection));
		MoveToElementClick(element);
		Thread.sleep(2000);
		ExtentSuccessMessage("Clicked on the home button");
	}

	public void Click_On_Cti() throws InterruptedException {
		By Click_Cti = By.xpath("//a[@title='CTI - Logged In']");// a[@title='CTI - On Call']
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_Cti));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on the CTI ");

	}

	public void Click_On_Cti_Offline() throws InterruptedException {
		By Click_Cti = By.xpath("//a[@title='CTI - Away']");// a[@title='CTI - On Call']
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_Cti));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on the CTI ");

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

	public void Fetch_Profile_Name() {
		By Profile_Name = By.xpath("//span[@class='profile-name drag-not-allowed ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Profile_Name));
		Session2_Name = element.getText();
		System.out.println("First logged user's name:" + Session2_Name);

	}

	public void Call_Log_Status_Online(String time)
			throws InterruptedException, ParseException, java.text.ParseException {

		Click_On_Cti();
		Thread.sleep(5000);

		By CalLogs = By.xpath("//a[@title='Call Logs']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CalLogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call logs has been opened");
		Thread.sleep(2000);

		By TimeCount = By.xpath("(//u[@class='message-time date-txt drag-not-allowed ng-binding'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
		String count = element.getText();
		System.out.println(count);
		String timeString = StringUtils.substringAfter(count, " ");
		System.out.println("---------" + timeString);
		String Formatted_Time = removeSeconds(timeString);
		System.out.println("---------" + Formatted_Time);

		waitForElement(8000);
		Assert.assertTrue(time.contains(Formatted_Time));
		ExtentSuccessMessage("Assertion for new call log is done");

	}

	public void Call_Log_Status_OFfline(String time)
			throws InterruptedException, ParseException, java.text.ParseException {

		Click_On_Cti_Offline();
		Thread.sleep(5000);

		By CalLogs = By.xpath("//a[@title='Call Logs']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CalLogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call logs has been opened");
		Thread.sleep(2000);

		By TimeCount = By.xpath("(//u[@class='message-time date-txt drag-not-allowed ng-binding'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
		String count = element.getText();
		System.out.println(count);
		String timeString = StringUtils.substringAfter(count, " ");
		System.out.println("---------" + timeString);
		String Formatted_Time = removeSeconds(timeString);
		System.out.println("---------" + Formatted_Time);

		waitForElement(8000);
		Assert.assertTrue(time.contains(Formatted_Time));
		ExtentSuccessMessage("Assertion for new call log is done");

	}

	public void mute_call() throws InterruptedException {
		By mute = By.xpath("//a[@ng-show='!CTICtrl.CTIContext.primarayPhoneFlags.mute']//i[contains(@class,'fa')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(mute));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call  has been muted");

	}

	public void Cti_Minimize() throws InterruptedException {
		waitForElement(6000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);// c
	}

	public void Outbound_valid_Transfer_Admin() throws IOException, InterruptedException {

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

		String QualitiaValidNumber = Session3_Number;
		writeText(CTIInputField, QualitiaValidNumber);
		ExtentSuccessMessage("Number has been in input field" + QualitiaValidNumber);

		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		Thread.sleep(3000);

	}

	public void Switch_to_Iframe() throws InterruptedException {

		Thread.sleep(5000);
		WebElement iframeElement = driver.findElement(By.xpath("//iframe[@id='angularIframe']"));
		driver.switchTo().frame(iframeElement);
		ExtentSuccessMessage("Switched to Iframe content");

	}

	public void Inbound_Admin_Call_Log_Online()
			throws InterruptedException, IOException, ParseException, java.text.ParseException {
		fetchNumber1();
		new_Tab();
		SecondUserForTransfer();
		new_Tab();
		ThirdUserforTransfer();
		valid_Transfer_Admin();

	}

	public void Inbound_Admin_Call_Log_Satus_offline()
			throws InterruptedException, IOException, ParseException, java.text.ParseException {
		fetchNumber1();
		splitthewindowscreen2("Left");// login ceuserone
		new_Tab();
		SecondUserForTransfer();
		login_CE_validations();
		fetchNumber();
		Changed_Status();
		// TabSwitchToParent();
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Right");
		ThirdUser();
		login_CE_validations();
		valid_Transfer_Admin();

		TabSwitchToParent();

		transferCall_Admin_Offline();
		Thread.sleep(4000);
		TabSwitchToChild();
		// transferAssertion();////missed call will be here
		// Offline_Assertion();
		Admin_redirection();
		Telephone_Setup();
		maximizeWindow();
		Admin_Validations_Call_Offline();
		Home_Redirection();
		Call_Log_Status_Online(Offline_time);
		logout_CE_validations();
		TabSwitchToParent();

	}

	public void SelectCallGroupnumber() throws InterruptedException {
		click(CallGroupNumber);
		Thread.sleep(2000);
		Groupnumber = GetElementText(Gruopnumberfirst);
		click(Gruopnumberfirst);

//		SelectActiveDropdown(CallGroupNumber,Groupnumber);
		ExtentSuccessMessage("Successfully user Selected the 'Group Number ' " + Groupnumber);
	}

	public void Validate_Call_Group_Tab()
			throws InterruptedException, IOException, ParseException, java.text.ParseException {
		System.out.println("Strat_TC_CTI_Call_Group_Tab_Validation");
		ExtentSuccessMessage("Strat_TC_CTI_Call_Group_Tab_Validation");
		By UserNumber = By.xpath("//u[@title='Voice Number']");

		fetchNumber1();
		String Firstusernumber = GetElementText(UserNumber);
		System.out.println(Firstusernumber);
		splitthewindowscreen2("Right");// login ceuserone
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("left");
		SecondLoginUser();
		login_CE_validations();
		fetchNumber();
		String Secondusernumber = GetElementText(UserNumber);
		System.out.println(Secondusernumber);
		TabSwitchToParent();
		String Groupname = "Test_" + generateRandomText();
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToGroupCallPage();
		RefreshPage();
		Thread.sleep(25000);
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.ClickOnCreateGroupCallsTab();
		Thread.sleep(10000);
		TelephonyPage.EnterCallGroupname(Groupname);
		SelectCallGroupnumber();
		TelephonyPage.ClickOnBoardcastOption();
		TelephonyPage.ClickOnNextButton();
		TelephonyPage.EnterCallGroupmembername(Secondusernumber);
		TelephonyPage.ClickOnDoneButton();
		TelephonyPage.EnterSearchBar(Groupname);

		TabSwitchToChild();
		TelephonyPage.ClickOnCallGrouptab();
		System.out.println("Strat_TC_CTI_Call_Group_Tab_On Group");
		ExtentSuccessMessage("Strat_TC_CTI_Call_Group_Tab_On Group");
		TelephonyPage.ClickOnOnorOffSwitch(Groupname);
		System.out.println("End_TC_CTI_Call_Group_Tab_On Group");
		ExtentSuccessMessage("End_TC_CTI_Call_Group_Tab_On Group");
		ExtentSuccessMessage("***************************************************");
		System.out.println("Strat_TC_CTI_Call_Group_Tab_Miximize Group");
		ExtentSuccessMessage("Strat_TC_CTI_Call_Group_Tab_Miximize Group");
		TelephonyPage.ClickOnCallGrouptab();
		System.out.println("End_TC_CTI_Call_Group_Tab_Miximize Group");
		ExtentSuccessMessage("End_TC_CTI_Call_Group_Tab_Miximize Group");
		ExtentSuccessMessage("***************************************************");
		System.out.println("Strat_TC_CTI_Call_Group_Tab_Refresh Group");
		ExtentSuccessMessage("Strat_TC_CTI_Call_Group_Tab_Refresh Group");
		TelephonyPage.ClickOnRefreshCallGroupTab();
		System.out.println("End_TC_CTI_Call_Group_Tab_Refresh Group");
		ExtentSuccessMessage("End_TC_CTI_Call_Group_Tab_Refresh Group");

		ExtentSuccessMessage("***************************************************");
		System.out.println("Strat_TC_CTI_Call_Group_Tab_Remember_the_preference Group");
		ExtentSuccessMessage("Strat_TC_CTI_Call_Group_Tab_Remember_the_preference Group");
		TelephonyPage.ClickOnRememberthepreference();
		System.out.println("End_TC_CTI_Call_Group_Tab_Remember_the_preference Group");
		ExtentSuccessMessage("End_TC_CTI_Call_Group_Tab_Remember_the_preference Group");
		ExtentSuccessMessage("***************************************************");
		System.out.println("Strat_TC_CTI_Call_Group_Tab_Off Group");
		ExtentSuccessMessage("Strat_TC_CTI_Call_Group_Tab_Off Group");
		TelephonyPage.ClickOffbutton(Groupname);
		System.out.println("End_TC_CTI_Call_Group_Tab_Off Group");
		ExtentSuccessMessage("End_TC_CTI_Call_Group_Tab_Off Group");
		ExtentSuccessMessage("***************************************************");
		System.out.println("Strat_TC_CTI_Call_Group_Tab_Next Page Group");
		ExtentSuccessMessage("Strat_TC_CTI_Call_Group_Tab_Next Page Group");
		TelephonyPage.ClickOnNextPageCallGrouptab();
		System.out.println("End_TC_CTI_Call_Group_Tab_Next Page Group");
		ExtentSuccessMessage("End_TC_CTI_Call_Group_Tab_Next Page Group");
		ExtentSuccessMessage("***************************************************");
		System.out.println("Strat_TC_CTI_Call_Group_Tab_Previous Page Group");
		ExtentSuccessMessage("Strat_TC_CTI_Call_Group_Tab_Previous Page Group");
		TelephonyPage.ClickOnPreviousPageCallGrouptab();
		System.out.println("End_TC_CTI_Call_Group_Tab_Previous Page Group");
		ExtentSuccessMessage("End_TC_CTI_Call_Group_Tab_Previous Page Group");
		ExtentSuccessMessage("***************************************************");
		System.out.println("Strat_TC_CTI_Call_Group_Tab_Close Group");
		ExtentSuccessMessage("Strat_TC_CTI_Call_Group_Tab_Close Group");
		TelephonyPage.ClickOnCloseCallGrouptab();
		System.out.println("End_TC_CTI_Call_Group_Tab_Close Group");
		ExtentSuccessMessage("End_TC_CTI_Call_Group_Tab_Close Group");
		TabSwitchToParent();
		ClickOnDeleteGroup();
		ExtentSuccessMessage("*****************************************************************************");
		logout_CE_validations();
		TabSwitchToChild();

	}

	public void RR_BMW() throws InterruptedException, IOException {
		fetchNumber1();
		new_Tab();
		SecondUserForBC();
		new_Tab();
		ThirdUserforTransfer();

		TabSwitchToParent();

		By CallGroup = By.xpath("//a[@title='Call Groups']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		try {

			WebElement button = driver.findElement(By.xpath(
					"//span[@title='Call Group']/i[contains(.,'AutomationRRCallGroup')]/ancestor::tr/td[5]/div/a/i"));
			String buttonState = button.getAttribute("title");
			System.out.println(buttonState);
			if (buttonState.contains("On")) { // Replace with the actual state-check logic
				System.out.println("Button is On.");

			} else {
				By CallGroupName = By.xpath(
						"//span[@title='Call Group']/i[contains(.,'AutomationRRCallGroup')]/ancestor::tr/td[5]/div/a/i");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
				MoveToElementClick(element);
				ExtentSuccessMessage("Call group has been marked as on");
				Thread.sleep(5000);
			}
		} finally {
			ExtentSuccessMessage("Call Group is on");

		}

		Thread.sleep(5000);

		By Minimize = By.xpath("//i[@class='fa fa-minus']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been minimie");

		Thread.sleep(2000);
		TabSwitchToChild();

		Thread.sleep(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);

		try {

			WebElement button = driver.findElement(By.xpath(
					"//span[@title='Call Group']/i[contains(.,'AutomationRRCallGroup')]/ancestor::tr/td[5]/div/a/i"));
			String buttonState = button.getAttribute("title");
			System.out.println(buttonState);
			if (buttonState.contains("On")) { // Replace with the actual state-check logic
				System.out.println("Button is On.");

			} else {
				By CallGroupName = By.xpath(
						"//span[@title='Call Group']/i[contains(.,'AutomationRRCallGroup')]/ancestor::tr/td[5]/div/a/i");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
				MoveToElementClick(element);
				ExtentSuccessMessage("Call group has been marked as on");
				Thread.sleep(5000);
			}
		} finally {
			ExtentSuccessMessage("Call Group is on");

		}

		Thread.sleep(3000);
		By CallGroupNumber = By
				.xpath("//span[@title='Call Group']/i[contains(.,'AutomationRRCallGroup')]/parent::span/u");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupNumber));
		String number = element.getText();
		System.out.println(number);
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been minimie");

		Thread.sleep(2000);

		TabSwitchToSubChild();

		waitForElement(4000);
		By CTIInputField = By.xpath("//input[@placeholder='Enter Phone Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Number has been in input field" + number);

		Thread.sleep(3000);
		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		String SMS_Time = CurrentTime(); // stored
		System.out.println(SMS_Time);
		String smstime = removeLeadingZero(SMS_Time);
		System.out.println(smstime);

		Thread.sleep(2000);

		TabSwitchToParent();
		By IncomingCallTitle = By.xpath("//a[@title='Incoming Call Count']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(IncomingCallTitle));
		ExtentSuccessMessage("Incoming call title is been displayed for fist user");
		Thread.sleep(3000);

		TabSwitchToChild();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(IncomingCallTitle));
		ExtentSuccessMessage("Incoming call title is been displayed for Second user");
		Thread.sleep(1000);

		TabSwitchToParent();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(IncomingCallTitle));
		ExtentSuccessMessage("Incoming call title is been displayed for fist user");
		Thread.sleep(1800);

		TabSwitchToChild();
		while (true) {
            try {
                // Wait for the button to appear and be clickable
                WebElement button = wait.until(ExpectedConditions.elementToBeClickable(IncomingCallTitle));
                // Click the button
                button.click();
                System.out.println("Button clicked!");
                break; // Exit loop after successful click
            } catch (Exception e) {
                System.out.println("Button not clickable yet, retrying...");
            }
        }

		Thread.sleep(2000);
		By Groupname = By.xpath("(//div[@class='voice-call-ongoing-number cti-group-name ng-scope'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Groupname));
		String name = element.getText();
		System.out.println(name);

		String timeString = StringUtils.substringAfter(name, ": ");
		System.out.println(timeString);
		Assert.assertEquals(timeString, "AutomationRRCallGroup");

		By Number = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-incoming-window > div:nth-child(2)");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Number));
		String number1 = element.getText();
		System.out.println(number1);

		Assert.assertEquals(number1, number3);
		ExtentSuccessMessage("Assertion for incoming number is done");

		By AcceptCall = By.cssSelector("#AcceptIncomingTrigger");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Accept Call");

		String SMS_Time11 = CurrentTime(); // stored
		System.out.println(SMS_Time11);
		String smstime11 = removeLeadingZero(SMS_Time11);
		System.out.println(smstime11);

		Thread.sleep(4000);

		TabSwitchToParent();

		Thread.sleep(3000);
		By Dashboard = By.xpath("//a[@class='glyphicon fa fa-fw fa-dashboard']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Dashboard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on dashboard");

		By drop_down_telephone_setup = By.xpath("//a[@ng-click='navigateToTelephony()']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(drop_down_telephone_setup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on telephone setup dropdown");

		Thread.sleep(4000);
		By MinimizeCTI = By.xpath("//a[@title='Minimize']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MinimizeCTI));
		MoveToElementClick(element);

		Thread.sleep(2000);

		By Frame = By.xpath("//iframe[@class='ng-scope ng-isolate-scope']");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(3000);

		Thread.sleep(5000);
		By CustomerNumber = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[7]/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomerNumber));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String number2 = element.getText();
		System.out.println(number2);

		Assert.assertEquals(number2, number3);
		ExtentSuccessMessage("Assertion for Third number is done as a customer Number");

		By CallDirection = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[12]/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDirection));
//		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String direction = element.getText();
		System.out.println(direction);

		Thread.sleep(2000);
		Assert.assertEquals(direction, "Inbound");
		ExtentSuccessMessage("Assertion for Outbound Call Direction is done");

		By CallGrpName = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[14]/div/div/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGrpName));
		String callgrpname = element.getText();
		System.out.println(callgrpname);

		Assert.assertEquals(callgrpname, "AutomationRRCallGroup");
		ExtentSuccessMessage("Assertion for call group is done in Agent dashboard");

		Thread.sleep(3000);
		By Whisper = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button/i[@class='fa fa-wifi']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Whisper));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Whisper Icon");

		Thread.sleep(2000);
		WebElement popup = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='swal2-title']")));
		ExtentSuccessMessage("Assertion for Whisper popup is done");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		By WhisperCall = By.xpath("//div[@class='voice-call-window-minimized admin-action ng-scope']");
		Assert.assertTrue(driver.findElement(WhisperCall).isDisplayed());

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(8000);
		By EndWhispering = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button[@title='End Whispering']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EndWhispering));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on End Whisper Icon");

		Thread.sleep(3000);
		WebElement popup1 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='swal2-title']")));
		ExtentSuccessMessage("Assertion for Whisper popup is done after ending the call");

		ExtentSuccessMessage("---------------Whisper Completed-----------------");

		By Monitor = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button/i[@class='fa fa-eye']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Monitor));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Start Monitor Icon");

		Thread.sleep(3000);
		WebElement popup2 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='swal2-title']")));
		ExtentSuccessMessage("Assertion for Monitor popup is done");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Assert.assertTrue(driver.findElement(WhisperCall).isDisplayed());
		ExtentSuccessMessage("Monitor CTI Popup is Visible");

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(4000);
		By EndMonitoring = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button[@title='End Monitoring']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EndMonitoring));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on End Monitor Icon");

		Thread.sleep(3000);
		WebElement popup3 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='swal2-title']")));
		ExtentSuccessMessage("Assertion for Monitor popup is done after ending the call");

		ExtentSuccessMessage("---------------Monitor Completed-----------------");

		Thread.sleep(3000);
		By Barge = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Barge));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Start Barge Icon");

		Thread.sleep(3000);
		WebElement popup4 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='swal2-title']")));
		ExtentSuccessMessage("Assertion for Barge popup is done");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(WhisperCall).isDisplayed());
		ExtentSuccessMessage("Barge CTI Popup is Visible");

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(4000);
		By EndBarging = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button[@title='End Barging']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EndBarging));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on End Barging Icon");

		Thread.sleep(3000);
		WebElement popup5 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='swal2-title']")));
		ExtentSuccessMessage("Assertion for Barging popup is done after ending the call");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Thread.sleep(3000);

		By Home = By.xpath("//a[@name='menu_home']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Home Icon ");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);
		By CallGroupName = By
				.xpath("//span[@title='Call Group']/i[contains(.,'AutomationRRCallGroup')]/ancestor::tr/td[5]/div/a/i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been marked as Off");
		Thread.sleep(5000);

		logout_CE_validations();
		Thread.sleep(2000);


	}
	
	
	public String GroupnameFromDialller1() throws InterruptedException {
		String Groupname = "";
//		WaitUntillPAgeLoad();
		waitVisibility(GroupnameFromCTIDailler1);
		if (ElementDisplayed(GroupnameFromCTIDailler1)) {
			WebElement t = driver.findElement(GroupnameFromCTIDailler1);
			Groupname = t.getAttribute("title");
			System.out.println("Groupname :- " + Groupname);
		} else {

		}
		System.out.println("Groupname:-"+Groupname);
		return Groupname;
	}
	public String GroupnameFromDialller() throws InterruptedException {
		String Groupname = "";
//		WaitUntillPAgeLoad();
		waitVisibility(GroupnameFromCTIDailler);
		if (ElementDisplayed(GroupnameFromCTIDailler)) {
			WebElement t = driver.findElement(GroupnameFromCTIDailler);
			Groupname = t.getAttribute("title");
			System.out.println("Groupname :- " + Groupname);
		} else {

		}
		System.out.println("Groupname:-"+Groupname);
		return Groupname;
	}

public void BF_RL_Admin_Call_Log_Satus_Online()	throws InterruptedException, IOException, ParseException, java.text.ParseException {
		System.out.println("Start_TC_CTI_BF_RL_Transfer_To_Agent_Online_Activity_Status");
		ExtentSuccessMessage("Start_TC_CTI_BF_RL_Transfer_To_Agent_Online_Activity_Status");
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		fetchNumber1();
		String Firstusernumber = GetElementText(UserNumber);
		System.out.println(Firstusernumber);
		splitthewindowscreen2("Left");// login ceuserone
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Right");
		SecondLoginUser();
		login_CE_validations();
		fetchNumber();
		new_Tab();
		ThirdUserLogin();
		login_CE_validations();
		String Thirdusernumber = GetElementText(UserNumber);
		System.out.println(Thirdusernumber);
		TabSwitchToParent();
		String Groupname = generateRandomText();
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToGroupCallPage();
		RefreshPage();
		Thread.sleep(25000);
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.ClickOnCreateGroupCallsTab();
		Thread.sleep(10000);
		TelephonyPage.EnterCallGroupname("BF_RL_" + Groupname);

		SelectCallGroupnumber();
		TelephonyPage.ClickOnBestFitOption();
		TelephonyPage.ClickOnRinglessCheckBox();
		TelephonyPage.ClickOnNextButton();
		TelephonyPage.EnterCallGroupmembername(firstnumber);
		TelephonyPage.ClickOnDoneButton();
		TelephonyPage.EnterSearchBar("BF_RL_" + Groupname);

		TabSwitchToChild();
		TelephonyPage.ClickOnCallGrouptab();
		TelephonyPage.ClickOnOnorOffSwitch("BF_RL_" + Groupname);
		TabSwitchToParent();
		HomePage.ClickedOnMaximiseDiller();
		Thread.sleep(5000);

		CustomerEngageFunctionalityValidations.CalltoUser(Groupnumber);
		TabSwitchToChild();
		Thread.sleep(4000);
		String ActualGroupname = GroupnameFromDialller();
		Assert.assertEquals(ActualGroupname, "BF_RL_" + Groupname);
		ExtentSuccessMessage("Assertion for Group Name is done");
		transferToagentBFRinglessCall(Thirdusernumber);
		Thread.sleep(4000);

		TabSwitchToThirdWindow();
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		Thread.sleep(1000);
		System.out.println("End_TC_CTI_BF_RL_Transfer_To_Agent_Online_Activity_Status");
		ExtentSuccessMessage("End_TC_CTI_BF_RL_Transfer_To_Agent_Online_Activity_Status");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BF_RL_Transfer_To_Agent_Online_Admin_call_logs");
		ExtentSuccessMessage("Start_TC_CTI_BF_RL_Transfer_To_Agent_Online_Admin_call_logs");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		CustomerEngageFunctionalityValidations.ClickOnHomepage();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		TelephonyPage.NavigateToTelephonySetpPage();
		Thread.sleep(15000);
		TelephonyPage.ClickOnCallSMSFAXLogsManagement();
		driver.manage().window().maximize();
		RefreshPage();
		Thread.sleep(15000);
		TelephonyPage.ClickOnCallTypeFilter();
		Thread.sleep(5000);
		click(CalltypeInboundcall);
		Thread.sleep(5000);
		TelephonyPage.EnterSearchBar(Firstusernumber);
		Thread.sleep(5000);
		validateMisscalledDetails(Present_time);
		validateMisscalledDetails(Firstusernumber);
		validateMisscalledDetails(Thirdusernumber);
		System.out.println("End_TC_CTI_BF_RL_Transfer_To_Agent_Online_Admin_call_logs");
		ExtentSuccessMessage("End_TC_CTI_BF_RL_Transfer_To_Agent_Online_Admin_call_logs");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BF_RL_Transfer_To_Agent_Online_CTI_CallLogs");
		ExtentSuccessMessage("Start_TC_CTI_BF_RL_Transfer_To_Agent_Online_CTI_CallLogs");
		splitthewindowscreen2("Left");
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
			By TimeCount = By.xpath("(//span[@class='call-time-section'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
			String count = element.getText();
			System.out.println(count);
			String timeString = StringUtils.substringAfter(count, " ");
			System.out.println("---------" + timeString);
			ExtentSuccessMessage("Full Number Assertion Done");
		}
		ExtentSuccessMessage("End_TC_CTI_BF_RL_Transfer_To_Agent_Online_CTI_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");
		logout_CE_validations();
		TabSwitchToParent();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ClickOnDeleteGroup();
		logout_CE_validations();
		TabSwitchToChild();

	}

	
	public void BC_Admin_Call_Log_Satus_Online()throws InterruptedException, IOException, ParseException, java.text.ParseException {

		fetchNumber1();
		new_Tab();
		SecondUserForBC();
		new_Tab();
		ThirdUserforTransfer();

		TabSwitchToParent();

		By CallGroup = By.xpath("//a[@title='Call Groups']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);
		try {

			WebElement button = driver.findElement(By
					.xpath("//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]/ancestor::tr/td[5]/div/a/i"));
			String buttonState = button.getAttribute("title");
			System.out.println(buttonState);
			if (buttonState.contains("On")) { // Replace with the actual state-check logic
				System.out.println("Button is On.");

			} else {
				By CallGroupName = By.xpath(
						"//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]/ancestor::tr/td[5]/div/a/i");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
				MoveToElementClick(element);
				ExtentSuccessMessage("Call group has been marked as on");
				Thread.sleep(5000);
			}
		} finally {
			ExtentSuccessMessage("Call Group is on");

		}

		Thread.sleep(5000);

		By Minimize = By.xpath("//i[@class='fa fa-minus']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been minimie");

		Thread.sleep(2000);
		TabSwitchToChild();

		Thread.sleep(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);

		Thread.sleep(2000);
		try {

			WebElement button = driver.findElement(By
					.xpath("//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]/ancestor::tr/td[5]/div/a/i"));
			String buttonState = button.getAttribute("title");
			System.out.println(buttonState);
			if (buttonState.contains("On")) { // Replace with the actual state-check logic
				System.out.println("Button is On.");

			} else {
				By CallGroupName = By.xpath(
						"//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]/ancestor::tr/td[5]/div/a/i");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
				MoveToElementClick(element);
				ExtentSuccessMessage("Call group has been marked as on");
				Thread.sleep(5000);
			}
		} finally {
			ExtentSuccessMessage("Call Group is on");

		}

		Thread.sleep(3000);
		By CallGroupNumber = By.xpath("//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]/parent::span/u");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupNumber));
		String number = element.getText();
		System.out.println(number);
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been minimie");

		Thread.sleep(2000);

		TabSwitchToSubChild();

		waitForElement(4000);
		By CTIInputField = By.xpath("//input[@placeholder='Enter Phone Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Number has been in input field" + number);

		Thread.sleep(3000);
		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		String SMS_Time = CurrentTime(); // stored
		System.out.println(SMS_Time);
		String smstime = removeLeadingZero(SMS_Time);
		System.out.println(smstime);

		TabSwitchToChild();

		Thread.sleep(3000);
		By IncomingCallTitle = By.xpath("//a[@title='Incoming Call Count']");
		Assert.assertTrue(driver.findElement(IncomingCallTitle).isDisplayed());
		ExtentSuccessMessage("Incoming call ttle is been displayed for fist user");

		TabSwitchToParent();
		Assert.assertTrue(driver.findElement(IncomingCallTitle).isDisplayed());
		ExtentSuccessMessage("Incoming call ttle is been displayed for fist user");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(IncomingCallTitle));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Incoming call");

		By Groupname = By.xpath("(//div[@class='voice-call-ongoing-number cti-group-name ng-scope'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Groupname));
		String name = element.getText();
		System.out.println(name);

		String timeString = StringUtils.substringAfter(name, ": ");
		System.out.println(timeString);
		Assert.assertEquals(timeString, "AutoBroadCasting");

		By Number = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-incoming-window > div:nth-child(2)");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Number));
		String number1 = element.getText();
		System.out.println(number1);

		By AcceptCall = By.cssSelector("#AcceptIncomingTrigger");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Accept Call");

		String SMS_Time11 = CurrentTime(); // stored
		System.out.println(SMS_Time11);
		String smstime11 = removeLeadingZero(SMS_Time11);
		System.out.println(smstime11);

		Thread.sleep(4000);

		By Transfer = By.xpath("//i[@class=' fa fa-calls-transfer ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Transfer));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfer Button");

		Thread.sleep(5000);

		By AgentsTab = By.xpath("(//span[contains(.,'Agents')])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentsTab));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Agents Tab");

		Thread.sleep(4000);
		By SearchFiled = By.xpath("(//input[@value='search'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchFiled));
		MoveToElementClick(element);
		writeText(SearchFiled, profilename + Keys.ENTER);
		ExtentSuccessMessage("Name Searched for Second User to Transfer");

		Thread.sleep(3000);
		By TransferButton = By.xpath("(//span[contains(.,'" + profilename + "')])[2]/u/ancestor::span/button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfer Button");

		String SMS_Time1 = CurrentTime();
		System.out.println(SMS_Time1);
		String smstime1 = removeLeadingZero(SMS_Time1);
		System.out.println(smstime1);

		TabSwitchToChild();

		By NumberValidation = By.xpath("(//div[@class='voice-call-ongoing-number'])[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NumberValidation));
		String numbertext1 = element.getText();
		System.out.println(numbertext1);

		Assert.assertEquals(numbertext1, number3);
		ExtentSuccessMessage("Third User Number is displayed after Transfering the call from first User");

		By AcceptCallTransfer = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCallTransfer));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Accept Call Button");

		TabSwitchToParent();

		By WarmTransfer = By
				.xpath("//button[@class='voice-call-green-button-small fa fa-phone fa fa-code-fork blue-bg']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(WarmTransfer));
		MoveToElementClick(element);
		ExtentSuccessMessage("Warm Transfer has been done from first user to second user");
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(3000);

		TabSwitchToChild();

		Thread.sleep(8000);

		By DeclineCall = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DeclineCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been declined by second user");

		driver.navigate().refresh();

		Thread.sleep(15000);

		By CalLogs = By.xpath("//a[@title='Call Logs']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CalLogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call logs has been opened");
		Thread.sleep(7000);

		By TimeCount = By.xpath("(//u[@class='message-time date-txt drag-not-allowed ng-binding'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
		String count = element.getText();
		System.out.println(count);
		String timeString1 = StringUtils.substringAfter(count, " ");
		System.out.println("---------" + timeString1);
		String Formatted_Time = removeSeconds(timeString1);
		System.out.println("---------" + Formatted_Time);

		boolean isTimeMatching = areTimesMatching(SMS_Time1, Formatted_Time, 1);
		System.out.println(isTimeMatching);

		if (isTimeMatching) {
			System.out.println("Times match or are within the acceptable range.");
			ExtentSuccessMessage("Times match or are within the acceptable range.");

		} else {
			System.err.println("Times do not match.");
			ExtentErrorMessage("Times do not match.");

		}

		ExtentSuccessMessage("Assertion for missed call time is done");

		By Admin_Tile = By.xpath("//span[normalize-space()='Admin']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(8000);

		By Telephonesetup = By.xpath("//a[@href='#/admin/manage-account']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);

		Thread.sleep(5000);
		By Click_On_Viewcall = By.xpath("//button[@id='viceCallLogsBtn']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Viewcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");
		Thread.sleep(5000);

		By RecentCall = By.xpath("(//div[@class='accordion-container grid-style-height'])[1]/i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		By CreatedToday = By.xpath("//md-radio-button[@value='Created Today']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		By CallType = By.xpath("(//div[@class='accordion-container grid-style-height'])[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(2000);
		By TransferedCall = By.xpath("//md-checkbox[@name='Transferred Call']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferedCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfered Call");

		Thread.sleep(4000);

		By Direction = By.xpath("(//div[contains(.,'" + smstime1
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Direction));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		MoveToElementClick(element);
		String direction = element.getText();
		System.out.println(direction);

		Assert.assertEquals(direction, "Transferred");
		ExtentSuccessMessage("Assertion for Direction is done");

		By FromNumber = By.xpath("(//div[contains(.,'" + smstime1
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FromNumber));
		String fromnumber = element.getText();
		System.out.println(fromnumber);

		Assert.assertEquals(fromnumber, number3);
		ExtentSuccessMessage("Assertion for From Number is Done");

		By ToNumber = By.xpath("(//div[contains(.,'" + smstime1
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ToNumber));
		String tonumber = element.getText();
		System.out.println(tonumber);

		Assert.assertEquals(tonumber, secondnumber);
		ExtentSuccessMessage("Assertion for To Number is Done");

		String url = driver.getCurrentUrl();

		if (url.contains("https://mme.benefitalign.com/") && url.contains("https://ce-qa.benefitalign.com/")) {
			System.out.println("Prod");
		} else {

			Thread.sleep(4000);
			By Target = By.xpath("(//div[@title='Call Completed'])[1]");
			Base_Class.ScrollUntilElementVisible(Target);

			Thread.sleep(2000);
			By Transfered = By
					.xpath("(//div[contains(.,'" + smstime1 + "')])[14]/following-sibling::div[6] | (//div[contains(.,'"
							+ smstime1 + "')])[14]/following-sibling::div[8]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Transfered));
			js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth;", element);
			String transfered = element.getText();
			System.out.println(transfered);

//			Assert.assertEquals(transfered, "Yes");
			ExtentSuccessMessage("Assertion for To Number is Done");
		}

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);
		By CallGroupName = By
				.xpath("//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]/ancestor::tr/td[5]/div/a/i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been marked as Off");
		Thread.sleep(5000);

		logout_CE_validations();

		TabSwitchToParent();

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(6000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Viewcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(4000);
		By InboundCall = By.xpath("//md-checkbox[@name='Inbound Call']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(InboundCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on InboundCall Call");

		Thread.sleep(4000);

		By Direction1 = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Direction1));
		String direction2 = element.getText();
		System.out.println(direction2);

		Assert.assertEquals(direction2, "Inbound");
		ExtentSuccessMessage("Assertion for direction is done");

		By From1 = By.xpath("(//div[contains(.,'" + smstime11
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(From1));
		String from1 = element.getText();
		System.out.println(from1);

		Assert.assertEquals(from1, number3);
		ExtentSuccessMessage("Assertion for from number is done");

		By To1 = By.xpath("(//div[contains(.,'" + smstime11
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(To1));
		String to1 = element.getText();
		System.out.println(to1);

		Assert.assertEquals(to1, number);
		ExtentSuccessMessage("Assertion for To number is done which is call group number");

		By Target1 = By.xpath("(//div[@title='Call Completed'])[1]");
		Base_Class.ScrollUntilElementVisible(Target1);

		Thread.sleep(2000);
		By CallGroupName1 = By.xpath("(//div[contains(.,'" + smstime11 + "')])[14]/following-sibling::div[3]/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName1));
		String cgname = element.getText();
		System.out.println(cgname);

		Thread.sleep(2000);
		By CTI = By.xpath("(//i[@class='fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTI));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on CTI Button");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been marked as off");

	}

	public void BC_Admin_Call_Log_Satus_Offline()
			throws InterruptedException, IOException, ParseException, java.text.ParseException {
		System.out.println("Start_TC_CTI_BC_Transfer_To_Agent_Offline_Activity_Status");
		ExtentSuccessMessage("Start_TC_CTI_BC_Transfer_To_Agent_Offline_Activity_Status");
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		fetchNumber1();
		String Firstusernumber = GetElementText(UserNumber);
		System.out.println(Firstusernumber);
		splitthewindowscreen2("Left");// login ceuserone
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Right");
		SecondLoginUser();
		login_CE_validations();
		fetchNumber();
		new_Tab();
		ThirdUserLogin();
		login_CE_validations();
		String Thirdusernumber = GetElementText(UserNumber);
		System.out.println(Thirdusernumber);
		Changed_Status();
		TabSwitchToParent();
		String Groupname = generateRandomText();
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToGroupCallPage();
		RefreshPage();
		Thread.sleep(25000);
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.ClickOnCreateGroupCallsTab();
		Thread.sleep(10000);
		TelephonyPage.EnterCallGroupname("BC_" + Groupname);

		SelectCallGroupnumber();
		TelephonyPage.ClickOnBoardcastOption();
		TelephonyPage.ClickOnNextButton();
		TelephonyPage.EnterCallGroupmembername(firstnumber);
		// TelephonyPage.EnterCallGroupmembername(Session1_Number);
		TelephonyPage.ClickOnDoneButton();
		TelephonyPage.EnterSearchBar("BC_" + Groupname);

		TabSwitchToChild();
		TelephonyPage.ClickOnCallGrouptab();
		TelephonyPage.ClickOnOnorOffSwitch("BC_" + Groupname);
		TabSwitchToParent();
		HomePage.ClickedOnMaximiseDiller();
		Thread.sleep(5000);
		CustomerEngageFunctionalityValidations.CalltoUser(Groupnumber);
		TabSwitchToChild();
		RefreshPage();
		Thread.sleep(8000);
		TelephonyPage.ClickOnIncomingCallNotification();
		transferToagentCall(Thirdusernumber);
		TabSwitchToThirdWindow();
		ExtentSuccessMessage("*******Start Missed call On SSE_notification Tab***************");
		By MissedsmsPopup = By.xpath("//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight']");
		if (ElementDisplayed(MissedsmsPopup)) {
			Assert.assertTrue(driver.findElement(MissedsmsPopup).isDisplayed());
			ExtentSuccessMessage("Successfully user able to See the 'Missed Call Popup' ");
		} else {
			ExtentErrorMessage("UNSuccessfully user not able to See the 'Missed Call Popup' ");
		}
		ExtentSuccessMessage("Assertion for missed SMS popup is done");
		ExtentSuccessMessage("*******End Inbound SMS On SSE_notification Tab***************");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("End_TC_CTI_BC_Transfer_To_Agent_Offline_Activity_Status");
		ExtentSuccessMessage("End_TC_CTI_BC_Transfer_To_Agent_Offline_Activity_Status");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BC_Transfer_To_Agent_Offline_Admin_call_logs");
		ExtentSuccessMessage("Start_TC_CTI_BC_Transfer_To_Agent_Offline_Admin_call_logs");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		CustomerEngageFunctionalityValidations.ClickOnHomepage();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
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
		validateMisscalledDetails(Present_time);
		validateMisscalledDetails(Firstusernumber);
		validateMisscalledDetails(Thirdusernumber);
		System.out.println("End_TC_CTI_BC_Transfer_To_Agent_Offline_Admin_call_logs");
		ExtentSuccessMessage("End_TC_CTI_BC_Transfer_To_Agent_Offline_Admin_call_logs");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BC_Transfer_To_Agent_Offline_CTI_CallLogs");
		ExtentSuccessMessage("Start_TC_CTI_BC_Transfer_To_Agent_Offline_CTI_CallLogs");
		splitthewindowscreen2("Left");
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
			By TimeCount = By.xpath("(//span[@class='call-time-section'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
			String count = element.getText();
			System.out.println(count);
			String timeString = StringUtils.substringAfter(count, " ");
			System.out.println("---------" + timeString);
			ExtentSuccessMessage("Full Number Assertion Done");
		}
		ExtentSuccessMessage("End_TC_CTI_BC_Transfer_To_Agent_Offline_CTI_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");
		logout_CE_validations();
		TabSwitchToParent();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ClickOnDeleteGroup();
		logout_CE_validations();
		TabSwitchToChild();

	}

	public void BC_Admin_Call_Log_Satus_BeRight_Back()
			throws InterruptedException, IOException, ParseException, java.text.ParseException {
		System.out.println("Start_TC_CTI_BC_Transfer_To_Agent_BeRight_Back_Activity_Status");
		ExtentSuccessMessage("Start_TC_CTI_BC_Transfer_To_Agent_BeRight_Back_Activity_Status");
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		fetchNumber1();
		String Firstusernumber = GetElementText(UserNumber);
		System.out.println(Firstusernumber);
		splitthewindowscreen2("Left");// login ceuserone
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Right");
		SecondLoginUser();
		login_CE_validations();
		fetchNumber();
		new_Tab();
		ThirdUserLogin();
		login_CE_validations();
		String Thirdusernumber = GetElementText(UserNumber);
		System.out.println(Thirdusernumber);
		Changed_Status();
		TabSwitchToParent();
		String Groupname = generateRandomText();
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToGroupCallPage();
		RefreshPage();
		Thread.sleep(25000);
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.ClickOnCreateGroupCallsTab();
		Thread.sleep(10000);
		TelephonyPage.EnterCallGroupname("BC_" + Groupname);

		SelectCallGroupnumber();
		TelephonyPage.ClickOnBoardcastOption();
		TelephonyPage.ClickOnNextButton();
		TelephonyPage.EnterCallGroupmembername(firstnumber);
		// TelephonyPage.EnterCallGroupmembername(Session1_Number);
		TelephonyPage.ClickOnDoneButton();
		TelephonyPage.EnterSearchBar("BC_" + Groupname);

		TabSwitchToChild();
		TelephonyPage.ClickOnCallGrouptab();
		TelephonyPage.ClickOnOnorOffSwitch("BC_" + Groupname);
		TabSwitchToParent();
		HomePage.ClickedOnMaximiseDiller();
		Thread.sleep(5000);
		CustomerEngageFunctionalityValidations.CalltoUser(Groupnumber);
		TabSwitchToChild();
		RefreshPage();
		Thread.sleep(8000);
		TelephonyPage.ClickOnIncomingCallNotification();
		transferToagentCall(Thirdusernumber);
		TabSwitchToThirdWindow();
		ExtentSuccessMessage("*******Start Missed call On SSE_notification Tab***************");
		By MissedsmsPopup = By.xpath("//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight']");
		if (ElementDisplayed(MissedsmsPopup)) {
			Assert.assertTrue(driver.findElement(MissedsmsPopup).isDisplayed());
			ExtentSuccessMessage("Successfully user able to See the 'Missed Call Popup' ");
		} else {
			ExtentErrorMessage("Unsuccessfully user not able to See the 'Missed Call Popup' ");
		}
		ExtentSuccessMessage("Assertion for missed SMS popup is done");
		ExtentSuccessMessage("*******End Inbound SMS On SSE_notification Tab***************");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("End_TC_CTI_BC_Transfer_To_Agent_BeRight_Back_Activity_Status");
		ExtentSuccessMessage("End_TC_CTI_BC_Transfer_To_Agent_BeRight_Back_Activity_Status");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BC_Transfer_To_Agent_BeRight_Back_Admin_call_logs");
		ExtentSuccessMessage("Start_TC_CTI_BC_Transfer_To_Agent_BeRight_Back_Admin_call_logs");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		CustomerEngageFunctionalityValidations.ClickOnHomepage();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
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
		validateMisscalledDetails(Present_time);
		validateMisscalledDetails(Firstusernumber);
		validateMisscalledDetails(Thirdusernumber);
		System.out.println("End_TC_CTI_BC_Transfer_To_Agent_BeRight_Back_Admin_call_logs");
		ExtentSuccessMessage("End_TC_CTI_BC_Transfer_To_Agent_BeRight_Back_Admin_call_logs");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BC_Transfer_To_Agent_BeRight_Back_CTI_CallLogs");
		ExtentSuccessMessage("Start_TC_CTI_BC_Transfer_To_Agent_BeRight_Back_CTI_CallLogs");
		splitthewindowscreen2("Left");
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
			By TimeCount = By.xpath("(//span[@class='call-time-section'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
			String count = element.getText();
			System.out.println(count);
			String timeString = StringUtils.substringAfter(count, " ");
			System.out.println("---------" + timeString);
			ExtentSuccessMessage("Full Number Assertion Done");
		}
		ExtentSuccessMessage("End_TC_CTI_BC_Transfer_To_Agent_BeRight_Back_CTI_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");
		logout_CE_validations();
		TabSwitchToParent();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ClickOnDeleteGroup();
		logout_CE_validations();
		TabSwitchToChild();

	}

	public void Custom() throws InterruptedException, IOException, ParseException {
		fetchNumber1();
		splitthewindowscreen2("Left");// login ceuserone
		new_Tab();
		SecondUserForTransfer();
		login_CE_validations();
		fetchNumber();
		Changed_Status_Custom();
		// TabSwitchToParent();
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Right");
		ThirdUser();
		login_CE_validations();
		valid_Transfer_Admin();

		TabSwitchToParent();

		transferCall_Admin_Offline();
		Thread.sleep(4000);
		TabSwitchToChild();
		// transferAssertion();////missed call will be here
		// Offline_Assertion();
		Admin_redirection();
		Telephone_Setup();
		maximizeWindow();
		Admin_Validations_Call_Offline();
		logout_CE_validations();
		TabSwitchToParent();
	}

	public void Custom_Status() throws InterruptedException, IOException, ParseException, java.text.ParseException {

		fetchNumber1();
		new_Tab();
		SecondUserForTransfer();
		new_Tab();
		ThirdUserforTransfer();
		transfer_BRB_CustomMessage();

	}

	public void Out_Bound_Transfer()
			throws InterruptedException, IOException, ParseException, java.text.ParseException {

		fetchNumber1();
		new_Tab();
		SecondUserForTransfer();
		new_Tab();
		ThirdUserforTransfer();
		transfer_Outbound_Online_Offline();

	}

	public void Out_Bound_Transfer_Offline()
			throws InterruptedException, IOException, ParseException, java.text.ParseException {
		fetchNumber1();
		splitthewindowscreen2("Left");// login ceuserone
		new_Tab();
		SecondUserForTransfer();
		login_CE_validations();
		Fetch_Profile_Name();
		fetchNumber();
		Changed_Status();
		// TabSwitchToParent();
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Right");
		ThirdUser();
		login_CE_validations();
		fetchNumber_3();

		TabSwitchToParent();
		Outbound_valid_Transfer_Admin();
		TabSwitchToSubChild();
		Accept_Call();
		TabSwitchToParent();
		Outbound_transferCall_Admin_Offline();
		ExtentSuccessMessage(
				"**********************Outbound offline transfer Activity status *********************************");

		TabSwitchToChild();
		Admin_redirection();
		Telephone_Setup();
		maximizeWindow();
		Admin_Validations_Call_Offline();
		ExtentSuccessMessage(
				"**********************Outbound offline transfer AdminCall log status *********************************");

		Home_Redirection();
		Call_Log_Status_OFfline(Offline_time);
		ExtentSuccessMessage(
				"**********************Outbound online transfer Cti Call Log  status *********************************");

		logout_CE_validations();
		TabSwitchToParent();

	}

	public void Out_Bound_Transfer_BRB_Custom()
			throws InterruptedException, IOException, ParseException, java.text.ParseException {

		fetchNumber1();
		new_Tab();
		SecondUserForTransfer();
		new_Tab();
		ThirdUserforTransfer();
		outbound_transfer_BRB_Custom();

	}

	public void dashboard_Filters() throws InterruptedException, IOException {

		fetchNumber1();
		new_Tab();
		SecondUserForBC();
		new_Tab();
		ThirdUserforTransfer();

		TabSwitchToChild();

		By CallGroup = By.xpath("//a[@title='Call Groups']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);

		By CallGroupNamee = By.xpath("//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupNamee));
		MoveToElementClick(element);
		String call = element.getText();
		System.out.println(call);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(3000);
		By CallGroupName = By
				.xpath("//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]/ancestor::tr/td[5]/div/a/i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been marked as on");
		Thread.sleep(5000);

		TabSwitchToSubChild();

		waitForElement(2000);
		By CTIInputField = By.xpath("//input[@placeholder='Enter Phone Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, secondnumber);
		ExtentSuccessMessage("Number has been in input field" + firstnumber);

		Thread.sleep(3000);
		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		String SMS_Time = CurrentTime(); // stored
		System.out.println(SMS_Time);
		String smstime = removeLeadingZero(SMS_Time);
		System.out.println(smstime);

		TabSwitchToChild();

		Thread.sleep(4000);
		By NumberValidation = By.xpath("(//div[@class='voice-call-ongoing-number'])[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NumberValidation));
		String numbertext = element.getText();
		System.out.println(numbertext);

		Assert.assertEquals(numbertext, number3);
		ExtentSuccessMessage("Second User Number is displayed after initiating ther call");

		By AcceptCall = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Accepted by first user");

		Thread.sleep(2000);

		TabSwitchToParent();

		Thread.sleep(3000);
		By Dashboard = By.xpath("//a[@class='glyphicon fa fa-fw fa-dashboard']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Dashboard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on dashboard");

		By drop_down_telephone_setup = By.xpath("//a[@ng-click='navigateToTelephony()']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(drop_down_telephone_setup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on telephone setup dropdown");

		Thread.sleep(4000);
		By Minimize = By.xpath("//a[@title='Minimize']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
		MoveToElementClick(element);

		By Frame = By.xpath("//iframe[@id='angularIframe']");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(2000);
		By Filters = By.xpath("//a[@id='advancedSearch']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Filters));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on filter button");

		Thread.sleep(2000);

		By Agent = By.xpath("//ng-select[@placeholder='Select Agent']/div/div/div/input");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Agent));
		MoveToElementClick(element);
		writeText(Agent, profilename + Keys.ENTER);
		ExtentSuccessMessage("Clicked on Agent Filter");

		Thread.sleep(3000);

		By Status = By.cssSelector(
				"body > app-root > app-telephony-dashboard > div.container.text-center.top_zero > div > div > div.white_bg_section.float-start.mt-2.advancedSearch_section.mb-3 > app-telephony-filter > div:nth-child(2) > div > ng-select > div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Status));
		click(Status);
		ExtentSuccessMessage("Clicked on Agent Status");

		Thread.sleep(1000);
		By InCall = By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div[2]/div[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(InCall));
		String statuss = element.getText();
		System.out.println(statuss);
		MoveToElementClick(element);
		ExtentSuccessMessage("Agent Status has been selected");

		Thread.sleep(2000);

		By Apply = By.xpath("//a[@class='small-primary-btn float-start advancedSearch']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Apply));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Apply Button");

		Thread.sleep(2000);
		By AgentValidation = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentValidation));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String agent = element.getText();
		System.out.println(agent);

		Assert.assertEquals(agent, profilename);
		ExtentSuccessMessage("Validation for Agent name is done");

		Thread.sleep(3000);
		By CTIStaus = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIStaus));
		String status = element.getText();
		System.out.println(status);

		By Save = By.xpath("//a[@class='small-btn float-start cancelSearch green-btn']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Save));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Save Button");

		Thread.sleep(2000);
		By FilterName = By.xpath("//input[@placeholder='Filter Name']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FilterName));
		MoveToElementClick(element);
		String filtername = "AutoFilter";
		writeText(FilterName, filtername);
		ExtentSuccessMessage("Filter name has been entered");

		Thread.sleep(3000);
		By SaveFilter = By.xpath("//button[@class='p-element lg-btn half_width_btn p-button p-component']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SaveFilter));
		MoveToElementClick(element);
		ExtentSuccessMessage("Filter has been saved");

		Thread.sleep(5000);

		try {
			WebElement Agent1 = driver.findElement(By.xpath("(//label[contains(.,'Agent')])[1]"));

			if (Agent1.isDisplayed()) {
				By Clear = By.xpath("//a[@class='small-btn float-start cancelSearch']");
				click(Clear);
				ExtentSuccessMessage("Clicked on clear button");
			} else {

				Thread.sleep(4000);
				By Filter = By.cssSelector("#advancedSearch");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Filter));
				click(Filter);
				ExtentSuccessMessage("Clicked on filter button");

				Thread.sleep(2000);
				By Clear = By.xpath("//a[@class='small-btn float-start cancelSearch']");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Clear));
				MoveToElementClick(element);
				ExtentSuccessMessage("Clicked on Clear filter button");
			}
		} catch (NoSuchElementException e) {
			ExtentSuccessMessage("Filter has been saved");
		}

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentValidation));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String agent1 = element.getText();
		System.out.println(agent1);
		ExtentSuccessMessage("After clicking clear dashboard is in normal status");

		Thread.sleep(3000);
		By SavedFilter = By.xpath("//a[@class='dropdown-toggle white_btn btn_with_arrow ng-star-inserted']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SavedFilter));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Save Filter Button");

		Thread.sleep(3000);
		By FilterNamee = By.xpath("//span[contains(.,'" + filtername + "')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FilterNamee));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Filter which is Saved");

		Thread.sleep(4000);

		Thread.sleep(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentValidation));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String agent2 = element.getText();
		System.out.println(agent2);

		Assert.assertEquals(agent2, profilename);
		ExtentSuccessMessage("Validation for Agent name is done after aplying filter");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIStaus));
		String status1 = element.getText();
		System.out.println(status1);

		Assert.assertEquals(status1, statuss);
		ExtentSuccessMessage("Validation for Agent CTI Status is done after aplying filter");

		Thread.sleep(4000);
		By CallGroupDD = By.xpath("//ng-select[@placeholder='Select Call group']/div/div/div/input");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupDD));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		click(CallGroupDD);
		writeText(CallGroupDD, call + Keys.ENTER);
		ExtentSuccessMessage("Clicked on CallGroupDD");

		Thread.sleep(3000);
		By Applyy = By.xpath("//a[@class='small-primary-btn float-start advancedSearch']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Applyy));
		click(Applyy);
		ExtentSuccessMessage("Click on Apply Button");

		Thread.sleep(3000);
		By ActiveCallGrp = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[14]/div/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ActiveCallGrp));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String callgrp = element.getText();
		System.out.println(callgrp);

		Assert.assertEquals(callgrp, call);
		ExtentSuccessMessage("Clicked On Acive call Group");

		Thread.sleep(3000);
		By Update = By.xpath("//a[@class='small-btn float-start cancelSearch green-btn']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Update));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Update Button");

		Thread.sleep(2000);
		By UpdatePopup = By.xpath("//h2[@class='swal2-title']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UpdatePopup));
		ExtentSuccessMessage("Update popup is displayed");

		Thread.sleep(3000);
		By Clear = By.xpath("//a[@class='small-btn float-start cancelSearch']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Clear));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Clear filter button");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SavedFilter));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Save Filter Button");

		Thread.sleep(2000);
		By DeleteFilter = By.xpath("//span[contains(.,'AutoFilter')]/ancestor::li/span[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DeleteFilter));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Delete Filter Button");

		Thread.sleep(3000);
		By Yes = By.xpath("//button[@class='p-element lg-btn half_width_btn p-button p-component']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Yes));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Delete Filter Yes Button");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UpdatePopup));
		ExtentSuccessMessage("Delete Filter popup is displayed");

		TabSwitchToChild();

		driver.navigate().refresh();
		Thread.sleep(5000);

		TabSwitchToSubChild();

		driver.navigate().refresh();
		Thread.sleep(5000);

		TabSwitchToParent();

		Thread.sleep(2000);

		Random r = new Random();
		int randomNumber = ThreadLocalRandom.current().nextInt(1, 5);
		int randomNumber1 = generateAnotherRandomNumber(randomNumber);

		System.out.println(randomNumber);
		System.out.println(randomNumber1);

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(2000);
		By Configuration = By.xpath("//a[@class='white_btn']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Configuration));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Configuration Button");

		Thread.sleep(3000);
		By ClearAll = By.xpath("//a[@class='clearLink']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClearAll));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on ClearAll Button");

		Thread.sleep(2000);
		By Tiles = By.xpath("(//div[@class='filters_body']/div/input)[" + randomNumber + "]/../label");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Tiles));
		MoveToElementClick(element);
		String tile = element.getText();
		System.out.println(tile);
		ExtentSuccessMessage("Clicked on Tiles");

		By Tiles1 = By.xpath("(//div[@class='filters_body']/div/input)[" + randomNumber1 + "]/../label");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Tiles1));
		MoveToElementClick(element);
		String tile1 = element.getText();
		System.out.println(tile1);
		ExtentSuccessMessage("Clicked on Tiles");

		Thread.sleep(2000);
		By ApplyTiles = By.xpath("//a[@class='submitLink']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ApplyTiles));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Apply Tiles");

		Thread.sleep(3000);
		By TilesAss = By.xpath("//span[contains(.,'" + tile + "')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TilesAss));
		ExtentSuccessMessage("" + tile + " is been displayed");

		Thread.sleep(3000);
		By TilesAss1 = By.xpath("//span[contains(.,'" + tile1 + "')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TilesAss1));
		ExtentSuccessMessage("" + tile1 + " is been displayed");

		Thread.sleep(3000);
		By CallAgent = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button[@title='Call']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAgent));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Agent Button");

		TabSwitchToChild();

		Thread.sleep(4000);
		By NumberValid = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-incoming-window > div.voice-call-ongoing-number > span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NumberValid));
		String text = element.getText();
		System.out.println(text);

		Assert.assertEquals(text, firstnumber);
		ExtentSuccessMessage("Assertion for number is done");

		Thread.sleep(4000);
		By AcceptCall1 = By.cssSelector("#AcceptIncomingTrigger");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall1));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Accept Button");

		TabSwitchToParent();

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIStaus));
		String status2 = element.getText();
		System.out.println(status2);

		By CustomerNumber = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[7]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomerNumber));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String customer = element.getText();
		System.out.println(customer);

		Assert.assertEquals(customer, firstnumber);
		ExtentSuccessMessage("Assertion for number is done in Dashboard");

		Thread.sleep(4000);

		By EndCall = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EndCall));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call End Button");
		Thread.sleep(2000);

		TabSwitchToChild();

		driver.navigate().refresh();
		Thread.sleep(9000);
		TabSwitchToParent();

		Thread.sleep(4000);

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(4000);
		By TurnOffline = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TurnOffline));
		MoveToElementClick(element);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		ExtentSuccessMessage("Clicked on Turn offline Button");

		Thread.sleep(2000);
		By Yes1 = By.cssSelector(
				"body > p-dynamicdialog > div > div > div.p-dialog-content.ng-tns-c7-2 > app-dynamicmodal > div > button.p-element.lg-btn.half_width_btn.p-button.p-component.ng-star-inserted");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Yes1));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Yes offline Button");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UpdatePopup));
		ExtentSuccessMessage("Agent offline popup is visible");

		Thread.sleep(5000);
		By OfflineValid = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(OfflineValid));
		String offline = element.getText();
		System.out.println(offline);

		Assert.assertEquals(offline, "Offline");
		ExtentSuccessMessage("Assertion for offline iws done in dsahboard");

		Thread.sleep(2000);
		driver.switchTo().defaultContent();

		logout_CE_validations();

		TabSwitchToChild();

		By Offlinee = By.xpath("//span[@class='status OFFLINE']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Offlinee));
		ExtentSuccessMessage("User is been turned into offline mode");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);
		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been marked as off");

	}

	public static int generateAnotherRandomNumber(int exclude) {
		int number;
		do {
			number = (int) (Math.random() * 5) + 1;
		} while (number == exclude);
		return number;
	}

	public void outbound_transfer_BRB_Custom() throws InterruptedException, ParseException {

		TabSwitchToChild();

		Thread.sleep(4000);
		By Profile = By.xpath("//div[@class='profile']/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Profile));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Profile button");

		Thread.sleep(2000);
		By Offline = By.xpath("(//span[contains(.,'Be Right Back')])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Offline));
		MoveToElementClick(element);
		String brb = element.getText();
		System.out.println(brb);
		ExtentSuccessMessage("Clicked on Be Right Back Status");

		Thread.sleep(6000);
		By DashBoard = By.xpath("//a[@class='glyphicon fa fa-fw fa-dashboard']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DashBoard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Dashboard Tile");

		By AgentDashBoard = By.xpath("//a[contains(.,'Agent Dashboard')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentDashBoard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on AgentDashBoard Tile");

		Thread.sleep(8000);
		By Frame = By.xpath("//iframe[@class='ng-scope ng-isolate-scope']");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(3000);
		By CTIStatus = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[2]/div/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIStatus));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		Thread.sleep(2000);
		String ctistatusoffline = element.getText();
		System.out.println(ctistatusoffline);

		Thread.sleep(4000);
		Assert.assertEquals(ctistatusoffline, "Be Right Back");
		ExtentSuccessMessage("Agent Status is displaying as Offline in dashboard After Changing Status as offline");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Thread.sleep(2000);
		By Home_Redirection = By.xpath("//a[@id='menu_home']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home_Redirection));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on the home button");

		TabSwitchToParent();

		waitForElement(4000);
		By CTIInputField = By.xpath("//input[@placeholder='Enter Phone Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number3);
		ExtentSuccessMessage("Number has been in input field" + firstnumber);

		Thread.sleep(3000);
		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		String SMS_Time = CurrentTime();
		System.out.println(SMS_Time);
		String smstime = removeLeadingZero(SMS_Time);
		System.out.println(smstime);

		TabSwitchToSubChild();

		Thread.sleep(8000);
		By NumberValidation = By.xpath("(//div[@class='voice-call-ongoing-number'])[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NumberValidation));
		String numbertext = element.getText();
		System.out.println(numbertext);

		Assert.assertEquals(numbertext, firstnumber);
		ExtentSuccessMessage("Third User Number is displayed after initiating ther call");

		By AcceptCall = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Accepted by first user");

		TabSwitchToParent();
		Thread.sleep(2000);

		By TransferCall = By.xpath("//i[@class=' fa fa-calls-transfer ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfer Call By First User");

		Thread.sleep(3000);
		By Inputt = By.xpath("(//input[@placeholder=' Enter Phone Number or Click the icon '])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Inputt));
		MoveToElementClick(element);
		writeText(Inputt, secondnumber);
		ExtentSuccessMessage("Entered Second User Number for Transfer");

		Thread.sleep(4000);
		By CallTransfer = By
				.cssSelector("#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransfer));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Transfer Button");

		String SMS_Time1 = CurrentTime();
		System.out.println(SMS_Time1);
		String smstime1 = removeLeadingZero(SMS_Time1);
		System.out.println(smstime1);

		TabSwitchToChild();

		Thread.sleep(1000);
		By MissedCallSSE = By.cssSelector("body > div.col-xs-11.col-sm-3.alert.alert-pastel-info.animated.fadeInRight");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCallSSE));
		Assert.assertTrue(driver.findElement(MissedCallSSE).isDisplayed());
		ExtentSuccessMessage("SSE Notification For Transfered call is diaplayed");

		By CalLogs = By.xpath("//a[@title='Call Logs']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CalLogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call logs has been opened");
		Thread.sleep(2000);

		By TimeCount = By.xpath("(//u[@class='message-time date-txt drag-not-allowed ng-binding'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
		String count = element.getText();
		System.out.println(count);
		String timeString = StringUtils.substringAfter(count, " ");
		System.out.println("---------" + timeString);
		String Formatted_Time = removeSeconds(timeString);
		System.out.println("---------" + Formatted_Time);

		boolean isTimeMatching = areTimesMatching(SMS_Time1, Formatted_Time, 1);
		System.out.println(isTimeMatching);

		if (isTimeMatching) {
			System.out.println("Times match or are within the acceptable range.");
			ExtentSuccessMessage("Times match or are within the acceptable range.");

		} else {
			System.err.println("Times do not match.");
			ExtentErrorMessage("Times do not match.");

		}

		Thread.sleep(3000);
		By MissedCalllogs = By.xpath("//a[@title='Missed Calls']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCalllogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Misswd Call Section");

		Thread.sleep(6000);
		By MissedCallTime = By.xpath("//u[contains(.,'" + smstime1 + "')]");
		System.out.println(MissedCallTime);
		Assert.assertTrue(driver.findElement(MissedCallTime).isDisplayed());
		ExtentSuccessMessage("Assertion for Offline Missed call is done");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		Thread.sleep(2000);
		By Admin_Tile = By.xpath("//span[normalize-space()='Admin']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(8000);

		By Telephonesetup = By.xpath("//a[@href='#/admin/manage-account']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);

		Thread.sleep(5000);
		By Click_On_Viewcall = By.xpath("//button[@id='viceCallLogsBtn']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Viewcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");
		Thread.sleep(5000);

		By RecentCall = By.xpath("(//div[@class='accordion-container grid-style-height'])[1]/i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		By CreatedToday = By.xpath("//md-radio-button[@value='Created Today']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		By CallType = By.xpath("(//div[@class='accordion-container grid-style-height'])[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(2000);
		By TransferedCall = By.xpath("//md-checkbox[@name='Missed Call,Missed Call Group']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferedCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfered Call");

		Thread.sleep(4000);

		By Direction = By.xpath("(//div[contains(.,'" + smstime1
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Direction));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		MoveToElementClick(element);
		String direction = element.getText();
		System.out.println(direction);

		Assert.assertEquals(direction, "Missed");
		ExtentSuccessMessage("Assertion for Direction is done");

		By FromNumber = By.xpath("(//div[contains(.,'" + smstime1
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FromNumber));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String fromnumber = element.getText();
		System.out.println(fromnumber);

		Assert.assertEquals(fromnumber, number3);
		ExtentSuccessMessage("Assertion for From Number is Done");

		By ToNumber = By.xpath("(//div[contains(.,'" + smstime1
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ToNumber));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String tonumber = element.getText();
		System.out.println(tonumber);

		Assert.assertEquals(tonumber, secondnumber);
		ExtentSuccessMessage("Assertion for To Number is Done");

		TabSwitchToParent();
		driver.navigate().refresh();
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(6000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Viewcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(4000);
		By OutboundCall = By.xpath("//md-checkbox[@name='Outbound Call']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(OutboundCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on InboundCall Call");

		Thread.sleep(4000);

		By Direction1 = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Direction1));
		String direction2 = element.getText();
		System.out.println(direction2);

		Assert.assertEquals(direction2, "Outbound");
		ExtentSuccessMessage("Assertion for direction is done");

		By From1 = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(From1));
		String from1 = element.getText();
		System.out.println(from1);

		Assert.assertEquals(from1, firstnumber);
		ExtentSuccessMessage("Assertion for from nuber is done");

		By To1 = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(To1));
		String to1 = element.getText();
		System.out.println(from1);

		Assert.assertEquals(to1, number3);
		ExtentSuccessMessage("Assertion for To number is done");

		By CDRID = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[1]/div/a");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CDRID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on CDR ID");

		Thread.sleep(15000);

		By CallFrom = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[1]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallFrom));
		String callfrom = element.getText();
		System.out.println(callfrom);

		Assert.assertEquals(callfrom, firstnumber);
		ExtentSuccessMessage("Assertion for CallFrom is done in CDR");

		By CallTo = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[2]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTo));
		String callto = element.getText();
		System.out.println(callto);

		Assert.assertEquals(callto, number3);
		ExtentSuccessMessage("Assertion for CallTo is done in CDR");

		By CallTypee = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[3]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTypee));
		String calltype = element.getText();
		System.out.println(calltype);

		Assert.assertEquals(calltype, "Outgoing Call");
		ExtentSuccessMessage("Assertion for Call Type is done in CDR");

		By CallStatus = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[4]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallStatus));
		String callstatus = element.getText();
		System.out.println(callstatus);

		Assert.assertEquals(callstatus, "Completed");
		ExtentSuccessMessage("Assertion for Call Status is done in CDR");

		By SID = By.xpath("//div[@class='col-lg-3 col-md-3 col-sm-6 col-xs-12']/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SID));
		String sid = element.getText();
		System.out.println(sid);

		By Typee = By.xpath("//span[contains(.,'" + number3 + "')]/ancestor::tr/td[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Typee));
		System.out.println(Typee);
		String type = element.getText();
		System.out.println(type);

		Assert.assertEquals(type, "Callee");
		ExtentSuccessMessage("Assertion for Caller type is Done");

		By Type2 = By.xpath("//span[contains(.,'" + username + "')]/ancestor::tr/td[2]");
		System.out.println(Type2);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Type2));
		String type2 = element.getText();
		System.out.println(type2);

		Assert.assertEquals(type2, "Caller");
		ExtentSuccessMessage("Assertion for Caller type is Done");

		driver.navigate().back();
		Thread.sleep(5000);

		ExtentSuccessMessage("----------Outbound BeRightBackTransferCompleted--------");

		TabSwitchToSubChild();

		driver.navigate().refresh();

		Thread.sleep(4000);

		TabSwitchToParent();

		driver.navigate().refresh();

		Thread.sleep(4000);
		TabSwitchToChild();

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home_Redirection));
		MoveToElementClick(element);
		Thread.sleep(2000);
		ExtentSuccessMessage("Clicked on the home button");

		Thread.sleep(4000);
		By CTILogo = By.cssSelector("#topNavbarMain > ul > li.nav-item.ng-scope > a");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTILogo));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on CTI logo button");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DashBoard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Dashboard Tile");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentDashBoard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on AgentDashBoard Tile");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Profile));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Profile button");

		Thread.sleep(2000);
		By CustomMessage = By.xpath("(//span[contains(.,'AutoStatus')])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomMessage));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Offline Status");

		Thread.sleep(5000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIStatus));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		Thread.sleep(2000);
		String ctistatusauto = element.getText();
		System.out.println(ctistatusauto);

		Thread.sleep(4000);
		Assert.assertEquals(ctistatusauto, "AutoStatus");
		ExtentSuccessMessage("Agent Status is displaying as Offline in dashboard After Changing Status as offline");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home_Redirection));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on the home button");

		TabSwitchToParent();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number3);
		ExtentSuccessMessage("Number has been in input field" + number3);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		String SMS_Offline = CurrentTime();
		System.out.println(SMS_Offline);
		String smstoffline = removeLeadingZero(SMS_Offline);
		System.out.println(smstoffline + "------Offlinetime");

		TabSwitchToSubChild();

		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Accepted by Third user");

		TabSwitchToParent();
		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfer Call By First User");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Inputt));
		MoveToElementClick(element);
		writeText(Inputt, secondnumber);
		ExtentSuccessMessage("Entered Second User Number for Transfer");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransfer));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Transfer Button");

		String SMS_Offline2 = CurrentTime();
		System.out.println(SMS_Offline2);
		String smstoffline2 = removeLeadingZero(SMS_Offline2);
		System.out.println(smstoffline2 + "------Offlinetime");

		TabSwitchToChild();

		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCallSSE));
		Assert.assertTrue(driver.findElement(MissedCallSSE).isDisplayed());
		ExtentSuccessMessage("SSE Notification For Transfered call is diaplayed");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CalLogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call logs has been opened");
		Thread.sleep(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
		String count1 = element.getText();
		System.out.println(count1);
		String timeString1 = StringUtils.substringAfter(count1, " ");
		System.out.println("---------" + timeString);
		String Formatted_Time1 = removeSeconds(timeString1);
		System.out.println("---------" + Formatted_Time1);

		waitForElement(8000);
		Assert.assertTrue(SMS_Offline2.contains(Formatted_Time1));
		ExtentSuccessMessage("Assertion for call log is done for Offline User");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCalllogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Misswd Call Section");

		Thread.sleep(6000);
		By MissedCallTime1 = By.xpath("//u[contains(.,'" + smstoffline2 + "')]");
		Assert.assertTrue(driver.findElement(MissedCallTime1).isDisplayed());
		ExtentSuccessMessage("Assertion for Offline Missed call is done");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(6000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Viewcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(4000);
		By MissedCall = By.xpath("//md-checkbox[@name='Missed Call,Missed Call Group']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MissedCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfered Call");

		Thread.sleep(4000);

		By Directionn = By.xpath("(//div[contains(.,'" + smstoffline2
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Directionn));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		MoveToElementClick(element);
		String direction1 = element.getText();
		System.out.println(direction1);

		Assert.assertEquals(direction1, "Missed");
		ExtentSuccessMessage("Assertion for Direction is done");

		By FromNumber1 = By.xpath("(//div[contains(.,'" + smstoffline2
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FromNumber1));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String fromnumber1 = element.getText();
		System.out.println(fromnumber1);

		Assert.assertEquals(fromnumber1, number3);
		ExtentSuccessMessage("Assertion for From Number is Done");

		By ToNumber1 = By.xpath("(//div[contains(.,'" + smstoffline2
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ToNumber1));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String tonumber1 = element.getText();
		System.out.println(tonumber1);

		Assert.assertEquals(tonumber1, secondnumber);
		ExtentSuccessMessage("Assertion for To Number is Done");

		TabSwitchToParent();

		driver.navigate().refresh();

		Thread.sleep(4000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(OutboundCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on InboundCall Call");

		Thread.sleep(4000);

		By Direction2 = By.xpath("(//div[contains(.,'" + smstoffline
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Direction2));
		String direction3 = element.getText();
		System.out.println(direction3);

		Assert.assertEquals(direction3, "Outbound");
		ExtentSuccessMessage("Assertion for direction is done");

		By From2 = By.xpath("(//div[contains(.,'" + smstoffline
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(From2));
		String from2 = element.getText();
		System.out.println(from2);

		Assert.assertEquals(from2, firstnumber);
		ExtentSuccessMessage("Assertion for from nuber is done");

		By To2 = By.xpath("(//div[contains(.,'" + smstoffline
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(To2));
		String to2 = element.getText();
		System.out.println(to2);

		Assert.assertEquals(to2, number3);
		ExtentSuccessMessage("Assertion for To number is done");

		By CDRID1 = By.xpath("(//div[contains(.,'" + smstoffline
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[1]/div/a");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CDRID1));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on CDR ID");

		Thread.sleep(15000);

		By CallFrom1 = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[1]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallFrom1));
		String callfrom1 = element.getText();
		System.out.println(callfrom1);

		Assert.assertEquals(callfrom1, firstnumber);
		ExtentSuccessMessage("Assertion for CallFrom is done in CDR");

		By CallTo1 = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[2]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTo1));
		String callto1 = element.getText();
		System.out.println(callto1);

		Assert.assertEquals(callto1, number3);
		ExtentSuccessMessage("Assertion for CallTo is done in CDR");

		By CallTypee1 = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[3]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTypee1));
		String calltype1 = element.getText();
		System.out.println(calltype1);

		Assert.assertEquals(calltype1, "Outgoing Call");
		ExtentSuccessMessage("Assertion for Call Type is done in CDR");

		By CallStatus1 = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[4]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallStatus1));
		String callstatus1 = element.getText();
		System.out.println(callstatus1);

		Assert.assertEquals(callstatus1, "Completed");
		ExtentSuccessMessage("Assertion for Call Status is done in CDR");

		By SID1 = By.xpath("//div[@class='col-lg-3 col-md-3 col-sm-6 col-xs-12']/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SID1));
		String sid1 = element.getText();
		System.out.println(sid1);

		By Typee1 = By.xpath("//span[contains(.,'" + number3 + "')]/ancestor::tr/td[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Typee1));
		System.out.println(Typee1);
		String type1 = element.getText();
		System.out.println(type1);

		Assert.assertEquals(type1, "Callee");
		ExtentSuccessMessage("Assertion for Caller type is Done");

		By Type12 = By.xpath("//span[contains(.,'" + username + "')]/ancestor::tr/td[2]");
		System.out.println(Type12);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Type12));
		String type12 = element.getText();
		System.out.println(type12);

		Assert.assertEquals(type12, "Caller");
		ExtentSuccessMessage("Assertion for Caller type is Done");

		ExtentSuccessMessage("----------Completed Outbound BRB and CustomeMessage Transfer------------------");

		logout_CE_validations();

		TabSwitchToChild();

	}

	public void Click_Dashboard() throws InterruptedException {
		Thread.sleep(2000);
		By Dashboard = By.xpath("//a[@class='glyphicon fa fa-fw fa-dashboard']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Dashboard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on dashboard");

		By drop_down_telephone_setup = By.xpath("//a[@ng-click='navigateToTelephony()']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(drop_down_telephone_setup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on telephone setup dropdown");
	}

	public void Barge_Validation() throws InterruptedException {

		Switch_to_Iframe();
		By Name_Validation = By.xpath("(//div[normalize-space()='" + Session2_Name + "'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Name_Validation));
		ExtentSuccessMessage("Name of the user hasbeen validated");

		By click_barge = By.xpath("(//i[contains(@title,'Barge')])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(click_barge));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on barge button");

		driver.switchTo().defaultContent();

		By Barge_Menu = By.xpath("//div[@class='voice-caller-head ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Barge_Menu));
		Thread.sleep(12000);
		ExtentSuccessMessage("Barge options menu has been validated");

		By End_Barge = By.xpath("//button[@title='End Barging']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(End_Barge));
		MoveToElementClick(element);
		ExtentSuccessMessage("Barge Ended");
		ExtentSuccessMessage("**********************Barge has been validated *********************************");

		// barge icoin
		// div[@class='voice-caller-div']
		// cancel call //button[@title='End Barging']

	}

	public void Barge_Validation(String Session_name) throws InterruptedException {

		Switch_to_Iframe();
		By Name_Validation = By.xpath("(//div[normalize-space()='" + Session_name + "'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Name_Validation));
		ExtentSuccessMessage("Name of the user hasbeen validated");

		By click_barge = By.xpath("(//i[contains(@title,'Barge')])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(click_barge));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on barge button");

		driver.switchTo().defaultContent();

		By Barge_Menu = By.xpath("//div[@class='voice-caller-head ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Barge_Menu));
		Thread.sleep(12000);
		ExtentSuccessMessage("Barge options menu has been validated");

		By End_Barge = By.xpath("//button[@title='End Barging']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(End_Barge));
		MoveToElementClick(element);
		ExtentSuccessMessage("Barge Ended");
		ExtentSuccessMessage("**********************Barge has been validated *********************************");

		// barge icoin
		// div[@class='voice-caller-div']
		// cancel call //button[@title='End Barging']

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
		By CLick_Available = By.xpath("(//div[@class='md-text'][normalize-space()='OFFLINE'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CLick_Available));
		MoveToElementClick(element);
		ExtentSuccessMessage("Set to active custom status");
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

	public void BMW_Filter(String User_Name) throws InterruptedException {
		Switch_to_Iframe();
		By Click_Filter = By.xpath("(//span[normalize-space()='Filters'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_Filter));
		MoveToElementClick(element);
		ExtentSuccessMessage("BMW filter has been clicked");

		By Click_Agent_dd = By.xpath("(//input[@id='agent'])[1]");
		click(Click_Agent_dd);

		writeText(Click_Agent_dd, User_Name + Keys.ENTER);

		By Click_Apply = By.xpath("(//span[normalize-space()='Apply'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_Apply));
		MoveToElementClick(element);
		ExtentSuccessMessage("BMW filter has been apllied");

		driver.switchTo().defaultContent();

	}

	public void Monitor_Validation() throws InterruptedException {
		Switch_to_Iframe();
		By Click_On_Monitor = By.xpath("(//i[contains(@title,'Monitor')])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Monitor));
		MoveToElementClick(element);
		ExtentSuccessMessage("Monitor has been clicked");

		driver.switchTo().defaultContent();

		By Monitor_Menu = By.xpath("(//div[@class='voice-caller-head ng-binding'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Monitor_Menu));
		ExtentSuccessMessage("Monitor options menu has been validated");

		Thread.sleep(12000);

		By End_Monitoring = By.xpath("//button[@title='End Monitoring']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(End_Monitoring));
		MoveToElementClick(element);
		Thread.sleep(12000);
		ExtentSuccessMessage("Monitor hs been ended");
		ExtentSuccessMessage("**********************Monitor has been validated *********************************");

	}

	public void Whisper_Validation() throws InterruptedException {
		Switch_to_Iframe();
		By Click_On_Whisper = By.xpath("(//i[contains(@title,'Whisper')])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Whisper));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on whisper");

		driver.switchTo().defaultContent();
		By Whisper_Menu = By.xpath("//div[@class='voice-caller-head ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Whisper_Menu));
		ExtentSuccessMessage("Whisper options menu has been validated");

		Thread.sleep(12000);

		By End_Whisper = By.xpath("//button[@title='End Whispering']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(End_Whisper));
		MoveToElementClick(element);
		Thread.sleep(12000);
		ExtentSuccessMessage("Whisper has been ended");
		driver.switchTo().defaultContent();
		ExtentSuccessMessage("**********************Whisper has been validated *********************************");

	}

	public void Redirect_To_Call_Group_Managment() throws InterruptedException {
		By Click_Call_Group = By.xpath("(//button[normalize-space()='Manage Call Group'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_Call_Group));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on call group managment");

	}

	public void Call_Group_Setup() throws InterruptedException {
		By Call_Group = By.xpath("(//a[normalize-space()='Test 1012'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Group));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on call group");

		By Add_Number = By.xpath("(//button[normalize-space()='Add Members'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Add_Number));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on add number");

		By Search_Number = By.xpath("(//input[@aria-label='Search in data grid'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Search_Number));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Search number");
		writeText(Search_Number, "name to be given" + Keys.ENTER);

		writeText(Search_Number, "name to be given" + Keys.ENTER);

		By Click_On_Check = By.xpath("//td[@aria-label='Select row']//span[@class='dx-checkbox-icon']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Check));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Search check box");

		By Click_Okay = By.xpath("(//button[normalize-space()='Ok'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_Okay));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Okay");

	}

	public void Inbound_Barge_Monitor_WHisper() throws IOException, InterruptedException, ParseException {
		fetchNumber1();
		new_Tab();
		SecondUserForTransfer();
		new_Tab();
		ThirdUserforTransfer();
		inbound_BMW();

	}

	public void Outbound_Barge_Monitor_Whisper() throws InterruptedException, IOException {

		fetchNumber1();
		new_Tab();
		SecondUserForTransfer();
		new_Tab();
		ThirdUserforTransfer();
		outbound_BMW();

	}

	public void outbound_BMW() throws InterruptedException {
		TabSwitchToParent();

		waitForElement(5000);
		By CTIInputField = By.xpath("//input[@placeholder='Enter Phone Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number3);
		ExtentSuccessMessage("Number has been in input field" + number3);

		Thread.sleep(3000);
		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		String SMS_Time = CurrentTime();
		System.out.println(SMS_Time);
		String smstime = removeLeadingZero(SMS_Time);
		System.out.println(smstime);

		TabSwitchToSubChild();

		Thread.sleep(1000);
		By NumberValidation = By.xpath("(//div[@class='voice-call-ongoing-number'])[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NumberValidation));
		String numbertext = element.getText();
		System.out.println(numbertext);

		Assert.assertEquals(numbertext, firstnumber);
		ExtentSuccessMessage("First User Number is displayed after initiating ther call");

		By AcceptCall = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Accepted by first user");

		Thread.sleep(2000);
		By mute = By.xpath("//a[@ng-show='!CTICtrl.CTIContext.primarayPhoneFlags.mute']//i[contains(@class,'fa')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(mute));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call  has been muted");

		TabSwitchToChild();

		Thread.sleep(3000);
		By Dashboard = By.xpath("//a[@class='glyphicon fa fa-fw fa-dashboard']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Dashboard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on dashboard");

		By drop_down_telephone_setup = By.xpath("//a[@ng-click='navigateToTelephony()']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(drop_down_telephone_setup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on telephone setup dropdown");

		Thread.sleep(4000);
		By Minimize = By.xpath("//a[@title='Minimize']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
		MoveToElementClick(element);

		Thread.sleep(2000);

		By Frame = By.xpath("//iframe[@class='ng-scope ng-isolate-scope']");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(3000);

		Thread.sleep(3000);
		By CustomerNumber = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ username + "')]/td[7]/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomerNumber));
//		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String number = element.getText();
		System.out.println(number);

		Assert.assertEquals(number, number3);
		ExtentSuccessMessage("Assertion for Third number is done as a customer Number");

		By CallDirection = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ username + "')]/td[12]/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDirection));
//		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String direction = element.getText();
		System.out.println(direction);

		Thread.sleep(2000);
		Assert.assertEquals(direction, "Outbound");
		ExtentSuccessMessage("Assertion for Outbound Call Direction is done");

		Thread.sleep(3000);
		By Whisper = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ username + "')]/td[16]/div/div/button/i[@class='fa fa-wifi']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Whisper));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Whisper Icon");

		Thread.sleep(2000);
		By WhisperPopup = By.xpath("//div[@aria-labelledby='swal2-title']");
		Assert.assertTrue(driver.findElement(WhisperPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for Whisper popup is done");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		By WhisperCall = By.xpath("//div[@class='voice-call-window-minimized admin-action ng-scope']");
		Assert.assertTrue(driver.findElement(WhisperCall).isDisplayed());

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(4000);
		By EndWhispering = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ username + "')]/td[16]/div/div/button[@title='End Whispering']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EndWhispering));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on End Whisper Icon");

		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(WhisperPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for Whisper popup is done after ending the call");

		ExtentSuccessMessage("---------------Whisper Completed-----------------");

		By Monitor = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ username + "')]/td[16]/div/div/button/i[@class='fa fa-eye']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Monitor));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Start Monitor Icon");

		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(WhisperPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for Monitor popup is done");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Assert.assertTrue(driver.findElement(WhisperCall).isDisplayed());
		ExtentSuccessMessage("Monitor CTI Popup is Visible");

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(4000);
		By EndMonitoring = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ username + "')]/td[16]/div/div/button[@title='End Monitoring']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EndMonitoring));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on End Monitor Icon");

		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(WhisperPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for Monitor popup is done after ending the call");

		ExtentSuccessMessage("---------------Monitor Completed-----------------");

		Thread.sleep(3000);
		By Barge = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ username + "')]/td[16]/div/div/button[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Barge));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Start Barge Icon");

		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(WhisperPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for Barge popup is done");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(WhisperCall).isDisplayed());
		ExtentSuccessMessage("Barge CTI Popup is Visible");

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(4000);
		By EndBarging = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ username + "')]/td[16]/div/div/button[@title='End Barging']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EndBarging));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on End Barging Icon");

		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(WhisperPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for Barging popup is done after ending the call");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		logout_CE_validations();

		TabSwitchToParent();

	}

	public void Add_Conference() throws InterruptedException {
		By Add_Conference = By.xpath("//*[@id=\"voice-call-window-draggable\"]/div[15]/div[1]/div[2]/div[5]/a[5]/i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Add_Conference));
		js.executeScript("arguments[0].click();", element);
		// MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on add conference");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceNumberField));
		MoveToElementClick(element);

		writeText(ConfrenceNumberField, firstnumber);
		Conference_time = CurrentTime();
		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallConfreanceButton));
		MoveToElementClick(element);
		Thread.sleep(1000);
	}

	public void Add_Conference(String Number) throws InterruptedException {

		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(1000);
		Thread.sleep(5000);

		By Add_Conference = By.xpath("//*[@id=\"voice-call-window-draggable\"]/div[15]/div[1]/div[2]/div[5]/a[5]/i");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Add_Conference));
		js.executeScript("arguments[0].click();", element);
		// MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on add conference");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceNumberField));
		MoveToElementClick(element);

		writeText(ConfrenceNumberField, Number);
		Conference_time = CurrentTime();
		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallConfreanceButton));
		MoveToElementClick(element);
		Thread.sleep(1000);
	}

	public void Conference(String Number) throws InterruptedException {

		By Add_Conference = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > div.voice-call-ongoing-quick-icons > a:nth-child(6) > i");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Add_Conference));
		js.executeScript("arguments[0].click();", element);
		// MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on add conference");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceNumberField));
		MoveToElementClick(element);

		writeText(ConfrenceNumberField, Number);
		Conference_time = CurrentTime();
		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallConfreanceButton));
		MoveToElementClick(element);
		Thread.sleep(1000);
	}

	public void Brodcast_Barge_Monitor_Whisper()
			throws InterruptedException, IOException, ParseException, java.text.ParseException {

		fetchNumber1();
		splitthewindowscreen2("Left");// login ceuserone
		new_Tab();
		SecondUserForTransfer();
		login_CE_validations();
		Fetch_Profile_Name();
		fetchNumber();
		CUstom_Status_Setup();
		// TabSwitchToParent();
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Right");
		ThirdUser();
		login_CE_validations();
		fetchNumber_3();

		TabSwitchToParent();
		Outbound_valid_Transfer_Admin();
		TabSwitchToSubChild();
		Accept_Call();
		TabSwitchToParent();
		Add_Conference();
		ExtentSuccessMessage(
				"**********************Outbound Custom transfer Activity status *********************************");

		TabSwitchToChild();
		Home_Redirection();
		Admin_redirection();
		Telephone_Setup();
		maximizeWindow();
		Transfer_Admin_Validations_Call_Offline();
		ExtentSuccessMessage(
				"**********************Outbound custom transfer AdminCall log status *********************************");

		Home_Redirection();
		Call_Log_Status_OFfline(Conference_time);
		ExtentSuccessMessage(
				"**********************Outbound Custom transfer Cti Call Log  status *********************************");

		logout_CE_validations();
		TabSwitchToParent();

	}

//	public void TabSwitchToThirdWindow() throws InterruptedException {
//		ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
//		System.out.println(Tabs.size());
//		driver.switchTo().window(Tabs.get(2));
//		Thread.sleep(5000);
//		ExtentSuccessMessage("Tab Switched from parent to child");
//		Thread.sleep(2000);
//	}

	public void BC_Custom() throws InterruptedException, IOException, ParseException, java.text.ParseException {
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		fetchNumber1();
		Fetch_Profile_Name();
		splitthewindowscreen2("Left");// login ceuserone
		new_Tab();
		SecondUserForTransfer();
		login_CE_validations();

		fetchNumber();
		// CUstom_Status_Setup();

		Admin_redirection();

		CUstom_Status_Setup_Online();
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Right");
		ThirdUser();
		login_CE_validations();
		String Thirdusernumber = GetElementText(UserNumber);
		System.out.println(Thirdusernumber);
		TabSwitchToParent();
		String Groupname = "AutoGroup_" + generateRandom3DigitNumber();
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToGroupCallPage();
		RefreshPage();
		Thread.sleep(25000);
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.ClickOnCreateGroupCallsTab();
		Thread.sleep(10000);
		TelephonyPage.EnterCallGroupname("BC_" + Groupname);

		SelectCallGroupnumber();
		TelephonyPage.ClickOnBoardcastOption();
		TelephonyPage.ClickOnNextButton();
		TelephonyPage.EnterCallGroupmembername(firstnumber);
//		TelephonyPage.EnterCallGroupmembername(Session1_Number);
		TelephonyPage.ClickOnDoneButton();
		TelephonyPage.EnterSearchBar("BC_" + Groupname);
		By Grid = By.xpath("//*[text()='" + "BC_" + Groupname + "']");
		click(Grid);
		TabSwitchToChild();
		// TabSwitchToSubChild();
		TelephonyPage.ClickOnCallGrouptab();
		TelephonyPage.ClickOnOnorOffSwitch("BC_" + Groupname);
		// TabSwitchToParent();
		TabSwitchToSubChild();

//		TelephonyPage.ClickOnCallIcon();
		// HomePage.ClickedOnMaximiseDiller();
		// Thread.sleep(5000);
		CustomerEngageFunctionalityValidations.CalltoUser(Groupnumber);
		TabSwitchToChild();
		TelephonyPage.ClickOnIncomingCallNotification();
		System.out.println("");
		Accept_Call();
		Ountbound_transferCall(Session2_Name);

		// transferCall_Admin();
		// Add_Conference(Session1_Number);
		Thread.sleep(4000);

		TabSwitchToParent();
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		Thread.sleep(1000);
//		TabSwitchToChild();
		// transferAssertion();////missed call will be here
		// Offline_Assertion();
		Admin_redirection();
		Telephone_Setup();
		maximizeWindow();
		Admin_Validations_Call_Offline();
		Home_Redirection();
		Call_Log_Status_Online(Offline_time);
		logout_CE_validations();
		TabSwitchToParent();

	}
	
	public void CallScript_RL() throws InterruptedException, IOException
	{
		
		fetchNumber1();
		new_Tab();
		SecondUserForBC();
		new_Tab();
		ThirdUserforTransfer();

		
		TabSwitchToParent();

		By CallGroup = By.xpath("//a[@title='Call Groups']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);
		try {

			WebElement button = driver.findElement(By
					.xpath("//span[@title='Call Group']/i[contains(.,'AutomationRLCallGroup')]/ancestor::tr/td[5]/div/a/i"));
			String buttonState = button.getAttribute("title");
			System.out.println(buttonState);
			if (buttonState.contains("On")) { // Replace with the actual state-check logic
				System.out.println("Button is On.");

			} else {
				By CallGroupName = By.xpath(
						"//span[@title='Call Group']/i[contains(.,'AutomationRLCallGroup')]/ancestor::tr/td[5]/div/a/i");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
				MoveToElementClick(element);
				ExtentSuccessMessage("Call group has been marked as on");
				Thread.sleep(5000);
			}
		} finally {
			ExtentSuccessMessage("Call Group is on");

		}

		Thread.sleep(5000);

		By Minimize = By.xpath("//i[@class='fa fa-minus']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been minimie");

		Thread.sleep(2000);
		TabSwitchToChild();

		Thread.sleep(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);

		Thread.sleep(2000);
		try {

			WebElement button = driver.findElement(By
					.xpath("//span[@title='Call Group']/i[contains(.,'AutomationRLCallGroup')]/ancestor::tr/td[5]/div/a/i"));
			String buttonState = button.getAttribute("title");
			System.out.println(buttonState);
			if (buttonState.contains("On")) { // Replace with the actual state-check logic
				System.out.println("Button is On.");

			} else {
				By CallGroupName = By.xpath(
						"//span[@title='Call Group']/i[contains(.,'AutomationRLCallGroup')]/ancestor::tr/td[5]/div/a/i");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
				MoveToElementClick(element);
				ExtentSuccessMessage("Call group has been marked as on");
				Thread.sleep(5000);
			}
		} finally {
			ExtentSuccessMessage("Call Group is on");

		}

		Thread.sleep(3000);
		By CallGroupNumber = By.xpath("//span[@title='Call Group']/i[contains(.,'AutomationRLCallGroup')]/parent::span/u");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupNumber));
		String number = element.getText();
		System.out.println(number);
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been minimie");

		Thread.sleep(2000);

		TabSwitchToSubChild();

		waitForElement(4000);
		By CTIInputField = By.xpath("//input[@placeholder='Enter Phone Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Number has been in input field" + number);

		Thread.sleep(3000);
		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		String SMS_Time = CurrentTime(); // stored
		System.out.println(SMS_Time);
		String smstime = removeLeadingZero(SMS_Time);
		System.out.println(smstime);
		
		TabSwitchToParent();
		
		Thread.sleep(5000);

		try {
			WebElement button = driver.findElement(By.id("AcceptIncomingTrigger"));
			if (!button.isDisplayed()) {
				System.out.println("Button is not displayed");
				ExtentSuccessMessage("Call Button is not displayed");

			} else {
				System.out.println("Button is displayed");
				ExtentErrorMessage("Call Buttin is displayed Ringless is not working");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Button is not present in the DOM");
		}

		Thread.sleep(5000);
		By CallGrpName = By.xpath("(//div[@class='voice-call-ongoing-number cti-group-name ng-scope'])[1]/span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGrpName));
		String grpname = element.getText();
		System.out.println(grpname);

		Assert.assertEquals(grpname, "AutomationRLCallGroup");
		ExtentSuccessMessage("Assertion for Call group name is displayed");
		
		Thread.sleep(4000);
		try {

			WebElement CallScriptTitle = driver
					.findElement(By.xpath("//i[@class='acc glyphicon glyphicon-chevron-up']"));
			if (CallScriptTitle.isDisplayed()) {
				System.out.println("Popup is displayed.");
			} else {
				System.out.println("Popup is not displayed.");
			}

		} catch (NoSuchElementException e) {
			System.out.println("Popup is not present in the DOM.");
		} finally {
			ExtentSuccessMessage("Call Popup is visible");

		}
		
		By Decline = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Decline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Decline Call Button");
		
		driver.navigate().refresh();

		Thread.sleep(14000);
		By Admin_Tile = By.xpath("//span[normalize-space()='Admin']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(3000);

		By Telephonesetup = By.xpath("//a[@href='#/admin/manage-account']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Telephony Setup");

		Thread.sleep(8000);
		By ManageNumber = By.xpath("(//button[@name='manageNumbersBtn'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ManageNumber));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked On Manage Number");

		Thread.sleep(8000);
		By SearchNumber = By.xpath(
				"//input[@class='ng-pristine ng-untouched md-input ng-empty ng-valid-minlength ng-valid-maxlength ng-valid ng-valid-required']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchNumber));
		MoveToElementClick(element);
		writeText(SearchNumber, number + Keys.ENTER);
		ExtentSuccessMessage("Eneterd callgrp number");

		Thread.sleep(5000);
		By CallScript = By.xpath("//i[@class='fa fa-phone call-script']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScript));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on call script option");

		Thread.sleep(3000);
		WebElement SelectCallScript = driver
				.findElement(By.xpath("//select[@class='ng-pristine ng-untouched ng-valid ng-empty']"));
		Select s = new Select(SelectCallScript);
		s.selectByVisibleText("AutoBCCallScript");
		ExtentSuccessMessage("Call Script has been Selected");

		Thread.sleep(3000);
		By Preview = By.xpath("//button[@class='btn btn-default green text-center']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Preview));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Preview call script option");

		By Iframe = By.xpath("//iframe[@id='manage_acc_callscript_preview']");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Iframe));
		ExtentSuccessMessage("Switched in Iframe");

		Thread.sleep(3000);
		By CallScriptData = By.cssSelector("body > p:nth-child(2)");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScriptData));
		String text = element.getText();
		System.out.println(text);

		driver.switchTo().defaultContent();

		Thread.sleep(5000);
		By ClosePreview = By.xpath("(//button[@class='btn btn-default green pull-right'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClosePreview));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Close Preview call script option");

		Thread.sleep(4000);
		By Save = By.xpath("//button[@class='btn btn-default green pull-right ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Save));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on save call script option");
		
		Thread.sleep(2000);
		By Home = By.name("menu_home");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Home option");

		Thread.sleep(3000);
		driver.navigate().refresh();

		Thread.sleep(8000);
		TabSwitchToSubChild();
		waitForElement(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Number has been in input field" + number);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");
		
		TabSwitchToChild();
		Thread.sleep(15000);

		try {

			WebElement CallScriptTitle = driver.findElement(By.xpath("//h5[contains(.,' Call Script')]"));
			if (CallScriptTitle.isDisplayed()) {

				By Frame = By.xpath("//iframe[@id='cti_callscript_preview']");
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
				ExtentSuccessMessage("Switched in Iframe");

				Thread.sleep(2000);
				By CallScriptData1 = By.xpath("//p[contains(.,'" + text + "')]");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScriptData1));
				String text1 = element.getText();
				System.out.println(text1);

				driver.switchTo().defaultContent();

			} else {
				System.out.println("Popup is not displayed.");
			}

		} catch (NoSuchElementException e) {
			System.out.println("Popup is not present in the DOM.");
		} finally {
			ExtentSuccessMessage("Call Popup is visible");

		}

		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Decline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Decline Call Button");

		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(3000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Telephony Setup");

		Thread.sleep(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ManageNumber));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked On Manage Number");

		Thread.sleep(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchNumber));
		MoveToElementClick(element);
		writeText(SearchNumber, number + Keys.ENTER);
		ExtentSuccessMessage("Eneterd callgrp number");

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScript));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on call script option");

		Thread.sleep(3000);
		WebElement UpdateCallScript = driver
				.findElement(By.xpath("(//select[@class='ng-pristine ng-untouched ng-valid ng-not-empty'])[2]"));
		Select s1 = new Select(UpdateCallScript);
		s1.selectByVisibleText("AutoBCUpdatedCallScript");
		ExtentSuccessMessage("Call Script has been Selected");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Preview));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Preview call script option");

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Iframe));
		ExtentSuccessMessage("Switched in Iframe");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScriptData));
		String text3 = element.getText();
		System.out.println(text3);

		driver.switchTo().defaultContent();

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClosePreview));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Close Preview call script option");

		Thread.sleep(3000);
		By Update = By.xpath("//button[@title='Save']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Update));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Update call script option");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Home option");

		Thread.sleep(3000);
		driver.navigate().refresh();

		Thread.sleep(8000);
		TabSwitchToSubChild();
		waitForElement(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Number has been in input field" + number);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");
		
		TabSwitchToParent();
		
		Thread.sleep(8000);

		try {

			WebElement CallScriptTitle = driver.findElement(By.xpath("//h5[contains(.,' Call Script')]"));
			if (CallScriptTitle.isDisplayed()) {

				By Frame = By.xpath("//iframe[@id='cti_callscript_preview']");
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
				ExtentSuccessMessage("Switched in Iframe");

				Thread.sleep(2000);
				By CallScriptData1 = By.xpath("//p[contains(.,'" + text3 + "')]");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScriptData1));
				String text1 = element.getText();
				System.out.println(text1);

				driver.switchTo().defaultContent();

			} else {
				System.out.println("Popup is not displayed.");
			}

		} catch (NoSuchElementException e) {
			System.out.println("Popup is not present in the DOM.");
		} finally {
			ExtentSuccessMessage("Call Popup is visible");

		}

		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Decline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Decline Call Button");

		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(3000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Telephony Setup");

		Thread.sleep(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ManageNumber));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked On Manage Number");

		Thread.sleep(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchNumber));
		MoveToElementClick(element);
		writeText(SearchNumber, number + Keys.ENTER);
		ExtentSuccessMessage("Eneterd callgrp number");

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScript));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on call script option");

		Thread.sleep(2000);
		By Remove = By.xpath("//button[@title='Remove']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Remove));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Remove script option");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Home option");

		Thread.sleep(3000);
		driver.navigate().refresh();

		Thread.sleep(8000);
		TabSwitchToSubChild();
		waitForElement(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Number has been in input field" + number);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		TabSwitchToChild();

		Thread.sleep(10000);
		try {

			WebElement CallScriptTitle = driver
					.findElement(By.xpath("//i[@class='acc glyphicon glyphicon-chevron-up']"));
			if (CallScriptTitle.isDisplayed()) {
				System.out.println("Popup is displayed.");
			} else {
				System.out.println("Popup is not displayed.");
			}

		} catch (NoSuchElementException e) {
			System.out.println("Popup is not present in the DOM.");
		} finally {
			ExtentSuccessMessage("Call Popup is visible");

		}

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);

		By CallGroupName = By
				.xpath("//span[@title='Call Group']/i[contains(.,'AutomationRLCallGroup')]/ancestor::tr/td[5]/div/a/i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been marked as Off");
		Thread.sleep(5000);

		logout_CE_validations();
		TabSwitchToParent();

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);

		
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been marked as Off");
		Thread.sleep(5000);
	
		
	}
	
	
	public void round_Robin() throws InterruptedException, IOException
	{
		fetchNumber1();
		new_Tab();
		SecondUserForBC();
		new_Tab();
		ThirdUserforTransfer();
		
		TabSwitchToParent();

		By CallGroup = By.xpath("//a[@title='Call Groups']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000); 
		try {

			WebElement button = driver.findElement(By
					.xpath("//span[@title='Call Group']/i[contains(.,'AutomationRRCallGroup')]/ancestor::tr/td[5]/div/a/i"));
			String buttonState = button.getAttribute("title");
			System.out.println(buttonState);
			if (buttonState.contains("On")) { // Replace with the actual state-check logic
				System.out.println("Button is On.");

			} else {
				By CallGroupName = By.xpath(
						"//span[@title='Call Group']/i[contains(.,'AutomationRRCallGroup')]/ancestor::tr/td[5]/div/a/i");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
				MoveToElementClick(element);
				ExtentSuccessMessage("Call group has been marked as on");
				Thread.sleep(5000);
			}
		} finally {
			ExtentSuccessMessage("Call Group is on");

		}

		Thread.sleep(5000);

		By Minimize = By.xpath("//i[@class='fa fa-minus']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been minimie");

		Thread.sleep(2000);
		TabSwitchToChild();

		Thread.sleep(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);

		Thread.sleep(2000);
		try {

			WebElement button = driver.findElement(By
					.xpath("//span[@title='Call Group']/i[contains(.,'AutomationRRCallGroup')]/ancestor::tr/td[5]/div/a/i"));
			String buttonState = button.getAttribute("title");
			System.out.println(buttonState);
			if (buttonState.contains("On")) { // Replace with the actual state-check logic
				System.out.println("Button is On.");

			} else {
				By CallGroupName = By.xpath(
						"//span[@title='Call Group']/i[contains(.,'AutomationRRCallGroup')]/ancestor::tr/td[5]/div/a/i");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
				MoveToElementClick(element);
				ExtentSuccessMessage("Call group has been marked as on");
				Thread.sleep(5000);
			}
		} finally {
			ExtentSuccessMessage("Call Group is on");

		}

		Thread.sleep(3000);
		By CallGroupNumber = By.xpath("//span[@title='Call Group']/i[contains(.,'AutomationRRCallGroup')]/parent::span/u");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupNumber));
		String number = element.getText();
		System.out.println(number);
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been minimie");

		Thread.sleep(2000);

		TabSwitchToSubChild();

		waitForElement(4000);
		By CTIInputField = By.xpath("//input[@placeholder='Enter Phone Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Number has been in input field" + number);

		Thread.sleep(3000);
		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		String SMS_Time = CurrentTime(); // stored
		System.out.println(SMS_Time);
		String smstime = removeLeadingZero(SMS_Time);
		System.out.println(smstime);
 
		TabSwitchToParent();
		Thread.sleep(1000);
		By IncomingCallTitle = By.xpath("//a[@title='Incoming Call Count']");
		
		while (true) {
            try {
                // Wait for the button to appear and be clickable
                WebElement button = wait.until(ExpectedConditions.elementToBeClickable(IncomingCallTitle));
                // Click the button
                button.click();
                System.out.println("Button clicked!");
                break; // Exit loop after successful click
            } catch (Exception e) {
                System.out.println("Button not clickable yet, retrying...");
            }
        }

		By Groupname = By.xpath("(//div[@class='voice-call-ongoing-number cti-group-name ng-scope'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Groupname));
		String name = element.getText();
		System.out.println(name);

		String timeString = StringUtils.substringAfter(name, ": ");
		System.out.println(timeString);
		Assert.assertEquals(timeString, "AutomationRRCallGroup");

		By Number = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-incoming-window > div:nth-child(2)");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Number));
		String number1 = element.getText();
		System.out.println(number1);

		By AcceptCall = By.cssSelector("#AcceptIncomingTrigger");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Accept Call");

		String SMS_Time11 = CurrentTime(); // stored
		System.out.println(SMS_Time11);
		String smstime11 = removeLeadingZero(SMS_Time11);
		System.out.println(smstime11);

		Thread.sleep(10000);
		try {

			WebElement CallScriptTitle = driver
					.findElement(By.xpath("//i[@class='acc glyphicon glyphicon-chevron-up']"));
			if (CallScriptTitle.isDisplayed()) {
				System.out.println("Popup is displayed.");
			} else {
				System.out.println("Popup is not displayed.");
			}

		} catch (NoSuchElementException e) {
			System.out.println("Popup is not present in the DOM.");
		} finally {
			ExtentSuccessMessage("Call Popup is visible");

		}

		Thread.sleep(4000);

		By Decline = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Decline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Decline Call Button");

		Thread.sleep(4000);
		By Admin_Tile = By.xpath("//span[normalize-space()='Admin']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(3000);

		By Telephonesetup = By.xpath("//a[@href='#/admin/manage-account']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Telephony Setup");

		Thread.sleep(8000);
		By ManageNumber = By.xpath("(//button[@name='manageNumbersBtn'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ManageNumber));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked On Manage Number");

		Thread.sleep(8000);
		By SearchNumber = By.xpath(
				"//input[@class='ng-pristine ng-untouched md-input ng-empty ng-valid-minlength ng-valid-maxlength ng-valid ng-valid-required']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchNumber));
		MoveToElementClick(element);
		writeText(SearchNumber, number + Keys.ENTER);
		ExtentSuccessMessage("Eneterd callgrp number");

		Thread.sleep(5000);
		By CallScript = By.xpath("//i[@class='fa fa-phone call-script']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScript));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on call script option");

		Thread.sleep(3000);
		WebElement SelectCallScript = driver
				.findElement(By.xpath("//select[@class='ng-pristine ng-untouched ng-valid ng-empty']"));
		Select s = new Select(SelectCallScript);
		s.selectByVisibleText("AutoBCCallScript");
		ExtentSuccessMessage("Call Script has been Selected");

		Thread.sleep(3000);
		By Preview = By.xpath("//button[@class='btn btn-default green text-center']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Preview));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Preview call script option");

		By Iframe = By.xpath("//iframe[@id='manage_acc_callscript_preview']");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Iframe));
		ExtentSuccessMessage("Switched in Iframe");

		Thread.sleep(3000);
		By CallScriptData = By.cssSelector("body > p:nth-child(2)");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScriptData));
		String text = element.getText();
		System.out.println(text);

		driver.switchTo().defaultContent();

		Thread.sleep(5000);
		By ClosePreview = By.xpath("(//button[@class='btn btn-default green pull-right'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClosePreview));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Close Preview call script option");

		Thread.sleep(4000);
		By Save = By.xpath("//button[@class='btn btn-default green pull-right ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Save));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on save call script option");

		Thread.sleep(2000);
		By Home = By.name("menu_home");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Home option");

		Thread.sleep(3000);
		driver.navigate().refresh();

		Thread.sleep(8000);
		TabSwitchToSubChild();
		waitForElement(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Number has been in input field" + number);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		TabSwitchToParent();
		Thread.sleep(4000);
		while (true) {
            try {
                // Wait for the button to appear and be clickable
                WebElement button = wait.until(ExpectedConditions.elementToBeClickable(IncomingCallTitle));
                // Click the button
                button.click();
                System.out.println("Button clicked!");
                break; // Exit loop after successful click
            } catch (Exception e) {
                System.out.println("Button not clickable yet, retrying...");
            }
        }
		
		
		
		ExtentSuccessMessage("Clicked on Incoming call");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Accept Call");

		Thread.sleep(20000);

		try {

			WebElement CallScriptTitle = driver.findElement(By.xpath("//h5[contains(.,' Call Script')]"));
			if (CallScriptTitle.isDisplayed()) {

				By Frame = By.xpath("//iframe[@id='cti_callscript_preview']");
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
				ExtentSuccessMessage("Switched in Iframe");

				Thread.sleep(2000);
				By CallScriptData1 = By.xpath("//p[contains(.,'" + text + "')]");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScriptData1));
				String text1 = element.getText();
				System.out.println(text1);

				driver.switchTo().defaultContent();

			} else {
				System.out.println("Popup is not displayed.");
			}

		} catch (NoSuchElementException e) {
			System.out.println("Popup is not present in the DOM.");
		} finally {
			ExtentSuccessMessage("Call Popup is visible");

		}

		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Decline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Decline Call Button");
		
		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(3000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Telephony Setup");

		Thread.sleep(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ManageNumber));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked On Manage Number");

		Thread.sleep(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchNumber));
		MoveToElementClick(element);
		writeText(SearchNumber, number + Keys.ENTER);
		ExtentSuccessMessage("Eneterd callgrp number");

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScript));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on call script option");

		Thread.sleep(3000);
		WebElement UpdateCallScript = driver
				.findElement(By.xpath("(//select[@class='ng-pristine ng-untouched ng-valid ng-not-empty'])[2]"));
		Select s1 = new Select(UpdateCallScript);
		s1.selectByVisibleText("AutoBCUpdatedCallScript");
		ExtentSuccessMessage("Call Script has been Selected");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Preview));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Preview call script option");

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Iframe));
		ExtentSuccessMessage("Switched in Iframe");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScriptData));
		String text3 = element.getText();
		System.out.println(text3);

		driver.switchTo().defaultContent();

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClosePreview));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Close Preview call script option");

		Thread.sleep(3000);
		By Update = By.xpath("//button[@title='Save']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Update));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Update call script option");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Home option");

		Thread.sleep(3000);
		driver.navigate().refresh();

		Thread.sleep(8000);
		TabSwitchToSubChild();
		waitForElement(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Number has been in input field" + number);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		TabSwitchToParent();
		Thread.sleep(4000);
		while (true) {
            try {
                // Wait for the button to appear and be clickable
                WebElement button = wait.until(ExpectedConditions.elementToBeClickable(IncomingCallTitle));
                // Click the button
                button.click();
                System.out.println("Button clicked!");
                break; // Exit loop after successful click
            } catch (Exception e) {
                System.out.println("Button not clickable yet, retrying...");
            }
        }
	
		
		ExtentSuccessMessage("Clicked on Incoming call");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Accept Call");

		Thread.sleep(8000);

		try {

			WebElement CallScriptTitle = driver.findElement(By.xpath("//h5[contains(.,' Call Script')]"));
			if (CallScriptTitle.isDisplayed()) {

				By Frame = By.xpath("//iframe[@id='cti_callscript_preview']");
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
				ExtentSuccessMessage("Switched in Iframe");

				Thread.sleep(2000);
				By CallScriptData1 = By.xpath("//p[contains(.,'" + text3 + "')]");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScriptData1));
				String text1 = element.getText();
				System.out.println(text1);

				driver.switchTo().defaultContent();

			} else {
				System.out.println("Popup is not displayed.");
			}

		} catch (NoSuchElementException e) {
			System.out.println("Popup is not present in the DOM.");
		} finally {
			ExtentSuccessMessage("Call Popup is visible");

		}

		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Decline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Decline Call Button");

		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(3000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Telephony Setup");

		Thread.sleep(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ManageNumber));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked On Manage Number");

		Thread.sleep(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchNumber));
		MoveToElementClick(element);
		writeText(SearchNumber, number + Keys.ENTER);
		ExtentSuccessMessage("Eneterd callgrp number");

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScript));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on call script option");

		Thread.sleep(2000);
		By Remove = By.xpath("//button[@title='Remove']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Remove));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Remove script option");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Home option");

		Thread.sleep(3000);
		driver.navigate().refresh();

		Thread.sleep(8000);
		TabSwitchToSubChild();
		waitForElement(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Number has been in input field" + number);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		TabSwitchToParent();
		Thread.sleep(4000);
		while (true) {
            try {
                // Wait for the button to appear and be clickable
                WebElement button = wait.until(ExpectedConditions.elementToBeClickable(IncomingCallTitle));
                // Click the button
                button.click();
                System.out.println("Button clicked!");
                break; // Exit loop after successful click
            } catch (Exception e) {
                System.out.println("Button not clickable yet, retrying...");
            }
        }

		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Accept Call");

		Thread.sleep(10000);
		try {

			WebElement CallScriptTitle = driver
					.findElement(By.xpath("//i[@class='acc glyphicon glyphicon-chevron-up']"));
			if (CallScriptTitle.isDisplayed()) {
				System.out.println("Popup is displayed.");
			} else {
				System.out.println("Popup is not displayed.");
			}

		} catch (NoSuchElementException e) {
			System.out.println("Popup is not present in the DOM.");
		} finally {
			ExtentSuccessMessage("Call Popup is visible");

		}

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);

		By CallGroupName = By
				.xpath("//span[@title='Call Group']/i[contains(.,'AutomationRRCallGroup')]/ancestor::tr/td[5]/div/a/i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been marked as Off");
		Thread.sleep(5000);

		logout_CE_validations();
		TabSwitchToChild();

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);

		
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been marked as Off");
		Thread.sleep(5000);

	

		
	}
	

	public void CallScript() throws InterruptedException, IOException {
		fetchNumber1();
		new_Tab();
		SecondUserForBC();
		new_Tab();
		ThirdUserforTransfer();

		TabSwitchToParent();

		By CallGroup = By.xpath("//a[@title='Call Groups']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);
		try {

			WebElement button = driver.findElement(By
					.xpath("//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]/ancestor::tr/td[5]/div/a/i"));
			String buttonState = button.getAttribute("title");
			System.out.println(buttonState);
			if (buttonState.contains("On")) { // Replace with the actual state-check logic
				System.out.println("Button is On.");

			} else {
				By CallGroupName = By.xpath(
						"//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]/ancestor::tr/td[5]/div/a/i");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
				MoveToElementClick(element);
				ExtentSuccessMessage("Call group has been marked as on");
				Thread.sleep(5000);
			}
		} finally {
			ExtentSuccessMessage("Call Group is on");

		}

		Thread.sleep(5000);

		By Minimize = By.xpath("//i[@class='fa fa-minus']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been minimie");

		Thread.sleep(2000);
		TabSwitchToChild();

		Thread.sleep(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);

		Thread.sleep(2000);
		try {

			WebElement button = driver.findElement(By
					.xpath("//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]/ancestor::tr/td[5]/div/a/i"));
			String buttonState = button.getAttribute("title");
			System.out.println(buttonState);
			if (buttonState.contains("On")) { // Replace with the actual state-check logic
				System.out.println("Button is On.");

			} else {
				By CallGroupName = By.xpath(
						"//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]/ancestor::tr/td[5]/div/a/i");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
				MoveToElementClick(element);
				ExtentSuccessMessage("Call group has been marked as on");
				Thread.sleep(5000);
			}
		} finally {
			ExtentSuccessMessage("Call Group is on");

		}

		Thread.sleep(3000);
		By CallGroupNumber = By.xpath("//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]/parent::span/u");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupNumber));
		String number = element.getText();
		System.out.println(number);
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been minimie");

		Thread.sleep(2000);

		TabSwitchToSubChild();

		waitForElement(4000);
		By CTIInputField = By.xpath("//input[@placeholder='Enter Phone Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Number has been in input field" + number);

		Thread.sleep(3000);
		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		String SMS_Time = CurrentTime(); // stored
		System.out.println(SMS_Time);
		String smstime = removeLeadingZero(SMS_Time);
		System.out.println(smstime);

		TabSwitchToChild();

		Thread.sleep(5000);
		By IncomingCallTitle = By.xpath("//a[@title='Incoming Call Count']");
		Assert.assertTrue(driver.findElement(IncomingCallTitle).isDisplayed());
		ExtentSuccessMessage("Incoming call ttle is been displayed for fist user");

		TabSwitchToParent();
		Assert.assertTrue(driver.findElement(IncomingCallTitle).isDisplayed());
		ExtentSuccessMessage("Incoming call ttle is been displayed for fist user");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(IncomingCallTitle));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Incoming call");

		By Groupname = By.xpath("(//div[@class='voice-call-ongoing-number cti-group-name ng-scope'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Groupname));
		String name = element.getText();
		System.out.println(name);

		String timeString = StringUtils.substringAfter(name, ": ");
		System.out.println(timeString);
		Assert.assertEquals(timeString, "AutoBroadCasting");

		By Number = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-incoming-window > div:nth-child(2)");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Number));
		String number1 = element.getText();
		System.out.println(number1);

		By AcceptCall = By.cssSelector("#AcceptIncomingTrigger");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Accept Call");

		String SMS_Time11 = CurrentTime(); // stored
		System.out.println(SMS_Time11);
		String smstime11 = removeLeadingZero(SMS_Time11);
		System.out.println(smstime11);

		Thread.sleep(10000);
		try {

			WebElement CallScriptTitle = driver
					.findElement(By.xpath("//i[@class='acc glyphicon glyphicon-chevron-up']"));
			if (CallScriptTitle.isDisplayed()) {
				System.out.println("Popup is displayed.");
			} else {
				System.out.println("Popup is not displayed.");
			}

		} catch (NoSuchElementException e) {
			System.out.println("Popup is not present in the DOM.");
		} finally {
			ExtentSuccessMessage("Call Popup is visible");

		}

		Thread.sleep(4000);

		By Decline = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Decline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Decline Call Button");

		Thread.sleep(4000);
		By Admin_Tile = By.xpath("//span[normalize-space()='Admin']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(3000);

		By Telephonesetup = By.xpath("//a[@href='#/admin/manage-account']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Telephony Setup");

		Thread.sleep(8000);
		By ManageNumber = By.xpath("(//button[@name='manageNumbersBtn'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ManageNumber));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked On Manage Number");

		Thread.sleep(8000);
		By SearchNumber = By.xpath(
				"//input[@class='ng-pristine ng-untouched md-input ng-empty ng-valid-minlength ng-valid-maxlength ng-valid ng-valid-required']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchNumber));
		MoveToElementClick(element);
		writeText(SearchNumber, number + Keys.ENTER);
		ExtentSuccessMessage("Eneterd callgrp number");

		Thread.sleep(5000);
		By CallScript = By.xpath("//i[@class='fa fa-phone call-script']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScript));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on call script option");

		Thread.sleep(3000);
		WebElement SelectCallScript = driver
				.findElement(By.xpath("//select[@class='ng-pristine ng-untouched ng-valid ng-empty']"));
		Select s = new Select(SelectCallScript);
		s.selectByVisibleText("AutoBCCallScript");
		ExtentSuccessMessage("Call Script has been Selected");

		Thread.sleep(3000);
		By Preview = By.xpath("//button[@class='btn btn-default green text-center']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Preview));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Preview call script option");

		By Iframe = By.xpath("//iframe[@id='manage_acc_callscript_preview']");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Iframe));
		ExtentSuccessMessage("Switched in Iframe");

		Thread.sleep(3000);
		By CallScriptData = By.cssSelector("body > p:nth-child(2)");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScriptData));
		String text = element.getText();
		System.out.println(text);

		driver.switchTo().defaultContent();

		Thread.sleep(5000);
		By ClosePreview = By.xpath("(//button[@class='btn btn-default green pull-right'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClosePreview));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Close Preview call script option");

		Thread.sleep(4000);
		By Save = By.xpath("//button[@class='btn btn-default green pull-right ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Save));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on save call script option");

		Thread.sleep(2000);
		By Home = By.name("menu_home");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Home option");

		Thread.sleep(3000);
		driver.navigate().refresh();

		Thread.sleep(8000);
		TabSwitchToSubChild();
		waitForElement(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Number has been in input field" + number);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		TabSwitchToParent();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(IncomingCallTitle).isDisplayed());
		ExtentSuccessMessage("Incoming call ttle is been displayed for first user");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(IncomingCallTitle));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Incoming call");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Accept Call");

		Thread.sleep(15000);

		try {

			WebElement CallScriptTitle = driver.findElement(By.xpath("//h5[contains(.,' Call Script')]"));
			if (CallScriptTitle.isDisplayed()) {

				By Frame = By.xpath("//iframe[@id='cti_callscript_preview']");
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
				ExtentSuccessMessage("Switched in Iframe");

				Thread.sleep(2000);
				By CallScriptData1 = By.xpath("//p[contains(.,'" + text + "')]");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScriptData1));
				String text1 = element.getText();
				System.out.println(text1);

				driver.switchTo().defaultContent();

			} else {
				System.out.println("Popup is not displayed.");
			}

		} catch (NoSuchElementException e) {
			System.out.println("Popup is not present in the DOM.");
		} finally {
			ExtentSuccessMessage("Call Popup is visible");

		}

		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Decline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Decline Call Button");

		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(3000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Telephony Setup");

		Thread.sleep(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ManageNumber));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked On Manage Number");

		Thread.sleep(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchNumber));
		MoveToElementClick(element);
		writeText(SearchNumber, number + Keys.ENTER);
		ExtentSuccessMessage("Eneterd callgrp number");

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScript));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on call script option");

		Thread.sleep(3000);
		WebElement UpdateCallScript = driver
				.findElement(By.xpath("(//select[@class='ng-pristine ng-untouched ng-valid ng-not-empty'])[2]"));
		Select s1 = new Select(UpdateCallScript);
		s1.selectByVisibleText("AutoBCUpdatedCallScript");
		ExtentSuccessMessage("Call Script has been Selected");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Preview));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Preview call script option");

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Iframe));
		ExtentSuccessMessage("Switched in Iframe");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScriptData));
		String text3 = element.getText();
		System.out.println(text3);

		driver.switchTo().defaultContent();

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClosePreview));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Close Preview call script option");

		Thread.sleep(3000);
		By Update = By.xpath("//button[@title='Save']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Update));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Update call script option");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Home option");

		Thread.sleep(3000);
		driver.navigate().refresh();

		Thread.sleep(8000);
		TabSwitchToSubChild();
		waitForElement(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Number has been in input field" + number);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		TabSwitchToParent();
		Assert.assertTrue(driver.findElement(IncomingCallTitle).isDisplayed());
		ExtentSuccessMessage("Incoming call ttle is been displayed for first user");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(IncomingCallTitle));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Incoming call");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Accept Call");

		Thread.sleep(8000);

		try {

			WebElement CallScriptTitle = driver.findElement(By.xpath("//h5[contains(.,' Call Script')]"));
			if (CallScriptTitle.isDisplayed()) {

				By Frame = By.xpath("//iframe[@id='cti_callscript_preview']");
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
				ExtentSuccessMessage("Switched in Iframe");

				Thread.sleep(2000);
				By CallScriptData1 = By.xpath("//p[contains(.,'" + text3 + "')]");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScriptData1));
				String text1 = element.getText();
				System.out.println(text1);

				driver.switchTo().defaultContent();

			} else {
				System.out.println("Popup is not displayed.");
			}

		} catch (NoSuchElementException e) {
			System.out.println("Popup is not present in the DOM.");
		} finally {
			ExtentSuccessMessage("Call Popup is visible");

		}

		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Decline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Decline Call Button");

		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(3000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Telephony Setup");

		Thread.sleep(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ManageNumber));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked On Manage Number");

		Thread.sleep(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchNumber));
		MoveToElementClick(element);
		writeText(SearchNumber, number + Keys.ENTER);
		ExtentSuccessMessage("Eneterd callgrp number");

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScript));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on call script option");

		Thread.sleep(2000);
		By Remove = By.xpath("//button[@title='Remove']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Remove));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Remove script option");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Home option");

		Thread.sleep(3000);
		driver.navigate().refresh();

		Thread.sleep(8000);
		TabSwitchToSubChild();
		waitForElement(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Number has been in input field" + number);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		TabSwitchToParent();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(IncomingCallTitle).isDisplayed());
		ExtentSuccessMessage("Incoming call ttle is been displayed for first user");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(IncomingCallTitle));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Incoming call");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Accept Call");

		Thread.sleep(10000);
		try {

			WebElement CallScriptTitle = driver
					.findElement(By.xpath("//i[@class='acc glyphicon glyphicon-chevron-up']"));
			if (CallScriptTitle.isDisplayed()) {
				System.out.println("Popup is displayed.");
			} else {
				System.out.println("Popup is not displayed.");
			}

		} catch (NoSuchElementException e) {
			System.out.println("Popup is not present in the DOM.");
		} finally {
			ExtentSuccessMessage("Call Popup is visible");

		}

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);

		By CallGroupName = By
				.xpath("//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]/ancestor::tr/td[5]/div/a/i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been marked as Off");
		Thread.sleep(5000);

		logout_CE_validations();
		TabSwitchToChild();

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);

		
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been marked as Off");
		Thread.sleep(5000);

	}

	public void Barge_Monitor_Whisper()
			throws InterruptedException, IOException, ParseException, java.text.ParseException {

		fetchNumber1();
		new_Tab();
		SecondUserForBC();
		new_Tab();
		ThirdUserforTransfer();

		TabSwitchToParent();

		By CallGroup = By.xpath("//a[@title='Call Groups']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);

		try {

			WebElement button = driver.findElement(By
					.xpath("//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]/ancestor::tr/td[5]/div/a/i"));
			String buttonState = button.getAttribute("title");
			System.out.println(buttonState);
			if (buttonState.contains("On")) { // Replace with the actual state-check logic
				System.out.println("Button is On.");

			} else {
				By CallGroupName = By.xpath(
						"//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]/ancestor::tr/td[5]/div/a/i");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
				MoveToElementClick(element);
				ExtentSuccessMessage("Call group has been marked as on");
				Thread.sleep(5000);
			}
		} finally {
			ExtentSuccessMessage("Call Group is on");

		}

		By Minimize = By.xpath("//i[@class='fa fa-minus']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been minimie");

		Thread.sleep(2000);
		TabSwitchToChild();

		Thread.sleep(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);
		try {

			WebElement button = driver.findElement(By
					.xpath("//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]/ancestor::tr/td[5]/div/a/i"));
			String buttonState = button.getAttribute("title");
			System.out.println(buttonState);
			if (buttonState.contains("On")) { // Replace with the actual state-check logic
				System.out.println("Button is On.");

			} else {
				By CallGroupName = By.xpath(
						"//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]/ancestor::tr/td[5]/div/a/i");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
				MoveToElementClick(element);
				ExtentSuccessMessage("Call group has been marked as on");
				Thread.sleep(5000);
			}
		} finally {
			ExtentSuccessMessage("Call Group is on");

		}

		Thread.sleep(3000);
		By CallGroupNumber = By.xpath("//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]/parent::span/u");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupNumber));
		String number = element.getText();
		System.out.println(number);
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been minimie");

		Thread.sleep(2000);

		TabSwitchToSubChild();

		waitForElement(4000);
		By CTIInputField = By.xpath("//input[@placeholder='Enter Phone Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Number has been in input field" + number);

		Thread.sleep(3000);
		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		TabSwitchToParent();

		Thread.sleep(3000);
		By IncomingCallTitle = By.xpath("//a[@title='Incoming Call Count']");
		Assert.assertTrue(driver.findElement(IncomingCallTitle).isDisplayed());
		ExtentSuccessMessage("Incoming call ttle is been displayed for fist user");

		TabSwitchToChild();
		Assert.assertTrue(driver.findElement(IncomingCallTitle).isDisplayed());
		ExtentSuccessMessage("Incoming call ttle is been displayed for fist user");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(IncomingCallTitle));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Incoming bro");

		By Groupname = By.xpath("(//div[@class='voice-call-ongoing-number cti-group-name ng-scope'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Groupname));
		String name = element.getText();
		System.out.println(name);

		String timeString = StringUtils.substringAfter(name, ": ");
		System.out.println(timeString);
		Assert.assertEquals(timeString, "AutoBroadCasting");

		By Number = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-incoming-window > div:nth-child(2)");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Number));
		String number1 = element.getText();
		System.out.println(number1);

		By AcceptCall = By.cssSelector("#AcceptIncomingTrigger");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Accept Call");

		Thread.sleep(3000);

		TabSwitchToParent();

		Thread.sleep(3000);
		By Dashboard = By.xpath("//a[@class='glyphicon fa fa-fw fa-dashboard']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Dashboard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on dashboard");

		By drop_down_telephone_setup = By.xpath("//a[@ng-click='navigateToTelephony()']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(drop_down_telephone_setup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on telephone setup dropdown");

		Thread.sleep(4000);
		By MinimizeCTI = By.xpath("//a[@title='Minimize']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MinimizeCTI));
		MoveToElementClick(element);

		Thread.sleep(2000);

		By Frame = By.xpath("//iframe[@class='ng-scope ng-isolate-scope']");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(3000);

		Thread.sleep(5000);
		By CustomerNumber = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[7]/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomerNumber));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String number2 = element.getText();
		System.out.println(number2);

		Assert.assertEquals(number2, number3);
		ExtentSuccessMessage("Assertion for Third number is done as a customer Number");

		By CallDirection = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[12]/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDirection));
//		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String direction = element.getText();
		System.out.println(direction);

		Thread.sleep(2000);
		Assert.assertEquals(direction, "Inbound");
		ExtentSuccessMessage("Assertion for Outbound Call Direction is done");

		By CallGrpName = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[14]/div/div/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGrpName));
		String callgrpname = element.getText();
		System.out.println(callgrpname);

		Assert.assertEquals(callgrpname, "AutoBroadCasting");
		ExtentSuccessMessage("Assertion for call group is done in Agent dashboard");

		Thread.sleep(3000);
		By Whisper = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button/i[@class='fa fa-wifi']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Whisper));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Whisper Icon");

		Thread.sleep(2000);
		WebElement popup = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='swal2-title']")));
		ExtentSuccessMessage("Assertion for Whisper popup is done");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		By WhisperCall = By.xpath("//div[@class='voice-call-window-minimized admin-action ng-scope']");
		Assert.assertTrue(driver.findElement(WhisperCall).isDisplayed());

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(8000);
		By EndWhispering = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button[@title='End Whispering']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EndWhispering));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on End Whisper Icon");

		Thread.sleep(3000);
		WebElement popup1 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='swal2-title']")));
		ExtentSuccessMessage("Assertion for Whisper popup is done after ending the call");

		ExtentSuccessMessage("---------------Whisper Completed-----------------");

		By Monitor = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button/i[@class='fa fa-eye']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Monitor));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Start Monitor Icon");

		Thread.sleep(3000);
		WebElement popup2 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='swal2-title']")));
		ExtentSuccessMessage("Assertion for Monitor popup is done");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Assert.assertTrue(driver.findElement(WhisperCall).isDisplayed());
		ExtentSuccessMessage("Monitor CTI Popup is Visible");

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(4000);
		By EndMonitoring = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button[@title='End Monitoring']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EndMonitoring));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on End Monitor Icon");

		Thread.sleep(3000);
		WebElement popup3 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='swal2-title']")));
		ExtentSuccessMessage("Assertion for Monitor popup is done after ending the call");

		ExtentSuccessMessage("---------------Monitor Completed-----------------");

		Thread.sleep(3000);
		By Barge = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Barge));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Start Barge Icon");

		Thread.sleep(3000);
		WebElement popup4 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='swal2-title']")));
		ExtentSuccessMessage("Assertion for Barge popup is done");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(WhisperCall).isDisplayed());
		ExtentSuccessMessage("Barge CTI Popup is Visible");

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(4000);
		By EndBarging = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button[@title='End Barging']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EndBarging));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on End Barging Icon");

		Thread.sleep(3000);
		WebElement popup5 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='swal2-title']")));
		ExtentSuccessMessage("Assertion for Barging popup is done after ending the call");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Thread.sleep(3000);

		By Home = By.xpath("//a[@name='menu_home']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Home Icon ");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);
		By CallGroupName = By
				.xpath("//span[@title='Call Group']/i[contains(.,'AutoBroadCasting')]/ancestor::tr/td[5]/div/a/i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been marked as Off");
		Thread.sleep(5000);

		logout_CE_validations();
		Thread.sleep(2000);

		TabSwitchToChild();

		driver.navigate().refresh();
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been marked as Off");

	}

	public void BC_Conference_Brb() throws InterruptedException, IOException, ParseException, java.text.ParseException {
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		fetchNumber1();
		Fetch_Profile_Name();
		splitthewindowscreen2("Left");// login ceuserone
		new_Tab();
		SecondUserForTransfer();
		login_CE_validations();
		fetchNumber();

		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Right");
		ThirdUser();
		login_CE_validations();
		Admin_redirection();
		CUstom_Status_SetupWithtext("Be Right Back");
		String Thirdusernumber = GetElementText(UserNumber);
		System.out.println(Thirdusernumber);
		TabSwitchToParent();
		String Groupname = "AutoGroup_" + generateRandom3DigitNumber();
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToGroupCallPage();
		RefreshPage();
		Thread.sleep(25000);
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.ClickOnCreateGroupCallsTab();
		Thread.sleep(10000);
		TelephonyPage.EnterCallGroupname("BC_" + Groupname);

		SelectCallGroupnumber();
		TelephonyPage.ClickOnBoardcastOption();
		TelephonyPage.ClickOnNextButton();
		TelephonyPage.EnterCallGroupmembername(firstnumber);
//		TelephonyPage.EnterCallGroupmembername(Session1_Number);
		TelephonyPage.ClickOnDoneButton();
		TelephonyPage.EnterSearchBar("BC_" + Groupname);
		By Grid = By.xpath("//*[text()='" + "BC_" + Groupname + "']");
		click(Grid);
		TabSwitchToChild();
		// TabSwitchToSubChild();
		TelephonyPage.ClickOnCallGrouptab();
		TelephonyPage.ClickOnOnorOffSwitch("BC_" + Groupname);
		TabSwitchToParent();

		By Click_cti = By.xpath("(//i[@class='fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_cti));
		MoveToElementClick(element);
//		TelephonyPage.ClickOnCallIcon();
		// HomePage.ClickedOnMaximiseDiller();
		// Thread.sleep(5000);
		CustomerEngageFunctionalityValidations.CalltoUser(Groupnumber);

		TabSwitchToChild();
		TelephonyPage.ClickOnIncomingCallNotification();
		System.out.println("");
		Accept_Call();
		Add_Conference(Thirdusernumber);
		TabSwitchToSubChild();
		Home_Redirection();
		Admin_redirection();
		Telephone_Setup();
		maximizeWindow();
		Admin_Validations_Call_Offline();
		ExtentSuccessMessage(
				"**********************BC BRb Conference AdminCall log status *********************************");

		Home_Redirection();
		Call_Log_Status_OFfline(Conference_time);
		ExtentSuccessMessage(
				"**********************BC BRb Conference Cti Call Log  status *********************************");

		logout_CE_validations();
		TabSwitchToParent();

	}


	public void TabSwitchToThirdWindow() throws InterruptedException {
		ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(Tabs.size());
		driver.switchTo().window(Tabs.get(2));
//		Thread.sleep(5000);
		ExtentSuccessMessage("Tab Switched from parent to child");
//		Thread.sleep(2000);
	}


	public void Custom_Cti_Conference()
			throws InterruptedException, IOException, ParseException, java.text.ParseException {
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		fetchNumber1();
		Fetch_Profile_Name();
		splitthewindowscreen2("Left");// login ceuserone
		new_Tab();
		SecondUserForTransfer();
		login_CE_validations();

		fetchNumber();
		// CUstom_Status_Setup();

		Admin_redirection();

		CUstom_Status_Setup_Online();
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Right");
		ThirdUser();
		login_CE_validations();
		String Thirdusernumber = GetElementText(UserNumber);
		System.out.println(Thirdusernumber);
		TabSwitchToParent();
		String Groupname = "AutoGroup_" + generateRandom3DigitNumber();
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToGroupCallPage();
		RefreshPage();
		Thread.sleep(25000);
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.ClickOnCreateGroupCallsTab();
		Thread.sleep(10000);
		TelephonyPage.EnterCallGroupname("BC_" + Groupname);

		SelectCallGroupnumber();
		TelephonyPage.ClickOnBoardcastOption();
		TelephonyPage.ClickOnNextButton();
		TelephonyPage.EnterCallGroupmembername(firstnumber);
//		TelephonyPage.EnterCallGroupmembername(Session1_Number);
		TelephonyPage.ClickOnDoneButton();
		TelephonyPage.EnterSearchBar("BC_" + Groupname);
		By Grid = By.xpath("//*[text()='" + "BC_" + Groupname + "']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Grid));
		MoveToElementClick(element);
		TabSwitchToChild();
		// TabSwitchToSubChild();
		TelephonyPage.ClickOnCallGrouptab();
		TelephonyPage.ClickOnOnorOffSwitch("BC_" + Groupname);
		// TabSwitchToParent();
		TabSwitchToSubChild();

//		TelephonyPage.ClickOnCallIcon();
		// HomePage.ClickedOnMaximiseDiller();
		// Thread.sleep(5000);
		CustomerEngageFunctionalityValidations.CalltoUser(Groupnumber);
		TabSwitchToChild();
		TelephonyPage.ClickOnIncomingCallNotification();
		System.out.println("");
		Accept_Call();
		Add_Conference(Session1_Number);

		// transferCall_Admin();
		// Add_Conference(Session1_Number);
		Thread.sleep(4000);

		TabSwitchToParent();
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		Thread.sleep(1000);
//		TabSwitchToChild();
		// transferAssertion();////missed call will be here
		// Offline_Assertion();
		Home_Redirection();
		Admin_redirection();
		Telephone_Setup();
		maximizeWindow();
		Admin_Validations_Call_Offline();
		Home_Redirection();
		Call_Log_Status_Online(Offline_time);
		logout_CE_validations();
		TabSwitchToParent();
	}

	public void validateMisscalledDetails(String Value) throws InterruptedException {
		By elements = By.xpath("(//*[@class='ui-grid-canvas']//*[contains(text(),'" + Value + "')])[1]");
		if (ElementDisplayed(elements)) {
			ExtentSuccessMessage("Successfully user able to See the '" + Value + "'inside the web table ");

		} else {
			ExtentErrorMessage("Unsuccessfully  '" + Value + "' Not visible inside the web table");
		}

	}

	public void ClickOnDeleteGroup() throws InterruptedException {
		if (ElementDisplayed(DeleteGroup)) {
			ExtentSuccessMessage("Successfully user able to See 'Delete Group Icon' ");
			click(DeleteGroup);
			ExtentSuccessMessage("Successfully user Clicked on 'Delete Group Icon' ");
			Thread.sleep(3000);
			click(ConfirmDeleteGroup);
			ExtentSuccessMessage("Successfully user Clicked on 'Deactivate Group Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'Delete Group' Not visible");
		}
	}

	public void BF_Ringless_Transfer_Agent() throws InterruptedException, IOException, ParseException {

		fetchNumber1();
		new_Tab();
		SecondUserForBC();
		new_Tab();
		ThirdUserforTransfer();

		TabSwitchToParent();

		Thread.sleep(2000);
		By CallGroup = By.xpath("//a[@title='Call Groups']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(3000);
		By CallGroupNumber = By
				.xpath("//span[@title='Call Group']/i[contains(.,'AutomationRLCallGroup')]/parent::span/u");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupNumber));
		String number = element.getText();
		System.out.println(number);
		Thread.sleep(5000);

		Thread.sleep(2000);
		try {

			WebElement button = driver.findElement(By.xpath(
					"//span[@title='Call Group']/i[contains(.,'AutomationRLCallGroup')]/ancestor::tr/td[5]/div/a/i"));
			String buttonState = button.getAttribute("title");
			System.out.println(buttonState);
			if (buttonState.contains("On")) { // Replace with the actual state-check logic
				System.out.println("Button is On.");

			} else {
				By CallGroupName = By.xpath(
						"//span[@title='Call Group']/i[contains(.,'AutomationRLCallGroup')]/ancestor::tr/td[5]/div/a/i");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
				MoveToElementClick(element);
				ExtentSuccessMessage("Call group has been marked as on");
				Thread.sleep(5000);
			}
		} finally {
			ExtentSuccessMessage("Call Group is on");

		}

		By Minimize = By.xpath("//i[@class='fa fa-minus']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been minimie");

		TabSwitchToChild();

		Thread.sleep(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);
		try {

			WebElement button = driver.findElement(By.xpath(
					"//span[@title='Call Group']/i[contains(.,'AutomationRLCallGroup')]/ancestor::tr/td[5]/div/a/i"));
			String buttonState = button.getAttribute("title");
			System.out.println(buttonState);
			if (buttonState.contains("On")) { // Replace with the actual state-check logic
				System.out.println("Button is On.");

			} else {
				By CallGroupName = By.xpath(
						"//span[@title='Call Group']/i[contains(.,'AutomationRLCallGroup')]/ancestor::tr/td[5]/div/a/i");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
				MoveToElementClick(element);
				ExtentSuccessMessage("Call group has been marked as on");
				Thread.sleep(5000);
			}
		} finally {
			ExtentSuccessMessage("Call Group is on");

		}

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been minimie");

		Thread.sleep(2000);

		TabSwitchToSubChild();

		waitForElement(4000);
		By CTIInputField = By.xpath("//input[@placeholder='Enter Phone Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Number has been in input field" + number);

		Thread.sleep(3000);
		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		String SMS_Time = CurrentTime(); // stored
		System.out.println(SMS_Time);
		String smstime = removeLeadingZero(SMS_Time);
		System.out.println(smstime);

		TabSwitchToParent();

		Thread.sleep(8000);
		try {
			WebElement button = driver.findElement(By.id("AcceptIncomingTrigger"));
			if (!button.isDisplayed()) {
				System.out.println("Button is not displayed");
				ExtentSuccessMessage("Call Button is not displayed");

			} else {
				System.out.println("Button is displayed");
				ExtentErrorMessage("Call Buttin is displayed Ringless is not working");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Button is not present in the DOM");
		}

		Thread.sleep(5000);
		By CallGrpName = By.xpath("(//div[@class='voice-call-ongoing-number cti-group-name ng-scope'])[1]/span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGrpName));
		String grpname = element.getText();
		System.out.println(grpname);

		Assert.assertEquals(grpname, "AutomationRLCallGroup");
		ExtentSuccessMessage("Assertion for Call group name is displayed");

		By TransferCall = By.xpath("//i[@class=' fa fa-calls-transfer ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfer Call By First User");

		Thread.sleep(3000);

		By AgentsTab = By.xpath("(//span[contains(.,'Agents')])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentsTab));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Agents Tab");

		Thread.sleep(4000);
		By SearchFiled = By.xpath("(//input[@value='search'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchFiled));
		MoveToElementClick(element);
		writeText(SearchFiled, profilename + Keys.ENTER);
		ExtentSuccessMessage("Name Searched for Second User to Transfer");

		Thread.sleep(3000);
		By TransferButton = By.xpath("(//span[contains(.,'" + profilename + "')])[2]/u/ancestor::span/button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfer Button");

		String SMS_Time1 = CurrentTime();
		System.out.println(SMS_Time1);
		String smstime1 = removeLeadingZero(SMS_Time1);
		System.out.println(smstime1);

		TabSwitchToChild();

		By AcceptCall = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Accept Call Button");

		Thread.sleep(6000);
		TabSwitchToParent();

		By WarmTransfer = By
				.xpath("//button[@class='voice-call-green-button-small fa fa-phone fa fa-code-fork blue-bg']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(WarmTransfer));
		MoveToElementClick(element);
		ExtentSuccessMessage("Warm Transfer has been done from first user to second user");
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(3000);

		TabSwitchToChild();

		Thread.sleep(8000);

		By DeclineCall = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DeclineCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been declined by second user");

		driver.navigate().refresh();

		Thread.sleep(8000);

		By CalLogs = By.xpath("//a[@title='Call Logs']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CalLogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call logs has been opened");
		Thread.sleep(2000);

		By TimeCount = By.xpath("(//u[@class='message-time date-txt drag-not-allowed ng-binding'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
		String count = element.getText();
		System.out.println(count);
		String timeString = StringUtils.substringAfter(count, " ");
		System.out.println("---------" + timeString);
		String Formatted_Time = removeSeconds(timeString);
		System.out.println("---------" + Formatted_Time);

		boolean isTimeMatching = areTimesMatching(SMS_Time1, Formatted_Time, 1);
		System.out.println(isTimeMatching);

		if (isTimeMatching) {
			System.out.println("Times match or are within the acceptable range.");
			ExtentSuccessMessage("Times match or are within the acceptable range.");

		} else {
			System.err.println("Times do not match.");
			ExtentErrorMessage("Times do not match.");

		}

		ExtentSuccessMessage("Assertion for Call Logs time is done");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		Thread.sleep(2000);
		By Admin_Tile = By.xpath("//span[normalize-space()='Admin']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(8000);

		By Telephonesetup = By.xpath("//a[@href='#/admin/manage-account']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);

		Thread.sleep(5000);
		By Click_On_Viewcall = By.xpath("//button[@id='viceCallLogsBtn']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Viewcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");
		Thread.sleep(5000);

		By RecentCall = By.xpath("(//div[@class='accordion-container grid-style-height'])[1]/i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		By CreatedToday = By.xpath("//md-radio-button[@value='Created Today']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		By CallType = By.xpath("(//div[@class='accordion-container grid-style-height'])[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(2000);
		By TransferedCall = By.xpath("//md-checkbox[@name='Transferred Call']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferedCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfered Call");

		Thread.sleep(4000);

		By Direction = By.xpath("(//div[contains(.,'" + Formatted_Time
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Direction));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		MoveToElementClick(element);
		String direction = element.getText();
		System.out.println(direction);

		Assert.assertEquals(direction, "Transferred");
		ExtentSuccessMessage("Assertion for Direction is done");

		By FromNumber = By.xpath("(//div[contains(.,'" + Formatted_Time
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FromNumber));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String fromnumber = element.getText();
		System.out.println(fromnumber);

		Assert.assertEquals(fromnumber, number3);
		ExtentSuccessMessage("Assertion for From Number is Done");

		By ToNumber = By.xpath("(//div[contains(.,'" + Formatted_Time
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ToNumber));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String tonumber = element.getText();
		System.out.println(tonumber);

		Assert.assertEquals(tonumber, secondnumber);
		ExtentSuccessMessage("Assertion for To Number is Done");

		Thread.sleep(3000);
		WebElement following = driver
				.findElement(By.xpath("(//div[contains(.,'" + Formatted_Time + "')])[14]/following-sibling::div[2]"));
		js.executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'center'});", following);

		Thread.sleep(7000);
		WebElement Transfred = driver.findElement(By.xpath(
				"(//div[@class='ui-grid-cell-contents ng-binding ng-scope'])[3]/../following-sibling::div/div[@title='Yes']"));
		js.executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'center'});", Transfred);
		Thread.sleep(4000);
		String yes = Transfred.getText();
		System.out.println(yes);

		logout_CE_validations();

		TabSwitchToParent();

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		js.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on Admin tile");
		Thread.sleep(8000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Viewcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(RecentCall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on recent Call");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CreatedToday));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Created Today");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call Type");

		Thread.sleep(2000);
		By InboundCAll = By.xpath("//md-checkbox[@name='Inbound Call']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(InboundCAll));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Transfered Call");

		Thread.sleep(4000);

		By Direction1 = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Direction1));
		String direction2 = element.getText();
		System.out.println(direction2);

		Assert.assertEquals(direction2, "Inbound");
		ExtentSuccessMessage("Assertion for direction is done");

		By From1 = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(From1));
		String from1 = element.getText();
		System.out.println(from1);

		Assert.assertEquals(from1, number3);
		ExtentSuccessMessage("Assertion for from nuber is done");

		By To1 = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(To1));
		String to1 = element.getText();
		System.out.println(from1);

		Assert.assertEquals(to1, firstnumber);
		ExtentSuccessMessage("Assertion for To nuber is done");

		By CDRID = By.xpath("(//div[contains(.,'" + smstime
				+ "')])[14]/div/ancestor::div[@class='ui-grid-row ng-scope']/div/div[1]/div/a");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CDRID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on CDR ID");

		Thread.sleep(15000);

		By CallFrom = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[1]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallFrom));
		String callfrom = element.getText();
		System.out.println(callfrom);

		Assert.assertEquals(callfrom, number3);
		ExtentSuccessMessage("Assertion for CallFrom is done in CDR");

		By CallTo = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[2]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTo));
		String callto = element.getText();
		System.out.println(callto);

		Assert.assertEquals(callto, number);
		ExtentSuccessMessage("Assertion for CallTo is done in CDR");

		By CallTypee = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[3]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTypee));
		String calltype = element.getText();
		System.out.println(calltype);

		Assert.assertEquals(calltype, "Incoming Call");
		ExtentSuccessMessage("Assertion for Call Type is done in CDR");

		By CallStatus = By.xpath("(//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'])[4]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallStatus));
		String callstatus = element.getText();
		System.out.println(callstatus);

		Assert.assertEquals(callstatus, "Completed");
		ExtentSuccessMessage("Assertion for Call Status is done in CDR");

		By SID = By.xpath("//div[@class='col-lg-3 col-md-3 col-sm-6 col-xs-12']/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SID));
		String sid = element.getText();
		System.out.println(sid);

		By CallGrp = By.xpath("//div[@class='col-lg-2 col-md-3 col-sm-6 col-xs-12'][10]/p[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGrp));
		String callgrp = element.getText();
		System.out.println(callgrp);

		By Typee = By.xpath("//span[contains(.,'" + number3 + "')]/ancestor::tr/td[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Typee));
		System.out.println(Typee);
		String type = element.getText();
		System.out.println(type);

		Assert.assertEquals(type, "Caller");
		ExtentSuccessMessage("Assertion for Caller type is Done");

		By Type2 = By.xpath("//span[contains(.,'" + username + "')]/ancestor::tr/td[2]");
		System.out.println(Type2);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Type2));
		String type2 = element.getText();
		System.out.println(type2);

		Assert.assertEquals(type2, "Callee");
		ExtentSuccessMessage("Assertion for Caller type is Done");

	}

	public void BF_Ringless_BMW_validation() throws InterruptedException, IOException {

		fetchNumber1();
		new_Tab();
		SecondUserForBC();
		new_Tab();
		ThirdUserforTransfer();

		TabSwitchToChild();

		Thread.sleep(2000);
		By CallGroup = By.xpath("//a[@title='Call Groups']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);

		try {

			WebElement button = driver.findElement(By.xpath(
					"//span[@title='Call Group']/i[contains(.,'AutomationRLCallGroup')]/ancestor::tr/td[5]/div/a/i"));
			String buttonState = button.getAttribute("title");
			System.out.println(buttonState);
			if (buttonState.contains("On")) { // Replace with the actual state-check logic
				System.out.println("Button is On.");

			} else {
				By CallGroupName = By.xpath(
						"//span[@title='Call Group']/i[contains(.,'AutomationRLCallGroup')]/ancestor::tr/td[5]/div/a/i");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
				MoveToElementClick(element);
				ExtentSuccessMessage("Call group has been marked as on");
				Thread.sleep(5000);
			}
		} finally {
			ExtentSuccessMessage("Call Group is on");

		}

		Thread.sleep(5000);

		By Minimize = By.xpath("//i[@class='fa fa-minus']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been minimie");

		TabSwitchToParent();

		Thread.sleep(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);

		try {

			WebElement button = driver.findElement(By.xpath(
					"//span[@title='Call Group']/i[contains(.,'AutomationRLCallGroup')]/ancestor::tr/td[5]/div/a/i"));
			String buttonState = button.getAttribute("title");
			System.out.println(buttonState);
			if (buttonState.contains("On")) { // Replace with the actual state-check logic
				System.out.println("Button is On.");

			} else {
				By CallGroupName = By.xpath(
						"//span[@title='Call Group']/i[contains(.,'AutomationRLCallGroup')]/ancestor::tr/td[5]/div/a/i");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
				MoveToElementClick(element);
				ExtentSuccessMessage("Call group has been marked as on");
				Thread.sleep(5000);
			}
		} finally {
			ExtentSuccessMessage("Call Group is on");

		}
		Thread.sleep(5000);
		By CallGroupNumber = By
				.xpath("//span[@title='Call Group']/i[contains(.,'AutomationRLCallGroup')]/parent::span/u");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupNumber));
		String number = element.getText();
		System.out.println(number);

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been minimie");

		Thread.sleep(2000);

		TabSwitchToSubChild();

		waitForElement(4000);
		By CTIInputField = By.xpath("//input[@placeholder='Enter Phone Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		writeText(CTIInputField, number);
		ExtentSuccessMessage("Number has been in input field" + number);

		Thread.sleep(3000);
		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");

		TabSwitchToChild();

		Thread.sleep(4000);
		try {
			WebElement button = driver.findElement(By.id("AcceptIncomingTrigger"));
			if (!button.isDisplayed()) {
				System.out.println("Button is not displayed");
				ExtentSuccessMessage("Call Button is not displayed");

			} else {
				System.out.println("Button is displayed");
				ExtentErrorMessage("Call Buttin is displayed Ringless is not working");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Button is not present in the DOM");
		}

		Thread.sleep(5000);
		By CallGrpName = By.xpath("(//div[@class='voice-call-ongoing-number cti-group-name ng-scope'])[1]/span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGrpName));
		String grpname = element.getText();
		System.out.println(grpname);

		Assert.assertEquals(grpname, "AutomationRLCallGroup");
		ExtentSuccessMessage("Assertion for Call group name is displayed");

		TabSwitchToParent();

		Thread.sleep(3000);
		By Dashboard = By.xpath("//a[@class='glyphicon fa fa-fw fa-dashboard']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Dashboard));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on dashboard");

		By drop_down_telephone_setup = By.xpath("//a[@ng-click='navigateToTelephony()']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(drop_down_telephone_setup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on telephone setup dropdown");

		Thread.sleep(4000);
		By MinimizeCTI = By.xpath("//a[@title='Minimize']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MinimizeCTI));
		MoveToElementClick(element);

		By Frame = By.xpath("//iframe[@id='angularIframe']");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(5000);
		By CustomerNumber = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[7]/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomerNumber));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String number2 = element.getText();
		System.out.println(number2);

		Assert.assertEquals(number2, number3);
		ExtentSuccessMessage("Assertion for Third number is done as a customer Number");

		By CallDirection = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[12]/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDirection));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		String direction = element.getText();
		System.out.println(direction);

		Thread.sleep(2000);
		Assert.assertEquals(direction, "Inbound");
		ExtentSuccessMessage("Assertion for Outbound Call Direction is done");

		By CallGrpNamee = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[14]/div/div/div");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGrpNamee));
		String callgrpname = element.getText();
		System.out.println(callgrpname);

		Assert.assertEquals(callgrpname, "AutomationRLCallGroup");
		ExtentSuccessMessage("Assertion for call group is done in Agent dashboard");

		Thread.sleep(3000);
		By Whisper = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button/i[@class='fa fa-wifi']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Whisper));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Whisper Icon");

		Thread.sleep(2000);
		WebElement popup = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='swal2-title']")));
		ExtentSuccessMessage("Assertion for Whisper popup is done");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		By WhisperCall = By.xpath("//div[@class='voice-call-window-minimized admin-action ng-scope']");
		Assert.assertTrue(driver.findElement(WhisperCall).isDisplayed());

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(8000);
		By EndWhispering = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button[@title='End Whispering']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EndWhispering));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on End Whisper Icon");

		Thread.sleep(3000);
		WebElement popup1 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='swal2-title']")));
		ExtentSuccessMessage("Assertion for Whisper popup is done after ending the call");

		ExtentSuccessMessage("---------------Whisper Completed-----------------");

		By Monitor = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button/i[@class='fa fa-eye']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Monitor));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Start Monitor Icon");

		Thread.sleep(3000);
		WebElement popup2 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='swal2-title']")));
		ExtentSuccessMessage("Assertion for Monitor popup is done");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Assert.assertTrue(driver.findElement(WhisperCall).isDisplayed());
		ExtentSuccessMessage("Monitor CTI Popup is Visible");

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(4000);
		By EndMonitoring = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button[@title='End Monitoring']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EndMonitoring));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on End Monitor Icon");

		Thread.sleep(3000);
		WebElement popup3 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='swal2-title']")));
		ExtentSuccessMessage("Assertion for Monitor popup is done after ending the call");

		ExtentSuccessMessage("---------------Monitor Completed-----------------");

		Thread.sleep(3000);
		By Barge = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button[3]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Barge));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Start Barge Icon");

		Thread.sleep(3000);
		WebElement popup4 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='swal2-title']")));
		ExtentSuccessMessage("Assertion for Barge popup is done");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(WhisperCall).isDisplayed());
		ExtentSuccessMessage("Barge CTI Popup is Visible");

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
		ExtentSuccessMessage("Switched into Frame");

		Thread.sleep(4000);
		By EndBarging = By.xpath("//tbody[@class='p-element p-datatable-tbody p-scroller-content']/tr[contains(.,'"
				+ profilename + "')]/td[16]/div/div/button[@title='End Barging']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EndBarging));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on End Barging Icon");

		Thread.sleep(3000);
		WebElement popup5 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-labelledby='swal2-title']")));
		ExtentSuccessMessage("Assertion for Barging popup is done after ending the call");

		driver.switchTo().defaultContent();
		ExtentSuccessMessage("Switched from frame to default browser");

		Thread.sleep(3000);

		By Home = By.xpath("//a[@name='menu_home']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Home Icon ");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);
		By CallGroupName = By
				.xpath("//span[@title='Call Group']/i[contains(.,'AutomationRLCallGroup')]/ancestor::tr/td[5]/div/a/i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been marked as Off");
		Thread.sleep(5000);

		logout_CE_validations();
		Thread.sleep(2000);

		TabSwitchToChild();

		driver.navigate().refresh();
		Thread.sleep(5000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call group Icon");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallGroupName));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call group has been marked as Off");

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
	}

	public void BF_Ringless_Custom_Conference() throws InterruptedException, IOException, ParseException {
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		fetchNumber1();
		Fetch_Profile_Name();
		splitthewindowscreen2("Left");// login ceuserone
		new_Tab();
		SecondUserForTransfer();
		login_CE_validations();

		fetchNumber();

		Admin_redirection();

		CUstom_Status_Setup_Online();
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Right");
		ThirdUser();
		login_CE_validations();
		String Thirdusernumber = GetElementText(UserNumber);
		System.out.println(Thirdusernumber);
		TabSwitchToParent();
		String Groupname = "AutoGroup_" + generateRandom3DigitNumber();
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToGroupCallPage();
		RefreshPage();
		Thread.sleep(25000);
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.ClickOnCreateGroupCallsTab();
		Thread.sleep(10000);
		TelephonyPage.EnterCallGroupname("BF_RL_" + Groupname);

		SelectCallGroupnumber();
		TelephonyPage.ClickOnBestFitOption();
		TelephonyPage.ClickOnRinglessCheckBox();
		TelephonyPage.ClickOnNextButton();
		TelephonyPage.EnterCallGroupmembername(firstnumber);
		TelephonyPage.ClickOnDoneButton();
		TelephonyPage.EnterSearchBar("BF_RL_" + Groupname);

		TabSwitchToChild();
		TelephonyPage.ClickOnCallGrouptab();
		TelephonyPage.ClickOnOnorOffSwitch("BF_RL_" + Groupname);
		TabSwitchToSubChild();
		// HomePage.ClickedOnMaximiseDiller();
		Thread.sleep(5000);

		CalltoUser(Groupnumber);
		TabSwitchToChild();
		Thread.sleep(4000);
		String ActualGroupname = GroupnameFromDialller();
		Assert.assertEquals(ActualGroupname, "BF_RL_" + Groupname);
		ExtentSuccessMessage("Assertion for Group Name is done");
		ExtentSuccessMessage(
				"**********************BestFit RL Custom Conference Activity status *********************************");

		TabSwitchToChild();

		Conference(Session1_Number);

		Thread.sleep(4000);

		TabSwitchToParent();
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		Thread.sleep(1000);
//		TabSwitchToChild();
		// transferAssertion();////missed call will be here
		// Offline_Assertion();
		Home_Redirection();
		Admin_redirection();
		Telephone_Setup();
		maximizeWindow();
		Transfer_Admin_Validations_Call_Offline(Conference_time);
		ExtentSuccessMessage(
				"**********************BestFit RL Custom Conference Admin logs  *********************************");

		Home_Redirection();
		Call_Log_Status_Online(Conference_time);
		ExtentSuccessMessage(
				"**********************BestFit RL Custom Conference CTI Call Logs  *********************************");

		logout_CE_validations();
		TabSwitchToChild();
	}

	public void BF_RG_Admin_Call_Log_Satus_BeRight_Back()
			throws InterruptedException, IOException, ParseException, java.text.ParseException {
		System.out.println("Start_TC_CTI_BF_RG_Transfer_To_Agent_BeRight_Back_Activity_Status");
		ExtentSuccessMessage("Start_TC_CTI_BF_RG_Transfer_To_Agent_BeRight_Back_Activity_Status");
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		fetchNumber1();
		String Firstusernumber = GetElementText(UserNumber);
		System.out.println(Firstusernumber);
		splitthewindowscreen2("Left");// login ceuserone
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Right");
		SecondLoginUser();
		login_CE_validations();
		fetchNumber();
		new_Tab();
		ThirdUserLogin();
		login_CE_validations();
		String Thirdusernumber = GetElementText(UserNumber);
		System.out.println(Thirdusernumber);
		Admin_redirection();
		CUstom_Status_SetupWithtext("BeRight_Back");
		TabSwitchToParent();
		String Groupname = "BF_RG_" + generateRandomText();
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToGroupCallPage();
		RefreshPage();
		Thread.sleep(25000);
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.ClickOnCreateGroupCallsTab();
		Thread.sleep(10000);
		TelephonyPage.EnterCallGroupname(Groupname);

		SelectCallGroupnumber();
		TelephonyPage.ClickOnBestFitOption();
		TelephonyPage.ClickOnNextButton();
		TelephonyPage.EnterCallGroupmembername(firstnumber);
		TelephonyPage.ClickOnDoneButton();
		TelephonyPage.EnterSearchBar(Groupname);

		TabSwitchToChild();
		TelephonyPage.ClickOnCallGrouptab();
		TelephonyPage.ClickOnOnorOffSwitch(Groupname);
		TabSwitchToParent();
		HomePage.ClickedOnMaximiseDiller();
		Thread.sleep(5000);
		CustomerEngageFunctionalityValidations.CalltoUser(Groupnumber);
		TabSwitchToChild();
		Thread.sleep(4000);
		String ActualGroupname = GroupnameFromDialller();
		Assert.assertEquals(ActualGroupname, Groupname);
		ExtentSuccessMessage("Assertion for Group Name is done");
		transferToagentBFRinglessCall(Thirdusernumber);
		TabSwitchToThirdWindow();
		ExtentSuccessMessage("*******Start Missed call On SSE_notification Tab***************");
		By MissedsmsPopup = By.xpath("//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight']");
		if (ElementDisplayed(MissedsmsPopup)) {
			Assert.assertTrue(driver.findElement(MissedsmsPopup).isDisplayed());
			ExtentSuccessMessage("Successfully user able to See the 'Missed Call Popup' ");
		} else {
			ExtentErrorMessage("Unsuccessfully user not able to See the 'Missed Call Popup' ");
		}
		ExtentSuccessMessage("Assertion for missed SMS popup is done");
		ExtentSuccessMessage("*******End Inbound SMS On SSE_notification Tab***************");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("End_TC_CTI_BF_RG_Transfer_To_Agent_BeRight_Back_Activity_Status");
		ExtentSuccessMessage("End_TC_CTI_BF_RG_Transfer_To_Agent_BeRight_Back_Activity_Status");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BF_RG_Transfer_To_Agent_BeRight_Back_Admin_call_logs");
		ExtentSuccessMessage("Start_TC_CTI_BF_RG_Transfer_To_Agent_BeRight_Back_Admin_call_logs");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		CustomerEngageFunctionalityValidations.ClickOnHomepage();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
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
		validateMisscalledDetails(Present_time);
		validateMisscalledDetails(Firstusernumber);
		validateMisscalledDetails(Thirdusernumber);
		System.out.println("End_TC_CTI_BF_RG_Transfer_To_Agent_BeRight_Back_Admin_call_logs");
		ExtentSuccessMessage("End_TC_CTI_BF_RG_Transfer_To_Agent_BeRight_Back_Admin_call_logs");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BF_RG_Transfer_To_Agent_BeRight_Back_CTI_CallLogs");
		ExtentSuccessMessage("Start_TC_CTI_BF_RG_Transfer_To_Agent_BeRight_Back_CTI_CallLogs");
		splitthewindowscreen2("Left");
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
			By TimeCount = By.xpath("(//span[@class='call-time-section'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
			String count = element.getText();
			System.out.println(count);
			String timeString = StringUtils.substringAfter(count, " ");
			System.out.println("---------" + timeString);
			ExtentSuccessMessage("Full Number Assertion Done");
		}
		ExtentSuccessMessage("End_TC_CTI_BF_RG_Transfer_To_Agent_BeRight_Back_CTI_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");
		logout_CE_validations();
		TabSwitchToParent();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ClickOnDeleteGroup();
		logout_CE_validations();
		TabSwitchToChild();

	}

	public void BF_RG_Admin_Call_Log_Satus_Online()
			throws InterruptedException, IOException, ParseException, java.text.ParseException {
		System.out.println("Start_TC_CTI_BF_RG_Transfer_To_Agent_Online_Activity_Status");
		ExtentSuccessMessage("Start_TC_CTI_BF_RG_Transfer_To_Agent_Online_Activity_Status");
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		fetchNumber1();
		String Firstusernumber = GetElementText(UserNumber);
		System.out.println(Firstusernumber);
		splitthewindowscreen2("Left");// login ceuserone
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Right");
		SecondLoginUser();
		login_CE_validations();
		fetchNumber();
		new_Tab();
		ThirdUserLogin();
		login_CE_validations();
		String Thirdusernumber = GetElementText(UserNumber);
		System.out.println(Thirdusernumber);
		TabSwitchToParent();
		String Groupname = generateRandomText();
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToGroupCallPage();
		RefreshPage();
		Thread.sleep(25000);
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.ClickOnCreateGroupCallsTab();
		Thread.sleep(10000);
		TelephonyPage.EnterCallGroupname("BF_RG_" + Groupname);

		SelectCallGroupnumber();
		TelephonyPage.ClickOnBestFitOption();
		TelephonyPage.ClickOnNextButton();
		TelephonyPage.EnterCallGroupmembername(firstnumber);
		TelephonyPage.ClickOnDoneButton();
		TelephonyPage.EnterSearchBar("BF_RG_" + Groupname);

		TabSwitchToChild();
		TelephonyPage.ClickOnCallGrouptab();
		TelephonyPage.ClickOnOnorOffSwitch("BF_RG_" + Groupname);
		TabSwitchToParent();
		HomePage.ClickedOnMaximiseDiller();
		Thread.sleep(5000);

		CustomerEngageFunctionalityValidations.CalltoUser(Groupnumber);
		TabSwitchToChild();
//		Thread.sleep(4000);
//		String ActualGroupname=GroupnameFromDialller();
//		Assert.assertEquals(ActualGroupname, "BF_RG_"+Groupname);
//		ExtentSuccessMessage("Assertion for Group Name is done");
		transferToagentCall(Thirdusernumber);
		Thread.sleep(4000);

		TabSwitchToThirdWindow();
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		Thread.sleep(1000);
		System.out.println("End_TC_CTI_BF_RG_Transfer_To_Agent_Online_Activity_Status");
		ExtentSuccessMessage("End_TC_CTI_BF_RG_Transfer_To_Agent_Online_Activity_Status");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BF_RG_Transfer_To_Agent_Online_Admin_call_logs");
		ExtentSuccessMessage("Start_TC_CTI_BF_RG_Transfer_To_Agent_Online_Admin_call_logs");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		CustomerEngageFunctionalityValidations.ClickOnHomepage();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		TelephonyPage.NavigateToTelephonySetpPage();
		Thread.sleep(15000);
		TelephonyPage.ClickOnCallSMSFAXLogsManagement();
		driver.manage().window().maximize();
		RefreshPage();
		Thread.sleep(15000);
		TelephonyPage.ClickOnCallTypeFilter();
		Thread.sleep(5000);
		click(CalltypeInboundcall);
		Thread.sleep(5000);
		TelephonyPage.EnterSearchBar(Firstusernumber);
		Thread.sleep(5000);
		validateMisscalledDetails(Present_time);
		validateMisscalledDetails(Firstusernumber);
		validateMisscalledDetails(Thirdusernumber);
		System.out.println("End_TC_CTI_BF_RG_Transfer_To_Agent_Online_Admin_call_logs");
		ExtentSuccessMessage("End_TC_CTI_BF_RG_Transfer_To_Agent_Online_Admin_call_logs");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BF_RG_Transfer_To_Agent_Online_CTI_CallLogs");
		ExtentSuccessMessage("Start_TC_CTI_BF_RG_Transfer_To_Agent_Online_CTI_CallLogs");
		splitthewindowscreen2("Left");
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
			By TimeCount = By.xpath("(//span[@class='call-time-section'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
			String count = element.getText();
			System.out.println(count);
			String timeString = StringUtils.substringAfter(count, " ");
			System.out.println("---------" + timeString);
			ExtentSuccessMessage("Full Number Assertion Done");
		}
		ExtentSuccessMessage("End_TC_CTI_BF_RG_Transfer_To_Agent_Online_CTI_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");
		logout_CE_validations();
		TabSwitchToParent();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ClickOnDeleteGroup();
		logout_CE_validations();
		TabSwitchToChild();

	}

	public void validateCallLogsTime(String Value) throws InterruptedException {
		System.out.println("Time = " + Value);
		// By elements =By.xpath("(//div[contains(.,'"+Value+"')])[14]");
		By elements = By.xpath("(//div[@role='gridcell'])[7]");
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

	public void BF_RL_Online_confrence_Call() throws InterruptedException, IOException {
		System.out.println("Start_TC_CTI_BF_RL_Confrence_To_Agent_Online_Activity_Status");
		ExtentSuccessMessage("Start_TC_CTI_BF_RL_Confrence_To_Agent_Online_Activity_Status");
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		fetchNumber1();
		Thread.sleep(5000);
		String Firstusernumber = GetElementText(UserNumber);
		System.out.println(Firstusernumber);
		// login ceuserone
		new_Tab();
		maximizeWindow();
		SecondLoginUser();
		login_CE_validations();
		fetchNumber();		
		String Secondusernumber = GetElementText(UserNumber);
		System.out.println(Secondusernumber);
//		splitthewindowscreen2("Right");
		new_Window();		
		ThirdUserLogin();
		login_CE_validations();
//		splitthewindowscreen2("Left");
		Thread.sleep(5000);
		String Thirdusernumber = GetElementText(UserNumber);
		System.out.println(Thirdusernumber);
		TabSwitchToParent();
		String Groupname = "Automation_BFRLConference";
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToGroupCallPage();
		RefreshPage();
		Thread.sleep(25000);
		TelephonyPage.ClickOnMinimizeCallwindow();

		TelephonyPage.EnterSearchBar(Groupname);
		WaitUntillPAgeLoad();
//		Thread.sleep(15000);
		By Phonenumber =By.xpath("(//div[@class='ng-binding ng-scope'])[1]");
		By Elementsfromrow = By.xpath("(//*[@role='row'][@row-render-index='rowRenderIndex']//div//a)[1]");
		By NoRecordFound =By.xpath("//*[@class='watermarkNoData ng-scope'][text()='No data available']");
		String groupnameFromrow = null;
		if(ElementDisplayed(Elementsfromrow)) {
			groupnameFromrow =GetElementText(Elementsfromrow);
		}				
		
		if(!ElementDisplayed(NoRecordFound)) {			
			ExtentSuccessMessage("Call group is already present");
			Groupnumber=GetElementText(Phonenumber);
			System.out.println("Groupnumber:-"+Groupnumber);
		
		}else {
		
		TelephonyPage.ClickOnCreateGroupCallsTab();
		Thread.sleep(10000);
		TelephonyPage.EnterCallGroupname(Groupname);

		SelectCallGroupnumber();
		TelephonyPage.ClickOnBestFitOption();
		TelephonyPage.ClickOnRinglessCheckBox();
		TelephonyPage.ClickOnNextButton();
		TelephonyPage.EnterCallGroupmembername(Secondusernumber);
		TelephonyPage.ClickOnDoneButton();
		TelephonyPage.EnterSearchBar(Groupname);
		Thread.sleep(8000);
		if(!ElementDisplayed(NoRecordFound)) {			
			ExtentSuccessMessage("Call group is already present");
			Groupnumber=GetElementText(Phonenumber);
			System.out.println("Groupnumber:-"+Groupnumber);
		}
		}
//		HomePage.ClickedOnMaximiseDiller();
//		TelephonyPage.ClickOnCallGrouptab();
//		TelephonyPage.ClickOnOnorOffSwitch(Groupname);
		TabSwitchToChild();
		TelephonyPage.ClickOnCallGrouptab();
		TelephonyPage.ClickOnOnorOffSwitch(Groupname);
//		TabSwitchToParent();
		TabSwitchToThirdWindow();
//		HomePage.ClickedOnMaximiseDiller();
		Thread.sleep(5000);

		CustomerEngageFunctionalityValidations.CalltoUser(Groupnumber);
		TabSwitchToChild();
//		Thread.sleep(2000);
		String ActualGroupname = GroupnameFromDialller();
		Assert.assertEquals(ActualGroupname, Groupname);
		ExtentSuccessMessage("Assertion for Group Name is done");

		// CalltoUser(Secondusernumber);
		// String Firstusernumbe1=GetElementText(UserNumber);
		// System.out.println(Firstusernumbe1);
		// TabSwitchToChild();
		// element =
		// wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		// NumberOutput1=element.getText();
		// System.out.println(NumberOutput1);
		// Assert.assertEquals(NumberOutput1, Firstusernumber);
		// ExtentSuccessMessage("Assertion has been done");

//		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
//		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceAddButton));
		MoveToElementClick(element);
		CustomerEngageFunctionalityValidations.ClickoNMinimizecallscriptspopup();

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceNumberField));
		MoveToElementClick(element);

		writeText(ConfrenceNumberField, Firstusernumber);
		time = Currenttime();
		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallConfreanceButton));
		MoveToElementClick(element);
		Callingtime=Currenttime();
		Thread.sleep(1000);
//		TabSwitchToThirdWindow();
		TabSwitchToParent();
		Thread.sleep(4000);
		// element =
		// wait.until(ExpectedConditions.presenceOfElementLocated(UatNumberinQualtia1));
		// NumberOutput1 =element.getText();
		// System.out.println(NumberOutput1);
		// Assert.assertEquals(NumberOutput1, Firstusernumber);
		// ExtentSuccessMessage("Assertiion has been done for confrence");
		//
		//
//				waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		waitForElement(3000);
		CustomerEngageFunctionalityValidations.ClickoNMinimizecallscriptspopup();
		Thread.sleep(10000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		System.out.println("End_TC_CTI_BF_RL_Confrence_To_Agent_Online_Activity_Status");
		ExtentSuccessMessage("End_TC_CTI_BF_RL_Confrence_To_Agent_Online_Activity_Status");
		ExtentSuccessMessage("*****************************************************************************");
		ExtentSuccessMessage("Start_TC_CTI_BF_RL_Conference_Online_Admin_CallLogs");
		System.out.println("Start_TC_CTI_BF_RL_Conference_Online_Admin_CallLogs");
		ClickOnHomepage();
		TelephonyPage.NavigateToTelephonySetpPage();
		driver.manage().window().maximize();
		Thread.sleep(15000);
		TelephonyPage.ClickOnCallSMSFAXLogsManagement();
		Thread.sleep(15000);
		WaitUntillPAgeLoad();
		TelephonyPage.ClickOnCallTypeFilter();
		Thread.sleep(5000);
		click(CalltypeInboundcall);
		Thread.sleep(5000);
		TelephonyPage.EnterSearchBar(Secondusernumber);
		Thread.sleep(5000);
		validateCallLogsTime(time);		
		validateMisscalledDetails(Secondusernumber);
		validateMisscalledDetails(Thirdusernumber);
		ClickonFirstRowId();
		Thread.sleep(8000);
		String TodaysDate =Currentdate();
		String TodaysDates =Currentdate();

		String Values = (Thirdusernumber+","+Secondusernumber+","+"Incoming Call"+","+"Connected"+","+TodaysDates+","+TodaysDate+" "+Callingtimes+","+TodaysDate+" "+Callingtime+","+"NA"+","+"Not DNC Number"+","+Groupname+" *".toUpperCase());
		VerifyBasicCAllsDetails(Values);

//		splitthewindowscreen2("Left");
		ExtentSuccessMessage("End_TC_CTI_BF_RL_Conference_Online_Admin_CallLogs");
		System.out.println("End_TC_CTI_BF_RL_Conference_Online_Admin_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");
		ExtentSuccessMessage("Start_TC_CTI_BF_RL_Conference_Online_CTI_CallLogs");
		System.out.println("Start_TC_CTI_BF_RL_Conference_Online_CTI_CallLogs");
		RefreshPage();
		Thread.sleep(5000);
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
		ExtentSuccessMessage("End_TC_CTI_BF_RL_Conference_Online_CTI_CallLogs");
		System.out.println("End_TC_CTI_BF_RL_Conference_Online_CTI_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");
		logout_CE_validations();
		TabSwitchToChild();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		waitForElement(1000);
		logout_CE_validations();
		TabSwitchToThirdWindow();

	}


	
	public void BF_RG_Online_confrence_Call() throws InterruptedException, IOException {
		System.out.println("Start_TC_CTI_BF_RG_Confrence_To_Agent_Online_Activity_Status");
		ExtentSuccessMessage("Start_TC_CTI_BF_RG_Confrence_To_Agent_Online_Activity_Status");
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		fetchNumber1();
		Thread.sleep(5000);
		String Firstusernumber = GetElementText(UserNumber);
		System.out.println(Firstusernumber);
		// login ceuserone
		new_Tab();
		maximizeWindow();
		SecondLoginUser();
		login_CE_validations();
		fetchNumber();		
		String Secondusernumber = GetElementText(UserNumber);
		System.out.println(Secondusernumber);
//		splitthewindowscreen2("Right");
		new_Window();		
		ThirdUserLogin();
		login_CE_validations();
//		splitthewindowscreen2("Left");
		Thread.sleep(5000);
		String Thirdusernumber = GetElementText(UserNumber);
		System.out.println(Thirdusernumber);
		TabSwitchToParent();
		String Groupname = "Automation_BFRGConference";
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToGroupCallPage();
		RefreshPage();
		Thread.sleep(25000);
		TelephonyPage.ClickOnMinimizeCallwindow();

		TelephonyPage.EnterSearchBar(Groupname);
		WaitUntillPAgeLoad();
//		Thread.sleep(15000);
		By Phonenumber =By.xpath("(//div[@class='ng-binding ng-scope'])[1]");
		By Elementsfromrow = By.xpath("(//*[@role='row'][@row-render-index='rowRenderIndex']//div//a)[1]");
		By NoRecordFound =By.xpath("//*[@class='watermarkNoData ng-scope'][text()='No data available']");
		String groupnameFromrow = null;
		if(ElementDisplayed(Elementsfromrow)) {
			groupnameFromrow =GetElementText(Elementsfromrow);
		}				
		
		if(!ElementDisplayed(NoRecordFound)) {			
			ExtentSuccessMessage("Call group is already present");
			Groupnumber=GetElementText(Phonenumber);
			System.out.println("Groupnumber:-"+Groupnumber);
		
		}else {
		
		TelephonyPage.ClickOnCreateGroupCallsTab();
		Thread.sleep(10000);
		TelephonyPage.EnterCallGroupname(Groupname);

		SelectCallGroupnumber();
		TelephonyPage.ClickOnBestFitOption();
//		TelephonyPage.ClickOnRinglessCheckBox();
		TelephonyPage.ClickOnNextButton();
		TelephonyPage.EnterCallGroupmembername(Secondusernumber);
		TelephonyPage.ClickOnDoneButton();
		TelephonyPage.EnterSearchBar(Groupname);
		Thread.sleep(8000);
		if(!ElementDisplayed(NoRecordFound)) {			
			ExtentSuccessMessage("Call group is already present");
			Groupnumber=GetElementText(Phonenumber);
			System.out.println("Groupnumber:-"+Groupnumber);
		}
		}
//		HomePage.ClickedOnMaximiseDiller();
//		TelephonyPage.ClickOnCallGrouptab();
//		TelephonyPage.ClickOnOnorOffSwitch(Groupname);
		TabSwitchToChild();
		TelephonyPage.ClickOnCallGrouptab();
		TelephonyPage.ClickOnOnorOffSwitch(Groupname);
//		TabSwitchToParent();
		TabSwitchToThirdWindow();
//		HomePage.ClickedOnMaximiseDiller();
		Thread.sleep(5000);

		CustomerEngageFunctionalityValidations.CalltoUser(Groupnumber);
		TabSwitchToChild();
//		Thread.sleep(2000);
		String ActualGroupname = GroupnameFromDialller1();
		Assert.assertEquals(ActualGroupname, Groupname);
		ExtentSuccessMessage("Assertion for Group Name is done");

		// CalltoUser(Secondusernumber);
		// String Firstusernumbe1=GetElementText(UserNumber);
		// System.out.println(Firstusernumbe1);
		// TabSwitchToChild();
		// element =
		// wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		// NumberOutput1=element.getText();
		// System.out.println(NumberOutput1);
		// Assert.assertEquals(NumberOutput1, Firstusernumber);
		// ExtentSuccessMessage("Assertion has been done");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceAddButton));
		MoveToElementClick(element);
		CustomerEngageFunctionalityValidations.ClickoNMinimizecallscriptspopup();

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceNumberField));
		MoveToElementClick(element);

		writeText(ConfrenceNumberField, Firstusernumber);
		time = Currenttime();
		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallConfreanceButton));
		MoveToElementClick(element);
		Callingtime=Currenttime();
		Thread.sleep(1000);
//		TabSwitchToThirdWindow();
		TabSwitchToParent();
		Thread.sleep(4000);
		// element =
		// wait.until(ExpectedConditions.presenceOfElementLocated(UatNumberinQualtia1));
		// NumberOutput1 =element.getText();
		// System.out.println(NumberOutput1);
		// Assert.assertEquals(NumberOutput1, Firstusernumber);
		// ExtentSuccessMessage("Assertiion has been done for confrence");
		//
		//
//				waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		waitForElement(3000);
		CustomerEngageFunctionalityValidations.ClickoNMinimizecallscriptspopup();
		Thread.sleep(10000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		System.out.println("End_TC_CTI_BF_RG_Confrence_To_Agent_Online_Activity_Status");
		ExtentSuccessMessage("End_TC_CTI_BF_RG_Confrence_To_Agent_Online_Activity_Status");
		ExtentSuccessMessage("*****************************************************************************");
		ExtentSuccessMessage("Start_TC_CTI_BF_RG_Conference_Online_Admin_CallLogs");
		System.out.println("Start_TC_CTI_BF_RG_Conference_Online_Admin_CallLogs");
		ClickOnHomepage();
		TelephonyPage.NavigateToTelephonySetpPage();
		driver.manage().window().maximize();
		Thread.sleep(15000);
		TelephonyPage.ClickOnCallSMSFAXLogsManagement();
		Thread.sleep(15000);
		WaitUntillPAgeLoad();
		TelephonyPage.ClickOnCallTypeFilter();
		Thread.sleep(5000);
		click(CalltypeInboundcall);
		Thread.sleep(5000);
		TelephonyPage.EnterSearchBar(Secondusernumber);
		Thread.sleep(5000);
		validateCallLogsTime(time);	
		validateMisscalledDetails(Secondusernumber);
		validateMisscalledDetails(Thirdusernumber);
		ClickonFirstRowId();
		Thread.sleep(8000);
		String TodaysDate =Currentdate();

		String Values = (Thirdusernumber+","+Secondusernumber+","+"Incoming Call"+","+"Connected"+","+TodaysDate+","+TodaysDate+" "+Callingtimes+","+TodaysDate+" "+Callingtime+","+"NA"+","+"Not DNC Number"+","+Groupname+" *".toUpperCase());
		VerifyBasicCAllsDetails(Values);

//		splitthewindowscreen2("Left");
		ExtentSuccessMessage("End_TC_CTI_BF_RG_Conference_Online_Admin_CallLogs");
		System.out.println("End_TC_CTI_BF_RG_Conference_Online_Admin_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");
		ExtentSuccessMessage("Start_TC_CTI_BF_RG_Conference_Online_CTI_CallLogs");
		System.out.println("Start_TC_CTI_BF_RG_Conference_Online_CTI_CallLogs");
		RefreshPage();
		Thread.sleep(5000);
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
		ExtentSuccessMessage("End_TC_CTI_BF_RG_Conference_Online_CTI_CallLogs");
		System.out.println("End_TC_CTI_BF_RG_Conference_Online_CTI_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");
		logout_CE_validations();
		TabSwitchToChild();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		waitForElement(1000);
		logout_CE_validations();
		TabSwitchToThirdWindow();

	}

	public void BF_RL_Admin_Call_Log_Satus_BeRight_Back()
			throws InterruptedException, IOException, ParseException, java.text.ParseException {
		System.out.println("Start_TC_CTI_BF_RL_Transfer_To_Agent_BeRight_Back_Activity_Status");
		ExtentSuccessMessage("Start_TC_CTI_BF_RL_Transfer_To_Agent_BeRight_Back_Activity_Status");
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		fetchNumber1();
		String Firstusernumber = GetElementText(UserNumber);
		System.out.println(Firstusernumber);
		splitthewindowscreen2("Left");// login ceuserone
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Right");
		SecondLoginUser();
		login_CE_validations();
		fetchNumber();
		new_Tab();
		ThirdUserLogin();
		login_CE_validations();
		String Thirdusernumber = GetElementText(UserNumber);
		System.out.println(Thirdusernumber);
		Admin_redirection();
		CUstom_Status_SetupWithtext("BeRight_Back");
		TabSwitchToParent();
		String Groupname = "BF_RL_" + generateRandomText();
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToGroupCallPage();
		RefreshPage();
		Thread.sleep(25000);
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.ClickOnCreateGroupCallsTab();
		Thread.sleep(10000);
		TelephonyPage.EnterCallGroupname(Groupname);

		SelectCallGroupnumber();
		TelephonyPage.ClickOnBestFitOption();
		TelephonyPage.ClickOnRinglessCheckBox();
		TelephonyPage.ClickOnNextButton();
		TelephonyPage.EnterCallGroupmembername(firstnumber);
		TelephonyPage.ClickOnDoneButton();
		TelephonyPage.EnterSearchBar(Groupname);

		TabSwitchToChild();
		TelephonyPage.ClickOnCallGrouptab();
		TelephonyPage.ClickOnOnorOffSwitch(Groupname);
		TabSwitchToParent();
		HomePage.ClickedOnMaximiseDiller();
		Thread.sleep(5000);
		CustomerEngageFunctionalityValidations.CalltoUser(Groupnumber);
		TabSwitchToChild();
		Thread.sleep(4000);
		String ActualGroupname = GroupnameFromDialller();
		Assert.assertEquals(ActualGroupname, Groupname);
		ExtentSuccessMessage("Assertion for Group Name is done");
		transferToagentBFRinglessCall(Thirdusernumber);
		TabSwitchToThirdWindow();
		ExtentSuccessMessage("*******Start Missed call On SSE_notification Tab***************");
		By MissedsmsPopup = By.xpath("//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight']");
		if (ElementDisplayed(MissedsmsPopup)) {
			Assert.assertTrue(driver.findElement(MissedsmsPopup).isDisplayed());
			ExtentSuccessMessage("Successfully user able to See the 'Missed Call Popup' ");
		} else {
			ExtentErrorMessage("Unsuccessfully user not able to See the 'Missed Call Popup' ");
		}
		ExtentSuccessMessage("Assertion for missed SMS popup is done");
		ExtentSuccessMessage("*******End Inbound SMS On SSE_notification Tab***************");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("End_TC_CTI_BF_RL_Transfer_To_Agent_BeRight_Back_Activity_Status");
		ExtentSuccessMessage("End_TC_CTI_BF_RL_Transfer_To_Agent_BeRight_Back_Activity_Status");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BF_RL_Transfer_To_Agent_BeRight_Back_Admin_call_logs");
		ExtentSuccessMessage("Start_TC_CTI_BF_RL_Transfer_To_Agent_BeRight_Back_Admin_call_logs");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		CustomerEngageFunctionalityValidations.ClickOnHomepage();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
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
		validateMisscalledDetails(Present_time);
		validateMisscalledDetails(Firstusernumber);
		validateMisscalledDetails(Thirdusernumber);
		System.out.println("End_TC_CTI_BF_RL_Transfer_To_Agent_BeRight_Back_Admin_call_logs");
		ExtentSuccessMessage("End_TC_CTI_BF_RL_Transfer_To_Agent_BeRight_Back_Admin_call_logs");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BF_RL_Transfer_To_Agent_BeRight_Back_CTI_CallLogs");
		ExtentSuccessMessage("Start_TC_CTI_BF_RL_Transfer_To_Agent_BeRight_Back_CTI_CallLogs");
		splitthewindowscreen2("Left");
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
			By TimeCount = By.xpath("(//span[@class='call-time-section'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
			String count = element.getText();
			System.out.println(count);
			String timeString = StringUtils.substringAfter(count, " ");
			System.out.println("---------" + timeString);
			ExtentSuccessMessage("Full Number Assertion Done");
		}
		ExtentSuccessMessage("End_TC_CTI_BF_RL_Transfer_To_Agent_BeRight_Back_CTI_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");
		logout_CE_validations();
		TabSwitchToParent();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ClickOnDeleteGroup();
		logout_CE_validations();
		TabSwitchToChild();

	}

	public void BF_Ring_BMW_Validation() throws InterruptedException, IOException {
		System.out.println("BF Ringless barge moniter whisper validation");
		ExtentSuccessMessage("BF Ringless barge moniter whisper validation");
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		fetchNumber1();
		String Firstusernumber = GetElementText(UserNumber);
		System.out.println(Firstusernumber);
		splitthewindowscreen2("Left");// login ceuserone
		new_Tab();
		maximizeWindow();
		splitthewindowscreen2("Right");
		SecondUserForTransfer();
		login_CE_validations();
		fetchNumber();
		Fetch_Profile_Name();
		new_Window();
		ThirdUser();
		login_CE_validations();
		String Thirdusernumber = GetElementText(UserNumber);
		System.out.println(Thirdusernumber);
		TabSwitchToParent();
		String Groupname = "AutoGroup_" + generateRandom3DigitNumber();
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToGroupCallPage();
		RefreshPage();
		Thread.sleep(25000);
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.ClickOnCreateGroupCallsTab();
		Thread.sleep(10000);
		TelephonyPage.EnterCallGroupname("BF_RL_" + Groupname);

		SelectCallGroupnumber();
		TelephonyPage.ClickOnBestFitOption();
		// TelephonyPage.ClickOnRinglessCheckBox();
		TelephonyPage.ClickOnNextButton();
		TelephonyPage.EnterCallGroupmembername(firstnumber);
		TelephonyPage.ClickOnDoneButton();
		TelephonyPage.EnterSearchBar("BF_RL_" + Groupname);

		TabSwitchToChild();
		TelephonyPage.ClickOnCallGrouptab();
		TelephonyPage.ClickOnOnorOffSwitch("BF_RL_" + Groupname);
		TabSwitchToSubChild();
		// HomePage.ClickedOnMaximiseDiller();
		Thread.sleep(5000);

		CustomerEngageFunctionalityValidations.CalltoUser(Groupnumber);
		TabSwitchToChild();
		Thread.sleep(4000);
		Accept_Call();

		String ActualGroupname = GroupnameFromDialller();
		Assert.assertEquals(ActualGroupname, "BF_RL_" + Groupname);
		ExtentSuccessMessage("Assertion for Group Name is done");
		TabSwitchToParent();
		Home_Redirection();
		Cti_Minimize();
		Click_Dashboard();
		BMW_Filter(Session2_Name);
		Barge_Validation(Session2_Name);
		Monitor_Validation();
		Whisper_Validation();

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
					Assert.assertEquals(ExpectedColnumname[i].toUpperCase(), ActualColunmName.toUpperCase());
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


	public void ClickOnHomepage() throws InterruptedException {
		if(ElementDisplayed(L_Homepage)) {
			ExtentSuccessMessage("Successfully user able to See 'Home Page' ");
			click(L_Homepage);
			ExtentSuccessMessage("Successfully user Clicked on 'Home Page Button' ");
		}else {
			ExtentSuccessMessage("UnSuccessfully user not able to See 'Home Page Button' ");
		}	
		Thread.sleep(8000);
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

	public void SecondUserForConfrence() throws InterruptedException, IOException
	{
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

			if (key.contains(ReferenceLogin) && Url.contains("https://mme.benefitalign.com/mme/")) {
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
		System.out.println("Final Password fetch :" + Password);
		String username = UserName;
		String pswd = Password;
		waitForElement(1000);
		driver.get(Url);
		waitForElement(5000);
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
		waitForElement(4000);
		ExtentSuccessMessage("Logged into the Receiver Side");

	}
	public void ClickOnMuteCallIconIsvisible() throws InterruptedException {
		waitVisibility(CallMute);		
		Callingtimes=CurrentTimes();
		if(ElementDisplayed(CallMute)) {
			ExtentSuccessMessage("Successfully user able to See 'CallMute Icon' ");
			click(CallMute);
			ExtentSuccessMessage("Successfully user Clicked on 'CallMute Icon' ");
		}else {
			ExtentErrorMessage("Unsuccessfully 'CallMute Icon' Not visible");
		}
	}
	
	public void WaitUntillPAgeLoad() throws InterruptedException {
		int count =0;
		By Element = By.xpath("//*[@class='metro inner_wrapper ng-scope page-loading'] | //*[@id='loading'][class='ng-scope']");
		do {
			count++;
			Thread.sleep(2000);
			System.out.println("Wait for page load");
			System.out.println("Count"+count);
			if (count== 25) {
				RefreshPage();
				Thread.sleep(2000);
				ClickOnMinimizeCallwindow();
				break;
			}			 
		}
		while (ElementDisplayed(Element));
	}
	public void ClickOnMinimizeCallwindow() throws InterruptedException {		
		if (ElementDisplayed(CTIMinimizeIcon)) {
			ExtentSuccessMessage("Successfully user able to See 'Minimize Icon' ");
			click(CTIMinimizeIcon);
			ExtentSuccessMessage("Successfully user Clicked on 'Minimize Icon' ");
		} else {
			ExtentSuccessMessage("Unsuccessfully 'Minimize' Not visible");
		}
	}
}
