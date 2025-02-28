package com.pages;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.BasePackage.Base_Class;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class NonSyncAgentPopupPage extends BasePage {


	public NonSyncAgentPopupPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	TelephonyPage TelephonyPage = new TelephonyPage(driver);
	CustomerEngageFunctionalityValidations cfv = new CustomerEngageFunctionalityValidations(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement element;

	String URL = null;
	String zipcode = null;
	String time = null;
	String callscriptname = null;
	String callscriptname1 = null;
	private By SelectUser = By.xpath("//a[@class='nav-link dropdown-toggle']");
	private By SelectLogout = By.xpath("(//a[contains(.,'Log Out')])[1]");
	private By EnterPhoneNumberField = By.xpath("//input[@placeholder='Enter Phone Number']");
	private By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
	private By CTIMinimizeIcon = By.xpath("//a[@class='fa fa-minus right-al']");
	private By call = By.xpath("(//i[@class='fa fa-phone'])[1]");
	private By CallAcceptButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[2]");
	By userID = By.id("user-name");//------//for userid at Login page
	By pwd = By.id("password");//-------for password at home page
	//	private By Activitylog = By.xpath("//a[normalize-space()='Activity Logs']");
	//	private By Leadstatus = By.xpath("(//div[@class='ui-grid-cell-contents ng-binding ng-scope'])[4]");
	//	private By Basicinfo = By.xpath("//a[normalize-space()='Basic Information']");
	By signIn = By.xpath("//*[@id='form-validation-button']");//-------for button on home page	
	private By CallMute = By.xpath("//*[contains(@ng-class,'{disabledMute')]");
	private By Firstname = By.xpath("//input[@id='LeadFirstName']");
	private By Lastname = By.xpath("//input[@id='LeadLastName']");
	private By Email = By.xpath("//input[@id='LeadEmail']");
	private By DOB = By.xpath("//input[@id='DOB']");
	private By Gender = By.xpath("//*[@class='select-input-container required']//select[@id='Gender'][@name='Gender'][@md-container-class='dropDown']");
	private By ZipCode = By.xpath("//input[@name='ZipCode']");
	private By Submit = By.xpath("//span[normalize-space()='Submit']");
	private By LeadType = By.xpath("//select[@id='LeadType']");
	private By Saletype = By.xpath("//select[@id='SaleType']");
	private By HRA = By.xpath("//select[@id='HRACompleted']");
	private By EditIcon = By.xpath("//button[@id='editLeadsBtn']");
	private By LeadMobile = By.xpath("//input[@name='LeadMobile']");
	private By Save = By.xpath("//button[normalize-space()='Save']");
	private By Contactinfo = By.xpath("(//div[@class='accordion-container'])[3]");
	private By Declinecall = By.xpath("//button[@ng-click='CTICtrl.endActiveCall()']");
	private By Cancel = By.xpath("//span[normalize-space()='Cancel']");
	private By submit = By.xpath("//button[@name='SubmitButton']");
	private By textarea = By.xpath("//textarea[@name='CallNotes']");
	private By textcomments = By.xpath("(//textarea[@name='Comments'])[2]");
	private By disposition = By.xpath("//select[@id='CallDisposition']");
	private By viewcalllogs = By.xpath("//button[@id='viceCallLogsBtn']");
	private By Admin = By.xpath("//a[@id='menu_Admin']");
	private By telephonysetup = By.xpath("//a[@id='submenu_adminmanageaccount']");
	private By search = By.xpath("//input[@type='search'][@aria-label = 'Search your text']");
	private By editIcon = By.xpath("//i[@class='fa fa-pencil white']");
	private By contactinfo = By.xpath("(//i[@class='acc glyphicon glyphicon-plus'])[2]");
	private By CustMobile = By.xpath("(//input[@name='CellPhone'])[1]");
	private By CheckUserLogin = By.xpath("//button[@class='positive md-button md-ink-ripple']");
	private By dispostionPopup = By.xpath("//h5[@ng-click='leadTOrCustomerSectionToggle()']");
	private By ViewAndManageNumbers = By.xpath("//*[@id='manage-account-home']//*[text()='View & Manage Numbers']//parent::div//button[contains(@name,'manage')] | (//*[contains(.,'Manage Numbers')]//button[@id='manageNumbersBtn'])[1]");
	private By SearchBar = By.xpath("//*[@aria-label='Search your text'] | //*[@aria-label='Search Phone numbers']");
	private By notes = By.xpath("//i[@title='Quick Notes']");
	private By InboundLeadCallcheckbox = By.xpath("//*[text()='Inbound Lead Call ']//parent::md-input-container//md-checkbox");
	private By OutboundLeadCallcheckbox = By.xpath("//*[text()='Outbound  Lead Call']//parent::md-input-container//md-checkbox");
	private By InboundCustomerCallcheckbox = By.xpath("//*[text()='Inbound Customer Call ']//parent::md-input-container//md-checkbox");
	private By OutboundCustomerCallcheckbox = By.xpath("//*[text()='Outbound Customer Call ']//parent::md-input-container//md-checkbox");
	private By ok_btn = By.xpath("//button[normalize-space()='OK']"); 
	private By Success_Message = By.xpath("//div[@id='divSuccess']");
	private By menusales = By.xpath("//a[@id='menu_Sales']");
	private By submenuleads = By.xpath("//a[@id='submenu_salesleads']");
	private By ID = By.xpath("(//a[@class='ng-binding'])[5]");
	private By FirstRowFromTable = By.xpath("(//*[@ng-click='grid.appScope.navigateToCallDetails(row.entity);'])[1]//a");
	private By SSID = By.xpath("//p[text()='Call SID']/..//p[@class='formContent ng-binding ng-scope']");
	private By Caller = By.xpath("//td[normalize-space()='Caller']");
	private By Callee = By.xpath("//td[normalize-space()='Callee']");
	private By Play = By.xpath("//p[normalize-space()='Incoming Call']");
	private By Call_Script = By.xpath("//i[@title='Call Script']");
	private By Select_Call_Script = By.xpath("//select[@ng-model='callScriptModel']");
	private By Preview = By.xpath("//button[@title='Preview']");
	private By Close_Preview = By.xpath("//button[normalize-space()='Close Preview']");
	private By cancel = By.xpath("//button[@title='Cancel']");
	private By Remove = By.xpath("//button[@title='Remove']");
	private By Update = By.xpath("//button[@title='Save']");
	private By CallScript_Popup = By.xpath("//h5[normalize-space()='Call Script']");
	private By CallScriptPopup = By.xpath("(//h5[normalize-space()='Call Script'])[2]");
	private By Home = By.xpath("//a[@id='menu_home']");
	
	//private By CallScript_Popup = By.xpath("//i[@class='acc glyphicon glyphicon-chevron-up']");
	private By CallScript_Preview = By.xpath("//h5[@class='modal-title ng-binding']");
	
	
	
	public static int generateRandomThreeDigitNumber() {
		Random random = new Random();
		int randomNumber = 100 + random.nextInt(900); // Generates a number between 100 and 999
		return randomNumber;
	}

	public String randomName() {
		String allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String ssn = "";
		String temp = RandomStringUtils.random(10, allowedChars);
		ssn = temp.substring(0, temp.length() - 5);
		return ssn;
	}

	public void currenturl() throws InterruptedException {
		waitForElement(3000);
		URL = driver.getCurrentUrl();
		System.out.println("Current URL = "+ URL);	
	}
	
	
	public void Usertwo() throws InterruptedException, IOException
	{
		waitForElement(1000);	
		System.out.println(URL);
		String Url = URL;
		System.out.println(Url);
		String jenkinsUrl = System.getProperty("URL");
		if (jenkinsUrl != null && !jenkinsUrl.isEmpty()) {
			Url = jenkinsUrl;
		}
		waitForElement(1000);
		String username = configloader().getProperty("PLCA_UserName8");
		String pswd = configloader().getProperty("PLCA_Password8");
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

	}

	public void validatedispositionDetails(String Value) throws InterruptedException {
		By elements =By.xpath("(//*[@class='ui-grid-canvas']//*[contains(text(),'"+Value+"')])[1]");
		if (ElementDisplayed(elements)) {
			ExtentSuccessMessage("Successfully user able to See the '"+Value+"'inside the web table ");

		} else {
			ExtentErrorMessage("Unsuccessfully  '"+Value+"' Not visible inside the web table");
		}		

	}

	public void waitForElement(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public void ClickOnMuteCallIconIsvisible() throws InterruptedException {
		if(ElementDisplayed(CallMute)) {
			ExtentSuccessMessage("Successfully user able to See 'CallMute Icon' ");
			waitVisibility(CallMute);
			click(CallMute);
			ExtentSuccessMessage("Successfully user Clicked on 'CallMute Icon' ");
		}else {
			ExtentSuccessMessage("Unsuccessfully 'CallMute Icon' Not visible");
		}
	}

	public void SelectHRA() throws InterruptedException 
	{	
		waitVisibility(HRA);
		WebElement dropdown = driver.findElement(HRA);
		Select Dropdown = new Select(dropdown);
		Dropdown.selectByIndex(1);
		ExtentSuccessMessage("Successfully selected HRA");
		waitForElement(2000);
	}
	public void Selectsaletype() throws InterruptedException 
	{	
		WebElement dropdown = driver.findElement(Saletype);
		Select Dropdown = new Select(dropdown);
		Dropdown.selectByIndex(1);
		ExtentSuccessMessage("Successfully selected Saletype");
		waitForElement(2000);		
	}

	public void selectLeadtype() throws InterruptedException 
	{	
		waitForElement(1000);
		WebElement dropdown = driver.findElement(LeadType);
		Select Dropdown = new Select(dropdown);
		waitForElement(1000);
		//Dropdown.selectByIndex(15);
		Dropdown.selectByVisibleText("Not Interested");
		ExtentSuccessMessage("Successfully selected LeadType");
		waitForElement(2000);		
	}

	public void DispositionLead() throws InterruptedException 
	{	
		waitForElement(1000);
		WebElement dropdown = driver.findElement(LeadType);
		Select Dropdown = new Select(dropdown);
		waitForElement(1000);
		//Dropdown.selectByIndex(19);
		driver.get(URL);
		Dropdown.selectByVisibleText("Sale");
		ExtentSuccessMessage("Successfully selected DispositionLead");
		waitForElement(2000);		
	}
	
	public void dispositionlead() throws InterruptedException 
	{	
		waitForElement(1000);
		WebElement dropdown = driver.findElement(LeadType);
		Select Dropdown = new Select(dropdown);
		waitForElement(1000);
		Dropdown.selectByVisibleText("Sale Opportunity");
		ExtentSuccessMessage("Successfully selected DispositionLead");
		waitForElement(2000);		
	}

	public void selectLead() throws InterruptedException 
	{	
		waitForElement(1000);
		WebElement dropdown = driver.findElement(LeadType);
		Select Dropdown = new Select(dropdown);
		waitForElement(1000);
		//Dropdown.selectByIndex(20);
		Dropdown.selectByVisibleText("No Answer");
		ExtentSuccessMessage("Successfully selected LeadType");
		waitForElement(2000);		
	}

	public void SelectGender() throws InterruptedException 
	{	
		waitForElement(1000);
		WebElement dropdown = driver.findElement(Gender);
		Select Dropdown = new Select(dropdown);
		waitForElement(1000);
		Dropdown.selectByIndex(1);
		ExtentSuccessMessage("Successfully selected Gender");
		waitForElement(2000);		
	}

	public void calldisposition() throws InterruptedException 
	{	
		waitForElement(1000);
		WebElement dropdown = driver.findElement(disposition);
		Select Dropdown = new Select(dropdown);
		waitForElement(1000);
		//Dropdown.selectByIndex(7);
		Dropdown.selectByVisibleText("Call Back");
		ExtentSuccessMessage("Successfully selected calldisposition");
		waitForElement(2000);		
	}

	public void callbackdisposition() throws InterruptedException 
	{	
		waitForElement(1000);
		WebElement dropdown = driver.findElement(disposition);
		Select Dropdown = new Select(dropdown);
		waitForElement(1000);
		//Dropdown.selectByIndex(1);
		Dropdown.selectByVisibleText("Call Back");
		ExtentSuccessMessage("Successfully selected disposition");
		waitForElement(2000);		
	}

	public void MoveToElementClick(WebElement element) throws InterruptedException {    
		Thread.sleep(1500);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		// Use JavaScript Executor to move to the element
		jsExecutor.executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center', inline: 'center'});", element);
		// Click the element using JavaScript Executor
		jsExecutor.executeScript("arguments[0].click();", element);
	}

	public void edit_lead_details() throws InterruptedException 
	{
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EditIcon));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Edit Icon");
		waitForElement(3000);	
		SelectHRA();
		waitForElement(2000);
		Selectsaletype();
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Contactinfo));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Contact information");
		click(Contactinfo);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadMobile));
		clear(LeadMobile);
		ExtentSuccessMessage("Cleared Mobile Number");
		String PhNo = generatePhoneNumber();
		writeText(LeadMobile, PhNo + Keys.ENTER);
		ExtentSuccessMessage("New Phonenumber has been entered");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Save));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Save Button");
		waitForElement(2000);	
	}

	public void edit_customer_details() throws InterruptedException 
	{
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(editIcon));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Edit Icon");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(contactinfo));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Contact information");
		//click(contactinfo);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustMobile));
		clear(CustMobile);
		ExtentSuccessMessage("Cleared Mobile Number");
		String PhNo = generatePhoneNumber();
		writeText(CustMobile, PhNo + Keys.ENTER);
		ExtentSuccessMessage("New Phonenumber has been entered");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Save));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Save Button");
		waitForElement(2000);	
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


	public void validate_Mandatory_Fields() throws InterruptedException 
	{
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		WebElement SenderNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String Sender_Number=SenderNumber.getText();
		driver.switchTo().window(tabs.get(1));
		WebElement ReceiveNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String Number=ReceiveNumber.getText();
		waitForElement(1000);
		driver.switchTo().window(tabs.get(0));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
		MoveToElementClick(element);//clicking on PhoneNumber Field
		writeText(EnterPhoneNumberField, Number);
		ExtentSuccessMessage("Phone Number has been entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);//clicking on Call Button
		ExtentSuccessMessage("clicked on Call Button");
		waitForElement(1000);
		By ok = By.xpath("//span[normalize-space()='Ok']");
		if(ElementDisplayed(ok)) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(ok));
			MoveToElementClick(element);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
		}
		waitForElement(2000);
		//ClickOnMuteCallIconIsvisible();
		driver.switchTo().window(tabs.get(1));
		waitForElement(2000);
		waitVisibility(CallAcceptButton);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);	
		ExtentSuccessMessage("clicked on Accept Button");
		waitForElement(2000);
		//ClickOnMuteCallIconIsvisible();
		waitForElement(4000);	
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(DOB));
//		String dob = "07/22/2024";
//		writeText(DOB, dob + Keys.ENTER);
//		ExtentSuccessMessage("DOB has been entered");
		waitVisibility(dispostionPopup);
		if(ElementDisplayed(dispostionPopup)) {		
			waitForElement(1000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(ZipCode));
			zipcode = "32323";
			writeText(ZipCode, zipcode + Keys.ENTER);
			ExtentSuccessMessage("ZipCode has been entered");
			waitForElement(1000);	
			SelectGender();
			waitForElement(1000);
			URL = driver.getCurrentUrl();
			System.out.println("URL: "+URL);
			if(URL.contains("https://mme.benefitalign.com"))
			{
				selectLead();
			}
			ExtentSuccessMessage("*************Submit Disposition*************");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Submit));
			Assert.assertTrue(driver.findElement(Submit).isDisplayed());
			ExtentSuccessMessage("Submit Assertion has been done");
			MoveToElementClick(element);
			ExtentSuccessMessage("clicked on Submit Button");		
			waitForElement(14000);
		} else {
			Thread.sleep(3000);
			if(ElementDisplayed(dispostionPopup)) {
				waitForElement(1000);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(ZipCode));
				zipcode = "32323";
				writeText(ZipCode, zipcode + Keys.ENTER);
				ExtentSuccessMessage("ZipCode has been entered");
				waitForElement(1000);	
				SelectGender();
				waitForElement(1000);
				URL = driver.getCurrentUrl();
				System.out.println("URL: "+URL);
				if(URL.contains("https://mme.benefitalign.com"))
				{
					selectLead();
				}
				ExtentSuccessMessage("*************Submit Disposition*************");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Submit));
				Assert.assertTrue(driver.findElement(Submit).isDisplayed());
				ExtentSuccessMessage("Submit Assertion has been done");
				MoveToElementClick(element);
				ExtentSuccessMessage("clicked on Submit Button");
				waitForElement(14000);
			}
		
		}
		//WebElement Cst_name = driver.findElement(By.xpath("//span[@ng-bind=\"$parent.basicInfoFormTemplateData['CustomerName']\"]"));
		By Cst_name = By.xpath("//span[@ng-bind=\"$parent.basicInfoFormTemplateData['CustomerName']\"]");
		waitVisibility(Cst_name);
		String Customername=GetElementText(Cst_name);
		System.out.println(Customername);
		if(URL.contains("https://mme.benefitalign.com"))
		{
			By Unqualified = By.xpath("//span[@class='ng-binding'][normalize-space()='Unqualified']");
			Assert.assertTrue(driver.findElement(Unqualified).isDisplayed());
			ExtentSuccessMessage("Unqualified Assertion has been done");
		}
		else {
			By Qualified = By.xpath("//span[@class='ng-binding'][normalize-space()='Qualified']");
			Assert.assertTrue(driver.findElement(Qualified).isDisplayed());
			ExtentSuccessMessage("Qualified Assertion has been done");
			waitForElement(1000);
		}
		String Gender ="Male";
		By gender = By.xpath("//span[contains(text(),'"+Gender+"')]");
		Assert.assertTrue(driver.findElement(gender).isDisplayed());
		ExtentSuccessMessage("Gender Assertion has been done");
		waitForElement(1000);
		By ZipCode = By.xpath("//span[contains(text(),'"+zipcode+"')]");
		Assert.assertTrue(driver.findElement(ZipCode).isDisplayed());
		ExtentSuccessMessage("ZipCode Assertion has been done");
