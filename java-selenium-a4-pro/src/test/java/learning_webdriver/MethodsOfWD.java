package learning_webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWD {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub

		// First line of code
		WebDriver driver = new ChromeDriver();

		// Methods of WebDriver Interface

		driver.get("https://www.flipkart.com");

		Thread.sleep(1000);
		// to verify the navigated webpage

		String title = driver.getTitle();
		System.out.println(title);

		String url = driver.getCurrentUrl();
		System.out.println(url);

		// usually not used
		/*
		 * String souceCode = driver.getPageSource(); System.out.println(souceCode);
		 */

		// It closes the current window and it won't stop the server
//		driver.close();

		// It closes all the window opened and will stop the server as well
// 	    driver.quit();

		Navigation nav = driver.navigate();

		nav.to("https://www.amazon.in");
		
	

		Thread.sleep(2000);

		nav.back();

		Thread.sleep(2000);

		nav.forward();

		Thread.sleep(2000);

		nav.refresh();

//		URL url1 = new URL("https://www.flipkart.com");
//		nav.to(url1);
		
		Thread.sleep(1000);
		
		driver.quit();

	}

}
