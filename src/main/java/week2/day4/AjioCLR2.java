package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioCLR2 {

	public static void main(String[] args) {
//		Classroom2:
//			============
//			   1)Login to Ajio website(https://www.ajio.com/)
//			   2)Type oneplus pro in the search box("Women",keys.Enter)
//			   3)Click on the Sarees check box under Cateogory
//			   4)Click on sort by dropdown and click Whats new
//			   5)Print the text of the number of items displayed
		
		
				
		ChromeDriver driver= new ChromeDriver();		
		driver.get("https://www.ajio.com/");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("women",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

	}

}
