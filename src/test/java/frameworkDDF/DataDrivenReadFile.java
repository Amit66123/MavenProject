package frameworkDDF;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenReadFile {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);	
		
		//--------------FileRead----------------------------
					
		FileInputStream fis=new FileInputStream("D:\\LoginCredentials.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Data");

				int rows=sheet.getLastRowNum();
				System.out.println("Total No. of Rows :"+rows);

				for(int r=1; r<=rows; r++)
				{
					XSSFRow row=sheet.getRow(r);
					XSSFCell userName=row.getCell(0);
					XSSFCell passWord=row.getCell(1);
					

					System.out.println("UserName-->"+userName+"    "+ "Password-->"+passWord);


				//--------------FileRead----------------------------

				//---------------OrangeHRM Login Code-------------------
				driver.findElement(By.name("username")).sendKeys(userName.toString());
				driver.findElement(By.name("password")).sendKeys(passWord.toString());
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(2000);
					
				try {
				driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("Logout")).click();
				System.out.println("VALID");
				
				Thread.sleep(2000);
				
				
				}
				catch(Exception e)
				{
					//Thread.sleep(1000);
					//WebElement errorContainer=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
					//String errorMsg=errorContainer.getText();
					System.out.println("INVALID");
					
				}
				}
				
				fis.close();
				}

	}


