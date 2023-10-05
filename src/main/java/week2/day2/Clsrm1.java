package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Clsrm1 {

	public static void main(String[] args) {
		
		//Launch the browser
		ChromeDriver driver= new ChromeDriver();
		//System.out.println(System.getProperty("webdriver.chrome.driver"));//->shows the driver where it is installed in your system
		//to open the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize
		driver.manage().window().maximize();		
		//find element
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swapna");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thota");
		
		WebElement source1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1= new Select(source1);
		//use the object and call the methods
		dd1.selectByIndex(1);
		WebElement source2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd2= new Select(source2);
		dd2.selectByIndex(5);
		WebElement source3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd3= new Select(source3);
		dd3.selectByValue("IND_RETAIL");
		WebElement source4 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd4= new Select(source4);
		dd4.selectByVisibleText("Arizona");

	}

}
