package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class lamborginiTest {

	@Test(groups="smoke")
	public void launchlamborgini() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lamborghini.com/en-en");
		Reporter.log("lamborgini Launched",true);
	}
}
