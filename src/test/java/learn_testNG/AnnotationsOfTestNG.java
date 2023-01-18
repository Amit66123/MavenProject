package learn_testNG;

import org.testng.annotations.*;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AnnotationsOfTestNG {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This is Before Suite Section");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is Before Test Section");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This is Before Class Section");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This is Before Method Section");
	}
	@Test
	@AfterMethod 
	public void afterMethod()
	{
		System.out.println("This is After Method Section");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("This is After Class Section");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("This is After Test Section");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This is After Suite Section");
	}

}
