package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.BasePackage.Base_Class;

public class Message_Tab extends BasePage {
	Base_Class Base_Class = new Base_Class();

	public Message_Tab(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement element;
	public String Number;
	public String SecondUsers_Number;
	public String FirstUsers_Number;
	public String Date_Time;
	public String time;
	public String SMS_Time;
	public String smstime;
	public String url;

	// private By SMSIcon = By.xpath("(//span[@class='message-new-icon'])[1]");
	private By Conversation = By.xpath("//li[@ng-repeat='message in CTICtrl.messageConversation track by $index']");
	private By NEWMessage = By.xpath("//span[@class='message-new-icon']");
	private By Qualtia1Number = By.xpath("(//div[@class='voice-call-ongoing-number']/span)[3]");
	private By InputNumber = By
			.xpath("//div[@class='new-message-forms']/input[@class='ng-pristine ng-untouched ng-valid ng-empty']");
	private By Messageplaceholder = By.xpath("//textarea[@placeholder='Enter your message here..']");
	private By SendSmsButton = By.xpath("(//a[@class='fa icon-btns send'])[2]");
	private By succesmessage = By.xpath("//div[@id='divSuccess']");
	private By Conversation_Type_Message = By.xpath("//textarea[@placeholder='Type a message']");
	private By Send_Message = By.xpath(
			"(//a[@ng-click='CTICtrl.SendMessageFromConversation(!!CTICtrl.lastViewedMessage.CallGroupName)'])[1]");
	private By Success_Message = By.xpath("//div[@id='divSuccess']");
	private By Message_Action_Button = By.xpath("(//i[@class='fa fa-ellipsis-v'])[1]");
	private By Message_Forward = By.xpath("(//a[@class='dropdown-item'])[1]");
	private By Message_Delete = By.xpath("(//a[@class='dropdown-item'])[2]");
	private By CallDeclineButton = By
			.xpath("//button[@class='voice-call-green-button-small fa fa-phone voice-decline']");
	private By CheckUserLogin = By.xpath("//button[@class='positive md-button md-ink-ripple']");
	private By SelectUser = By.xpath("//a[@class='nav-link dropdown-toggle']");
	private By SelectLogout = By.xpath("(//a[contains(.,'Log Out')])[1]");
	By userID = By.id("user-name");// ------//for userid at Login page
	By pwd = By.id("password");// -------for password at home page
	By signIn = By.xpath("//*[@id='form-validation-button']");// -------for button on home page

	public void waitForElement(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public static String generatePhoneNumber() {
		Random random = new Random();
		String areaCode = "886";
		int centralOfficeCode = random.nextInt(900) + 100;
		int lineNumber = random.nextInt(10000);
		return String.format("(%s) %03d-%04d", areaCode, centralOfficeCode, lineNumber);
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
		waitForElement(30000);
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

	public void TabSwitchToParent() throws InterruptedException {
		Thread.sleep(2000);
		ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(Tabs.size());
		driver.switchTo().window(Tabs.get(0));
		ExtentSuccessMessage("Tab Switched from child to parent");

		Thread.sleep(5000);
	}

	public void TabSwitchToChild() throws InterruptedException {
		ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(Tabs.size());
		driver.switchTo().window(Tabs.get(1));
		Thread.sleep(3000);
		ExtentSuccessMessage("Tab Switched from parent to child");
		Thread.sleep(2000);

	}

	public void Click_ON_Message() throws InterruptedException {

		By SMSTab = By.xpath("(//a[@title='Message'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SMSTab));
		MoveToElementClick(element);
		waitForElement(3000);
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(SMSIcon));
//		MoveToElementClick(element);
		ExtentSuccessMessage("SMS icon has been clicked");
	}

	public void SecondUser() throws InterruptedException, IOException {
		waitForElement(2000);
//		String urlCE = configloader().getProperty("CEURL");
		String urlCE;
		String currentSystemURL = configloader().getProperty("URL");
		System.out.println(currentSystemURL);
		if (currentSystemURL.contains("https://mme.benefitalign.com")) {
			urlCE = "https://mme.benefitalign.com/";
		} else if (currentSystemURL.contains("https://ce-uat.benefitalign.com/")) {
			urlCE = "https://ce-qa.benefitalign.com/";
		} else if (currentSystemURL.contains("https://ce-qa.benefitalign.com/")) {
			urlCE = "https://mme.benefitalign.com";
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

	public void SecondUserformessage() throws InterruptedException, IOException {
		waitForElement(2000);
//		String urlCE = configloader().getProperty("CEURL");
		String urlCE;
//		String currentSystemURL = configloader().getProperty("URL");
//		System.out.println(currentSystemURL);
		if (url.contains("https://mme.benefitalign.com")) {
			urlCE = "https://mme.benefitalign.com/";
		} else if (url.contains("https://ce-uat.benefitalign.com/")) {
			urlCE = "https://ce-qa.benefitalign.com/";
		} else if (url.contains("https://ce-qa.benefitalign.com/")) {
			urlCE = "https://mme.benefitalign.com";
		} else if (url.contains("https://mme.brokerengage.net/")) {
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

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void fetchNumber() throws InterruptedException {
		Thread.sleep(8000);
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber));
		SecondUsers_Number = element.getText();
		System.out.println(SecondUsers_Number);

	}

	public void fetchNumber1() throws InterruptedException {
		Thread.sleep(8000);
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber));
		FirstUsers_Number = element.getText();
		System.out.println("FirstUrsersNumber:" + FirstUsers_Number);

		Thread.sleep(2000);
		url = driver.getCurrentUrl();
		System.out.println(url);

	}

	public void Click_ON_Converstaion() throws InterruptedException {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		By Click_Element = By.xpath("(//ul[@class='message-list'])[1]/li[1]");
		// element =
		// wait.until(ExpectedConditions.presenceOfElementLocated(Click_Element));
		// jsExecutor.executeScript("arguments[0].click();", element);
		click(Click_Element);
		ExtentSuccessMessage("Conversation has been clicked and opened");

	}

	public void Click_ON_Converstaion1() throws InterruptedException {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		By Click_Element = By.xpath("(//span[normalize-space()='" + SecondUsers_Number + "'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_Element));
		MoveToElementClick(element);
		// click(Click_Element);
		ExtentSuccessMessage("Conversation has been clicked and opened");

	}

	public void new_Window() throws InterruptedException {

		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(3000);

		ExtentSuccessMessage("New Window has been opened");

	}

	public String getCurrentTime() {
		// Set the time zone to USA Eastern Time (New York)
		ZoneId zoneId = ZoneId.of("America/New_York");
		// Get current time in the specified time zone
		LocalTime currentTime = LocalTime.now(zoneId);

		// Extract hour, minute, and am/pm
		int hour = currentTime.getHour();
		int minute = currentTime.getMinute();
		String period = hour >= 12 ? "PM" : "AM";

		// Convert hour to 12-hour format
		hour = hour % 12;
		if (hour == 0) {
			hour = 12; // Handle midnight and noon cases
		}

		// Construct the formatted time string
		String formattedTime = hour + ":" + String.format("%02d", minute) + " " + period;

		// Print the formatted time
		System.out.println("Current time in USA (Eastern Time - New York): " + formattedTime);

		return formattedTime;
	}

	public String CurrentTime() {
		// Set the time zone to USA Eastern Time (New York)
		ZoneId zoneId = ZoneId.of("America/New_York");
		// Get current time in the specified time zone
		LocalTime currentTime = LocalTime.now(zoneId);
		// Define a time formatter to format the time as needed
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
		// Format the current time
		String formattedTime = currentTime.format(formatter);
		// Print the formatted time
		// System.out.println("Current time in USA (Eastern Time - New York): " +
		// formattedTime);
		return formattedTime;
	}

	public static void MouseClick(By element) throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(element);
		actions.click(elementLocator).perform();
	}

	public void Conversation_Message_MMS_Validation() throws InterruptedException, AWTException, IOException {

		fetchNumber1();
		new_Tab();
		SecondUserformessage();
		fetchNumber();
		Click_ON_Message();
		Create_New_Message_With_MMS();
		Thread.sleep(2000);
		TabSwitchToParent();
		Click_ON_Message(); 

		waitForElement(3000);

		Thread.sleep(3000);
		By QuickDial = By.xpath("//span[contains(.,'" + SecondUsers_Number + "')]/../../../div[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(QuickDial));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Quick Dial Button");

		Thread.sleep(7000); 

		By Decline = By.cssSelector(
				"#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Decline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Decline Button");

		Click_ON_Message();

		Thread.sleep(4000);
		By Number_Validation = By.xpath("(//span[contains(.,'" + SecondUsers_Number + "')])[1]");// (//span[contains(text(),'(787)
																									// //
																									// 878-7798')])[1]
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Number_Validation));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on SMS");

		Thread.sleep(4000);
		By Mesaage_Validation = By.xpath("//span[contains(.,'" + smstime + "')]/..");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Mesaage_Validation));
		Assert.assertTrue(driver.findElement(Mesaage_Validation).isDisplayed());
		ExtentSuccessMessage("Conversation View has been opened and validated");

