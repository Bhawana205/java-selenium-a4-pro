package learning_synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.automationwithpiyush.com/synchronization.html");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		//Task-2
//	    driver.findElement(By.id("trigger-input")).click();
//	    WebElement input = driver.findElement(By.id("target-input"));	    	    
//	    wait.until(ExpectedConditions.elementToBeClickable(input));
//	    input.sendKeys("admin");
//	    

	 	 //Task-3
//		 driver.findElement(By.id("btn-visibility")).click();
//	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden-box")));
	     
	     //Task-4
//	     driver.findElement(By.id("btn-text")).click();
//	     
//	     WebElement status = driver.findElement(By.id("text-status"));
//	     
//	     wait.until(ExpectedConditions.textToBePresentInElement(status, "Idle"));
	     
	     //Task-5
//	     driver.findElement(By.id("btn-alert")).click();
//	     wait.until(ExpectedConditions.alertIsPresent());
	     
	     //Task-6
	     driver.findElement(By.id("btn-selection")).click();
	     
	     WebElement checkBox = driver.findElement(By.id("auto-checkbox"));
	     
	     wait.until(ExpectedConditions.elementToBeSelected(checkBox));
	     if (checkBox.isSelected()) {
			System.out.println("Account is verified");
		} else {
			System.out.println("Account is not selected");
		}
	     
	     Thread.sleep(1000);
	}

}
