package week5.day1testcase;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonCLR1 {

	public static void main(String[] args) throws InterruptedException {
//		Classroom1:
//			==========
//			   1)Login to amazon website(https://www.amazon.in/)
//			   2)Type oneplus pro in the search box("OneplusPro",keys.Enter)
//			   3)Press Enter
//			   4)Click on the first resulting mobile
//			   5)Print the price  in the console
				
		ChromeDriver driver= new ChromeDriver();		
		driver.get("https://www.amazon.in/");		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus pro",Keys.ENTER);
		String windowHandle1 = driver.getWindowHandle();
		System.out.println(windowHandle1);
		
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
		String windowHandle = driver.getWindowHandle();
		// to get all the window handles
				Set<String> windowHandles = driver.getWindowHandles();
				List<String> handles = new ArrayList<String>(windowHandles);
				driver.switchTo().window(handles.get(1));
				System.out.println(handles.get(1));
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay'])[1]")).getText();
		System.out.println(text);
		String title = driver.getTitle();
System.out.println(title);


//Successfully executed
	}

}
