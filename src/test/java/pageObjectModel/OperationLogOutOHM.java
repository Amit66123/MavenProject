package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OperationLogOutOHM {

	WebDriver driver;
	
	public OperationLogOutOHM(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	
	//repository of WebElement
	By userProfile=By.xpath("//p[@class='oxd-userdropdown-name']");
	By logOut=By.linkText("Logout");
	
	public void userProfile() throws InterruptedException   {
		
		driver.findElement(userProfile).click();
		Thread.sleep(1000);
	}
	
	public void logOut() throws InterruptedException {
		driver.findElement(logOut).click();
		Thread.sleep(1000);
		
	}
	    public void logOutProcess() throws InterruptedException {
	    	
	    	userProfile();
	    	logOut();
	    }
	
}


