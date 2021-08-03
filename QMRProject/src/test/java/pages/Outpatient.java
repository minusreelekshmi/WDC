package pages;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import services.WebDriverServiceImpl;

public class Outpatient extends WebDriverServiceImpl {
	String patUniqueId;
	public Outpatient chooseAddPatient() throws InterruptedException {

		Thread.sleep(3000);
		WebElement choosePatient = getDriver().findElement(By.xpath("//div[contains(text(),'ADD PATIENT')]"));

		Actions a = new Actions(getDriver());
		Thread.sleep(3000);
		a.click(choosePatient).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);

		return this;

	}

	public Outpatient chooseFacility(String Facility) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("facId")), Facility, "facility");

		return this;
	}

	public Outpatient typePatientIdAndMedicalRecordNumber(String patId) throws InterruptedException {

		patUniqueId=outPatientIdGenerator();
        type(getDriver().findElement(By.id("patNum")), patUniqueId, "patientId");
        type(getDriver().findElement(By.id("medRecNum")), patUniqueId, "medicalRecNumber");
		Thread.sleep(3000);

		return this;
	}
//
//	public Outpatient typeMedicalRecordNumber(String medNum) throws InterruptedException {
//		type(getDriver().findElement(By.id("medRecNum")), medNum, "medicalRecNumber");
//		Thread.sleep(3000);
//
//		return this;
//	}

	public Outpatient typeEncounterDate(String eDate) throws InterruptedException {
		type(getDriver().findElement(By.id("encDate")), eDate, "admissionDate");
		getDriver().findElement(By.id("encDate")).sendKeys(Keys.TAB);
		Thread.sleep(3000);

		return this;
	}
	public Outpatient typeArrivalTime(String aTime) {
		type(getDriver().findElement(By.xpath("//input[@id='arrivalTime']")), aTime, "Arrival Time");
        return this;
	}

	public Outpatient typeBirthDate(String bDate) throws InterruptedException {
		
		type(getDriver().findElement(By.id("birthDate")), bDate, "birthDate");
		Thread.sleep(3000);
		return this;
	}

	public Outpatient chooseSex(String sex) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("sexId")), sex, "sex");
        return this;
    }
	public Outpatient chooseOPRace(String race) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("raceId")), race, "Race");
        return this;
   }
	
	public Outpatient chooseOPHispanicEthinicity(String hispanic) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("hispanicId")), hispanic, "Hispanic Ethinicity");
        return this;
   }
	public Outpatient chooseOPPaymentSource(String payment) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("pymtSrcMedicareCode")), payment, "Payment Source");
        return this;
   }
	public Outpatient chooseOPPostalCode(String postal) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("postCode")), postal, "Postal Code");
        return this;
   }
	public Outpatient chooseOPDischargeCode(String Discode) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("qmrDischCode")), Discode, "Discharge Code");
        return this;
   }
	public Outpatient chooseOPDischargeStatus(String disstatus) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("dischStatCode")), disstatus, "Discharge Status");
        return this;
   }
	

	// input[@id='patCfg-38']
	public Outpatient clickCheckBoxASR() throws InterruptedException {
		click(getDriver().findElement(By.id("patCfg-62")), "CheckBoxASR");
		// Thread.sleep(5000);
		return this;

	}

	public Outpatient clickSave() throws InterruptedException {
		click(getDriver().findElement(By.id("demoSaveButton_label")), "Save");
		Thread.sleep(5000);
		return this;

	}
	public Outpatient assertOutpatient() throws InterruptedException {
		assertVerification(getDriver().findElement(By.xpath("//table[@id='success']//td[2]//b")),"Success");
	    //System.out.println(getDriver().findElement(By.xpath("//table[@id='success']//td[2]//b")).getText());
		Thread.sleep(5000);
		return this;
	}

}
