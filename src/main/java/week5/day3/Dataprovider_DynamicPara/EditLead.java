package week5.day3.Dataprovider_DynamicPara;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends BaseClass {

	@DataProvider(name="Edit")
	public String[][] fetchData() {
		String[][] data=new String[3][2];
		//first set of data
		data[0][0]="99";
		data[0][1]="TCS";
		
		//second set of data
		data[1][0]="91";
		data[1][1]="Infosys";
		
		data[2][0]="93";
		data[2][1]="Wipro";
		
		
		return data;
		
		
	}
	
	
	@Test(dataProvider="Edit")
	
	public void EditLead(String phoneName,String companyName) throws InterruptedException {
				
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneName);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);		
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
				System.out.println(title);
		
		
		

	}

}
