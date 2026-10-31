package test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoctorConsult {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://anvnacare.alwaysdata.net/");
		Thread.sleep(2000);
		
		 driver.findElement(By.id("navLogin")).click();
		 Thread.sleep(1000);
		 
		  driver.findElement(By.id("emailInput")).sendKeys("bhawna@gmail.com");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("passwordInput")).sendKeys("Bhavu20aug");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.cssSelector("[data-testid='remember-me-checkbox']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(1000);
		
		driver.findElement(By.linkText("Consult Doctors")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("bookBtn-1")).click();
		Thread.sleep(500);
		
		driver.findElement(By.cssSelector("[data-testid='appointment-datepicker']")).sendKeys("04-10-2026");
		Thread.sleep(500);
		
		 driver.findElement(By.id("appointmentTime")).sendKeys("09:00 AM (Morning)");
		 Thread.sleep(500);
		 
		 driver.findElement(By.id("bookSlotBtn")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[text()=' Cancel Consultation ']")).click();
		
		
	}

}
