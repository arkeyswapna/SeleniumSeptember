package week4.day2.snapShot.chromeOptionsActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDoubleClick {

	public static void main(String[] args) {
				
		ChromeDriver driver= new ChromeDriver();		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame("iframeResult");
		
		WebElement doubleClick = driver.findElement(By.xpath("//p[text()='Double-click this paragraph to trigger a function.']"));
		Actions builder=new Actions(driver);
		//Use the instance of Actions class to access all the methods
		builder.doubleClick(doubleClick).perform();
	}
}