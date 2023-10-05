package addresser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class TestingAddresserCopy1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://myaddresserportal.s3-website.ap-south-1.amazonaws.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//a[@class='button button-3d button-small button-rounded button-white button-light']/i")).click();
		driver.findElement(By.xpath("//a[@class='button button-3d button-small button-rounded button-dirtygreen']")).click();
		driver.findElement(By.xpath("//span[text()='click here']")).click();
		//driver.findElement(By.xpath("//a[@class='menu-link -js-ref-link']/div")).click();
		
		WebElement scroll = driver.findElement(By.xpath("//button[text()='Try Now']"));
		Actions builder= new Actions(driver);
		builder.scrollToElement(scroll).perform();
		
		
		WebElement findElement = driver.findElement(By.id("5_dropdown"));
		Select s=new Select(findElement);
		Thread.sleep(3000);
		s.selectByVisibleText("500 lookups / month");
		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
		System.out.println(driver.getTitle());
		driver.findElement((By.id("register-form-first-name"))).sendKeys("Swapna");
		driver.findElement((By.id("register-form-last-name"))).sendKeys("Thota");
		driver.findElement((By.id("register-form-email"))).sendKeys("swapnasecure@gmail.com");
		driver.findElement((By.id("register-form-phone"))).sendKeys("123456789");
		driver.findElement((By.id("register-form-companyname"))).sendKeys("Addresser");
		driver.findElement((By.id("register-form-employees"))).sendKeys("8");

		
		driver.findElement((By.id("register-form-streetaddress"))).sendKeys("10 Dartmouth court Manor lakes Vic 3024");
		driver.findElement(By.xpath("//div[contains(text(),'10 DARTMOUTH CT MANOR LAKES VIC 3024')]")).click();
		//driver.findElement(By.xpath("(//div[text()='10 DARTMOUTH CT MANOR LAKES VIC 3024'])[1]")).click();
		
		WebElement findElement2 = driver.findElement((By.id("register-form-communication_type")));
		Select s2=new Select(findElement2);
		s2.selectByVisibleText("Email");
		WebElement findElement3 = driver.findElement((By.id("register-form-communication_time")));
		Select s3= new Select(findElement3);
		s3.selectByVisibleText("Morning");
		driver.findElement((By.id("register-form-password"))).sendKeys("Addresser*8");
		driver.findElement((By.id("register-form-repassword"))).sendKeys("Addresser*8");
		driver.findElement((By.id("register-form-accept-terms"))).click();
		Thread.sleep(3000);
		driver.findElement((By.id("register-form-submit"))).click();
		
		System.out.println(driver.getTitle());
		
}
}