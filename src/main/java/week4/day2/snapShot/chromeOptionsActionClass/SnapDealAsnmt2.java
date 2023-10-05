package week4.day2.snapShot.chromeOptionsActionClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDealAsnmt2 {
	public static void main(String[] args) throws InterruptedException {	
		
//		Assignment 2:
//			============
//			1. Launch https://www.snapdeal.com/
//			2. Go to Mens Fashion
//			3. Go to Sports Shoes
//			4. Get the count of the sports shoes
//			5. Click Training shoes
//			6. Sort by Low to High
//			7. Check if the items displayed are sorted correctly
//			8.Select the price range (900-1200)
//			9.Filter with color yellow 
//			10 verify the all applied filters 
//			11. Mouse Hover on first resulting Training shoes
//			12. click QuickView button
//			13. Print the cost and the discount percentage
//			14. Take the snapshot of the shoes.
//		
		
	
	
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("disable-notifications");
	ChromeDriver driver= new ChromeDriver(options);		
	driver.get("https://www.snapdeal.com/");		
	driver.manage().window().maximize();		
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//find the element
	WebElement men = driver.findElement(By.linkText("Men's Fashion"));
//Create an Action Class
	Actions builder=new Actions(driver);
	//Use the instance of Actions class to access all the methods
	builder.moveToElement(men).perform();
	WebElement shoes = driver.findElement(By.linkText("Sports Shoes"));
	builder.moveToElement(shoes).click().perform();
	String count = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[1]")).getText();
	System.out.println("Sports Shoes count "+count);
	WebElement training = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
	builder.moveToElement(training).click().perform();
	driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
	driver.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();
	
	 List<WebElement> price = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
	System.out.println(price);
	for (WebElement each : price) {
		System.out.println(each.getText());
		
	}
	
	 driver.findElement(By.xpath("(//input[@class='input-filter'])[1]")).clear();
	 driver.findElement(By.xpath("(//input[@class='input-filter'])[1]")).sendKeys("500",Keys.ENTER);
	 driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).clear();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).sendKeys("1200",Keys.ENTER);
	 
	 WebElement color = driver.findElement(By.xpath("//label[@for='Color_s-Black']"));
	 Thread.sleep(3000);
	 builder.moveToElement(color).click().perform();
//	 Thread.sleep(3000);
//	 WebElement first = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
//	builder.moveToElement(first).perform();
//	driver.findElement(By.xpath("(//div[@class='price-text-box'])[1]")).clear();
//	 WebElement view = driver.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  '] 	"));
//	 builder.moveToElement(view).click().perform();
//	
//	
//	
	System.out.println(driver.getTitle());

}
}