//		By DOB = By.xpath("//span[contains(text(),'"+dob+"')]");
//		Assert.assertTrue(driver.findElement(DOB).isDisplayed());
//		ExtentSuccessMessage("DOB Assertion has been done");
		waitForElement(1000);	
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Declinecall));
		MoveToElementClick(element);
		ExtentSuccessMessage("clicked on Declinecall Button");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(telephonysetup));
		MoveToElementClick(element);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(viewcalllogs));
		MoveToElementClick(element);
		waitForElement(6000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(search));
		if(ElementDisplayed(search)) {
			writeText(search, Number + Keys.ENTER);
			waitForElement(3000);
		}
		if(URL.contains("https://mme.benefitalign.com"))
		{
			String LeadValue = "No Answer";
			By lead = By.xpath("(//div[@title='"+LeadValue+"'][normalize-space()='"+LeadValue+"'][@class='ui-grid-cell-contents ng-binding ng-scope'])[1]");		
			js.executeScript("document.getElementsByClassName('ui-grid-viewport ng-isolate-scope')[1].scrollBy(2270, 0);");
			if(ElementDisplayed(lead)) {
				String calldisposition = GetElementText(lead);
				System.out.println(calldisposition);
				Assert.assertEquals(LeadValue, calldisposition);
				ExtentSuccessMessage("Call Disposition Validaition Successfull");
			}
		} else {
			String LeadValue = "Qualify";
			By lead = By.xpath("(//div[@title='"+LeadValue+"'][normalize-space()='"+LeadValue+"'][@class='ui-grid-cell-contents ng-binding ng-scope'])[1]");		
			js.executeScript("document.getElementsByClassName('ui-grid-viewport ng-isolate-scope')[1].scrollBy(2270, 0);");
			if(ElementDisplayed(lead)) {
				String calldisposition = GetElementText(lead);
				System.out.println(calldisposition);
				Assert.assertEquals(LeadValue, calldisposition);
				ExtentSuccessMessage("Call Disposition Validaition Successfull");
			}
		}
		
		element = wait.until(ExpectedConditions.presenceOfElementLocated(menusales));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Sales Menu");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(submenuleads));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Leads Menu");
		waitForElement(2000);
		By SearchFiled = By.xpath(
				"//input[@class='ng-pristine ng-untouched md-input ng-empty ng-valid-minlength ng-valid-maxlength ng-valid ng-valid-required']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchFiled));
		MoveToElementClick(element);
		writeText(SearchFiled, Customername + Keys.ENTER);
		ExtentSuccessMessage("Lead Name has been Searched");
		waitForElement(3000);
		if(URL.contains("https://mme.benefitalign.com"))
		{
			String LeadValue = "No Answer";
			By lead = By.xpath("//div[@title='"+LeadValue+"']");		
			js.executeScript("document.getElementsByClassName('ui-grid-viewport ng-isolate-scope')[1].scrollBy(2270, 0);");
			waitVisibility(lead);
			if(ElementDisplayed(lead)) {
				String calldisposition = GetElementText(lead);
				System.out.println(calldisposition);
				Assert.assertEquals(LeadValue, calldisposition);
				ExtentSuccessMessage("Call Disposition Validaition Successfull");
			}
		} else {
			String LeadValue = "Qualify";
			By lead = By.xpath("//div[@title='"+LeadValue+"']");		
			js.executeScript("document.getElementsByClassName('ui-grid-viewport ng-isolate-scope')[1].scrollBy(2270, 0);");
			waitVisibility(lead);
			if(ElementDisplayed(lead)) {
				String calldisposition = GetElementText(lead);
				System.out.println(calldisposition);
				Assert.assertEquals(LeadValue, calldisposition);
				ExtentSuccessMessage("Call Disposition Validaition Successfull");
			}
		}

		if(URL.contains("https://mme.benefitalign.com"))
		{
			By Unqualified = By.xpath("//div[@class='Unqualified']");
			Assert.assertTrue(driver.findElement(Unqualified).isDisplayed());
			ExtentSuccessMessage("Unqualified Assertion has been done");
		}
		else {
			By Qualified = By.xpath("//div[@class='Qualified']");
			Assert.assertTrue(driver.findElement(Qualified).isDisplayed());
			ExtentSuccessMessage("Qualified Assertion has been done");
			waitForElement(1000);
		}
		
		driver.switchTo().window(tabs.get(0));
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(textarea));
		String txt = "Hello This is Automation Text";
		writeText(textarea, txt);		
		ExtentSuccessMessage("Textarea has been entered");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(submit));
		Assert.assertTrue(driver.findElement(submit).isDisplayed());
		ExtentSuccessMessage("Submit Assertion has been done");
		MoveToElementClick(element);	
		ExtentSuccessMessage("clicked on Submit Button");
		waitForElement(10000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		waitForElement(9000);
		//By Notes = By.xpath("//span[contains(text(),'"+txt+"')] | (//*[normalize-space()='"+txt+"'])[2] | (//u[@class='item_to_highlight ng-binding'])[1]");
		By Notes = By.xpath("(//*[@class='btn btn-default pull-right edit-note-icon icons red-color']//parent::h3//u[@class='item_to_highlight ng-binding'])[1]");
		if(ElementDisplayed(Notes)){
			Assert.assertTrue(driver.findElement(Notes).isDisplayed());
			ExtentSuccessMessage("Notes Assertion has been done");
		}
		waitForElement(6000);
		By comment = By.xpath("//h4[@role='button']");
		if(ElementDisplayed(comment)){
			waitVisibility(comment);
			String Comments=GetElementText(comment);
			Assert.assertEquals(Comments, txt);
		}
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(call));
		MoveToElementClick(element);	
		waitForElement(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
		MoveToElementClick(element);//clicking on PhoneNumber Field
		writeText(EnterPhoneNumberField, Number);
		ExtentSuccessMessage("Phone Number has been entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);//clicking on Call Button
		ExtentSuccessMessage("Call icon has been clicked");
		waitForElement(2000);
		//ClickOnMuteCallIconIsvisible();
		waitForElement(1000);	
		driver.switchTo().window(tabs.get(1));
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);	
		ExtentSuccessMessage("Clicked on Accept Button");
		waitForElement(1000);
		//ClickOnMuteCallIconIsvisible();
		waitForElement(4000);
		if(ElementDisplayed(dispostionPopup)) {
			ExtentSuccessMessage("Disposition Popup Displayed");
		} else {
			waitForElement(1000);	
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Declinecall));
			MoveToElementClick(element);
			ExtentSuccessMessage("clicked on Declinecall Button");
			TelephonyPage.ClickOnMinimizeCallwindow();
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin));
			MoveToElementClick(element);
			waitForElement(1000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(telephonysetup));
			MoveToElementClick(element);
			waitForElement(1000);
			TelephonyPage.ClickOnMinimizeCallwindow();
			waitVisibility(ViewAndManageNumbers);
			TelephonyPage.ClickonViewAndManageNumbers();
			waitVisibility(SearchBar);
			TelephonyPage.EnterSearchBar(Number);
			waitVisibility(notes);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(notes));
			MoveToElementClick(element);
			ExtentSuccessMessage("clicked on Notes Icon");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(InboundLeadCallcheckbox));
			String InboundLeadCallcheckboxstatus = element.getAttribute("aria-checked");
			if(InboundLeadCallcheckboxstatus.contains("true")) {
				ExtentSuccessMessage("Inbound Lead Call Checkbox it is already clicked");
				
			}else {
				MoveToElementClick(element);
				ExtentSuccessMessage("User Clicked on Inbound Lead Call Checkbox");
			}
			element = wait.until(ExpectedConditions.presenceOfElementLocated(OutboundLeadCallcheckbox));
			String OutoundLeadCallcheckboxstatus = element.getAttribute("aria-checked");
			if(OutoundLeadCallcheckboxstatus.contains("true")) {
				ExtentSuccessMessage("Outbound Lead Call Checkbox it is already clicked");
			}else {
				MoveToElementClick(element);
				ExtentSuccessMessage("User Clicked on Outbound Lead Call Checkbox");
			}
