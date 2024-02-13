package ToLearnExtentReports;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AddSSExtentReports {

	@Test
	public void screenshot()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		String Image = ts.getScreenshotAs(OutputType.BASE64);
		
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_Reports/ExtentReportScreenshot.HTML");
		ExtentReports report=new ExtentReports();
		report.attachReporter(spark);
		ExtentTest test=report.createTest("screenshot");
		test.addScreenCaptureFromBase64String(Image,"error image");
		test.log(Status.INFO, "Added Screenshot");
		report.flush();
	}
}
