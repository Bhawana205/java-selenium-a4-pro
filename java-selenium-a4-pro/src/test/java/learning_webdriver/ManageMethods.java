package learning_webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {

	public static void main(String[] args) throws InterruptedException {
		

		// First line of code
		WebDriver driver = new ChromeDriver();
        
	  // Second line of code
		driver.manage().window().maximize();

		
		driver.get("https://www.amazon.in");

		// Manage methods

//		driver.manage().window().minimize();
//		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
//		driver.manage().window().getSize();

//		Navigation nav = driver.navigate();
//		nav.to("https://www.instagram.com");
		
		
		Window win = driver.manage().window();

		
		win.maximize();      //return type - void

		Thread.sleep(1000);

		win.minimize();     //return type - void

		Thread.sleep(1000);
		
		win.fullscreen();
		
		Thread.sleep(1000);
		
		win.maximize();   
		
		Dimension dim = win.getSize();            //return type - Dimension class

		System.out.println("dimension of the page window is : " +dim);         
		System.out.println("width of the window is : " +dim.getWidth());      //return type - int
		System.out.println("height of the window is : " +dim.getHeight());     //return type - int
		
		Thread.sleep(1000);
		
	//	win.setSize(new Dimension(250, 200));   //return type - void
		win.setSize(new Dimension(dim.getWidth(), 400));
		
//		Point pt = win.getPosition();      //return type - Point class
//		
//		
//		System.out.println("****************************************************");
//		
//		System.out.println("Position of the window is : " +pt);           
//		System.out.println("Value of x : " +pt.getX());     //return type - int
//		System.out.println("Value of y : " +pt.getY());     //return type - int
//		
//		Thread.sleep(1000);
//		
//		win.setPosition(new Point(10, 100));
//		
//		Thread.sleep(500);
//		
//		win.setPosition(new Point(10, 200));
//		
//		Thread.sleep(500);
//		
//		driver.quit();
//		

	}

}
