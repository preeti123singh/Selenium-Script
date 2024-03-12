package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {
		
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		
		if(email.isDisplayed() && email.isEnabled()) {
			email.sendKeys("ps_er2006@yahoo.co.in");
		}
		if(password.isDisplayed() && password.isEnabled()) {
				
			password.sendKeys("1986");
		}
		
		//radio buttons on the facebook page and they are not se;ected .We
		//are checking if female is not selected then we select it.
		
		if (driver.findElement(By.xpath("")).isSelected() == false) {
			driver.findElement(By.xpath("")).click();
		}
		
	}

}
