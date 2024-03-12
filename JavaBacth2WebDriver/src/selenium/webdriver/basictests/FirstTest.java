package selenium.webdriver.basictests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
	
	 public static void main(String[] args) {
	
		 //System.setProperty("webdriver.gecko.driver", "‪C:\\FirefoxDriver\\geckodriver.exe");
		 //System.setProperty("webdriver.gecko.driver","‪C:\\FirefoxDriver\\geckodriver.exe");
		 //FirefoxDriver driver = new FirefoxDriver();
		 //driver.get("https://www.google.com");
		 
		//System.setProperty("webdriver.gecko.driver", "C:\\FirefoxDriver\\geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		//driver.get("http:google.com/");
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		
		 System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
		 
		//Navigate commands
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		driver.close();
		
		
		

		 
	 }

}
