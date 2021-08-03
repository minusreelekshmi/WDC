package pages;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import services.WebDriverServiceImpl;

public class Summary extends WebDriverServiceImpl{
	SoftAssert softAssertion1;
	
	public Summary chooseFacility(String ReportsFacility) throws InterruptedException {
		Thread.sleep(1000);
    selectDropdown(getDriver().findElement(By.id("facId")), ReportsFacility, "Facility");
		
		return this;
	}

	
	public Summary choosePatientClass(String PClass) throws InterruptedException {
		Thread.sleep(1000);

		 selectDropdown(getDriver().findElement(By.id("patientClass")), PClass, "PatientClass");
		
		return this;
	}
	
	public Summary choosePopulation(String Pop) throws InterruptedException {

		
		 selectDropdown(getDriver().findElement(By.id("popId")), Pop, "Population");
		return this;
	}
	
	public Summary chooseQuarter(String Qtr) throws InterruptedException {
		
		 selectDropdown(getDriver().findElement(By.id("qtrId")), Qtr, "Quarter");
		return this;
		
	}
	
	public Summary chooseMonths(String Mon) throws InterruptedException {
		Thread.sleep(1000);

		 selectDropdown(getDriver().findElement(By.id("monthId")), Mon, "Months");
		return this;
		
	}
	
	
	public Summary clickBulidSummaryList() throws InterruptedException {
		click(getDriver().findElement(By.xpath("//span[@id='summarySubmit_label']")),"BuildSummaryList");
		Thread.sleep(3000);
		return this;
	}
	
	
	public Summary clickClearSummaryList() throws InterruptedException {
		click(getDriver().findElement(By.xpath("//span[@id='summaryClear_label']")),"ClearSummaryList");
		Thread.sleep(3000);
		return this;
	}
	public Summary assertSummaryList() throws InterruptedException {
		//assertVerification(getDriver().findElement(By.xpath("//h3[contains(text(),'Summary of Patients')]")),"Summary of Patients");
		
softAssertVerification(getDriver().findElement(By.xpath("//h3[contains(text(),'Summary of Patients')]")), "Summary of Pa");       
		Thread.sleep(3000);
		return this;
	}           
	
	
	
	/*public Summary chooseRecordStatus(String recordStatus) throws InterruptedException {
		Thread.sleep(3000);
		click(getDriver().findElement(By.id("ix_recordstatus")),"Record Status");
		selectDropDownUsingVisibleText(((getDriver().findElement(By.id("ix_recordstatus_i")))),recordStatus,"Record Status");
		getDriver().findElement(By.id("ix_recordstatus")).sendKeys(Keys.TAB);
		verifyExactText(getDriver().findElement(By.id("ix_recordstatus")),recordStatus,"Record Status"); 
		return this;
	}*/
	
	/*public Summary verifyContactAccAssoTerminationReasonInSubGridView(String terminationReason) {
		verifyExactText(getDriver().findElement(By.xpath("//*[@id='crmGrid_ix_contact_ix_contactaccountassociation_Contact_divDataArea']/div/table/tbody/tr/td[6]/nobr")),terminationReason,"Termination Reason in Contact Account Association Sub Grid View"); 
		return this;
	}
	
	public Summary verifyErrorMsgForDuplicateCAA(String ErrMsg) throws InterruptedException {
		switchToDefaultContent();
		switchToFrame(getDriver().findElement(By.id("InlineDialog_Iframe")));
		verifyPartialText(getDriver().findElement(By.id("ErrorMessage")),ErrMsg,"Error Message"); 
		Thread.sleep(3000);
		return this;
	}
	
	public Summary verifyErrorInCommPublivationn() {	
		switchToFrame(getDriver().findElement(By.id("NavBarGloablQuickCreate")));
		verifyDisplayed(getDriver().findElement(By.xpath("//*[@id='ix_communicationpublication_warnSpan']")),"Error in Job Function");
	//	verifyExactText(getDriver().findElement(By.xpath("//*[@id='ix_communicationpublication_warnSpan']")),"Test","Termination Status in Communication Publications Grid"); 
		return this;
	}*/
	
	/*for (String id : ids) {
		input(By.id("patientIden")).clearField();
		// Without this click Firefox behaves strange and won't type correctly
		input(By.id("patientIden")).click();
		input(By.id("patientIden")).sendKeys(id);

		input(By.id("facilityId")).clearField();
		// Without this click Firefox behaves strange and won't type correctly
		input(By.id("facilityId")).click();
		input(By.id("facilityId")).sendKeys(facId);
		
		findElement(By.id("dijit_form_Button_1")).click();			
		findElement(By.cssSelector("a.patientIdLink")).click();
		
		findElement(By.cssSelector("#patientTabs_tablist_" + getMeasureSet() + " > span.tabLabel")).click();
		
		// We need to differentiate between positive and negative test cases
		if (id.contains("POS")) {
			//assertThat("Rule failed to fire for patient: " + id, pg.executeScript("validateRuleFired(skipRuleId, " + pg.getMeasureSet() + ")"), Matchers.is(true));
		} else if (id.contains("NEG")) {
			//assertThat("Rule inappropriately fired for patient: " + id, pg.executeScript("validateRuleFired(skipRuleId, " + pg.getMeasureSet() + ")"), Matchers.is(false));
		}
		
		executeScript("menu.returnToSearchResults()");
	}*/

}
