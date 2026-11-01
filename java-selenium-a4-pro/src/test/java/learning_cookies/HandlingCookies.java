package learning_cookies;


import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:8888/");

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager");
		driver.findElement(By.id("submitButton")).click();

		Thread.sleep(2000);

		// Get login/session cookie
		Cookie loginCookie = driver.manage().getCookieNamed("PHPSESSID");

		// Delete browser cookies
		driver.manage().deleteAllCookies();

		driver.navigate().refresh();

		Thread.sleep(2000);

		// Open application domain first
		driver.get("http://localhost:8888/");

		// Restore session cookie
		driver.manage().addCookie(loginCookie);

		driver.navigate().refresh();

		Thread.sleep(3000);

		driver.quit();
	}
}