package com.test;

import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import com.pages.Call_Sequences;
import com.pages.CensusInfo;
import com.pages.CustomerEngageFunctionalityValidations;

import Utility.ExcelHelper;

public class TC_CTI_BF_RL_Conference_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs extends AllScenarios_EG_TC {
	CensusInfo ApplicantInfo = new CensusInfo();
	CensusInfo SpouseInfo = new CensusInfo();
	CensusInfo DomesticPartner = new CensusInfo();

	ArrayList<CensusInfo> DependentsInfo = new ArrayList<CensusInfo>();
	CensusInfo DependentInfo = new CensusInfo();

	public void CE_TC_CTI_BF_RL_Conference_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs(CensusInfo ApplicantInfo)
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

		System.out.println("******* Customer Engage TC_CTI_BF_RL_Conference_To_Agent_Online_Activity_Status_Admin_call_logs_CTI_call_logs ***************");
		consumerpage.login_CE_validations();
		Call_Sequences.BF_RL_Online_confrence_Call();
		consumerpage.logout_CE_validations();

	}

}
