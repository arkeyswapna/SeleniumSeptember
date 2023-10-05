package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundTextBoxASNMT1 {
public static void main(String[] args) throws InterruptedException {
			
	ChromeDriver driver= new ChromeDriver();						
	driver.get("https://leafground.com/input.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//	String attribute = driver.findElement(By.id("j_idt88:name")).getAttribute("placeholder");
//    System.out.println(attribute);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//h5[text()='Type your name']/following::input[1]")).sendKeys("Swapna");
	
    driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(" India",Keys.TAB);
	
    boolean enabled = driver.findElement(By.xpath("//h5[text()='Verify if text box is disabled']/following::input[1]")).isEnabled();
    System.out.println(enabled);
    
    driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
    
    String text = driver.findElement(By.xpath("//h5[text()='Retrieve the typed text.']/following::input[1]")).getAttribute("value");
    System.out.println(text);
    
    driver.findElement(By.xpath("//h5[text()='Type email and Tab. Confirm control moved to next element.']/following::input[1]")).sendKeys("aaa@gmail.com",Keys.ENTER);
    
	
    driver.findElement(By.xpath("//h5[text()='Type about yourself']/following::textarea")).sendKeys("aaaaaaaaaaaaaaaaa");
    
//    driver.findElement(By.id("j_idt88:name"));
//    
//    driver.findElement(By.id("j_idt88:name"));
//    
//    driver.findElement(By.id("j_idt88:name"));
	
	
  //verify the title
  		String title = driver.getTitle();
  		System.out.println(title);
}
}
