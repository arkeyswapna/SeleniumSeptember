package leadUsingCSV;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {

	public RemoteWebDriver driver;
	public String ExcelFileName;
		
	
	
	@Parameters({"url","username","password","browser"})
	
	@BeforeMethod
	
	public void preCondtion(String url, String uname, String password,String browser) {
		
		if (browser.equals("chrome")) {
			
		//WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		}
		else if(browser.equals("edge")){
			//WebDriverManager.chromedriver().setup();
			driver= new EdgeDriver();
		}
		else {
			
		}
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
	


