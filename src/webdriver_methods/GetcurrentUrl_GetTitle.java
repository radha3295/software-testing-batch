package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetcurrentUrl_GetTitle {

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
		
		driver.manage().window().maximize();
		
		String actual_URL=driver.getCurrentUrl();
		System.out.println(actual_URL);
		
		String actual_title=driver.getTitle();
		System.out.println(actual_title);

	}

}
