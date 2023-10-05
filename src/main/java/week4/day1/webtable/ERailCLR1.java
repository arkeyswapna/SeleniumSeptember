package week4.day1.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ERailCLR1 {

	public static void main(String[] args) throws InterruptedException {
		
		/*CLR1:
		 * ================
		 * 1) Load https://erail.in/
		 * 2) Type "MS" in from textbox
		 * 3) Type "Cape" in to textbox
		 * 4) Click on sortdate
		 * 5) Find the TrianName list and
		 */
		
		
				
		ChromeDriver driver= new ChromeDriver();		
		driver.get("https://erail.in/");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MS",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("Cape",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		List<WebElement> secCol = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr//td[2]"));
		System.out.println(secCol.size());
		
		//Using for each---1st type
		for (WebElement each : secCol) {
			Thread.sleep(3000);
			System.out.println(each.getText());
			
		}
		
		//Using for loop----2nd type
		for (int i = 2; i <=secCol.size()+1; i++) {
			String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]//td[2]")).getText();
			System.out.println(text);
			
		}
		
		//Using for loop---3rd type
		for (int i = 0; i < secCol.size(); i++) {
			
			System.out.println(secCol.get(i).getText());
			
		}
		
		
		
	}

	//Successfully executed
}
