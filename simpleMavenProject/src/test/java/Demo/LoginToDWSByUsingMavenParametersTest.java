package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginToDWSByUsingMavenParametersTest {

	@Test
	public void receiveDataFromCMD()
	{
		String URL=System.getProperty("url");
		String Email=System.getProperty("Email");
		String Password=System.getProperty("Password");
		System.out.println(URL);
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}
