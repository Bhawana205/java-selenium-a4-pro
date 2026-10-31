package learning_screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.io.FileHandler;

public class FullWebPageSS {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://www.clinikally.com/");
		
		Thread.sleep(5000);
		
		HasFullPageScreenshot fp = (HasFullPageScreenshot) driver;
		
		File source = fp.getFullPageScreenshotAs(OutputType.FILE);
		
		File  dest = new File("./webpage_ss/clinikallySS.png");
		
		FileHandler.copy(source, dest);
		
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
