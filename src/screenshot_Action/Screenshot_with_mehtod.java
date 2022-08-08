package screenshot_Action;

import java.io.File;
import java.io.IOException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_with_mehtod
{
		static WebDriver driver;
		public static void takeScreenshot() throws IOException			//we are using mehthod to take screenshot so we can avoid the repetative code of 4 line coder of screenhot
		{
			//date time format code
			Date d = new Date();
			DateFormat d1 = new SimpleDateFormat("MM-dd-yy& HH-mm-ss");
			String date = d1.format(d);
			
			//screenshot
			TakesScreenshot ts = (TakesScreenshot)driver;
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			File destFile = new File("E:\\software testing\\Pavan sir Automation notes\\screenshotfolder\\file"+date+".jpg");
			FileHandler.copy(sourceFile, destFile);
			System.out.println("login screenshot is taken");
		}

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe\\");
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		takeScreenshot();				//method call --- take screenshot of login page 
		
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		
		takeScreenshot();				//method call --- take screenshot of homepage 
		
	}

}