		Thread.sleep(2000);
		By QuickDialConversation = By.xpath("//button[@class='pull-right phone-message-button']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(QuickDialConversation));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Quick Dial Conversation");

		
		Thread.sleep(6000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Decline));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Decline Button");

		Click_ON_Message();

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Number_Validation));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on SMS");

		Thread.sleep(2000);

		By DownloadAttachmnet = By
				.xpath("(//span[contains(.,'" + smstime + "')])/ancestor::li/div[2]/div/a/div[@class='download']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DownloadAttachmnet));
		MoveToElementClick(element);
		ExtentSuccessMessage("Attachmnet has been download");

		Thread.sleep(3000);
		By ConverstaionView = By
				.xpath("(//textarea[@class='new-message-textarea ng-pristine ng-untouched ng-valid ng-empty'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConverstaionView));
		MoveToElementClick(element);
		writeText(ConverstaionView, "Hello ! These is automated message from converstaion view");
		ExtentSuccessMessage("Clicked on TextArea In Converstaion View");

		Thread.sleep(2000);
		By SendButton = By.xpath("(//a[@title='Send Message'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SendButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Send Button");

		String SMS_Time1 = CurrentTime();
		System.out.println(SMS_Time1);
		String smstime1 = removeLeadingZero(SMS_Time1);
		System.out.println(smstime1);

		Thread.sleep(4000);

		By ForwardMessage = By.xpath("(//span[contains(.,'" + smstime + "')])/ancestor::li/button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ForwardMessage));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Three Dot");

		By Forward = By.xpath("//span[contains(.,'" + smstime + "')]/ancestor::li/div[3]/a[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Forward));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Forward Message");

		Thread.sleep(3000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(InputNumber));
		MoveToElementClick(element);
		Number = SecondUsers_Number;// aws user2
		writeText(InputNumber, Number);
		ExtentSuccessMessage("Eneterd Number to Forward Message");

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SendSmsButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Message has been sent");

		SMS_Time = CurrentTime();
		System.out.println(SMS_Time);
		smstime = removeLeadingZero(SMS_Time);
		System.out.println(smstime);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Number_Validation));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on SMS ");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ForwardMessage));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Three Dot");

		Thread.sleep(3000);
		By DeleteMessage = By.xpath("//span[contains(.,' " + smstime + "')]/ancestor::li/div[2]/a[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DeleteMessage));
//        js.executeScript("arguments[0].scrollIntoView(true);", element);
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Delete Message");

		Thread.sleep(2000);
		By DeleteMessageYes = By.xpath("//button[@class='btn btn-primary btn-default green']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(DeleteMessageYes));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Delete Yes Message");

		Thread.sleep(3000);
		By BackButton = By.xpath("//i[@class='fa fa-arrow-left']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(BackButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Back Button");

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NEWMessage));
		MoveToElementClick(element);
		ExtentSuccessMessage("New Message Button has been clicked");

		waitForElement(2000);
		By CancelMessage = By.xpath("(//a[@class='fa fa-close'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CancelMessage));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Cancel Message Button");

		logout_CE_validations();

		TabSwitchToChild();

		By Number_Validation1 = By.xpath("(//span[contains(.,'" + FirstUsers_Number + "')])[1]");// (//span[contains(text(),'(787)
																									// //
																									// 878-7798')])[1]
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Number_Validation1));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on SMS in second Tab");

		Thread.sleep(3000);
		By TimeValidation = By.xpath("(//span[contains(.,'" + smstime1 + "')])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeValidation));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertTrue(driver.findElement(TimeValidation).isDisplayed());
		ExtentSuccessMessage("Message Sent from Conversation view is Displayed");

		By ForwardValidation = By.xpath("(//span[contains(.,'" + smstime + "')])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ForwardValidation));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertTrue(driver.findElement(ForwardValidation).isDisplayed());
		ExtentSuccessMessage("Message which is forwarded is Displayed");

	}

	public static String getTodaysDate() {
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		return today.format(formatter);
	}

	public void Message_MMS__From_Conversation() throws InterruptedException, AWTException {

//		Thread.sleep(10000);
//		Base_Class.MouseClick(By.xpath("(//button[@class='btn btn-default pull-left']/i)[1]"));file upload code
//		Thread.sleep(6000);
//		ExtentSuccessMessage("Clicked on file upload");
//		FileUpload("\\Upload\\Upload_document_testing_file.pdf");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Conversation_Type_Message));
		MoveToElementClick(element);
		String TestMms = "This is  an automated test MMS";
		writeText(Conversation_Type_Message, TestMms);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Send_Message));
		String Time2 = CurrentTime();
		MoveToElementClick(element);

		Thread.sleep(18000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Success_Message));
		ExtentSuccessMessage("Conversation MMS has been sent and validated");
		Thread.sleep(8000);
		driver.navigate().refresh();
		TabSwitchToParent();

		Thread.sleep(4000);

		Click_ON_Message();
		Thread.sleep(7000);

