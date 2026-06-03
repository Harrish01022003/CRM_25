package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.github.javafaker.Faker;
import com.salesforce.pages.LoginPage;

public class TC022_CreateLead  extends ProjectSpecificMethods{
	
	Faker faker = new Faker();
	
	@BeforeTest
	public void setValues() {
		testcaseName="TC022_CreateLead";
		testDescription="Verify that a new Lead is created successfully";
		authors="Hari";
		category="Regression";
		excelFileName = "CreateLead";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void createLead(String selectApp ,String firstName,String lastName,String cName) {
		
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickAppLauncher()
		.clickViewAll()
		.enterSearchField(selectApp)
		.clickSales()
		.clickLeadsTab()
		.clickNewLeadsButton()
		.selectSalutationDropdown()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterCompanyName(cName)
		.clickSaveLead()
		.verifyLeadCreated(firstName);
		

	}

}
