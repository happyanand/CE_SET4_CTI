package com.test;

import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import com.pages.CensusInfo;
import com.pages.CustomerEngageFunctionalityValidations;
import com.pages.NonSyncAgentPopupPage;


import Utility.ExcelHelper;

public class TC_CTI_CallDisposition_Validation_Disposition_Dropdown extends AllScenarios_EG_TC {
	CensusInfo ApplicantInfo = new CensusInfo();
	CensusInfo SpouseInfo = new CensusInfo();
	CensusInfo DomesticPartner = new CensusInfo();
	
	ArrayList<CensusInfo> DependentsInfo = new ArrayList<CensusInfo>();
	 CensusInfo DependentInfo = new CensusInfo();
	public void EG_TC_Disposition_Dropdown()
			throws ClassNotFoundException, Exception {
		CustomerEngageFunctionalityValidations consumerpage = new CustomerEngageFunctionalityValidations(driver);
		NonSyncAgentPopupPage NonSyncAgentPopupPage = new NonSyncAgentPopupPage(driver);
		ExcelHelper _excelObj = new ExcelHelper();
		XSSFSheet tcTestData = _excelObj.readExcelSheet("TestData", "TC CE1");
		int rowCount = tcTestData.getLastRowNum() - tcTestData.getFirstRowNum();

		if (tcTestData != null) {

			ApplicantInfo.Zipcode = tcTestData.getRow(1).getCell(1).getStringCellValue().toString();
	    	ApplicantInfo.Email=tcTestData.getRow(1).getCell(10).getStringCellValue().toString();
	        ApplicantInfo.DOB = tcTestData.getRow(1).getCell(3).getStringCellValue().toString();     

		}

		System.out.println("******* Customer Engage Validate TC_CTI_CallDisposition_Validation_Disposition_Dropdown ***************");		  
		consumerpage.login_CE_validations();
		NonSyncAgentPopupPage.currenturl();
		consumerpage.new_Tab();
		NonSyncAgentPopupPage.Usertwo();
		consumerpage.login_CE_validations();
		consumerpage.TabSwitchToParent();
		NonSyncAgentPopupPage.validate_Disposition_Dropdown();
		consumerpage.logout_CE_validations();	
		
	}

}
