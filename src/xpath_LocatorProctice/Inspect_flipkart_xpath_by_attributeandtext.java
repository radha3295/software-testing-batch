package xpath_LocatorProctice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Inspect_flipkart_xpath_by_attributeandtext {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement username=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		username.sendKeys("7020940775");
		WebElement password=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		password.sendKeys("radha@3295");
		
		//find element by xpath by attribute
		//WebElement loginbutton=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		//loginbutton.click();
		
		//find element by by relative xpath
		WebElement loginbutton=driver.findElement(By.xpath("//form//div[4]//button"));
		loginbutton.click();
		
		//find elment by absolute xpath
		//WebElement loginbutton=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span"));
		//loginbutton.click();
		
		//find elment by xpath by index
		//WebElement loginbutton=driver.findElement(By.xpath("(//span[contains(text(),'Login')])[2]"));
		//loginbutton.click();
		
		
		
		
	}

}
