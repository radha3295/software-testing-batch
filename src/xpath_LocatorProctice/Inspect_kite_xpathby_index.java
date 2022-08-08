package xpath_LocatorProctice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inspect_kite_xpathby_index {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(3000);
		
		WebElement userid=driver.findElement(By.xpath("//input[@id='userid']"));
		userid.sendKeys("XDW500");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("radha@3295");
		
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(2000);
		
		WebElement pin=driver.findElement(By.xpath("//input[@type='password']"));
		pin.sendKeys("321995");
		
		WebElement continuebutton=driver.findElement(By.xpath("//button[@type='submit']"));
		continuebutton.click();
		WebElement productclick=driver.findElement(By.xpath("((//span[@class='symbol'][1])"));
		productclick.click();
		
	}

}
