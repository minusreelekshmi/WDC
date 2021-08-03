package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import services.WebDriverServiceImpl;

public class Patientreview extends WebDriverServiceImpl {
	public Patientreview choosePatientReview() throws InterruptedException {
		
		WebElement PatientReview = getDriver().findElement(By.xpath("//div[contains(text(),'SEARCH')]"));
		
		Actions a=new Actions(getDriver());
		Thread.sleep(5000);
		a.click(PatientReview).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		
		return this;
		
	}
	public Patientreview choosepopulationtype() throws InterruptedException {
		//getDriver().findElement(By.id("tmpdir_CheckBox_14")).click();
		Thread.sleep(5000);
//		WebElement population=getDriver().findElement(By.xpath("//body/div[@id='main']/div[@id='patientReviewMainWrapper']/div[@id='mainSection']/div[@id='dijit_layout_ContentPane_0']/div[@id='measureSetTree']/div[@id='MeasureSetTree']/div[@id='tmpdir__CheckBoxTreeNode_0']/div[2]/div[1]/div[1]/img[1]"));
//		Actions a=new Actions(getDriver());
//		Thread.sleep(3000);
//		a.click(population).click();
//          Thread.sleep(3000);
		click(getDriver().findElement(By.xpath("//body/div[@id='main']/div[@id='patientReviewMainWrapper']/div[@id='mainSection']/div[@id='dijit_layout_ContentPane_0']/div[@id='measureSetTree']/div[@id='MeasureSetTree']/div[@id='tmpdir__CheckBoxTreeNode_0']/div[2]/div[1]/div[1]/img[1]")), "Population");
		Thread.sleep(1000);
		click(getDriver().findElement(By.xpath("//input[@id='tmpdir_CheckBox_3']")), "Population");
		return this;
		
	}
		
//	public Patientreview choosepopulation(String choosepopulation) throws InterruptedException {
//		//getDriver().findElement(By.id("tmpdir_CheckBox_14")).click();
//		Thread.sleep(3000);
//		click(getDriver().findElement(By.id("tmpdir_CheckBox_14")), "Population");
//		return this;
//	}
	
	public Patientreview chooseRepFacility(String chooseRepFacility) throws InterruptedException {
	    //getDriver().findElement(By.xpath("//span[contains(text(),'Select Facilities')]")).click();
//		getDriver().findElement(By.id("ms-opt-10")).click();
		//WebElement facility=getDriver().findElement(By.xpath("//span[contains(text(),'Select Facilities')]"));
		Thread.sleep(3000);
		click(getDriver().findElement(By.xpath("//span[contains(text(),'Select Facilities')]")), "FacilityDropdown");
		Thread.sleep(1000);
		click(getDriver().findElement(By.id("ms-opt-10")), "Facility");
		getDriver().findElement(By.id("ms-opt-10")).sendKeys(Keys.ESCAPE);
		//getDriver().findElement(By.id("patientReviewForm")).click();
		//click(getDriver().findElement(By.xpath("//span[contains(text(),'Select Facilities')]")), chooseRepFacility, "facility");
		return this;
	}
	

		

	
	public Patientreview typeQuarterId(String qtrId) throws InterruptedException {
		Thread.sleep(1000);
		 getDriver().findElement(By.id("quarterId")).clear();
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("quarterId")),qtrId,"QuarterId");
		
		return this;
	}
	
	

	public Patientreview typePatientReview(String patRev) {
		selectDropdown(getDriver().findElement(By.id("patientReviewTypeId")),patRev,"PatientReview");
		
		return this;
	}
	
	
	
	public Patientreview typePatientStatus(String patStat) {
		selectDropdown(getDriver().findElement(By.id("patientStatusId")),patStat,"PatientReview");
		
		return this;
	}

	public Patientreview typeAbstractorVerified(String patStat) {
		selectDropdown(getDriver().findElement(By.id("patientStatusId")),patStat,"PatientReview");
		
		return this;
	}
		
		public Patientreview typeMeasureProfile(String mProf) {
			selectDropdown(getDriver().findElement(By.id("measureProfileId")),mProf,"MeasureProfile");
			
			return this;
		}
		
		
		public Patientreview typeSample(String samp) {
			selectDropdown(getDriver().findElement(By.id("measureProfileId")),samp,"Sample");
			
			return this;
		}
	

	
	public Patientreview clickBuildSummaryList() throws InterruptedException {
		
		click(getDriver().findElement(By.id("dijit_form_Button_0_label")),"Save");
		Thread.sleep(10000);
		return this;
	
	}
	public Patientreview assertPatientReview() throws InterruptedException {
		assertVerification(getDriver().findElement(By.xpath("//span[contains(text(),'Review Results')]")),"Patient Level Review Results");
	    //System.out.println(getDriver().findElement(By.xpath("//table[@id='success']//td[2]//b")).getText());
		Thread.sleep(3000);
		return this;
	}
}
