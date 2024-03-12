package selenium.webdriver.basictests;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		
		driver.manage().window().maximize();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		
		
		
		String exp_title = "Login: Mercury Tours";
		String act_title = driver.getTitle();//return title of page.
		
		
		if(exp_title.equals(act_title) == true) {
			
			System.out.println("test is passed");
		}
		else
		{	
			//System.out.println(act_title);
			System.out.println("test is failed");
		}
		
	//	driver.close();
	}

}
