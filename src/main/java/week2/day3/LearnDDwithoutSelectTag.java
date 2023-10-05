package week2.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDDwithoutSelectTag {
public static void main(String[] args) throws InterruptedException {
			
	ChromeDriver driver= new ChromeDriver();		
	driver.get("https://login.salesforce.com/?locale=au");		
	driver.manage().window().maximize();		
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//I don't have credentials
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password");
	driver.findElement(By.xpath("//input[@id='Login']")).click();
	
	//Selecting DD (CreateTab option from Create Button) without select Tag
	driver.findElement(By.xpath("//span[text()='Create']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[text()='Create Tab']")).click();
	
	
}
}
