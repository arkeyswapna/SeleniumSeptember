package week5.day2.Annotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClass{

	@Test(groups = "Swapna")
	
	public void duplicateLead() {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swapna");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thota");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("asdfghj");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("asdf@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_departmentName")).clear();
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("SE");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		

	}

}
