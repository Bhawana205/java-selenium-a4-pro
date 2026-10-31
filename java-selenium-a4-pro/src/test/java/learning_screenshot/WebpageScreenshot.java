package learning_screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebpageScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
        
		// Upcasting
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//driver.get("https://www.facebook.com");
		//driver.get("https://www.instagram.com");
		 driver.get("https://www.flipkart.com/");

		// 1. Downcasting

		TakesScreenshot tks = (TakesScreenshot) driver;

		// 2. Take screenshot of the File

		File src = tks.getScreenshotAs(OutputType.FILE);

		// 3. Make the representational java object of the physical file

		//File des = new File("./webpage_ss/fb.png");
		//File des = new File("./webpage_ss/insta.png");
		  File des = new File("./webpage_ss/flipkart.png");

		// 4. Copy the content of the file into the dummy file

		FileHandler.copy(src, des);
		
		Thread.sleep(2000);
		driver.quit();

	}

}
