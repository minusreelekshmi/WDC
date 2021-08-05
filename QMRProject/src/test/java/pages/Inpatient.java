package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import services.WebDriverServiceImpl;

public class Inpatient extends WebDriverServiceImpl {
	String patUniqueId;
	public Inpatient chooseAddPatient() throws InterruptedException {

		WebElement choosePatient = getDriver().findElement(By.xpath("//div[contains(text(),'ADD PATIENT')]"));

		Actions a = new Actions(getDriver());
		Thread.sleep(3000);
		a.click(choosePatient).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build()
				.perform();
		Thread.sleep(3000);

		return this;

	}

	public Inpatient chooseFacility(String facility) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("facId")), facility, "facility");

		return this;
	}

   public Inpatient typePatientIdAndmedicalRecNumber(String patId) throws InterruptedException {
		patUniqueId=inPatientIdGenerator();
        type(getDriver().findElement(By.id("patNum")), patUniqueId, "patientId");
        type(getDriver().findElement(By.id("medRecNum")), patUniqueId, "medicalRecNumber");
		Thread.sleep(3000);

		return this;
	}
//
//	public Inpatient typeMedicalRecordNumber(String medNum) {
//		type(getDriver().findElement(By.id("medRecNum")), medNum, "medicalRecNumber");
//
//		return this;
//	}

	public Inpatient typeAdmissionDate(String adDate) throws InterruptedException {
		type(getDriver().findElement(By.id("admDate")), adDate, "admissionDate");
		// Thread.sleep(5000);
		getDriver().findElement(By.id("admDate")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		return this;
	}

//	public Inpatient typeDischargeDate(String disDate) throws InterruptedException {
//		new WebDriverWait(getDriver(), 20).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.id("dischDate")));
//		driver.findElement(By.id("dischDate")).clear();
//		System.out.println("I am gonna discharge");
//		getDriver().findElement(By.id("dischDate")).sendKeys("09212021");
//		//type(getDriver().findElement(By.id("dischDate")),disDate,"dischargeDate");
//		
//		//Thread.sleep(5000);
//		
//		return this;
//	}

	public Inpatient typeDischargeDate(String disDate) throws InterruptedException {
		// new WebDriverWait(getDriver(),
		// 20).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.id("dischDate"))));
		// driver.findElement(By.id("dischDate")).click();
		// getDriver().findElement(By.id("dischDate")).click();
		Thread.sleep(3000);
		type(getDriver().findElement(By.xpath("//input[@id='dischDate']")), disDate, "dischargeDate");
		getDriver().findElement(By.id("dischDate")).sendKeys(Keys.TAB);
		Thread.sleep(4000);

		// Thread.sleep(5000);

		return this;
	}
   //To enter Discharge time
	public Inpatient typeDischargeTime(String dDate) throws InterruptedException {
		type(getDriver().findElement(By.xpath("//input[@id='dischTime']")), dDate, "Discharge date");
		Thread.sleep(3000);
        return this;
	}
	//Select CCN Care settings
	public Inpatient chooseCCNCareSetting(String ccn) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("ccnCareSetting")), ccn, "CCN Care Settings");
        return this;
	}
	//type patient id
	public Inpatient typeBirthDate(String bDate) {
		type(getDriver().findElement(By.id("birthDate")), bDate, "birthDate");

		return this;
	}
    //choose sex
	public Inpatient chooseSex(String sex) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("sexId")), sex, "sex");
        return this;
   }
	//choose race
	
	public Inpatient chooseRace(String race) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("raceId")), race, "Race");
        return this;
   }
	
	public Inpatient chooseHispanicEthinicity(String hispanic) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("hispanicId")), hispanic, "Hispanic Ethinicity");
        return this;
   }
	public Inpatient choosePaymentSource(String payment) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("pymtSrcMedicareCode")), payment, "Payment Source");
        return this;
   }
	public Inpatient choosePostalCode(String postal) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdown(getDriver().findElement(By.id("postCode")), postal, "Postal Code");
        return this;
   }

	// To click Checkbox
	public Inpatient clickCheckBoxSub() throws InterruptedException {
		click(getDriver().findElement(By.id("patCfg-32")), "CheckBoxSub");
		// Thread.sleep(5000);
		return this;
    }
	
	//Enter Diag code
	public Inpatient enterDiagCode(String Diagcode) throws InterruptedException {
		selectDropdown(getDriver().findElement(By.id("icdComboBox")),Diagcode, "CheckBoxSub");
		getDriver().findElement(By.id("icdComboBox")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		// Thread.sleep(5000);
		return this;

	}

	public Inpatient clickSave() throws InterruptedException {
		click(getDriver().findElement(By.id("demoSaveButton_label")), "Save");
		Thread.sleep(5000);
		return this;

	}
	public Inpatient assertInpatient() throws InterruptedException {
		assertVerification(getDriver().findElement(By.xpath("//table[@id='success']//td[2]//b")),"Success");
	    //System.out.println(getDriver().findElement(By.xpath("//table[@id='success']//td[2]//b")).getText());
		Thread.sleep(7000);
		return this;
	}
}
