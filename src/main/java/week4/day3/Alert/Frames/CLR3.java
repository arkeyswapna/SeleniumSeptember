package week4.day3.Alert.Frames;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CLR3 {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);		
		//ChromeDriver driver= new ChromeDriver();	
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		
				
		//Handling Frame
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("TestLeaf");
		alert.accept();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		System.out.println(driver.getTitle());
		
		//Successfully Executed

	}

}
