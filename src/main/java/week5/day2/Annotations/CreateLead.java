package week5.day2.Annotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{

	@Test(invocationCount = 2, invocationTimeOut = 14000)
	
	public void createLead() {
		
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
