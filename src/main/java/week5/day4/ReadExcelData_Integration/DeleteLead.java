package week5.day4.ReadExcelData_Integration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteLead extends BaseClass {

	@Test(enabled = false)
	
	public void deleteLead() throws InterruptedException {
//		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("23456789");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String ss = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();	
		System.out.println(ss);
		System.out.println(driver.getTitle());
		

	}

}
