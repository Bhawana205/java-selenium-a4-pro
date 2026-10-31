package learning_actions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String[] args) throws InterruptedException{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://www.automationwithpiyush.com/actions.html");
		
		Actions act = new Actions(driver);
		
		//task-1 hover
	    WebElement hover =	driver.findElement(By.cssSelector("[onmouseenter='handleHover()']"));
	    Thread.sleep(1000);	    
	    act.moveToElement(hover).build().perform();
	    
	    //task-2 leftclick
	    WebElement leftClick = driver.findElement(By.id("click-box"));
	    Thread.sleep(1000);	 
	    act.click(leftClick).build().perform();
	    
	    //task-3 rightclick
	    WebElement rightClick = driver.findElement(By.id("right-click-area"));
	    Thread.sleep(1000);	 
	    act.contextClick(rightClick).build().perform();
	    
	    //task-4 doubleclick
	    WebElement doubleClick = driver.findElement(By.id("double-click-area"));
	    Thread.sleep(1000);	 
	    act.doubleClick(doubleClick).build().perform();
	    
	    //task-5 click&hold&release
	    WebElement hold = driver.findElement(By.id("click-hold"));   
	    act.clickAndHold(hold).build().perform();
	    Thread.sleep(6000);	
	    act.release().build().perform();
	    
	    //task-6 drag&drop	   
	    
	    WebElement src1 = driver.findElement(By.id("prod-laptop"));
	    WebElement dest1 = driver.findElement(By.id("cart-zone"));  
	    
	    WebElement src = driver.findElement(By.id("prod-phone"));
	    WebElement dest = driver.findElement(By.id("cart-zone")); 
	    
	    WebElement src2 = driver.findElement(By.id("prod-watch"));
	    WebElement dest2 = driver.findElement(By.id("cart-zone")); 
	    
	    WebElement src3 = driver.findElement(By.id("prod-headphones"));
	    WebElement dest3 = driver.findElement(By.id("cart-zone")); 
	    act.dragAndDrop(src1, dest1).build().perform();
	    Thread.sleep(1000);
	    act.dragAndDrop(src, dest).build().perform();
	    Thread.sleep(1000);
	    act.dragAndDrop(src2, dest2).build().perform();
	    Thread.sleep(2000);
	    act.dragAndDrop(src3, dest3).build().perform();
	    Thread.sleep(1000);    
	    
	    //task-7 
	    WebElement slider = driver.findElement(By.id("pulse-slider"));
	  	act.moveToElement(slider,100,0).click().build().perform();
	    
	    
	    //task-8
	  	
	   
	    
	    
	    
	

	}

}
