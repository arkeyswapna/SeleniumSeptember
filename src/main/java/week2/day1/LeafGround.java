package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;



public class LeafGround {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver= new ChromeDriver();
		//System.out.println(System.getProperty("webdriver.chrome.driver"));//->shows the driver where it is installed in your system
		//to open the url
		driver.get("https://leafground.com/input.xhtml;jsessionid=node0qj2i7yt583j17y9t565iw2d2346630");
		//to maximize
		driver.manage().window().maximize();
		
		//find element
		String attribute = driver.findElement(By.id("j_idt88:name")).getAttribute("placeholder");
        System.out.println(attribute);
        driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(" India",Keys.TAB);
      //verify the title
      		String title = driver.getTitle();
      		System.out.println(title);
		

	}

}
