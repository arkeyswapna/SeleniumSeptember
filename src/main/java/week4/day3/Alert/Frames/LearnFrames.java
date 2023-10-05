package week4.day3.Alert.Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrames {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);		
		driver.get("https://testleaf.herokuapp.com/pages/Alert.html");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		
		
		//Handling Frames
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		//Handling nested frames 
		//switch to parent frame
		driver.switchTo().frame(1);
		//switch to child frame
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1']")).click();
		
		//coming out of all frames
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		
		

	}

}
