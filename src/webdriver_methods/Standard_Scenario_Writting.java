package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Standard_Scenario_Writting {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		System.out.println("Chrome Browser is opened");
		
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));		//xpath by Attribute
		username.clear();
		username.sendKeys("standard_user");
		System.out.println("usrname is entered");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		password.sendKeys("secret_sauce");
		System.out.println("passowrd is entered");
		Thread.sleep(3000);
		
		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		System.out.println("clicked on login button");
		Thread.sleep(3000);
		
		String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		if(expectedTitle==actualTitle)
		{
			System.out.println("we successfully login on homepage");
			System.out.println("testcase is passed");
		}
		else
		{
			System.out.println("testcase is failed");
		}
		driver.close();
		System.out.println("brower is closed ");
	}

}
