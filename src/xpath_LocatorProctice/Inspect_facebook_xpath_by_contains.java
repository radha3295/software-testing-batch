package xpath_LocatorProctice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inspect_facebook_xpath_by_contains {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//1. xpath by contains  by attribute
		WebElement username=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		username.sendKeys("7020940775");
		
		WebElement password=driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		password.sendKeys("radha@3295");
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[contains(@name,'login')]"));
		loginbutton.click();
		
		
		//1. xpath by contains  by text
		//WebElement forgotpassword=driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
		//forgotpassword.click();
		
		
		

	}

}
