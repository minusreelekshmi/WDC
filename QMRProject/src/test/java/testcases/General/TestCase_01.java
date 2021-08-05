package testcases.General;

import org.testng.annotations.Test;

import pages.HbipsCensus;
import pages.Inpatient;
import pages.LoginPage;
import pages.Outpatient;
import pages.PatientDataExtract;
import pages.Patientreview;
import pages.Searchforpatient;
import pages.Summary;
import pages.WebBasedMeasures;
import utils.DataInputProvider;

//import org.openqa.selenium.support.PageFactory;

public class TestCase_01 {

	// DataFormatter formatter = new DataFormatter();

	@Test

	public void loginWDC(int iRowNumber, String sDataSheetName) throws Exception, InterruptedException {

//-----------------------------------------------LOGIN-------------------------------------------------------		  

		new LoginPage().typeUsername(DataInputProvider.getCellData_ColName(iRowNumber, "username", sDataSheetName))
				.clickNext().typePassword(DataInputProvider.getCellData_ColName(iRowNumber, "password", sDataSheetName))
				.clickSignIn();

//-----------------------------------------GENERATE SUMMARY-------------------------------------------------------		  


			new Summary()
					.chooseFacility(DataInputProvider.getCellData_ColName(iRowNumber, "Facility", sDataSheetName))
			
			        .choosePatientClass(DataInputProvider.getCellData_ColName(iRowNumber, "PatientClass", sDataSheetName))
			        .choosePopulation(DataInputProvider.getCellData_ColName(iRowNumber, "Population", sDataSheetName))
			        .chooseQuarter(DataInputProvider.getCellData_ColName(iRowNumber, "Quarter", sDataSheetName))
			        .chooseMonths(DataInputProvider.getCellData_ColName(iRowNumber, "Months", sDataSheetName))
			        .clickBulidSummaryList().assertSummaryList();
//-----------------------------------------IN PATIENT CREATION-------------------------------------------------------		  

		new Inpatient()
		        .chooseAddPatient()
				.chooseFacility(DataInputProvider.getCellData_ColName(iRowNumber, "facility", sDataSheetName))
				.typePatientIdAndmedicalRecNumber(DataInputProvider.getCellData_ColName(iRowNumber, "patientId", sDataSheetName))				//.typeMedicalRecordNumber(DataInputProvider.getCellData_ColName(iRowNumber, "medicalRecNumber", sDataSheetName))
				.typeAdmissionDate(DataInputProvider.getCellData_ColName(iRowNumber, "admissionDate", sDataSheetName))
				.typeDischargeDate(DataInputProvider.getCellData_ColName(iRowNumber, "DisEncDate", sDataSheetName))
				.typeDischargeTime(DataInputProvider.getCellData_ColName(iRowNumber, "DisChargeTime", sDataSheetName))
				.chooseCCNCareSetting(DataInputProvider.getCellData_ColName(iRowNumber, "CCN", sDataSheetName))
				.typeBirthDate(DataInputProvider.getCellData_ColName(iRowNumber, "birthDate", sDataSheetName))
				.chooseSex(DataInputProvider.getCellData_ColName(iRowNumber, "sex", sDataSheetName))
				.chooseRace(DataInputProvider.getCellData_ColName(iRowNumber, "Race", sDataSheetName))
				.chooseHispanicEthinicity(DataInputProvider.getCellData_ColName(iRowNumber, "HispanicEthinicity", sDataSheetName))
				.choosePaymentSource(DataInputProvider.getCellData_ColName(iRowNumber, "PaymentSource", sDataSheetName))
				.choosePostalCode(DataInputProvider.getCellData_ColName(iRowNumber, "PostalCode", sDataSheetName))
		        .clickCheckBoxSub()
		        .clickSave()
				.assertInpatient();

//-------------------------------------------OUT PATIENT CREATION---------------------------------------------------------		  
		new Outpatient()
		        .chooseAddPatient()
				.chooseFacility(DataInputProvider.getCellData_ColName(iRowNumber, "facility", sDataSheetName))
				.typePatientIdAndMedicalRecordNumber(DataInputProvider.getCellData_ColName(iRowNumber, "patientId", sDataSheetName))
				//.typeMedicalRecordNumber(DataInputProvider.getCellData_ColName(iRowNumber, "medicalRecNumber", sDataSheetName))
				.typeEncounterDate(DataInputProvider.getCellData_ColName(iRowNumber, "admissionDate", sDataSheetName))
				.typeArrivalTime(DataInputProvider.getCellData_ColName(iRowNumber, "DisChargeTime", sDataSheetName))
				.typeBirthDate(DataInputProvider.getCellData_ColName(iRowNumber, "birthDate", sDataSheetName))
				.chooseSex(DataInputProvider.getCellData_ColName(iRowNumber, "sex", sDataSheetName))
				.chooseOPRace(DataInputProvider.getCellData_ColName(iRowNumber, "Race", sDataSheetName))
				.chooseOPHispanicEthinicity(DataInputProvider.getCellData_ColName(iRowNumber, "HispanicEthinicity", sDataSheetName))
				.chooseOPPaymentSource(DataInputProvider.getCellData_ColName(iRowNumber, "PaymentSource", sDataSheetName))
				.chooseOPPostalCode(DataInputProvider.getCellData_ColName(iRowNumber, "PostalCode", sDataSheetName))
				.chooseOPDischargeCode(DataInputProvider.getCellData_ColName(iRowNumber, "Discode", sDataSheetName))
				.chooseOPDischargeStatus(DataInputProvider.getCellData_ColName(iRowNumber, "Disstatus", sDataSheetName))
				.clickCheckBoxASR()
				.clickSave()
				.assertOutpatient();
//----------------------------------------------PATIENT REVIEW---------------------------------------------------------		  
		   new Patientreview()
		      .choosePatientReview()
		      .choosepopulationtype()
		      .chooseRepFacility(DataInputProvider.getCellData_ColName(iRowNumber,"Facility",sDataSheetName))
		      .typeQuarterId(DataInputProvider.getCellData_ColName(iRowNumber,"Quarter",sDataSheetName))
		      .typePatientReview(DataInputProvider.getCellData_ColName(iRowNumber,"Patientreviewtype",sDataSheetName))
	          .clickBuildSummaryList()
	          .assertPatientReview();
//-----------------------------------------------QUICK SEARCH---------------------------------------------------------		  
		new Searchforpatient()
		      .chooseSearchPatient()
		      .chooseFacilityId(DataInputProvider.getCellData_ColName(iRowNumber,"Facility",sDataSheetName))
		      .choosePatientident(DataInputProvider.getCellData_ColName(iRowNumber, "patientId", sDataSheetName))
		      .clickFindPatient()
		      .assertSearchforpatient();
//-------------------------------------------------SEARCH FOR-------------------------------------------------------
		 new Searchforpatient()
		     .chooseSearchPatient()
		     .typePatId(DataInputProvider.getCellData_ColName(iRowNumber,"patientId",sDataSheetName))
		     .typeMedRNum(DataInputProvider.getCellData_ColName(iRowNumber,"medicalRecNumber",sDataSheetName))
	         .clickBuildSearch()
		     //.clickonpatientid()
		     .assertSearchforpatient2();
//-----------------------------------------SEARCH FOR-BASED ON DATES------------------------------------------------		 
       new Searchforpatient()
            .chooseSearchPatient()
            .typeAdEncStartDate(DataInputProvider.getCellData_ColName(iRowNumber,"AdEncdate",sDataSheetName))
            .typeAdEncEndDate(DataInputProvider.getCellData_ColName(iRowNumber,"DisEncdate",sDataSheetName))
            .typeDisEncStartDate(DataInputProvider.getCellData_ColName(iRowNumber,"AdEncdate",sDataSheetName))
            .typeDisEncEndDate(DataInputProvider.getCellData_ColName(iRowNumber,"DisEncdate",sDataSheetName))
            .clickBuildSearch()
            //.clickonpatientid()
            .assertSearchforpatient2();
//---------------------------------------------PATIENT DATA EXTRACT--------------------------------------------------
        new PatientDataExtract()
          .choosePatientDataExtract()
          .clickOnQuarter()
          .clickOnFacility()
          .clickOnFindPopulations()
          .clickOnPopulation()
          .clickOnFileType()
          .clickOnFileOptions()
          .clickOnRunReport()
          .assertPatineDataExtract();
// ------------------------------------------------HBIPS SENSUS-----------------------------------------------------           
		   new HbipsCensus()
		      .chooseHbipsCensus()
		      .chooseFacility(DataInputProvider.getCellData_ColName(iRowNumber,"Facility",sDataSheetName))
		      .chooseMonthYear(DataInputProvider.getCellData_ColName(iRowNumber,"Monthyear",sDataSheetName))
		      .choosecensusPupulation(DataInputProvider.getCellData_ColName(iRowNumber,"CensusPop",sDataSheetName))
              .clickSubmit()
              .assertHbipsCensus();
//------------------------------------------------WEB BASED MEASURE--------------------------------------------		
		   new WebBasedMeasures()
		     .chooseWebBasedMeasures()
		     .chooseWBMFacility(DataInputProvider.getCellData_ColName(iRowNumber,"Facility",sDataSheetName))
		     //.chooseWBMPatientClass(sDataSheetName)
		     .chooseWBMPopulation(DataInputProvider.getCellData_ColName(iRowNumber,"Measures",sDataSheetName))
		     //.chooseWBMYear(sDataSheetName)
		     .chooseWBMQuarter(DataInputProvider.getCellData_ColName(iRowNumber,"Quarter",sDataSheetName))
		     //.chooseWBMMonths(sDataSheetName)
		     .clickBulidSummaryList()
		     .assertWebBasedSummaryList();

		   }
//
}
//	    @Test
//	    public void buildSummary(int iRowNumber, String sDataSheetName) {
//	    	new Summary()
//			.chooseFacility(DataInputProvider.getCellData_ColName(iRowNumber, "ReportsFacility", sDataSheetName))
//	
//	       .choosePatientClass(DataInputProvider.getCellData_ColName(iRowNumber, "PatientClass", sDataSheetName))
//	        .choosePopulation(DataInputProvider.getCellData_ColName(iRowNumber, "Population", sDataSheetName))
//	        .chooseQuarter(DataInputProvider.getCellData_ColName(iRowNumber, "Quarter", sDataSheetName))
//	        .chooseMonths(DataInputProvider.getCellData_ColName(iRowNumber, "Months", sDataSheetName))
//	        .clickBulidSummaryList();
//	    	
//	    }


