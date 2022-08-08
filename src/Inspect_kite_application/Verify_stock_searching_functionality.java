package Inspect_kite_application;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Verify_stock_searching_functionality {

	public static void main(String[] args) throws InterruptedException 
	{
		// create instance of ChromeOptions class
				ChromeOptions options = new ChromeOptions();

				//Then Add chrome switch to disable notification - "--disable-notifications"
				options.addArguments("--disable-notifications");
						
				System.setProperty("webdriver.chrome.driver", 
						"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
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
				
				WebElement startInvesting=driver.findElement(By.xpath("(//button[@class='button-blue'])[1]"));
				startInvesting.click();
				
				WebElement stocksearh=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
				stocksearh.sendKeys("zomato");
				
				WebElement product=driver.findElement(By.xpath("//li[@class='search-result-item selected']"));
				product.click();
				
	}

}
