package week7.day2.listner.retryingFailedTestcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {

	public ChromeDriver driver;
	public String ExcelFileName;
		
	
	
	@Parameters({"url","username","password"})
	
	@BeforeMethod
	
	public void preCondtion(String url, String uname, String password) {
		
		
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	}
	
	@AfterTest
	
	public void postCondition() {
		
		//driver.close();
	}
	
	@DataProvider(name="fetch", indices=1)
	public String[][] fetchData() throws IOException {
		String[][] data = ReadExcel.readExcel(ExcelFileName);
		return data;
		
	}
	
	
	}
	


