package week4.day1.webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asnmt2 {

	public static void main(String[] args) {
		
		
		// 1. Launch the URL https://html.com/tags/table/
			//2. Get the count of number of rows
			//3. Get the count of number of columns
			
		//WebDriverManager.chromedriver().setup();		
		ChromeDriver driver= new ChromeDriver();		
		driver.get("https://html.com/tags/table/");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
		driver.findElements(By.xpath("//table//tr"));
		driver.findElements(By.xpath("//table//th"));

	}

}
