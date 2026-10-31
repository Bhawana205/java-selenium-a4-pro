package test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnvnaClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://anvnacare.alwaysdata.net/");
		Thread.sleep(2000);
//		
//		driver.findElement(By.id("navRegister")).click();
//		
//		WebElement name = driver.findElement(By.id("nameInput"));		
//		name.sendKeys("Bhawana Tiwari");
//		Thread.sleep(2000);
//		
//		WebElement email = driver.findElement(By.id("emailInput"));
//		email.sendKeys("bhawna@gmail.com");
//		Thread.sleep(2000);
//		
//		WebElement phone = driver.findElement(By.id("phoneInput"));
//		phone.sendKeys("7725098003");
//		Thread.sleep(2000);
//		
//		WebElement password = driver.findElement(By.id("passwordInput"));
//		password.sendKeys("Bhavu20aug");
//		Thread.sleep(2000);
//		
//		 driver.findElement(By.name("terms")).click();
//		 Thread.sleep(2000);
//		 
//		 driver.findElement(By.id("submitBtnText")).click();
//		 Thread.sleep(2000);
//		 
//		 driver.findElement(By.id("dropdownLogout")).click();
//		 Thread.sleep(2000);
//		 
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
		 
		 driver.findElement(By.linkText("Pharmacy")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("addCartBtn-2")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.cssSelector("[data-testid='nav-cart']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("checkoutBtn")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.cssSelector("[data-testid='add-new-address-btn']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("modalAddressName")).sendKeys("xyz");
		 Thread.sleep(500);
		 
		 driver.findElement(By.id("modalAddressPhone")).sendKeys("1234567892");
		 Thread.sleep(500);
		 
		 driver.findElement(By.id("modalAddressLine1")).sendKeys("Qpsider Block-B");
		 Thread.sleep(500);
		 
		 driver.findElement(By.cssSelector("[ data-testid='modal-city-input']")).sendKeys("Noida");
		 Thread.sleep(500);
		 
		 driver.findElement(By.cssSelector("[ data-testid='modal-state-input']")).sendKeys("UP");
		 Thread.sleep(500);
		 
		 driver.findElement(By.id("modalAddressPincode")).sendKeys("123456");
		 Thread.sleep(500);
		 
		 driver.findElement(By.cssSelector("[ data-testid='modal-default-checkbox']")).click();
		 Thread.sleep(500);
		 
		 driver.findElement(By.id("saveAddressBtn")).click();
		 Thread.sleep(500);
		 
		 driver.findElement(By.id("nextToDeliveryBtn")).click();
		 Thread.sleep(500);
		 
		 driver.findElement(By.cssSelector("[data-testid='next-review-btn']")).click();
		 Thread.sleep(500);
		 
		 driver.findElement(By.cssSelector("[data-testid='next-payment-btn']")).click();
		 Thread.sleep(500);
		 
		 driver.findElement(By.cssSelector("[placeholder='4111 1111 1111 1111']")).sendKeys("4111 1111 1111 1111");
		 Thread.sleep(500);
		 

		 driver.findElement(By.id("cardExpiry")).sendKeys("12/30");
		 Thread.sleep(500);
		 
		 driver.findElement(By.id("cardCvv")).sendKeys("123");
		 Thread.sleep(500);
		 
		 driver.findElement(By.id("payNowBtn")).click();
		 Thread.sleep(500);
		 
		 driver.findElement(By.id("otpInput")).sendKeys("123456");
		 Thread.sleep(500);
		 
		 driver.findElement(By.id("confirmPaymentBtn")).click();
		 
		 
		
		 
	
	}

}
