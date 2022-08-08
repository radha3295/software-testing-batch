package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action_onFecebook {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("7020940775");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("radha@3295");
		
		Actions act=new Actions(driver);
		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		act.click(loginbutton).perform();
	}

}
