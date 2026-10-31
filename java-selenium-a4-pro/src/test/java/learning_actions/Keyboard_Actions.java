package learning_actions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {

	public static void main(String[] args) throws InterruptedException{
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com");
		
		Actions act = new Actions(driver);
		
		
		Thread.sleep(2000);
		act.sendKeys("admin").build().perform();
		
		//copy - cntrl+c
		act.keyDown(Keys.CONTROL).build().perform();
		act.sendKeys("ac").build().perform();
		act.keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		
		//copy - cntrl + v
		act.keyDown(Keys.CONTROL).build().perform();
		act.sendKeys("v").build().perform();
		act.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		
		
		//login
		act.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	
		

	}

}
