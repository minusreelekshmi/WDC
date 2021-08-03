package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import services.WebDriverServiceImpl;

public class PatientDataExtract extends WebDriverServiceImpl {
	

		public PatientDataExtract choosePatientDataExtract() throws InterruptedException {

			click(getDriver().findElement(By.xpath("//div[contains(text(),'PATIENT DATA EXTRACT')]")), " Patient Data Extract");
            return this;

		}
		public PatientDataExtract clickOnQuarter() {
			click(getDriver().findElement(By.xpath("//option[contains(text(),'2021 Q3')]")), "Quarter");
			return this;
			
        }
		public PatientDataExtract clickOnFacility() throws InterruptedException {
			click(getDriver().findElement(By.xpath("//option[contains(text(),'Premier Hospital')]")), "Facility");
			Thread.sleep(300);
			return this;
			
        }
		
		public PatientDataExtract clickOnFindPopulations() throws InterruptedException {
			click(getDriver().findElement(By.id("findPolulation_label")), "Populations");
			Thread.sleep(5000);
			return this;
			
        }
		
		public PatientDataExtract clickOnPopulation() throws InterruptedException {
			click(getDriver().findElement(By.id("ipPatCfgList-44")), "Population");
			
			return this;
		
        }
		
		public PatientDataExtract clickOnFileType() throws InterruptedException {
			click(getDriver().findElement(By.id("fileTypeSelectedList-2")), "File Type Abstract");
			click(getDriver().findElement(By.id("fileTypeSelectedList-3")), "File Type Measure");
			
			return this;
		
        }
		public PatientDataExtract clickOnFileOptions() throws InterruptedException {
			click(getDriver().findElement(By.id("combAbstAndMeasureInFileId")), "File Options");
			
			return this;
		
        }
		public PatientDataExtract clickOnRunReport() throws InterruptedException {
			click(getDriver().findElement(By.id("RunReport_label")), "File Options");
			Thread.sleep(2000);
			return this;
		
        }
		public PatientDataExtract assertPatineDataExtract() throws InterruptedException {
			assertVerification(getDriver().findElement(By.xpath("//table[@id='success']//td[2]//b")),"Success");
		    //System.out.println(getDriver().findElement(By.xpath("//table[@id='success']//td[2]//b")).getText());
			Thread.sleep(3000);
			return this;
		}
	
}
