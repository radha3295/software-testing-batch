package webbrowser_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Mozila_automation {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver",
				"E:\\software testing\\browesr driver\\webdrivers\\geckodriver.exe");

						WebDriver driver=  new FirefoxDriver();

						driver.get("https://www.google.com");

	}

}
