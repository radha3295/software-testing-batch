package waits_Concept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		//Explicit wait apply here----applicable only single username element
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("user-name"))));
		
		
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));		//xpath by Attribute
		username.sendKeys("standard_user");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		
		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
	}

}
