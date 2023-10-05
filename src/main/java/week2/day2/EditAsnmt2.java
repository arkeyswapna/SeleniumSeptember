package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditAsnmt2 {

	public static void main(String[] args) throws InterruptedException {
//		/*http://leaftaps.com/opentaps/control/main
//		
//		* 1	Launch the browser
//		* 2	Enter the username
//		* 3	Enter the password
//		* 4	Click Login
//		* 5	Click crm/sfa link
//		* 6	Click Leads link
//		* 7	Click Find leads
//		* 8	Enter first name
//		* 9	Click Find leads button
//		* 10 Click on first resulting lead
//		* 11 Verify title of the page
//		* 12 Click Edit
//		* 13 Change the company name
//		* 14 Click Update
//		* 15 Confirm the changed name appears
//		* 16 Close the browser (Do not log out)
				
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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sappu");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Leaf");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(text);
		System.out.println(driver.getTitle());
		//driver.close();
	}

}
