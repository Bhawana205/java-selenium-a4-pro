package learning_locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.automationwithpiyush.com/locators.html");
		
		//Task 1
		WebElement username = driver.findElement(By.id("user_login_field"));
		username.sendKeys("Admin");
		Thread.sleep(1000);
		
		//task2
		WebElement password = driver.findElement(By.name("security_passphrase"));
		password.sendKeys("Admin@123");
		Thread.sleep(1000);
		
		
		
		//task3
		driver.findElement(By.className("submit_btn")).click();
		Thread.sleep(1000);
				
//		 WebElement cancel = driver.findElement(By.className("secondary_action"));
//		 cancel.click();
				
		//task4
		driver.findElement(By.linkText("Reset Password")).click();
		Thread.sleep(3000);

		driver.findElement(By.partialLinkText("John Doe")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Help Center")).click();
		Thread.sleep(3000);
		
		
		//task5
		WebElement empID = driver.findElement(By.cssSelector("#employee-id-input"));
		empID.sendKeys("12345");
		Thread.sleep(1000);
		
		
		//task6
		driver.findElement(By.cssSelector(".verify-status-btn")).click();
		Thread.sleep(1000);
		 
		
		//task7				
		driver.findElement(By.xpath("//p[text()='Target A']"));
		//driver.findElement(By.cssSelector(".parent-wrapper>p"));
		Thread.sleep(1000);
		
		//task8
		WebElement accessCode = driver.findElement(By.cssSelector("input[placeholder='Access Code']"));
		accessCode.sendKeys("44444");
		Thread.sleep(1000);
		
		
		//task9
		driver.findElement(By.xpath("//p[text()='Navigation Point']"));
		Thread.sleep(3000);
		
		
		//task10
	    WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search Query...']"));
	    search.sendKeys("I am here!..");
	    Thread.sleep(1000);
		
		//task11
		driver.findElement(By.xpath("//button[text()='Generate Report']")).click();
		Thread.sleep(3000);

		//task12
		WebElement email = driver.findElement(By.name("contact_email"));
		email.sendKeys("bhawn@gmail.com");
		Thread.sleep(3000);
		
		//task13
		driver.findElement(By.xpath("//button[text()='Submit Order 2026']")).click();
		Thread.sleep(1000);
		
		//task14
		driver.findElement(By.xpath("//td[text()='Bob_User']/..//input[@type='checkbox']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//td[text()='Alice_Admin']/..//td[text()='Administrator']"));
		Thread.sleep(1000);

		driver.findElement(By.xpath("//td[text()='Bob_User']/..//button[text()='Edit']")).click();
		
	}

}
