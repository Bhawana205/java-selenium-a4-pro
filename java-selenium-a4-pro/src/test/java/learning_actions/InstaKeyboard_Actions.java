package learning_actions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InstaKeyboard_Actions {

	public static void main(String[] args) throws InterruptedException {
		
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	driver.get("https://www.instagram.com");
	
    Actions act = new Actions(driver);
    
    act.sendKeys("bhav._020",Keys.TAB).pause(6).build().perform();
    act.sendKeys("Bh@vu20aug2730",Keys.ENTER).build().perform();
    
    Thread.sleep(4000);
    driver.quit();
	}

}
