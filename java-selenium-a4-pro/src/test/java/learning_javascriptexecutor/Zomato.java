package learning_javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {

	public static void main(String[] args) throws InterruptedException{
		
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 
	 
	 JavascriptExecutor jse = (JavascriptExecutor) driver;
	 
	 jse.executeScript("window.location='https://www.zomato.com/'");
/*	 
	 jse.executeScript("window.scrollTo(0,700)");
	 Thread.sleep(2000);
	 jse.executeScript("window.scrollTo(0,500)");
	 Thread.sleep(2000);
	 jse.executeScript("window.scrollTo(0,-100)");
	 */
	 Thread.sleep(1000);
	 
	 //scrolling to a particular element
	 WebElement checkItOut = driver.findElement(By.xpath("//div[text()='blinkit']/following-sibling::div/div"));
	 
	 jse.executeScript("arguments[0].scrollIntoView(Boolean)",checkItOut);
	 
	 Thread.sleep(3000);
	 
	 
	 //Scrolling to the bottom of webpage 
	 jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	 
	 Thread.sleep(2000);
	 
	 //Scrolling to the top of webpage
	 jse.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	 
	 Thread.sleep(2000);
	 
	 
	 driver.quit();
	 
		
	
	}

}
