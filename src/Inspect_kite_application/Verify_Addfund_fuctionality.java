package Inspect_kite_application;

import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Verify_Addfund_fuctionality {

	public static void main(String[] args) throws InterruptedException
	{
		// create instance of ChromeOptions class
		ChromeOptions options = new ChromeOptions();

		//Then Add chrome switch to disable notification - "--disable-notifications"
		options.addArguments("--disable-notifications");
				
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		  
		driver.get("https://kite.zerodha.com/");
		System.out.println("kite is opening");
		
		//implicite wait is used
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement userid=driver.findElement(By.xpath("//input[@id='userid']"));
		userid.sendKeys("XDW500");
		System.out.println("userid is entered");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("radha@3295");
		System.out.println("password is entered");
		
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		System.out.println("you are login ");
		Thread.sleep(2000);
		
		WebElement pin=driver.findElement(By.xpath("//input[@type='password']"));
		pin.sendKeys("321995");
		Thread.sleep(2000);
		System.out.println("pin is entered");
		
		WebElement continuebutton=driver.findElement(By.xpath("//button[@type='submit']"));
		continuebutton.click();
		System.out.println("sucessfully login on kite application");
		
		WebElement fund=driver.findElement(By.xpath("//span[text()='Funds']"));
		fund.click();
		
		//Click on Add fund button
		WebElement addFundbutton=driver.findElement(By.xpath("//button[@class='button-green']"));
		addFundbutton.click();
		
		//enter amount 
		WebElement addamount=driver.findElement(By.xpath("//input[@id='addfunds_amount']"));
		addamount.sendKeys("100");
		
		//select segment
		WebElement select_segment=driver.findElement(By.xpath("//select[@id='segment_select']"));
		Select s=new Select(select_segment);
		
		
	}

}
