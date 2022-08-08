package Inpsect_soucedemo_site;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inspect_end_to_end_fuctinalities {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));		//xpath by Attribute
		username.sendKeys("standard_user");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		
		WebElement addtocart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
		addtocart.click();
		
		WebElement clickonaddtocardbasket=driver.findElement(By.xpath("//span[text()='1']"));		//xpath by text
		clickonaddtocardbasket.click();
	
		WebElement clickcheckoutbutton=driver.findElement(By.xpath("//button[text()='Checkout']"));
		clickcheckoutbutton.click();
		
		WebElement firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
		firstname.sendKeys("snehal");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@id='last-name']"));
		lastname.sendKeys("kadam");
		
		WebElement postalcode=driver.findElement(By.xpath("//input[@id='postal-code']"));
		postalcode.sendKeys("415004");

		WebElement continuebutton=driver.findElement(By.xpath("//input[@id='continue']"));
		continuebutton.click();
		
		WebElement finishbutton=driver.findElement(By.xpath("//button[@id='finish']"));
		finishbutton.click();
		
		WebElement backtohomebuton=driver.findElement(By.xpath("//button[@id='back-to-products']"));
		backtohomebuton.click();
		
		WebElement menubutton=driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		menubutton.click();
		
		WebElement logoutoption=driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		logoutoption.click();
		
		
	}

}
