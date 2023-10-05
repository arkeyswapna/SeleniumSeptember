package week5.day3.Dataprovider_DynamicPara;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	public ChromeDriver driver;
	
	@Parameters ({"url","username","password"})
	@BeforeMethod
	
	public void preCondtion(String url,String uname,String password) {
		
		//WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	}
	
	@AfterMethod
	
	public void postCondition() {
		
		driver.close();
	}

}
