package learning_synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronisationPractise {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Task1
//		driver.get("https://www.selenium.dev/selenium/web/dynamic.html?utm_source=chatgpt.com");		
//		driver.findElement(By.id("adder")).click();
		
		//Task2
//		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");		
//		driver.findElement(By.xpath("//button[text()='Start']")).click();
//		driver.findElement(By.xpath("//h4[text()='Hello World!']")).click();
//		
		//Task-3 
		
//        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
//        
//        // 1. Capture the start time
//        long startTime = System.nanoTime();
//        driver.findElement(By.cssSelector("#start>button")).click();
//
//        WebElement text = driver.findElement(By.cssSelector("#finish>h4"));
//        // 2. Capture the end time after the action finishes
//        long endTime = System.nanoTime();
//
//        // 3. Calculate total duration in milliseconds
//        long durationInMs = (endTime - startTime) / 1_000_000;
//        System.out.println("Action took: " + durationInMs + " ms" + "for" + text);
//
// 
		//Task-4
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	
        driver.get("https://demoqa.com/alerts");        
      
        driver.findElement(By.id("alertButton")).click();
        wait.until(ExpectedConditions.alertIsPresent());
         
    //    driver.findElement(By.id("timerAlertButton")).click();

	}

}
