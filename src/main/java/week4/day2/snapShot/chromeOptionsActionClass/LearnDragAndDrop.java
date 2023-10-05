package week4.day2.snapShot.chromeOptionsActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {

	public static void main(String[] args) {
			
		ChromeDriver driver= new ChromeDriver();		
		driver.get("https://leafground.com/drag.xhtml");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		WebElement dragAndDrop = driver.findElement(By.xpath("//span[text()='Drag me around']"));
		Point location = dragAndDrop.getLocation();
		int x = location.getX();
		int y = location.getY();		
		Actions builder=new Actions(driver);		
		builder.dragAndDropBy(dragAndDrop, x, y).perform();
		
		System.out.println(driver.getTitle());
		
		//Successfully executed
		
	}
}
