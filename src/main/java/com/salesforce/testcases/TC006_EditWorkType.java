package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC006_EditWorkType extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC006_EditWorkType";
		testDescription =" Verify that an existing Work Type can be edited and updated successfully";
		authors="Hari";
		category ="Regression";
		excelFileName="EditWorkTypeGroup";
		
	}
	
	@Test( dataProvider = "fetchData" )
	public void runLogin( String search,String name,String editName,String verifyMsg ) {
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickAppLauncher()
		.clickViewAll()
		.enterSearchField(search)
		.clickWorkTypeGroupLink()
		.enterWorkTypeSearchField(name)
		.clickShowActionDD()
		.clickEditLink()
		.enterWorkTypeGroupName(editName)
		.clickWorkTypeSaveButton()
		.verifyWorkTypeGroups(verifyMsg);
		
		
	

	}

}