//			element = wait.until(ExpectedConditions.presenceOfElementLocated(InboundCustomerCallcheckbox));
//			String InboundCustomerCallcheckboxstatus = element.getAttribute("aria-checked");
//			if(InboundCustomerCallcheckboxstatus.contains("true")) {
//				ExtentSuccessMessage("Inbound Customer Call Checkbox it is already clicked");
//			}else {
//				MoveToElementClick(element);
//				ExtentSuccessMessage("User Clicked on Inbound Customer Call Checkbox");
//			}
//			element = wait.until(ExpectedConditions.presenceOfElementLocated(OutboundCustomerCallcheckbox));
//			String OutoundCustomerCallcheckboxstatus = element.getAttribute("aria-checked");
//			if(OutoundCustomerCallcheckboxstatus.contains("true")) {
//				ExtentSuccessMessage("Outbound Customer Call Checkbox it is already clicked");
//			}else {
//				MoveToElementClick(element);
//				ExtentSuccessMessage("User Clicked on Outbound Customer Call Checkbox");
//			}
			
			element = wait.until(ExpectedConditions.presenceOfElementLocated(ok_btn));
			MoveToElementClick(element);
			waitVisibility(Success_Message);
			String msg = GetElementText(Success_Message);
			Assert.assertEquals(msg, "Call disposition set successfully.");
			
			waitForElement(1000);
			driver.switchTo().window(tabs.get(0));
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Cancel));
			MoveToElementClick(element);	
			ExtentSuccessMessage("Clicked on Cancel Button");
			waitVisibility(EnterPhoneNumberField);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
			MoveToElementClick(element);//clicking on PhoneNumber Field
			writeText(EnterPhoneNumberField, Number);
			ExtentSuccessMessage("Phone Number has been entered");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);//clicking on Call Button
			ExtentSuccessMessage("clicked on Call Button");
			waitForElement(1000);
			if(ElementDisplayed(ok)) {
				element = wait.until(ExpectedConditions.presenceOfElementLocated(ok));
				MoveToElementClick(element);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
				MoveToElementClick(element);
			}
			//ClickOnMuteCallIconIsvisible();
			driver.switchTo().window(tabs.get(1));
			waitVisibility(CallAcceptButton);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
			MoveToElementClick(element);	
			ExtentSuccessMessage("clicked on Accept Button");
			waitForElement(2000);
			//ClickOnMuteCallIconIsvisible();
			//waitForElement(3000);	
			if(ElementDisplayed(dispostionPopup)) {
				ExtentSuccessMessage("Disposition Popup Displayed");
			}
		}

		waitForElement(1000);
		if(URL.contains("https://mme.benefitalign.com"))
		{
			selectLead();
		}
		waitForElement(2000);
		if(ElementDisplayed(textcomments)){
			waitVisibility(textcomments);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(textcomments));
			MoveToElementClick(element);
			String txt_Comment = "Hello, This is Automation Text";
			writeText(textcomments,txt_Comment);
			ExtentSuccessMessage("Comments has been entered");
		}
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Submit));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Submit Button");
		waitForElement(8000);	
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Declinecall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Declinecall Button");

		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(Activitylog));
		//		MoveToElementClick(element);
		//		waitForElement(15000);
		//		String LeadValue = GetElementText(Leadstatus);
		//		System.out.println(LeadValue);
		//		element = wait.until(ExpectedConditions.presenceOfElementLocated(Basicinfo));
		//		MoveToElementClick(element);
		//		waitForElement(8000);

		edit_lead_details();	
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Admin");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(telephonysetup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Telephonysetup");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(viewcalllogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on ViewCalllogs");
		waitForElement(6000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(search));
		if(ElementDisplayed(search)) {
			writeText(search, Customername + Keys.ENTER);
			waitForElement(3000);
			ExtentSuccessMessage("Clicked on Search");
		}
		
		if(URL.contains("https://mme.benefitalign.com"))
		{
			String LeadValue = "No Answer";
			By lead = By.xpath("(//div[@title='"+LeadValue+"'][normalize-space()='"+LeadValue+"'][@class='ui-grid-cell-contents ng-binding ng-scope'])[1]");		
			js.executeScript("document.getElementsByClassName('ui-grid-viewport ng-isolate-scope')[1].scrollBy(2270, 0);");
			if(ElementDisplayed(lead)) {
				String calldisposition = GetElementText(lead);
				System.out.println(calldisposition);
				Assert.assertEquals(LeadValue, calldisposition);
				ExtentSuccessMessage("Call Disposition Validaition Successfull");
			}
		} else {
			String LeadValue = "Qualify";
			By lead = By.xpath("(//div[@title='"+LeadValue+"'][normalize-space()='"+LeadValue+"'][@class='ui-grid-cell-contents ng-binding ng-scope'])[1]");		
			js.executeScript("document.getElementsByClassName('ui-grid-viewport ng-isolate-scope')[1].scrollBy(2270, 0);");
			if(ElementDisplayed(lead)) {
				String calldisposition = GetElementText(lead);
				System.out.println(calldisposition);
				Assert.assertEquals(LeadValue, calldisposition);
				ExtentSuccessMessage("Call Disposition Validaition Successfull");
			}
		}
		waitForElement(3000);	
		By scroll_ID = By.xpath("(//span[@class='ui-grid-header-cell-label ng-binding'])[4]");
		ScrollUntilElementVisible(scroll_ID);
		waitForElement(1000);
		By scrollID = By.xpath("(//span[@class='ui-grid-header-cell-label ng-binding'])[1]");
		ScrollUntilElementVisible(scrollID);
		waitForElement(1000);
		ScrollUntilElementVisible(ID);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on ID");
		waitForElement(6000);
		By FromNumber = By.xpath("//p[@class='formContent ng-binding ng-scope'][normalize-space()='"+Number+"']");
		if(ElementDisplayed(FromNumber)) {
			Assert.assertTrue(driver.findElement(FromNumber).isDisplayed());
			ExtentSuccessMessage("Number Assertion has been done");
			By Incoming_Call = By.xpath("//p[normalize-space()='Incoming Call']");
			Assert.assertTrue(driver.findElement(Incoming_Call).isDisplayed());
			ExtentSuccessMessage("Incoming_Call Assertion has been done");
			Assert.assertTrue(driver.findElement(SSID).isDisplayed());
			ExtentSuccessMessage("SSID Assertion has been done");
			Assert.assertTrue(driver.findElement(Caller).isDisplayed());
			ExtentSuccessMessage("Caller Assertion has been done");
			Assert.assertTrue(driver.findElement(Callee).isDisplayed());
			ExtentSuccessMessage("Callee Assertion has been done");
			if(URL.contains("https://mme.benefitalign.com"))
			{
				ExtentSuccessMessage("Play Button Not there");
			} else {
				By Play = By.xpath("//p[normalize-space()='Incoming Call']");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Play));
				MoveToElementClick(element);
				ExtentSuccessMessage("Clicked on Play Button");
			}
		} else {
			RefreshPage();
			waitForElement(8000);
			waitVisibility(CTIMinimizeIcon);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
			MoveToElementClick(element);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(search));
			if(ElementDisplayed(search)) {
				writeText(search, Customername + Keys.ENTER);
				waitForElement(3000);
			}
			waitForElement(3000);
			ClickonFirstRowId();
			ExtentSuccessMessage("Clicked on ID");
			waitForElement(6000);
			if(ElementDisplayed(FromNumber)) {
				Assert.assertTrue(driver.findElement(FromNumber).isDisplayed());
				ExtentSuccessMessage("Number Assertion has been done");
				By Incoming_Call = By.xpath("//p[normalize-space()='Incoming Call']");
				Assert.assertTrue(driver.findElement(Incoming_Call).isDisplayed());
				ExtentSuccessMessage("Incoming_Call Assertion has been done");
				Assert.assertTrue(driver.findElement(SSID).isDisplayed());
				ExtentSuccessMessage("SSID Assertion has been done");
				Assert.assertTrue(driver.findElement(Caller).isDisplayed());
				ExtentSuccessMessage("Caller Assertion has been done");
				Assert.assertTrue(driver.findElement(Callee).isDisplayed());
				ExtentSuccessMessage("Callee Assertion has been done");
				if(URL.contains("https://mme.benefitalign.com"))
				{
					ExtentSuccessMessage("Play Button Not there");
				} else {
					By Play = By.xpath("//p[normalize-space()='Incoming Call']");
					element = wait.until(ExpectedConditions.presenceOfElementLocated(Play));
					MoveToElementClick(element);
					ExtentSuccessMessage("Clicked on Play Button");
				}
			}
			else {
				RefreshPage();
				waitForElement(8000);
				waitVisibility(CTIMinimizeIcon);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
				MoveToElementClick(element);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(search));
				if(ElementDisplayed(search)) {
					writeText(search, Customername + Keys.ENTER);
					waitForElement(3000);
				}
				waitForElement(5000);
				ClickonFirstRowId();
				ExtentSuccessMessage("Clicked on ID");
				waitForElement(6000);
				waitVisibility(FromNumber);
				if(ElementDisplayed(FromNumber)) {
					Assert.assertTrue(driver.findElement(FromNumber).isDisplayed());
					ExtentSuccessMessage("Number Assertion has been done");
					By Incoming_Call = By.xpath("//p[normalize-space()='Incoming Call']");
					Assert.assertTrue(driver.findElement(Incoming_Call).isDisplayed());
					ExtentSuccessMessage("Incoming_Call Assertion has been done");
					Assert.assertTrue(driver.findElement(SSID).isDisplayed());
					ExtentSuccessMessage("SSID Assertion has been done");
					Assert.assertTrue(driver.findElement(Caller).isDisplayed());
					ExtentSuccessMessage("Caller Assertion has been done");
					Assert.assertTrue(driver.findElement(Callee).isDisplayed());
					ExtentSuccessMessage("Callee Assertion has been done");
					if(URL.contains("https://mme.benefitalign.com"))
					{
						ExtentSuccessMessage("Play Button Not there");
					} else {
						By Play = By.xpath("//p[normalize-space()='Incoming Call']");
						element = wait.until(ExpectedConditions.presenceOfElementLocated(Play));
						MoveToElementClick(element);
						ExtentSuccessMessage("Clicked on Play Button");
					}
				}
			}
		}
		
		driver.switchTo().window(tabs.get(0));	
		waitForElement(1000);		
		ExtentSuccessMessage("*************Cancel Disposition*************");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Cancel));
		Assert.assertTrue(driver.findElement(Cancel).isDisplayed());
		ExtentSuccessMessage("Cancel Assertion has been done");
		MoveToElementClick(element);	
		ExtentSuccessMessage("Clicked on Cancel Button");
		driver.switchTo().window(tabs.get(1));	
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed");
		driver.switchTo().window(tabs.get(0));
		TelephonyPage.ClickOnMinimizeCallwindow();
	}
	
	public void validate_CallScriptassignment() throws InterruptedException 
	{
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		WebElement SenderNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String Sender_Number=SenderNumber.getText();
		driver.switchTo().window(tabs.get(1));
		waitForElement(2000);
		WebElement ReceiveNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String Number=ReceiveNumber.getText();
		waitForElement(1000);
		driver.switchTo().window(tabs.get(0));
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
		MoveToElementClick(element);//clicking on PhoneNumber Field
		writeText(EnterPhoneNumberField, Number);
		ExtentSuccessMessage("Phone Number has been entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);//clicking on Call Button
		ExtentSuccessMessage("clicked on Call Button");
		waitForElement(1000);
		By ok = By.xpath("//span[normalize-space()='Ok']");
		if(ElementDisplayed(ok)) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(ok));
			MoveToElementClick(element);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
		}
		waitForElement(2000);
		//ClickOnMuteCallIconIsvisible();
		driver.switchTo().window(tabs.get(1));
		waitForElement(2000);
		waitVisibility(CallAcceptButton);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);	
		ExtentSuccessMessage("clicked on Accept Button");
		waitForElement(5000);
		if(ElementDisplayed(CallScript_Popup)) {
			ExtentSuccessMessage("Call Script Popup Displayed");
			By ID = By.xpath("//iframe[@id='cti_callscript_preview']");
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ID));
            ExtentSuccessMessage("Switched into Frame");
            By Callmsg = By.cssSelector("body > p:nth-child(1)");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Callmsg));
			callscriptname= element.getText();
			System.out.println("Call Script Message  "+callscriptname);
			driver.switchTo().defaultContent();
		} else {
			waitForElement(1000);	
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Declinecall));
			MoveToElementClick(element);
			ExtentSuccessMessage("clicked on Declinecall Button");
			TelephonyPage.ClickOnMinimizeCallwindow();
            
            waitForElement(4000);
            By MarketingTile = By.xpath("//a[@class='glyphicon fa fa-fw fa-bar-chart-o']");
            element = wait.until(ExpectedConditions.presenceOfElementLocated(MarketingTile));
            MoveToElementClick(element);
            ExtentSuccessMessage("Marketing Tile has been clicked");

            Thread.sleep(3000);
            By CAllS = By.xpath("//a[@href='#/marketing/callScripts']");
            element = wait.until(ExpectedConditions.presenceOfElementLocated(CAllS));
            MoveToElementClick(element);
            ExtentSuccessMessage("Clicked on CallScript Button");

            Thread.sleep(5000);
            By New = By.xpath("//button[@class='btn btn-default pull-right btn-yellow']");
            element = wait.until(ExpectedConditions.presenceOfElementLocated(New));
            MoveToElementClick(element);
            ExtentSuccessMessage("Clicked on New CallScript button");

            Thread.sleep(4000);
            By CallScriptName = By.xpath("//input[@name='CallScriptName']");
            element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScriptName));
            MoveToElementClick(element);
            callscriptname = "AutoCallScript" + getRandomNumber();
            writeText(CallScriptName,callscriptname);
            ExtentSuccessMessage("Entered call script name");

            Thread.sleep(5000);
            WebElement Source = driver.findElement(By.xpath("//span[@class='action-txt ng-binding']"));
            WebElement target = driver.findElement(By.xpath("//div[@class='drawflow']"));

            Actions actions = new Actions(driver);

            // Perform the drag-and-drop action
            actions.dragAndDrop(Source, target).perform();

            Thread.sleep(5000);
            By Edit = By.xpath("//i[@class='fa fa-pencil-square-o']");
            element = wait.until(ExpectedConditions.presenceOfElementLocated(Edit));
            click(Edit);
            ExtentSuccessMessage("Clicked on edit button");

            Thread.sleep(2000);
            By InputName = By.xpath("//input[@name ='elementName']");
            element = wait.until(ExpectedConditions.presenceOfElementLocated(InputName));
            MoveToElementClick(element);
            String input = "AutoElement" + getRandomNumber();
            System.out.println(input);
            writeText(InputName,input);
            ExtentSuccessMessage("Entered element name");

            Thread.sleep(3000);
            By Frame = By.xpath("//iframe[@title='Rich Text Editor, rteEditor']");
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
            ExtentSuccessMessage("Frame has been changed");

            By TextArea = By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']");
            element = wait.until(ExpectedConditions.presenceOfElementLocated(TextArea));
            MoveToElementClick(element);
            String callinput = "Hello!! These Callscript is created via Automation";
            writeText(TextArea,callinput);
            ExtentSuccessMessage("Enterd the call Script details");

            driver.switchTo().defaultContent();

            By StartElement = By.xpath("//md-checkbox[@class='ng-pristine ng-untouched ng-valid ng-empty']");
            element = wait.until(ExpectedConditions.presenceOfElementLocated(StartElement));
            MoveToElementClick(element);
            ExtentSuccessMessage("Clicked on start element");

            By Update = By.xpath("//button[@class='green pull-right md-button md-ink-ripple']");
            element = wait.until(ExpectedConditions.presenceOfElementLocated(Update));
            MoveToElementClick(element);
            ExtentSuccessMessage("Clicked on Update Button");

            Thread.sleep(2000);
            By Submit = By.xpath("//button[@class='btn btn-default green pull-right ng-scope'][1]");
            element = wait.until(ExpectedConditions.presenceOfElementLocated(Submit));
            MoveToElementClick(element);
            ExtentSuccessMessage("Clicked on Submit Button");

            Thread.sleep(4000);
            By SearchText = By.xpath("//input[@aria-label='Search your text']");
            element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchText));
            MoveToElementClick(element);
            writeText(SearchText,callscriptname + Keys.ENTER);

            Thread.sleep(4000);
            By ActivateScript = By.xpath("//i[@title='Activate Script']");
            element = wait.until(ExpectedConditions.presenceOfElementLocated(ActivateScript));
            MoveToElementClick(element);
            ExtentSuccessMessage("Script has been activated");

            driver.navigate().back();
            Thread.sleep(3000);
            
			TelephonyPage.hoverOnAdminModule();
			waitForElement(1000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(telephonysetup));
			MoveToElementClick(element);
			waitForElement(1000);
			TelephonyPage.ClickOnMinimizeCallwindow();
			waitVisibility(ViewAndManageNumbers);
			TelephonyPage.ClickonViewAndManageNumbers();
			waitVisibility(SearchBar);
			TelephonyPage.EnterSearchBar(Number);
			waitForElement(8000);
			waitVisibility(Call_Script );
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Script));
			MoveToElementClick(element);
			ExtentSuccessMessage("clicked on Call_Script Icon");
			waitForElement(2000);
			
			Select_CallScript1();
			
            Thread.sleep(1000);
            By Preview = By.xpath("//button[@class='btn btn-default green text-center']");
            element = wait.until(ExpectedConditions.presenceOfElementLocated(Preview));
            MoveToElementClick(element);
            ExtentSuccessMessage("Clicked on Preview call script option");

            By Iframe = By.xpath("//iframe[@id='manage_acc_callscript_preview']");
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Iframe));
            ExtentSuccessMessage("Switched in Iframe");

            Thread.sleep(3000);
            By CallScriptData = By.cssSelector("body > p:nth-child(1)");
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
            
			waitForElement(6000);
			waitVisibility(Call_Script);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Script));
			MoveToElementClick(element);
			ExtentSuccessMessage("clicked on Call_Script Icon");
			waitForElement(2000);
			if(ElementDisplayed(Remove))
			{
				ExtentSuccessMessage("Successfully Visible Remove Icon");
			} else {
				Select_CallScript1();
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Update));
				MoveToElementClick(element);
				ExtentSuccessMessage("clicked on Save");
				waitForElement(6000);
				waitVisibility(Call_Script );
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Script));
				MoveToElementClick(element);
				ExtentSuccessMessage("clicked on Call_Script Icon");
				waitForElement(2000);
				if(ElementDisplayed(Remove))
				{
					ExtentSuccessMessage("Successfully Visible Remove Icon");
				} else {
					Select_CallScript1();
					element = wait.until(ExpectedConditions.presenceOfElementLocated(Update));
					MoveToElementClick(element);
					ExtentSuccessMessage("clicked on Save");
					waitForElement(6000);
					waitVisibility(Call_Script );
					element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Script));
					MoveToElementClick(element);
					ExtentSuccessMessage("clicked on Call_Script Icon");	
				}
			}	
            
            Thread.sleep(2000);
            By Home = By.name("menu_home");
            element = wait.until(ExpectedConditions.presenceOfElementLocated(Home));
            MoveToElementClick(element);
            ExtentSuccessMessage("Clicked on Home option");

            Thread.sleep(3000);
            driver.navigate().refresh();
            driver.switchTo().window(tabs.get(0));
            waitForElement(1000);
			if(ElementDisplayed(Cancel)) {
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Cancel));
				MoveToElementClick(element);	
				ExtentSuccessMessage("Clicked on Cancel Button");
			}
            waitVisibility(EnterPhoneNumberField);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
			MoveToElementClick(element);//clicking on PhoneNumber Field
			writeText(EnterPhoneNumberField, Number);
			ExtentSuccessMessage("Phone Number has been entered");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);//clicking on Call Button
			ExtentSuccessMessage("clicked on Call Button");
			waitForElement(1000);
			if(ElementDisplayed(ok)) {
				element = wait.until(ExpectedConditions.presenceOfElementLocated(ok));
				MoveToElementClick(element);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
				MoveToElementClick(element);
			}
			//ClickOnMuteCallIconIsvisible();
			driver.switchTo().window(tabs.get(1));
			waitForElement(2000);
			waitVisibility(CallAcceptButton);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
			MoveToElementClick(element);	
			ExtentSuccessMessage("clicked on Accept Button");
			waitForElement(12000);
			if(ElementDisplayed(CallScriptPopup)) {
				ExtentSuccessMessage("Call Script Popup Displayed");
				By callID = By.xpath("//iframe[@id='cti_callscript_preview']");
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(callID));
				ExtentSuccessMessage("Switched into Frame");
				Thread.sleep(2000);
				By CallScriptData1 = By.xpath("//p[contains(.,'" + text + "')]");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScriptData1));
				String text1 = element.getText();
				System.out.println(text1);
				driver.switchTo().defaultContent();

			}
		}
        
		Thread.sleep(4000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Declinecall));
		MoveToElementClick(element);
		ExtentSuccessMessage("clicked on Declinecall Button");
		TelephonyPage.ClickOnMinimizeCallwindow();
        
        waitForElement(4000);
        By MarketingTile = By.xpath("//a[@class='glyphicon fa fa-fw fa-bar-chart-o']");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(MarketingTile));
        MoveToElementClick(element);
        ExtentSuccessMessage("Marketing Tile has been clicked");

        Thread.sleep(3000);
        By CAllS = By.xpath("//a[@href='#/marketing/callScripts']");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(CAllS));
        MoveToElementClick(element);
        ExtentSuccessMessage("Clicked on CallScript Button");

        Thread.sleep(5000);
        By New = By.xpath("//button[@class='btn btn-default pull-right btn-yellow']");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(New));
        MoveToElementClick(element);
        ExtentSuccessMessage("Clicked on New CallScript button");

        
        Thread.sleep(4000);
        By CallScriptName = By.xpath("//input[@name='CallScriptName']");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScriptName));
        MoveToElementClick(element);
        callscriptname1 = "AutoUpdatedCallScript" + getRandomNumber();
        writeText(CallScriptName,callscriptname1);
        ExtentSuccessMessage("Entered call script name");


        Thread.sleep(5000);
        WebElement Source1 = driver.findElement(By.xpath("//span[@class='action-txt ng-binding']"));
        WebElement target1 = driver.findElement(By.xpath("//div[@class='drawflow']"));

        Actions actions1 = new Actions(driver);

        // Perform the drag-and-drop action
        actions1.dragAndDrop(Source1, target1).perform();

        Thread.sleep(5000);
        By Edit = By.xpath("//i[@class='fa fa-pencil-square-o']");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(Edit));
        click(Edit);
        ExtentSuccessMessage("Clicked on edit button");

        Thread.sleep(2000);
        By InputName = By.xpath("//input[@name ='elementName']");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(InputName));
        MoveToElementClick(element);
        String input1 = "AutoElementUpdated" + getRandomNumber();
        System.out.println(input1);
        writeText(InputName,input1);
        ExtentSuccessMessage("Entered element name");
        
        Thread.sleep(3000);
        By Frame = By.xpath("//iframe[@title='Rich Text Editor, rteEditor']");
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frame));
        ExtentSuccessMessage("Frame has been changed");

        By TextArea = By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(TextArea));
        MoveToElementClick(element);
        String callinput1 = "Hello!! These Updated Callscript is created via Automation";
        writeText(TextArea,callinput1);
        ExtentSuccessMessage("Enterd the call Script details");
        
        driver.switchTo().defaultContent();
        
        By StartElement = By.xpath("//md-checkbox[@class='ng-pristine ng-untouched ng-valid ng-empty']");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(StartElement));
        MoveToElementClick(element);
        ExtentSuccessMessage("Clicked on start element");

        By Update = By.xpath("//button[@class='green pull-right md-button md-ink-ripple']");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(Update));
        MoveToElementClick(element);
        ExtentSuccessMessage("Clicked on Update Button");

        Thread.sleep(2000);
        By Submit = By.xpath("//button[@class='btn btn-default green pull-right ng-scope'][1]");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(Submit));
        MoveToElementClick(element);
        ExtentSuccessMessage("Clicked on Submit Button");

        Thread.sleep(4000);
        By SearchText = By.xpath("//input[@aria-label='Search your text']");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchText));
        MoveToElementClick(element);
        writeText(SearchText,callscriptname1 + Keys.ENTER);
  
        Thread.sleep(4000);
        By ActivateScript = By.xpath("//i[@title='Activate Script']");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(ActivateScript));
        MoveToElementClick(element);
        ExtentSuccessMessage("Script has been activated");

        driver.navigate().back();
        Thread.sleep(3000);
        
		TelephonyPage.hoverOnAdminModule();
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(telephonysetup));
		MoveToElementClick(element);
		waitForElement(1000);
		TelephonyPage.ClickOnMinimizeCallwindow();
		waitVisibility(ViewAndManageNumbers);
		TelephonyPage.ClickonViewAndManageNumbers();
		waitVisibility(SearchBar);
		TelephonyPage.EnterSearchBar(Number);
		waitForElement(8000);
		waitVisibility(Call_Script );
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Script));
		MoveToElementClick(element);
		ExtentSuccessMessage("clicked on Call_Script Icon");
		waitForElement(3000);
		Select_CallScript2();
        element = wait.until(ExpectedConditions.presenceOfElementLocated(Preview));
        MoveToElementClick(element);
        ExtentSuccessMessage("Clicked on Preview call script option");

        By Iframe = By.xpath("//iframe[@id='manage_acc_callscript_preview']");
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Iframe));
        ExtentSuccessMessage("Switched in Iframe");

        Thread.sleep(3000);
        By CallScriptData = By.cssSelector("body > p:nth-child(1)");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScriptData));
        String text3 = element.getText();
        System.out.println(text3);

        driver.switchTo().defaultContent();

        Closepreview();

        Thread.sleep(3000);
        By Update1 = By.xpath("//button[@title='Save']");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(Update1));
        MoveToElementClick(element);
        ExtentSuccessMessage("Clicked on Update call script option");

		waitForElement(6000);
		waitVisibility(Call_Script );
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Script));
		MoveToElementClick(element);
		ExtentSuccessMessage("clicked on Call_Script Icon");
		waitForElement(2000);
		if(ElementDisplayed(Remove))
		{
			ExtentSuccessMessage("Successfully Visible Remove Icon");
		} else {
			Select_CallScript2();
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Update));
			MoveToElementClick(element);
			ExtentSuccessMessage("clicked on Save");
			waitForElement(6000);
			waitVisibility(Call_Script );
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Script));
			MoveToElementClick(element);
			ExtentSuccessMessage("clicked on Call_Script Icon");
			waitForElement(2000);
			if(ElementDisplayed(Remove))
			{
				ExtentSuccessMessage("Successfully Visible Remove Icon");
			} else {
				Select_CallScript2();
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Update));
				MoveToElementClick(element);
				ExtentSuccessMessage("clicked on Save");
				waitForElement(6000);
				waitVisibility(Call_Script );
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Script));
				MoveToElementClick(element);
				ExtentSuccessMessage("clicked on Call_Script Icon");	
			}
		}  
        
        Thread.sleep(2000);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(Home));
        MoveToElementClick(element);
        ExtentSuccessMessage("Clicked on Home option");
        
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.switchTo().window(tabs.get(0));
        waitForElement(1000);
		if(ElementDisplayed(Cancel)) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Cancel));
			MoveToElementClick(element);	
			ExtentSuccessMessage("Clicked on Cancel Button");
		}
		waitVisibility(EnterPhoneNumberField);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
		MoveToElementClick(element);//clicking on PhoneNumber Field
		writeText(EnterPhoneNumberField, Number);
		ExtentSuccessMessage("Phone Number has been entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);//clicking on Call Button
		ExtentSuccessMessage("clicked on Call Button");
		waitForElement(1000);
		if(ElementDisplayed(ok)) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(ok));
			MoveToElementClick(element);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
		}
		//ClickOnMuteCallIconIsvisible();
		driver.switchTo().window(tabs.get(1));
		waitForElement(2000);
		waitVisibility(CallAcceptButton);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);	
		ExtentSuccessMessage("clicked on Accept Button");
		waitForElement(12000);
		if(ElementDisplayed(CallScriptPopup)) {
			ExtentSuccessMessage("Call Script Popup Displayed");
			By callID = By.xpath("//iframe[@id='cti_callscript_preview']");
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(callID));
            ExtentSuccessMessage("Switched into Frame");
            Thread.sleep(2000);
            By CallScriptData1 = By.xpath("//p[contains(.,'" + text3 + "')]");
            element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScriptData1));
            String text1 = element.getText();
            System.out.println(text1);
			driver.switchTo().defaultContent();
		}
			waitForElement(1000);	
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Declinecall));
			MoveToElementClick(element);
			ExtentSuccessMessage("clicked on Declinecall Button");
			TelephonyPage.ClickOnMinimizeCallwindow();
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin));
			MoveToElementClick(element);
			waitForElement(1000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(telephonysetup));
			MoveToElementClick(element);
			waitForElement(1000);
			TelephonyPage.ClickOnMinimizeCallwindow();
			waitVisibility(ViewAndManageNumbers);
			TelephonyPage.ClickonViewAndManageNumbers();
			waitVisibility(SearchBar);
			TelephonyPage.EnterSearchBar(Number);
			waitForElement(5000);
			waitVisibility(Call_Script );
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Script));
			MoveToElementClick(element);
			ExtentSuccessMessage("clicked on Call_Script Icon");
			waitForElement(3000);
            element = wait.until(ExpectedConditions.presenceOfElementLocated(Remove));
            MoveToElementClick(element);
            ExtentSuccessMessage("Clicked on Remove option");
            waitForElement(1000);
			waitVisibility(Call_Script );
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Script));
			MoveToElementClick(element);
			ExtentSuccessMessage("clicked on Call_Script Icon");
			waitForElement(3000);
			if(ElementDisplayed(Remove))
			{
	            element = wait.until(ExpectedConditions.presenceOfElementLocated(Remove));
	            MoveToElementClick(element);
	            ExtentSuccessMessage("Clicked on Remove option");
	            waitForElement(1000);
				waitVisibility(Call_Script );
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Script));
				MoveToElementClick(element);
				ExtentSuccessMessage("clicked on Call_Script Icon");
				waitForElement(2000);
				if(ElementDisplayed(Remove))
				{
		            element = wait.until(ExpectedConditions.presenceOfElementLocated(Remove));
		            MoveToElementClick(element);
		            ExtentSuccessMessage("Clicked on Remove option");
		            waitForElement(1000);
					waitVisibility(Call_Script );
					element = wait.until(ExpectedConditions.presenceOfElementLocated(Call_Script));
					MoveToElementClick(element);
					ExtentSuccessMessage("clicked on Call_Script Icon");
				}
			}
			
            waitForElement(5000);
            element = wait.until(ExpectedConditions.presenceOfElementLocated(Home));
            MoveToElementClick(element);
            ExtentSuccessMessage("Clicked on Home option");
            Thread.sleep(3000);
            driver.navigate().refresh();
            driver.switchTo().window(tabs.get(0));
            waitForElement(1000);
    		if(ElementDisplayed(Cancel)) {
    			element = wait.until(ExpectedConditions.presenceOfElementLocated(Cancel));
    			MoveToElementClick(element);	
    			ExtentSuccessMessage("Clicked on Cancel Button");
    		}
			waitVisibility(EnterPhoneNumberField);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
			MoveToElementClick(element);//clicking on PhoneNumber Field
			writeText(EnterPhoneNumberField, Number);
			ExtentSuccessMessage("Phone Number has been entered");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);//clicking on Call Button
			ExtentSuccessMessage("clicked on Call Button");
			waitForElement(1000);
			if(ElementDisplayed(ok)) {
				element = wait.until(ExpectedConditions.presenceOfElementLocated(ok));
				MoveToElementClick(element);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
				MoveToElementClick(element);
			}
			//ClickOnMuteCallIconIsvisible();
			driver.switchTo().window(tabs.get(1));
			waitForElement(2000);
			waitVisibility(CallAcceptButton);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
			MoveToElementClick(element);	
			ExtentSuccessMessage("clicked on Accept Button");
			waitForElement(10000);
			if(ElementDisplayed(CallScriptPopup)) {
				ExtentSuccessMessage("Call Script Popup Displayed");
			} else {
				ExtentSuccessMessage("Call Script Popup Not Displayed");
			}
			waitForElement(1000);	
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Declinecall));
			MoveToElementClick(element);
			ExtentSuccessMessage("clicked on Declinecall Button");
			TelephonyPage.ClickOnMinimizeCallwindow();

			waitForElement(3000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(MarketingTile));
			MoveToElementClick(element);
			ExtentSuccessMessage("Marketing Tile has been clicked");

			Thread.sleep(3000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CAllS));
			MoveToElementClick(element);
			ExtentSuccessMessage("Clicked on CallScript Button");

			Thread.sleep(3000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchText));
			MoveToElementClick(element);
			writeText(SearchText,callscriptname + Keys.ENTER);

			Thread.sleep(3000);
			By Deactivate = By.xpath("//i[@title='Deactivate Script']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Deactivate));
			MoveToElementClick(element);
			ExtentSuccessMessage("CallScript has been diactivated");

			Thread.sleep(3000);
			try {

				WebElement CallScriptTitle = driver.findElement(By.xpath("//h2[contains(.,'Confirm')]"));
				if (CallScriptTitle.isDisplayed()) {
					Thread.sleep(2000);
					By Yes = By.xpath("//button[@class='positive md-button md-ink-ripple']");
					element = wait.until(ExpectedConditions.presenceOfElementLocated(Yes));
					MoveToElementClick(element);
					ExtentSuccessMessage("Clicked on OK Button");

				} else {
					System.out.println("Popup is not displayed.");
				}

			} catch (NoSuchElementException e) {
				System.out.println("Popup is not present in the DOM.");
			} finally {
				ExtentSuccessMessage("Call Popup is visible");

			}
			Thread.sleep(3000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchText));
			MoveToElementClick(element);
			element.clear();
			writeText(SearchText,callscriptname1 + Keys.ENTER);

			Thread.sleep(3000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Deactivate));
			MoveToElementClick(element);
			ExtentSuccessMessage("CallScript has been diactivated");

			Thread.sleep(3000);
			try {

				WebElement CallScriptTitle = driver.findElement(By.xpath("//h2[contains(.,'Confirm')]"));
				if (CallScriptTitle.isDisplayed()) {

					Thread.sleep(2000);
					By Yes = By.xpath("//button[@class='positive md-button md-ink-ripple']");
					element = wait.until(ExpectedConditions.presenceOfElementLocated(Yes));
					MoveToElementClick(element);
					ExtentSuccessMessage("Clicked on OK Button");

				} else {
					System.out.println("Popup is not displayed.");
				}

			} catch (NoSuchElementException e) {
				System.out.println("Popup is not present in the DOM.");
			} finally {
				ExtentSuccessMessage("Call Popup is visible");

			}

			waitForElement(1000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
			MoveToElementClick(element);
			ExtentSuccessMessage("User has been selected");
			waitForElement(1000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
			MoveToElementClick(element);
			ExtentSuccessMessage("Logout has been performed");
			driver.switchTo().window(tabs.get(0));
			TelephonyPage.ClickOnMinimizeCallwindow();
	}
	
	
	public void Select_CallScript1() throws InterruptedException 
	{	
		waitForElement(1000);
		waitVisibility(Select_Call_Script);
		WebElement dropdown = driver.findElement(Select_Call_Script);
		Select Dropdown = new Select(dropdown);
		waitForElement(1000);
		Dropdown.selectByVisibleText(""+callscriptname+"");
		ExtentSuccessMessage("Successfully selected CallScript");
		waitForElement(2000);		
	}
	
	public static void SwitchToFrameByID(By frameID) {
        //WebDriverWait wait = new WebDriverWait(driver, 30);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameID));
 }

	
	public void Select_CallScript2() throws InterruptedException 
	{	
		waitForElement(1000);
		WebElement dropdown = driver.findElement(Select_Call_Script);
		Select Dropdown = new Select(dropdown);
		waitForElement(1000);
		Dropdown.selectByVisibleText(""+callscriptname1+"");
		ExtentSuccessMessage("Successfully selected CallScript");
		waitForElement(2000);		
	}
	
	public void Showpreview() throws InterruptedException
	{
		waitVisibility(Preview);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Preview));
		MoveToElementClick(element);
		ExtentSuccessMessage("clicked on Show Preview");
		waitForElement(1000);
		waitVisibility(CallScript_Preview);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallScript_Preview));
		ExtentSuccessMessage("Successfully Displayed CallScript_Preview");
		waitForElement(1000);
		
	}
	public void Closepreview() throws InterruptedException
	{
		waitVisibility(Close_Preview);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Close_Preview));
		MoveToElementClick(element);
		waitForElement(1000);
		ExtentSuccessMessage("clicked on Close_Preview");
	}
		
	public static void ScrollUntilElementVisible(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        ExtentSuccessMessage("Successfully scroll down to the element :" + element);
 }

	public void validate_Non_Mandatory_Fields() throws InterruptedException 
	{
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		WebElement SenderNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String Sender_Number=SenderNumber.getText();
		driver.switchTo().window(tabs.get(1));
		WebElement ReceiveNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String Number=ReceiveNumber.getText();
		waitForElement(1000);
		driver.switchTo().window(tabs.get(0));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
		MoveToElementClick(element);//clicking on PhoneNumber Field
		writeText(EnterPhoneNumberField, Number);
		ExtentSuccessMessage("Phone Number has been entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);//clicking on Call Button
		ExtentSuccessMessage("clicked on Call Button");
		waitForElement(1000);
		By ok = By.xpath("//span[normalize-space()='Ok']");
		if(ElementDisplayed(ok)) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(ok));
			MoveToElementClick(element);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
		}
		waitForElement(2000);
		//ClickOnMuteCallIconIsvisible();
		driver.switchTo().window(tabs.get(1));
		waitForElement(2000);
		waitVisibility(CallAcceptButton);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);	
		ExtentSuccessMessage("clicked on Accept Button");
		waitForElement(2000);
		//ClickOnMuteCallIconIsvisible();
		waitForElement(3000);
		if(ElementDisplayed(dispostionPopup)) {
			ExtentSuccessMessage("Disposition Displayed");
		} else {
			waitVisibility(dispostionPopup);
			ExtentSuccessMessage("Disposition Displayed");
		}
		waitForElement(2000);
		waitVisibility(Firstname);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Firstname));
		String FirstName = "CEuser";
		writeText(Firstname, FirstName + Keys.ENTER);
		ExtentSuccessMessage("Firstname has been entered");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Lastname));
		String LastName = randomName();
		writeText(Lastname, LastName + Keys.ENTER);
		ExtentSuccessMessage("Lastname has been entered");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Email));
		String Fullname = FirstName+LastName;
		String email = Fullname+"@yopmail.com";
		writeText(Email, email + Keys.ENTER);
		ExtentSuccessMessage("Email has been entered");
