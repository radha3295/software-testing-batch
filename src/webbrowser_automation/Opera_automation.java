package webbrowser_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Opera_automation {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.opera.driver",
				"E:\\software testing\\browesr driver\\webdrivers\\operadriver.exe");

						WebDriver driver=  new OperaDriver();

						driver.get("https://www.google.com");

	}

}
