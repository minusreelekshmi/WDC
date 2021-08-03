package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import services.WebDriverServiceImpl;

public class Searchforpatient extends WebDriverServiceImpl {

	public Searchforpatient chooseSearchPatient() throws InterruptedException {
        
		Thread.sleep(3000);
		WebElement searchPatient = getDriver().findElement(By.xpath("//div[contains(text(),'SEARCH')]"));

		Actions a = new Actions(getDriver());
		Thread.sleep(3000);
		a.click(searchPatient).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);

		return this;

	}
//---------------------------------QUICK SEARCH--------------------------------------------------------//	

//To Select Facility dropdown
	public Searchforpatient chooseFacilityId(String QuickSearchFacility) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("quickSearchFacilityId")), QuickSearchFacility, "FacilityId");

		return this;
	}

	// To give the PatientId
	public Searchforpatient choosePatientident(String QuickSearchPatId) throws InterruptedException {
		Thread.sleep(1000);

		selectDropdown(getDriver().findElement(By.id("quickSearchPatientIden")), QuickSearchPatId, "Patientident");

		return this;
	}

//To click Find patient button
	public Searchforpatient clickFindPatient() throws InterruptedException {
		click(getDriver().findElement(By.id("dijit_form_Button_0_label")), "findPatient");
		Thread.sleep(5000);
		return this;

	}

//-----------------------------SEARCH FOR-------------------------------------------------------//
// type patient id
	public Searchforpatient typePatId(String SearchForPatId) throws InterruptedException {
		Thread.sleep(1000);
		
		selectDropdown(getDriver().findElement(By.id("patientIden")), SearchForPatId, "Patient Id");

		return this;
	}
//
//	 type MedicalRecNumber
	public Searchforpatient typeMedRNum(String SearchForMedRNum) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("medicalRecordNum")), SearchForMedRNum, "MedicalRecNumber");

		return this;
	}

	
//	// Start Encounter date
	public Searchforpatient typeAdEncStartDate(String AdEncStartDate) throws InterruptedException {
		Thread.sleep(1000);
		getDriver().findElement(By.id("patientIden")).clear();
		getDriver().findElement(By.id("medicalRecordNum")).clear();
		selectDropdown(getDriver().findElement(By.id("encDateStart")), AdEncStartDate, "encounterEndDate");

		return this;
	}

	// End Encounter date
	public Searchforpatient typeAdEncEndDate(String AdEncEndDate) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("encDateEnd")), AdEncEndDate, "encounterEndDate");

		return this;
	}
//
//	Discharge Start Encounter date
	public Searchforpatient typeDisEncStartDate(String DisEncStartDate) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("dischDateStart")), DisEncStartDate, "encounterEndDate");

		return this;
	}
//
//	Discharge End Encounter date
	public Searchforpatient typeDisEncEndDate(String EncEndDate) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("dischDateEnd")), EncEndDate, "encounterEndDate");

		return this;
	}
	
//  Click build search
	public Searchforpatient clickBuildSearch() throws InterruptedException {
		click(getDriver().findElement(By.xpath("//span[contains(text(),'Build Search List')]")), "Build Search");
		Thread.sleep(10000);
		return this;
	}
//	public Searchforpatient clearBuildSearch() throws InterruptedException {
//	    Thread.sleep(3000);	
//		click(getDriver().findElement(By.id("dijit_form_Button_2_label")), "Clear Search");
//		return this;
//	}
   public Searchforpatient clickonpatientid() throws InterruptedException {
	   
	   click(getDriver().findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]")), "Click Patient");
	   Thread.sleep(5000);
       return this;
	   
   }
   public Searchforpatient assertSearchforpatient() throws InterruptedException {
		assertVerification(getDriver().findElement(By.xpath("//span[@id='demoSaveButton_label']")),"Save");
	    //System.out.println(getDriver().findElement(By.xpath("//table[@id='success']//td[2]//b")).getText());
		Thread.sleep(3000);
		return this;
	}
 //span[contains(text(),'Results')]
   public Searchforpatient assertSearchforpatient2() throws InterruptedException {
		assertVerification(getDriver().findElement(By.xpath("//span[contains(text(),'Results')]")),"Results");
	    //System.out.println(getDriver().findElement(By.xpath("//table[@id='success']//td[2]//b")).getText());
		Thread.sleep(3000);
		return this;
	}
   
}
