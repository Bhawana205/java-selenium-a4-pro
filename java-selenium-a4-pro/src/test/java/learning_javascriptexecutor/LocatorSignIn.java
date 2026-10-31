package learning_javascriptexecutor;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorSignIn {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.location='https://www.automationwithpiyush.com/locatorsSignin.html'");
		
		WebElement usernameField  = driver.findElement(By.id("email"));
		
		String username = "admin";
		
		jse.executeScript("arguments[0].value=arguments[1]",usernameField,username);
		
		
		
		WebElement pswdField = driver.findElement(By.name("pass"));
		String pswd	= "admin";
		
		Thread.sleep(1000);
		jse.executeScript("arguments[1].value=arguments[0]",pswd,pswdField);
		Thread.sleep(1000);
		driver.findElement(By.id("terms_checkbox")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
		
		Thread.sleep(1000);
		driver.quit();
		

	}

}
