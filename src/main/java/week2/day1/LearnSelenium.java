package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver= new ChromeDriver();
		//System.out.println(System.getProperty("webdriver.chrome.driver"));//->shows the driver where it is installed in your system
		//to open the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize
		driver.manage().window().maximize();
		//verify the title
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}
