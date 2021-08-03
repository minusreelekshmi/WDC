/*
 * package base;
 * 
 * import java.io.File;
 * 
 * 
 * import org.openqa.selenium.WebDriver;
 * 
 * import org.testng.Reporter; import org.testng.annotations.AfterClass;
 * //import org.testng.annotations.AfterMethod; import
 * org.testng.annotations.BeforeClass; import
 * org.testng.annotations.BeforeSuite;
 * 
 * import com.aventstack.extentreports.ExtentReports; import
 * com.aventstack.extentreports.ExtentTest; //import
 * com.aventstack.extentreports.MediaEntityBuilder; import
 * com.aventstack.extentreports.reporter.ExtentSparkReporter;
 * 
 * 
 * import utility.ExcelDataProvider; import utility.Helper;
 * 
 * public class BaseClass {
 * 
 * public WebDriver driver; public ExcelDataProvider excel; //public
 * ConfigDataProvider config; public ExtentReports report; public ExtentTest
 * logger;
 * 
 * //To fetch the data from excel and config properties file object as like pre
 * requisite
 * 
 * @BeforeSuite public void setupSuite() {
 * 
 * //Reporter log will display the logs during run time in console. Purpose is
 * to identify which step got executed Reporter.log("Test is getting ready",
 * true);
 * 
 * excel=new ExcelDataProvider(); config=new ConfigDataProvider();
 * 
 * 
 * //To generate reports and attach screenshot during runtime
 * ExtentSparkReporter extent=new ExtentSparkReporter(new
 * File(System.getProperty("user.dir")+"/Reports/QMRAutomation_"+Helper.
 * getCurrentDateTime()+".html")); report =new ExtentReports();
 * report.attachReporter(extent);
 * 
 * 
 * }
 * 
 * 
 * 
 * //To start driver Chrome and access URL before the test case class
 * 
 * @BeforeClass public void setup() {
 * 
 * Reporter.log("Browser Started", true);
 * 
 * driver=Browserfactory.startApplication(driver, config.getBrowser(),config.getDEV01URL()); }
 * 
 * //To Quit Browser after the class
 * 
 * @AfterClass public void tearDown() { Browserfactory.quitBrowser(driver); }
 * 
 * 
 * //If want to run any methods after every test cases been run (like taking
 * screenshots if test cases pass or fail)
 * 
 * @AfterMethod public void tearDownMethod(ITestResult result) throws
 * IOException{ { if(result.getStatus()==ITestResult.FAILURE) {
 * 
 * //To capture the screenshot when the test fails, commenting the below line
 * since this is called inside logger //Helper.captureScreenshot(driver);
 * 
 * //To attach the screenshot in extent report from the specified path
 * logger.fail("Test Failed",
 * MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(
 * driver)).build()); } else if(result.getStatus()==ITestResult.SUCCESS) {
 * 
 * logger.pass("Test Passed",
 * MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(
 * driver)).build());
 * 
 * } }
 * 
 * //report.flush(); //}
 * 
 * }
 */