//package testcases.General;
//
//import pages.LoginPage;
//import pages.Search;
//import utils.DataInputProvider;
//
//public class TestCase_04 {
//public void SearchpatientWDC(int iRowNumber, String sDataSheetName) throws Exception, InterruptedException {
//		
//		new LoginPage()
//		.typeUsername(DataInputProvider.getCellData_ColName(iRowNumber, "username", sDataSheetName))
//		.clickNext()
//		.typePassword(DataInputProvider.getCellData_ColName(iRowNumber, "password", sDataSheetName))
//		.clickSignIn();
//		
//		
//		
//		new Search()
//		.choosepopulation(DataInputProvider.getCellData_ColName(iRowNumber, "Population", sDataSheetName))
//		.chooseRepFacility(DataInputProvider.getCellData_ColName(iRowNumber, "Facility", sDataSheetName))
//		.typeQuarterId(DataInputProvider.getCellData_ColName(iRowNumber, "QuarterId", sDataSheetName))
//		.typePatientReview(DataInputProvider.getCellData_ColName(iRowNumber, "PatientReview", sDataSheetName))
//		.typePatientStatus(DataInputProvider.getCellData_ColName(iRowNumber, "PatientStatus", sDataSheetName))
//		.typeAbstractorVerified(DataInputProvider.getCellData_ColName(iRowNumber, "AbstractorVerified", sDataSheetName))
//		.typeMeasureProfile(DataInputProvider.getCellData_ColName(iRowNumber, "MeasureProfile", sDataSheetName))
//		.typeSample(DataInputProvider.getCellData_ColName(iRowNumber, "Sample", sDataSheetName))
//		.clickBuildSummaryList();
//}
//
//}
