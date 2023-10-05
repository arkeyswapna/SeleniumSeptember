package week7.day2.retryingFailedTestcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLeadRetryListner extends BaseClass{

	@BeforeTest
	public void setUp() {
		ExcelFileName="CreateLead";

	}
	
	
	@Test(dataProvider="fetch")
	
	public void createNewLead(String companyName, String firstName, String lastName, String phoneNumber) {
		
		driver.findElement(By.linkText("Leads123")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(phoneNumber);
		driver.findElement(By.name("submitButton")).click();

	}

}
