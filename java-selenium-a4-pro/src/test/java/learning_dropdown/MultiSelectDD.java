package learning_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDD {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.automationwithpiyush.com/dropdown.html");

		WebElement langDD = driver.findElement(By.id("multi-select"));

		Select langSel = new Select(langDD);

		langSel.selectByIndex(0);
		
		Thread.sleep(500);
		langSel.selectByIndex(3);	
		Thread.sleep(500);
		langSel.selectByValue("maven");
		Thread.sleep(500);
		langSel.selectByVisibleText("Selenium WebDriver");
		Thread.sleep(10000);

		if (langSel.isMultiple() == true) {
			langSel.deselectByIndex(3);
			Thread.sleep(500);
			langSel.deselectByValue("maven");
			Thread.sleep(500);
			langSel.deselectByVisibleText("Selenium WebDriver");
			Thread.sleep(500);
			langSel.deselectAll();

		} else {
			System.out.println("This is single select drop down");
		}

		Thread.sleep(10000);
		List<WebElement> languages = langSel.getOptions();

		for (WebElement i : languages) {
			String lang = i.getText();
			System.out.println(lang);
		}

		Thread.sleep(1000);
		langSel.selectByIndex(3);	
		Thread.sleep(500);
		langSel.selectByValue("maven");
		Thread.sleep(500);
		langSel.selectByVisibleText("Selenium WebDriver");
		Thread.sleep(1000);

		WebElement first = langSel.getFirstSelectedOption();
		System.out.println(first);

		List<WebElement> options = langSel.getAllSelectedOptions();

		for (WebElement i : options) {
			String selectedOpt = i.getText();
			System.out.println(selectedOpt);
		}

		
		Thread.sleep(1000);
		driver.quit();
	}

}
