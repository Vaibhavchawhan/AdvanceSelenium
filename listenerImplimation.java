package CommonUtils;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.model.Test;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class listenerImplimation implements ITestListener {
	ExtentReports reports;

	@Override
	public void onTestStart(ITestResult result) {
		// System.out.println("TestScript execution is started");
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName + "Testscript Exuction is started", true);

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		// Reporter.log(methodName + "Testscript Exuction is passed", true);
		

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// to capture the result And throw Exception or error
		String message = result.getThrowable().toString();

		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName + "Testscript Exuction is failed" + message, true);
		
		WebDriverUtils wutil=new WebDriverUtils();
		try {
			wutil.screenshot(BaseClass.driver, "Contacts");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName + "Testscript Exuction is Skipped", true);
	}

	@Override
	public void onStart(ITestContext context) {
		JavaUtils jutil = new JavaUtils();

		Reporter.log("Start the Execution", true);
		// used ExtentSparkReporter class just to confiure extent report
		ExtentSparkReporter reporter = new ExtentSparkReporter(
				"./extentreport/report" + jutil.getRandomNumber() + ".html");
		// to give the title of the report
		reporter.config().setDocumentTitle("vtigerCRM");
		// to gentrate the the theme for the report
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("INDIAN Organization");

		// crete object of ExtentReports class and genrate extentreport
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("OS", "Windows 11");
		reports.setSystemInfo("Browser", "Chrome");
		reports.setSystemInfo("chromeversion", "121");
		reports.setSystemInfo("Author", "Pransh");

	}

	@Override
	public void onFinish(ITestContext context) {
		// Reporter.log(" Finish the Exuction", true);

		reports.flush();
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

}
