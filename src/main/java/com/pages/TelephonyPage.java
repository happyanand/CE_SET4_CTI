package com.pages;
import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.BasePackage.Base_Class;

public class TelephonyPage extends BasePage {
	Base_Class Base_Class =new Base_Class();

	public TelephonyPage(WebDriver driver) {
		super(driver);
	}
	WebElement element;
	String Groupnumber="";
	private By CTIMinimizeIcon = By.xpath("//a[@class='fa fa-minus right-al']");
	private By ADminmodule = By.xpath("//*[@class='admin-box box animate-box fade-in']");
	private By TelephonySetup = By.xpath("//*[contains(@ng-show,'Telephony Setup')]");
	private By ViewAndManageNumbers = By.xpath("//*[@id='manage-account-home']//*[text()='View & Manage Numbers']//parent::div//button[contains(@name,'manage')] | (//*[contains(.,'Manage Numbers')]//button[@id='manageNumbersBtn'])[1]");
	private By CTICallGroupManagement = By.id("manageCallGroupsBtn");
	private By CallSMSFAXLogsManagement = By.id("viceCallLogsBtn");
	private By SMSLogs = By.xpath("//*[text()=' SMS Logs']");
	private By DNCSpamProtectionManagement = By.xpath("//*[@id='manage-account-home']//*[text()='DNC & Spam Protection Management']");
	private By CallDispositionManagement = By.xpath("//*[@id='manage-account-home']//*[text()='Call Disposition Management']");
	private By CustomCTIStatusManagement = By.xpath("//*[@id='manage-account-home']//*[text()='Custom CTI Status Management']");
	private By AddCustomFooterNoteManagement = By.xpath("//*[@id='manage-account-home']//*[text()='Add Custom Footer Note Management']");
	private By emailtab = By.xpath("//*[@class='fa fa-envelope']//parent::a//parent::li");
	private By EnterEmail =By.xpath("//*[@placeholder='Add email address']");
	private By EnterEmailSubject = By.name("subject");
	private By EnterEmailMessage =By.xpath("//*[@placeholder='Message']");
	private By AddAttachmentfilebutton = By.xpath("//div[@ng-model='myFiles']");
	private By GreentickButton = By.xpath("//*[@class='fa fa-check yellow green']");
	private By CallTypeFilter = By.xpath("//h5[contains(text(),'Call Type')]//parent::div");
	private By SMSTypeFilter = By.xpath("//h5[contains(text(),'SMS Type')]//parent::div");
	private By RecentCallsFilter = By.xpath("//h5[contains(text(),'Recent Calls')]//parent::div");
	private By SearchBar = By.xpath("//*[@aria-label='Search your text'] | //*[@aria-label='Search Phone numbers']");
	private By Nextpage = By.xpath("//*[contains(@ng-click,'pager.currentPage + 1')]");
	private By NextpageDesible = By.xpath("//*[@class='Next-class disabled']");
	private By CreatedToday = By.xpath("//*[@value='Created Today']");
	private By Last7days = By.xpath("//*[@value='Last 7 Days']");
	private By AdvanceFiltersearchButton = By.xpath("//*[@ng-click='collapseAdvanSrch()'][@role='button']");
	private By CallCreatedDateFrom = By.id("CreatedStartDate");
	private By CallCreatedDateTo = By.id("CreatedEndDate");
	private By AdvancedSearchBtn = By.id("applyadvancedSearchBtn");
	private By NodatafoundPage = By.xpath("//*[@ng-show='searchListData.length == 0']");
	private By Previouspage = By.xpath("//*[contains(@ng-click,'pager.currentPage - 1')]");
	private By UserTab =By.xpath("//*[contains(@ng-show,'Users')][contains(@ng-show,'isAccessible')]");
	private By GroupCallsTab =By.xpath("//*[contains(@ng-click,'admin/manage-account/callGroups')]");
	private By CreateGroupCallTab = By.xpath("//button[normalize-space()='Create Call Group']");
	private By CallGroupname = By.name("GroupName");
	private By BoardcastOption = By.xpath("//span[normalize-space()='Broadcasting']");
	private By BestFitOption =By.xpath("//span[normalize-space()='Best Fit']");
	private By NextButton = By.xpath("//button[@type='button'][normalize-space()='Next']");
	private By Gruopnumberfirst =By.xpath("(//*[contains(@class,'dropDown md-active md-clickable')]//md-option)[1]");
	private By GroupmemberName =By.xpath("//*[@class='dx-texteditor-input']");
	private By Memberfromgrid =By.xpath("//*[@class='dx-select-checkbox dx-datagrid-checkbox-size dx-checkbox dx-widget']");
	private By DoneButton = By.xpath("//*[@ng-click='saveNumbers();']");
	private By CallGroupNumber = By.name("GroupNumber");
	private By CallIcon =By.xpath("//*[@class='nav-item user-details phone-bg']//a[@class='ng-binding']");
	private By CallGrouptab =By.xpath("//*[contains(@ng-class,'CALL_GROUPS')]");
	private By OnorOffSwitch =By.xpath("//*[@ng-click='CTICtrl.switchOnOrOffGroup(callGroup)']");
	private By ValidateonSwitch =By.xpath("//*[@class='glyphicon fa fa-toggle-on ng-scope']");
	private By IncomingCallNotification =By.xpath("//*[@title='Incoming Call Count']");
	private By RefreshCallGroupTab = By.xpath("//*[contains(@title,'Refresh')]");
	private By Rememberthepreference = By.xpath("//md-checkbox[@title='Enabling this option would load all your preferences the next time you log in.']//div[@class='md-container md-ink-ripple']");
	private By Rememberthepreference1 = By.xpath("//md-checkbox[@title='Enabling this option would load all your preferences the next time you log in.']");
	private By RememberThePreferencePopup =By.xpath("//div[@class='alert js-custom-alert-callgroup ng-binding alert-success']");
	private By CloseGroupTab =By.xpath("//*[@title='Close']");
	private By NextPAgeGroupcallTab =By.xpath("//*[@title='Next']");
	private By PreviousPAgeGroupcallTab =By.xpath("//*[@title='Previous']");
	private By RinglessCheckBox = By.xpath("//md-checkbox[@name='RinglessCallGroup']//div[@class='md-container md-ink-ripple']");
	private By RinglessCheckBox1 = By.xpath("//md-checkbox[@name='RinglessCallGroup']");
	



