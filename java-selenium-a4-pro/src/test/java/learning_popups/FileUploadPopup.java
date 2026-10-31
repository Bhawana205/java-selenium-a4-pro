package learning_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	
	
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	//driver.findElement(By.xpath("//div[@class='textWrap']/h2[text()=\"I'm experienced\"]")).click();
	
	driver.findElement(By.xpath("//h2[contains(text(),\"I'm experienced\")]")).click();
	
	WebElement resumeUpload = driver.findElement(By.id("resumeUpload"));
	resumeUpload.sendKeys("C:\\Users\\Bhawana\\OneDrive\\Desktop\\English_Vowels_and_Consonants_Mispronunciation_of_ (1).pdf");
	
	Thread.sleep(2000);
	driver.quit();
	

	}

}
