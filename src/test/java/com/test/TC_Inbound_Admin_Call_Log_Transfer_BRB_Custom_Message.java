package com.test;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import com.pages.Call_Sequences;
import com.pages.CensusInfo;
import com.pages.CustomerEngageFunctionalityValidations;

import Utility.ExcelHelper;
//import bsh.ParseException;

public class TC_Inbound_Admin_Call_Log_Transfer_BRB_Custom_Message extends AllScenarios_EG_TC {
	CensusInfo ApplicantInfo = new CensusInfo();
	CensusInfo SpouseInfo = new CensusInfo();
	CensusInfo DomesticPartner = new CensusInfo();
	
	ArrayList<CensusInfo> DependentsInfo = new ArrayList<CensusInfo>();
	 CensusInfo DependentInfo = new CensusInfo();
	public void Inbound_Admin_Call_Log_Custom_Message(CensusInfo ApplicantInfo)
			throws  InterruptedException, IOException, ParseException, java.text.ParseException {
		CustomerEngageFunctionalityValidations consumerpage = new CustomerEngageFunctionalityValidations(driver);
		Call_Sequences Call_Sequences = new Call_Sequences(driver);
		ExcelHelper _excelObj = new ExcelHelper();
		XSSFSheet tcTestData = _excelObj.readExcelSheet("TestData", "TC CE1");
		int rowCount = tcTestData.getLastRowNum() - tcTestData.getFirstRowNum();

		if (tcTestData != null) {

			ApplicantInfo.Zipcode = tcTestData.getRow(1).getCell(1).getStringCellValue().toString();
	    	ApplicantInfo.Email=tcTestData.getRow(1).getCell(10).getStringCellValue().toString();
	        ApplicantInfo.DOB = tcTestData.getRow(1).getCell(3).getStringCellValue().toString();     

		}

		System.out.println("******* Customer Engage CTI Inbound Call Custome status transfer ***************");		  
		consumerpage.login_CE_validations(); 
		Call_Sequences.Custom_Status(); 
		consumerpage.logout_CE_validations();	
		
	}
}


