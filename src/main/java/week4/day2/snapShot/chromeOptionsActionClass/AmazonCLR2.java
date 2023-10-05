package week4.day2.snapShot.chromeOptionsActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonCLR2 {
	public static void main(String[] args) {	
	
			
	ChromeDriver driver= new ChromeDriver();		
	driver.get("https://www.amazon.com");		
	driver.manage().window().maximize();		
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//find the element
	WebElement scroll = driver.findElement(By.xpath("//div[text()='Get to Know Us']"));
//Create an Action Class
	Actions builder=new Actions(driver);
	//Use the instance of Actions class to access all the methods
	builder.scrollToElement(scroll).perform();
	System.out.println(scroll.getText());
	System.out.println(driver.getTitle());
	}
	
	//Executed
}