	public void hoverOnAdminModule() throws InterruptedException {
		if (ElementDisplayed(ADminmodule)) {
			ExtentSuccessMessage("Successfully user able to See 'Admin module Icon' ");
			MouseHoverOnElement(ADminmodule);
			ExtentSuccessMessage("Successfully user Hover on 'Admin module Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'Admin module Icon' Not visible");
		}
	}
	public void CheckCallSMSFAXLogsManagement() throws InterruptedException {
		if (ElementDisplayed(CallSMSFAXLogsManagement)) {
			ExtentSuccessMessage("Successfully user able to See 'Call/SMS/FAX Logs Management Icon' ");

		} else {
			ExtentErrorMessage("Unsuccessfully 'Call/SMS/FAX Logs Management Icon' Not visible");
		}
	}
	public void CheckDNCSpamProtectionManagement() throws InterruptedException {
		if (ElementDisplayed(DNCSpamProtectionManagement)) {
			ExtentSuccessMessage("Successfully user able to See 'DNC & Spam Protection Management Icon' ");

		} else {
			ExtentErrorMessage("Unsuccessfully 'DNC & Spam Protection Management Icon' Not visible");
		}
	}
	public void CheckAddCustomFooterNoteManagement() throws InterruptedException {
		if (ElementDisplayed(AddCustomFooterNoteManagement)) {
			ExtentSuccessMessage("Successfully user able to See 'Add Custom Footer Note Management Icon' ");

		} else {
			ExtentErrorMessage("Unsuccessfully 'Add Custom Footer Note Management Icon' Not visible");
		}
	}
	public void CheckCustomCTIStatusManagement() throws InterruptedException {
		if (ElementDisplayed(CustomCTIStatusManagement)) {
			ExtentSuccessMessage("Successfully user able to See 'Custom CTI Status Management Icon' ");

		} else {
			ExtentErrorMessage("Unsuccessfully 'Custom CTI Status Management Icon' Not visible");
		}
	}
	public void CheckCallDispositionManagement() throws InterruptedException {
		if (ElementDisplayed(CallDispositionManagement)) {
			ExtentSuccessMessage("Successfully user able to See 'Call Disposition Management Icon' ");

		} else {
			ExtentErrorMessage("Unsuccessfully 'Call Disposition Management Icon' Not visible");
		}
	}

	public void CheckViewAndManageNumbers() throws InterruptedException {
		if (ElementDisplayed(ViewAndManageNumbers)) {
			ExtentSuccessMessage("Successfully user able to See 'View And Manage Numbers Icon' ");

		} else {
			ExtentErrorMessage("Unsuccessfully 'View And Manage Numbers Icon' Not visible");
		}
	}
	public void CheckCTICallGroupManagement() throws InterruptedException {
		if (ElementDisplayed(CTICallGroupManagement)) {
			ExtentSuccessMessage("Successfully user able to See 'CTI Call Group Management Icon' ");

		} else {
			ExtentErrorMessage("Unsuccessfully 'CTI Call Group Management Icon' Not visible");
		}
	}
	public void ClickOnTelephonySetp() throws InterruptedException {

		if (ElementDisplayed(TelephonySetup)) {
			ExtentSuccessMessage("Successfully user able to See 'Telephony Setup' ");
			click(TelephonySetup);
			ExtentSuccessMessage("Successfully user Clicked on 'Telephony Setup' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'Telephony Setup' Not visible");
		}
		Thread.sleep(8000);
	}



	public void ClickOnGroupCallsTab() throws InterruptedException {

		if (ElementDisplayed(GroupCallsTab)) {
			ExtentSuccessMessage("Successfully user able to See 'Group Calls Tab' ");
			click(GroupCallsTab);
			ExtentSuccessMessage("Successfully user Clicked on 'Group Calls Tab' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'Group Calls Tab' Not visible");
		}
	}
	public void ClickOnCreateGroupCallsTab() throws InterruptedException {
		if (ElementDisplayed(CreateGroupCallTab)) {
			ExtentSuccessMessage("Successfully user able to See ' Create Group Calls Tab' ");
			click(CreateGroupCallTab);
			ExtentSuccessMessage("Successfully user Clicked on ' Create Group Calls Tab' ");
		} else {
			ExtentErrorMessage("Unsuccessfully ' Create Group Calls Tab' Not visible");
		}
	}


	public void ClickOnUserTab() throws InterruptedException {

		if (ElementDisplayed(UserTab)) {
			ExtentSuccessMessage("Successfully user able to See 'User Tab' ");
			click(UserTab);
			ExtentSuccessMessage("Successfully user Clicked on 'User Tab' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'User Tab' Not visible");
		}
	}

	public void ClickOnCreatedToday() throws InterruptedException {

		if (ElementDisplayed(CreatedToday)) {
			ExtentSuccessMessage("Successfully user able to See 'CreatedToday Filter' ");
			click(CreatedToday);
			ExtentSuccessMessage("Successfully user Clicked on 'CreatedToday Filter' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'CreatedToday filter' Not visible");
		}
	}
	public void ClickOnLast7days() throws InterruptedException {

		if (ElementDisplayed(Last7days)) {
			ExtentSuccessMessage("Successfully user able to See 'Last7days Filter' ");
			click(Last7days);
			ExtentSuccessMessage("Successfully user Clicked on 'Last7days Filter' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'Last7days filter' Not visible");
		}
	}


