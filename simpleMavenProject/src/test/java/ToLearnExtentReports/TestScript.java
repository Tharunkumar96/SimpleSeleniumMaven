package ToLearnExtentReports;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

@Listeners (ListenerImplementation.class)
public class TestScript extends BaseClass {

	
	@Test
	public void clickOnBooks()
	{
		driver.findElement(By.partialLinkText("BOOKS")).click();
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input")).click();
		boolean isverified = driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).isDisplayed();
		
		Assert.assertEquals(true,isverified,"Product is added to the cart");
		test.log(Status.PASS, "Product is added to cart successfully");
		driver.findElement(By.xpath("//span[@title='Close']")).click();
	}
	
}
