package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC023_EditLead  extends ProjectSpecificMethods{
	
	
	@BeforeTest
	public void setValues() {
		testcaseName="TC023_EditLead";
		testDescription="Verify the Lead can be edited successfully";
		authors="Babu";
		category="Regression";
		excelFileName = "EditLead";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void createLead(String selectApp ,String newName) {
		
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickAppLauncher()
		.clickViewAll()
		.enterSearchField(selectApp)
		.clickSales()
		.clickLeadsTab()
		.clickDropdown()
		.clickEdit()
		.enterNewName(newName)
		.clickSaveButton()
		.verifyUpdatedName(newName);		

	}

}
