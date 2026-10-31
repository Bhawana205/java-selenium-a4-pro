package learning_popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUpExample {

	public static void main(String[] args) throws InterruptedException {

     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     
     //this page will give authentication pop up asking for username and password
     //driver.get("https://the-internet.herokuapp.com/basic_auth");
		
	 //to avoid the auth pop we can modify the url
     
     driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

     Thread.sleep(2000);
     driver.quit();
     
	}

}