//		waitForElement(1000);	
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(DOB));
//		String dob = "07/22/2024";
//		writeText(DOB, dob + Keys.ENTER);
//		ExtentSuccessMessage("DOB has been entered");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ZipCode));
		String zipcode = "32323";
		writeText(ZipCode, zipcode + Keys.ENTER);
		ExtentSuccessMessage("ZipCode has been entered");
		waitForElement(1000);	
		SelectGender();
		waitForElement(1000);
		selectLeadtype();
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Submit));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Submit Button");
		waitForElement(14000);
		By NotInterest = By.xpath("//span[@class='ng-binding'][normalize-space()='Rejected']");
		waitVisibility(NotInterest);
		Assert.assertTrue(driver.findElement(NotInterest).isDisplayed());
		ExtentSuccessMessage("NotInterest Assertion has been done");
		waitForElement(1000);	
		element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@ng-bind=\"$parent.basicInfoFormTemplateData['CustomerName']\"]")));	
		String name = element.getText();
		String fullname =FirstName+" "+LastName;
		Assert.assertEquals(fullname, name);
		ExtentSuccessMessage("Customername Assertion has been done");		
		By Email = By.xpath("//a[normalize-space()='"+email+"']");
		Assert.assertTrue(driver.findElement(Email).isDisplayed());
		ExtentSuccessMessage("Email Assertion has been done");
		waitForElement(1000);
		String Gender ="Male";
		By gender = By.xpath("//span[contains(text(),'"+Gender+"')]");
		Assert.assertTrue(driver.findElement(gender).isDisplayed());
		ExtentSuccessMessage("Gender Assertion has been done");
		waitForElement(1000);
		By ZipCode = By.xpath("//span[contains(text(),'"+zipcode+"')]");
		Assert.assertTrue(driver.findElement(ZipCode).isDisplayed());
		ExtentSuccessMessage("ZipCode Assertion has been done");