//		By TimeCount = By.xpath("(//div[@class='timer-section ng-binding'])[1]");
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
//        String count = element.getText();	
//        System.out.println(count);
//        String timeString = StringUtils.substringAfter(count," ");
//        System.out.println("---------"+timeString);
//        
//		 waitForElement(8000);
//		 Assert.assertTrue(Time2.contains(timeString));
//		 ExtentSuccessMessage("Assertion for new message in conversation is done");

		Click_ON_Converstaion();
//		
//		System.out.println(Date_Time1);
//		By Date_Validation = By.xpath("(//span[normalize-space()='"+Date_Time1+"'])[1]");
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(Date_Validation));
//		

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

	public void Create_New_Message_With_MMS() throws InterruptedException, AWTException {

		element = wait.until(ExpectedConditions.presenceOfElementLocated(NEWMessage));
		MoveToElementClick(element);
		ExtentSuccessMessage("New Message Button has been clicked");
		waitForElement(2000);

		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(InputNumber));
		MoveToElementClick(element);

		Number = FirstUsers_Number;// aws user2
		writeText(InputNumber, Number);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Messageplaceholder));
		MoveToElementClick(element);
		String TestSms = "Hello!! These Message is Send Via Automation";
		writeText(Messageplaceholder, TestSms);
		waitForElement(2000);

		Base_Class.MouseClick(By.xpath("(//button[@class='btn btn-default pull-left'])[2]"));
		ExtentSuccessMessage("Clicked On Attach Button");
		waitForElement(3000);

		Robot robot = new Robot();
		String filePath = System.getProperty("user.dir") + "\\Upload\\correspondencePrint.pdf";
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

		element = wait.until(ExpectedConditions.presenceOfElementLocated(SendSmsButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Message has been sent");

		SMS_Time = CurrentTime();
		System.out.println(SMS_Time);
		smstime = removeLeadingZero(SMS_Time);
		System.out.println(smstime);

		Thread.sleep(15000);

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

	public void Download_Attatchment() throws InterruptedException {
		Thread.sleep(3000);
		By Download = By.xpath("(//i[@title='Click to download'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Download));
		MoveToElementClick(element);

		ExtentSuccessMessage("Validated the downloaded attatchment ");

	}

	public void Message_Actions() throws InterruptedException {
		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Message_Action_Button));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on message actions ");

	}

	public void Forward_Message() throws InterruptedException {
		// Message_Forward
		Thread.sleep(4000);
		Message_Actions();
		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Message_Forward));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Forward message");
		Thread.sleep(5000);
		By Number_Enter = By.xpath("(//input[@placeholder='Enter Number'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Number_Enter));
		MoveToElementClick(element);

		String Number_F = SecondUsers_Number;// aws user2
		writeText(Number_Enter, Number_F);

		waitForElement(6000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SendSmsButton));
		MoveToElementClick(element);
		String Time3 = CurrentTime();
		ExtentSuccessMessage("Message has been sent");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(succesmessage));
		ExtentSuccessMessage("Validated the success message");

		TabSwitchToChild();

		Click_ON_Message();

