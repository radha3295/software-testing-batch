package Popups_handling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authotication_Popup_handling {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://username:passeword@the-internet.herokuapp.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

}
