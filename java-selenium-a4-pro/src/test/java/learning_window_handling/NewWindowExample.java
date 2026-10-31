package learning_window_handling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowExample {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.automationwithpiyush.com/index.html");
		
		  String pId1	=   driver.getWindowHandle();
		  System.out.println(pId1);
		  System.out.println(driver.getTitle());
		  
		  System.out.println("______________________________________");
		  
		  driver.switchTo().newWindow(WindowType.TAB);
		  driver.get("https://www.instagram.com");
		  
		  String pId2 = driver.getWindowHandle();
		  System.out.println(pId2);
		  System.out.println(driver.getTitle());
		  
		  Thread.sleep(2000);
		  driver.quit();
		
	}

}
