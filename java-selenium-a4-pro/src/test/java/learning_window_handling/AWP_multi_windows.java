package learning_window_handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_multi_windows {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.automationwithpiyush.com/index.html");
		
		
		//1. get the home address or session id
             String parentId = driver.getWindowHandle();
             
        //2. perform task to open new windows or new tabs
             driver.findElement(By.cssSelector("[onclick='openSocialChannels()']")).click();
             
        //3. get all the window addresses or session id
              Set<String> childIds  = driver.getWindowHandles();
         
        //4. switch to each and every tab/window
              for (String i : childIds) {
				
            	   driver.switchTo().window(i);
            	   System.out.println(driver.getTitle());
          //5. break the loop when condition meets  	  
            	   if (driver.getTitle().contains("X")) {
				        break;	
				}          	  
			}
           //6. perform the task
              Thread.sleep(2000);
              driver.close();
           //7. come to home
               driver.switchTo().window(parentId);
               
              Thread.sleep(1000);
              driver.quit();
            
	}

}
