package week4.day3.Alert.Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class CLR4 {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);		
		driver.get("https://jqueryui.com/draggable/");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		
		
		//Handling frame
		
		driver.switchTo().frame(0);
		WebElement findElement = driver.findElement(By.id("draggable"));
		Actions builder= new Actions(driver);
		org.openqa.selenium.Point location=findElement.getLocation();
		
		//1st way
//		int x= location.getX();
//		int y = location.getY();
//		builder.dragAndDropBy(findElement, x, y).perform();
//		System.out.println(x+" , "+y);
		
		
		//2nd way
		builder.dragAndDropBy(findElement, 100, 80).perform();
		
		
		
		
		
		System.out.println(driver.getTitle());
		
		//Succssfully Executed
	}

}
