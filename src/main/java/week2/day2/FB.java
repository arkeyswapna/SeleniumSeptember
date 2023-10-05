package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB {

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

		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Swapna");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Thota");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Thota");
		WebElement source1=driver.findElement(By.xpath("//select[@id='day']"));
		Select d1=new Select(source1);
		d1.selectByIndex(5);
		WebElement source2=driver.findElement(By.xpath("//select[@id='month']"));
		Select d2=new Select(source2);
		d2.selectByVisibleText("Feb");
		WebElement source3=driver.findElement(By.xpath("//select[@id='year']"));
		Select d3=new Select(source3);
		d3.selectByValue("2003");
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		System.out.println(driver.getTitle());
		
		
	}

}