//		By TimeCount = By.xpath("(//div[@class='timer-section ng-binding'])[1]");
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
//        String count = element.getText();	
//        System.out.println(count);
//        String timeString = StringUtils.substringAfter(count," ");
//        System.out.println("---------"+timeString);

//		 waitForElement(8000);
//		 Assert.assertTrue(Time3.contains(timeString));
		ExtentSuccessMessage("Assertion for Forward message  is done");

	}

	public void Click_Back_Button() throws InterruptedException {

		By Back_Button = By.xpath("//i[@class='fa fa-arrow-left']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Back_Button));
		MoveToElementClick(element);

		Thread.sleep(2000);

		By Search_Validation = By.xpath("(//input[@placeholder='Search'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Search_Validation));
		ExtentSuccessMessage("Validated the redirected page");
		Click_ON_Converstaion();

	}

	public void Delete_Message() throws InterruptedException {
		Message_Actions();

		Thread.sleep(3000);
		// Base_Class.MouseClick(By.xpath("//li[@class='ng-scope outbound
		// show']//a[2]"));

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		// By.xpath("(//a[@class='dropdown-item'])[2]");

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Message_Delete));
		jsExecutor.executeScript("arguments[0].click();", element);
		// MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on delete message");
		Thread.sleep(4000);
		By Click_Yes = By.xpath("//button[@class='btn btn-primary btn-default green']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_Yes));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked Yes on delete message");

		Thread.sleep(1000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(Success_Message));
		ExtentSuccessMessage("Message has been deleted and validated");

	}

	public void Quick_Dail_From_Conversation() throws InterruptedException {

		Click_ON_Converstaion();

		By Phone = By.xpath("//button[@class='pull-right phone-message-button']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Phone));
		MoveToElementClick(element);
		Thread.sleep(2000);

		By dailer = By.xpath("//div[@class='voice-call-window-content-right-section right-al']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(dailer));
		ExtentSuccessMessage("Validated the quick dailer in conversation");
		Thread.sleep(13000);

		TabSwitchToParent();

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Qualtia1Number));
		String NumberOutput1 = element.getText();
		System.out.println(NumberOutput1);
		Assert.assertEquals(NumberOutput1, SecondUsers_Number);
		ExtentSuccessMessage("Assertion has been done");
		Thread.sleep(1000);

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);

	}

	public void Quick_Dail() throws InterruptedException {
//	   By SMSTab = By.xpath("(//a[@title='Message'])[1]");
//	   element = wait.until(ExpectedConditions.presenceOfElementLocated(SMSTab));
//		MoveToElementClick(element);
		Click_ON_Message();
		Thread.sleep(4000);
		By Dail_Icon = By.xpath("(//i[@class='fa fa-user'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Dail_Icon));
		MoveToElementClick(element);

		By dailer = By.xpath("//div[@class='voice-call-window-content-right-section right-al']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(dailer));
		ExtentSuccessMessage("Validated the quick dail option");
		Thread.sleep(3000);

	}

	public void Cancel_New_Message() throws InterruptedException {
		Click_ON_Message();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NEWMessage));
		MoveToElementClick(element);
		ExtentSuccessMessage("New Message Button has been clicked");
		waitForElement(6000);

		By Discard = By.xpath("(//a[@title='Cancel'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Discard));
		MoveToElementClick(element);
		ExtentSuccessMessage("New Message  has been canceled");

	}

}
