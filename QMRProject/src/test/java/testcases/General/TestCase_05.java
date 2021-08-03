//package testcases.General;
//
//import org.testng.annotations.Test;
//
//import pages.LoginPage;
//import pages.Patientreview;
//import utils.DataInputProvider;
//
//public class TestCase_05 {
//	@Test
//
//	public void PatientReviewWDC(int iRowNumber, String sDataSheetName) throws Exception, InterruptedException {
//		new LoginPage().typeUsername(DataInputProvider.getCellData_ColName(iRowNumber, "username", sDataSheetName))
//				.clickNext().typePassword(DataInputProvider.getCellData_ColName(iRowNumber, "password", sDataSheetName))
//				.clickSignIn();
//
////		new Patientreview().choosePatientReview()
////				//.choosepopulation(DataInputProvider.getCellData_ColName(iRowNumber, "population", sDataSheetName))
////				.chooseRepFacility(DataInputProvider.getCellData_ColName(iRowNumber, "Repfacility", sDataSheetName))
////				.typePatientStatus(DataInputProvider.getCellData_ColName(iRowNumber, "patientStatus", sDataSheetName))
////				.typeAbstractorVerified(
////						DataInputProvider.getCellData_ColName(iRowNumber, "abstractorVerified", sDataSheetName))
////				.typeMeasureProfile(DataInputProvider.getCellData_ColName(iRowNumber, "measureProfile", sDataSheetName))
////				.typeSample(DataInputProvider.getCellData_ColName(iRowNumber, "Sample", sDataSheetName))
////				.clickBuildSummaryList();
//
//	}
//}