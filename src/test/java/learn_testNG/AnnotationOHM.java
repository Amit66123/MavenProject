package learn_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnotationOHM {
	WebDriver driver;
	@BeforeSuite
	public void LaunchBrowser ()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeTest
	public void loginProcess() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	  
	 @Test (priority=1)
	 public void testPIM()
	 {
		 driver.findElement(By.linkText("PIM")).click();
		 System.out.println("Clicked on PIM Sucessfully");
	 }
	 
	 @Test (priority=2)
	 public void pIMReport()
	 {
		 driver.findElement(By.linkText("Reports")).click();
		 System.out.println("Clicked on PIM Sucessfully");
	 }
	 
	 @Test (priority=3)
	 public void addEmployee()
	 {
		 driver.findElement(By.linkText("Add Employee")).click();
		 System.out.println("Clicked on PIM Sucessfully");
	 }
	 @AfterTest
		public void logoutProcess() throws InterruptedException
		{
			driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name")).click();
			driver.findElement(By.linkText("Logout")).click();
		}
	 
	 @AfterSuite
		public void closeBrowser () throws InterruptedException
		{
		   Thread.sleep(4000);
	       driver.quit(); 
	    }

}
