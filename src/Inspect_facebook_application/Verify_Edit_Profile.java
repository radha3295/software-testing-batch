package Inspect_facebook_application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Edit_Profile {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//1. xpath by contains  by attribute
		WebElement username=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		username.sendKeys("7020940775");
		
		WebElement password=driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		password.sendKeys("radha@3295");
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[contains(@name,'login')]"));
		loginbutton.click();
		
		WebElement Account=driver.findElement(By.xpath("(//div[@class='gs1a9yip ow4ym5g4 auili1gw rq0escxv j83agx80 cbu4d94t buofh1pr g5gj957u i1fnvgqd oygrvhab cxmmr5t8 hcukyx3x kvgmc6g5 tgvbjcpo hpfvmrgz rz4wbd8a a8nywdso l9j0dhe7 du4w35lb rj1gh0hx pybr56ya f10w8fjw'])[10]"));
		Account.click();
		
		//WebElement editProfile=driver.findElement(By.xpath("//span[text()='Add Bio']"));
		//editProfile.click();
		
		WebElement clicksearch=driver.findElement(By.xpath("(//label[@class='lzcic4wl gs1a9yip br7hx15l h2jyy9rg n3ddgdk9 owxd89k7 rq0escxv j83agx80 a5nuqjux l9j0dhe7 k4urcfbm kbf60n1y b3i9ofy5'])[2]"));
		clicksearch.click();
	
		
		
		
	}

}
