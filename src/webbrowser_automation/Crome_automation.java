package webbrowser_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crome_automation {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\software testing\\crome browesr driver\\chromedriver_win32\\chromedriver.exe");

						WebDriver driver=  new ChromeDriver();

						driver.get("https://www.google.com");


	}

}
