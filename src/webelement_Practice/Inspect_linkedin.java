package webelement_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inspect_linkedin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.linkedin.com/home");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement singninbutton=driver.findElement(By.tagName("a"));
		
		WebElement username=driver.findElement(By.name("session_key"));
		username.sendKeys("7020940775");
		
		WebElement password=driver.findElement(By.name("session_password"));
		password.sendKeys("radha@3295");
		
		WebElement finalsinginbutton=driver.findElement(By.className("sign-in-form__submit-button"));
		finalsinginbutton.click();

	}

}
