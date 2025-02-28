package com.test;

import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import com.pages.Call_Sequences;
import com.pages.CensusInfo;
//import com.pages.FindApplicationPage;
import com.pages.CustomerEngageFunctionalityValidations;
import com.pages.PhoneNumberValidations;

import Utility.ExcelHelper;
public class TC_CTI_RR_Barge_Monitor_Whisper extends AllScenarios_EG_TC {
	CensusInfo ApplicantInfo = new CensusInfo();
	CensusInfo SpouseInfo = new CensusInfo();
	CensusInfo DomesticPartner = new CensusInfo();
	
	ArrayList<CensusInfo> DependentsInfo = new ArrayList<CensusInfo>();
	 CensusInfo DependentInfo = new CensusInfo(); 
	public void EG_TC_CTI_RR_BMW()
			throws ClassNotFoundException, Exception {
		CustomerEngageFunctionalityValidations consumerpage = new CustomerEngageFunctionalityValidations(driver);
		PhoneNumberValidations phoneNumberValidations = new PhoneNumberValidations(driver);
		ExcelHelper _excelObj = new ExcelHelper();
		Call_Sequences Call_Sequences = new Call_Sequences(driver);

		XSSFSheet tcTestData = _excelObj.readExcelSheet("TestData", "TC CE1");
		int rowCount = tcTestData.getLastRowNum() - tcTestData.getFirstRowNum();

		if (tcTestData != null) {

			ApplicantInfo.Zipcode = tcTestData.getRow(1).getCell(1).getStringCellValue().toString();
	    	ApplicantInfo.Email=tcTestData.getRow(1).getCell(10).getStringCellValue().toString();
	        ApplicantInfo.DOB = tcTestData.getRow(1).getCell(3).getStringCellValue().toString();     

		}
 
		System.out.println("******* Customer Engage CTI Voicemail Tab Validation ***************");		  
		consumerpage.login_CE_validations();
		Call_Sequences.RR_BMW();
		consumerpage.logout_CE_validations();
		
	}

}