//		By DOB = By.xpath("//span[contains(text(),'"+dob+"')]");
//		Assert.assertTrue(driver.findElement(DOB).isDisplayed());
//		ExtentSuccessMessage("DOB Assertion has been done");
		waitForElement(1000);	
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Declinecall));
		MoveToElementClick(element);
		ExtentSuccessMessage("clicked on Declinecall Button");
		edit_lead_details();
		waitForElement(5000);
		//waitVisibility(Admin);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(telephonysetup));
		MoveToElementClick(element);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(viewcalllogs));
		MoveToElementClick(element);
		waitForElement(6000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(search));
		if(ElementDisplayed(search)) {
			writeText(search, Number + Keys.ENTER);
			waitForElement(3000);
		}
		String LeadValue = "Rejected";
		By lead = By.xpath("(//div[@title='"+LeadValue+"'][normalize-space()='"+LeadValue+"'][@class='ui-grid-cell-contents ng-binding ng-scope'])[1]");		
		js.executeScript("document.getElementsByClassName('ui-grid-viewport ng-isolate-scope')[1].scrollBy(2270, 0);");
		if(ElementDisplayed(lead)) {
			String calldisposition = GetElementText(lead);
			System.out.println(calldisposition);
			Assert.assertEquals(LeadValue, calldisposition);
			ExtentSuccessMessage("Call Disposition Validaition Successfull");
		}
		waitForElement(3000);	
		By scroll_ID = By.xpath("(//span[@class='ui-grid-header-cell-label ng-binding'])[4]");
		ScrollUntilElementVisible(scroll_ID);
		waitForElement(1000);
		By scrollID = By.xpath("(//span[@class='ui-grid-header-cell-label ng-binding'])[1]");
		ScrollUntilElementVisible(scrollID);
		waitForElement(1000);
		ScrollUntilElementVisible(ID);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on ID");
		waitForElement(6000);
		By FromNumber = By.xpath("//p[@class='formContent ng-binding ng-scope'][normalize-space()='"+Number+"']");
		if(ElementDisplayed(FromNumber)) {
			Assert.assertTrue(driver.findElement(FromNumber).isDisplayed());
			ExtentSuccessMessage("Number Assertion has been done");
			By Incoming_Call = By.xpath("//p[normalize-space()='Incoming Call']");
			Assert.assertTrue(driver.findElement(Incoming_Call).isDisplayed());
			ExtentSuccessMessage("Incoming_Call Assertion has been done");
			Assert.assertTrue(driver.findElement(SSID).isDisplayed());
			ExtentSuccessMessage("SSID Assertion has been done");
			Assert.assertTrue(driver.findElement(Caller).isDisplayed());
			ExtentSuccessMessage("Caller Assertion has been done");
			Assert.assertTrue(driver.findElement(Callee).isDisplayed());
			ExtentSuccessMessage("Callee Assertion has been done");
			if(URL.contains("https://mme.benefitalign.com"))
			{
				ExtentSuccessMessage("Play Button Not there");
			} else {
				By Play = By.xpath("//p[normalize-space()='Incoming Call']");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Play));
				MoveToElementClick(element);
				ExtentSuccessMessage("Clicked on Play Button");
			}
		} else {
			RefreshPage();
			waitForElement(8000);
			waitVisibility(CTIMinimizeIcon);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
			MoveToElementClick(element);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(search));
			if(ElementDisplayed(search)) {
				writeText(search, Number + Keys.ENTER);
				waitForElement(3000);
			}
			waitForElement(3000);
			ClickonFirstRowId();
			ExtentSuccessMessage("Clicked on ID");
			waitForElement(6000);
			if(ElementDisplayed(FromNumber)) {
				Assert.assertTrue(driver.findElement(FromNumber).isDisplayed());
				ExtentSuccessMessage("Number Assertion has been done");
				By Incoming_Call = By.xpath("//p[normalize-space()='Incoming Call']");
				Assert.assertTrue(driver.findElement(Incoming_Call).isDisplayed());
				ExtentSuccessMessage("Incoming_Call Assertion has been done");
				Assert.assertTrue(driver.findElement(SSID).isDisplayed());
				ExtentSuccessMessage("SSID Assertion has been done");
				Assert.assertTrue(driver.findElement(Caller).isDisplayed());
				ExtentSuccessMessage("Caller Assertion has been done");
				Assert.assertTrue(driver.findElement(Callee).isDisplayed());
				ExtentSuccessMessage("Callee Assertion has been done");
				if(URL.contains("https://mme.benefitalign.com"))
				{
					ExtentSuccessMessage("Play Button Not there");
				} else {
					By Play = By.xpath("//p[normalize-space()='Incoming Call']");
					element = wait.until(ExpectedConditions.presenceOfElementLocated(Play));
					MoveToElementClick(element);
					ExtentSuccessMessage("Clicked on Play Button");
				}
			}
			else {
				RefreshPage();
				waitForElement(8000);
				waitVisibility(CTIMinimizeIcon);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
				MoveToElementClick(element);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(search));
				if(ElementDisplayed(search)) {
					writeText(search, Number + Keys.ENTER);
					waitForElement(3000);
				}
				waitForElement(5000);
				ClickonFirstRowId();
				ExtentSuccessMessage("Clicked on ID");
				waitForElement(6000);
				waitVisibility(FromNumber);
				if(ElementDisplayed(FromNumber)) {
					Assert.assertTrue(driver.findElement(FromNumber).isDisplayed());
					ExtentSuccessMessage("Number Assertion has been done");
					By Incoming_Call = By.xpath("//p[normalize-space()='Incoming Call']");
					Assert.assertTrue(driver.findElement(Incoming_Call).isDisplayed());
					ExtentSuccessMessage("Incoming_Call Assertion has been done");
					Assert.assertTrue(driver.findElement(SSID).isDisplayed());
					ExtentSuccessMessage("SSID Assertion has been done");
					Assert.assertTrue(driver.findElement(Caller).isDisplayed());
					ExtentSuccessMessage("Caller Assertion has been done");
					Assert.assertTrue(driver.findElement(Callee).isDisplayed());
					ExtentSuccessMessage("Callee Assertion has been done");
					if(URL.contains("https://mme.benefitalign.com"))
					{
						ExtentSuccessMessage("Play Button Not there");
					} else {
						By Play = By.xpath("//p[normalize-space()='Incoming Call']");
						element = wait.until(ExpectedConditions.presenceOfElementLocated(Play));
						MoveToElementClick(element);
						ExtentSuccessMessage("Clicked on Play Button");
					}
				}
			}
		}
		
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(menusales));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Sales Menu");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(submenuleads));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Leads Menu");
		waitForElement(2000);
		By SearchFiled = By.xpath(
				"//input[@class='ng-pristine ng-untouched md-input ng-empty ng-valid-minlength ng-valid-maxlength ng-valid ng-valid-required']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchFiled));
		MoveToElementClick(element);
		writeText(SearchFiled, Fullname + Keys.ENTER);
		ExtentSuccessMessage("Lead Name has been Searched");
		waitForElement(3000);
		String LeadValue1 = "Not Interested";
		By lead1 = By.xpath("//div[@title='"+LeadValue1+"']");		
		js.executeScript("document.getElementsByClassName('ui-grid-viewport ng-isolate-scope')[1].scrollBy(2270, 0);");
		waitVisibility(lead1);
		if(ElementDisplayed(lead1)) {
			String calldisposition = GetElementText(lead1);
			System.out.println(calldisposition);
			Assert.assertEquals(LeadValue1, calldisposition);
			ExtentSuccessMessage("Call Disposition Validaition Successfull");
		}

		By Rejected = By.xpath("//div[@class='Rejected']");
		Assert.assertTrue(driver.findElement(Rejected).isDisplayed());
		ExtentSuccessMessage("Rejected Assertion has been done");

		driver.switchTo().window(tabs.get(0));	
		waitForElement(1000);
		calldisposition();
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Submit));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Submit Button");
		waitForElement(8000);	
		By callback = By.xpath("//span[contains(text(),'Call Back')]");
		waitVisibility(callback);
		Assert.assertTrue(driver.findElement(callback).isDisplayed());
		ExtentSuccessMessage("CallBack Assertion has been done");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed");
		driver.switchTo().window(tabs.get(1));	

	}

	public void validate_Disposition_Dropdown() throws InterruptedException 
	{	
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		WebElement SenderNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String Sender_Number=SenderNumber.getText();
		driver.switchTo().window(tabs.get(1));
		WebElement ReceiveNumber = driver.findElement(By.xpath("//*[@title='Voice Number']"));
		String Number=ReceiveNumber.getText();
		waitForElement(1000);
		driver.switchTo().window(tabs.get(0));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
		MoveToElementClick(element);//clicking on PhoneNumber Field
		writeText(EnterPhoneNumberField, Number);
		ExtentSuccessMessage("Phone Number has been entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);//clicking on Call Button
		ExtentSuccessMessage("clicked on Call Button");
//		waitForElement(4000);
//		By ok = By.xpath("//span[normalize-space()='Ok']");
//		if(ElementDisplayed(ok)) {
//			element = wait.until(ExpectedConditions.presenceOfElementLocated(ok));
//			MoveToElementClick(element);
//			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
//			MoveToElementClick(element);	
//		}
		//ClickOnMuteCallIconIsvisible();
		driver.switchTo().window(tabs.get(1));
		waitForElement(1000);
		waitVisibility(CallAcceptButton);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);	
		ExtentSuccessMessage("clicked on Accept Button");
		waitForElement(2000);
		//ClickOnMuteCallIconIsvisible();
		waitForElement(1000);	
		waitVisibility(Firstname);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Firstname));
		String FirstName = "CEuser";
		writeText(Firstname, FirstName + Keys.ENTER);
		ExtentSuccessMessage("Firstname has been entered");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Lastname));
		String LastName = randomName();
		writeText(Lastname, LastName + Keys.ENTER);
		ExtentSuccessMessage("Lastname has been entered");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Email));
		String Fullname = FirstName+LastName;
		String email = Fullname+"@yopmail.com";
		writeText(Email, email + Keys.ENTER);
		ExtentSuccessMessage("Email has been entered");
//		waitForElement(1000);		
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(DOB));
//		String dob = "07/22/2024";
//		writeText(DOB, dob + Keys.ENTER);
//		ExtentSuccessMessage("DOB has been entered");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ZipCode));
		String zipcode = "32323";
		writeText(ZipCode, zipcode + Keys.ENTER);
		ExtentSuccessMessage("ZipCode has been entered");
		waitForElement(1000);	
		SelectGender();
		waitForElement(1000);
		URL = driver.getCurrentUrl();
		System.out.println("URL: "+URL);
		if(URL.contains("https://ce-uat.benefitalign.com/"))
		{
			dispositionlead();
		} else {
			DispositionLead();
		}
		waitForElement(1000);
		ExtentSuccessMessage("*************Minimize Disposition*************");
		By MinimizeButton = By.xpath("//a[@class='acc fa fa-window-minimize popup-btns']");
		Assert.assertTrue(driver.findElement(MinimizeButton).isDisplayed());
		ExtentSuccessMessage("Assertion for Minimize button is done");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MinimizeButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Minimize button has been clicked");

		ExtentSuccessMessage("*************Maximize Disposition*************");
		waitForElement(3000);
		By MaximizeButton = By.xpath("//a[@class='voice-call-green-button-small fa fa-window-maximize']");
		Assert.assertTrue(driver.findElement(MaximizeButton).isDisplayed());
		ExtentSuccessMessage("Assertion for Minimize button is done");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MaximizeButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Maximize button has been clicked");

		ExtentSuccessMessage("*************Submit Disposition*************");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Submit));
		Assert.assertTrue(driver.findElement(Submit).isDisplayed());
		ExtentSuccessMessage("Submit Assertion has been done");
		MoveToElementClick(element);
		ExtentSuccessMessage("clicked on Submit Button");
		waitForElement(14000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@ng-bind=\"$parent.basicInfoFormTemplateData['CustomerName']\"]")));	
		String name = element.getText();
		String fullname =FirstName+" "+LastName;
		Assert.assertEquals(fullname, name);
		ExtentSuccessMessage("Customername Assertion has been done");		
		By Email = By.xpath("//a[normalize-space()='"+email+"']");
		Assert.assertTrue(driver.findElement(Email).isDisplayed());
		ExtentSuccessMessage("Email Assertion has been done");	
		waitForElement(1000);
		String Gender ="Male";
		By gender = By.xpath("//span[contains(text(),'"+Gender+"')]");
		Assert.assertTrue(driver.findElement(gender).isDisplayed());
		ExtentSuccessMessage("Gender Assertion has been done");
		waitForElement(1000);
		By ZipCode = By.xpath("//span[contains(text(),'"+zipcode+"')]");
		Assert.assertTrue(driver.findElement(ZipCode).isDisplayed());
		ExtentSuccessMessage("ZipCode Assertion has been done");
//		By DOB = By.xpath("//span[contains(text(),'"+dob+"')]");
//		Assert.assertTrue(driver.findElement(DOB).isDisplayed());
//		ExtentSuccessMessage("DOB Assertion has been done");
		waitForElement(1000);	
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Declinecall));
		MoveToElementClick(element);
		ExtentSuccessMessage("clicked on Declinecall Button");
		waitForElement(3000);
		driver.switchTo().window(tabs.get(0));
		waitForElement(1000);
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(textarea));
//		String txt = "Hello This is Automation Text";
//		writeText(textarea, txt);		
//		ExtentSuccessMessage("Textarea has been entered");
		waitForElement(1000);
		callbackdisposition();
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(submit));
		Assert.assertTrue(driver.findElement(submit).isDisplayed());
		ExtentSuccessMessage("Submit Assertion has been done");
		MoveToElementClick(element);	
		ExtentSuccessMessage("clicked on Submit Button");
		waitForElement(10000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		waitForElement(4000);
//		By Notes = By.xpath("//span[contains(text(),'"+txt+"')]");
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(Notes));
//		js.executeScript("arguments[0].scrollIntoView(true);", element);
//		wait.until(ExpectedConditions.presenceOfElementLocated(Notes));
//		Assert.assertTrue(driver.findElement(Notes).isDisplayed());
//		ExtentSuccessMessage("Notes Assertion has been done");
//		waitForElement(1000);
//		WebElement comment = driver.findElement(By.xpath("//h4[@role='button']"));
//		String Comments=comment.getText();
//		Assert.assertEquals(Comments, txt);
//		waitForElement(1000);	
		element = wait.until(ExpectedConditions.presenceOfElementLocated(call));
		MoveToElementClick(element);	
		waitForElement(2000);

		element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
		MoveToElementClick(element);//clicking on PhoneNumber Field
		writeText(EnterPhoneNumberField, Number);
		ExtentSuccessMessage("Phone Number has been entered");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);//clicking on Call Button
		ExtentSuccessMessage("clicked on Call Button");
		waitForElement(2000);
		//ClickOnMuteCallIconIsvisible();
		driver.switchTo().window(tabs.get(1));
		//waitForElement(2000);
		waitVisibility(CallAcceptButton);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
		MoveToElementClick(element);	
		ExtentSuccessMessage("clicked on Accept Button");
		waitForElement(2000);
		//ClickOnMuteCallIconIsvisible();
		waitForElement(4000);
		if(ElementDisplayed(dispostionPopup)) {
			ExtentSuccessMessage("Disposition Popup Displayed");
		} else {
			waitForElement(1000);	
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Declinecall));
			MoveToElementClick(element);
			ExtentSuccessMessage("clicked on Declinecall Button");
			TelephonyPage.ClickOnMinimizeCallwindow();
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin));
			MoveToElementClick(element);
			waitForElement(1000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(telephonysetup));
			MoveToElementClick(element);
			waitForElement(1000);
			TelephonyPage.ClickOnMinimizeCallwindow();
			waitVisibility(ViewAndManageNumbers);
			TelephonyPage.ClickonViewAndManageNumbers();
			waitVisibility(SearchBar);
			TelephonyPage.EnterSearchBar(Number);
			waitVisibility(notes);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(notes));
			MoveToElementClick(element);
			ExtentSuccessMessage("clicked on Notes Icon");
