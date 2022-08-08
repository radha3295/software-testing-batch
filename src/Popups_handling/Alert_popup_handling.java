package Popups_handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup_handling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement clickme1=driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickme1.click();
		
		//handle alert
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		
		alt.accept();
		
		WebElement clickme2=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		clickme2.click();
		
		

	}

}
