package com.test;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;
import com.pages.CensusInfo;

import Common.TriggerEmail;

public class AllScenarios_EG_TC extends Base_Class {
	TestListener TestListener;
	Base_Class Base_Class;
	//	public static com.pages.HomePage homepage;
	// HomePage homepage;
	Log log;
	com.Utility.ScreenShot screenShot;
	com.Utility.ExcelReader ExcelReader;

	// NavigateNewClaim NewClaim = new NavigateNewClaim();
	@Override
	public WebDriver getDriver() {
		//		homepage = new com.pages.HomePage(driver);
		return driver;
	}

	// Batch Reserve Approval
	TC_CTI_AdminSMS_Call_Fax_Tab_Validation_Missed_call_to_Agent TC_CTI_AdminSMS_Call_Fax_Tab_Validation_Missed_call_to_Agent;
	DashBoard_Filters_Configurations_Grids DashBoard_Filters_Configurations_Grids;
	TC_CTI_AdminSMS_Call_Fax_Tab_Validation_SMS_MMS_Inbound_Outbound TC_CTI_AdminSMS_Call_Fax_Tab_Validation_SMS_MMS_Inbound_Outbound;
	CTI_Console_Available_Offline_Custom CTI_Console_Available_Offline_Custom;
	TC_CE_010_CTI_Inbound_calls_forwarding_option TC_CE_010_CTI_Inbound_calls_forwarding_option;
	TC_CTI_Messages_Tab_Validations TC_CTI_Messages_Tab_Validations;
	TC_CTI_MissedCall_Tab_Validation TC_CTI_MissedCall_Tab_Validation;
	TC_CTI_Recordings_Tab_Validation TC_CTI_Recordings_Tab_Validation;
	TC_CTI_Call_Logs_Tab_Validation TC_CTI_Call_Logs_Tab_Validation;
	TC_CTI_Call_ON_Call_Validation TC_CTI_Call_ON_Call_Validation;
	CTI_Console_VoiceMailTab_Validation CTI_Console_VoiceMailTab_Validation;
	TC_CTI_Voicemail_To_Agent TC_CTI_Voicemail_To_Agent;
	TC_CTI_SMS_MMS_Inbound_CTI_Logs_Status_SSE_notification_Status_Email_notifiation_Status TC_CTI_SMS_MMS_Inbound_CTI_Logs_Status_SSE_notification_Status_Email_notifiation_Status;
	TC_Inbound_Admin_Call_Log_Transfer_Online_Offline TC_Inbound_Admin_Call_Log_Transfer_Online_Offline;
	TC_Inbound_Admin_Call_Log_Transfer_BRB_Custom_Message TC_Inbound_Admin_Call_Log_Transfer_BRB_Custom_Message;
	TC_Oubtbound_Admin_Call_Log_Transfer_Online_Offline TC_Oubtbound_Admin_Call_Log_Transfer_Online_Offline;
	TC_Oubtbound_Admin_Call_Log_Transfer_BRB_Custom TC_Oubtbound_Admin_Call_Log_Transfer_BRB_Custom;
	TC_CTI_BC_Transfer_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs TC_CTI_BC_Transfer_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs;
	TC_Inbound_Call_Barge_Monitor_Whisper TC_Inbound_Call_Barge_Monitor_Whisper;
	TC_Outbound_Call_Barge_Monitor_Whisper TC_Outbound_Call_Barge_Monitor_Whisper;
	TC_CTI_BC_Barge_Monitor_Whisper TC_CTI_BC_Barge_Monitor_Whisper;
	TC_CTI_RR_Barge_Monitor_Whisper TC_CTI_RR_Barge_Monitor_Whisper;
	TC_CTI_Call_Group_Tab_Validation TC_CTI_Call_Group_Tab_Validation;
	TC_CTI_BF_RG_Transfer_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs TC_CTI_BF_RG_Transfer_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs;
	TC_CTI_BF_RG_Transfer_To_Agent_BeRight_Back_Activity_Status_Admin_call_logs_CTI_call_logs TC_CTI_BF_RG_Transfer_To_Agent_BeRight_Back_Activity_Status_Admin_call_logs_CTI_call_logs;
	TC_CTI_BF_RL_Barge_Monitor_Whisper TC_CTI_BF_RL_Barge_Monitor_Whisper;
	TC_CTI_BF_RG_Transfer_to_Agent_Offline_Activity_Status_Admin_call_logs_CTI_call_logs TC_CTI_BF_RG_Transfer_to_Agent_Offline_Activity_Status_Admin_call_logs_CTI_call_logs;	
	TC_CTI_BF_RG_Barge_Monitor_Whisper TC_CTI_BF_RG_Barge_Monitor_Whisper;
	TC_CTI_BF_RL_Transfer_To_Agent TC_CTI_BF_RL_Transfer_To_Agent;
	TC_CTI_CallDisposition_Popup_CallDisconnected TC_CTI_CallDisposition_Popup_CallDisconnected;
	TC_CTI_CallDisposition_Popup_NotASale TC_CTI_CallDisposition_Popup_NotASale;
	TC_CTI_CallDisposition_Popup_CallBack TC_CTI_CallDisposition_Popup_CallBack;
	TC_CTI_CallDisposition_Popup_Call_Transfer TC_CTI_CallDisposition_Popup_Call_Transfer;
	TC_CTI_CallDisposition_Popup_Call_Transfer_Outbound TC_CTI_CallDisposition_Popup_Call_Transfer_Outbound;
	TC_CTI_CallDisposition_Validation_Mandatory_Fields TC_CTI_CallDisposition_Validation_Mandatory_Fields;
	TC_CTI_CallDisposition_Validation_Non_Mandatory_Fields TC_CTI_CallDisposition_Validation_Non_Mandatory_Fields;
	TC_CTI_CallDisposition_Validation_Disposition_Dropdown TC_CTI_CallDisposition_Validation_Disposition_Dropdown;
	TC_CTI_CallDisposition_Validation_Inbound_Call_Transfer TC_CTI_CallDisposition_Validation_Inbound_Call_Transfer;
	TC_CTI_CallDisposition_Validation_Outbound_Call_Transfer TC_CTI_CallDisposition_Validation_Outbound_Call_Transfer;
	TC_CTI_CallScript_BrodCasting TC_CTI_CallScript_BrodCasting;
	TC_CTI_CallScript_BestFit_RingLess TC_CTI_CallScript_BestFit_RingLess;
	TC_CTI_CallScript_RoundRobin TC_CTI_CallScript_RoundRobin;
	TC_CTI_CallScript_Assign_to_Agent TC_CTI_CallScript_Assign_to_Agent;

