package week4.day4.windowHandling.explicitWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandle {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		 options.setBrowserVersion("116");
		
		  
		ChromeDriver driver= new ChromeDriver(options);		
		driver.get("https://testleaf.herokuapp.com/pages/Window.html");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		//Print  the window handle for the active browser
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		driver.findElement(By.xpath("//button[text()='Open home Page']")).click();
		//To get all the window handles
		Set<String> windowHandles = driver.getWindowHandles();
		//Convert set to a list to get a particular window handle
		List<String> handles = new ArrayList<String>(windowHandles);
		//Move control to the second window
		driver.switchTo().window(handles.get(1));
		String secondWindow = driver.getWindowHandle();		
		//Get title of the new window opened
		String secondWindowtitle = driver.getTitle();
		System.out.println(secondWindowtitle);
		if(parentTitle.equals(secondWindowtitle)) {
			System.out.println("controls stays in the same page");
			
		}
		else
			System.out.println("Control has switched to the new window");
		//driver.close();
		driver.switchTo().window(parentWindow);
		//driver.quit();
		
		
		
		//Did not execute as site is not working
	}

}
