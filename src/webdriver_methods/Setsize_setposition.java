package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize_setposition {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");

		WebDriver driver=  new ChromeDriver();

		driver.get("https://www.google.com");  //get method of webdriver is used to open URL
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.facebook.com");	//used to open new URL
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.whatsapp.com");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Dimension d=new Dimension(600,400);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		
		Point p=new Point(200,200);
		driver.manage().window().setPosition(p);
		
		
	}

}
