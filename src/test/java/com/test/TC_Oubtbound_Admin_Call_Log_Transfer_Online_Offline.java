package com.test;

import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import com.pages.Call_Sequences;
import com.pages.CensusInfo;
import com.pages.CustomerEngageFunctionalityValidations;

import Utility.ExcelHelper;

public class TC_Oubtbound_Admin_Call_Log_Transfer_Online_Offline extends AllScenarios_EG_TC {
	CensusInfo ApplicantInfo = new CensusInfo();
	CensusInfo SpouseInfo = new CensusInfo();
	CensusInfo DomesticPartner = new CensusInfo();

	ArrayList<CensusInfo> DependentsInfo = new ArrayList<CensusInfo>();
	CensusInfo DependentInfo = new CensusInfo();

	public void Outbound_Admin_Call_Log_Online_Transfer(CensusInfo ApplicantInfo)
			throws ClassNotFoundException, Exception {
		CustomerEngageFunctionalityValidations consumerpage = new CustomerEngageFunctionalityValidations(driver);
		Call_Sequences Call_Sequences = new Call_Sequences(driver);
		ExcelHelper _excelObj = new ExcelHelper();
		XSSFSheet tcTestData = _excelObj.readExcelSheet("TestData", "TC CE1");
		int rowCount = tcTestData.getLastRowNum() - tcTestData.getFirstRowNum();

		if (tcTestData != null) { 

			ApplicantInfo.Zipcode = tcTestData.getRow(1).getCell(1).getStringCellValue().toString();
			ApplicantInfo.Email = tcTestData.getRow(1).getCell(10).getStringCellValue().toString();
			ApplicantInfo.DOB = tcTestData.getRow(1).getCell(3).getStringCellValue().toString();

		}

		System.out.println("******* Customer Engage CTI Outbound Call  ***************");
		consumerpage.login_CE_validations();
		Call_Sequences.Out_Bound_Transfer(); 
		consumerpage.logout_CE_validations();

	} 
 
}
