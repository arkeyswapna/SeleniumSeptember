package week6.day2.ShadowDOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) {
				
		ChromeDriver driver= new ChromeDriver();		
		driver.get("https://dev137890.service-now.com/");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("Testleaf@123");
		Shadow shadow=new Shadow(driver);
		shadow.findElementByXPath("//div[text()='All']").click();
		
	}

}
