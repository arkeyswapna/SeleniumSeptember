 package week4.day3.Alert.Frames;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnAlert {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);		
		driver.get("https://testleaf.herokuapp.com/pages/Alert.html");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		
		
		//Handling Simple Alert
		
		driver.findElement(By.linkText("Alert Box")).click();
		//Move the control to Alert
		Alert alert = driver.switchTo().alert();
		//To get the text
		System.out.println(alert.getText());
		//To accept the Alert
		alert.accept();
		
		//Handling Confirm Alert
		driver.findElement(By.linkText("Confirm Box")).click();
		Alert alert2 = driver.switchTo().alert();
		//To cancel the Alert
		alert2.dismiss();
		//To get text after canceling the Alert
		String text = driver.findElement(By.id("result")).getText();
		System.out.println("After dismissing the alert: "+text);
		
		//Handling Prompt Alert
		driver.findElement(By.linkText("Promt Box")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("TestLeaf");
		alert3.accept();
		String text1 = driver.findElement(By.id("result1")).getText();
		System.out.println("After accepting the alert: "+text1);
		
		
		

	}

}
