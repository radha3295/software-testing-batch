package webelement_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inspect_facebook {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("7020940775");
		
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("radha@3295");
		
		WebElement loginbutton=driver.findElement(By.name("login"));
		loginbutton.click();
		
	}

}
