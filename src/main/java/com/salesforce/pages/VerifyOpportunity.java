package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class VerifyOpportunity extends ProjectSpecificMethods {

    private static final String TOAST_MESSAGE = "//span[@data-aura-class='forceActionsText']";
    private static final String OPPORTUNITY_STAGE = "//span[@data-cell-type='sfaOutputStageName']//span";
    public static String opportunityName;
    public static String opportunityStage;
    
    public void verifyOpportunityCreated() {
        opportunityName = getElementText(locateElement(Locators.XPATH, TOAST_MESSAGE));
        System.out.println("New Opportunity Created: " + opportunityName);
        reportStep("Verified the Opportunity creation successfully", "pass");
    }

    public void verifyOpportunityEdited() {
    	waitForApperance(locateElement(Locators.XPATH,OPPORTUNITY_STAGE));
        opportunityStage = getElementText(locateElement(Locators.XPATH, OPPORTUNITY_STAGE));
        System.out.println("Opportunity Edited: " + opportunityStage);
    }

    public void verifyOpportunityDeleted() {
        String deletedMessage = getElementText(locateElement(Locators.XPATH, TOAST_MESSAGE));
        System.out.println("Opportunity Deleted: " + deletedMessage);
        reportStep("Verified the Opportunity deletion successfully", "pass");
    }
}
