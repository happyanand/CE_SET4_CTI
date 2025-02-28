
package com.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.BasePackage.Base_Class;

public class PhoneNumberValidations extends BasePage {

	Base_Class Base_Class =new Base_Class();
	HomePage HomePage =new HomePage(driver);
	TelephonyPage TelephonyPage = new TelephonyPage(driver);
	public PhoneNumberValidations(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	CustomerEngageFunctionalityValidations cfv = new CustomerEngageFunctionalityValidations(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement element;
	public String firstnumber;
	public String quickmessage;
	public String Groupnumber;
	public String RecordingDetails;
	public String UserNumberforCTI;
	public String time;
	public String textmsg;
	public String Custom_Status;
	public String quickdialtime;
	public String secondnumber;
	public String NumberOutput1;
	public static String LoginUserName2;
	public static String Callingtimes;
	public static String Callingtime;

	private By SelectUser = By.xpath("//a[@class='nav-link dropdown-toggle']");
	private By SelectLogout = By.xpath("(//a[contains(.,'Log Out')])[1]");
	private By EnterPhoneNumberField = By.xpath("//input[@placeholder='Enter Phone Number']");
	private By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
	private By lead_details = By.xpath("//div[@class='voice-call-ongoing-call']//li[1]//span[2]//a[1]");
	private By keypad_dial = By.xpath("//a[@ng-click='CTICtrl.showDialPad(true)']//i[contains(@class,'fa')]");
	private By CTIMinimizeIcon = By.xpath("//a[@class='fa fa-minus right-al']");
	private By SalesButton  = By.xpath("//span[text()='Sales ']");
	private By Leads = By.xpath("(//a[text()='Leads'])[2]");
	private By Num = By.xpath("(//div[@ng-show='!CTICtrl.CTIContext.primarayPhoneFlags.minimized']//span[@class='drag-not-allowed ng-binding'])[2]");
	private By CallRecording = By.cssSelector("#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > div.voice-call-ongoing-quick-icons > span > a:nth-child(1) > i");
	private By CallAcceptButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[2]");

	private By CallDeclineButton = By.xpath("(//button[contains(@class,'voice-call-green-button-small fa fa-phone voice-decline')])[1] | //*[@ng-click='CTICtrl.endSecondaryCall()']");	private By VoiceMail = By.xpath("//a[@title='Voice Mails']");
	private By CallRecordings = By.xpath("//a[@title='Recordings']");
	private By confirmation = By.xpath("//h3[normalize-space()='Confirm']");
	private By clickYes = By.xpath("//button[normalize-space()='Yes']");
	private By succesmessage = By.xpath("//div[@id='divSuccess']");
	private By Missedcalls = By.xpath("//span[@class='fa fa-phone']");
	private By voicenumber = By.xpath("//u[@title='Voice Number']");

	private By leads = By.xpath(("//a[@href='#/sales/leads']"));
	private By LeadTittle = By.xpath("//span[@class='ng-binding'][normalize-space()='All Leads']");
	private By LeadButton = By.id("newLeadBtn");
	private By Allleads = By.xpath("//span[@class='ng-binding'][normalize-space()='All Leads']");
	private By NickName = By.id("NickName");
	private By Prefix = By.id("LeadPrefix");
	private By FirstName = By.id("LeadFirstName");
	private By LastName = By.id("LeadLastName");
	private By keypaddial = By.xpath("//a[@ng-click='CTICtrl.showDialPad(true)']//i[contains(@class,'fa')]");
	private By CallMute = By.xpath("//*[contains(@ng-class,'{disabledMute')]");
	private By SMSIcon = By.xpath("//a[@class='fa fa-commenting-o count-info ng-scope']");
	private By NEWMessage = By.xpath("//span[@class='message-new-icon']");
	private By InputNumber = By.xpath("//div[@class='new-message-forms']/input[@class='ng-pristine ng-untouched ng-valid ng-empty']");
	private By MessageTextArea = By.xpath("(//textarea[@class='new-message-textarea ng-pristine ng-untouched ng-valid ng-empty'])[2]");
	private By SendButton = By.xpath("(//a[@class='fa icon-btns send'])[2]");
	private By QASMSSection = By.xpath("//a[@class='fa fa-commenting-o count-info ng-scope']");
	private By MessageReceived = By.xpath("(//ul[@class='message-list'])[1]/li[1]");
	private By Messagecontent = By.xpath("//div[@class='message-content']");

	private By Call_Logs = By.xpath("//a[@title='Call Logs']");
	private By Input_CallLogs = By.xpath("//input[@class='search-key ng-pristine ng-valid ng-isolate-scope ng-empty ng-valid-maxlength ng-touched']|(//input[@type='text'])[10]");
	private By Input_Num = By.xpath("//*[contains(@ng-keyup,'CTICtrl.searchLogs')][contains(@ng-keyup,'CALLLOGS')]");
	private By Send_Message_Logs = By.xpath("//li[1]//span[1]//span[4]//i[1]");
	private By Send_Message_call = By.xpath("//*[@id='missedcallsection']/ul/li/a/span/i[2]");
	private By Dialpad = By.xpath("//a[@title='Dial Pad']");

	private By Remove = By.xpath("(//i[@title='Remove'])[1]");
	private By Delete = By.xpath("(//button[@title='Delete'])[1]");
	private By yes_btn = By.xpath("//button[normalize-space()='Yes']");
	private By call_logs = By.xpath("(//b[@class='message-heading cti-name'])[1]");
	private By Input_num = By.xpath("//div[@class='voice-call-window-content-right-section right-al cti-noscroll-padding ng-scope']//input[@placeholder='Search']");
	private By calluser = By.xpath("(//i[@class='cl-bklink ng-binding ng-scope'])[1]");

	private By Messageplaceholder = By.xpath("//textarea[@placeholder='Enter your message here..']");
	private By SendSmsButton = By.xpath("//a[@ng-click='CTICtrl.sendNewMessage()']");
	private By YopmailInbox = By.xpath("//input[@id='login']");
	private By YopmailSubmit = By.xpath("//button[@title='Check Inbox @yopmail.com']");
	private By CheckUserLogin = By.xpath("//button[@class='positive md-button md-ink-ripple']");
	private By Qualatia1Number = By.xpath("//u[@title='Voice Number']");
	By userID = By.id("user-name");//------//for userid at Login page
	By pwd = By.id("password");//-------for password at home page
	By signIn = By.xpath("//*[@id='form-validation-button']");//-------for button on home page
	private By Play_btn = By.xpath("(//button[@title='Play'])[1]");
	private By Download_btn = By.xpath("(//button[@title='Download'])[1]");

	private By UATNumberField = By.xpath("//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
	private By Errormsg = By.xpath("//*[text()='Unable to connect the call. Please try again']");
	private By L_OkayButton = By.xpath("//*[contains(text(),'Ok')]//parent::button");
	private By Qualtia1Number = By .xpath("(//div[@class='voice-call-ongoing-number']/span)[3]");
	private By ConfrenceAddButton = By.xpath("//*[@id='voice-call-window-draggable']/div[15]/div[1]/div[2]/div[5]/a[5]/i | //*[contains(@ng-click,'CTICtrl.initiateSecondaryCall()')]");
	private By ConfrenceaddButton = By.xpath("//*[@id=\"voice-call-window-draggable\"]/div[15]/div[1]/div[2]/div[5]/a[5]/i");
	private By Confrenceaddbutton = By.xpath("//*[@id=\"voice-call-window-draggable\"]/div[15]/div[1]/div[2]/div[6]/a[5]/i");
	private By ConfrenceNumberField = By.xpath("(//div[@class='voice-call-dial-pad'])[2]/input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-empty']");
	private By ConfrencenumberField = By.xpath("//*[@id=\"voice-call-window-draggable\"]/div[15]/div[1]/div[3]/input");
	private By CallConfreanceButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[2]");
	private By UatNumberinQualtia1 = By.xpath("(//div[@class='voice-call-ongoing-number']/span)[3]");
	private By CalltypeOutboundcall = By.xpath("(//h5[contains(text(),'Call Type')]//parent::div//md-checkbox)[2]");
	private By MinimizeButton = By.xpath("//a[@class='acc fa fa-window-minimize popup-btns']");
	private By viewcalllogs = By.xpath("//button[@id='viceCallLogsBtn']");
	private By Admin = By.xpath("//a[@id='menu_Admin']");
	private By telephonysetup = By.xpath("//a[@id='submenu_adminmanageaccount']");
	private By CallGroupNumber = By.name("GroupNumber");
	private By Gruopnumberfirst =By.xpath("(//*[contains(@class,'dropDown md-active md-clickable')]//md-option)[1]");
	private By CalltypeMissedcall = By.xpath("(//h5[contains(text(),'Call Type')]//parent::div//md-checkbox)[3]");
	private By DeleteGroup =By.xpath("(//i[@title='Deactivate Call Group'])[1]");
	private By ConfirmDeleteGroup =By.xpath("//button[text()='Deactivate'][@class='btn btn-primary btn-default green ng-binding']");
	private By BestFitOption = By.xpath("//span[normalize-space()='Best Fit']");
	private By Ringlesscallconnect = By.xpath("//md-checkbox[@name='RinglessCallGroup']//div[@class='md-container md-ink-ripple']");
	private By CallTransferButton = By.xpath("//i[@class=' fa fa-calls-transfer ']");
	private By FirstRowFromTable = By.xpath("(//*[@ng-click='grid.appScope.navigateToCallDetails(row.entity);'])[1]//a");
	private By L_Homepage =By.xpath("//*[@href='/#/home']");


	public static int generateRandomThreeDigitNumber() {
		Random random = new Random();
		int randomNumber = 100 + random.nextInt(900); // Generates a number between 100 and 999
		return randomNumber;
	}

	public void waitForElement(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public void SecondUser() throws InterruptedException, IOException
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
				if (replaceKeyValue.contains("UserName5")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("Password5")) {
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
		System.out.println("Final username fetch :" + Password);
		String username = UserName;
		String pswd = Password;
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

	public void EnterInvalidPhoneNumber() throws InterruptedException, IOException, AWTException
	{	
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
		MoveToElementClick(element);//clicking on PhoneNumber Field
		writeText(EnterPhoneNumberField, "234264465");
		ExtentSuccessMessage("Invalid Phone Number has been entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);//clicking on Call Button
		ExtentSuccessMessage("clicked on Call Button");
		waitForElement(2000);
		By Textmsg = By.xpath("//div[@id='divError']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Textmsg));
		String altmsg  = element.getText();
		String Altmsg = "Invalid Phone Number Format";
		ExtentSuccessMessage("-----------"+ altmsg +"------------");
		Assert.assertEquals(Altmsg, altmsg);
		ExtentSuccessMessage("Assertion has been done");			
	}

	public void DirectlyCallNumber() throws InterruptedException, IOException, AWTException
	{	
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
		MoveToElementClick(element);//clicking on PhoneNumber Field
		String Number = "(386) 703-3867";
		writeText(EnterPhoneNumberField, Number);
		ExtentSuccessMessage("Phone Number has been entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);//clicking on Call Button
		ExtentSuccessMessage("clicked on Call Button");
		waitForElement(5000);	
		By num = By.xpath("//div[@ng-show='!CTICtrl.CTIContext.primarayPhoneFlags.minimized']//span[@class='drag-not-allowed ng-binding'][normalize-space()='"+Number+"']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(num));
		String number  = element.getText();
		ExtentSuccessMessage("-----------"+ number +"------------");
		Assert.assertEquals(Number, number);
		ExtentSuccessMessage("Assertion has been done");
		String Name = "Daniel P";
		By name = By.xpath("//ul[@class='voice-call-incoming-user-lists-ul ng-scope']//span[@class='drag-not-allowed ng-binding'][normalize-space()='"+Name+"']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(name));
		String ContactName  = element.getText();
		ExtentSuccessMessage("-----------"+ ContactName +"------------");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(lead_details));
		MoveToElementClick(element);//clicking on Lead details
		waitForElement(5000);
		ExtentSuccessMessage("clicked on Lead Details");			
	}

	public void CallDisconnected() throws InterruptedException, IOException, AWTException
	{	
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
		MoveToElementClick(element);//clicking on PhoneNumber Field
		writeText(EnterPhoneNumberField, "(479) 333-1769");
		ExtentSuccessMessage("Phone Number has been entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);//clicking on Call Button
		ExtentSuccessMessage("clicked on Call Button");
		waitForElement(17000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(keypad_dial));
		MoveToElementClick(element);//clicking on Keypad and Star Button
		ExtentSuccessMessage("clicked on Keypad and * Button");
	}

	public void calllogs() throws InterruptedException
	{
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
		MoveToElementClick(element);//clicking on PhoneNumber Field
		String Number = "(886) 713-3867";
		writeText(EnterPhoneNumberField, Number);
		ExtentSuccessMessage("Phone Number has been entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);//clicking on Call Button
		ExtentSuccessMessage("clicked on Call Button");
		waitForElement(5000);	
		By num = By.xpath("//div[@ng-show='!CTICtrl.CTIContext.primarayPhoneFlags.minimized']//span[@class='drag-not-allowed ng-binding'][normalize-space()='"+Number+"']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(num));
		String number  = element.getText();
		ExtentSuccessMessage("-----------"+ number +"------------");
		Assert.assertEquals(Number, number);
		ExtentSuccessMessage("Assertion has been done");

		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		System.out.println("<--------------------------Clicked on end call button--------------------------->");
		Thread.sleep(2000);
		By CalLogs = By.xpath("//a[@title='Call Logs']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CalLogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call logs has been opened");
		Thread.sleep(2000);
		System.out.println("<--------------------------Clicked on calllogs button--------------------------->");
		By phnum = By.xpath("(//span[@class='drag-not-allowed ng-binding'][normalize-space()='"+Number+"'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(phnum));
		String phno  = element.getText();
		System.out.println(phno);
		Assert.assertEquals(Number, phno);
		System.out.println("<--------------------------Validated the latest outgoing call--------------------------->");
		ExtentSuccessMessage("Call log has been validated");
	}

	public void Validate_Call_Triggered_Hyperlink() throws InterruptedException 
	{
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);	
		waitForElement(1000); 
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SalesButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Sales button");	
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(leads));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Sales leads");	
		waitForElement(6000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadTittle));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadButton));
		MoveToElementClick(element);
		waitForElement(6000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Allleads));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NickName));
		MoveToElementClick(element);
		String Name="test";
		writeText(NickName, Name);
		System.out.println("<--------------------------------------- Lead creation--------------------------------------------------------->");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FirstName));
		MoveToElementClick(element);
		String FName = "User_CE";
		writeText(FirstName,FName+generateRandomThreeDigitNumber());
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LastName));
		MoveToElementClick(element);
		String LName = "QA";
		writeText(LastName,LName);
		By Phonenumber = By.xpath("(//*[contains(@class, 'ng-pristine ng-untouched ng-valid ng-isolate-scope md-input ng-empty')])[4]");
		String no = "9232212111";
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Phonenumber));
		MoveToElementClick(element);
		writeText(Phonenumber,no);
		By Submit = By.xpath("//div[@class='col-md-6 pull-right button-wrap']//button[@type='submit'][normalize-space()='Submit']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Submit));
		MoveToElementClick(element);
		ExtentSuccessMessage("Lead has been created succesfully");
		waitForElement(1000);
		By agreelead = By.xpath("//button[normalize-space()='Proceed with Lead creation']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(agreelead));
		MoveToElementClick(element);
		waitForElement(8000);
		validateHyperLink();	
	}

	public void validateHyperLink() throws InterruptedException 
	{	
		List<WebElement> links = driver.findElements(By.xpath("//a[@class='ng-binding']"));
		System.out.println(links.size());
		if(links!=null) {
			waitForElement(8000);
			String ph_num = "(923) 221-2111";
			By calling = By.xpath("//cti-call-btn[normalize-space()='(923) 221-2111']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(calling));
			MoveToElementClick(element);
			waitForElement(1000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Num));
			String Ph_Number  = element.getText();
			ExtentSuccessMessage("-----------"+ Ph_Number +"------------");
			Assert.assertEquals(ph_num, Ph_Number);
			waitForElement(6000);
			ExtentSuccessMessage("Assertion has been done");
		}
	}

	public void Dismissals() throws InterruptedException
	{
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Missedcalls));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on missed calls");
		Thread.sleep(2000);
		By removecall = By.xpath("//div[@id='missedcallsection']//li[1]//a[1]//span[1]//i[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(removecall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on remove call");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(confirmation));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(clickYes));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(succesmessage));
		ExtentSuccessMessage("Validated the success message");
		//Voice mail dismissal
		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(VoiceMail));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Voice mail");
		By deleteicon = By.xpath("(//*[@class='voice-call-green-button-small fa fa-trash'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(deleteicon));
		MoveToElementClick(element);
		ExtentSuccessMessage("Deleted the voice mail");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(confirmation));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(clickYes));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(succesmessage));
		//ExtentSuccessMessage("Validated the success message");
		ExtentSuccessMessage("Validated the success messageof voice mail");
		//call recordings dismissal
		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallRecordings));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on CallRecordings");
		waitForElement(2000);
		By Trashicon = By.xpath("//li[1]//button[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Trashicon));
		MoveToElementClick(element);
		ExtentSuccessMessage("Deleted the callRecordings");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(confirmation));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(clickYes));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(succesmessage));
		//ExtentSuccessMessage("Validated the success message");
		ExtentSuccessMessage("Validated the success messageof Call Recordings");
	}

	public void validate_Outbound_SMS() throws InterruptedException
	{
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SMSIcon));
		MoveToElementClick(element);
		ExtentSuccessMessage("SMS icon has been clicked");
		WebElement SenderNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String NumberOutput=SenderNumber.getText();
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
		String Number=ReceiveNumber.getText();
		driver.switchTo().window(tabs.get(0));
		writeText(InputNumber,Number );
		ExtentSuccessMessage("Sender Number has been Entered");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MessageTextArea));
		MoveToElementClick(element);
		String Text = "Hello, These is Automated Text!!!";
		writeText(MessageTextArea,Text );
		ExtentSuccessMessage("Message has been Entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SendButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Send Button has been Clicked");
		Thread.sleep(3000);	
		driver.switchTo().window(tabs.get(1));
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(QASMSSection));
		MoveToElementClick(element);
		ExtentSuccessMessage("SMS section has been opened ");
		wait.until(ExpectedConditions.elementToBeClickable(MessageReceived));
		click(MessageReceived);
		Thread.sleep(2000);	
	}

	public void Create_Sms() throws InterruptedException
	{
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SMSIcon));
		MoveToElementClick(element);
		ExtentSuccessMessage("SMS icon has been clicked");
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NEWMessage));
		MoveToElementClick(element);
		ExtentSuccessMessage("New Message Button has been clicked");
		waitForElement(6000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(InputNumber));
		MoveToElementClick(element);
	}
	public void yopmail_validation(String mail) throws InterruptedException
	{
		cfv.new_Tab();
		waitForElement(3000);
		driver.get("https://yopmail.com/wm");
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(YopmailInbox));
		MoveToElementClick(element);
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
		By NewSmsTitle = By.xpath("//div[@class='ellipsis nw b f18']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NewSmsTitle));
		String expectedProduct =element.getText();
		System.out.println(expectedProduct);
		Assert.assertTrue(expectedProduct.contains("New SMS From"));
		ExtentSuccessMessage("Assertion for new sms mail has been done");
		By Phonedetails = By.xpath("(//div[@class='ellipsis nw b f18'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Phonedetails));
	}
	public void Email_Notification_On_Sms() throws InterruptedException, IOException
	{
		String currentSystemURL = driver.getCurrentUrl();
		if (currentSystemURL.contains("https://mme.brokerengage.net/mme/#/home"))
		{
			Create_Sms();
			waitForElement(4000);
			By voicenumber = By.xpath("//u[@title='Voice Number']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(voicenumber));
			String ppenvnumber = element.getText();
			System.out.println(ppenvnumber);
			if(ppenvnumber=="(334) 810-0846")
			{
				String Number = "(938) 300-3794";//aws user2
				writeText(InputNumber,Number);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Messageplaceholder));
				MoveToElementClick(element);
				String TestSms = "This is  an automated test sms";
				writeText(Messageplaceholder,TestSms);
				waitForElement(6000);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(SendSmsButton));
				MoveToElementClick(element);
				ExtentSuccessMessage("Message has been sent");
				waitForElement(1000);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(succesmessage));
				ExtentSuccessMessage("Validated the success message");	
				//yopmail validation
				yopmail_validation("awsuser@yopmail.com");
				String expecteddetails =element.getText();
				System.out.println(expecteddetails);
				Assert.assertTrue(expecteddetails.contains("New SMS From: (334) 810-0846 To: (938) 300-3794 on yourCustomerEngage Dialer"));
				cfv.TabSwitchToParent();
			}
			else
			{    
				String Number = "(334) 810-0846";
				writeText(InputNumber,Number);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Messageplaceholder));
				MoveToElementClick(element);
				String TestSms = "This is  an automated test sms";
				writeText(Messageplaceholder,TestSms);
				waitForElement(6000);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(SendSmsButton));
				MoveToElementClick(element);
				ExtentSuccessMessage("Message has been sent");
				waitForElement(1000);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(succesmessage));
				ExtentSuccessMessage("Validated the success message");

				//yopmail validation
				yopmail_validation("awsuser1@yopmail.com");
				String expecteddetails =element.getText();
				System.out.println(expecteddetails);
				Assert.assertTrue(expecteddetails.contains("New SMS From"));
				cfv.TabSwitchToParent();
			}
		}
		else if (currentSystemURL.contains("https://ce-qa.benefitalign.com/")) {
			Create_Sms();
			waitForElement(4000);
			// By voicenumber = By.xpath("//u[@title='Voice Number']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(voicenumber));
			String qaenvnumber = element.getText();
			System.out.println(qaenvnumber);
			if(qaenvnumber=="(386) 703-3867")
			{
				String Number = "(479) 333-1769"; //Qualitia test1
				writeText(InputNumber,Number);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Messageplaceholder));
				MoveToElementClick(element);
				String TestSms = "This is  an automated test sms";
				writeText(Messageplaceholder,TestSms);
				waitForElement(6000);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(SendSmsButton));
				MoveToElementClick(element);
				ExtentSuccessMessage("Message has been sent");
				waitForElement(1000);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(succesmessage));
				ExtentSuccessMessage("Validated the success message");
				//yopmail validation
				yopmail_validation("qualitia@yopmail.com");
				String expecteddetails =element.getText();
				System.out.println(expecteddetails);
				Assert.assertTrue(expecteddetails.contains("New SMS From:"));
				cfv.TabSwitchToParent();
			}
			else
			{

				String Number = "(386) 703-3867";
				writeText(InputNumber,Number);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Messageplaceholder));
				MoveToElementClick(element);
				String TestSms = "This is  an automated test sms";
				writeText(Messageplaceholder,TestSms);

				waitForElement(6000);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(SendSmsButton));
				MoveToElementClick(element);
				ExtentSuccessMessage("Message has been sent");
				waitForElement(1000);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(succesmessage));
				ExtentSuccessMessage("Validated the success message");
				//yopmail validation
				yopmail_validation("qualitia2@yopmail.com");
				String expecteddetails =element.getText();
				System.out.println(expecteddetails);
				Assert.assertTrue(expecteddetails.contains("New SMS From:"));
				cfv.TabSwitchToParent();
			}
		}
		else {
			System.out.println("DEV ENV");
		}
		Thread.sleep(3000);
	}

	public void validate_Outbound_SMS_SENT() throws InterruptedException
	{
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SMSIcon));
		MoveToElementClick(element);
		ExtentSuccessMessage("SMS icon has been clicked");
		WebElement SenderNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String NumberOutput=SenderNumber.getText();
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
		String Number=ReceiveNumber.getText();
		driver.switchTo().window(tabs.get(0));
		writeText(InputNumber,Number );
		ExtentSuccessMessage("Sender Number has been Entered");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MessageTextArea));
		MoveToElementClick(element);
		String Text = "Hello, These is Automated Text!!!";
		writeText(MessageTextArea,Text );
		ExtentSuccessMessage("Message has been Entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SendButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Send Button has been Clicked");
		Thread.sleep(5000);	
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Messagecontent));
		MoveToElementClick(element);
		Thread.sleep(5000);	
		List<WebElement> links = driver.findElements(By.xpath("//*[@class='ng-scope outbound']"));
		System.out.println(links.size());
		if(links!=null) {
			for(int i=0; i< links.size(); i++)
			{
				ExtentSuccessMessage(links.get(i).getText());
			}
		}
	}

	public void validate_Receive_Inbound_SMS() throws InterruptedException
	{
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SMSIcon));
		MoveToElementClick(element);
		ExtentSuccessMessage("SMS icon has been clicked");
		WebElement SenderNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String NumberOutput=SenderNumber.getText();
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
		String Number=ReceiveNumber.getText();
		driver.switchTo().window(tabs.get(0));
		writeText(InputNumber,Number );
		ExtentSuccessMessage("Sender Number has been Entered");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MessageTextArea));
		MoveToElementClick(element);
		String Text = "Hello, These is Automated Text!!!";
		writeText(MessageTextArea,Text );
		ExtentSuccessMessage("Message has been Entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SendButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Send Button has been Clicked");
		Thread.sleep(5000);	
		driver.switchTo().window(tabs.get(1));
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(QASMSSection));
		MoveToElementClick(element);
		ExtentSuccessMessage("SMS section has been opened ");
		wait.until(ExpectedConditions.elementToBeClickable(MessageReceived));
		click(MessageReceived);
		Thread.sleep(2000);	
	}

	public void validate_Outbound_SMS_Missed_Call_Call_Logs() throws InterruptedException
	{
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Logs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call Logs icon has been clicked");
		driver.switchTo().window(tabs.get(1));
		WebElement ReceiveNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String Number=ReceiveNumber.getText();
		driver.switchTo().window(tabs.get(0));
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_Num));
		MoveToElementClick(element);
		writeText(Input_Num,Number + Keys.ENTER);
		waitForElement(2000);
		if(ElementDisplayed(Send_Message_Logs)) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Send_Message_Logs));
			MoveToElementClick(element);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(MessageTextArea));
			MoveToElementClick(element);
			String Text = "Hello, These is Automated Text!!!";
			writeText(MessageTextArea,Text );
			ExtentSuccessMessage("Message has been Entered");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(SendButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Send Button has been Clicked");
			waitForElement(2000);
			driver.switchTo().window(tabs.get(1));
			waitForElement(2000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(QASMSSection));
			MoveToElementClick(element);
			ExtentSuccessMessage("SMS section has been opened ");
			wait.until(ExpectedConditions.elementToBeClickable(MessageReceived));
			click(MessageReceived);
			waitForElement(2000);
		}else {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Dialpad));
			MoveToElementClick(element);	
			waitForElement(2000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
			MoveToElementClick(element);	
			writeText(EnterPhoneNumberField,Number );
			ExtentSuccessMessage("Invalid Phone Number has been entered");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);//clicking on Call Button
			ExtentSuccessMessage("clicked on Call Button");
			waitForElement(28000);
			driver.switchTo().window(tabs.get(1));
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Missedcalls));
			MoveToElementClick(element);//clicking on Missed Call Button
			ExtentSuccessMessage("clicked on Missed Call Button");
			waitForElement(2000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Send_Message_call));
			MoveToElementClick(element);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(MessageTextArea));
			MoveToElementClick(element);
			String Text = "Hello, These is Automated Text!!!";
			writeText(MessageTextArea,Text );
			ExtentSuccessMessage("Message has been Entered");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(SendButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Send Button has been Clicked");
			waitForElement(2000);
			driver.switchTo().window(tabs.get(0));
			waitForElement(2000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(QASMSSection));
			MoveToElementClick(element);
			ExtentSuccessMessage("SMS section has been opened ");
			wait.until(ExpectedConditions.elementToBeClickable(MessageReceived));
			click(MessageReceived);
			waitForElement(2000);
		}
	}

	public void validate_Call_Logs() throws InterruptedException
	{
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		waitForElement(2000);
		WebElement SenderNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String Sender_Number=SenderNumber.getText();
		driver.switchTo().window(tabs.get(1));
		WebElement ReceiveNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String Number=ReceiveNumber.getText();
		driver.switchTo().window(tabs.get(0));
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
		MoveToElementClick(element);//clicking on PhoneNumber Field
		writeText(EnterPhoneNumberField, Number);
		ExtentSuccessMessage("Phone Number has been entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);//clicking on Call Button
		ExtentSuccessMessage("clicked on Call Button");
		String quickdialtime = CurrentTime();
		System.out.println(quickdialtime+"quickdialtime");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		Thread.sleep(2000);	
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Logs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call Logs icon has been clicked");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_Num));
		MoveToElementClick(element);
		writeText(Input_Num,Number + Keys.ENTER);
		waitForElement(2000);
		if(ElementDisplayed(call_logs)) {
			waitForElement(3000);
			By TimeCount = By.xpath("(//span[@class='call-time-section'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
			String count = element.getText();	
			System.out.println(count);
			String timeString = StringUtils.substringAfter(count," ");
			System.out.println("---------"+timeString);
			ExtentSuccessMessage("Full Number Assertion Done");
		}
		clear(Input_Num);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_Num));
		MoveToElementClick(element);
		String PartialNumber = Number.substring(0,9);
		writeText(Input_Num, PartialNumber + Keys.ENTER);
		waitForElement(2000);
		if(ElementDisplayed(call_logs)) {
			ExtentSuccessMessage("Partial Number Assertion Done");
		}
		if(ElementDisplayed(Send_Message_Logs)) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Send_Message_Logs));
			MoveToElementClick(element);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(MessageTextArea));
			MoveToElementClick(element);
			String Text = "Hello, These is Automated Text!!!";
			writeText(MessageTextArea,Text );
			ExtentSuccessMessage("Message has been Entered");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(SendButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Send Button has been Clicked");
		}else {		
			element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
			MoveToElementClick(element);//clicking on PhoneNumber Field
			writeText(EnterPhoneNumberField, Number);
			ExtentSuccessMessage("Phone Number has been entered");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);//clicking on Call Button
			ExtentSuccessMessage("clicked on Call Button");
			waitForElement(2000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
			MoveToElementClick(element);
			Thread.sleep(2000);	
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Logs));
			MoveToElementClick(element);
			ExtentSuccessMessage("Call Logs icon has been clicked");
			waitForElement(2000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_Num));
			MoveToElementClick(element);
			writeText(Input_Num,Number + Keys.ENTER);
			waitForElement(2000);
			if(ElementDisplayed(Send_Message_Logs)) {
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Send_Message_Logs));
				MoveToElementClick(element);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(MessageTextArea));
				MoveToElementClick(element);
				String Text = "Hello, These is Automated Text!!!";
				writeText(MessageTextArea,Text );
				ExtentSuccessMessage("Message has been Entered");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(SendButton));
				MoveToElementClick(element);
				ExtentSuccessMessage("Send Button has been Clicked");
			}
		}
		waitForElement(2000);
		driver.switchTo().window(tabs.get(1));
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(QASMSSection));
		MoveToElementClick(element);
		ExtentSuccessMessage("SMS section has been opened ");
		wait.until(ExpectedConditions.elementToBeClickable(MessageReceived));
		click(MessageReceived);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Logs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call Logs icon has been clicked");
		waitForElement(2000);
		String FullName = "CEuser anand";
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_Num));
		MoveToElementClick(element);
		writeText(Input_Num,FullName + Keys.ENTER);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(call_logs));
		String Text = element.getText();
		System.out.println(Text);
		Assert.assertTrue(Text.contains(FullName));
		ExtentSuccessMessage("FullName text validation has been performed");
		waitForElement(2000);
		clear(Input_Num);
		waitForElement(2000);
		String Partialname = FullName.substring(0,6); 
		writeText(Input_Num, Partialname + Keys.ENTER);
		waitForElement(2000);
		if(ElementDisplayed(call_logs)) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(call_logs));
			String Text1 = element.getText();
			System.out.println(Text1);
			Assert.assertTrue(Text1.contains(Partialname));
			ExtentSuccessMessage("partial text validation has been performed");
		}
		if(ElementDisplayed(call_logs)) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Remove));
			MoveToElementClick(element);
			ExtentSuccessMessage("Removed Call Logs");
			waitForElement(1000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(yes_btn));
			MoveToElementClick(element);
			ExtentSuccessMessage("Clicked on Yes");
			ExtentSuccessMessage("Assertion Passed");
		}else {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Dialpad));
			MoveToElementClick(element);
			ExtentSuccessMessage("Dialpad has been clicked");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
			MoveToElementClick(element);//clicking on PhoneNumber Field
			writeText(EnterPhoneNumberField, Sender_Number);
			ExtentSuccessMessage("Phone Number has been entered");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);//clicking on Call Button
			ExtentSuccessMessage("clicked on Call Button");
			waitForElement(2000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
			MoveToElementClick(element);
			waitForElement(2000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Logs));
			MoveToElementClick(element);
			ExtentSuccessMessage("Call Logs icon has been clicked");
			waitForElement(2000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_Num));
			MoveToElementClick(element);
			writeText(Input_Num,FullName + Keys.ENTER);
			waitForElement(2000);
			if(ElementDisplayed(call_logs)) {
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Remove));
				MoveToElementClick(element);
				waitForElement(1000);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(yes_btn));
				MoveToElementClick(element);
				ExtentSuccessMessage("Assertion Passed");
			}
		}
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);	
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed");
		driver.switchTo().window(tabs.get(0));
	}

	public void Click_On_Call_Recordings() throws InterruptedException
	{

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallRecordings));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on CallRecordings");
		waitForElement(2000);
	}

	public void Recordings_NameSearch() throws InterruptedException, IOException
	{

		String currentSystemURL = driver.getCurrentUrl();
		if (currentSystemURL.contains("https://ce-qa.benefitalign.com/"))
		{
			Click_On_Call_Recordings();
			By Search = By.xpath("(//input[@placeholder='Search'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Search));
			MoveToElementClick(element);
			String Name= "Anon";
			writeText(Search,Name + Keys.ENTER);
			waitForElement(2000);
			By Voice_record = By.xpath("(//span[@class='min-height-30'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Voice_record));
			String Text = element.getText();
			System.out.println(Text);
			Assert.assertTrue(Text.contains(Name));
			ExtentSuccessMessage("partial text validation has been performed");
			waitForElement(2000);
			clear(Search);
			String Full_Name= "Anonymous ARATB Anonymous";
			writeText(Search,Full_Name + Keys.ENTER);
			waitForElement(2000);
			By Voice_record_Full = By.xpath("(//span[@class='min-height-30'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Voice_record_Full));
			String Text_Full = element.getText();
			System.out.println(Text_Full);
			Assert.assertTrue(Text_Full.contains(Full_Name));
			ExtentSuccessMessage("Complete text validation has been performed");
		}
		else if (currentSystemURL.contains("https://mme.brokerengage.net/mme/#/home")) {
			Click_On_Call_Recordings();
			By Search = By.xpath("(//input[@placeholder='Search'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Search));
			MoveToElementClick(element);
			String Name= "Anon";
			writeText(Search,Name + Keys.ENTER);
			waitForElement(2000);
			By Voice_record = By.xpath("(//span[@class='min-height-30'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Voice_record));
			String Text = element.getText();
			System.out.println(Text);
			Assert.assertTrue(Text.contains(Name));
			ExtentSuccessMessage("partial text validation has been performed");
			waitForElement(2000);
			clear(Search);
			String Full_Name= "Anonymous UHYXS Anonymous";
			writeText(Search,Full_Name + Keys.ENTER);
			waitForElement(2000);
			By Voice_record_Full = By.xpath("(//span[@class='min-height-30'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Voice_record_Full));
			String Text_Full = element.getText();
			System.out.println(Text_Full);
			Assert.assertTrue(Text_Full.contains(Full_Name));
			ExtentSuccessMessage("Complete text validation has been performed");
		}
		else {
			System.out.println("DEV ENV");
		}
		Thread.sleep(3000);
	}

	public void Recordings_NumberSearch() throws InterruptedException, IOException
	{

		String currentSystemURL = driver.getCurrentUrl();
		if (currentSystemURL.contains("https://ce-qa.benefitalign.com/"))
		{
			Click_On_Call_Recordings();
			By Search = By.xpath("(//input[@placeholder='Search'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Search));
			MoveToElementClick(element);
			String Number= "(886) 303";
			writeText(Search,Number + Keys.ENTER);
			waitForElement(2000);
			By Voice_record = By.xpath("(//span[@class='min-height-30'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Voice_record));
			String Text = element.getText();
			System.out.println(Text);
			Assert.assertTrue(Text.contains(Number));
			ExtentSuccessMessage("Partial number validation has been performed");
			waitForElement(2000);
			clear(Search);
			String Full_Number= "(886) 303-8846";
			writeText(Search,Full_Number + Keys.ENTER);
			waitForElement(2000);
			By Voice_record_Full = By.xpath("(//span[@class='min-height-30'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Voice_record_Full));
			String Number_Full = element.getText();
			System.out.println(Number_Full);
			Assert.assertTrue(Number_Full.contains(Full_Number));
			ExtentSuccessMessage("Complete number validation has been performed");
		}
		else if (currentSystemURL.contains("https://mme.brokerengage.net/mme/#/home")) {
			Click_On_Call_Recordings();
			By Search = By.xpath("(//input[@placeholder='Search'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Search));
			MoveToElementClick(element);
			String Number= "(386) 703";
			writeText(Search,Number + Keys.ENTER);
			waitForElement(2000);
			By Voice_record = By.xpath("(//span[@class='min-height-30'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Voice_record));
			String Text = element.getText();
			System.out.println(Text);
			Assert.assertTrue(Text.contains(Number));
			ExtentSuccessMessage("Partial Number validation has been performed");
			waitForElement(2000);
			clear(Search);
			String Full_Number= "(386) 703-3860";
			writeText(Search,Full_Number + Keys.ENTER);
			waitForElement(2000);
			By Voice_record_Full = By.xpath("(//span[@class='min-height-30'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Voice_record_Full));
			String Text_Full = element.getText();
			System.out.println(Text_Full);
			Assert.assertTrue(Text_Full.contains(Full_Number));
			ExtentSuccessMessage("Complete Number validation has been performed");
		}
		else {
			System.out.println("DEV ENV");
		}
		Thread.sleep(3000);
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

	public void ClickOnMuteCallIconIsvisible() throws InterruptedException {
		waitVisibility(CallMute);
		if(ElementDisplayed(CallMute)) {
			ExtentSuccessMessage("Successfully user able to See 'CallMute Icon' ");
			click(CallMute);
			ExtentSuccessMessage("Successfully user Clicked on 'CallMute Icon' ");
		}else {
			ExtentErrorMessage("Unsuccessfully 'CallMute Icon' Not visible");
		}
	}

	public void new_Window() throws InterruptedException {

		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(3000);
		ExtentSuccessMessage("New Window has been opened");
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
	public void secondUser_MissedCall() throws InterruptedException, IOException {

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
				if (replaceKeyValue.contains("UserName5")) {
					UserName = replaceKeyValue;
					String[] arrOfUserName = UserName.split(";");
					UserName = arrOfUserName[1];
				}
				if (replaceKeyValue.contains("Password5")) {
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
		System.out.println("Final username fetch :" + Password);
		String username = UserName;
		String pswd = Password;
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

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void ClickOnRecordingCallIconIsvisible() throws InterruptedException {
		waitVisibility(CallRecording);
		if(ElementDisplayed(CallRecording)) {
			ExtentSuccessMessage("Successfully user able to See 'CallRecording Icon' ");
			click(CallRecording);
			ExtentSuccessMessage("Successfully user Clicked on 'CallRecording Icon' ");
		}else {
			ExtentErrorMessage("Unsuccessfully 'CallRecording Icon' Not visible");
		}
	}
	public void TabSwitchToParent() throws InterruptedException {
		//		Thread.sleep(2000);
		ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(Tabs.size());
		driver.switchTo().window(Tabs.get(0));
		ExtentSuccessMessage("Tab Switched from child to parent");
		//		Thread.sleep(5000);
	}

	public void fetchNumber1() throws InterruptedException
	{
		Thread.sleep(4000);
		By UserNumber = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber));
		firstnumber=element.getText();
		System.out.println(firstnumber);
	}

	public void Search_Record() throws InterruptedException {
		String currentSystemURL = driver.getCurrentUrl();
		Thread.sleep(1000);
		fetchNumber1();
		TabSwitchToParent();
		//WebElement ReceiveNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		//String Number=ReceiveNumber.getText();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Dialpad));
		MoveToElementClick(element);
		ExtentSuccessMessage("Dialpad has been clicked");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
		MoveToElementClick(element);//clicking on PhoneNumber Field
		writeText(EnterPhoneNumberField,firstnumber);
		ExtentSuccessMessage("Phone Number has been entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);//clicking on Call Button
		ExtentSuccessMessage("clicked on Call Button");
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());

		//driver.switchTo().window(tabs.get(1));
		TabSwitchToChild();
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Accepted");
		Thread.sleep(2000);
		By Minimize_Lead = By.xpath("//*[@id=\"draggable-CTI-quickLead-window\"]/a");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Minimize_Lead));
		MoveToElementClick(element);
		ExtentSuccessMessage("Minimized disposition");

		TabSwitchToParent();

		if (currentSystemURL.contains("https://mme.brokerengage.net/mme/#/home")) {
			//(//i[@class='fa fa-bullseye'])[1] --record button
			ClickOnRecordingCallIconIsvisible();
			ExtentSuccessMessage("clicked on Record Button");
			System.out.println("Clicked record");
		}

		Thread.sleep(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Declined");
		//TabSwitchToParent();
		Thread.sleep(15000);
		//Number validation
		Click_On_Call_Recordings();
		waitForElement(5000);
		By InputSearchField = By.xpath("(//input[@class='search-key ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty ng-valid-maxlength'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(InputSearchField));
		MoveToElementClick(element);
		String number = firstnumber;
		System.out.println(number);
		writeText(InputSearchField,number + Keys.ENTER);
		By Time = By.xpath("(//i[@class='time-cont'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Time));
		String time =element.getText();
		String timeString2 = StringUtils.substringAfter(time," ");
		waitForElement(5000);
		Assert.assertTrue(time.contains(timeString2));
		ExtentSuccessMessage("Assertion for search number is done");
		waitForElement(1000);
		By ClearSection = By.xpath("(//i[@class='fa fa-close ng-scope'])[4]");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ClearSection));
		MoveToElementClick(element);
		By Search = By.xpath("(//input[@placeholder='Search'])[1]");
		String number1 = StringUtils.substringAfter(firstnumber," ");
		System.out.println(number1);
		waitForElement(2000);
		writeText(Search,number1 + Keys.ENTER);
		By CallList = By.xpath("//div[@class='voice-call-window-content-right-section right-al cti-noscroll-padding ng-scope']//li[1]");
		Assert.assertTrue(driver.findElement(CallList).isDisplayed());
		ExtentSuccessMessage("Missed call after search is present");
	}

	public void number_validation()
	{
		By Login_Number = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Login_Number));
		ExtentSuccessMessage("Logged into the Receiver Side and number is validated");
	}

	public void TabSwitchToChild() throws InterruptedException {
		ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(Tabs.size());
		driver.switchTo().window(Tabs.get(1));
//		Thread.sleep(3000);
		ExtentSuccessMessage("Tab Switched from parent to child");
//		Thread.sleep(2000);

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

	public void Search_Validations() throws InterruptedException, IOException {
		splitthewindowscreen2("Right");// login QU1
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Left");
		secondUser_MissedCall();
		login_CE_validations();
		number_validation();

		Search_Record();
		TabSwitchToChild();
		logout_CE_validations();
	}

	public void ClickonDownoadRecording() throws InterruptedException, AWTException, ParseException {
		if(ElementDisplayed(Download_btn)) {
			ExtentSuccessMessage("Successfully user able to See 'DownloadRecording Recording Tab Button' ");
			click(Download_btn);
			ExtentSuccessMessage("Successfully user Clicked on 'DownloadRecording Recording Tab Button' ");
			Thread.sleep(2000);
			Base_Class.switchtabwithindex(2);
			Thread.sleep(5000);
			Base_Class.DownloadFileWithRobot();
			Base_Class.switchtabwithindex(0);
		}else {

			ExtentErrorMessage("UnSuccessfully user not able to See'Play Recording Tab Button' ");
		}
	}

	public void voicemail_Popup() throws InterruptedException
	{
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been Declined");
		ExtentSuccessMessage("************************* Missed Call SSE Notification *************************");
		waitForElement(25000);
		By VoiceMailPopup = By.xpath("//span[@data-notify='message']");
		Assert.assertTrue(driver.findElement(VoiceMailPopup).isDisplayed());
		ExtentSuccessMessage("Assertion for Voice Mail popup is done");
		ExtentSuccessMessage("************************* Missed Call Count *************************");
		waitForElement(2000);
		By VoiceMailCount = By.xpath("//a[@title='Voice Mails']/span[@class='label label-warning ng-binding']");
		Assert.assertTrue(driver.findElement(VoiceMailCount).isDisplayed());
		ExtentSuccessMessage("Assertion for Voice Mail Count is done");

		By VoicemailTab = By.xpath("//a[@title='Voice Mails']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(VoicemailTab));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Voicemail Tab");
	}

	public void validate_Voicemail() throws InterruptedException, AWTException, ParseException
	{
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		WebElement SenderNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String Sender_Number=SenderNumber.getText();
		driver.switchTo().window(tabs.get(1));
		WebElement ReceiveNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String Number=ReceiveNumber.getText();
		driver.switchTo().window(tabs.get(0));
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
		MoveToElementClick(element);//clicking on PhoneNumber Field
		writeText(EnterPhoneNumberField, Number);
		ExtentSuccessMessage("Phone Number has been entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);//clicking on Call Button
		ExtentSuccessMessage("clicked on Call Button");
		String quickdialtime = CurrentTime();
		System.out.println(quickdialtime+"quickdialtime");
		waitForElement(2000);
		ClickOnMuteCallIconIsvisible();
		waitForElement(1000);	
		driver.switchTo().window(tabs.get(1));
		voicemail_Popup();
		waitForElement(1000);
		ExtentSuccessMessage("************************* Number Search *************************");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_num));
		MoveToElementClick(element);
		writeText(Input_num, Sender_Number + Keys.ENTER);
		waitForElement(2000);
		ExtentSuccessMessage("Phone Number has been entered");
		waitForElement(1000);
		if(ElementDisplayed(calluser)) {
			ExtentSuccessMessage("Full Number Assertion Done");
		}
		clear(Input_num);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_num));
		MoveToElementClick(element);
		String PartialNumber = Number.substring(0,9);
		writeText(Input_num, PartialNumber + Keys.ENTER);
		waitForElement(2000);
		if(ElementDisplayed(calluser)) {
			ExtentSuccessMessage("Partial Number Assertion Done");
		}
		ExtentSuccessMessage("************************* Quick Dail *************************");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(calluser));
		MoveToElementClick(element);
		waitForElement(2000);
		ClickOnMuteCallIconIsvisible();
		waitForElement(2000);
		driver.switchTo().window(tabs.get(0));
		waitForElement(1000);
		voicemail_Popup();
		waitForElement(1000);
		ExtentSuccessMessage("************************* Play voicemail *************************");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Play_btn));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Play voicemail Button");
		waitForElement(2000);
		By Delete_Icon = By.xpath("//li[@class='ng-scope highlightListItem']//button[@title='Delete']");
		Assert.assertTrue(driver.findElement(Delete_Icon).isDisplayed());
		ExtentSuccessMessage("Delete Icon Assertion has been done");
		By Download_Icon = By.xpath("(//button[@title='Download'])[1]");
		Assert.assertTrue(driver.findElement(Download_Icon).isDisplayed());
		ExtentSuccessMessage("Download Icon Assertion has been done");
		By Player = By.xpath("//audio[@class='recordingAudioElement show']");
		Assert.assertTrue(driver.findElement(Player).isDisplayed());
		ExtentSuccessMessage("Player Assertion has been done");
		ExtentSuccessMessage("Play Voicemail Assertion has been done");
		ExtentSuccessMessage("************************* Download Voicemail *************************");
		waitForElement(2000);
		ClickonDownoadRecording();
		driver.switchTo().window(tabs.get(1));
		ExtentSuccessMessage("************************* Name Search *************************");
		By VoicemailTab = By.xpath("//a[@title='Voice Mails']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(VoicemailTab));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Voicemail Tab");
		String FullName = "CEuser anand";
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_num));
		MoveToElementClick(element);
		writeText(Input_num,FullName + Keys.ENTER);
		waitForElement(2000);
		ExtentSuccessMessage("Entered Full Name");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(calluser));
		String Text = element.getText();
		System.out.println(Text);
		Assert.assertTrue(Text.contains(FullName));
		ExtentSuccessMessage("FullName text validation has been performed");
		waitForElement(2000);
		clear(Input_num);
		waitForElement(2000);
		String Partialname = FullName.substring(0,6); 
		writeText(Input_num, Partialname + Keys.ENTER);
		waitForElement(2000);
		ExtentSuccessMessage("Entered Partial Name");
		waitForElement(2000);
		if(ElementDisplayed(calluser)) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(calluser));
			String Text1 = element.getText();
			System.out.println(Text1);
			Assert.assertTrue(Text1.contains(Partialname));
			ExtentSuccessMessage("partial text validation has been performed");
		}
		ExtentSuccessMessage("************************* Delete Log *************************");
		if(ElementDisplayed(calluser)) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Delete));
			MoveToElementClick(element);
			ExtentSuccessMessage("Click on Delete Call Logs");
			waitForElement(1000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(yes_btn));
			MoveToElementClick(element);
			ExtentSuccessMessage("Clicked on Yes");
			ExtentSuccessMessage("Deleted call Logs Assertion Passed");
			waitForElement(1000);
			By Delete_msg = By.xpath("//div[@id='divSuccess']");
			Assert.assertTrue(driver.findElement(Delete_msg).isDisplayed());
			ExtentSuccessMessage("Delete Success Message Assertion has been done");
		}
		logout_CE_validations();
		driver.switchTo().window(tabs.get(0));
	}

	public void new_Tab() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		ExtentSuccessMessage("New Tab has been Opened");
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
					Url.contains("https://mme.brokerengage.net/")) {
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
		ExtentSuccessMessage("Entered the Customer Engage Username:-"+username);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Customer Engage password field");
		writeText(pwd, pswd);
		ExtentSuccessMessage("Entered the Customer Engage Password:-"+pswd);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		waitForElement(4000);
		ExtentSuccessMessage("Logged into the Receiver Side");

	}

	public void Thirdusers() throws InterruptedException, IOException {

		waitForElement(1000);
		String Url = configloader().getProperty("URL");
		String jenkinsUrl = System.getProperty("URL");
		if (jenkinsUrl != null && !jenkinsUrl.isEmpty()) {
			Url = jenkinsUrl;
		}
		String URLS=Url;
		String currentSystemURL = URLS;
		String URL2 =null;
		if (currentSystemURL.contains("https://ce-uat.benefitalign.com/")) {
			URL2 = "https://ce-qa.benefitalign.com/#/login";
		} else if (currentSystemURL.contains("https://mme.brokerengage.net/")) {
			URL2 = "https://ce-uat.benefitalign.com/";
		}else if(currentSystemURL.contains("https://ce-qa.benefitalign.com/#/login")){
			URL2 = "https://ce-uat.benefitalign.com/";
		}else if(currentSystemURL.contains("https://mme.benefitalign.com/mme")){
			URL2 = "https://ce-uat.benefitalign.com/";
		}
		waitForElement(1000);

		String UserName = null;
		String Password = null;
		String ReferenceLogin = "PLCA";

		for (String key : configloader().stringPropertyNames()) {
			String value = configloader().getProperty(key);
			if (key.contains(ReferenceLogin) && 
					URL2.contains("https://mme.brokerengage.net/")) {
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
					URL2.contains("https://ce-qa.benefitalign.com/")) {
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

			if (key.contains(ReferenceLogin) && URL2.contains("https://mme.benefitalign.com/mme/")) {
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
					URL2.contains("https://ce-uat.benefitalign.com/")) {
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

		//		String username = configloader().getProperty("PLCA_ThirdUser");
		//		String pswd = configloader().getProperty("PLCA_ThirdPassword");
		waitForElement(1000);
		driver.get(URL2);
		waitForElement(5000);
		RefreshPage();
		waitForElement(15000);
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


	public void ThirdUser() throws InterruptedException, IOException
	{
		waitForElement(1000);
		String Url = configloader().getProperty("URL");
		String jenkinsUrl = System.getProperty("URL");
		if (jenkinsUrl != null && !jenkinsUrl.isEmpty()) {
			Url = jenkinsUrl;
		}
		String URLS=Url;
		String currentSystemURL = URLS;
		String URL2 =null;
		if (currentSystemURL.contains("https://ce-uat.benefitalign.com/")) {
			URL2 = "https://mme.benefitalign.com/mme/#/login";
		} else if (currentSystemURL.contains("https://mme.brokerengage.net/")) {
			URL2 = "https://ce-uat.benefitalign.com/mme/#/login";
		}else if(currentSystemURL.contains("https://ce-qa.benefitalign.com/")){
			URL2 = "https://ce-uat.benefitalign.com/mme/#/login";
		}else if(currentSystemURL.contains("https://mme.benefitalign.com/")){
			URL2 = "https://ce-uat.benefitalign.com/mme/#/login";
		}
		waitForElement(1000);

		String UserName = null;
		String Password = null;
		String ReferenceLogin = "PLCA";

		for (String key : configloader().stringPropertyNames()) {
			String value = configloader().getProperty(key);
			if (key.contains(ReferenceLogin) && 
					URL2.contains("https://mme.brokerengage.net/")) {
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
					URL2.contains("https://ce-qa.benefitalign.com/")) {
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

			if (key.contains(ReferenceLogin) && URL2.contains("https://mme.benefitalign.com/mme/")) {
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
					URL2.contains("https://ce-uat.benefitalign.com/")) {
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

		//		String username = configloader().getProperty("PLCA_ThirdUser");
		//		String pswd = configloader().getProperty("PLCA_ThirdPassword");
		waitForElement(1000);
		driver.get(URL2);
		waitForElement(5000);
		RefreshPage();
		waitForElement(15000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Broker Engage Username field");
		writeText(userID, username);
		ExtentSuccessMessage("Entered the Broker Engage Username:-"+username);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Broker Engage password field");
		writeText(pwd, pswd);
		ExtentSuccessMessage("Entered the Broker Engage Password:-"+pswd);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		MoveToElementClick(element);
		waitForElement(4000);
		ExtentSuccessMessage("Logged into the Receiver Side");

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
		waitForElement(10000);
		if(ElementDisplayed(Errormsg)) {
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
		}else {

		}
	}

	public void TabSwitchToThirdWindow() throws InterruptedException
	{
		ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(Tabs.size());
		driver.switchTo().window(Tabs.get(2));
		//		Thread.sleep(5000);
		ExtentSuccessMessage("Tab Switched from parent to child");
		//		Thread.sleep(2000);
	}

	public void Changed_Status() throws InterruptedException {
		waitForElement(2000);
		By UserIcon = By.xpath("//div[@class='profile-icon ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserIcon));
		MoveToElementClick(element);
		waitForElement(2000);
		By OfflineStatus = By.xpath("(//span[contains(.,'Offline')])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(OfflineStatus));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on the Offline Buttons");
		waitForElement(2000);
	}

	public void validateMisscalledDetails(String Value) throws InterruptedException {
		By elements =By.xpath("(//*[@class='ui-grid-canvas']//*[contains(text(),'"+Value+"')])[1]");
		if (ElementDisplayed(elements)) {
			ExtentSuccessMessage("Successfully user able to See the '"+Value+"'inside the web table ");

		} else {
			ExtentErrorMessage("Unsuccessfully  '"+Value+"' Not visible inside the web table");
		}		

	}

	public void Outboundconfrence_offline() throws InterruptedException, IOException
	{
		System.out.println("Start_TC_CTI_Outbound_Confrence_To_Agent_Offline_Activity_Status");
		ExtentSuccessMessage("Start_TC_CTI_Outbound_Confrence_To_Agent_Offline_Activity_Status");
		By UserNumber = By.xpath("//u[@title='Voice Number']");	
		By Username =By.xpath("//*[@class='profile-name drag-not-allowed ng-binding']");
//		splitthewindowscreen2("Right");	
		//		Changed_Status();
		String Firstusernumber=GetElementText(UserNumber);
		System.out.println("FirstuserNumber "+Firstusernumber);
		Admin_redirection();
		//Telephone_Setup();
		CUstom_Status_SetupWithtext1("Offline");	
		new_Tab();
		SecondUserForConfrence();
		login_CE_validations();
		waitVisibility(UserNumber);
		String Secondusernumber=GetElementText(UserNumber);
		System.out.println("Secondusernumber "+Secondusernumber);
		String Firstusername=GetElementText(Username);
		System.out.println("Firstusername:-"+Firstusername);
		new_Window();
		maximizeWindow();
//		splitthewindowscreen2("Left");
		ThirdUser();
		login_CE_validations();	
		RefreshPage();
		waitForElement(8000);
		waitVisibility(UserNumber);
		String Thirdusernumber=GetElementText(UserNumber);
		System.out.println("Thirdusernumber "+Thirdusernumber);
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
		//		TabSwitchToChild();		
		TabSwitchToThirdWindow();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		time = Currenttime();
		System.out.println("time6:-"+time+"-:time6");
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

		String Values = (Thirdusernumber+","+Secondusernumber+","+"Incoming Call"+","+"Connected"+","+TodaysDate+","+TodaysDate+" "+Callingtimes+","+TodaysDate+" "+Callingtime+","+"NA"+","+"Not DNC Number"+","+Firstusername.toUpperCase());
		VerifyBasicCAllsDetails(Values);

//		splitthewindowscreen2("Right");
		ExtentSuccessMessage("End_TC_CTI_Conference_BeRight_Back_Admin_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");
		ExtentSuccessMessage("Start_TC_CTI_Conference_BeRight_Back_CTI_CallLogs");
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
		ExtentSuccessMessage("End_TC_CTI_Conference_BeRight_Back_CTI_CallLogs");	
		logout_CE_validations();
		TabSwitchToChild();
		//				TabSwitchToParent();
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		//		MoveToElementClick(element);
		waitForElement(1000);
		logout_CE_validations();
		//		TabSwitchToParent();
		TabSwitchToThirdWindow();	
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


	public void Inboundconfrence_offline() throws InterruptedException, IOException
	{
		System.out.println("Start_TC_CTI_Intbound_Confrence_To_Agent_Offline_Activity_Status");
		ExtentSuccessMessage("Start_TC_CTI_Inbound_Confrence_To_Agent_Offline_Activity_Status");
		By UserNumber = By.xpath("//u[@title='Voice Number']");	
		By Username =By.xpath("//*[@class='profile-name drag-not-allowed ng-binding']");
//		splitthewindowscreen2("Right");	
		//		Changed_Status();
		String Firstusernumber=GetElementText(UserNumber);
		System.out.println("FirstuserNumber "+Firstusernumber);
		String Firstusername=GetElementText(Username);
		System.out.println("Firstusername:-"+Firstusername);
		//		Admin_redirection();
		//		//Telephone_Setup();
		//		CUstom_Status_SetupWithtext1("Offline");	
		new_Tab();
		SecondUserForConfrence();
		login_CE_validations();
		waitVisibility(UserNumber);
		String Secondusernumber=GetElementText(UserNumber);
		System.out.println("Secondusernumber "+Secondusernumber);
		Admin_redirection();
		//Telephone_Setup();
		CUstom_Status_SetupWithtext1("Offline");

		new_Window();
		maximizeWindow();
//		splitthewindowscreen2("Left");
		ThirdUser();
		login_CE_validations();	
		RefreshPage();
		waitForElement(8000);
		waitVisibility(UserNumber);
		String Thirdusernumber=GetElementText(UserNumber);
		System.out.println("Thirdusernumber "+Thirdusernumber);
		//		TabSwitchToParent();

		CalltoUser(Firstusernumber);
		String Firstusernumbe1=GetElementText(UserNumber);
		System.out.println(Firstusernumbe1);
		//		TabSwitchToChild();
		TabSwitchToParent();
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
		String times = Currenttime();
		System.out.println("time3:-"+times+"-:time3");
		Thread.sleep(5000);
		ExtentSuccessMessage("Start_TC_CTI_Conference_Offline_Admin_CallLogs");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceAddButton));
		MoveToElementClick(element);

		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceNumberField));
		MoveToElementClick(element);

		writeText(ConfrenceNumberField, Secondusernumber);

		Thread.sleep(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallConfreanceButton));
		MoveToElementClick(element);
		time = Currenttime();
		System.out.println("time:-"+time+"-:time");
		Thread.sleep(1000);
		//				TabSwitchToThirdWindow();
		//		TabSwitchToParent();
		TabSwitchToChild();
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
		time = Currenttime();
		System.out.println("time6:-"+time+"-:time6");
		TabSwitchToParent();
		//		TabSwitchToChild();
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
		TelephonyPage.EnterSearchBar(Secondusernumber);
		Thread.sleep(5000);

		validateCallLogsTime(time);
		validateMisscalledDetails(Secondusernumber);
		validateMisscalledDetails(Thirdusernumber);

		ClickonFirstRowId();
		Thread.sleep(8000);
		String TodaysDate =Currentdate();

		String Values = (Thirdusernumber+","+Secondusernumber+","+"Incoming Call"+","+"Connected"+","+TodaysDate+","+TodaysDate+" "+Callingtimes+","+TodaysDate+" "+Callingtime+","+"NA"+","+"Not DNC Number"+","+Firstusername.toUpperCase());
		VerifyBasicCAllsDetails(Values);




//		splitthewindowscreen2("Right");
		ExtentSuccessMessage("End_TC_CTI_Conference_Offline_CTI_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");
		ExtentSuccessMessage("Start_TC_CTI_Conference_Offline_CTI_CallLogs");
		//		TabSwitchToParent();

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
		ExtentSuccessMessage("End_TC_CTI_Conference_Offline_CTI_CallLogs");	
		logout_CE_validations();
		TabSwitchToChild();
		//				TabSwitchToParent();
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		//		MoveToElementClick(element);
		waitForElement(1000);
		logout_CE_validations();
		//		TabSwitchToParent();
		TabSwitchToThirdWindow();	
	}

	public void Admin_redirection() throws InterruptedException
	{
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		waitForElement(2000);
		By Admin_Tile= By.xpath("(//a[@class='glyphicon fa fa-fw fa-black-tie'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin_Tile));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Admin tile");
		waitForElement(3000);
	}

	public void Custom_Status_SetupWithtext(String Value) throws InterruptedException
	{
		By Telephonesetup = By.xpath("//a[@href='#/admin/manage-account']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);
		By CLick_ON_CustomCti_Status = By.xpath("(//button[@id='manageCallGroupsBtn'])[2]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CLick_ON_CustomCti_Status));
		MoveToElementClick(element);
		waitForElement(8000);
		RefreshPage();
		waitForElement(8000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		waitForElement(2000);
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
		clear(Custom_DD);
		waitForElement(2000);
		String Custom_Status = Value;
		writeText(Custom_DD,Custom_Status);
		By Save = By.xpath("//span[contains(.,'Save')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Save));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on save custom status");
		driver.navigate().refresh();
		waitForElement(12000);
		By UserIcon = By.xpath("//div[@class='profile-icon ng-binding']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserIcon));
		MoveToElementClick(element);
		By CustomStatus = By.xpath("//span[contains(text(),'"+Custom_Status+"')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomStatus));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on the Offline Customset Buttons");  
	}

	public void Outboundconference_BeRightBack() throws InterruptedException, IOException
	{
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
		//		TabSwitchToChild();		
		TabSwitchToThirdWindow();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		time = Currenttime();
		System.out.println("time6:-"+time+"-:time6");
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
		ExtentSuccessMessage("End_TC_CTI_Conference_BeRight_Back_Admin_CallLogs");
		ExtentSuccessMessage("*****************************************************************************");
		ExtentSuccessMessage("Start_TC_CTI_Conference_BeRight_Back_CTI_CallLogs");
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
		ExtentSuccessMessage("End_TC_CTI_Conference_BeRight_Back_CTI_CallLogs");	
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

	public void SelectCallGroupnumber () throws InterruptedException {
		click(CallGroupNumber);
		waitForElement(2000);
		Groupnumber = GetElementText(Gruopnumberfirst);
		click(Gruopnumberfirst);
		ExtentSuccessMessage("Successfully user Selected the 'Group Number ' "+Groupnumber);
	}

	public void Telephone_Setup() throws InterruptedException {
		By Telephonesetup = By.xpath("//a[@href='#/admin/manage-account']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Telephonesetup));
		MoveToElementClick(element);
		waitForElement(5000);
		By Click_On_Viewcall = By.xpath("//button[@id='viceCallLogsBtn']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_On_Viewcall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on view call setup");
		waitForElement(5000);
	}

	public void Admin_Validations_Call_Offline() throws InterruptedException 
	{
		By Call_State = By.xpath("(//div[@ng-if=\"row.entity.Direction.fieldValue==='Missed Call'\"])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_State));
		ExtentSuccessMessage("Call Conference succesfuly validated");
	}

	public void Home_Redirection() throws InterruptedException {
		By Home_Redirection = By.xpath("//a[@id='menu_home']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Home_Redirection));
		MoveToElementClick(element);
		Thread.sleep(2000);
		ExtentSuccessMessage("Clicked on the home button");
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

	public void BC_confrence_offline() throws InterruptedException, IOException
	{
		System.out.println("Start_TC_CTI_BC_Confrence_To_Agent_Offline_Activity_Status");
		ExtentSuccessMessage("Start_TC_CTI_BC_Confrence_To_Agent_Offline_Activity_Status");
		By UserNumber = By.xpath("//u[@title='Voice Number']");	
		splitthewindowscreen2("Right");
		String Firstusernumber=GetElementText(UserNumber);
		System.out.println("FirstuserNumber "+Firstusernumber);
		new_Tab();
		SecondUserForConfrence();
		login_CE_validations();
		waitVisibility(UserNumber);
		String Secondusernumber=GetElementText(UserNumber);
		System.out.println("Secondusernumber "+Secondusernumber);
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Left");
		ThirdUser();
		login_CE_validations();	
		RefreshPage();
		waitForElement(8000);
		waitVisibility(UserNumber);
		String Thirdusernumber=GetElementText(UserNumber);
		System.out.println("Thirdusernumber "+Thirdusernumber);
		Admin_redirection();
		Custom_Status_SetupWithtext("Offline");
		Changed_Status();
		TabSwitchToParent();
		String Groupname =generateRandomText();
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToGroupCallPage();
		RefreshPage();
		waitForElement(25000);
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.ClickOnCreateGroupCallsTab();
		waitForElement(10000);
		TelephonyPage.EnterCallGroupname("BC_"+Groupname);
		SelectCallGroupnumber();
		TelephonyPage.ClickOnBoardcastOption();
		TelephonyPage.ClickOnNextButton();		
		waitForElement(3000);
		TelephonyPage.EnterCallGroupmembername(Secondusernumber);	
		TelephonyPage.ClickOnDoneButton();
		TelephonyPage.EnterSearchBar("BC_"+Groupname);
		TabSwitchToChild();
		TelephonyPage.ClickOnCallGrouptab();
		TelephonyPage.ClickOnOnorOffSwitch("BC_"+Groupname);
		TabSwitchToParent();
		HomePage.ClickedOnMaximiseDiller();
		waitForElement(3000);
		CalltoUser(Groupnumber);
		waitForElement(3000);
		if(ElementDisplayed(MinimizeButton)) 
		{
			element = wait.until(ExpectedConditions.presenceOfElementLocated(MinimizeButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Minimize button has been clicked");
			ClickOnMuteCallIconIsvisible();
		}else {
			ClickOnMuteCallIconIsvisible();
		}
		TabSwitchToChild();
		waitForElement(3000);
		TelephonyPage.ClickOnIncomingCallNotification();
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		waitForElement(5000);
		if(ElementDisplayed(MinimizeButton)) 
		{
			element = wait.until(ExpectedConditions.presenceOfElementLocated(MinimizeButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Minimize button has been clicked");
			ClickOnMuteCallIconIsvisible();
		}else {
			ClickOnMuteCallIconIsvisible();
		}
		ExtentSuccessMessage("Start_TC_CTI_BC_Conference_Offline");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceaddButton));
		MoveToElementClick(element);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrenceNumberField));
		MoveToElementClick(element);
		writeText(ConfrenceNumberField, Thirdusernumber);
		String time = CurrentTime();
		System.out.println(time);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallConfreanceButton));
		MoveToElementClick(element);
		waitForElement(2000);
		TabSwitchToThirdWindow();
		ExtentSuccessMessage("*******Start Missed call On SSE_notification Tab***************");
		By MissedsmsPopup = By.xpath("//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight']");
		if(ElementDisplayed(MissedsmsPopup)){
			Assert.assertTrue(driver.findElement(MissedsmsPopup).isDisplayed());
			ExtentSuccessMessage("Successfully user able to See the 'Missed Call Popup' ");
		}else {
			ExtentErrorMessage("UNSuccessfully user not able to See the 'Missed Call Popup' ");
		}
		By MissedCallCount = By.xpath("//a[@title='Missed Calls']/span[@class='label label-warning ng-binding']");
		Assert.assertTrue(driver.findElement(MissedCallCount).isDisplayed());
		ExtentSuccessMessage("Assertion for missed SMS popup is done");
		ExtentSuccessMessage("*******End Inbound SMS On SSE_notification Tab***************");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("End_TC_CTI_BC_Conference_To_Agent_Offline_Activity_Status");
		ExtentSuccessMessage("End_TC_CTI_BC_Conference_To_Agent_Offline_Activity_Status");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BC_Conference_To_Agent_Offline_Admin_call_logs");
		ExtentSuccessMessage("Start_TC_CTI_BC_Conference_To_Agent_Offline_Admin_call_logs");
		TabSwitchToParent();
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		waitForElement(1000);
		TabSwitchToThirdWindow();
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);	
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(telephonysetup));
		MoveToElementClick(element);
		waitForElement(2000);
		TelephonyPage.ClickOnCallSMSFAXLogsManagement();
		waitForElement(1000); 
		driver.manage().window().maximize();
		waitForElement(8000);
		TelephonyPage.ClickOnCallTypeFilter();
		waitForElement(6000);
		click(CalltypeMissedcall);
		waitForElement(6000);
		TelephonyPage.EnterSearchBar(Firstusernumber);
		waitForElement(6000);
		validateMisscalledDetails(Firstusernumber);
		validateMisscalledDetails(Thirdusernumber);
		System.out.println("End_TC_CTI_BC_Conference_To_Agent_Offline_Admin_call_logs");
		ExtentSuccessMessage("End_TC_CTI_BC_Conference_To_Agent_Offline_Admin_call_logs");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BC_Conference_To_Agent_Offline_CTI_CallLogs");
		ExtentSuccessMessage("Start_TC_CTI_BC_Conference_To_Agent_Offline_CTI_CallLogs");
		splitthewindowscreen2("Right");	
		RefreshPage();
		waitForElement(10000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Logs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call Logs icon has been clicked");
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_CallLogs));
		MoveToElementClick(element);
		writeText(Input_CallLogs,Firstusernumber + Keys.ENTER);
		waitForElement(3000);
		if(ElementDisplayed(call_logs)) {
			waitForElement(3000);
			By TimeCount = By.xpath("(//span[@class='call-time-section'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
			String count = element.getText();	
			System.out.println(count);
			String timeString = StringUtils.substringAfter(count," ");
			System.out.println("---------"+timeString);
			ExtentSuccessMessage("Full Number Assertion Done");
		}
		ExtentSuccessMessage("End_TC_CTI_Conference_Offline_CTI_CallLogs");	
		ExtentSuccessMessage("*****************************************************************************");
		logout_CE_validations();
		TabSwitchToParent();
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ClickOnDeleteGroup();
		logout_CE_validations();
		TabSwitchToChild();

	}

	public void ClickOnBestFit() throws InterruptedException {
		if (ElementDisplayed(BestFitOption)) {
			ExtentSuccessMessage("Successfully user able to See 'Best Fit Option Checkbox' ");
			click(BestFitOption);
			ExtentSuccessMessage("Successfully user Clicked on 'Best Fit Option Checkbox' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'Best Fit Option' Not visible");
		}
	}

	public void ClickOnRinglesscallconnect() throws InterruptedException {
		if (ElementDisplayed(Ringlesscallconnect)) {
			ExtentSuccessMessage("Successfully user able to See 'Ringlesscallconnect Checkbox' ");
			click(Ringlesscallconnect);
			ExtentSuccessMessage("Successfully user Clicked on 'Ringlesscallconnect Checkbox' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'Ringlesscallconnect' Not visible");
		}
	}

	public void RinglessTransferToagentCall(String Value) throws InterruptedException 
	{
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTransferButton));
		MoveToElementClick(element);
		waitForElement(3000);
		By Close_Transfer = By.xpath("//a[@title='Close']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Close_Transfer));
		MoveToElementClick(element);
		waitForElement(3000);
		By Enter_Transfer_Number = By.xpath(
				"//div[@class='voice-call-dial-pad']//input[@placeholder=' Enter Phone Number or Click the icon ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Enter_Transfer_Number));
		writeText(Enter_Transfer_Number, Value);
		ExtentSuccessMessage("Entered the Online Number to Transfer");
		waitForElement(3000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		By Click_Transfer = By.xpath("(//button[@ng-show='CTICtrl.CTIContext.primarayPhoneFlags.showCallForward'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Click_Transfer));
		jsExecutor.executeScript("arguments[0].click();", element);
		ExtentSuccessMessage("Clicked on manual transfer button");
		String Present_time = CurrentTime();
		System.out.println(Present_time);
	}

	public void BF_RL_Transfer_offline() throws InterruptedException, IOException
	{
		System.out.println("Start_TC_CTI_BF_RL_Transfer_to_Agent_Offline_Activity_Status");
		ExtentSuccessMessage("Start_TC_CTI_BF_RL_Transfer_to_Agent_Offline_Activity_Status");
		By UserNumber = By.xpath("//u[@title='Voice Number']");	
		splitthewindowscreen2("Right");
		String Firstusernumber=GetElementText(UserNumber);
		System.out.println("FirstuserNumber "+Firstusernumber);
		new_Tab();
		SecondUser();
		login_CE_validations();
		waitVisibility(UserNumber);
		String Secondusernumber=GetElementText(UserNumber);
		System.out.println("Secondusernumber "+Secondusernumber);
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Left");
		ThirdUser();
		login_CE_validations();	
		RefreshPage();
		waitForElement(8000);
		waitVisibility(UserNumber);
		String Thirdusernumber=GetElementText(UserNumber);
		System.out.println("Thirdusernumber "+Thirdusernumber);
		Admin_redirection();
		Custom_Status_SetupWithtext("Offline");
		TabSwitchToParent();
		String Groupname =generateRandomText();
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToGroupCallPage();
		RefreshPage();
		waitForElement(25000);
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.ClickOnCreateGroupCallsTab();
		waitForElement(10000);
		TelephonyPage.EnterCallGroupname("BF_RL_"+Groupname);
		SelectCallGroupnumber();
		ClickOnBestFit();
		waitForElement(2000);
		ClickOnRinglesscallconnect();
		TelephonyPage.ClickOnNextButton();		
		waitForElement(3000);
		TelephonyPage.EnterCallGroupmembername(Secondusernumber);	
		TelephonyPage.ClickOnDoneButton();
		TelephonyPage.EnterSearchBar("BF_RL_"+Groupname);
		TabSwitchToChild();
		TelephonyPage.ClickOnCallGrouptab();
		TelephonyPage.ClickOnOnorOffSwitch("BF_RL_"+Groupname);
		TabSwitchToParent();
		HomePage.ClickedOnMaximiseDiller();
		waitForElement(3000);
		CalltoUser(Groupnumber);
		waitForElement(3000);
		if(ElementDisplayed(MinimizeButton)) 
		{
			element = wait.until(ExpectedConditions.presenceOfElementLocated(MinimizeButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Minimize button has been clicked");
			ClickOnMuteCallIconIsvisible();
		}else {
			ClickOnMuteCallIconIsvisible();
		}
		TabSwitchToChild();
		waitForElement(2000);
		if(ElementDisplayed(MinimizeButton)) 
		{
			element = wait.until(ExpectedConditions.presenceOfElementLocated(MinimizeButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Minimize button has been clicked");
			ClickOnMuteCallIconIsvisible();
		}else {
			ClickOnMuteCallIconIsvisible();
		}
		ExtentSuccessMessage("TC_CTI_BF_RL_Transfer_to_Agent_Offline");
		waitForElement(1000);
		RinglessTransferToagentCall(Thirdusernumber);
		waitForElement(1000);
		TabSwitchToThirdWindow();
		ExtentSuccessMessage("*******Start Missed call On SSE_notification Tab***************");
		By MissedsmsPopup = By.xpath("//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight']");
		if(ElementDisplayed(MissedsmsPopup)){
			Assert.assertTrue(driver.findElement(MissedsmsPopup).isDisplayed());
			ExtentSuccessMessage("Successfully user able to See the 'Missed Call Popup' ");
		}else {
			ExtentErrorMessage("UNSuccessfully user not able to See the 'Missed Call Popup' ");
		}
		By MissedCallCount = By.xpath("//a[@title='Missed Calls']/span[@class='label label-warning ng-binding']");
		Assert.assertTrue(driver.findElement(MissedCallCount).isDisplayed());
		ExtentSuccessMessage("Assertion for missed SMS popup is done");
		ExtentSuccessMessage("*******End SMS On SSE_notification Tab***************");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("End_TC_CTI_BF_RL_Transfer_to_Agent_Offline_Activity_Status");
		ExtentSuccessMessage("End_TTC_CTI_BF_RL_Transfer_to_Agent_Offline_Activity_Status");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BF_RL_Transfer_to_Agent_Offline_Admin_call_logs");
		ExtentSuccessMessage("Start_TC_CTI_BF_RL_Transfer_to_Agent_Offline_Admin_call_logs");
		TabSwitchToParent();
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		waitForElement(1000);
		TabSwitchToThirdWindow();
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);	
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(telephonysetup));
		MoveToElementClick(element);
		waitForElement(2000);
		TelephonyPage.ClickOnCallSMSFAXLogsManagement();
		waitForElement(1000); 
		driver.manage().window().maximize();
		waitForElement(8000);
		TelephonyPage.ClickOnCallTypeFilter();
		waitForElement(4000);
		click(CalltypeMissedcall);
		waitForElement(4000);
		TelephonyPage.EnterSearchBar(Firstusernumber);
		waitForElement(4000);
		validateMisscalledDetails(Firstusernumber);
		validateMisscalledDetails(Thirdusernumber);
		System.out.println("End_Start_TC_CTI_BF_RL_Transfer_to_Agent_Offline_Admin_call_logs");
		ExtentSuccessMessage("End_Start_TC_CTI_BF_RL_Transfer_to_Agent_Offline_Admin_call_logs");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BF_RL_Transfer_to_Agent_Offline_CTI_CallLogs");
		ExtentSuccessMessage("Start_TC_CTI_BF_RL_Transfer_to_Agent_Offline_CTI_CallLogs");
		splitthewindowscreen2("Left");	
		RefreshPage();
		waitForElement(10000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Logs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call Logs icon has been clicked");
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_CallLogs));
		MoveToElementClick(element);
		writeText(Input_CallLogs,Firstusernumber + Keys.ENTER);
		waitForElement(3000);
		if(ElementDisplayed(call_logs)) {
			waitForElement(3000);
			By TimeCount = By.xpath("(//span[@class='call-time-section'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
			String count = element.getText();	
			System.out.println(count);
			String timeString = StringUtils.substringAfter(count," ");
			System.out.println("---------"+timeString);
			ExtentSuccessMessage("Full Number Assertion Done");
		}
		ExtentSuccessMessage("End_TC_CTI_BF_RL_Transfer_to_Agent_Offline_CTI_CallLogs");	
		ExtentSuccessMessage("*****************************************************************************");
		logout_CE_validations();
		TabSwitchToParent();
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ClickOnDeleteGroup();
		logout_CE_validations();
		TabSwitchToChild();			
	}

	public void BF_RL_Transfer_Custom_Message() throws InterruptedException, IOException
	{
		System.out.println("Start_TC_CTI_BF_RL_Transfer_to_Agent_Custom_Message_Activity_Status");
		ExtentSuccessMessage("Start_TC_CTI_BF_RL_Transfer_to_Agent_Custom_Message_Activity_Status");
		By UserNumber = By.xpath("//u[@title='Voice Number']");	
		splitthewindowscreen2("Right");
		String Firstusernumber=GetElementText(UserNumber);
		System.out.println("FirstuserNumber "+Firstusernumber);
		new_Tab();
		SecondUser();
		login_CE_validations();
		waitVisibility(UserNumber);
		String Secondusernumber=GetElementText(UserNumber);
		System.out.println("Secondusernumber "+Secondusernumber);
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Left");
		ThirdUser();
		login_CE_validations();	
		RefreshPage();
		waitForElement(8000);
		waitVisibility(UserNumber);
		String Thirdusernumber=GetElementText(UserNumber);
		System.out.println("Thirdusernumber "+Thirdusernumber);
		Admin_redirection();
		String Custom_Status = "Test"+generateRandomThreeDigitNumber();
		Custom_Status_SetupWithtext(Custom_Status);
		TabSwitchToParent();
		String Groupname =generateRandomText();
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToGroupCallPage();
		RefreshPage();
		waitForElement(25000);
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.ClickOnCreateGroupCallsTab();
		waitForElement(10000);
		TelephonyPage.EnterCallGroupname("BF_RL_"+Groupname);
		SelectCallGroupnumber();
		ClickOnBestFit();
		waitForElement(2000);
		ClickOnRinglesscallconnect();
		TelephonyPage.ClickOnNextButton();		
		waitForElement(3000);
		TelephonyPage.EnterCallGroupmembername(Secondusernumber);	
		TelephonyPage.ClickOnDoneButton();
		TelephonyPage.EnterSearchBar("BF_RL_"+Groupname);
		TabSwitchToChild();
		TelephonyPage.ClickOnCallGrouptab();
		TelephonyPage.ClickOnOnorOffSwitch("BF_RL_"+Groupname);
		TabSwitchToParent();
		HomePage.ClickedOnMaximiseDiller();
		waitForElement(3000);
		CalltoUser(Groupnumber);
		waitForElement(3000);
		if(ElementDisplayed(MinimizeButton)) 
		{
			element = wait.until(ExpectedConditions.presenceOfElementLocated(MinimizeButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Minimize button has been clicked");
			ClickOnMuteCallIconIsvisible();
		}else {
			ClickOnMuteCallIconIsvisible();
		}
		TabSwitchToChild();
		waitForElement(2000);
		if(ElementDisplayed(MinimizeButton)) 
		{
			element = wait.until(ExpectedConditions.presenceOfElementLocated(MinimizeButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Minimize button has been clicked");
			ClickOnMuteCallIconIsvisible();
		}else {
			ClickOnMuteCallIconIsvisible();
		}
		ExtentSuccessMessage("TC_CTI_BF_RL_Transfer_to_Agent_Offline");
		waitForElement(1000);
		RinglessTransferToagentCall(Thirdusernumber);
		waitForElement(1000);
		TabSwitchToThirdWindow();
		ExtentSuccessMessage("*******Start Missed call On SSE_notification Tab***************");
		By MissedsmsPopup = By.xpath("//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight']");
		if(ElementDisplayed(MissedsmsPopup)){
			Assert.assertTrue(driver.findElement(MissedsmsPopup).isDisplayed());
			ExtentSuccessMessage("Successfully user able to See the 'Missed Call Popup' ");
		}else {
			ExtentErrorMessage("UNSuccessfully user not able to See the 'Missed Call Popup' ");
		}
		By MissedCallCount = By.xpath("//a[@title='Missed Calls']/span[@class='label label-warning ng-binding']");
		Assert.assertTrue(driver.findElement(MissedCallCount).isDisplayed());
		ExtentSuccessMessage("Assertion for missed SMS popup is done");
		ExtentSuccessMessage("*******End SMS On SSE_notification Tab***************");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("End_TC_CTI_BF_RL_Transfer_to_Agent_Custom_Message_Activity_Status");
		ExtentSuccessMessage("End_TTC_CTI_BF_RL_Transfer_to_Agent_Custom_Message_Activity_Status");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BF_RL_Transfer_to_Agent_Custom_Message_Admin_call_logs");
		ExtentSuccessMessage("Start_TC_CTI_BF_RL_Transfer_to_Agent_Custom_Message_Admin_call_logs");
		TabSwitchToParent();
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		waitForElement(1000);
		TabSwitchToThirdWindow();
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);	
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(telephonysetup));
		MoveToElementClick(element);
		waitForElement(2000);
		TelephonyPage.ClickOnCallSMSFAXLogsManagement();
		waitForElement(1000); 
		driver.manage().window().maximize();
		waitForElement(8000);
		TelephonyPage.ClickOnCallTypeFilter();
		waitForElement(4000);
		click(CalltypeMissedcall);
		waitForElement(4000);
		TelephonyPage.EnterSearchBar(Firstusernumber);
		waitForElement(4000);
		validateMisscalledDetails(Firstusernumber);
		validateMisscalledDetails(Thirdusernumber);
		System.out.println("End_Start_TC_CTI_BF_RL_Transfer_to_Agent_Custom_Message_Admin_call_logs");
		ExtentSuccessMessage("End_Start_TC_CTI_BF_RL_Transfer_to_Agent_Custom_Message_Admin_call_logs");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BF_RL_Transfer_to_Agent_Custom_Message_CTI_CallLogs");
		ExtentSuccessMessage("Start_TC_CTI_BF_RL_Transfer_to_Agent_Custom_Message_CTI_CallLogs");
		splitthewindowscreen2("Left");	
		RefreshPage();
		waitForElement(10000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Logs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call Logs icon has been clicked");
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_CallLogs));
		MoveToElementClick(element);
		writeText(Input_CallLogs,Firstusernumber + Keys.ENTER);
		waitForElement(3000);
		if(ElementDisplayed(call_logs)) {
			waitForElement(3000);
			By TimeCount = By.xpath("(//span[@class='call-time-section'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
			String count = element.getText();	
			System.out.println(count);
			String timeString = StringUtils.substringAfter(count," ");
			System.out.println("---------"+timeString);
			ExtentSuccessMessage("Full Number Assertion Done");
		}
		ExtentSuccessMessage("End_TC_CTI_BF_RL_Transfer_to_Agent_Custom_Message_CTI_CallLogs");	
		ExtentSuccessMessage("*****************************************************************************");
		logout_CE_validations();
		TabSwitchToParent();
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ClickOnDeleteGroup();
		logout_CE_validations();
		TabSwitchToChild();			
	}

	public void BF_RL_Conference_offline() throws InterruptedException, IOException
	{
		System.out.println("Start_TC_CTI_BF_RL_Conference_to_Agent_Offline_Activity_Status");
		ExtentSuccessMessage("Start_TC_CTI_BF_RL_Conference_to_Agent_Offline_Activity_Status");
		By UserNumber = By.xpath("//u[@title='Voice Number']");	
		splitthewindowscreen2("Right");
		String Firstusernumber=GetElementText(UserNumber);
		System.out.println("FirstuserNumber "+Firstusernumber);
		new_Tab();
		SecondUser();
		login_CE_validations();
		waitVisibility(UserNumber);
		String Secondusernumber=GetElementText(UserNumber);
		System.out.println("Secondusernumber "+Secondusernumber);
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Left");
		ThirdUser();
		login_CE_validations();	
		RefreshPage();
		waitForElement(8000);
		waitVisibility(UserNumber);
		String Thirdusernumber=GetElementText(UserNumber);
		System.out.println("Thirdusernumber "+Thirdusernumber);
		Admin_redirection();
		Custom_Status_SetupWithtext("Offline");
		TabSwitchToParent();
		String Groupname =generateRandomText();
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToGroupCallPage();
		RefreshPage();
		waitForElement(25000);
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.ClickOnCreateGroupCallsTab();
		waitForElement(10000);
		TelephonyPage.EnterCallGroupname("BF_RL_"+Groupname);
		SelectCallGroupnumber();
		ClickOnBestFit();
		waitForElement(2000);
		ClickOnRinglesscallconnect();
		TelephonyPage.ClickOnNextButton();		
		waitForElement(3000);
		TelephonyPage.EnterCallGroupmembername(Secondusernumber);	
		TelephonyPage.ClickOnDoneButton();
		TelephonyPage.EnterSearchBar("BF_RL_"+Groupname);
		TabSwitchToChild();
		TelephonyPage.ClickOnCallGrouptab();
		TelephonyPage.ClickOnOnorOffSwitch("BF_RL_"+Groupname);
		TabSwitchToParent();
		HomePage.ClickedOnMaximiseDiller();
		waitForElement(3000);
		CalltoUser(Groupnumber);
		waitForElement(3000);
		if(ElementDisplayed(MinimizeButton)) 
		{
			element = wait.until(ExpectedConditions.presenceOfElementLocated(MinimizeButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Minimize button has been clicked");
			ClickOnMuteCallIconIsvisible();
		}else {
			ClickOnMuteCallIconIsvisible();
		}
		TabSwitchToChild();
		waitForElement(2000);
		if(ElementDisplayed(MinimizeButton)) 
		{
			element = wait.until(ExpectedConditions.presenceOfElementLocated(MinimizeButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Minimize button has been clicked");
			ClickOnMuteCallIconIsvisible();
		}else {
			ClickOnMuteCallIconIsvisible();
		}
		ExtentSuccessMessage("Start_TC_CTI_BF_RL_Conference_to_Agent_Offline");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Confrenceaddbutton));
		MoveToElementClick(element);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ConfrencenumberField));
		MoveToElementClick(element);
		writeText(ConfrencenumberField, Thirdusernumber);
		String time = CurrentTime();
		System.out.println(time);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallConfreanceButton));
		MoveToElementClick(element);
		waitForElement(2000);
		TabSwitchToThirdWindow();
		ExtentSuccessMessage("*******Start Missed call On SSE_notification Tab***************");
		By MissedsmsPopup = By.xpath("//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight']");
		if(ElementDisplayed(MissedsmsPopup)){
			Assert.assertTrue(driver.findElement(MissedsmsPopup).isDisplayed());
			ExtentSuccessMessage("Successfully user able to See the 'Missed Call Popup' ");
		}else {
			ExtentErrorMessage("UNSuccessfully user not able to See the 'Missed Call Popup' ");
		}
		By MissedCallCount = By.xpath("//a[@title='Missed Calls']/span[@class='label label-warning ng-binding']");
		Assert.assertTrue(driver.findElement(MissedCallCount).isDisplayed());
		ExtentSuccessMessage("Assertion for missed SMS popup is done");
		ExtentSuccessMessage("*******End SMS On SSE_notification Tab***************");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("End_TC_CTI_BF_RL_Conference_to_Agent_Offline_Activity_Status");
		ExtentSuccessMessage("End_TTC_CTI_BF_RL_Transfer_to_Agent_Offline_Activity_Status");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BF_RL_Conference_to_Agent_Offline_Admin_call_logs");
		ExtentSuccessMessage("Start_TC_CTI_BF_RL_Conference_to_Agent_Offline_Admin_call_logs");
		TabSwitchToParent();
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		waitForElement(1000);
		TabSwitchToThirdWindow();
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);	
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(telephonysetup));
		MoveToElementClick(element);
		waitForElement(2000);
		TelephonyPage.ClickOnCallSMSFAXLogsManagement();
		waitForElement(1000); 
		driver.manage().window().maximize();
		waitForElement(4000);
		TelephonyPage.ClickOnCallTypeFilter();
		waitForElement(3000);
		click(CalltypeMissedcall);
		waitForElement(3000);
		TelephonyPage.EnterSearchBar(Firstusernumber);
		waitForElement(3000);
		validateMisscalledDetails(Firstusernumber);
		validateMisscalledDetails(Thirdusernumber);
		System.out.println("End_Start_TC_CTI_BF_RL_Conference_to_Agent_Offline_Admin_call_logs");
		ExtentSuccessMessage("End_Start_TC_CTI_BF_RL_Conference_to_Agent_Offline_Admin_call_logs");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BF_RL_Conference_to_Agent_Offline_CTI_CallLogs");
		ExtentSuccessMessage("Start_TC_CTI_BF_RL_Conference_to_Agent_Offline_CTI_CallLogs");
		splitthewindowscreen2("Left");	
		RefreshPage();
		waitForElement(10000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Logs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call Logs icon has been clicked");
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_CallLogs));
		MoveToElementClick(element);
		writeText(Input_CallLogs,Firstusernumber + Keys.ENTER);
		waitForElement(3000);
		if(ElementDisplayed(call_logs)) {
			waitForElement(3000);
			By TimeCount = By.xpath("(//span[@class='call-time-section'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
			String count = element.getText();	
			System.out.println(count);
			String timeString = StringUtils.substringAfter(count," ");
			System.out.println("---------"+timeString);
			ExtentSuccessMessage("Full Number Assertion Done");
		}
		ExtentSuccessMessage("End_TC_CTI_BF_RL_Conference_to_Agent_Offline_CTI_CallLogs");	
		ExtentSuccessMessage("*****************************************************************************");
		logout_CE_validations();
		TabSwitchToParent();
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ClickOnDeleteGroup();
		logout_CE_validations();
		TabSwitchToChild();			
	}

	public void BF_RG_Transfer_offline() throws InterruptedException, IOException
	{
		System.out.println("Start_TC_CTI_BF_RG_Transfer_to_Agent_Offline_Activity_Status");
		ExtentSuccessMessage("Start_TC_CTI_BF_RG_Transfer_to_Agent_Offline_Activity_Status");
		By UserNumber = By.xpath("//u[@title='Voice Number']");	
		splitthewindowscreen2("Right");
		String Firstusernumber=GetElementText(UserNumber);
		System.out.println("FirstuserNumber "+Firstusernumber);
		new_Tab();
		SecondUser();
		login_CE_validations();
		waitVisibility(UserNumber);
		String Secondusernumber=GetElementText(UserNumber);
		System.out.println("Secondusernumber "+Secondusernumber);
		new_Window();
		maximizeWindow();
		splitthewindowscreen2("Left");
		ThirdUser();
		login_CE_validations();	
		RefreshPage();
		waitForElement(8000);
		waitVisibility(UserNumber);
		String Thirdusernumber=GetElementText(UserNumber);
		System.out.println("Thirdusernumber "+Thirdusernumber);
		Admin_redirection();
		Custom_Status_SetupWithtext("Offline");
		TabSwitchToParent();
		String Groupname =generateRandomText();
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.NavigateToGroupCallPage();
		RefreshPage();
		waitForElement(25000);
		TelephonyPage.ClickOnMinimizeCallwindow();
		TelephonyPage.ClickOnCreateGroupCallsTab();
		waitForElement(10000);
		TelephonyPage.EnterCallGroupname("BF_RG_"+Groupname);
		SelectCallGroupnumber();
		ClickOnBestFit();
		waitForElement(2000);
		ClickOnRinglesscallconnect();
		TelephonyPage.ClickOnNextButton();		
		waitForElement(3000);
		TelephonyPage.EnterCallGroupmembername(Secondusernumber);	
		TelephonyPage.ClickOnDoneButton();
		TelephonyPage.EnterSearchBar("BF_RG_"+Groupname);
		TabSwitchToChild();
		TelephonyPage.ClickOnCallGrouptab();
		TelephonyPage.ClickOnOnorOffSwitch("BF_RG_"+Groupname);
		TabSwitchToParent();
		HomePage.ClickedOnMaximiseDiller();
		waitForElement(3000);
		CalltoUser(Groupnumber);
		waitForElement(3000);
		if(ElementDisplayed(MinimizeButton)) 
		{
			element = wait.until(ExpectedConditions.presenceOfElementLocated(MinimizeButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Minimize button has been clicked");
			ClickOnMuteCallIconIsvisible();
		}else {
			ClickOnMuteCallIconIsvisible();
		}
		TabSwitchToChild();
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);
		waitForElement(2000);
		if(ElementDisplayed(MinimizeButton)) 
		{
			element = wait.until(ExpectedConditions.presenceOfElementLocated(MinimizeButton));
			MoveToElementClick(element);
			ExtentSuccessMessage("Minimize button has been clicked");
			ClickOnMuteCallIconIsvisible();
		}else {
			ClickOnMuteCallIconIsvisible();
		}
		ExtentSuccessMessage("TC_CTI_BF_RG_Transfer_to_Agent_Offline");
		waitForElement(1000);
		RinglessTransferToagentCall(Thirdusernumber);
		waitForElement(1000);
		TabSwitchToThirdWindow();
		ExtentSuccessMessage("*******Start Missed call On SSE_notification Tab***************");
		By MissedsmsPopup = By.xpath("//div[@class='col-xs-11 col-sm-3 alert alert-pastel-info animated fadeInRight']");
		if(ElementDisplayed(MissedsmsPopup)){
			Assert.assertTrue(driver.findElement(MissedsmsPopup).isDisplayed());
			ExtentSuccessMessage("Successfully user able to See the 'Missed Call Popup' ");
		}else {
			ExtentErrorMessage("UNSuccessfully user not able to See the 'Missed Call Popup' ");
		}
		By MissedCallCount = By.xpath("//a[@title='Missed Calls']/span[@class='label label-warning ng-binding']");
		Assert.assertTrue(driver.findElement(MissedCallCount).isDisplayed());
		ExtentSuccessMessage("Assertion for missed SMS popup is done");
		ExtentSuccessMessage("*******End SMS On SSE_notification Tab***************");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("End_TC_CTI_BF_RG_Transfer_to_Agent_Offline_Activity_Status");
		ExtentSuccessMessage("End_TTC_CTI_BF_RG_Transfer_to_Agent_Offline_Activity_Status");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BF_RG_Transfer_to_Agent_Offline_Admin_call_logs");
		ExtentSuccessMessage("Start_TC_CTI_BF_RG_Transfer_to_Agent_Offline_Admin_call_logs");
		TabSwitchToParent();
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDeclineButton));
		MoveToElementClick(element);
		waitForElement(1000);
		TabSwitchToThirdWindow();
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);	
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(telephonysetup));
		MoveToElementClick(element);
		waitForElement(2000);
		TelephonyPage.ClickOnCallSMSFAXLogsManagement();
		waitForElement(1000); 
		driver.manage().window().maximize();
		waitForElement(8000);
		TelephonyPage.ClickOnCallTypeFilter();
		waitForElement(4000);
		click(CalltypeMissedcall);
		waitForElement(4000);
		TelephonyPage.EnterSearchBar(Firstusernumber);
		waitForElement(4000);
		validateMisscalledDetails(Firstusernumber);
		validateMisscalledDetails(Thirdusernumber);
		System.out.println("End_Start_TC_CTI_BF_RG_Transfer_to_Agent_Offline_Admin_call_logs");
		ExtentSuccessMessage("End_Start_TC_CTI_BF_RG_Transfer_to_Agent_Offline_Admin_call_logs");
		ExtentSuccessMessage("*****************************************************************************");
		System.out.println("Start_TC_CTI_BF_RG_Transfer_to_Agent_Offline_CTI_CallLogs");
		ExtentSuccessMessage("Start_TC_CTI_BF_RG_Transfer_to_Agent_Offline_CTI_CallLogs");
		splitthewindowscreen2("Left");	
		RefreshPage();
		waitForElement(10000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Logs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call Logs icon has been clicked");
		waitForElement(5000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Input_CallLogs));
		MoveToElementClick(element);
		writeText(Input_CallLogs,Firstusernumber + Keys.ENTER);
		waitForElement(3000);
		if(ElementDisplayed(call_logs)) {
			waitForElement(3000);
			By TimeCount = By.xpath("(//span[@class='call-time-section'])[1]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(TimeCount));
			String count = element.getText();	
			System.out.println(count);
			String timeString = StringUtils.substringAfter(count," ");
			System.out.println("---------"+timeString);
			ExtentSuccessMessage("Full Number Assertion Done");
		}
		ExtentSuccessMessage("End_TC_CTI_BF_RG_Transfer_to_Agent_Offline_CTI_CallLogs");	
		ExtentSuccessMessage("*****************************************************************************");
		logout_CE_validations();
		TabSwitchToParent();
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		ClickOnDeleteGroup();
		logout_CE_validations();
		TabSwitchToChild();			
	}

	public void CUstom_Status_SetupWithtext(String Value) throws InterruptedException
	{
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
		//element = wait.until(ExpectedConditions.presenceOfElementLocated(Custom_DD));
		clear(Custom_DD);
		Thread.sleep(2000);
		Custom_Status = "Test"+Value;
		writeText(Custom_DD,Custom_Status);
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

		By CustomStatus = By.xpath("//span[contains(text(),'"+Custom_Status+"')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomStatus));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on the Offline Customset Buttons");


		////div[@id='divSuccess']

	}	

	public void CUstom_Status_SetupWithtext1(String Value) throws InterruptedException
	{
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
		//element = wait.until(ExpectedConditions.presenceOfElementLocated(Custom_DD));
		clear(Custom_DD);
		Thread.sleep(2000);
		Custom_Status = Value;
		writeText(Custom_DD,Custom_Status);
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

		By CustomStatus = By.xpath("//span[contains(text(),'"+Custom_Status+"')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomStatus));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on the Offline Customset Buttons");


		////div[@id='divSuccess']

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

}