package week5.day3.Dataprovider_DynamicPara;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{

	@DataProvider(name="create")
	
	public String[][] fetchData(){
		String[][] data=new String[2][4];
		//first set of data
		data[0][0]="TestLeaf";
		data[0][1]="Subraja";
		data[0][2]="Subi";
		data[0][3]="99";
		
		
		//second set of data
		data[1][0]="Qeagle";
		data[1][1]="Princy";
		data[1][2]="R";
		data[1][3]="91";
		
		return data;
	}
	
	@Test(dataProvider="create")
	
	public void createLead(String companyName,String firstName,String lastName,String phoneNumeber) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNumeber);
		
		driver.findElement(By.name("submitButton")).click();

	}

}
