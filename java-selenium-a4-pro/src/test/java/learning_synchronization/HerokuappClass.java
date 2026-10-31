package learning_synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuappClass {

	public static void main(String[] args) throws InterruptedException {
		                    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		driver.findElement(By.cssSelector("[label='blah']")).click();
		
		driver.findElement(By.cssSelector("[onclick='swapCheckbox()']")).click();
		
		driver.findElement(By.xpath("//button[text()='Add']")).click();
			
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
	
		driver.findElement(By.xpath("//button[text()='Disable']")).click();
		
		
		
		
	}

}
