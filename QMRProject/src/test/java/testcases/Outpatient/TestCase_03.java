package testcases.Outpatient;

import org.testng.annotations.Test;

import base.PreAndPost;

import pages.LoginPage;
import pages.Outpatient;
import utils.DataInputProvider;

public class TestCase_03 {
	
	@Test
	public void OutpatientWDC(int iRowNumber, String sDataSheetName) throws Exception, InterruptedException {
		
		new LoginPage()
		.typeUsername(DataInputProvider.getCellData_ColName(iRowNumber, "username", sDataSheetName))
		.clickNext()
		.typePassword(DataInputProvider.getCellData_ColName(iRowNumber, "password", sDataSheetName))
		.clickSignIn();
		
		//new PreAndPost().inpatientUrl();
		// Navigate to Outpatient page.
		new Outpatient()
		        .chooseAddPatient()
				.chooseFacility(DataInputProvider.getCellData_ColName(iRowNumber, "facility", sDataSheetName))
				.typePatientIdAndMedicalRecordNumber(DataInputProvider.getCellData_ColName(iRowNumber, "patientId", sDataSheetName))
				//.typeMedicalRecordNumber(DataInputProvider.getCellData_ColName(iRowNumber, "medicalRecNumber", sDataSheetName))
				.typeEncounterDate(DataInputProvider.getCellData_ColName(iRowNumber, "admissionDate", sDataSheetName))
				.typeBirthDate(DataInputProvider.getCellData_ColName(iRowNumber, "birthDate", sDataSheetName))
				.chooseSex(DataInputProvider.getCellData_ColName(iRowNumber, "sex", sDataSheetName)).clickCheckBoxASR()
				.clickSave();

		
	}
	}