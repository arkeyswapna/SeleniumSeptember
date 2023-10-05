package week4.day2.snapShot.chromeOptionsActionClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnSnapShot {
	public static void main(String[] args) throws IOException {	
	
			
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
	
	
	//To take snapshot
	File Source=driver.getScreenshotAs(OutputType.FILE);
	File destination=new File("./snaps/drag.png");
	FileUtils.copyFile(Source, destination);
	
	System.out.println(driver.getTitle());
	
	}
}