//			element = wait.until(ExpectedConditions.presenceOfElementLocated(InboundLeadCallcheckbox));
//			String InboundLeadCallcheckboxstatus = element.getAttribute("aria-checked");
//			if(InboundLeadCallcheckboxstatus.contains("true")) {
//				ExtentSuccessMessage("Inbound Lead Call Checkbox it is already clicked");
//				
//			}else {
//				MoveToElementClick(element);
//				ExtentSuccessMessage("User Clicked on Inbound Lead Call Checkbox");
//			}
//			element = wait.until(ExpectedConditions.presenceOfElementLocated(OutboundLeadCallcheckbox));
//			String OutoundLeadCallcheckboxstatus = element.getAttribute("aria-checked");
//			if(OutoundLeadCallcheckboxstatus.contains("true")) {
//				ExtentSuccessMessage("Outbound Lead Call Checkbox it is already clicked");
//			}else {
//				MoveToElementClick(element);
//				ExtentSuccessMessage("User Clicked on Outbound Lead Call Checkbox");
//			}
			element = wait.until(ExpectedConditions.presenceOfElementLocated(InboundCustomerCallcheckbox));
			String InboundCustomerCallcheckboxstatus = element.getAttribute("aria-checked");
			if(InboundCustomerCallcheckboxstatus.contains("true")) {
				ExtentSuccessMessage("Inbound Customer Call Checkbox it is already clicked");
			}else {
				MoveToElementClick(element);
				ExtentSuccessMessage("User Clicked on Inbound Customer Call Checkbox");
			}
			element = wait.until(ExpectedConditions.presenceOfElementLocated(OutboundCustomerCallcheckbox));
			String OutoundCustomerCallcheckboxstatus = element.getAttribute("aria-checked");
			if(OutoundCustomerCallcheckboxstatus.contains("true")) {
				ExtentSuccessMessage("Outbound Customer Call Checkbox it is already clicked");
			}else {
				MoveToElementClick(element);
				ExtentSuccessMessage("User Clicked on Outbound Customer Call Checkbox");
			}
			
			element = wait.until(ExpectedConditions.presenceOfElementLocated(ok_btn));
			MoveToElementClick(element);
			waitVisibility(Success_Message);
			String msg = GetElementText(Success_Message);
			Assert.assertEquals(msg, "Call disposition set successfully.");
			
			waitForElement(1000);
			driver.switchTo().window(tabs.get(0));
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Cancel));
			MoveToElementClick(element);	
			ExtentSuccessMessage("Clicked on Cancel Button");
			waitVisibility(EnterPhoneNumberField);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(EnterPhoneNumberField));
			MoveToElementClick(element);//clicking on PhoneNumber Field
			writeText(EnterPhoneNumberField, Number);
			ExtentSuccessMessage("Phone Number has been entered");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);//clicking on Call Button
			ExtentSuccessMessage("clicked on Call Button");
			waitForElement(1000);
//			if(ElementDisplayed(ok)) {
//				element = wait.until(ExpectedConditions.presenceOfElementLocated(ok));
//				MoveToElementClick(element);
//				element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
//				MoveToElementClick(element);
//			}
			//ClickOnMuteCallIconIsvisible();
			driver.switchTo().window(tabs.get(1));
			waitVisibility(CallAcceptButton);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAcceptButton));
			MoveToElementClick(element);	
			ExtentSuccessMessage("clicked on Accept Button");
			waitForElement(2000);
			//ClickOnMuteCallIconIsvisible();
			waitForElement(3000);	
			if(ElementDisplayed(dispostionPopup)) {
				ExtentSuccessMessage("Disposition Popup Displayed");
			}
		}
		waitForElement(3000);
		calldisposition();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Submit));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Submit Button");
		waitForElement(5000);	
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Declinecall));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Declinecall Button");

		edit_customer_details();
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(telephonysetup));
		MoveToElementClick(element);
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(viewcalllogs));
		MoveToElementClick(element);
		waitForElement(6000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(search));
		if(ElementDisplayed(search)) {
			writeText(search, name + Keys.ENTER);
			waitForElement(3000);
		}
		String LeadValue = "Call Back";
		By lead = By.xpath("(//div[@title='"+LeadValue+"'][normalize-space()='"+LeadValue+"'][@class='ui-grid-cell-contents ng-binding ng-scope'])[1]");		
		js.executeScript("document.getElementsByClassName('ui-grid-viewport ng-isolate-scope')[1].scrollBy(2270, 0);");
		if(ElementDisplayed(lead)) {
			String calldisposition = GetElementText(lead);
			System.out.println(calldisposition);
			Assert.assertEquals(LeadValue, calldisposition);
			ExtentSuccessMessage("Call Disposition Validaition Successfull");
		}
		
		waitForElement(3000);	
		By scroll_ID = By.xpath("(//span[@class='ui-grid-header-cell-label ng-binding'])[4]");
		ScrollUntilElementVisible(scroll_ID);
		waitForElement(1000);
		By scrollID = By.xpath("(//span[@class='ui-grid-header-cell-label ng-binding'])[1]");
		ScrollUntilElementVisible(scrollID);
		waitForElement(1000);
		ScrollUntilElementVisible(ID);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on ID");
		waitForElement(6000);
		By FromNumber = By.xpath("//p[@class='formContent ng-binding ng-scope'][normalize-space()='"+Number+"']");
		if(ElementDisplayed(FromNumber)) {
			Assert.assertTrue(driver.findElement(FromNumber).isDisplayed());
			ExtentSuccessMessage("Number Assertion has been done");
			By Incoming_Call = By.xpath("//p[normalize-space()='Incoming Call']");
			Assert.assertTrue(driver.findElement(Incoming_Call).isDisplayed());
			ExtentSuccessMessage("Incoming_Call Assertion has been done");
			Assert.assertTrue(driver.findElement(SSID).isDisplayed());
			ExtentSuccessMessage("SSID Assertion has been done");
			Assert.assertTrue(driver.findElement(Caller).isDisplayed());
			ExtentSuccessMessage("Caller Assertion has been done");
			Assert.assertTrue(driver.findElement(Callee).isDisplayed());
			ExtentSuccessMessage("Callee Assertion has been done");
			if(URL.contains("https://mme.benefitalign.com"))
			{
				ExtentSuccessMessage("Play Button Not there");
			} else {
				By Play = By.xpath("//p[normalize-space()='Incoming Call']");
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Play));
				MoveToElementClick(element);
				ExtentSuccessMessage("Clicked on Play Button");
			}
		} else {
			RefreshPage();
			waitForElement(8000);
			waitVisibility(CTIMinimizeIcon);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
			MoveToElementClick(element);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(search));
			if(ElementDisplayed(search)) {
				writeText(search, name + Keys.ENTER);
				waitForElement(3000);
			}
			waitForElement(3000);
			ClickonFirstRowId();
			ExtentSuccessMessage("Clicked on ID");
			waitForElement(6000);
			if(ElementDisplayed(FromNumber)) {
				Assert.assertTrue(driver.findElement(FromNumber).isDisplayed());
				ExtentSuccessMessage("Number Assertion has been done");
				By Incoming_Call = By.xpath("//p[normalize-space()='Incoming Call']");
				Assert.assertTrue(driver.findElement(Incoming_Call).isDisplayed());
				ExtentSuccessMessage("Incoming_Call Assertion has been done");
				Assert.assertTrue(driver.findElement(SSID).isDisplayed());
				ExtentSuccessMessage("SSID Assertion has been done");
				Assert.assertTrue(driver.findElement(Caller).isDisplayed());
				ExtentSuccessMessage("Caller Assertion has been done");
				Assert.assertTrue(driver.findElement(Callee).isDisplayed());
				ExtentSuccessMessage("Callee Assertion has been done");
				if(URL.contains("https://mme.benefitalign.com"))
				{
					ExtentSuccessMessage("Play Button Not there");
				} else {
					By Play = By.xpath("//p[normalize-space()='Incoming Call']");
					element = wait.until(ExpectedConditions.presenceOfElementLocated(Play));
					MoveToElementClick(element);
					ExtentSuccessMessage("Clicked on Play Button");
				}
			}
			else {
				RefreshPage();
				waitForElement(8000);
				waitVisibility(CTIMinimizeIcon);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
				MoveToElementClick(element);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(search));
				if(ElementDisplayed(search)) {
					writeText(search, name + Keys.ENTER);
					waitForElement(3000);
				}
				waitForElement(5000);
				ClickonFirstRowId();
				ExtentSuccessMessage("Clicked on ID");
				waitForElement(6000);
				waitVisibility(FromNumber);
				if(ElementDisplayed(FromNumber)) {
					Assert.assertTrue(driver.findElement(FromNumber).isDisplayed());
					ExtentSuccessMessage("Number Assertion has been done");
					By Incoming_Call = By.xpath("//p[normalize-space()='Incoming Call']");
					Assert.assertTrue(driver.findElement(Incoming_Call).isDisplayed());
					ExtentSuccessMessage("Incoming_Call Assertion has been done");
					Assert.assertTrue(driver.findElement(SSID).isDisplayed());
					ExtentSuccessMessage("SSID Assertion has been done");
					Assert.assertTrue(driver.findElement(Caller).isDisplayed());
					ExtentSuccessMessage("Caller Assertion has been done");
					Assert.assertTrue(driver.findElement(Callee).isDisplayed());
					ExtentSuccessMessage("Callee Assertion has been done");
					if(URL.contains("https://mme.benefitalign.com"))
					{
						ExtentSuccessMessage("Play Button Not there");
					} else {
						By Play = By.xpath("//p[normalize-space()='Incoming Call']");
						element = wait.until(ExpectedConditions.presenceOfElementLocated(Play));
						MoveToElementClick(element);
						ExtentSuccessMessage("Clicked on Play Button");
					}
				}
			}
		}
		
		waitForElement(4000);
		By Customer = By.xpath("//a[@class='glyphicon fa fa-users'] | //a[@name='menu_customers']");
		if(ElementDisplayed(Customer)) {
			waitVisibility(Customer);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Customer));
			MoveToElementClick(element);
			ExtentSuccessMessage("Clicked on Customers");
		} else {
			
			By Home = By.xpath("//a[@ng-switch-when='false'][normalize-space()='Home']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Home));
			MoveToElementClick(element);
			ExtentSuccessMessage("Clicked on Customers");
			waitForElement(3000);
			By Customer1 = By.xpath("//a[@class='glyphicon fa fa-users']");
			waitVisibility(Customer1);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Customer1));
			MoveToElementClick(element);
			ExtentSuccessMessage("Clicked on Customers");
		}
		waitForElement(5000);
		By SearchFiled = By.xpath(
				"//input[@class='ng-pristine ng-untouched md-input ng-empty ng-valid-minlength ng-valid-maxlength ng-valid ng-valid-required']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchFiled));
		MoveToElementClick(element);
		writeText(SearchFiled, fullname + Keys.ENTER);
		ExtentSuccessMessage("Customer name has been Searched");
		waitForElement(8000);
		By Scroll = By.xpath("(//div[@class='ui-grid-cell-contents ng-binding ng-scope'])[7]");	
		waitVisibility(Scroll);
		Base_Class.ScrollUntilElementVisible(Scroll);
		waitForElement(5000);
		By lead1 = By.xpath("(//div[@title='"+LeadValue+"'])[1]");
		if(ElementDisplayed(lead1)) {
			String calldisposition = GetElementText(lead1);
			System.out.println(calldisposition);
			Assert.assertEquals(LeadValue, calldisposition);
			ExtentSuccessMessage("Call Disposition Validaition Successfull");
		} else {
			By Gridmenu = By.xpath("(//i[@aria-label='Grid Menu'])[2]");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Gridmenu));
			MoveToElementClick(element);
			waitForElement(3000);
			ExtentSuccessMessage("Clicked on Grid Menu");
			By welcomecalldispo = By.xpath("(//li[@role='menuitem']//button[contains(.,'Call Disposition')])[2]");
			if(ElementDisplayed(welcomecalldispo)) {
				element = wait.until(ExpectedConditions.presenceOfElementLocated(welcomecalldispo));
				MoveToElementClick(element);
				waitForElement(3000);
				ExtentSuccessMessage("Clicked on Welcome call disposition");
			} else {
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Gridmenu));
				MoveToElementClick(element);
				ExtentSuccessMessage("Clicked on Grid Menu");
				waitVisibility(welcomecalldispo);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(welcomecalldispo));
				MoveToElementClick(element);
				waitForElement(3000);
				ExtentSuccessMessage("Clicked on Welcome call disposition");
			}
			waitForElement(2000);
			waitVisibility(Gridmenu);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Gridmenu));
			MoveToElementClick(element);
			ExtentSuccessMessage("Clicked on Grid Menu");
			waitForElement(3000);
			Base_Class.ScrollUntilElementVisible(Scroll);
			waitForElement(3000);
//			By Getdispo = By.xpath("(//div[@class='ui-grid-cell-contents ng-binding ng-scope'])[7]/../following-sibling::div[4]");
//			String Call_back = GetElementText(Getdispo);
//			System.out.println(Call_back);
			waitVisibility(lead1);
			if(ElementDisplayed(lead1)) {
				String calldisposition = GetElementText(lead1);
				System.out.println(calldisposition);
				Assert.assertEquals(LeadValue, calldisposition);
				ExtentSuccessMessage("Call Disposition Validaition Successfull");
			}
		}

		By Prospect = By.xpath("//div[@title='Prospect']");
		Assert.assertTrue(driver.findElement(Prospect).isDisplayed());
		ExtentSuccessMessage("Prospect Assertion has been done");
		waitForElement(1000);
		
		driver.switchTo().window(tabs.get(0));	
		waitForElement(1000);
		callbackdisposition();
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Submit));
		Assert.assertTrue(driver.findElement(Submit).isDisplayed());
		ExtentSuccessMessage("Submit Button Assertion has been done");
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Submit Button");
		waitForElement(5000);	
		By callback = By.xpath("//span[contains(text(),'Call Back')]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(callback));
		Assert.assertTrue(driver.findElement(callback).isDisplayed());
		ExtentSuccessMessage("Callback Assertion has been done");

		driver.switchTo().window(tabs.get(1));	
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		MoveToElementClick(element);
		ExtentSuccessMessage("User has been selected");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SelectLogout));
		MoveToElementClick(element);
		ExtentSuccessMessage("Logout has been performed");
		driver.switchTo().window(tabs.get(0));
		TelephonyPage.ClickOnMinimizeCallwindow();
	}	  

	public void new_Tab() throws InterruptedException
	{
		waitForElement(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		waitForElement(3000);
		ExtentSuccessMessage("New Tab has been Opened");
	}

	public void login_SecondUser_TransferCall() throws InterruptedException, IOException
	{		
		waitForElement(1000);
		String Url = URL;
		String jenkinsUrl = System.getProperty("URL");
		if (jenkinsUrl != null && !jenkinsUrl.isEmpty()) {
			Url = jenkinsUrl;
		}
		waitForElement(1000);
		String username = configloader().getProperty("PLCA_UserName8");
		String pswd = configloader().getProperty("PLCA_Password8");
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
		waitForElement(20000);
	}

	public void TabSwitchToParent() throws InterruptedException
	{
		waitForElement(2000);
		ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(Tabs.size());
		driver.switchTo().window(Tabs.get(0));
		ExtentSuccessMessage("Tab Switched from child to parent");
		waitForElement(5000);
	}
	
	public void new_Window() throws InterruptedException
	{
		waitForElement(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		waitForElement(3000);
		ExtentSuccessMessage("New Window has been opened");	
	}

	public void maximizeWindow()
	{
		driver.manage().window().maximize();
	}
	
	public void Second_User_CallScript() throws InterruptedException, IOException
	{	
		waitForElement(1000);
		String urlCE;
		String currentSystemURL = URL;
        System.out.println(currentSystemURL);
        if (currentSystemURL.contains("https://mme.benefitalign.com/")) {
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
        String username = configloader().getProperty("PLCA_UserName8");
        String pswd = configloader().getProperty("PLCA_Password8");
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

	public void login_ThirdUser_TransferCall() throws InterruptedException, IOException
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

//		String Url = configloader().getProperty("URL2");
//		String jenkinsUrl = System.getProperty("URL2");
//		if (jenkinsUrl != null && !jenkinsUrl.isEmpty()) {
//			Url = jenkinsUrl;
//		}
//		waitForElement(1000);
//		String username = configloader().getProperty("PLCA_UserName7"); 
//		String pswd = configloader().getProperty("PLCA_Password7");
//		waitForElement(1000);
//		driver.get(Url);
//		waitForElement(5000);
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(userID));
//		MoveToElementClick(element);
//		ExtentSuccessMessage("Clicked on Broker Engage Username field");
//		writeText(userID, username);
//		ExtentSuccessMessage("Entered the Broker Engage Username");
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
//		MoveToElementClick(element);
//		ExtentSuccessMessage("Clicked on Broker Engage password field");
//		writeText(pwd, pswd);
//		ExtentSuccessMessage("Entered the Broker Engage Password");
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
//		MoveToElementClick(element);
//		waitForElement(4000);
//		ExtentSuccessMessage("Logged into the Receiver Side");
		
	}

	public void transfer_Call() throws InterruptedException
	{
		waitForElement(2000);
		By CallAccept = By.xpath("//button[@id='AcceptIncomingTrigger']");
		waitVisibility(CallAccept);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAccept));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been accepted from second user");

		waitForElement(4000);
		By MinimizeButton = By.xpath("//a[@class='acc fa fa-window-minimize popup-btns']");
		waitVisibility(MinimizeButton);
		Assert.assertTrue(driver.findElement(MinimizeButton).isDisplayed());
		ExtentSuccessMessage("Assertion for Minimize button is done");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MinimizeButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Minimize button has been clicked");

		waitForElement(1000);
		ClickOnMuteCallIconIsvisible();
		waitForElement(1000);

		waitForElement(1000);
		By TransferCallButton = By.xpath("//i[@class=' fa fa-calls-transfer ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferCallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on call transfer button");

		waitForElement(5000);
		By TransferWindow = By.xpath("//div[@id='draggable-CTI-users-window']");
		Assert.assertTrue(driver.findElement(TransferWindow).isDisplayed());
		ExtentSuccessMessage("Clicked on call transfer button");

		if(driver.findElement(TransferWindow).isDisplayed())
		{
			waitForElement(3000);
			URL = driver.getCurrentUrl();
			System.out.println("URL: "+URL);
			if(URL.contains("https://ce-uat.benefitalign.com/"))
			{
				ExtentSuccessMessage("Clicked on agent tab in transfer call popup");
			} else {
				By AgentSection = By.xpath("(//md-tab-item[@class='md-tab ng-scope ng-isolate-scope md-ink-ripple'])[1]");
				waitVisibility(AgentSection);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentSection));
				MoveToElementClick(element);
				ExtentSuccessMessage("Clicked on agent tab in transfer call popup");
			}
			waitForElement(2000);
			By Search = By.xpath("//div[@class='input-group col-md-12']//input[@id='example-search-input']");
			waitVisibility(Search);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Search));
			MoveToElementClick(element);
			String user = "CEusertwo CTI";
			writeText(Search, user);
			//Base_Class.KeyOperation("ENTER");
			waitForElement(1000);
