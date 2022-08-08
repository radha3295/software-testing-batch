package webelement_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inspect_Orangehrm {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement username=driver.findElement(By.name("txtUsername"));
		username.sendKeys("admin");
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		Thread.sleep(3000);
		
		WebElement loginbutton=driver.findElement(By.name("Submit"));
		loginbutton.click();
		


	}

}
