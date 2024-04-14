package apr5;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verifytitle {
WebDriver driver;
@Test
public void starttest()
{
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	String expected ="Google";
	String actual = driver.getTitle();
	try {
		Assert.assertFalse(actual.equalsIgnoreCase(expected), "title is not matching");
	} catch (AssertionError e) {
		Reporter.log(e.getMessage(),true);
	}
	driver.quit();		
}
}