	///asif//
	TC_CTI_Conference_Online_Admin_CallLogs TC_CTI_Conference_Online_Admin_CallLogs;
	TC_CTI_Conference_Custome_Admin_CallLogs TC_CTI_Conference_Custome_Admin_CallLogs;
	TC_CTI_Conference_BeRight_Back_Admin_CallLogs_CTI_Logs TC_CTI_Conference_BeRight_Back_Admin_CallLogs_CTI_Logs;
	TC_CTI_Conference_Offline_Admin_CallLogs_CTI_Logs TC_CTI_Conference_Offline_Admin_CallLogs_CTI_Logs;
	TC_CTI_Outbound_Conference_Offline_Admin_CallLogs_CTI_Logs TC_CTI_Outbound_Conference_Offline_Admin_CallLogs_CTI_Logs;
	TC_CTI_Outbound_Conference_BeRight_Back_Admin_CallLogs_CTI_Logs TC_CTI_Outbound_Conference_BeRight_Back_Admin_CallLogs_CTI_Logs;
	TC_CTI_BF_RL_Conference_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs TC_CTI_BF_RL_Conference_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs;
	TC_CTI_BF_RG_Conference_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs TC_CTI_BF_RG_Conference_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs;
	TC_CTI_Outbound_Conference_Custom_Status TC_CTI_Outbound_Conference_Custom_Status;
	TC_CTI_Outbound_Conference TC_CTI_Outbound_Conference;





	// By.xpath("//body/div[@id='banner']/div[@id='rightMenu']/ul[1]/li[3]/i[1]");
	By signInButtonClass = By.className("btnSignIn");
	By signout = By.xpath("//a[@class=\"dropdownMenu user-details-menuSection dropdownArrowMenu\"]");
	By signoutbtn = By.xpath("//*[@id='dropdownMenuListSec']//a[contains(text(),'Sign Out')]");
	By signoutInshura = By.xpath("//div[@class=\"signoutsec\"]");

	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("PLCA");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();


		TC_CTI_AdminSMS_Call_Fax_Tab_Validation_SMS_MMS_Inbound_Outbound =new TC_CTI_AdminSMS_Call_Fax_Tab_Validation_SMS_MMS_Inbound_Outbound();
		TC_CTI_AdminSMS_Call_Fax_Tab_Validation_Missed_call_to_Agent =new TC_CTI_AdminSMS_Call_Fax_Tab_Validation_Missed_call_to_Agent();
		DashBoard_Filters_Configurations_Grids = new DashBoard_Filters_Configurations_Grids();
		CTI_Console_VoiceMailTab_Validation = new CTI_Console_VoiceMailTab_Validation();
		CTI_Console_Available_Offline_Custom = new CTI_Console_Available_Offline_Custom();
		TC_CTI_RR_Barge_Monitor_Whisper = new TC_CTI_RR_Barge_Monitor_Whisper();
		TC_CE_010_CTI_Inbound_calls_forwarding_option = new TC_CE_010_CTI_Inbound_calls_forwarding_option();
		TC_CE_010_CTI_Inbound_calls_forwarding_option = new TC_CE_010_CTI_Inbound_calls_forwarding_option();	
		TC_CTI_MissedCall_Tab_Validation = new TC_CTI_MissedCall_Tab_Validation();
		TC_CTI_Recordings_Tab_Validation =new TC_CTI_Recordings_Tab_Validation();
		TC_CTI_Messages_Tab_Validations = new TC_CTI_Messages_Tab_Validations();
		TC_CTI_BF_RL_Transfer_To_Agent = new TC_CTI_BF_RL_Transfer_To_Agent();
		TC_CTI_Call_ON_Call_Validation = new TC_CTI_Call_ON_Call_Validation();
		TC_CTI_Voicemail_To_Agent = new TC_CTI_Voicemail_To_Agent();
		TC_CTI_Call_Logs_Tab_Validation = new TC_CTI_Call_Logs_Tab_Validation();
		TC_CTI_CallScript_BrodCasting = new TC_CTI_CallScript_BrodCasting();
		TC_CTI_CallScript_BestFit_RingLess = new TC_CTI_CallScript_BestFit_RingLess();
		TC_CTI_CallScript_RoundRobin = new TC_CTI_CallScript_RoundRobin();
		TC_CTI_SMS_MMS_Inbound_CTI_Logs_Status_SSE_notification_Status_Email_notifiation_Status = new TC_CTI_SMS_MMS_Inbound_CTI_Logs_Status_SSE_notification_Status_Email_notifiation_Status();
		TC_Inbound_Admin_Call_Log_Transfer_Online_Offline = new TC_Inbound_Admin_Call_Log_Transfer_Online_Offline();
		TC_Inbound_Admin_Call_Log_Transfer_BRB_Custom_Message = new TC_Inbound_Admin_Call_Log_Transfer_BRB_Custom_Message();
		TC_Oubtbound_Admin_Call_Log_Transfer_Online_Offline = new TC_Oubtbound_Admin_Call_Log_Transfer_Online_Offline();
		TC_Inbound_Call_Barge_Monitor_Whisper = new TC_Inbound_Call_Barge_Monitor_Whisper();
		TC_Outbound_Call_Barge_Monitor_Whisper = new TC_Outbound_Call_Barge_Monitor_Whisper();
		TC_Oubtbound_Admin_Call_Log_Transfer_BRB_Custom = new TC_Oubtbound_Admin_Call_Log_Transfer_BRB_Custom();


