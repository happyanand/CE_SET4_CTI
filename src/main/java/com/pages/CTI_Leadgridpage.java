
package com.pages;

import java.awt.AWTException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.BasePackage.Base_Class;

import java.awt.AWTException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.BasePackage.Base_Class;

public class CTI_Leadgridpage extends BasePage {
	Base_Class Base_Class =new Base_Class();
	public CTI_Leadgridpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement element;
	
	By userID = By.id("user-name");//------//for userid at Login page
	By pwd = By.id("password");//-------for password at home page
	By signIn = By.xpath("//*[@id='form-validation-button']");//
	By SalesButton  = By.xpath("//span[normalize-space()='Sales']");
	By leads = By.xpath(("//a[@href='#/sales/leads']"));
	By CTIMinimizeIcon = By.xpath("//a[@class='fa fa-minus right-al']");
	By LeadTittle = By.xpath("//span[@class='ng-binding'][normalize-space()='All Leads']");
	By LeadButton = By.id("newLeadBtn");
	By Allleads = By.xpath("//span[@class='ng-binding'][normalize-space()='All Leads']");
	By NickName = By.id("NickName");
	By Prefix = By.id("LeadPrefix");
	By FirstName = By.id("LeadFirstName");
	By LastName = By.id("LeadLastName");
	By keypaddial = By.xpath("//a[@ng-click='CTICtrl.showDialPad(true)']//i[contains(@class,'fa')]");
	

	public void waitForElement(int time) throws InterruptedException {
		Thread.sleep(time);
	}
	
    public static int generateRandomThreeDigitNumber() {
	        Random random = new Random();
	        int randomNumber = 100 + random.nextInt(900); // Generates a number between 100 and 999
	        return randomNumber;
	    }
	public void cttMinimize() throws InterruptedException {
		waitForElement(10000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(CTIMinimizeIcon));
		MoveToElementClick(element);
	}

	public void clickcallbutton() throws InterruptedException
	{

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
		
		
		waitForElement(6000);
		By calling = By.xpath("//cti-call-btn[normalize-space()='(923) 221-2111']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(calling));
		MoveToElementClick(element);
		waitForElement(6000);
		By dailer = By.xpath("//div[@class='voice-call-window-content-right-section right-al']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(dailer));
		System.out.println("<--------------------------------------- Dailer has been initiated--------------------------------------------------------->");
		waitForElement(8000);
		By dailnumber = By.xpath("//input[@placeholder='Enter Phone Number']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(dailnumber));
		ExtentSuccessMessage("Call has been disconnedcted");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(keypaddial));
		MoveToElementClick(element);
		ExtentSuccessMessage("clicked on Keypad");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public void CreateLead(String PhoneNO,String LeadEmails) throws InterruptedException {
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
		String FName = "User_CE"+generateRandomThreeDigitNumber();
		writeText(FirstName,FName);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LastName));
		MoveToElementClick(element);
		String LName = "QA";
		writeText(LastName,LName);
	

		By LeadEmail = By.name("LeadEmail");

		System.out.println("LeadEmail:- "+LeadEmails);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadEmail));
//		MoveToElementClick(element);
		writeText(LeadEmail,LeadEmails);
		
		By Phonenumber = By.name("LeadMobile");
		System.out.println("PhoneNO:- "+PhoneNO);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Phonenumber));
		writeText(Phonenumber,PhoneNO);
		By Submit = By.xpath("//div[@class='col-md-6 pull-right button-wrap']//button[@type='submit'][normalize-space()='Submit']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Submit));
		MoveToElementClick(element);
		ExtentSuccessMessage("Lead has been created succesfully");
		waitForElement(8000);
		By agreelead = By.xpath("//button[normalize-space()='Proceed with Lead creation']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(agreelead));
		MoveToElementClick(element);
		waitForElement(18000);
//		By SearchLead = By.id("fl-input-1");
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchLead));
//		writeText(SearchLead,FName+" "+LName+Keys.ENTER);
		By SearchLead = By.id("fl-input-1");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchLead));
		writeText(SearchLead,FName+" "+LName+Keys.ENTER);
		By SearchResult = By.xpath("(//*[@class='fa fa-phone ng-scope']//parent::cti-call-btn)[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchResult));
		MoveToElementClick(element);
	}
	
	
	public String CreateLeadAddComment(String PhoneNO,String LeadEmails) throws InterruptedException, AWTException {
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
		waitForElement(9000);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Allleads));
		element = wait.until(ExpectedConditions.presenceOfElementLocated(NickName));
	    MoveToElementClick(element);
	    String Name="test";
	    writeText(NickName, Name);
	    System.out.println("<--------------------------------------- Lead creation--------------------------------------------------------->");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(FirstName));
		MoveToElementClick(element);
		String FName = "User_CE"+generateRandomThreeDigitNumber();
		writeText(FirstName,FName);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LastName));
		MoveToElementClick(element);
		String LName = "QA";
		writeText(LastName,LName);
	

		By LeadEmail = By.name("LeadEmail");

		System.out.println("LeadEmail:- "+LeadEmails);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadEmail));
//		MoveToElementClick(element);
		writeText(LeadEmail,LeadEmails);
		
		By Phonenumber = By.name("LeadMobile");
		System.out.println("PhoneNO:- "+PhoneNO);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Phonenumber));
		writeText(Phonenumber,PhoneNO);
		////
		By LeadInfo = By.xpath("//*[text()='Lead Information']//parent::div[@class='accordion-container']//i[@class='acc glyphicon glyphicon-plus']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(LeadInfo));
		MoveToElementClick(element);
		Thread.sleep(10000);
//		By CommentArea1 = By.id("input_231");
//		if (ElementDisplayed(CommentArea1)) {
//			element = wait.until(ExpectedConditions.presenceOfElementLocated(CommentArea1));
//			String Comment = "Automation Testing Comment";
//			System.out.println("Comment:- "+Comment);
//			Base_Class.input(CommentArea1,Comment);
//			ExtentSuccessMessage("Succesfully Comment added:- "+Comment);
//		}else {
//			ExtentErrorMessage("UnSuccesfully not visible Comment Field:- ");
//		}
			
	
		
		By Submit = By.xpath("//div[@class='col-md-6 pull-right button-wrap']//button[@type='submit'][normalize-space()='Submit']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(Submit));
		MoveToElementClick(element);
		ExtentSuccessMessage("Lead has been created succesfully");
		waitForElement(9000);
		By agreelead = By.xpath("//button[normalize-space()='Proceed with Lead creation']");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(agreelead));
		MoveToElementClick(element);
		waitForElement(15000);
		By SearchLead = By.id("fl-input-1");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchLead));
		writeText(SearchLead,FName+" "+LName+Keys.ENTER);
		By SearchResult = By.xpath("(//*[@class='fa fa-phone ng-scope']//parent::cti-call-btn)[1]");
		element = wait.until(ExpectedConditions.presenceOfElementLocated(SearchResult));
		MoveToElementClick(element);
		return FName+" "+LName;
	}
	

}
