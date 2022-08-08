package Popups_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_createaccout_popup {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement createaccount=driver.findElement(By.xpath("//a[@id='u_0_0_Dv']"));
		createaccount.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement close=driver.findElement(By.xpath("//input[@placeholder='First name']"));
		close.sendKeys("snehal");

	}

}