//			By searchicon = By.xpath("//button[@ng-click='CTICtrl.fetchActiveAgentorGroupByValue(CTICtrl.agentSearch)']//i[@class='fa fa-search']");
//			element = wait.until(ExpectedConditions.presenceOfElementLocated(searchicon));
//			MoveToElementClick(element);
			By CEAgent = By.xpath("//span[@title='"+user+"']/parent::*/button");
			waitVisibility(CEAgent);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CEAgent));
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			wait.until(ExpectedConditions.presenceOfElementLocated(CEAgent));
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CEAgent));
			MoveToElementClick(element);
			ExtentSuccessMessage("Clicked on CE User in Popup");
		}
		else{ExtentSuccessMessage("Transfer Call Popup is not visible");}

	}
	
	public void validateCallLogsTime(String Value) throws InterruptedException {
		System.out.println("Time = " + Value);
		//By elements =By.xpath("(//div[contains(.,'"+Value+"')])[14]");
		By elements =By.xpath("(//div[@role='gridcell'])[7]");
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(elements));
		String time1 = element.getText();
		System.out.println("Time1 = " +time1);
		String timeString = StringUtils.substringAfter(time1," ");
		System.out.println("---------"+timeString);
		System.out.println("---------"+time);
		boolean isTimeMatching =areTimesMatching(timeString, time, 2);
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

	public void accept_Call() throws InterruptedException
	{
		waitForElement(2000);
		By CallAccept = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallAccept));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been accepted from second user");

		waitForElement(7000);
		By MinimizeButton = By.xpath("//a[@class='acc fa fa-window-minimize popup-btns']");
		waitVisibility(MinimizeButton);
		Assert.assertTrue(driver.findElement(MinimizeButton).isDisplayed());
		ExtentSuccessMessage("Assertion for Minimize button is done");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(MinimizeButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Minimize button has been clicked");

		waitForElement(2000);
		ClickOnMuteCallIconIsvisible();
		waitForElement(3000);
	}

	public void transferCall() throws InterruptedException
	{
		waitForElement(2000);
//		By TransferCallButton = By.xpath("//i[@class=' fa fa-calls-transfer ']");
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferCallButton));
//		MoveToElementClick(element);
//		ExtentSuccessMessage("Clicked on call transfer button");
//
//		waitForElement(5000);
//		By TransferWindow = By.xpath("//div[@id='draggable-CTI-users-window']");
//		Assert.assertTrue(driver.findElement(TransferWindow).isDisplayed());
//		ExtentSuccessMessage("Clicked on call transfer button");
//
//		if(driver.findElement(TransferWindow).isDisplayed())
//		{
//			waitForElement(3000);
//			By AgentSection = By.xpath("(//md-tab-item[@class='md-tab ng-scope ng-isolate-scope md-ink-ripple'])[1]");
//			element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentSection));
//			MoveToElementClick(element);
//			ExtentSuccessMessage("Clicked on agent tab in transfer call popup");
//			waitForElement(3000);
//			By CEAgent = By.xpath("//span[@title='CEUser Agent']/parent::*/button");
//			element = wait.until(ExpectedConditions.presenceOfElementLocated(CEAgent));
//			MoveToElementClick(element);
//			ExtentSuccessMessage("Clicked on CEUser Agent in Popup");
//		}
//		else{ExtentSuccessMessage("Transfer Call Popup is not visible");}
		
		By TransferCallButton = By.xpath("//i[@class=' fa fa-calls-transfer ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(TransferCallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on call transfer button");

		waitForElement(5000);
		By TransferWindow = By.xpath("//div[@id='draggable-CTI-users-window']");
		Assert.assertTrue(driver.findElement(TransferWindow).isDisplayed());
		ExtentSuccessMessage("Clicked on call transfer button");

		if(driver.findElement(TransferWindow).isDisplayed())
		{
			waitForElement(4000);
			URL = driver.getCurrentUrl();
			System.out.println("URL: "+URL);
			if(URL.contains("https://ce-uat.benefitalign.com/"))
			{
				ExtentSuccessMessage("Clicked on agent tab in transfer call popup");
			} else {
				By AgentSection = By.xpath("(//md-tab-item[@class='md-tab ng-scope ng-isolate-scope md-ink-ripple'])[1]");
				waitVisibility(AgentSection);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(AgentSection));
				MoveToElementClick(element);
				ExtentSuccessMessage("Clicked on agent tab in transfer call popup");
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
			MoveToElementClick(element);
			ExtentSuccessMessage("Clicked on CEAgent in Popup");
		}
		else{ExtentSuccessMessage("Transfer Call Popup is not visible");}

	}

	public int getRandomNumber()
	{
		Random r = new Random();
		int ran = r.nextInt(1000);
		return ran;
	}

	public void TabSwitchToChild() throws InterruptedException
	{
		ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(Tabs.size());
		driver.switchTo().window(Tabs.get(1));
		waitForElement(3000);
		ExtentSuccessMessage("Tab Switched from parent to child");
		waitForElement(2000);
	}

	public void TabSwitchToThirdWindow() throws InterruptedException
	{
		waitForElement(2000);
		ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(Tabs.size());
		driver.switchTo().window(Tabs.get(2));
		ExtentSuccessMessage("Tab Switched from child to parent");
		waitForElement(5000);
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

	public void DispositionInboundCallTransfer() throws InterruptedException, IOException
	{
		waitForElement(5000);
		By UserNumber1 = By.xpath("//u[@title='Voice Number']");
		waitVisibility(UserNumber1);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber1));
		String firstnumber=element.getText();
		System.out.println(firstnumber);
		URL = driver.getCurrentUrl();
		System.out.println("Current URL = "+ URL);
		driver.switchTo().newWindow(WindowType.TAB);
		ExtentSuccessMessage("New Tab has been Opened");
		login_SecondUser_TransferCall();
		login_CE_validations();
		//splitthewindowscreen("Left");
		TabSwitchToParent();
		new_Window();
		//maximizeWindow();
		//splitthewindowscreen("Right");
		login_ThirdUser_TransferCall();
		login_CE_validations();

		By UserNumber2 = By.xpath("//u[@title='Voice Number']");
		waitVisibility(UserNumber2);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber2));
		String secondnumber=element.getText();
		System.out.println(secondnumber);
		
		By CTIInputField = By.xpath("//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		String CEUserValidNumber = firstnumber ;
		writeText(CTIInputField, CEUserValidNumber);
		ExtentSuccessMessage("Number has been in input field" + CEUserValidNumber);
		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");	  
		waitForElement(3000);
		By ok = By.xpath("//span[normalize-space()='Ok']");
		if(ElementDisplayed(ok)) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(ok));
			MoveToElementClick(element);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
		}
		time = Currenttime();
		System.out.println(time);
		waitForElement(1000);
		ClickOnMuteCallIconIsvisible();

		TabSwitchToParent();
		transfer_Call();
		TabSwitchToChild();

		By FirstUserNumber = By.cssSelector("#voice-call-window-draggable > div:nth-child(15) > div.voice-call-incoming-window > div.voice-call-ongoing-number > span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FirstUserNumber));
		String firstno=element.getText();
		System.out.println(firstno);

		ExtentSuccessMessage("First Number is bee displayed in CTI console");

		By AcceptButton = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been acepted by third user");

		//		waitForElement(2000);
		//		ClickOnMuteCallIconIsvisible();
		//		waitForElement(3000);	

		TabSwitchToParent();	
		waitForElement(1000);
		By WarmTransfer = By.xpath("//button[@class='voice-call-green-button-small fa fa-phone fa fa-code-fork blue-bg']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(WarmTransfer));
		MoveToElementClick(element);

		TabSwitchToThirdWindow();
		waitForElement(1000);
		By CallDecline = By.cssSelector("#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDecline));
		MoveToElementClick(element);
		TabSwitchToChild();

		waitForElement(1000);
		By CallDispoPopup = By.xpath("//div[@class='accordion-container ng-scope dispositiondivs lc-acc-open']");
		Assert.assertTrue(driver.findElement(CallDispoPopup).isDisplayed());
		ExtentSuccessMessage("Call disposition popup is displayed");

		String lastname = "Lead" + getRandomNumber();
		System.out.println(lastname);

		waitForElement(2000);
		if(driver.findElement(CallDispoPopup).isDisplayed())
		{

			By LeadName = By.xpath("//input[@name='LeadFirstName']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadName));
			MoveToElementClick(element);
			String name = "Auto";
			writeText(LeadName,name);

			By LeadLastName = By.xpath("//input[@name='LeadLastName']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadLastName));
			MoveToElementClick(element);
			writeText(LeadLastName,lastname);

//			waitForElement(3000);	
//			element = wait.until(ExpectedConditions.presenceOfElementLocated(DOB));
//			String dob = "07/22/2024";
//			writeText(DOB, dob + Keys.ENTER);
//			ExtentSuccessMessage("DOB has been entered");
			waitForElement(1000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(ZipCode));
			String zipcode = "32323";
			writeText(ZipCode, zipcode + Keys.ENTER);
			ExtentSuccessMessage("ZipCode has been entered");
			waitForElement(1000);
			SelectGender();
			waitForElement(1000);
			URL = driver.getCurrentUrl();
			System.out.println("URL: "+URL);
			if(URL.contains("https://mme.benefitalign.com"))
			{
				selectLead();
			}
			ExtentSuccessMessage("*************Submit Disposition*************");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Submit));
			Assert.assertTrue(driver.findElement(Submit).isDisplayed());
			ExtentSuccessMessage("Submit Assertion has been done");
			MoveToElementClick(element);
			ExtentSuccessMessage("clicked on Submit Button");
			waitForElement(10000);

		}
		else	{ExtentSuccessMessage("Disposition popup is not visible");	}

		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		waitForElement(15000);
		By CustomerNameLeadSection = By.xpath("(//div[@class='col-xs-12 col-sm-12 col-md-6 col-lg-6'])[1]/span");
		waitVisibility(CustomerNameLeadSection);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomerNameLeadSection));
		String name=element.getText();
		System.out.println(name);

		String namestring = StringUtils.substringAfter(name," ");
		System.out.println(namestring);

		Assert.assertEquals(namestring, lastname);
		ExtentSuccessMessage("Assertion for name is done");

		By Status = By.xpath("//li[@class='nav-item user-details']/span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Status));
		String status=  element.getText();
		System.out.println(status);

		if(URL.contains("https://mme.benefitalign.com"))
		{
			Assert.assertEquals(status, "Unqualified");
		} else {
			Assert.assertEquals(status, "Qualified");
		}
		ExtentSuccessMessage("Assertion for Status is done and Status is :-" + status);

		waitForElement(2000);
		By EditLead = By.xpath("//i[@class='btn fa fa-pencil ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EditLead));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Edit Lead");

		waitForElement(4000);
		WebElement HRCADD=driver.findElement(By.xpath("//select[@name='HRACompleted']"));
		Select s = new Select(HRCADD);
		s.selectByVisibleText("Yes");
		ExtentSuccessMessage("HRCA DD is selected");
		waitForElement(1000);
		WebElement salestype=driver.findElement(By.xpath("//select[@name='SaleType']"));
		Select s1 = new Select(salestype);
		s1.selectByVisibleText("New");
		ExtentSuccessMessage("Sales DD is selected");
		waitForElement(1000);
		By ContactInfo = By.cssSelector("#page-wrapper > div > ui-view > div:nth-child(3) > div.col-xl-9.col-lg-6.left-section.details > div:nth-child(2) > ng-include > div > div.col-md-12.pull-left > form > div.accordions > div:nth-child(3) > div > i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContactInfo));
		MoveToElementClick(element);
		ExtentSuccessMessage("Contact Information has been clicked");

		By LeadMobileNumber = By.xpath("//input[@name='LeadMobile']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadMobileNumber));
		element.clear();
		MoveToElementClick(element);
		writeText(LeadMobileNumber,"1111111111");
		ExtentSuccessMessage("Number has been edited");

		By SaveButton = By.xpath("(//button[@class='btn btn-default green'])[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SaveButton));
		MoveToElementClick(element);

		logout_CE_validations();
		TabSwitchToParent();
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on AdminTile");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(telephonysetup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Telephony setup");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(viewcalllogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call/SMS/FAX Logs Management");
		driver.manage().window().maximize();
		RefreshPage();
		Thread.sleep(5000);
		TelephonyPage.ClickOnMinimizeCallwindow();
		waitForElement(2000);
//		By CallType = By.xpath("(//div[@class='accordion-container grid-style-height'])[3]");
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallType));
//		MoveToElementClick(element);
//		ExtentSuccessMessage("Clicked on Call type");
//		waitForElement(6000);
		//By Transferedcall = By.xpath("//md-checkbox[@name='Transferred Call']");
//		By Transferedcall = By.xpath("//span[normalize-space()='Transferred Call']");
//		waitVisibility(Transferedcall);
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(Transferedcall));
//		MoveToElementClick(element);
//		ExtentSuccessMessage("Clicked on Transfered call button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(search));
		if(ElementDisplayed(search)) {
			System.out.println(secondnumber);
			writeText(search, secondnumber + Keys.ENTER);
			waitForElement(2000);
			validateCallDetails(secondnumber);
			validateCallLogsTime(time);
		}
		waitForElement(3000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on ID");
		waitForElement(6000);
		By FromNumber = By.xpath("//p[@class='formContent ng-binding ng-scope'][normalize-space()='"+secondnumber+"']");
		if(ElementDisplayed(FromNumber)) {
			Assert.assertTrue(driver.findElement(FromNumber).isDisplayed());
			ExtentSuccessMessage("Number Assertion has been done");
			By Incoming_Call = By.xpath("//p[normalize-space()='Incoming Call']");
			Assert.assertTrue(driver.findElement(Incoming_Call).isDisplayed());
			ExtentSuccessMessage("Incoming_Call Assertion has been done");
			Assert.assertTrue(driver.findElement(SSID).isDisplayed());
			ExtentSuccessMessage("SSID Assertion has been done");
			Assert.assertTrue(driver.findElement(Caller).isDisplayed());
			ExtentSuccessMessage("Caller Assertion has been done");
			Assert.assertTrue(driver.findElement(Callee).isDisplayed());
			ExtentSuccessMessage("Callee Assertion has been done");
			if(URL.contains("https://mme.benefitalign.com"))
			{
				ExtentSuccessMessage("Play Button Not there");
			} else if (ElementDisplayed(Play)){
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Play));
				MoveToElementClick(element);
				ExtentSuccessMessage("Clicked on Play Button");
			} else {
				ExtentSuccessMessage("Play Button Not there");
			}
		} else {
			RefreshPage();
			waitForElement(8000);
			waitVisibility(CTIMinimizeIcon);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
			MoveToElementClick(element);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(search));
			if(ElementDisplayed(search)) {
				writeText(search, secondnumber + Keys.ENTER);
				waitForElement(3000);
			}
			waitForElement(3000);
			ClickonFirstRowId();
			ExtentSuccessMessage("Clicked on ID");
			waitForElement(6000);
			if(ElementDisplayed(FromNumber)) {
				Assert.assertTrue(driver.findElement(FromNumber).isDisplayed());
				ExtentSuccessMessage("Number Assertion has been done");
				By Incoming_Call = By.xpath("//p[normalize-space()='Incoming Call']");
				Assert.assertTrue(driver.findElement(Incoming_Call).isDisplayed());
				ExtentSuccessMessage("Incoming_Call Assertion has been done");
				Assert.assertTrue(driver.findElement(SSID).isDisplayed());
				ExtentSuccessMessage("SSID Assertion has been done");
				Assert.assertTrue(driver.findElement(Caller).isDisplayed());
				ExtentSuccessMessage("Caller Assertion has been done");
				Assert.assertTrue(driver.findElement(Callee).isDisplayed());
				ExtentSuccessMessage("Callee Assertion has been done");
				if(URL.contains("https://mme.benefitalign.com"))
				{
					ExtentSuccessMessage("Play Button Not there");
				} else if (ElementDisplayed(Play)){
					element = wait.until(ExpectedConditions.presenceOfElementLocated(Play));
					MoveToElementClick(element);
					ExtentSuccessMessage("Clicked on Play Button");
				} else {
					ExtentSuccessMessage("Play Button Not there");
				}
			}
			else {
				RefreshPage();
				waitForElement(8000);
				waitVisibility(CTIMinimizeIcon);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
				MoveToElementClick(element);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(search));
				if(ElementDisplayed(search)) {
					writeText(search, secondnumber + Keys.ENTER);
					waitForElement(3000);
				}
				waitForElement(5000);
				ClickonFirstRowId();
				ExtentSuccessMessage("Clicked on ID");
				waitForElement(6000);
				waitVisibility(FromNumber);
				if(ElementDisplayed(FromNumber)) {
					Assert.assertTrue(driver.findElement(FromNumber).isDisplayed());
					ExtentSuccessMessage("Number Assertion has been done");
					By Incoming_Call = By.xpath("//p[normalize-space()='Incoming Call']");
					Assert.assertTrue(driver.findElement(Incoming_Call).isDisplayed());
					ExtentSuccessMessage("Incoming_Call Assertion has been done");
					Assert.assertTrue(driver.findElement(SSID).isDisplayed());
					ExtentSuccessMessage("SSID Assertion has been done");
					Assert.assertTrue(driver.findElement(Caller).isDisplayed());
					ExtentSuccessMessage("Caller Assertion has been done");
					Assert.assertTrue(driver.findElement(Callee).isDisplayed());
					ExtentSuccessMessage("Callee Assertion has been done");
					if(URL.contains("https://mme.benefitalign.com"))
					{
						ExtentSuccessMessage("Play Button Not there");
					} else if (ElementDisplayed(Play)){
						element = wait.until(ExpectedConditions.presenceOfElementLocated(Play));
						MoveToElementClick(element);
						ExtentSuccessMessage("Clicked on Play Button");
					} else {
						ExtentSuccessMessage("Play Button Not there");
					}
				}
			}
		}
		ExtentSuccessMessage("Assertion for Transferedcall is done in admin section and call is Transfered call");
		logout_CE_validations();
		TabSwitchToThirdWindow();
		TelephonyPage.ClickOnMinimizeCallwindow();

	}

	public void validateCallDetails(String Value) throws InterruptedException {
		By elements =By.xpath("(//*[@class='ui-grid-canvas']//*[contains(text(),'"+Value+"')])[1]");
		waitForElement(2000);
		if (ElementDisplayed(elements)) {
			ExtentSuccessMessage("Successfully user able to See the '"+Value+"'inside the web table ");

		} else {
			ExtentSuccessMessage("Unsuccessfully  '"+Value+"' Not visible inside the web table");
		}		

	}
	
	public void DispositionOutboundCallTransfer() throws InterruptedException, IOException
	{

		waitForElement(5000);
		By UserNumber1 = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber1));
		String firstnumber=element.getText();
		System.out.println(firstnumber);
		URL = driver.getCurrentUrl();
		System.out.println("Current URL = "+ URL);
		driver.switchTo().newWindow(WindowType.TAB);
		ExtentSuccessMessage("New Tab has been Opened");

		login_ThirdUser_TransferCall();
		login_CE_validations();
		By UserNumber3 = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber3));
		String thirdnumber=element.getText();
		System.out.println(thirdnumber);
		//splitthewindowscreen("Left");
		TabSwitchToParent();
		new_Window();
		//maximizeWindow();
		//splitthewindowscreen("Right");
		login_SecondUser_TransferCall();
		login_CE_validations();

		waitForElement(4000);
		By UserNumber2 = By.xpath("//u[@title='Voice Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(UserNumber2));
		String secondnumber=element.getText();
		System.out.println(secondnumber);

		waitForElement(2000);
		By CTIInputField = By.xpath("//input[@class='voice-call-input ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIInputField));
		MoveToElementClick(element);
		ExtentSuccessMessage("Input field has been clicked");
		String CEUserValidNumber = thirdnumber ;
		writeText(CTIInputField, CEUserValidNumber);
		ExtentSuccessMessage("Number has been in input field" + CEUserValidNumber);
		By CallButton = By.xpath("(//button[@class='voice-call-green-button-small fa fa-phone'])[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call button has been clicked");	
		waitForElement(3000);
		By ok = By.xpath("//span[normalize-space()='Ok']");
		if(ElementDisplayed(ok)) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(ok));
			MoveToElementClick(element);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CallButton));
			MoveToElementClick(element);
		}
		waitForElement(2000);
		ClickOnMuteCallIconIsvisible();
		waitForElement(2000);
		
		TabSwitchToChild();
		accept_Call();
		TabSwitchToThirdWindow();
		transferCall();
		TabSwitchToParent();
		
		waitForElement(4000);
		By FirstUserNumber = By.cssSelector("#voice-call-window-draggable > div:nth-child(15) > div.voice-call-incoming-window > div.voice-call-ongoing-number > span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FirstUserNumber));
		String firstno=element.getText();
		System.out.println(firstno);
		ExtentSuccessMessage("First Number is bee displayed in CTI console");

		waitForElement(2000);
		By AcceptButton = By.xpath("//button[@id='AcceptIncomingTrigger']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptButton));
		MoveToElementClick(element);
		ExtentSuccessMessage("Call has been acepted by third user");
		time = Currenttime();
		System.out.println(time);
		TabSwitchToThirdWindow();
		waitForElement(2000);
		By WarmTransfer = By.xpath("//button[@class='voice-call-green-button-small fa fa-phone fa fa-code-fork blue-bg']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(WarmTransfer));
		MoveToElementClick(element);

		TabSwitchToChild();
		By CallDecline = By.cssSelector("#voice-call-window-draggable > div:nth-child(15) > div.voice-call-ongoing-call > div:nth-child(2) > button");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallDecline));
		MoveToElementClick(element);
		TabSwitchToParent();

		waitForElement(5000);
		By CallDispoPopup = By.xpath("//div[@class='accordion-container ng-scope dispositiondivs lc-acc-open']");
		Assert.assertTrue(driver.findElement(CallDispoPopup).isDisplayed());
		ExtentSuccessMessage("Call disposition popup is displayed");

		String lastname = "Lead" + getRandomNumber();
		System.out.println(lastname);

		waitForElement(2000);
		if(driver.findElement(CallDispoPopup).isDisplayed())
		{
			waitForElement(3000);
			By LeadName = By.xpath("//input[@name='LeadFirstName']");
			waitVisibility(LeadName);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadName));
			MoveToElementClick(element);
			String name = "Auto";
			writeText(LeadName,name);

			By LeadLastName = By.xpath("//input[@name='LeadLastName']");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadLastName));
			MoveToElementClick(element);
			writeText(LeadLastName,lastname);

