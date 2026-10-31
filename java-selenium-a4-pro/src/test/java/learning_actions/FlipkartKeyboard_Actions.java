package learning_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;

public class FlipkartKeyboard_Actions {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://www.flipkart.com/");
		
	    Actions act = new Actions(driver);
	    
//	    driver.findElement(By.cssSelector("[aria-label='Login']")).click();
//	    Thread.sleep(2000);
//	    
//	  
//	    
//	    WebElement login = driver.findElement(By.id("1"));
//	    login.sendKeys("7725098003");
//	    Thread.sleep(2000);
//	    
//	    
//	    
//	    
//	    driver.findElement(By.xpath("//button[text()='Continue']")).click();
	    
	    WebElement search = driver.findElement(By.xpath("//input[contains(@title,'Search for Products')]"));
	    search.sendKeys("samsung");
	    Thread.sleep(1000);
	    act.sendKeys(Keys.ARROW_DOWN).build().perform();
	    Thread.sleep(1000);
	    act.sendKeys(Keys.ARROW_DOWN).build().perform();

	}

}
