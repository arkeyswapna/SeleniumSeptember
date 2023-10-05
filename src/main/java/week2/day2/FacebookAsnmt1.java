package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAsnmt1 {

	public static void main(String[] args) {
		 // FaceBook:
        // ================================
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		// Step 3: Load the URL https://en-gb.facebook.com/
		// Step 4: Maximise the window
		// Step 5: Add implicit wait
		// Step 6: Click on Create New Account button
		// Step 7: Enter the first name
		// Step 8: Enter the last name
		// Step 9: Enter the mobile number
		// Step 10: Enterthe password
		// Step 11: Handle all the three drop downs
		// Step 12: Select the radio button "Female" 
		// ( A normal click will do for this step) 
				
		ChromeDriver driver= new ChromeDriver();		
		driver.get("https://en-gb.facebook.com/");		
		driver.manage().window().maximize();		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sappu");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("thota");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Asd123!@#");
		WebElement d = driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(d);
		s.selectByVisibleText("10");
		WebElement d2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select s2=new Select(d2);
		s2.selectByVisibleText("Aug");
		WebElement d3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select s3=new Select(d3);
		s3.selectByVisibleText("2000");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		System.out.println(driver.getTitle());
		

	}

}
