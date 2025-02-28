package com.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.*;
import org.apache.commons.text.RandomStringGenerator;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.RandomStringGenerator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class BasePage {
	private static final By WebElement = null;
	public static WebDriver driver;
	public  WebDriverWait wait;
	public static String NewApplicantName;

	private By CTIMinimizeIcon = By.xpath("//a[@class='fa fa-minus right-al']");

	// Constructor
	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofMinutes(2));
	}

//	public String writeDynamicLastname() {
//		String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "AEIOU";
//		String lastname = "";
//		String lastnameDomain = "";
//		String temp = RandomStringUtils.random(25, allowedChars);
//		lastnameDomain = temp.substring(0, temp.length() - 15);
//		lastname = temp.substring(0, temp.length() - 9);
//		return lastname;		
//	}
	public String writeDynamicFirstLastname() {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "AEIOU";
        String temp = RandomStringUtils.random(25, allowedChars);

        // Adjust the substring lengths based on your requirements
        String lowercaseLastname = temp.substring(0, temp.length() - 9);

        // Make the first character uppercase
        String capitalizedLastname = Character.toUpperCase(lowercaseLastname.charAt(0)) + lowercaseLastname.substring(1);

        return capitalizedLastname;
    }
	
	// Click Method
	public void click(By element) throws InterruptedException {	
		Thread.sleep(1100);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(5000));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		Thread.sleep(1100);
	}

	public void select(By by, String text) throws InterruptedException {
		// waitVisibility(by).click();
		Thread.sleep(1000);
	   	click(By.xpath("//span[text()='"+text+"']"));
	   	Thread.sleep(1000);
	}

	public Select selectVal(By by) throws InterruptedException {
		waitVisibility(by).click();
		// click(By.xpath("//div[@class='row margin_bottom_0px censuslist
		// Applicantcensus showncensus']//span[text()='"+text+"']"));
		return null;

	}

	public void clear(By by) {
		waitVisibility(by).clear();
	}
	public static void cleartextField(By element) throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(element)).clear();
		Thread.sleep(2000);
	}

	public void submit(By by) {
		waitVisibility(by).submit();
	}

	// Write Text
	public void writeText(By by, String text) throws InterruptedException {
//		Thread.sleep(1000);
//        waitVisibility(WebElement).sendKeys(text);
//    	Thread.sleep(1000);
		 Thread.sleep(800);
 	//	WebDriverWait wait2 = new WebDriverWait(driver, 30);
		WebDriverWait wait2=new WebDriverWait(driver, Duration.ofMinutes(1));
 		wait2.until(ExpectedConditions.presenceOfElementLocated(by)).sendKeys(text);
		    Thread.sleep(800);
	}

	public String writeDynamicEmail() {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890";
	    String email = "";
	    String emailDomain = "";
	    String temp = RandomStringUtils.random(25, allowedChars);
	    emailDomain = temp.substring(0, temp.length() - 15);
	    email = temp.substring(0, temp.length() - 9) + "@" + "yopmail.com";
	    return email;		
	}
	
	    public static String generatePhoneNumber() {
	        Random rand = new Random();
	        
	    
	        String phoneNumber = "7"; 
	        for (int i = 0; i < 9; i++)
	        {
	            phoneNumber += rand.nextInt(10); 
	            
	        }
	        
	        return phoneNumber;
	    }
	 
	public String writeEmailToExcel(String emailText) throws IOException {
		String excelFilePath = ".\\src\\test\\resources\\TestData.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        String sheetName = "TestCase Regression 8";
        Sheet sheet = workbook.getSheet(sheetName);
        int rowIndex = 1;  
        int columnIndex = 9; 
        Row row = sheet.getRow(rowIndex);
        Cell cell = row.createCell(columnIndex);
        cell.setCellValue(emailText);  
        inputStream.close();
		FileOutputStream outputStream = new FileOutputStream(excelFilePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
		return null;		
	}
	
	public void writetext(WebElement txt, String text) {
		waitVisibility(WebElement).sendKeys(text);
	}

	// Read Text
	public String readText(By by) {
		return waitVisibility(by).getText();
	}

	// Wait
	public WebElement waitVisibility(By by) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static void JavascriptClick(By by, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", by);
	}
	 public static void ExtentSuccessMessage(String strPassSuccessMessage) {
			ExtentTestManager.getTest().log(Status.PASS, strPassSuccessMessage);
	}

	public static void ExtentErrorMessage(String strPassErrorMessage) {
			ExtentTestManager.getTest().log(Status.FAIL, strPassErrorMessage);
	}
	public void HandleDropDown(WebElement ele, String ele2)
	{
		Select s=new Select(ele);
		s.selectByValue(ele2);
	}
	public void ActionClick(WebElement ele) throws InterruptedException
	{
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.click(ele).perform();
		Thread.sleep(1000);

	}
	
	public void MoveToElementClick(WebElement element) throws InterruptedException {    
        Thread.sleep(1500);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        // Use JavaScript Executor to move to the element
        jsExecutor.executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center', inline: 'center'});", element);
        // Click the element using JavaScript Executor
        jsExecutor.executeScript("arguments[0].click();", element);
    }
	

	public static Properties configloader() throws IOException {
		FileInputStream File = new FileInputStream(".\\src\\test\\resources\\config.properties");
		Properties properties = new Properties();
		properties.load(File);
		return properties;
	}

	public static boolean ElementDisplayed(By locator) throws InterruptedException {

		Boolean flag = false;
		try {
			WebElement element = driver.findElement(locator);
			flag = element.isDisplayed();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (flag) {
			ExtentSuccessMessage("Successfully System able to found the element :" + locator);
			return flag;
		} else {
			ExtentSuccessMessage("System not able to found the element :" + locator);
			flag = false;
		}
		return flag;
	}
	
	//Asif Alam (splitthewindowscreen)
	// To split the windows in the left and right positions 

	public void splitthewindowscreen(String position) {
		// Get the screen dimensions
		Dimension screenSize = driver.manage().window().getSize();
		// Calculate the dimensions for each split
		int width = screenSize.getWidth() / 2;
		int height = screenSize.getHeight();

		if(position.toUpperCase().contains("RIGHT")) {
			//    	 Set the window position and size for the second split
			driver.manage().window().setPosition(new Point(0, 0));
			driver.manage().window().setSize(new Dimension(width, height));
		}if(position.toUpperCase().contains("LEFT")) {
			// Set the window position and size for the first split
			driver.manage().window().setPosition(new Point(680, 0));
			driver.manage().window().setSize(new Dimension(width, height));
		}    
	}
	public void RefreshPage() {
		driver.navigate().refresh();
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
	public String Currentdate() {
		// Set the time zone to USA Eastern Time (New York)
				ZoneId zoneId = ZoneId.of("Asia/Kolkata");
		// Get current date
        LocalDate currentDate = LocalDate.now(zoneId);

        // Define a date formatter to format the date as needed
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        // Format the current date
        String formattedDate = currentDate.format(formatter);

        // Print the formatted date
        System.out.println("Current date in USA format: " + formattedDate);
        return formattedDate;
	}
	public static void MouseHoverOnElement(By element) throws InterruptedException {
		WebElement ele = driver.findElement(element);
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
	}
	public void SelectActiveDropdown (By by, String value) throws InterruptedException {
		if(ElementDisplayed(by)) {
			click(by);
			By options = By.xpath("//*[contains(@class,'dropDown md-active md-clickable')]//*[@value='"+value+"']");
			if(ElementDisplayed(options)) {
				click(options);
				ExtentSuccessMessage("Successfully user found and clicked on the "+value+" value inside the dropdown ");
			}
		}else {
			ExtentErrorMessage("UnSuccessfully user not found and clicked on the "+value+" value inside the dropdown ");
		}
		
	}

	public static String GetElementText(By locator) throws InterruptedException {

		String stxt = null;
		WebElement element = driver.findElement(locator);
		if (element.isDisplayed()) {
			stxt = element.getText();
			ExtentSuccessMessage("System able to found the element :" + locator);
		} else {
			ExtentSuccessMessage("System not able to found the element :" + locator);
		}
		return stxt;
	}
	public String generateRandomText() {
		// Create a generator using Apache Commons Text
		RandomStringGenerator generator = new RandomStringGenerator.Builder()
				.withinRange('a', 'z')
				.build();
		// Generate a random word of length 8
		String randomWord = generator.generate(8);
		System.out.println("Random Word: " + randomWord);
		return randomWord;
	}
	public static String SevendaysagoDate() {
		// Get today's date
		// Set the time zone to USA Eastern Time (New York)
		ZoneId zoneId = ZoneId.of("America/New_York");
		// Get current date
		LocalDate currentDate = LocalDate.now(zoneId);
		// Get yesterday's date
		LocalDate yesterday = currentDate.minusDays(6);
		// Define a date formatter to format the date as needed
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

		// Format the current date
		String formattedDate = yesterday.format(formatter);

		// Print yesterday's date
		System.out.println("Yesterday's date: " + formattedDate);
		return formattedDate;
	}
	public static String YesterdayDate() {
		// Get today's date
		// Set the time zone to USA Eastern Time (New York)
		ZoneId zoneId = ZoneId.of("America/New_York");
		// Get current date
		LocalDate currentDate = LocalDate.now(zoneId);
		// Get yesterday's date
		LocalDate yesterday = currentDate.minusDays(1);
		// Define a date formatter to format the date as needed
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

		// Format the current date
		String formattedDate = yesterday.format(formatter);

		// Print yesterday's date
		System.out.println("Yesterday's date: " + formattedDate);
		return formattedDate;
	}

	public static void input(By element, String Value) throws InterruptedException {
		//WebDriverWait wait2 = new WebDriverWait(driver, 30);
		WebDriverWait wait2=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait2.until(ExpectedConditions.presenceOfElementLocated(element)).sendKeys(Value);
	}

	public static boolean ElementDisplayeds(By locator) throws InterruptedException {

		Boolean flag = false;
		try {
			WebElement element = driver.findElement(locator);
			flag = element.isDisplayed();

		} catch (Exception e) {
			// TODO: handle exception
		}
		if (flag) {
			System.out.println("Successfully System able to found the element :" + locator);
			return flag;
		} else {
			System.out.println("System not able to found the element :" + locator);
			flag = false;
		}
		return flag;
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
				Thread.sleep(9000);
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
	
	public String RemoveSeconds (String count) {	
		System.out.println(count);
		String timeString = StringUtils.substringAfter(count," ");
		System.out.println("---------"+timeString);
		// Define the input format pattern (12-hour format with AM/PM)
		DateTimeFormatter inputFormatter1 = DateTimeFormatter.ofPattern("hh:mm:ss a");

		// Parse the original time string into a LocalTime object
		LocalTime parsedTime1 = LocalTime.parse(timeString, inputFormatter1);

		// Define the output format pattern to show only hours and minutes
		DateTimeFormatter outputFormatter1 = DateTimeFormatter.ofPattern("hh:mm a");

		// Format the parsed LocalTime object to "hh:mm AM/PM"
		String formattedTime1 = parsedTime1.format(outputFormatter1);

		// Output the formatted time (only hours and minutes)
		System.out.println("Formatted Time: " + formattedTime1);
		return formattedTime1;
	}

	
}

