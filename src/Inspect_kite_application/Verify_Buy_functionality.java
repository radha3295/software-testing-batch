package Inspect_kite_application;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Verify_Buy_functionality {

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
				
				WebElement search=driver.findElement(By.xpath("//input[@icon='search']"));
				search.sendKeys("tata");
				
				WebElement tatapower=driver.findElement(By.xpath("(//li[@class='search-result-item'])[6]"));
				tatapower.click();
				
				WebElement selectQuantity=driver.findElement(By.xpath("(//input[@type='number'])[1]"));
				selectQuantity.sendKeys("2");
				
				WebElement selectMktPrice=driver.findElement(By.xpath("(//label[@class='su-radio-label'])[9]"));
				selectMktPrice.click();
				
				WebElement buyOption=driver.findElement(By.xpath("(//span[text()='Buy'])[2]"));
				buyOption.click(); 
				
			
				

	}

}
