package Iframe_concept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Verify_ifram_VCTC {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//find ifram element
		WebElement frame2=driver.findElement(By.xpath("//iframe[@id='frame2']"));
		
		//swith from main window to frame
		driver.switchTo().frame(frame2);
		
		//then find element which we want from iframe
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='animals']"));
		dropdown.click();
		
		Select s=new Select(dropdown);
		s.selectByVisibleText("Big Baby Cat");
		dropdown.click();
		
		driver.switchTo().defaultContent();
		// swith to frame1
		WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame1);
		WebElement textbox=driver.findElement(By.xpath("(/html/body/input)[1]"));
		textbox.sendKeys("this is frame1");
		
//		//switch to frame3
		WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(frame3);
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='a']"));
		Actions act=new Actions(driver);
		act.click(checkbox).perform();
		
		
		
		
		
		
		
	}

}