		TC_CTI_BC_Transfer_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs =new TC_CTI_BC_Transfer_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs();
		TC_CTI_BC_Barge_Monitor_Whisper = new TC_CTI_BC_Barge_Monitor_Whisper();
		TC_CTI_Call_Group_Tab_Validation =new TC_CTI_Call_Group_Tab_Validation();
		TC_CTI_BF_RG_Transfer_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs =new TC_CTI_BF_RG_Transfer_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs();
		TC_CTI_BF_RG_Transfer_To_Agent_BeRight_Back_Activity_Status_Admin_call_logs_CTI_call_logs =new TC_CTI_BF_RG_Transfer_To_Agent_BeRight_Back_Activity_Status_Admin_call_logs_CTI_call_logs();
		TC_CTI_BF_RL_Barge_Monitor_Whisper = new TC_CTI_BF_RL_Barge_Monitor_Whisper();
		TC_CTI_BF_RG_Transfer_to_Agent_Offline_Activity_Status_Admin_call_logs_CTI_call_logs = new TC_CTI_BF_RG_Transfer_to_Agent_Offline_Activity_Status_Admin_call_logs_CTI_call_logs();
		TC_CTI_BF_RG_Barge_Monitor_Whisper = new TC_CTI_BF_RG_Barge_Monitor_Whisper();

		TC_CTI_CallDisposition_Popup_CallDisconnected = new TC_CTI_CallDisposition_Popup_CallDisconnected();
		TC_CTI_CallDisposition_Popup_NotASale = new TC_CTI_CallDisposition_Popup_NotASale();
		TC_CTI_CallDisposition_Popup_CallBack = new TC_CTI_CallDisposition_Popup_CallBack();
		TC_CTI_CallDisposition_Popup_Call_Transfer = new TC_CTI_CallDisposition_Popup_Call_Transfer();
		TC_CTI_CallDisposition_Popup_Call_Transfer_Outbound = new TC_CTI_CallDisposition_Popup_Call_Transfer_Outbound();
		TC_CTI_CallDisposition_Validation_Mandatory_Fields = new TC_CTI_CallDisposition_Validation_Mandatory_Fields();
		TC_CTI_CallDisposition_Validation_Non_Mandatory_Fields = new TC_CTI_CallDisposition_Validation_Non_Mandatory_Fields();
		TC_CTI_CallDisposition_Validation_Disposition_Dropdown = new TC_CTI_CallDisposition_Validation_Disposition_Dropdown();
		TC_CTI_CallDisposition_Validation_Inbound_Call_Transfer = new TC_CTI_CallDisposition_Validation_Inbound_Call_Transfer();
		TC_CTI_CallDisposition_Validation_Outbound_Call_Transfer = new TC_CTI_CallDisposition_Validation_Outbound_Call_Transfer();

		TC_CTI_CallScript_Assign_to_Agent = new TC_CTI_CallScript_Assign_to_Agent();

