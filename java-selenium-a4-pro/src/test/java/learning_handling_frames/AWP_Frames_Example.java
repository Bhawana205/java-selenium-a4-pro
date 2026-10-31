package learning_handling_frames;

import java.awt.dnd.DragGestureEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AWP_Frames_Example {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Actions act = new Actions(driver);
		
		driver.get("https://www.automationwithpiyush.com/frames.html");
		
		
		    //Frame A
		     Thread.sleep(1000);
		     driver.switchTo().frame(0);
		     WebElement patientName = driver.findElement(By.id("name_input"));
		     patientName.sendKeys("xyz");
		     driver.switchTo().defaultContent();
		     
		      Thread.sleep(1000);
		      
		      //FRAME B
		     driver.switchTo().frame(1);
		     driver.findElement(By.id("critical_check")).click(); 
		     driver.switchTo().defaultContent();	     
		     
		     Thread.sleep(1000);
		     
		     //FRAME C
		     driver.switchTo().frame("frame_c");
		     driver.findElement(By.cssSelector("[value='A+']")).click();
		     driver.switchTo().parentFrame();
		     
		     Thread.sleep(1000);
		     
		     //FRAME D
		     driver.switchTo().frame(3);
		     driver.switchTo().frame(0);
		     driver.switchTo().frame(0);
		     
		     
		     WebElement voltageDD = driver.findElement(By.id("voltage_level"));
		     Select voltageSel = new Select(voltageDD);
		     voltageSel.selectByVisibleText("Medium Voltage");
		     Thread.sleep(1000);
		     driver.switchTo().frame(0);
		     WebElement secretCode = driver.findElement(By.cssSelector("[placeholder = 'Enter Code']"));
		     secretCode.sendKeys("22222");   
		     driver.switchTo().defaultContent();
		     
		     Thread.sleep(1000);
		     
		     //FRAME E
		     
		     driver.switchTo().frame(4);
		     WebElement prescDate = driver.findElement(By.id("presc_date"));
		     prescDate.sendKeys("17-10-2026");
		     
		     Thread.sleep(1000);
		     
		     driver.switchTo().frame(0);
		     WebElement dosageSlider = driver.findElement(By.id("dosage_slider"));
		     act.moveToElement(dosageSlider,70, 0).click().build().perform();
		     
		     Thread.sleep(1000);
		     
		     driver.switchTo().frame(0);
		     driver.findElement(By.id("submit_dispense")).click();
		     
		     driver.switchTo().defaultContent();
		     		     
		     Thread.sleep(2000);
		     driver.quit();
		

	}

}
