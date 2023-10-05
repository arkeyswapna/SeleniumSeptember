package week4.day1.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDownCLR2 {

	public static void main(String[] args) throws InterruptedException {
				
		ChromeDriver driver= new ChromeDriver();		
		driver.get("https://www.leafground.com/select.xhtml");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement dd = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select ss= new Select(dd);
		List<WebElement> options = ss.getOptions();
		
		
		for (int i = 0; i < options.size(); i++) {
			Thread.sleep(3000);
			options.get(i).click();
			
		}
		for (int i = 0; i < options.size(); i++) {
			
			if(i==2)
				Thread.sleep(3000);
			options.get(i).click();
			
		}
		for (int i = 0; i < options.size(); i++) {
			if(i==2 && i==3)
				Thread.sleep(3000);
			options.get(i).click();
			
		}
		for (int i = 0; i < options.size(); i++) {
			
			System.out.println(options.get(i).getText());
			
		}
		
		

	}

}
