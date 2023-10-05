package week4.day4.windowHandling.explicitWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NykaaAsnmt1{

	public static void main(String[] args) {

//		Assignment 1:
//			=============
//			1) Go to https://www.nykaa.com/
//			2) Mouseover on Brands and Search L'Oreal Paris
//			3) Click L'Oreal Paris
//			4) Check the title contains L'Oreal Paris(Hint-GetTitle)
//			5) Click sort By and select customer top rated
//			6) Click Category and click Hair->Click haircare->Shampoo
//			7) Click->Concern->Color Protection
//			8)check whether the Filter is applied with Shampoo
//			9) Click on L'Oreal Paris Colour Protect Shampoo
//			10) GO to the new window and select size as 175ml
//			11) Print the MRP of the product
//			12) Click on ADD to BAG
//			13) Go to Shopping Bag 
//			14) Print the Grand Total amount
//			15) Click Proceed
//			16) Click on Continue as Guest
//			17) Check if this grand total is the same in step 14
//			18) Close all windows
		
		//WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);		
		driver.get("https://nykaa.com/");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		String parentWindow = driver.getWindowHandle();
		
		
		WebElement brands = driver.findElement(By.xpath("//a[contains(text(),'brands')]"));
		Actions builder =new Actions(driver);
		builder.moveToElement(brands).perform();
		WebElement loreal = driver.findElement(By.linkText("L'Oreal Paris"));
		builder.moveToElement(loreal).click().perform();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("L'Oreal Paris")) {
			System.out.println("Title is same");
			
			
		} else {
System.out.println("Title is not same");
		}
		WebElement sort = driver.findElement(By.xpath("//span[text()='Sort By : popularity']"));
		builder.scrollToElement(sort).perform();
		sort.click();
		WebElement customer = driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]"));
		builder.moveToElement(customer).click().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Category')]")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		String text = driver.findElement(By.xpath("//span[text()='Shampoo']")).getText();
		System.out.println(text);
		if (text.equals("Shampoo")) {
			System.out.println("Shampoo filter is applied");
		} else {
			System.out.println("Shampoo filter is not applied");
		}
		
		driver.findElement(By.xpath("//img[@class='css-11gn9r6']")).click();
		// to get all the window handles
				Set<String> windowHandles = driver.getWindowHandles();
				// convert it to list for getting particular window
				List<String> handles = new ArrayList<String>(windowHandles);
				// System.out.println(handles);
				// move the control to the second window
				driver.switchTo().window(handles.get(1));
				String windowHandle = driver.getWindowHandle();
				System.out.println(windowHandle);
		String text2 = driver.findElement(By.xpath("(//span[text()='₹399'])[1]")).getText();
		System.out.println(driver.getTitle());
		System.out.println("The price of the product is "+text2);
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		
		String title2 = driver.getTitle();
		System.out.println(title2);
	}

}
