package ToLearnExtentReports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportHTML {

	
	@Test
	public void demoTest()
	{
		String TIME = LocalDateTime.now().toString().replace(":", "-");
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_Reports/ExtentReport"+TIME+".html");
		spark.config().setDocumentTitle("Demo Report");
		spark.config().setTheme(Theme.DARK);
		
		ExtentReports report=new ExtentReports();
		report.attachReporter(spark);
		ExtentTest test=report.createTest("demoTest");
		test.log(Status.PASS, "Added log message into report");
		report.flush();
	}
}