//		@DataProvider(name="Summary")
//		public Object[][] getSummary( ) throws IOException{
//			 FileInputStream Testdata = new FileInputStream("E:\\sdevi\\Downloads\\qmr-wdc-automation-master@f877eee8e3d\\TestData\\MasterData.xlsx");
//			 XSSFWorkbook dataFile = new XSSFWorkbook(Testdata);
//			 XSSFSheet summ = dataFile.getSheetAt(2);
//			 int rowCount = summ.getPhysicalNumberOfRows();
//			 XSSFRow row = summ.getRow(0);
//			 int columnCount = row.getLastCellNum();
//			Object data[][]= new Object[rowCount-1][columnCount];
//			for(int i=0; i<rowCount-1; i++) {
//				
//				row= summ.getRow(i+1);
//				for(int j=0; j<columnCount;j++)
//				{
//					XSSFCell cell = row.getCell(j);
//					data[i][j] = formatter.formatCellValue(cell);
//					
//				}
//			}
//			 
//		return data;		
//		}

/*
 * public void loginApp() {
 * 
 * //logger will be responsible for all the logging activity inside this test
 * logger=report.createTest("Login to WDC");
 * 
 * LoginPage_Old loginpage=PageFactory.initElements(driver,
 * LoginPage_Old.class);
 * 
 * logger.info("Starting an Application");
 * 
 * loginpage.LoginWDC(excel.getStringData("Login",0,0),
 * excel.getStringData("Login",0,1));
 * 
 * logger.pass("Login Success");
 * 
 * 
 * 
 * }
 */