	public void ClickOnCTICallGroupManagement () throws InterruptedException {

		if (ElementDisplayed(CTICallGroupManagement)) {
			ExtentSuccessMessage("Successfully user able to See 'CTI Call Group Management ' ");
			click(CTICallGroupManagement);
			ExtentSuccessMessage("Successfully user Clicked on 'CTI Call Group Management ' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'CTI Call Group Management ' Not visible");
		}
	}
	public void Getnameoffirstgroupcallfromgrid() throws InterruptedException {
		Thread.sleep(35000);
		String text =null;
		By firstgroupfromlist=By.xpath("(//*[contains(@ng-click,'grid.appScope.navigateToDetails')])[1]");
		if(ElementDisplayed(firstgroupfromlist)) {
			System.out.println("Group found in the grid");
			ExtentSuccessMessage("Successfully user able to see the details inside grid:- "+text);
		}else {
			System.out.println("Group not visible in the grid");
			RefreshPage();
			Thread.sleep(8000);
			Thread.sleep(5000);
			if(ElementDisplayed(firstgroupfromlist)) {
				System.out.println("Group found in the grid");
				Thread.sleep(5000);
				text=GetElementText(firstgroupfromlist);
				ExtentSuccessMessage("Successfully user able to see the details inside grid:- "+text);
			}else {
				ExtentErrorMessage("UnSuccessfully user is not able to see any group call details inside the grid");
			}
		}



	}

	public void ClickOnfirstGroupName() throws InterruptedException {
		Thread.sleep(35000);
		By firstgroupfromlist=By.xpath("(//*[contains(@ng-click,'grid.appScope.navigateToDetails')])[1]");
		if(ElementDisplayed(firstgroupfromlist)) {
			System.out.println("Group found in the grid");
			click(firstgroupfromlist);
			ExtentSuccessMessage("Successfully user Clicked on 'First Group Name from list' ");
		}else {
			System.out.println("Group not visible in the grid");
			RefreshPage();
			Thread.sleep(8000);
			ClickOnMinimizeCallwindow();
			Thread.sleep(5000);
			if(ElementDisplayed(firstgroupfromlist)) {
				System.out.println("Group found in the grid");
				Thread.sleep(5000);
				click(firstgroupfromlist);
				ExtentSuccessMessage("Successfully user Clicked on 'First Group Name from list' ");
			}
		}

	}

	public void NavigateToTelephonySetpPage() throws InterruptedException {
		hoverOnAdminModule();
		ClickOnTelephonySetp();
	}



	public void NavigateToUSerTab() throws InterruptedException {
		hoverOnAdminModule();
		ClickOnUserTab();
	}


	public void TelephonySetup() throws InterruptedException {
		Thread.sleep(15000);
		NavigateToTelephonySetpPage();
		Thread.sleep(15000);
		CheckAddCustomFooterNoteManagement();
		CheckCallDispositionManagement();
		CheckCallSMSFAXLogsManagement();
		CheckCTICallGroupManagement();
		CheckDNCSpamProtectionManagement();
		CheckCustomCTIStatusManagement();
		CheckViewAndManageNumbers();
	}

	public void TelephonySetup_Manage_Numbers() throws InterruptedException {
		Thread.sleep(15000);
		NavigateToTelephonySetpPage();
		Thread.sleep(25000);
		CheckAddCustomFooterNoteManagement();
		CheckCallDispositionManagement();
		CheckCallSMSFAXLogsManagement();
		CheckCTICallGroupManagement();
		CheckDNCSpamProtectionManagement();
		CheckCustomCTIStatusManagement();
		ClickonViewAndManageNumbers();
	}
	public void Manage_group_Collaboration_suite_in_Call_group(CensusInfo ApplicantInfo) throws InterruptedException, ParseException, AWTException {
		Thread.sleep(15000);
		ClickOnMinimizeCallwindow();
		NavigateToTelephonySetpPage();
		Thread.sleep(25000);
		ClickOnCTICallGroupManagement();
		ClickOnfirstGroupName();
		Thread.sleep(5000);
		ClickOnemailtab();
		Thread.sleep(8000);
		EnterEmail(ApplicantInfo.Email);
		EnterEmailSubject("Automation testing Subject");
		String Randomwrods =generateRandomText();
		EnterEmailMessage("Automation Testing "+Randomwrods);
		Base_Class.UploadFileWithRobot(System.getProperty("user.dir") + "\\Upload\\Sticky Note.docx",AddAttachmentfilebutton);
		ClickOnGreentickButton();
	}

	public void	Validate_that_user_is_able_to__Manage_Groups_in_this_section() throws InterruptedException {
		Thread.sleep(15000);
		ClickOnMinimizeCallwindow();
		NavigateToTelephonySetpPage();
		Thread.sleep(5000);
		ClickOnCTICallGroupManagement();
		Getnameoffirstgroupcallfromgrid();
	}
	public void Telephony_Setup_View_Logs_Call_Logs_section(CensusInfo ApplicantInfo) throws InterruptedException, ParseException, AWTException {
		Thread.sleep(15000);
		ClickOnMinimizeCallwindow();
		NavigateToTelephonySetpPage();
		Thread.sleep(25000);
		ClickOnCallSMSFAXLogsManagement();
		VelidateTheOptions();
	}
	public void Call_Logs_Direction_of_calls() throws InterruptedException {
		Thread.sleep(15000);
		ClickOnMinimizeCallwindow();
		NavigateToTelephonySetpPage();
		Thread.sleep(25000);
		ClickOnCallSMSFAXLogsManagement();
		Thread.sleep(10000);
		ClickOnCallTypeFilter();
		Validate_the_Call_direction();
	}
	public void Default_Filter_Type_of_Call() throws InterruptedException {
		Thread.sleep(25000);
		ClickOnMinimizeCallwindow();
		NavigateToTelephonySetpPage();
		Thread.sleep(15000);
		ClickOnCallSMSFAXLogsManagement();
		Thread.sleep(10000);
		ClickOnCallTypeFilter();
		ClickoNInbound();
		Thread.sleep(5000);
		ValidateCallsDirection("Inbound");
		Thread.sleep(3000);
		ClickoNInbound();
		Thread.sleep(3000);
		Clickonoutbound();
		Thread.sleep(5000);
		ValidateCallsDirection("Outbound");
		Clickonoutbound();

	}



