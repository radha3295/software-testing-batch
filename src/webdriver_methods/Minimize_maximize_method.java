package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize_maximize_method {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");

		WebDriver driver=  new ChromeDriver();

		driver.get("https://www.google.com");  //get method of webdriver is used to open URL
		Thread.sleep(5000);		// used to pause window for 5 sec
		
		driver.manage().window().maximize();	//used to maximize the window
		Thread.sleep(5000);
		
		driver.manage().window().minimize();	//used to minimize the window
		Thread.sleep(5000);
		
		driver.manage().window().maximize();	
		Thread.sleep(5000);
		
		driver.close();					//used to close the open window


	}

}
