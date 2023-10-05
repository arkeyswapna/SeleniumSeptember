 package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set {

	public static void main(String[] args) {
				
		ChromeDriver driver= new ChromeDriver();		
		driver.get("https://www.amazon.in/");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones",Keys.ENTER);
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> list=new ArrayList<Integer>();
		System.out.println(findElements.size());
		for (int i = 0; i < findElements.size(); i++) {
			String text = findElements.get(i).getText().replace(",","");
			if(text!="") {				
			int parseInt = Integer.parseInt(text);
			list.add(parseInt);
			}		
		}
		
       System.out.println(list);
       Collections.sort(list);
       System.out.println(list.size());
       System.out.println(list);
       
      // Set<Integer> unique=new TreeSet<Integer>(list);
       java.util.Set<Integer> unique=new TreeSet<Integer>(list);
       System.out.println(unique.size());
       System.out.println(unique);
       
       List<Integer> list1=new ArrayList<Integer>(unique);
       System.out.println(list.get(0));
       
      

	

	}

}
