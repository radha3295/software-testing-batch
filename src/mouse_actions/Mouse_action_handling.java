package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action_handling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);		//for performing mouse action we need to use Actions class of selenium
	
		WebElement doubleclickme=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		act.doubleClick(doubleclickme).perform();
		
		WebElement rightclick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		act.contextClick(rightclick).perform();
		
		WebElement clickme=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]"));
		act.click(clickme).perform();
		
		
		
	}

}
