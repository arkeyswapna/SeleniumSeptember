package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCLR2 {

	public static void main(String[] args) {
//		
//		Classroom 2:
//			==========
//			   1)Go to Amazon url
//			   2)Type phones
//			   3)Print price of every phone
//			   4)print the lowest Price
		
		
				
		ChromeDriver driver= new ChromeDriver();		
		driver.get("https://www.amazon.in/");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones",Keys.ENTER);
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		System.out.println(findElements.size());
		
//		for (Iterator i = findElements.iterator(); i.hasNext();) {
//			WebElement webElement = (WebElement) i.next();
//			System.out.println(webElement.getText());
//		}
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < findElements.size(); i++) {
			//System.out.println(findElements.get(i).getText());
			String price = findElements.get(i).getText().replace(",","");
			System.out.println(price);
			if(price!="") {
			int convertedString = Integer.parseInt(price);
			list.add(convertedString);
			}
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println("The lowest price is "+list.get(0));
		
	System.out.println(driver.getTitle());
	}
//Successfully Executed
}
