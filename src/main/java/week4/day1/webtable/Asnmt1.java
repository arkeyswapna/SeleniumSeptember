package week4.day1.webtable;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asnmt1 {

	public static void main(String[] args) {
		
		//Chittorgarh:
			// 1. Launch the URL https://www.chittorgarh.com/
			//2. Click on stock market
			//3. Click on NSE bulk Deals
			//4. Get all the Security names
			//5. Ensure whether there are duplicate Security names		
		
				
		ChromeDriver driver= new ChromeDriver();		
		driver.get("https://www.chittorgarh.com/");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		List<WebElement> col = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']//tr//td[1]"));
		int size = col.size();
		
		System.out.println("Sige of col "+size);	
		
		Set<String> names=new TreeSet<String>();
		
		for (int i = 0; i < size; i++) {
			
			String text = col.get(i).getText();
			names.add(text);			
			
		}
		System.out.println(names);
		System.out.println("No.of names with out duplicates "+names.size());
		
		for (String each : names) {
			System.out.println(each);
			
			
		}
		
		System.out.println(driver.getTitle());
		
		//Successfully executed
		

	}

}
