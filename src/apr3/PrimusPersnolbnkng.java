package apr3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrimusPersnolbnkng {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("running in beforetest",true);
	}
	@Test
	public void pbanking()
	{
		driver.findElement(By.xpath("(//img)[4]")).click();
		Reporter.log("executing pbanking test",true);
	}
	@Test
	public void cbanking()
	{
		driver.findElement(By.xpath("(//img)[5]")).click();
		Reporter.log("executing cbanking test",true);
	}
	@Test
	public void ibanking()
	{
		driver.findElement(By.xpath("(//img)[6]")).click();
		Reporter.log("executing ibanking test",true);
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
		Reporter.log("running in after test",true);
	}
}
