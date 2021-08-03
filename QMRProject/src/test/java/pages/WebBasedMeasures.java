package pages;

import org.openqa.selenium.By;

import services.WebDriverServiceImpl;

public class WebBasedMeasures extends WebDriverServiceImpl {
	
	public WebBasedMeasures chooseWebBasedMeasures() throws InterruptedException {

		click(getDriver().findElement(By.xpath("//div[contains(text(),'WEB BASED MEASURES')]")), "WEB BASED MEASURES");
        return this;

	}

	public WebBasedMeasures chooseWBMFacility(String ReportsFacility) throws InterruptedException {
		Thread.sleep(1000);
    selectDropdown(getDriver().findElement(By.id("facId")), ReportsFacility, "Facility");
		
		return this;
	}

	
	public WebBasedMeasures chooseWBMPatientClass(String PClass) throws InterruptedException {
		Thread.sleep(1000);

		 selectDropdown(getDriver().findElement(By.id("wbmPatientClass")), PClass, "Web based PatientClass");
		
		return this;
	}
	
	public WebBasedMeasures chooseWBMPopulation(String Pop) throws InterruptedException {

		
		 selectDropdown(getDriver().findElement(By.id("wbmPopId")), Pop, "Web based Population");
		return this;
	}
	
	public WebBasedMeasures chooseWBMYear(String Qtr) throws InterruptedException {
		
		 selectDropdown(getDriver().findElement(By.id("wbmYearId")), Qtr, "Web Based Year");
		return this;
		
	}
	public WebBasedMeasures chooseWBMQuarter(String Qtr) throws InterruptedException {
		
		 selectDropdown(getDriver().findElement(By.id("wbmQtrId")), Qtr, " Web Based Quarter");
		return this;
		
	}
	
	public WebBasedMeasures chooseWBMMonths(String Mon) throws InterruptedException {
		Thread.sleep(1000);

		 selectDropdown(getDriver().findElement(By.id("wbmMonthId")), Mon, "Months");
		return this;
		
	}
	
	
	public WebBasedMeasures clickBulidSummaryList() throws InterruptedException {
		click(getDriver().findElement(By.id("summarySubmit_label")),"BuildSummaryList");
		Thread.sleep(5000);
		return this;
	}
	
	
	public WebBasedMeasures clickClearSummaryList() throws InterruptedException {
		click(getDriver().findElement(By.xpath("//span[@id='summaryClear_label']")),"ClearSummaryList");
		Thread.sleep(3000);
		return this;
	}
	public WebBasedMeasures assertWebBasedSummaryList() throws InterruptedException {
		assertVerification(getDriver().findElement(By.xpath("//h3[contains(text(),'Summary of Patients')]")),"Summary of Patients");
		Thread.sleep(3000);
		return this;
	}

}