		//asif 
		TC_CTI_Conference_Online_Admin_CallLogs =new TC_CTI_Conference_Online_Admin_CallLogs();
		TC_CTI_Conference_BeRight_Back_Admin_CallLogs_CTI_Logs = new TC_CTI_Conference_BeRight_Back_Admin_CallLogs_CTI_Logs();
		TC_CTI_Conference_Custome_Admin_CallLogs =new TC_CTI_Conference_Custome_Admin_CallLogs();
		TC_CTI_Conference_Offline_Admin_CallLogs_CTI_Logs= new TC_CTI_Conference_Offline_Admin_CallLogs_CTI_Logs();
		TC_CTI_Outbound_Conference_Offline_Admin_CallLogs_CTI_Logs = new TC_CTI_Outbound_Conference_Offline_Admin_CallLogs_CTI_Logs();
		TC_CTI_Outbound_Conference_BeRight_Back_Admin_CallLogs_CTI_Logs = new TC_CTI_Outbound_Conference_BeRight_Back_Admin_CallLogs_CTI_Logs();
		TC_CTI_BF_RL_Conference_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs =new TC_CTI_BF_RL_Conference_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs();
		TC_CTI_BF_RG_Conference_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs = new TC_CTI_BF_RG_Conference_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs();
		TC_CTI_Outbound_Conference_Custom_Status =new TC_CTI_Outbound_Conference_Custom_Status();
		TC_CTI_Outbound_Conference =new TC_CTI_Outbound_Conference();
	}

	//	public void Login() throws InterruptedException {
	//		String ReferenceLogin = "PLCA";
	//		try {
	//			Base_Class.SetUp(ReferenceLogin);
	//			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
	//			Log.info("Login successful !");
	//			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
	//			// Application URL ");
	//			
	//		} catch (IOException e) {
	//			e.printStackTrace();
	//		} catch (InterruptedException e) {
	//			e.printStackTrace();
	//		}
	//	}

	public void LoginCustomerEngage() throws InterruptedException {
		String ReferenceLogin = "PLCA";
		try {
			Base_Class.SetUpRegression(ReferenceLogin);
			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
			Log.info("Login successful !");
			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
			// Application URL ");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	public void SetUpRegressionForCall() throws InterruptedException {
		String ReferenceLogin = "PLCA";
		try {
			Base_Class.SetUpRegressionForCall(ReferenceLogin);
			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
			Log.info("Login successful !");
			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
			// Application URL ");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}





	public void SetUpRegressionForCTI() throws InterruptedException {//sunpreet
		String ReferenceLogin = "PLCA";
		try {
			Base_Class.SetUpRegressionForCTI(ReferenceLogin);
			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
			Log.info("Login successful !");
			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
			// Application URL ");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void SetUpRegressionCTI() throws InterruptedException {//sunpreet
		String ReferenceLogin = "PLCA";
		try {
			Base_Class.SetUpRegressionCTI(ReferenceLogin);
			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
			Log.info("Login successful !");
			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
			// Application URL ");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void LoginCEUserseven() throws InterruptedException {//sunpreet
		String ReferenceLogin = "PLCA";
		try {
			Base_Class.SetUpCEUserseven(ReferenceLogin);
			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
			Log.info("Login successful !");
			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
			// Application URL ");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void LoginCEUserCallScript() throws InterruptedException {//sunpreet
		String ReferenceLogin = "PLCA";
		try {
			Base_Class.SetUpCEUserCallScript(ReferenceLogin);
			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
			Log.info("Login successful !");
			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
			// Application URL ");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void SetUpRegressionForCTICase() throws InterruptedException {//sunpreet
		String ReferenceLogin = "PLCA";
		try {
			Base_Class.SetUpRegressionForCTICase(ReferenceLogin);
			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
			Log.info("Login successful !");
			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
			// Application URL ");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	public void SetUpRegressionForCTICases() throws InterruptedException {
		String ReferenceLogin = "PLCA";
		try {
			Base_Class.SetUpRegressionForCTICases(ReferenceLogin);
			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
			Log.info("Login successful !");
			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
			// Application URL ");
		} catch (IOException e) {
			e.printStackTrace(); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void LoginCEUserfive() throws InterruptedException {
		String ReferenceLogin = "PLCA";
		try {
			Base_Class.SetUpCEUserfive(ReferenceLogin);
			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
			Log.info("Login successful !");
			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
			// Application URL ");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	public void LoginCEUsersix() throws InterruptedException {//sunpreet
		String ReferenceLogin = "PLCA";
		try {
			Base_Class.SetUpCEUsersix(ReferenceLogin);
			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
			Log.info("Login successful !");
			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
			// Application URL ");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	}

	public void SetUpRegressionForPratice() throws InterruptedException {//sunpreet
		String ReferenceLogin = "PLCA";
		try {
			Base_Class.SetUpRegressionForCTIPratice(ReferenceLogin);
			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
			Log.info("Login successful !");
			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
			// Application URL ");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	public void SetUpRegressionForCTIConfrence() throws InterruptedException {
		String ReferenceLogin = "PLCA";
		try {
			Base_Class.SetUpRegressionForCTIConfrence(ReferenceLogin);
			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
			Log.info("Login successful !");
			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
			// Application URL ");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void LoginSanity() throws InterruptedException {
		String ReferenceLogin = "PLCA";
		try {
			Base_Class.SetUpSanity(ReferenceLogin);
			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
			Log.info("Login successful !");
			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
			// Application URL ");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	//	public void LoginBrokerEngage() throws InterruptedException {
	//		String ReferenceLogin = "PLCA";
	//		try {
	//			Base_Class.SetUpP2Regression(ReferenceLogin);
	//			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
	//			Log.info("Login successful !");
	//			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
	//			// Application URL ");
	//		} catch (IOException e) {
	//			e.printStackTrace();
	//		} catch (InterruptedException e) {
	//			e.printStackTrace();
	//		}
	//	}

	//	public void AdminAgentLoginBE() throws InterruptedException {
	//		String ReferenceLogin = "PLCA";
	//		try {
	//			Base_Class.LoginAdminAgent(ReferenceLogin);
	//			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
	//			Log.info("Login successful !");
	//			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
	//			// Application URL ");
	//		} catch (IOException e) {
	//			e.printStackTrace();
	//		} catch (InterruptedException e) {
	//			e.printStackTrace();
	//		}
	//	}

	public void Logout() throws InterruptedException, AWTException {

		driver.quit();

	}

	public void LoginBrokerEngage() throws InterruptedException {
		String ReferenceLogin = "PLCA";
		try {
			Base_Class.SetUpP2Regression(ReferenceLogin);
			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
			Log.info("Login successful !");
			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
			// Application URL ");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void LoginBrokerEngageSync() throws InterruptedException {
		String ReferenceLogin = "PLCA";
		try {
			Base_Class.SetUpBeCeSync(ReferenceLogin);
			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
			Log.info("Login successful !");
			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
			// Application URL ");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	public void LoginCEUserOne() throws InterruptedException {
		String ReferenceLogin = "PLCA";
		try {
			Base_Class.SetUpCEUserone(ReferenceLogin);
			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
			Log.info("Login successful !");
			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
			// Application URL ");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void AdminAgentLoginBE() throws InterruptedException {
		String ReferenceLogin = "PLCA";
		try {
			Base_Class.LoginAdminAgent(ReferenceLogin);
			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
			Log.info("Login successful !");
			// ExtentTestManager.getTest().log(Status.PASS, "Successfully Entered into
			// Application URL ");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(dataProvider = "TestData")
	public void RUNALL(Map<Object, Object> testdata, ITestContext context) throws Throwable {

		CensusInfo ApplicantInfo = new CensusInfo();
		CensusInfo spCensusInfo = new CensusInfo();
		CensusInfo SpouseInfo = new CensusInfo();
		new CensusInfo();
		CensusInfo DependentsInfo = new CensusInfo();
		//		ArrayList<CensusInfo> DependentsInfo = new ArrayList<CensusInfo>();
		new CensusInfo();

		try {
			testdata.get("TestScenario").toString();

			if (testdata.get("Run").toString().equalsIgnoreCase("Yes")) {
				ExtentTestManager.startTest(testdata.get("TestScenario").toString());
				System.out.println("\n");
				System.out.println(
						"<--------------------------------------- START NEW TESTCASE --------------------------------------------------------->");
				Log.info("*** Running test method " + testdata.get("TestScenario").toString() + "...");

				switch (testdata.get("TestScenario").toString()) {


				case "CTI_Console_Available_Offline_Custom": 
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					CTI_Console_Available_Offline_Custom.EG_TC_015_Available_Status(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;



				case "DashBoard_Filters_Configurations_Grids": 
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					DashBoard_Filters_Configurations_Grids.Dashboard_Filter_Configuration(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;



				case "TC_CTI_CallScript_BrodCasting": 
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					TC_CTI_CallScript_BrodCasting.CE_TC_CTI_BC_CallScript(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;


				case "TC_CTI_CallScript_BestFit_RingLess": 
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					TC_CTI_CallScript_BestFit_RingLess.CE_TC_CTI_BF_RL_CallScript(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;


				case "TC_CTI_CallScript_RoundRobin": 
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					TC_CTI_CallScript_RoundRobin.CE_TC_CTI_RR_CallScript(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;




				case "TC_CTI_BF_RL_Transfer_To_Agent": 
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					TC_CTI_BF_RL_Transfer_To_Agent.BF_Ringless_TarnsferToAgent(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;





				case "TC_CTI_Call_ON_Call_Validation": 
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					TC_CTI_Call_ON_Call_Validation.EG_TC_CTI_OnCallValidation(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;


				case "TC_CTI_RR_Barge_Monitor_Whisper": 
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					TC_CTI_RR_Barge_Monitor_Whisper.EG_TC_CTI_RR_BMW();
					Logout();
					context.setAttribute("fileName", "Logout");
					break;





				case "TC_CTI_Voicemail_To_Agent":
					context.setAttribute("fileName", "Login");
					SetUpRegressionCTI();
					TC_CTI_Voicemail_To_Agent.EG_TC_CTI_Voicemail(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;



				case "TC_CTI_AdminSMS_Call_Fax_Tab_Validation_Missed_call_to_Agent":
					context.setAttribute("fileName", "Login");
					SetUpRegressionCTI();
					TC_CTI_AdminSMS_Call_Fax_Tab_Validation_Missed_call_to_Agent.EG_TC_CTI_AdminSMS_Call_Fax_Tab_Validation_Missed_call_to_Agent(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;

				case "TC_CTI_AdminSMS_Call_Fax_Tab_Validation_SMS_MMS_Inbound_Outbound":
					context.setAttribute("fileName", "Login");
					SetUpRegressionCTI();
					TC_CTI_AdminSMS_Call_Fax_Tab_Validation_SMS_MMS_Inbound_Outbound.EG_TC_CTI_AdminSMS_Call_Fax_Tab_Validation_SMS_MMS_Inbound_Outbound(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;


				case "TC_CTI_MissedCall_Tab_Validation": 
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					TC_CTI_MissedCall_Tab_Validation.EG_TC_CTI_MissedCallTab(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;

				case "CTI_Console_VoiceMailTab_Validation": 
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					CTI_Console_VoiceMailTab_Validation.EG_TC_CTIConsole_VoiceMail(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;




				case "TC_CTI_Recordings_Tab_Validation":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					TC_CTI_Recordings_Tab_Validation.EG_TC_CTI_RecordingTab(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;



				case "TC_CE_010_CTI_Inbound_calls_forwarding_option":
					context.setAttribute("fileName", "Login");
					SetUpRegressionCTI();
					TC_CE_010_CTI_Inbound_calls_forwarding_option.CE_TC_CTI_validate_by_clicking_forwarding_call_option_Inbound_Calls(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;

				case "TC_CTI_Call_Logs_Tab_Validation":
					context.setAttribute("fileName", "Login");
					LoginCEUsersix();
					TC_CTI_Call_Logs_Tab_Validation.EG_TC_Call_Logs_Tab_Validations(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;		 	


				case "TC_CTI_SMS_MMS_Inbound_CTI_Logs_Status_SSE_notification_Status_Email_notifiation_Status":
					context.setAttribute("fileName", "Login");
					SetUpRegressionCTI();
					TC_CTI_SMS_MMS_Inbound_CTI_Logs_Status_SSE_notification_Status_Email_notifiation_Status.CE_TC_CTI_SMS_MMS_Inbound_CTI_Logs_Status_SSE_notification_Status_Email_notifiation_Status(ApplicantInfo);;
					Logout();
					context.setAttribute("fileName", "Logout");
					break;


				case "TC_CTI_Messages_Tab_Validations":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					TC_CTI_Messages_Tab_Validations.CTI_MessageTab_Validations(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;


				case "TC_Inbound_Admin_Call_Log_Transfer_Online_Offline":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTICases();
					TC_Inbound_Admin_Call_Log_Transfer_Online_Offline.Inbound_Admin_Call_Log_Status(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;


					//TC_Inbound_Admin_Call_Log_Transfer_Custom_Message	 
				case "TC_Inbound_Admin_Call_Log_Transfer_BRB_Custom_Message":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTICases();
					TC_Inbound_Admin_Call_Log_Transfer_BRB_Custom_Message.Inbound_Admin_Call_Log_Custom_Message(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;



				case "TC_CTI_BC_Transfer_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					TC_CTI_BC_Transfer_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs.CE_TC_CTI_BC_Transfer_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;




				case "TC_CTI_Call_Group_Tab_Validation":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					TC_CTI_Call_Group_Tab_Validation.EG_TC_Call_Group_Tab_Validations(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;



				case "TC_CTI_BF_RG_Transfer_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					TC_CTI_BF_RG_Transfer_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs.CE_TC_CTI_BF_RG_Transfer_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;


				case "TC_CTI_BF_RG_Transfer_To_Agent_BeRight_Back_Activity_Status_Admin_call_logs_CTI_call_logs":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					TC_CTI_BF_RG_Transfer_To_Agent_BeRight_Back_Activity_Status_Admin_call_logs_CTI_call_logs.CE_TC_CTI_BF_RG_Transfer_To_Agent_BeRight_Back_Activity_Status_Admin_call_logs_CTI_call_logs(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;


					//TC_Oubtbound_Admin_Call_Log_Transfer_Online
				case "TC_Oubtbound_Admin_Call_Log_Transfer_Online_Offline":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTICases();
					TC_Oubtbound_Admin_Call_Log_Transfer_Online_Offline.Outbound_Admin_Call_Log_Online_Transfer(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;
					//TC_Oubtbound_Admin_Call_Log_Transfer_Offline
				case "TC_Oubtbound_Admin_Call_Log_Transfer_BRB_Custom":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTICases();
					TC_Oubtbound_Admin_Call_Log_Transfer_BRB_Custom.Outbound_Admin_Call_Log_Custom_Transfer(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;





					//TC_Inbound_Call_Barge
				case "TC_Inbound_Call_Barge_Monitor_Whisper":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTICases();
					//TC_Oubtbound_Admin_Call_Log_Transfer_Offline.Outbound_Admin_Call_Log_Offline_Transfer(ApplicantInfo);
					TC_Inbound_Call_Barge_Monitor_Whisper.Inbound_Admin_Call_Barge_Monitor_Whisper(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;
					//TC_Outbound_Call_Barge_Monitor_Whisper
				case "TC_Outbound_Call_Barge_Monitor_Whisper":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTICases();
					//TC_Oubtbound_Admin_Call_Log_Transfer_Offline.Outbound_Admin_Call_Log_Offline_Transfer(ApplicantInfo);
					TC_Outbound_Call_Barge_Monitor_Whisper.Outbound_Admin_Call_Barge_Monitor_Whisper(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;

					//TC_CTI_BC_Barge_Monitor_Whisper




				case "TC_CTI_BC_Barge_Monitor_Whisper":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTICases();
					TC_CTI_BC_Barge_Monitor_Whisper.CE_TC_CTI_BC_Barge_Monitor_Whisper(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;




					//TC_CTI_BF_RL_Barge_Monitor_Whisper
				case "TC_CTI_BF_RL_Barge_Monitor_Whisper":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTICases();
					TC_CTI_BF_RL_Barge_Monitor_Whisper.BF_Ringless_BMW(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;



				case "TC_CTI_BF_RG_Transfer_to_Agent_Offline_Activity_Status_Admin_call_logs_CTI_call_logs":
					context.setAttribute("fileName", "Login");
					LoginCEUsersix();
					TC_CTI_BF_RG_Transfer_to_Agent_Offline_Activity_Status_Admin_call_logs_CTI_call_logs.CE_TC_CTI_BF_RG_Transfer_to_Agent_Offline();
					Logout();
					context.setAttribute("fileName", "Logout");
					break;			 
					//TC_CTI_BF_RG_Barge_Monitor_Whisper 
				case "TC_CTI_BF_RG_Barge_Monitor_Whisper":
					context.setAttribute("fileName", "Login");
					LoginCEUsersix();
					TC_CTI_BF_RG_Barge_Monitor_Whisper.BF_Ring_BMW(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;

				case "TC_CTI_CallDisposition_Popup_CallDisconnected":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					TC_CTI_CallDisposition_Popup_CallDisconnected.EG_TC_CTI_CallDisposition_Popup_Disconnected(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;



				case "TC_CTI_CallDisposition_Popup_NotASale":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					TC_CTI_CallDisposition_Popup_NotASale.EG_TC_CTI_CallDisposition_Popup_NotASale(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;




				case "TC_CTI_CallDisposition_Popup_CallBack":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					TC_CTI_CallDisposition_Popup_CallBack.EG_TC_CTI_CallDisposition_Popup_CallBack(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;



				case "TC_CTI_CallDisposition_Popup_Call_Transfer":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					TC_CTI_CallDisposition_Popup_Call_Transfer.EG_TC_CTI_CallDisposition_Popup_Call_Transfer(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;




				case "TC_CTI_CallDisposition_Popup_Call_Transfer_Outbound":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					TC_CTI_CallDisposition_Popup_Call_Transfer_Outbound.EG_TC_CTI_CallDisposition_Popup_Call_Transfer_Outbound(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;



				case "TC_CTI_CallDisposition_Validation_Mandatory_Fields":
					context.setAttribute("fileName", "Login");
					LoginCEUserseven();
					TC_CTI_CallDisposition_Validation_Mandatory_Fields.EG_TC_Mandatory_Fields();
					Logout();
					context.setAttribute("fileName", "Logout");
					break;

				case "TC_CTI_CallDisposition_Validation_Non_Mandatory_Fields":
					context.setAttribute("fileName", "Login");
					LoginCEUserseven();
					TC_CTI_CallDisposition_Validation_Non_Mandatory_Fields.EG_TC_Non_Mandatory_Fields();
					Logout();
					context.setAttribute("fileName", "Logout");
					break;

				case "TC_CTI_CallDisposition_Validation_Disposition_Dropdown":
					context.setAttribute("fileName", "Login");
					LoginCEUserseven();
					TC_CTI_CallDisposition_Validation_Disposition_Dropdown.EG_TC_Disposition_Dropdown();
					Logout();
					context.setAttribute("fileName", "Logout");
					break;	

				case "TC_CTI_CallDisposition_Validation_Inbound_Call_Transfer":
					context.setAttribute("fileName", "Login");
					LoginCEUserseven();
					TC_CTI_CallDisposition_Validation_Inbound_Call_Transfer.EG_TC_Call_Transfer();
					Logout();
					context.setAttribute("fileName", "Logout");
					break;	

				case "TC_CTI_CallDisposition_Validation_Outbound_Call_Transfer":
					context.setAttribute("fileName", "Login");
					LoginCEUserseven();
					TC_CTI_CallDisposition_Validation_Outbound_Call_Transfer.EG_TC_Outbound_Call_Transfer();
					Logout();
					context.setAttribute("fileName", "Logout");
					break;		 

				case "TC_CTI_CallScript_Assign_to_Agent":
					context.setAttribute("fileName", "Login");
					LoginCEUserCallScript();
					TC_CTI_CallScript_Assign_to_Agent.EG_TC_CTI_CallScript_Assign_to_Agent();
					Logout();
					context.setAttribute("fileName", "Logout");
					break;	


					////////asif//
					
				case "TC_CTI_Conference_Online_Admin_CallLogs":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					//					LoginCEUserFiveCognito();
					TC_CTI_Conference_Online_Admin_CallLogs.EG_TC_CTI_Conference_Online_Admin_CallLog(ApplicantInfo);;
					Logout();
					context.setAttribute("fileName", "Logout");
					break;

				case "TC_CTI_Conference_BeRight_Back_Admin_CallLogs_CTI_Logs":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					//					LoginCEUserFiveCognito();
					TC_CTI_Conference_BeRight_Back_Admin_CallLogs_CTI_Logs.EG_TC_CTI_Conference_BeRight_Back_Admin_CallLog_CTI_logs(ApplicantInfo);;
					Logout();
					context.setAttribute("fileName", "Logout");
					break;

				case "TC_CTI_Conference_Custome_Admin_CallLogs":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					//					 LoginCEUserFiveCognito();
					TC_CTI_Conference_Custome_Admin_CallLogs.EG_TC_CTI_Conference_Custome_Admin_CallLog(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;


				case "TC_CTI_Outbound_Conference_Offline_Admin_CallLogs_CTI_Logs":
					context.setAttribute("fileName", "Login");
					LoginCEUsersix();
					//					 LoginCEUserFiveCognito();
					TC_CTI_Outbound_Conference_Offline_Admin_CallLogs_CTI_Logs.EG_TC_CTI_Outbound_Conference_Offline();
					Logout();
					context.setAttribute("fileName", "Logout");
					break;	

				case "TC_CTI_Conference_Offline_Admin_CallLogs_CTI_Logs":
					context.setAttribute("fileName", "Login");
					LoginCEUsersix();
					//					 LoginCEUserFiveCognito();
					TC_CTI_Conference_Offline_Admin_CallLogs_CTI_Logs.EG_TC_CTI_Inbound_Conference_Offline();
					Logout();
					context.setAttribute("fileName", "Logout");
					break;	



				case "TC_CTI_Outbound_Conference_BeRight_Back_Admin_CallLogs_CTI_Logs":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					//					 LoginCEUserFiveCognito();
					TC_CTI_Outbound_Conference_BeRight_Back_Admin_CallLogs_CTI_Logs.EG_TC_CTI_Conference_BeRight_Back();
					Logout();
					context.setAttribute("fileName", "Logout");
					break;	

				case "TC_CTI_BF_RL_Conference_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					//					 LoginCEUserFiveCognito();
					TC_CTI_BF_RL_Conference_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs.CE_TC_CTI_BF_RL_Conference_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;


				case "TC_CTI_BF_RG_Conference_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					//					 LoginCEUserFiveCognito();
					TC_CTI_BF_RG_Conference_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs.CE_TC_CTI_BF_RG_Conference_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;

				case "TC_CTI_Outbound_Conference_Custom_Status":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTICases();
					//					 LoginCEUserFiveCognito();
					TC_CTI_Outbound_Conference_Custom_Status.Outbound_Transfer_Custom_Status(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;

				case "TC_CTI_Outbound_Conference":
					context.setAttribute("fileName", "Login");
					SetUpRegressionForCTI();
					//					 LoginCEUserFiveCognito();
					TC_CTI_Outbound_Conference.EG_TC_CTI_Outbound_Call(ApplicantInfo);
					Logout();
					context.setAttribute("fileName", "Logout");
					break;






				default:
					break;

				}

				// EndTest
				System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
				ExtentTestManager.endTest();
				ExtentManager.getInstance().flush();
				Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");

			}

		} catch (Exception e) {

			System.out.println("<----------------Failed--- Test execution " + testdata.get("TestScenario").toString()
					+ " ---Failed ---------------->");
			Log.error("" + e.getMessage());
			String fileName = (String) context.getAttribute("fileName");

			try {
				File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName,
						testdata.get("TestScenario").toString());
				ExtentTestManager.getTest().fail(e.getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
			} catch (Exception NoSuchWindowException) {
				System.out.println("Catch File not found error");
			}
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

			// EndTest
			System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");
		} catch (AssertionError e) {
			System.out.println("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("" + e.getMessage());
			String fileName = (String) context.getAttribute("fileName");

			try {
				File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName,
						testdata.get("TestScenario").toString());
				ExtentTestManager.getTest().fail(e.getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
			} catch (Exception NoSuchWindowException) {
				System.out.println("File not found error");
			}
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

			// EndTest
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("************************ Test Suite " + testdata.get("TestScenario").toString()
					+ " ending ****************************");

		} finally {
			if (driver != null)
				driver.quit();
		}
	}

	@DataProvider(name = "TestData")
	public static Object[][] gettestdate() throws IOException {

		Object[][] objectarry = null;
		java.util.List<Map<String, String>> completedata = com.Utility.ExcelReader.getdata();

		objectarry = new Object[completedata.size()][1];

		for (int i = 0; i < completedata.size(); i++) {
			objectarry[i][0] = completedata.get(i);
		}
		return objectarry;
	}
	@AfterSuite
	public void sharingReport() throws IOException {

		//extent.flush();
		// driver.quit();
		if(	configloader().getProperty("triggermail").equalsIgnoreCase("Yes")){
			try {
				TriggerEmail.sendReport();
			} catch (Exception e) {
				// TODO Auto-generated catch blockdfghj
				e.printStackTrace();
			}

		}

	}
	public String writenameToExcel(String nameText, String sheetname) throws IOException {
		String excelFilePath = ".\\src\\test\\resources\\TestData.xlsx";
		FileInputStream inputStream = new FileInputStream(excelFilePath);
		Workbook workbook = new XSSFWorkbook(inputStream);
		String sheetName_update = sheetname;
		Sheet sheet = workbook.getSheet(sheetname);
		int rowIndex = 1;  
		int columnIndex = 8;
		Row row = sheet.getRow(rowIndex);
		Cell cell = row.createCell(columnIndex);
		cell.setCellValue(nameText);  
		inputStream.close();
		FileOutputStream outputStream = new FileOutputStream(excelFilePath);
		workbook.write(outputStream);
		workbook.close();
		outputStream.close();
		return null;		
	}
	public static String generateUsername() {
		int length = 6; // Set the desired length of the username
		String characters = "abcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		StringBuilder username = new StringBuilder();
		for (int i = 0; i < length; i++) {
			char randomChar = characters.charAt(random.nextInt(characters.length()));
			username.append(randomChar);
		}
		return username.toString();
	}


} 
