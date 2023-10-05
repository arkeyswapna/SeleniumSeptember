package week7.day3.Assertions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnSoftAssert {
	
	@Test
	
	private void learnAssert() {
		
		String actTitle="TestLeaf Automation Platform";
		ChromeDriver driver= new ChromeDriver();		
		driver.get("http://leaftaps.com/opentaps/control/login");		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, actTitle);
//		if (title.equals(actTitle)) {
//			System.out.println("Title is matching");
//			
//		}else {
//			System.out.println("Title is Not matching");
//		}
		
		//boolean displayed = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).isDisplayed();
		//Assert.assertTrue(displayed);//expects true if it is true it executes next steps and passes the test otherwise it will not execute and fails the test
		//Assert.assertFalse(displayed);
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.close();
	}

}
