package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreateLegalEntityPage extends ProjectSpecificMethods {

	public CreateLegalEntityPage selectSalutation() {
		click(locateElement(Locators.XPATH,
				"(//div[contains(@class,'slds-combobox__form-element slds-input-has-icon')]//button)[2]"));
		clickUsingJs(locateElement(Locators.XPATH, "//span[text()='Mr.']"));
		return this;
	}

	public CreateLegalEntityPage enterLegalEntityName(String fname) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Legal Entity Name']/following::input"), fname);
		return this;
	}

	public CreateLegalEntityPage enterLastName(String lname) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Last Name']/following::input"), lname);
		return this;
	}

	public VerifyNewContact clickSave() {
		click(locateElement(Locators.XPATH, "(//button[text()='Save'])[2]"));
		return new VerifyNewContact();
	}

}
