package screenshot_Action;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_handling {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		
		File destFile=new File("E:\\software testing\\Pavan sir Automation notes\\screenshotfolder\\loginpage.jpg");
		FileHandler.copy(sourcefile, destFile);
		
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
	
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		
		File homePageSourcefile=ts.getScreenshotAs(OutputType.FILE);
		
		File homePageDestFile=new File("E:\\software testing\\Pavan sir Automation notes\\screenshotfolder\\homepage screenshot.jpg");
		
		FileHandler.copy(homePageSourcefile, homePageDestFile);
	
	}

}
