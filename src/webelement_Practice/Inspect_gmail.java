package webelement_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inspect_gmail {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/gmail");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement username=driver.findElement(By.id("identifierId"));
		username.sendKeys("7020940775");
		
		WebElement nextbutton=driver.findElement(By.className("VfPpkd-vQzf8d"));
		nextbutton.click();
		
		//WebElement password=driver.findElement(By.id("identifierId"));
		//password.sendKeys("radha3295");

	}

}
