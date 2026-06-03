package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreateNewOpportunitiesPage extends ProjectSpecificMethods {

	// Global variables for XPath locators
	private static final String OPPORTUNITY_NAME_INPUT = "//label[text()='Opportunity Name']/following::input[1]";
	private static final String CLOSE_DATE_INPUT = "//label[text()='Close Date']/following::input[1]";
	private static final String TODAY_BUTTON = "//button[text()='Today']";
	private static final String STAGE_DROPDOWN = "//label[text()='Stage']/following::button[1]";
	private static final String NEEDS_ANALYSIS_STAGE = "//div[@aria-label='Stage']//span[text()='Needs Analysis']";
	private static final String SAVE_BUTTON = "//button[@name='SaveEdit']";

	public CreateNewOpportunitiesPage enterOpportunityName(String oppName) {
		clearAndType(locateElement(Locators.XPATH, OPPORTUNITY_NAME_INPUT), oppName);
		reportStep("Entered Opportunity Name: " + oppName, "pass");
		return this;
	}

	public CreateNewOpportunitiesPage selectCloseDate() {
		click(locateElement(Locators.XPATH, CLOSE_DATE_INPUT));
		clickUsingJs(locateElement(Locators.XPATH, TODAY_BUTTON));
		reportStep("Selected Close Date as Today", "pass");
		return this;
	}

	public CreateNewOpportunitiesPage selectStage() {
		clickUsingJs(locateElement(Locators.XPATH, STAGE_DROPDOWN));
		click(locateElement(Locators.XPATH, NEEDS_ANALYSIS_STAGE));
		reportStep("Selected Stage as: Needs Analysis", "pass");
		return this;
	}

	public VerifyOpportunity clickSave() {
		click(locateElement(Locators.XPATH, SAVE_BUTTON));
		reportStep("Clicked Save button", "pass");
		return new VerifyOpportunity();
	}
}
