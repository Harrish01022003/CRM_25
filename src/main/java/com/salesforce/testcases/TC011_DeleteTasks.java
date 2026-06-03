package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC011_DeleteTasks extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC011_DeleteTasks";
		testDescription ="Verify that an existing Task can be deleted successfully";
		authors="Babu";
		category ="Smoke";
		excelFileName="DeleteTask";
	}
	
	@Test(dataProvider = "fetchData")
	public void runDeleteTasks(String app,String text) {
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickAppLauncher()
		.clickViewAll()
		.enterSearchField(app)
		.clickSales()
		.clickTasksTab()
		//.selectRecentlyViewed()
		.selectTableView()
		.clickEditDropdown()
		.clickDeleteButton()
		.verifyTaskDeleted(text);

	}
}
