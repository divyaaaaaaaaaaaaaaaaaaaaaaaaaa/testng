package apr3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ornghrmbefmtdaftmtd {
WebDriver driver;
@BeforeMethod
public void setup()
{
 driver= new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("http://orangehrm.qedgetech.com");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
 driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
 driver.findElement(By.id("btnLogin")).click();
 Reporter.log("running in beforemethod",true);
}
	@Test(priority=2)
	public void admin()
	{
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
	Reporter.log("executing admin test",true);
	}
	@Test(priority=0)
	public void pim()
	{
		driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
		Reporter.log("executing pim test",true);
	}
	@Test(priority=1)
	public void leave()
	{
		driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
		Reporter.log("executing leave test",true);
	}
	@AfterMethod()
	public void teardown()
	{
		driver.quit();
		Reporter.log("running in after method",true);
	}
}