	public void Call_Logs_Phone_Number() throws InterruptedException {
		Thread.sleep(15000);
		ClickOnMinimizeCallwindow();
		NavigateToTelephonySetpPage();
		Thread.sleep(25000);
		ClickOnCallSMSFAXLogsManagement();
		Thread.sleep(10000);
		ValidateFirstFromMobileNo();
		ValidateFirstToMobileNo();
	}
	public void Call_Log_Global_Search() throws InterruptedException {
		Thread.sleep(15000);
		ClickOnMinimizeCallwindow();
		NavigateToTelephonySetpPage();
		Thread.sleep(10000);
		ClickOnCallSMSFAXLogsManagement();
		Thread.sleep(10000);
		ClickOnCallTypeFilter();
		ClickoNInbound();
		Thread.sleep(8000);
		EnterSearchBar("CEUser qaasif");
		Thread.sleep(3000);
		ValidateTheFirstFromMobileNo("7074660803");
		ClickoNInbound();
		Thread.sleep(3000);
		Clickonoutbound();
		Thread.sleep(5000);
		EnterSearchBar("CEUser qaasif");
		ValidateTheFirstToMobileNo("7074660803");
		Clickonoutbound();

	}


	public void Default_Filter_Show_log_records_for() throws InterruptedException {
		Thread.sleep(15000);
		ClickOnMinimizeCallwindow();
		Thread.sleep(5000);
		NavigateToTelephonySetpPage();
		Thread.sleep(10000);
		ClickOnCallSMSFAXLogsManagement();
		Thread.sleep(15000);
		ClickOnRecentCalltypeFilter();
		Thread.sleep(3000);
		ClickOnCreatedToday();
		Thread.sleep(3000);
		gotoendpage();
		Thread.sleep(3000);
		String Todaydate=Currentdate();
		ValidateCallsDate(Todaydate);
		Thread.sleep(3000);
		ClickOnLast7days();
		Thread.sleep(5000);
		gotoendpage();
		Thread.sleep(3000);
		String LastSevenDays = SevendaysagoDate();
		ValidateCallsDate(LastSevenDays);
		Thread.sleep(3000);


	}
	public void Default_Filter_Date_Range() throws InterruptedException {
		Thread.sleep(25000);
		ClickOnMinimizeCallwindow();
		Thread.sleep(5000);
		NavigateToTelephonySetpPage();
		Thread.sleep(10000);
		ClickOnCallSMSFAXLogsManagement();
		Thread.sleep(15000);
		ClickOnAdvanceFiltersearchButton();
		String YesterdayDate =YesterdayDate();
		String Todaydate=Currentdate();
		EnterCallCreatedDateFrom(YesterdayDate);
		EnterCallCreatedDateTo(Todaydate);
		ClickOnAdvanceSearchBtn();
		Thread.sleep(8000);
		ValidateCallsDate(Todaydate);
		gotoendpage();
		Thread.sleep(3000);
		ValidateCallsDate(YesterdayDate);



	}


	public void ValidateCallsDate(String Value) throws InterruptedException {
		List<WebElement> fields = driver.findElements(By.xpath("//*[contains(@class,'000D')]//*[contains(text(),':')][@class='ui-grid-cell-contents ng-binding ng-scope']"));
		System.out.println("Debug:- "+fields.size());
		int lastIndex =fields.size();
		By LastDateelement = By.xpath("(//*[contains(@class,'000D')]//*[contains(text(),':')][@class='ui-grid-cell-contents ng-binding ng-scope'])["+lastIndex+"]");
		String Date=GetElementText(LastDateelement);
		System.out.println("Date:- "+Date);
		String[] Dates = Date.split(" ");
		Assert.assertEquals(Dates[0], Value);
		ExtentSuccessMessage("User Validate the Assertion Acctual:- "+Dates[0]+" Expected:-"+Value+"");
	}

	public void ValidateCallsDirection(String Value) throws InterruptedException {
		List<WebElement> fields = driver.findElements(By.xpath("//*[contains(@ng-if,'row.entity.Direction.fieldValue===')]"));
		System.out.println("Debug:- "+fields.size());
		int lastIndex =fields.size();
		for(int i=1;i<=lastIndex;i++) {
			By LastDateelement = By.xpath("(//*[contains(@ng-if,'row.entity.Direction.fieldValue===')])["+i+"]");
			String Direction=GetElementText(LastDateelement);
			System.out.println("Direction:- "+Direction);
			Assert.assertEquals(Direction, Value);
			ExtentSuccessMessage("User Validate the Assertion Acctual:- "+Direction+" Expected:-"+Value+"");
		}	

	}

	public void ClickoNInbound() throws InterruptedException {
		By Element = By.xpath("(//h5[contains(text(),'Call Type')]//parent::div//md-checkbox)[1]");
		click(Element);
	}
	public void Clickonoutbound() throws InterruptedException {
		By Element = By.xpath("(//h5[contains(text(),'Call Type')]//parent::div//md-checkbox)[2]");
		click(Element);
	}


	public void ClickonViewAndManageNumbers() throws InterruptedException {
		if (ElementDisplayed(ViewAndManageNumbers)) {
			ExtentSuccessMessage("Successfully user able to See 'View And Manage Numbers Icon' ");
			click(ViewAndManageNumbers);
			ExtentSuccessMessage("Successfully user Clicked on 'View And Manage Numbers Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'View And Manage Numbers Icon' Not visible");
		}
	}

	public void ClickOnMinimizeCallwindow() throws InterruptedException {		
		if (ElementDisplayed(CTIMinimizeIcon)) {
			ExtentSuccessMessage("Successfully user able to See 'Minimize Icon' ");
			click(CTIMinimizeIcon);
			ExtentSuccessMessage("Successfully user Clicked on 'Minimize Icon' ");
		} else {
			ExtentSuccessMessage("Unsuccessfully 'Minimize' Not visible");
		}
		Thread.sleep(3000);
	}
	public void ClickOnemailtab() throws InterruptedException {		
		if (ElementDisplayed(emailtab)) {
			ExtentSuccessMessage("Successfully user able to See 'emailtab Icon' ");
			click(emailtab);
			ExtentSuccessMessage("Successfully user Clicked on 'emailtab Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'emailtab' Not visible");
		}
	}
	public void ClickOnGreentickButton() throws InterruptedException {		
		if (ElementDisplayed(GreentickButton)) {
			ExtentSuccessMessage("Successfully user able to See 'GreentickButton Icon' ");
			click(GreentickButton);
			ExtentSuccessMessage("Successfully user Clicked on 'GreentickButton Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'GreentickButton' Not visible");
		}
	}
	public void ClickOnCallSMSFAXLogsManagement() throws InterruptedException {		
		waitVisibility(CallSMSFAXLogsManagement);
		if (ElementDisplayed(CallSMSFAXLogsManagement)) {
			ExtentSuccessMessage("Successfully user able to See 'CallSMSFAXLogsManagement Icon' ");
			click(CallSMSFAXLogsManagement);
			ExtentSuccessMessage("Successfully user Clicked on 'CallSMSFAXLogsManagement Icon' ");
			Thread.sleep(9000);
		} else {
			ExtentErrorMessage("Unsuccessfully 'CallSMSFAXLogsManagement' Not visible");
		}
	}

