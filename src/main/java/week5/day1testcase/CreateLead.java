package week5.day1testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CreateLead {

	@Test
	
	public void createLead() {
		
		//Launch the browser
		EdgeDriver driver= new EdgeDriver();
		//System.out.println(System.getProperty("webdriver.chrome.driver"));//->shows the driver where it is installed in your system
		//to open the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize
		driver.manage().window().maximize();
		
		//find element
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
//		String domAttribute = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(domAttribute);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swapna");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thota");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("asdfghj");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("asdf@gmail.com");
		driver.findElement(By.name("submitButton")).click();

	}

}
