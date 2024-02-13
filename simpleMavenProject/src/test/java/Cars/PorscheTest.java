package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PorscheTest {

	@Test(groups="smoke")
	public void launchPorsche() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.porsche.com/middle-east/_india_/");
		Reporter.log("Porsche Launched",true);
	}
	
	
}
