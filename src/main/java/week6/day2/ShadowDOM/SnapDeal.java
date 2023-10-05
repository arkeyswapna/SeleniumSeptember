package week6.day2.ShadowDOM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
				
		ChromeDriver driver= new ChromeDriver();		
		driver.get("https://www.snapdeal.com/");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		Actions builder=new Actions(driver);
		//2. Go to Men's Fashion
		WebElement mens=driver.findElement(By.xpath("//span[@class='catText']"));
		//3. Go to sport's shoes
		WebElement sport=driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]"));
		
		try {
			builder.moveToElement(mens).click(sport).perform();
		}catch(Exception e1) {
			wait.until(ExpectedConditions.visibilityOf(mens));
		}
	
		// Get the number of shoes using list
				List<WebElement> countOfShoes = driver.findElements(By.xpath("//span[@class='category-name category-count']"));
				int size = countOfShoes.size();
				System.out.println("The number of sport shoes is :" + size);

				Thread.sleep(1000);
				// Click the Training shoes option
				driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();

				// Get the list of trainingShoes using list
				List<WebElement> trainingShoes = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));

				// Create a List
				List<Integer> list = new ArrayList<Integer>();

				// create a for loop for getting the items and store it to the list
				for (int i = 0; i < trainingShoes.size(); i++) {
					String replace = trainingShoes.get(i).getText().replaceAll("[^0-9]", "");
					int parseInt = Integer.parseInt(replace);
					list.add(parseInt);
				}

				System.out.println("The items are displayed before sorthing:" + list);

				// Sort the items using sort method
				Collections.sort(list);
				System.out.println("The items are displayed after sorting :" + list);

				// Get the shoes within the limited range amount using xpath
				driver.findElement(By.xpath("//div[@class='price-text-box']//input[@name='fromVal']")).clear();
				driver.findElement(By.xpath("//div[@class='price-text-box']//input[@name='fromVal']")).sendKeys("900");
				driver.findElement(By.xpath("//div[@class='price-text-box']//input[@name='toVal']")).clear();
				driver.findElement(By.xpath("//div[@class='price-text-box']//input[@name='toVal']")).sendKeys("1200");
				driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();

				// mouse over on first item
				WebElement yellowShoes = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
				builder.moveToElement(yellowShoes).perform();

				// click on quick view button
				Thread.sleep(1000);
				WebElement findElement = driver.findElement(By.xpath("//div[@class='clearfix row-disc']//div[1]"));
				driver.executeScript("arguments[0].click();", findElement);

				// Get the price of that shoes and get the text and print in console
				WebElement element1 = driver
						.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span[1]"));
				String text = element1.getText();
				System.out.println("The price of the Yellow shoes is :" + text);

				// Get the discount of that shoes and get the text and print in console
				WebElement element2 = driver
						.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span[2]"));
				String text1 = element2.getText();
				System.out.println("The  Discount percentage  of the Yellow shoes is :" + text1);

				// create a file and store the snapshot of the shoes
				File source = driver.getScreenshotAs(OutputType.FILE);
				File destination = new File("./Snaps/YellowShoes.png");
				FileUtils.copyToDirectory(source, destination);

}
}