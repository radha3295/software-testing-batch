package Inpsect_soucedemo_site;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Checkout_process {

	public static void main(String[] args)
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

		WebElement addtocart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
		addtocart.click();
		
		WebElement clickonaddtocardbasket=driver.findElement(By.xpath("//span[text()='1']"));		//xpath by text
		clickonaddtocardbasket.click();
		System.out.println("product is showing in basket");
		

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

	}

}
