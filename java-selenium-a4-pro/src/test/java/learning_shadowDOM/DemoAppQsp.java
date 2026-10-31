package learning_shadowDOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppQsp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		
		//For - USERNAME FIELD IN SHADOW DOM
		
		//step 1> Find the shadow Host
		SearchContext usrShadowHost = driver.findElement(By.xpath("(//div[@class='my-3'])[1]")).getShadowRoot();
		
		Thread.sleep(1000);
		
		//Step 2> access the element inside shadow dom using shadowHost
		usrShadowHost.findElement(By.cssSelector("[placeholder='Enter your username']")).sendKeys("admin");
		
		Thread.sleep(2000);
		
		//For - PASSWORD FIELD IN SHADOW DOM	
		SearchContext pwdShadowHost = driver.findElement(By.xpath("(//div[@class='my-3'])[2]")).getShadowRoot();
		
		Thread.sleep(2000);
		pwdShadowHost.findElement(By.cssSelector("[placeholder='Enter your password']")).sendKeys("admin");
		
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		Thread.sleep(1000);
		driver.quit();
		
		

	}

}
