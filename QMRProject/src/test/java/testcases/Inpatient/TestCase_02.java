package testcases.Inpatient;

import org.testng.annotations.Test;

import base.PreAndPost;
import pages.Inpatient;
import pages.LoginPage;
import utils.DataInputProvider;

public class TestCase_02 {
	
	@Test
	public void InpatientWDC(int iRowNumber, String sDataSheetName) throws Exception, InterruptedException {
		
		new LoginPage()
		.typeUsername(DataInputProvider.getCellData_ColName(iRowNumber, "username", sDataSheetName))
		.clickNext()
		.typePassword(DataInputProvider.getCellData_ColName(iRowNumber, "password", sDataSheetName))
		.clickSignIn();
		
		//Navigate to Inpatient
		new Inpatient()
		.chooseAddPatient()
		.chooseFacility(DataInputProvider.getCellData_ColName(iRowNumber, "facility", sDataSheetName))
		.typePatientIdAndmedicalRecNumber(DataInputProvider.getCellData_ColName(iRowNumber, "patientId", sDataSheetName))
		//.typeMedicalRecordNumber(DataInputProvider.getCellData_ColName(iRowNumber, "medicalRecNumber", sDataSheetName))
		.typeAdmissionDate(DataInputProvider.getCellData_ColName(iRowNumber, "admissionDate", sDataSheetName))
		.typeDischargeDate(DataInputProvider.getCellData_ColName(iRowNumber, "dischargeDate", sDataSheetName))
		.typeBirthDate(DataInputProvider.getCellData_ColName(iRowNumber, "birthDate", sDataSheetName))
		.chooseSex(DataInputProvider.getCellData_ColName(iRowNumber, "sex", sDataSheetName)).clickCheckBoxSub()
		.clickSave();


		
	}
	}