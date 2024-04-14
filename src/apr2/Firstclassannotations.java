package apr2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Firstclassannotations {
  @Test
  public void login() {
	  Reporter.log("executing login test",true);
  }
  @Test
  public void compose() {
	  Reporter.log("executing compose test",true);
  }
  @Test
  public void reply() {
	  Reporter.log("executing reply test",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("running in beforemethod",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("running in afterMethod",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("running in beforeTest",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("running in afterTest",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("running in beforeSuite",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("running in afterSuite",true);
  }

}
