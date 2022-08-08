package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_methods {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");

		WebDriver driver=  new ChromeDriver();

		//driver.get("https://www.google.com");  //get method of webdriver is used to open URL
		//Thread.sleep(5000);
		
		driver.navigate().to("https://www.facebook.com");	//used to open new URL
		Thread.sleep(5000);
		
		driver.navigate().back();			//used to go to back URL
		Thread.sleep(5000);
		
		driver.navigate().forward();		// used to go to next URL
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		
		
	}

}