//			waitForElement(3000);	
//			element = wait.until(ExpectedConditions.presenceOfElementLocated(DOB));
//			String dob = "07/22/2024";
//			writeText(DOB, dob + Keys.ENTER);
//			ExtentSuccessMessage("DOB has been entered");
			waitForElement(1000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(ZipCode));
			String zipcode = "32323";
			writeText(ZipCode, zipcode + Keys.ENTER);
			ExtentSuccessMessage("ZipCode has been entered");
			waitForElement(1000);	
			SelectGender();
			waitForElement(1000);
			URL = driver.getCurrentUrl();
			System.out.println("URL: "+URL);
			if(URL.contains("https://mme.benefitalign.com"))
			{
				selectLead();
			}
			ExtentSuccessMessage("*************Submit Disposition*************");
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Submit));
			Assert.assertTrue(driver.findElement(Submit).isDisplayed());
			ExtentSuccessMessage("Submit Assertion has been done");
			MoveToElementClick(element);
			ExtentSuccessMessage("clicked on Submit Button");
			waitForElement(10000);

		}
		else	{ExtentSuccessMessage("Disposition popup is not visible");	}

		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		waitForElement(10000);
		By CustomerNameLeadSection = By.xpath("(//div[@class='col-xs-12 col-sm-12 col-md-6 col-lg-6'])[1]/span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CustomerNameLeadSection));
		String name=element.getText();
		System.out.println(name);

		String namestring = StringUtils.substringAfter(name," ");
		System.out.println(namestring);

		waitForElement(1000);
		Assert.assertEquals(namestring, lastname);
		ExtentSuccessMessage("Assertion for name is done");

		By Status = By.xpath("//li[@class='nav-item user-details']/span");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Status));
		String status=  element.getText();
		System.out.println(status);
		if(URL.contains("https://mme.benefitalign.com"))
		{
			Assert.assertEquals(status, "Unqualified");
		} else {
			Assert.assertEquals(status, "Qualified");
		}
		ExtentSuccessMessage("Assertion for Status is done and Status is :-" + status);

		waitForElement(1000);
		By EditLead = By.xpath("//i[@class='btn fa fa-pencil ']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(EditLead));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Edit Lead");

		waitForElement(3000);
		WebElement HRCADD=driver.findElement(By.xpath("//select[@name='HRACompleted']"));
		Select s = new Select(HRCADD);
		s.selectByVisibleText("Yes");
		ExtentSuccessMessage("HRCA DD is selected");

		waitForElement(2000);
		WebElement salestype=driver.findElement(By.xpath("//select[@name='SaleType']"));
		Select s1 = new Select(salestype);
		s1.selectByVisibleText("New");
		ExtentSuccessMessage("Sales DD is selected");

		waitForElement(2000);
		By ContactInfo = By.cssSelector("#page-wrapper > div > ui-view > div:nth-child(3) > div.col-xl-9.col-lg-6.left-section.details > div:nth-child(2) > ng-include > div > div.col-md-12.pull-left > form > div.accordions > div:nth-child(3) > div > i");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ContactInfo));
		MoveToElementClick(element);
		ExtentSuccessMessage("Contact Information has been clicked");

		By LeadMobileNumber = By.xpath("//input[@name='LeadMobile']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadMobileNumber));
		element.clear();
		MoveToElementClick(element);
		writeText(LeadMobileNumber,"1111111111");
		ExtentSuccessMessage("Number has been edited");

		By SaveButton = By.xpath("(//button[@class='btn btn-default green'])[4]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SaveButton));
		MoveToElementClick(element);
		logout_CE_validations();
		TabSwitchToChild();
		TelephonyPage.ClickOnMinimizeCallwindow();
		logout_CE_validations();
		TabSwitchToThirdWindow();
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Admin));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on AdminTile");
		waitForElement(1000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(telephonysetup));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Telephony setup");
		waitForElement(2000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(viewcalllogs));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on Call/SMS/FAX Logs Management");
//		driver.manage().window().maximize();
//		RefreshPage();
//		Thread.sleep(8000);
//		TelephonyPage.ClickOnMinimizeCallwindow();
//		TelephonyPage.ClickOnCallTypeFilter();
//		By Transferedcall = By.xpath("//md-checkbox[@name='Transferred Call']");
//		waitVisibility(Transferedcall);
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(Transferedcall));
//		MoveToElementClick(element);
//		ExtentSuccessMessage("Clicked on Transfered call button");
//		waitForElement(5000);
//		TelephonyPage.ClickOnMinimizeCallwindow();
		waitForElement(7000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(search));
		System.out.println(thirdnumber);
		if(ElementDisplayed(search)) {
			System.out.println(thirdnumber);
			writeText(search, thirdnumber + Keys.ENTER);
			waitForElement(6000);
		}
		validateCallDetails(thirdnumber);
		validateCallLogsTime(time);
		ExtentSuccessMessage("Assertion for Transferedcall is done in admin section and call is Transfered call");
		
		waitForElement(3000);	
		element = wait.until(ExpectedConditions.presenceOfElementLocated(ID));
		MoveToElementClick(element);
		ExtentSuccessMessage("Clicked on ID");
		waitForElement(6000);
		By FromNumber = By.xpath("//p[@class='formContent ng-binding ng-scope'][normalize-space()='"+secondnumber+"']");
		if(ElementDisplayed(FromNumber)) {
			Assert.assertTrue(driver.findElement(FromNumber).isDisplayed());
			ExtentSuccessMessage("Number Assertion has been done");
			By Outgoing_Call = By.xpath("//p[normalize-space()='Outgoing Call']");
			Assert.assertTrue(driver.findElement(Outgoing_Call).isDisplayed());
			ExtentSuccessMessage("Outgoing_Call Assertion has been done");
			Assert.assertTrue(driver.findElement(SSID).isDisplayed());
			ExtentSuccessMessage("SSID Assertion has been done");
			Assert.assertTrue(driver.findElement(Caller).isDisplayed());
			ExtentSuccessMessage("Caller Assertion has been done");
			Assert.assertTrue(driver.findElement(Callee).isDisplayed());
			ExtentSuccessMessage("Callee Assertion has been done");
			if(URL.contains("https://mme.benefitalign.com"))
			{
				ExtentSuccessMessage("Play Button Not there");
			}else if (ElementDisplayed(Play)){
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Play));
				MoveToElementClick(element);
				ExtentSuccessMessage("Clicked on Play Button");
			} else {
				ExtentSuccessMessage("Play Button Not there");
			}
		} else {
			RefreshPage();
			waitForElement(8000);
			waitVisibility(CTIMinimizeIcon);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
			MoveToElementClick(element);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(search));
			if(ElementDisplayed(search)) {
				writeText(search, thirdnumber + Keys.ENTER);
				waitForElement(3000);
			}
			waitForElement(3000);
			ClickonFirstRowId();
			ExtentSuccessMessage("Clicked on ID");
			waitForElement(6000);
			if(ElementDisplayed(FromNumber)) {
				Assert.assertTrue(driver.findElement(FromNumber).isDisplayed());
				ExtentSuccessMessage("Number Assertion has been done");
				By Outgoing_Call = By.xpath("//p[normalize-space()='Outgoing Call']");
				Assert.assertTrue(driver.findElement(Outgoing_Call).isDisplayed());
				ExtentSuccessMessage("Outgoing_Call Assertion has been done");
				Assert.assertTrue(driver.findElement(SSID).isDisplayed());
				ExtentSuccessMessage("SSID Assertion has been done");
				Assert.assertTrue(driver.findElement(Caller).isDisplayed());
				ExtentSuccessMessage("Caller Assertion has been done");
				Assert.assertTrue(driver.findElement(Callee).isDisplayed());
				ExtentSuccessMessage("Callee Assertion has been done");
				if(URL.contains("https://mme.benefitalign.com"))
				{
					ExtentSuccessMessage("Play Button Not there");
				} else if (ElementDisplayed(Play)){
					element = wait.until(ExpectedConditions.presenceOfElementLocated(Play));
					MoveToElementClick(element);
					ExtentSuccessMessage("Clicked on Play Button");
				} else {
					ExtentSuccessMessage("Play Button Not there");
				}
			}
			else {
				RefreshPage();
				waitForElement(8000);
				waitVisibility(CTIMinimizeIcon);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
				MoveToElementClick(element);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(search));
				if(ElementDisplayed(search)) {
					writeText(search, thirdnumber + Keys.ENTER);
					waitForElement(3000);
				}
				waitForElement(5000);
				ClickonFirstRowId();
				ExtentSuccessMessage("Clicked on ID");
				waitForElement(6000);
				waitVisibility(FromNumber);
				if(ElementDisplayed(FromNumber)) {
					Assert.assertTrue(driver.findElement(FromNumber).isDisplayed());
					ExtentSuccessMessage("Number Assertion has been done");
					By Outgoing_Call = By.xpath("//p[normalize-space()='Outgoing Call']");
					Assert.assertTrue(driver.findElement(Outgoing_Call).isDisplayed());
					ExtentSuccessMessage("Outgoing_Call Assertion has been done");
					Assert.assertTrue(driver.findElement(SSID).isDisplayed());
					ExtentSuccessMessage("SSID Assertion has been done");
					Assert.assertTrue(driver.findElement(Caller).isDisplayed());
					ExtentSuccessMessage("Caller Assertion has been done");
					Assert.assertTrue(driver.findElement(Callee).isDisplayed());
					ExtentSuccessMessage("Callee Assertion has been done");
					if(URL.contains("https://mme.benefitalign.com"))
					{
						ExtentSuccessMessage("Play Button Not there");
					} else if (ElementDisplayed(Play)){
						element = wait.until(ExpectedConditions.presenceOfElementLocated(Play));
						MoveToElementClick(element);
						ExtentSuccessMessage("Clicked on Play Button");
					} else {
						ExtentSuccessMessage("Play Button Not there");
					}
				}
			}
		}
	}

}
