package week4.day2.snapShot.chromeOptionsActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActionClass {
	public static void main(String[] args) {	
	
			
	ChromeDriver driver= new ChromeDriver();		
	driver.get("https://www.ajio.com");		
	driver.manage().window().maximize();		
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//find the element
	WebElement men = driver.findElement(By.linkText("MEN"));
//Create an Action Class
	Actions builder=new Actions(driver);
	//Use the instance of Actions class to access all the methods
	builder.moveToElement(men).perform();
	WebElement clothing = driver.findElement(By.linkText("Clothing"));
	builder.click(clothing).perform();
	
	
	
	
	
	
}
}