package com.test;

import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import com.pages.Call_Sequences;
import com.pages.CensusInfo;
import com.pages.CustomerEngageFunctionalityValidations;
import com.pages.PhoneNumberValidations;

import Utility.ExcelHelper;

public class TC_CTI_BF_RG_Transfer_to_Agent_Offline_Activity_Status_Admin_call_logs_CTI_call_logs extends AllScenarios_EG_TC {
	CensusInfo ApplicantInfo = new CensusInfo();
	CensusInfo SpouseInfo = new CensusInfo();
	CensusInfo DomesticPartner = new CensusInfo();

	ArrayList<CensusInfo> DependentsInfo = new ArrayList<CensusInfo>();
	CensusInfo DependentInfo = new CensusInfo();

	public void CE_TC_CTI_BF_RG_Transfer_to_Agent_Offline()
			throws ClassNotFoundException, Exception {
		CustomerEngageFunctionalityValidations consumerpage = new CustomerEngageFunctionalityValidations(driver);
		PhoneNumberValidations PhoneNumberValidations = new PhoneNumberValidations(driver);
		ExcelHelper _excelObj = new ExcelHelper();
		XSSFSheet tcTestData = _excelObj.readExcelSheet("TestData", "TC CE1");
		int rowCount = tcTestData.getLastRowNum() - tcTestData.getFirstRowNum();

		if (tcTestData != null) {

			ApplicantInfo.Zipcode = tcTestData.getRow(1).getCell(1).getStringCellValue().toString();
			ApplicantInfo.Email = tcTestData.getRow(1).getCell(10).getStringCellValue().toString();
			ApplicantInfo.DOB = tcTestData.getRow(1).getCell(3).getStringCellValue().toString();

		}

		System.out.println("******* Customer Engage TC_CTI_BF_RG_Transfer_to_Agent_Offline_Activity_Status_Admin_call_logs_CTI_call_logs  ***************");
		consumerpage.login_CE_validations();
		PhoneNumberValidations.BF_RG_Transfer_offline();
		consumerpage.logout_CE_validations();

	}

}
