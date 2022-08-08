package webelement_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inspect_amezon {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement singinbutton=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		singinbutton.click();
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.id("ap_email"));
		username.sendKeys("7020940775");
		Thread.sleep(2000);
		
		WebElement continuebutton=driver.findElement(By.id("continue"));
		continuebutton.click();
		Thread.sleep(2000);
		
		WebElement password=driver.findElement(By.id("ap_password"));
		password.sendKeys("radha@3295");
		Thread.sleep(2000);
		
		WebElement finalsinginbutton=driver.findElement(By.id("signInSubmit"));
		finalsinginbutton.click();
				
	}

}