	public void ClickOnSMSLogs() throws InterruptedException {		
		waitVisibility(SMSLogs);
		if (ElementDisplayed(SMSLogs)) {
			ExtentSuccessMessage("Successfully user able to See 'SMS Logs Tab' ");
			click(SMSLogs);
			ExtentSuccessMessage("Successfully user Clicked on 'SMS Logs Tab' ");
			Thread.sleep(9000);
		} else {
			ExtentErrorMessage("Unsuccessfully 'CallSMSFAXLogsManagement' Not visible");
		}
	}

	public void VelidateTheOptions() throws InterruptedException {
		Thread.sleep(5000);
		By Elements = By.xpath("//*[@aria-label='Grid Menu']");
		click(Elements);
		Thread.sleep(5000);
		String options = null;
		for (int i = 1; i <= 11; i++) {
			System.out.println(i);
			By Element = By.xpath("(//*[@ng-class='icon'][@aria-hidden='true']//parent::button[contains(@ng-class,'ui-grid-menu-item-active')][@aria-hidden='false'])["+i+"]");
			Thread.sleep(1000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Element));
			String rns =element.getText();
			Thread.sleep(1000);
			options =options+","+rns;
		}
		System.out.println("debug:- "+options);

	}
	public void EnterEmail(String value) throws InterruptedException {		
		if (ElementDisplayed(EnterEmail)) {
			ExtentSuccessMessage("Successfully user able to See 'EnterEmail Icon' ");
			input(EnterEmail,value+";");
			ExtentSuccessMessage("Successfully user entered the 'EnterEmail in emial field' "+value);
		} else {
			ExtentErrorMessage("Unsuccessfully 'EnterEmail' Not visible");
		}
	}

	public void EnterEmailSubject(String value) throws InterruptedException {		
		if (ElementDisplayed(EnterEmailSubject)) {
			ExtentSuccessMessage("Successfully user able to See 'EnterEmailSubject Icon' ");
			input(EnterEmailSubject,value);
			ExtentSuccessMessage("Successfully user entered the 'EnterEmailSubject in Subject field' "+value);
		} else {
			ExtentErrorMessage("Unsuccessfully 'EnterEmailSubject' Not visible");
		}
	}
	public void EnterEmailMessage(String value) throws InterruptedException {		
		if (ElementDisplayed(EnterEmailMessage)) {
			ExtentSuccessMessage("Successfully user able to See 'EnterEmailMessage Icon' ");
			input(EnterEmailMessage,value);
			ExtentSuccessMessage("Successfully user entered the 'EnterEmailMessage in massage field' "+value);
		} else {
			ExtentErrorMessage("Unsuccessfully 'EnterEmailMessage' Not visible");
		}
	}
	public void EnterSearchBar(String value) throws InterruptedException {	
		Thread.sleep(8000);
		if (ElementDisplayed(SearchBar)) {
			ExtentSuccessMessage("Successfully user able to See 'SearchBar Icon' ");
			writeText(SearchBar,value+Keys.ENTER);
			ExtentSuccessMessage("Successfully user entered the 'SearchBar in Search field' "+value);
		} else {
			ExtentErrorMessage("Unsuccessfully 'SearchBar' Not visible");
		}
	}
	public void EnterCallCreatedDateFrom(String value) throws InterruptedException {		
		if (ElementDisplayed(CallCreatedDateFrom)) {
			ExtentSuccessMessage("Successfully user able to See 'CallCreatedDateFrom Icon' ");
			writeText(CallCreatedDateFrom,value+Keys.ENTER);
			ExtentSuccessMessage("Successfully user entered the 'CallCreatedDateFrom in Date field' "+value);
		} else {
			ExtentErrorMessage("Unsuccessfully 'CallCreatedDateFrom' Not visible");
		}
	}
	public void EnterCallCreatedDateTo(String value) throws InterruptedException {		
		if (ElementDisplayed(CallCreatedDateTo)) {
			ExtentSuccessMessage("Successfully user able to See 'CallCreatedDateTo Icon' ");
			writeText(CallCreatedDateTo,value+Keys.ENTER);
			ExtentSuccessMessage("Successfully user entered the 'CallCreatedDateTo in Date field' "+value);
		} else {
			ExtentErrorMessage("Unsuccessfully 'CallCreatedDateTo' Not visible");
		}
	}
	public void EnterCallGroupname(String value) throws InterruptedException {		
		if (ElementDisplayed(CallGroupname)) {
			ExtentSuccessMessage("Successfully user able to See 'Call Groupname Icon' ");
			writeText(CallGroupname,value+Keys.ENTER);
			ExtentSuccessMessage("Successfully user entered the 'CallGroupname in text field' "+value);
		} else {
			ExtentErrorMessage("Unsuccessfully 'Call Groupname' Not visible");
		}
	}



	public void ClickOnCallTypeFilter() throws InterruptedException {	
		Thread.sleep(9000);
		WaitUntillPAgeLoad();
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CallTypeFilter));
		waitVisibility(CallTypeFilter);
		if (ElementDisplayed(CallTypeFilter)) {
			ExtentSuccessMessage("Successfully user able to See 'CallTypeFilter Icon' ");
			Thread.sleep(9000);
			waitVisibility(CallTypeFilter);
			Thread.sleep(9000);
			click(CallTypeFilter);
			ExtentSuccessMessage("Successfully user Clicked on 'CallTypeFilter Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'CallTypeFilter' Not visible");
		}
	}

	public void ClickOnSMSTypeFilter() throws InterruptedException {	
		Thread.sleep(5000);
		if (ElementDisplayed(SMSTypeFilter)) {
			ExtentSuccessMessage("Successfully user able to See 'SMSTypeFilter Icon' ");
			click(SMSTypeFilter);
			ExtentSuccessMessage("Successfully user Clicked on 'SMSTypeFilter Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'SMSTypeFilter' Not visible");
		}
	}


	public void ClickOnAdvanceSearchBtn() throws InterruptedException {	
		Thread.sleep(5000);
		if (ElementDisplayed(AdvancedSearchBtn)) {
			ExtentSuccessMessage("Successfully user able to See 'AdvancedSearchBtn Icon' ");
			click(AdvancedSearchBtn);
			ExtentSuccessMessage("Successfully user Clicked on 'AdvancedSearchBtn Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'AdvancedSearchBtn' Not visible");
		}
	}

	public void ClickOnRecentCalltypeFilter() throws InterruptedException {	
		Thread.sleep(5000);
		if (ElementDisplayed(RecentCallsFilter)) {
			ExtentSuccessMessage("Successfully user able to See 'RecentCallsFilter Icon' ");
			click(RecentCallsFilter);
			ExtentSuccessMessage("Successfully user Clicked on 'RecentCallsFilter Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'RecentCallsFilter' Not visible");
		}
	}

	public void ClickOnAdvanceFiltersearchButton() throws InterruptedException {	
		Thread.sleep(5000);
		if (ElementDisplayed(AdvanceFiltersearchButton)) {
			ExtentSuccessMessage("Successfully user able to See 'AdvanceFiltersearchButton Icon' ");
			click(AdvanceFiltersearchButton);
			ExtentSuccessMessage("Successfully user Clicked on 'AdvanceFiltersearchButton Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'AdvanceFiltersearchButton' Not visible");
		}
	}

	public void Validate_the_Call_direction() throws InterruptedException {

		Thread.sleep(5000);
		String rns = null;
		String rn = null;
		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
			By Element = By.xpath("(//h5[contains(text(),'Call Type')]//parent::div//md-checkbox)["+i+"]");
			Thread.sleep(1000);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(Element));
			rns =element.getAttribute("name");
			Thread.sleep(1000);
			System.out.println("debug:- "+rns);
			click(Element);
			for (int j=0; j<=1; j++) {

				By Elements = By.xpath("(//*[contains(@ng-if,'row.entity.Direction.fieldValue===')])[1]");
				Thread.sleep(1000);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(Elements));
				rn =element.getText();
				Thread.sleep(1000);
				System.out.println("debug:- "+rn);
			}
			Thread.sleep(5000);
			click(Element);
			if(rns.contains(rn)) {
				ExtentSuccessMessage("Successfully user able to See '"+rn+"'inside the call Direction ");
				System.out.println("Successfully user able to See '"+rn+"'inside the call Direction ");
			}
		}
	}

	public void ValidateFirstFromMobileNo() {
		By  fromNoElements = By.xpath("//*[contains(@class,'0009')]//*[contains(text(),'(')][@class='ng-binding ng-scope']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(fromNoElements));
		String FromNumber =element.getText();
		String cleanedNumber = FromNumber.replaceAll("[\\s()-]", "");
		System.out.println("Original phone number: " + FromNumber);
		System.out.println("Cleaned phone number: " + cleanedNumber);
		if (cleanedNumber.matches("\\d{10}")) {
			System.out.println("Valid phone number format (10 digits)");
			ExtentSuccessMessage("Valid phone number format (10 digits) inside the from field "+cleanedNumber);
		} else {
			System.out.println("Invalid phone number format");
			ExtentErrorMessage("Invalid phone number format");
		}
	}


	public void ValidateTheFirstFromMobileNo(String Value) {
		By  fromNoElements = By.xpath("//*[contains(@class,'0009')]//*[contains(text(),'(')][@class='ng-binding ng-scope']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(fromNoElements));
		String FromNumber =element.getText();
		String cleanedNumber = FromNumber.replaceAll("[\\s()-]", "");
		System.out.println("Original phone number: " + FromNumber);
		System.out.println("Cleaned phone number: " + cleanedNumber);
		String cleanedNumber1 = Value.replaceAll("[\\s()-]", "");
		Assert.assertEquals(cleanedNumber1, cleanedNumber);
		ExtentSuccessMessage("Successfully user able to See the phone number in From list");
	}
	public void ValidateTheFirstToMobileNo(String Value) {
		By  fromNoElements = By.xpath("//*[contains(@class,'000A')]//*[contains(text(),'(')][@class='ng-binding ng-scope']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(fromNoElements));
		String FromNumber =element.getText();
		String cleanedNumber = FromNumber.replaceAll("[\\s()-]", "");
		System.out.println("Original phone number: " + FromNumber);
		System.out.println("Cleaned phone number: " + cleanedNumber);
		String cleanedNumber1 = Value.replaceAll("[\\s()-]", "");
		Assert.assertEquals(cleanedNumber1, cleanedNumber);
		ExtentSuccessMessage("Successfully user able to See the phone number in To list");
	}


	public void ValidateFirstToMobileNo() {
		By  fromNoElements = By.xpath("//*[contains(@class,'000A')]//*[contains(text(),'(')][@class='ng-binding ng-scope']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(fromNoElements));
		String FromNumber =element.getText();
		String cleanedNumber = FromNumber.replaceAll("[\\s()-]", "");
		System.out.println("Original phone number: " + FromNumber);
		System.out.println("Cleaned phone number: " + cleanedNumber);
		if (cleanedNumber.matches("\\d{10}")) {
			System.out.println("Valid phone number format (10 digits)");
			ExtentSuccessMessage("Valid phone number format (10 digits) inside the To field "+cleanedNumber);
		} else {
			System.out.println("Invalid phone number format");
			ExtentErrorMessage("Invalid phone number format");
		}
	}
	public void gotoendpage() throws InterruptedException {
		if(ElementDisplayeds(NextpageDesible)) {	
		}else {
			do {
				Thread.sleep(4000);
				click(Nextpage);  
			} while (!ElementDisplayeds(NextpageDesible));
			System.out.println("");
			if(ElementDisplayed(NodatafoundPage)) {
				click(Previouspage);
				Thread.sleep(3000);
			}
		}

	}	


	public void NavigateToGroupCallPage() throws InterruptedException {
		hoverOnAdminModule();
		ClickOnTelephonySetp();
		ClickOnGroupCallsTab();
	}
	public void SelectCallGroupnumber () throws InterruptedException {
		click(CallGroupNumber);
		Thread.sleep(2000);
		Groupnumber = GetElementText(Gruopnumberfirst);
		click(Gruopnumberfirst);
		//		SelectActiveDropdown(CallGroupNumber,Groupnumber);
		ExtentSuccessMessage("Successfully user Selected the 'Group Number ' "+Groupnumber);
	}

	public void ClickOnBoardcastOption() throws InterruptedException {
		if (ElementDisplayed(BoardcastOption)) {
			ExtentSuccessMessage("Successfully user able to See 'Board casting Checkbox' ");
			click(BoardcastOption);
			ExtentSuccessMessage("Successfully user Clicked on 'Board casting Checkbox' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'Board casting Checkbox' Not visible");
		}
	}

	public void ClickOnBestFitOption() throws InterruptedException {
		if (ElementDisplayed(BestFitOption)) {
			ExtentSuccessMessage("Successfully user able to See 'Best Fit Checkbox' ");
			click(BestFitOption);
			ExtentSuccessMessage("Successfully user Clicked on 'Best Fit Checkbox' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'Best Fit Checkbox' Not visible");
		}
	}
	

	public void ClickOnCallIcon() throws InterruptedException {
		if (ElementDisplayed(CallIcon)) {
			ExtentSuccessMessage("Successfully user able to See 'Call Icon' ");
			click(CallIcon);
			ExtentSuccessMessage("Successfully user Clicked on 'Call Icon' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'Call Icon' Not visible");
		}
	}

	public void ClickOnNextButton() throws InterruptedException {
		if (ElementDisplayed(NextButton)) {
			ExtentSuccessMessage("Successfully user able to See 'Next Button' ");
			click(NextButton);
			ExtentSuccessMessage("Successfully user Clicked on 'Next Button' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'Next Button' Not visible");
		}
	}

	public void ClickOnDoneButton() throws InterruptedException {
		if (ElementDisplayed(DoneButton)) {
			ExtentSuccessMessage("Successfully user able to See 'Done Button' ");
			click(DoneButton);
			ExtentSuccessMessage("Successfully user Clicked on 'Done Button' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'Done Button' Not visible");
		}
	}

	public void ClickOnCallGrouptab() throws InterruptedException {
		if (ElementDisplayed(CallGrouptab)) {
			ExtentSuccessMessage("Successfully user able to See 'Call Group tab Button' ");
			click(CallGrouptab);
			ExtentSuccessMessage("Successfully user Clicked on'Call Group tab Button' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'Call Group tab Button' Not visible");
		}
	}

	public void ClickOnCloseCallGrouptab() throws InterruptedException {
		if (ElementDisplayed(CloseGroupTab)) {
			ExtentSuccessMessage("Successfully user able to See 'Close Call Group tab Button' ");
			click(CloseGroupTab);
			ExtentSuccessMessage("Successfully user Clicked on'Close Call Group tab Button' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'Close Call Group tab Button' Not visible");
		}
	}
	public void ClickOnNextPageCallGrouptab() throws InterruptedException {
		if (ElementDisplayed(NextPAgeGroupcallTab)) {
			By TotalPageOCunt =By.xpath("//*[@class='current-count']//span[@class='ng-binding']");
			String Pagecount = GetElementText(TotalPageOCunt);
			System.out.println("Pagecount:- "+Pagecount);
			String[] parts = Pagecount.split("f", 2);
			System.out.println("After 1: " + parts[1]);
			ExtentSuccessMessage("Successfully user able to See 'Next Call Group tab Button' ");
			if(parts[1].equals(" 1")) {
				System.out.println(1+" 1");
				ExtentSuccessMessage("User have only one page ");
			}else {
				System.out.println(2+"2");
				click(NextPAgeGroupcallTab);
				ExtentSuccessMessage("Successfully user Clicked on'Close Call Group tab Button' ");
			}
			
		} else {
			ExtentErrorMessage("Unsuccessfully 'Close Call Group tab Button' Not visible");
		}
	}
	public void ClickOnPreviousPageCallGrouptab() throws InterruptedException {
		if (ElementDisplayed(PreviousPAgeGroupcallTab)) {
			By TotalPageOCunt =By.xpath("//*[@class='current-count']//span[@class='ng-binding']");
			By PageOCunt =By.xpath("//*[@class='current-count']//span[@class='ng-binding']");
			String Pagecount = GetElementText(TotalPageOCunt);
			String Curentpagecount =GetElementText(PageOCunt);
			System.out.println("Pagecount:- "+Pagecount);
			System.out.println("Curentpagecount:-"+Curentpagecount);
			String[] parts = Pagecount.split("f", 2);
			System.out.println("After 1: " + parts[1]);
			ExtentSuccessMessage("Successfully user able to See 'Previous Call Group tab Button' ");
			if(parts[1].trim().equals("1")) {
				System.out.println(1+" 1");
				ExtentSuccessMessage("User are on 1st page");
			}else {
				System.out.println(2+"2");
				click(PreviousPAgeGroupcallTab);
				ExtentSuccessMessage("Successfully user Clicked On 'Previous Call Group tab Button' ");
			}
			
		} else {
			ExtentErrorMessage("Unsuccessfully 'Close Call Group tab Button' Not visible");
		}
	}
	
	
	

	public void ClickOnRefreshCallGroupTab() throws InterruptedException {
		if (ElementDisplayed(RefreshCallGroupTab)) {
			ExtentSuccessMessage("Successfully user able to See 'Refresh Call Group tab Button' ");
			click(RefreshCallGroupTab);
			ExtentSuccessMessage("Successfully user Clicked on' Refresh Call Group tab Button' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'Refresh Call Group tab Button' Not visible");
		}
	}

	public void ClickOnRememberthepreference() throws InterruptedException {
		if (ElementDisplayed(Rememberthepreference)) {
			ExtentSuccessMessage("Successfully user able to See 'Remember the preference Check Box' ");
			WebElement t = driver.findElement(Rememberthepreference1);
			String CheckBoxSTtaus = t.getAttribute("aria-checked");
			System.out.println("CheckBoxSTtaus :- "+CheckBoxSTtaus);
			if(CheckBoxSTtaus.equals("true")) {
				ExtentSuccessMessage(" 'Remember the preference Check Box' is already checked ");
				click(Rememberthepreference);
				ExtentSuccessMessage("Successfully user Clicked on 'Remember the preference Check Box' and unchecked ");
				Thread.sleep(3000);
				String Popupmsg=GetElementText(RememberThePreferencePopup);
				System.out.println("Popupmsg:- "+Popupmsg);
				click(Rememberthepreference);
				ExtentSuccessMessage("Successfully user Clicked on 'Remember the preference Check Box' and checked ");
				Thread.sleep(2000);
				String Popupmsg1=GetElementText(RememberThePreferencePopup);
				System.out.println("Popupmsg:- "+Popupmsg1);
			}else{
				click(Rememberthepreference);
				ExtentSuccessMessage("Successfully user Clicked on 'Remember the preference Check Box' and checked ");
				Thread.sleep(2000);
				String Popupmsg=GetElementText(RememberThePreferencePopup);
				System.out.println("Popupmsg:- "+Popupmsg);
			}
		} else {
			ExtentErrorMessage("Unsuccessfully 'Remember the preference Check Box' Not visible");
		}
	}
	
	public void ClickOnRinglessCheckBox() throws InterruptedException {
		if (ElementDisplayed(RinglessCheckBox)) {
			ExtentSuccessMessage("Successfully user able to See 'Ring Less Check Box' ");
			WebElement t = driver.findElement(RinglessCheckBox1);
			String CheckBoxSTtaus = t.getAttribute("aria-checked");
			System.out.println("CheckBoxSTtaus :- "+CheckBoxSTtaus);
			if(CheckBoxSTtaus.equals("true")) {
				ExtentSuccessMessage(" 'Ring Less Check Box' is already checked ");
				click(RinglessCheckBox);
				ExtentSuccessMessage("Successfully user Clicked on 'Ring Less Check Box' and unchecked ");
				Thread.sleep(3000);
				click(RinglessCheckBox);
				ExtentSuccessMessage("Successfully user Clicked on 'Ring Less Check Box' and checked ");
			}else{
				click(RinglessCheckBox);
				ExtentSuccessMessage("Successfully user Clicked on 'Ring Less Check Box' and checked ");				
			}
		} else {
			ExtentErrorMessage("Unsuccessfully 'Ring Less Check Box' Not visible");
		}
	}
	
	

	public void ClickOnIncomingCallNotification() throws InterruptedException {
		if (ElementDisplayed(IncomingCallNotification)) {
			ExtentSuccessMessage("Successfully user able to See 'Incoming Call Notification' ");
			click(IncomingCallNotification);
			ExtentSuccessMessage("Successfully user Clicked on 'Incoming Call Notification' ");
		} else {
//			ExtentErrorMessage("Unsuccessfully 'Incoming Call Notification' Not visible");
			waitVisibility(IncomingCallNotification);
			if (ElementDisplayed(IncomingCallNotification)) {
				ExtentSuccessMessage("Successfully user able to See 'Incoming Call Notification' ");
				click(IncomingCallNotification);
				ExtentSuccessMessage("Successfully user Clicked on 'Incoming Call Notification' ");
			} else {
				ExtentErrorMessage("Unsuccessfully 'Incoming Call Notification' Not visible");
			}
		}
	}
	public void ClickOffbutton(String Value) throws InterruptedException {
		Thread.sleep(8000);
		By Element =By.xpath("//*[text()='"+Value+"']//ancestor::tr//*[@class='glyphicon fa fa-toggle-on ng-scope']");
		
		if(ElementDisplayed(Element)) {
			ExtentSuccessMessage("Successfully user able to See 'On Switch' ");
			click(Element);
			ExtentSuccessMessage("Successfully user Clicked on ' Off Switch' ");
		}else {
			
		}
	}

	public void ClickOnOnorOffSwitch(String Value) throws InterruptedException {
		Thread.sleep(8000);
		By Options =By.xpath("//*[text()='"+Value+"']//ancestor::tr//*[@ng-click='CTICtrl.switchOnOrOffGroup(callGroup)']");
		By Element =By.xpath("//*[text()='"+Value+"']//ancestor::tr//*[@class='glyphicon fa fa-toggle-on ng-scope']");
//		waitVisibility(Element);
		if(ElementDisplayed(Element)) {
			ExtentSuccessMessage("Successfully user able to See 'On Switch' ");
		}else {			
			if (ElementDisplayed(Options)) {
				ExtentSuccessMessage("Successfully user able to See 'On or Off Switch' ");
				click(Options);
				ExtentSuccessMessage("Successfully user Clicked on 'On or Off Switch' ");
			} else {
				ExtentErrorMessage("Unsuccessfully 'On or Off Switch' Not visible");
			}
		}
		Thread.sleep(8000);
		By minimize =By.xpath("//*[@title='Minimize']");
		if (ElementDisplayed(minimize)) {
			ExtentSuccessMessage("Successfully user able to See 'minimize button' ");
			click(minimize);
			ExtentSuccessMessage("Successfully user Clicked on 'minimize button' ");
		} else {
			ExtentErrorMessage("Unsuccessfully 'minimize button' Not visible");
		}
	}




	public void EnterCallGroupmembername(String value) throws InterruptedException {		
		if (ElementDisplayed(GroupmemberName)) {
			ExtentSuccessMessage("Successfully user able to See 'Call Groupname Icon' ");
			cleartextField(GroupmemberName);
			writeText(GroupmemberName,value);
			click(Memberfromgrid);
			ExtentSuccessMessage("Successfully user entered the 'CallGroupname in text field' "+value);
		} else {
			ExtentErrorMessage("Unsuccessfully 'Call Groupname' Not visible");
		}
	}


}