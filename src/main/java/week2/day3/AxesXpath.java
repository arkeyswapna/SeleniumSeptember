package week2.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxesXpath {
public static void main(String[] args) {
			
	ChromeDriver driver= new ChromeDriver();		
	driver.get("https://login.salesforce.com/?locale=au");		
	driver.manage().window().maximize();		
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password");
	driver.findElement(By.xpath("//input[@id='Login']")).click();
	
	//non select dd
	driver.findElement(By.xpath("//span[text()='Create']")).click();
	driver.findElement(By.xpath("//span[text()='Custom Tab']")).click();
	
}
}
