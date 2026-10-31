package learning_relativelocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;



public class IdentifyOrgans {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.automationwithpiyush.com/relative.html");
		Thread.sleep(5000);
		
/*		WebElement reference = driver.findElement(By.id("center_monitor"));
		
		Thread.sleep(2000);
		
		//RESPIRATORY
	    driver.findElement(with(By.tagName("button"))
	    		           .above(reference)).click();
	     
	    
	    Thread.sleep(3000);
		
		//CARDIAC	    
		driver.findElement(with(By.tagName("button"))
				          .toLeftOf(By.id("respiratory_btn"))
				          .above(reference)).click();
		
		//Zigzig relative locating
		
		
		Thread.sleep(3000); */
		
		WebElement referenceSkeletal = driver.findElement(By.id("skeletal_btn"));
		
		 
		driver.findElement(with(By.tagName("button"))
				.toLeftOf(By.id("respiratory_btn"))
				.above(By.id("center_monitor"))
				.above(By.id("muscular_btn"))
				.toLeftOf(referenceSkeletal)).click();
		
		
	}

}
