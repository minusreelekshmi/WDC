package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import services.WebDriverServiceImpl;

public class HbipsCensus extends WebDriverServiceImpl {
	

		public HbipsCensus chooseHbipsCensus() throws InterruptedException {

			click(getDriver().findElement(By.xpath("//div[contains(text(),'HBIPS CENSUS')]")), "HBIPS CENSUS");
            return this;

		}
		public HbipsCensus chooseFacility(String facility) throws InterruptedException {
			Thread.sleep(1000);
			selectDropdown(getDriver().findElement(By.id("clientAndFacilityId")), facility, "facility");

			return this;
		}
		public HbipsCensus chooseMonthYear(String monyear) throws InterruptedException {
			Thread.sleep(1000);
			selectDropdown(getDriver().findElement(By.id("yearAndMonthId")), monyear, "Month/Year");

			return this;
		}
		public HbipsCensus choosecensusPupulation(String population) throws InterruptedException {
			Thread.sleep(1000);
			selectDropdown(getDriver().findElement(By.id("censusPopulation")), population, "Census Population");

			return this;
		}
		public HbipsCensus clickSubmit() throws InterruptedException {
			Thread.sleep(1000);
			click(getDriver().findElement(By.id("dijit_form_Button_0_label")), "Month/Year");

			return this;
		}
		public HbipsCensus assertHbipsCensus() throws InterruptedException {
			assertVerification(getDriver().findElement(By.xpath("//span[@id='censusSaveButton_label']")),"Save");
		    //System.out.println(getDriver().findElement(By.xpath("//table[@id='success']//td[2]//b")).getText());
			Thread.sleep(3000);
			return this;
		}
		
	
}
