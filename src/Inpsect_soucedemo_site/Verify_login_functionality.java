package Inpsect_soucedemo_site;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_login_functionality {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("application is opeded");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		//implicit wait is used
		
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));		//xpath by Attribute
		username.sendKeys("standard_user");
		System.out.println("username enterd");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		System.out.println("password entered");
		
		
		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		System.out.println("login sucessfully");

	}

}
