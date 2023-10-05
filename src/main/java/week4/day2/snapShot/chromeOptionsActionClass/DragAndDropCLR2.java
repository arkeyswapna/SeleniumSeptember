package week4.day2.snapShot.chromeOptionsActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropCLR2 {

	public static void main(String[] args) throws InterruptedException {
				
		ChromeDriver driver= new ChromeDriver();		
		driver.get("https://leafground.com/drag.xhtml");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		WebElement target = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
//		Point location = source.getLocation();
//		int x = location.getX();
//		int y = location.getY();		
		Actions builder=new Actions(driver);		
		builder.dragAndDrop(source, target).perform();
		
		WebElement source1 = driver.findElement(By.xpath("//th[@class='ui-state-default ui-draggable-column ui-draggable ui-draggable-handle ui-droppable'][1]"));
		WebElement target1 = driver.findElement(By.xpath("//th[@class='ui-state-default ui-draggable-column ui-draggable ui-draggable-handle ui-droppable'][2]"));
		
		Thread.sleep(3000);
		
		builder.clickAndHold(target1).moveToElement(source1).perform();	
		
//		
//		WebElement verifyColumns = driver.findElement(By.xpath("//span[text()='columns reordered']"));
//		String text=verifyColumns.getText();
//		if(text.contains("Columns Reorderd"))
//			System.out.println("Reordered successfully");
//	
//	else
//	{
//		System.out.println("Not done");
//	}
		
		WebElement scroll = driver.findElement(By.xpath("//label[text()='2022 - All Rights Reserved']"));
		builder.scrollToElement(scroll).perform();
		System.out.println(scroll.getText());
		
//		
		System.out.println(driver.getTitle());
		
		//Successfully executed
		
	}
}