package learning_dropdown;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDD {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		
		driver.get("https://www.automationwithpiyush.com/dropdown.html");
		WebElement countryDD = driver.findElement(By.id("single-select"));				
		Select countySel = new Select(countryDD);
		
		
		//method-1
	//	countySel.selectByIndex(4);
		
		//method-2
	//	countySel.selectByValue("uk");
		
		//method-3
	//	countySel.selectByVisibleText("Canada");
		
		//method-4
//		List<WebElement> countries =countySel.getOptions();
//		
//	    for(WebElement i : countries) 
		{
//			String text = i.getText();
//			System.out.println(text);
//		}
//		
		//method-5
		if (countySel.isMultiple() == true)
		{
			countySel.deselectAll();
		} 
		else {
			System.out.println("This is single select dropdown");
		}

		Thread.sleep(1000);
		driver.quit();
		
	}

	}}
