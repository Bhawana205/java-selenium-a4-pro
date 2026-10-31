package learning_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.automationwithpiyush.com/locators.html");

		WebElement username = driver.findElement(By.id("user_login_field"));
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.name("security_passphrase"));
		password.sendKeys("Admin@123");
		
		WebElement email = driver.findElement(By.name("contact_email"));
		email.sendKeys("bhawn@gmail.com");
		
		
		WebElement empID = driver.findElement(By.id("employee-id-input"));
		empID.sendKeys("1234");
		
		
		Thread.sleep(5000);

	    driver.quit();
	}

}
