package collections_concept;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finding_element_using_collection {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));		//xpath by Attribute
		username.sendKeys("standard_user");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		
		List<WebElement> addToCart=driver.findElements(By.xpath("//button[text()='Add to cart']"));
		//to add multiple items in addto cart 
//		 addToCart.get(0).click();
//		 addToCart.get(1).click();
//		 addToCart.get(2).click();
//		 addToCart.get(3).click();
		
		//OR
		
		for(int i=0;i<addToCart.size();i++)
		{
			addToCart.get(i).click();
		}
		
		
		//to remove last 2 items form cart
		List<WebElement> removefromCart=driver.findElements(By.xpath("//button[text()='Remove']"));
		for(int j=0;j<removefromCart.size()-2;j++)
		{
			removefromCart.get(j).click();
		}
	}

}
