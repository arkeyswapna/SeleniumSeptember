package addresser;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterClassAddresser1 extends BaseClassAddresser{
	
	@BeforeTest
	public void setUp() {
		ExcelFileName="TestData";

	}

	@Test(dataProvider="fetch")
public void createNewUser(String firstName, String lastName, String email,String phoneNumber,String companyName, String employees, String address,String comtype1,String comtype2,String password1,String password2 ) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement((By.id("register-form-first-name"))).sendKeys(firstName);
		driver.findElement((By.id("register-form-last-name"))).sendKeys(lastName);
		driver.findElement((By.id("register-form-email"))).sendKeys(email);
		driver.findElement((By.id("register-form-phone"))).sendKeys(phoneNumber);
		driver.findElement((By.id("register-form-companyname"))).sendKeys(companyName);
		driver.findElement((By.id("register-form-employees"))).sendKeys(employees);

		driver.findElement((By.id("register-form-streetaddress"))).sendKeys(address);
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']/li/div[@class='ui-menu-item-wrapper']"));
		System.out.println(list.size());
		String notMatch = driver.findElement(By.xpath("//p[@class='alertmdg']")).getText();
		for (int i = 0; i < list.size(); i++) {
			String listItem = list.get(i).getText();
			System.out.println(listItem);
			if(listItem.contains(address)) {
				list.get(i).click();
				break;
			}else if(notMatch.contains("No match found")) {
				break;
			}
			
		}
		//driver.findElement(By.xpath("//div[contains(text(),'"+address+"')]")).click();
		//driver.findElement(By.xpath("(//div[text()='10 DARTMOUTH CT MANOR LAKES VIC 3024'])[1]")).click();
		
		WebElement findElement2 = driver.findElement((By.id("register-form-communication_type")));
		Select s2=new Select(findElement2);
		s2.selectByVisibleText(comtype1);
		WebElement findElement3 = driver.findElement((By.id("register-form-communication_time")));
		Select s3= new Select(findElement3);
		s3.selectByVisibleText(comtype2);
		Thread.sleep(3000);
		driver.findElement((By.id("register-form-password"))).sendKeys(password1);
		Thread.sleep(3000);
		driver.findElement((By.id("register-form-repassword"))).sendKeys(password2);
		driver.findElement((By.id("register-form-accept-terms"))).click();
		Thread.sleep(3000);
		driver.findElement((By.id("register-form-submit"))).click();
		
		System.out.println(driver.getTitle());
	
}
}