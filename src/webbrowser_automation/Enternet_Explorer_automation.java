package webbrowser_automation;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Enternet_Explorer_automation {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver",
				"E:\\software testing\\browesr driver\\webdrivers\\IEDriverServer.exe");

						WebDriver driver=  new InternetExplorerDriver();

						driver.get("https://www.google.com");

	}

}
