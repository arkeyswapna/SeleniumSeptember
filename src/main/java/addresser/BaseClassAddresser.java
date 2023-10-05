package addresser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week5.day4.ReadExcelData_Integration.ReadExcel;

public class BaseClassAddresser {

	
		public RemoteWebDriver driver;
		public String ExcelFileName;
			
		
		
		@Parameters({"url","browser"})
		
		@BeforeMethod
		
		public void preCondtion(String url, String browser) throws InterruptedException {
			
			if(browser.equals("chrome"))
			{
				driver= new ChromeDriver();
			}else if(browser.equals("edge"))
			{
				driver= new EdgeDriver();
			}
			
			driver.get(url);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//div[text()='Login']")).click();
			driver.findElement(By.xpath("//a[@class='button button-3d button-small button-rounded button-white button-light']/i")).click();
			driver.findElement(By.xpath("//a[@class='button button-3d button-small button-rounded button-dirtygreen']")).click();
			driver.findElement(By.xpath("//span[text()='click here']")).click();
			//driver.findElement(By.xpath("//a[@class='menu-link -js-ref-link']/div")).click();
			
			WebElement scroll = driver.findElement(By.xpath("//button[text()='Try Now']"));
			Actions builder= new Actions(driver);
			builder.scrollToElement(scroll).perform();
			
			
			WebElement findElement = driver.findElement(By.id("5_dropdown"));
			Select s=new Select(findElement);
			Thread.sleep(3000);
			s.selectByVisibleText("500 lookups / month");
			driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
			System.out.println(driver.getTitle());
	   }
		
		
		@AfterTest
		
		public void postCondition() {
			//driver.close();
		}
		
	@DataProvider(name="fetch")
	
	public String[][] fetchData() throws IOException{
		String[][] data=ReadExcelAddresser.readExcel(ExcelFileName);
		return data;	
		
	}
	
}
