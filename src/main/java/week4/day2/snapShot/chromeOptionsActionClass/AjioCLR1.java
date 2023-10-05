package week4.day2.snapShot.chromeOptionsActionClass;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class AjioCLR1 {
		public static void main(String[] args) {	
		
				
		ChromeDriver driver= new ChromeDriver();		
		driver.get("https://www.ajio.com");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//find the element
		WebElement men = driver.findElement(By.linkText("KIDS"));
	//Create an Action Class
		Actions builder=new Actions(driver);
		//Use the instance of Actions class to access all the methods
		builder.moveToElement(men).perform();
		WebElement softToys = driver.findElement(By.linkText("Soft Toys"));
		builder.click(softToys).perform();
		WebElement img = driver.findElement(By.xpath("//div[@class='imgHolder']"));
		builder.moveToElement(img).perform();
		System.out.println(driver.findElement(By.xpath("//div[text()='Quick View']")).getText());
		
		System.out.println(driver.getTitle());
		
		//Successfully executed
}
}