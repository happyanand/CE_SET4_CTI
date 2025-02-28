package com.test;

import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import com.pages.CensusInfo;
import com.pages.MarketingURLGeneratingandAccess;

import Utility.ExcelHelper;
public class System_Cleaning_Script extends AllScenarios_EG_TC {
	CensusInfo ApplicantInfo = new CensusInfo();
	CensusInfo SpouseInfo = new CensusInfo();
	CensusInfo DomesticPartner = new CensusInfo();
	
	ArrayList<CensusInfo> DependentsInfo = new ArrayList<CensusInfo>();

	public void EG_RE_RemoveFiles(CensusInfo ApplicantInfo, CensusInfo SpouseInfo)
			throws ClassNotFoundException, Exception {
		MarketingURLGeneratingandAccess consumerpage = new MarketingURLGeneratingandAccess(driver);
		ExcelHelper _excelObj = new ExcelHelper();
		XSSFSheet tcTestData = _excelObj.readExcelSheet("TestData", "TestCase Regression 1");

		// CensusInfo DependentInfo = new CensusInfo();
		//test = extent.createTest("Test Case 1.B");
		// get all rows in the sheet
		int rowCount = tcTestData.getLastRowNum() - tcTestData.getFirstRowNum();

		if (tcTestData != null) {

//			ApplicantInfo.Zipcode = tcTestData.getRow(1).getCell(1).getStringCellValue().toString();

//	       
		}
		System.out.println("******* True Coverage Regression - Cleanup ***************");	
		MarketingURLGeneratingandAccess.removeOldReports();
		MarketingURLGeneratingandAccess.deleteOldDownloadReports();
		MarketingURLGeneratingandAccess.deleteOldScreenshots();
	}

}
