package week4.day4.windowHandling.explicitWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafgroundCLR1 {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);		
		driver.get("https://leafground.com/window.xhtml");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window title is "+driver.getTitle());
		System.out.println(parentWindow);
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		System.out.println("second window title is "+driver.getTitle());
		System.out.println(list.get(1));
		driver.close();
		
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> list2 = new ArrayList<String>(windowHandles2);
		System.out.println(list2);
		for (String each : list2) {
			
			if(!parentWindow.equals(each))
			driver.switchTo().window(each);
			driver.close();
			
		}
		
		
		driver.switchTo().window(list.get(2));
		System.out.println("Third window title is "+driver.getTitle());
		System.out.println(list.get(2));
		
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		driver.switchTo().window(list.get(3));
		System.out.println("Third window title is "+driver.getTitle());
		System.out.println(list.get(3));
		
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		driver.switchTo().window(list.get(4));
		System.out.println("Third window title is "+driver.getTitle());
		System.out.println(list.get(4));
		
		

	}

}
