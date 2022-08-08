package practice_scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Inspect_amezon {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.amezon.com/");
		Thread.sleep(3000);
		
		WebElement clickonAccount=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		clickonAccount.click();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='ap_email']"));
		username.sendKeys("7020940775");
		
		WebElement continuebutton=driver.findElement(By.xpath("//input[@id='continue']"));
		continuebutton.click();
		
		WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("radha@3295");
		
		WebElement singinbutton=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		singinbutton.click();
		
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("mobile");
		
		//WebElement selectitem=driver.findElement(By.xpath("(//div[@role='button'])[7]"));
		//selectitem.click();
		//Thread.sleep(2000);
		
		//Select s=new Select(selectitem);
		//s.selectByVisibleText( "phone");
		
		WebElement magnifying=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		magnifying.click();
		
	}

}
