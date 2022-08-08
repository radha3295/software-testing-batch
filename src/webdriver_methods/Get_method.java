package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_method {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");

		WebDriver driver=  new ChromeDriver();

		driver.get("https://www.google.com");  //get method of webdriver is used to open URL


	}

}
