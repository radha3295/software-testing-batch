package webelement_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_mehtods {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		WebElement username=driver.findElement(By.name("user-name"));
//		username.clear();									//cler() of webelement
//		username.sendKeys("standard_user");					//sendkey() of webelement
//		Thread.sleep(3000);
//	
//		
//		WebElement password=driver.findElement(By.id("password"));
//		password.clear();
//		password.sendKeys("secret_sauce");
//		Thread.sleep(3000);
//		
//		WebElement loginbutton=driver.findElement(By.id("login-button"));
//		loginbutton.click();				//click () of webelement
		
		
		
		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		System.out.println("tagnameis ="+loginbutton.getTagName());		//geTagName()--return the tagname
		System.out.println("attribute value is="+loginbutton.getAttribute("id")); //getAttribute()--return the value of attrivute
		System.out.println("html text ="+loginbutton.getText());	//getText()--return the html text
		
		
		
		
		
		
		
		
	}
}