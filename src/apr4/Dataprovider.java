package apr4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
WebDriver driver;
@BeforeTest
public void setup()
{
driver=new ChromeDriver();
driver.manage().window().maximize();
}
@DataProvider
public Object supplydata()
//ask doubt about why return type is not visible
{
//using two dimensional data
	Object login [][]= {{"Admin","Qedge123!@#"},{"Test","Qedge123!@#"},{"Admin","qedge123!@#"},{"Test","qedge123!@#"}};
return login;
}
@Test(dataProvider="supplydata")
public void verifylogin(String user,String pswd) throws Throwable
{
	driver.get("http://orangehrm.qedgetech.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("txtUsername")).sendKeys(user);
	driver.findElement(By.name("txtPassword")).sendKeys(pswd);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(1000);
	String expected="dashboard";
	String actual = driver.getCurrentUrl();
	if(actual.contains(expected))
	{
		Reporter.log("login success::"+expected+"           "+actual,true);
	}
	else {
		Reporter.log("login fail::"+expected+"        "+actual,true);
	}
}
@AfterTest
public void teardown()
{
	driver.quit();
}
}

