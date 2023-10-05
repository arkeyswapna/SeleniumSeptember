package week4.day1.webtable;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
				
		ChromeDriver driver= new ChromeDriver();		
		driver.get("https://testleaf.herokuapp.com/pages/table.html");		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Print the heading
		 String text2 = driver.findElement(By.tagName("h1")).getText();
		 System.out.println("Heading "+text2);
		 //Find the no. of headers
		List<WebElement> header = driver.findElements(By.xpath("//table//th"));
		int size = header.size();
		System.out.println("Size of header "+size);
		//Iterate through the al the elements of the table
		for (WebElement each : header) {
			String text = each.getText();
			System.out.println(text);
			
		}
		
		//To print single data
		System.out.println(driver.findElement(By.xpath("//table//tr[4]//td[1]")).getText());
		
		//To print entire table
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		System.out.println("No of rows: "+rows.size());
		for (int i = 1; i < rows.size(); i++) {
			WebElement eachRow = rows.get(i);
			System.out.println(eachRow.getText());	
		}
		// To print entire table
		for (int i = 0; i <= rows.size(); i++) {
			List<WebElement> cols = driver.findElements(By.xpath("//table//tr["+i+"]"));
			for (int j = 0; j < cols.size(); j++) {
				String text = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText();
				System.out.println(text);				
			}
			
			//1st type--- To get the data of the first column
			List<WebElement> dataFc = driver.findElements(By.xpath("//table//tr//td[1]"));
			ArrayList<String> list = new ArrayList<String>();
			for (WebElement eachData : dataFc) {
				String text = eachData.getText();
				//System.out.println(text);	
				list.add(text2);
				
			}
			
			
			System.out.println("Datas in the first coloumn: "+list);
			
		}
	}

}
