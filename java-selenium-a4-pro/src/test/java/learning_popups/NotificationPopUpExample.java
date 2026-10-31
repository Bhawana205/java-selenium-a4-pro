package learning_popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUpExample {

	public static void main(String[] args) {
		
		ChromeOptions settings1 = new ChromeOptions();
		settings1.addArguments("--incognito");
		settings1.addArguments("--start-maximized");
		
		
		ChromeOptions settings2 = new ChromeOptions();
		
		settings2.addArguments("--disable-notifications");
		settings2.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(settings2); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://www.easemytrip.com/");


	}

}
