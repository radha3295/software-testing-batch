package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit_mehtod {

	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver",
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");

			WebDriver driver=  new ChromeDriver();

			driver.get("https://www.google.com");  //get method of webdriver is used to open URL
			
			driver.navigate().to("https://www.facebook.com");
			Thread.sleep(3000);
			
			driver.navigate().to("https://www.flipcart.com");
			
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			//driver.close();
			//Thread.sleep(3000);
			
			driver.quit();
	}

}
