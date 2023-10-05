package week5.day1testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead {

	@Test
	
	public void deleteLead() throws InterruptedException {
//		/*http://leaftaps.com/opentaps/control/main
//		 
//		Delete Lead:
//		1	Launch the browser
//		2	Enter the username
//		3	Enter the password
//		4	Click Login
//		5	Click crm/sfa link
//		6	Click Leads link
//		7	Click Find leads
//		8	Click on Phone
//		9	Enter phone number
//		10	Click find leads button
//		11	Capture lead ID of First Resulting lead
//		12	Click First Resulting lead
//		13	Click Delete
//		14	Click Find leads
//		15	Enter captured lead ID
//		16	Click find leads button
//		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
//		18	Close the browser (Do not log out)
				
		ChromeDriver driver= new ChromeDriver();		
		driver.get("http://leaftaps.com/opentaps/control/login");		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
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
