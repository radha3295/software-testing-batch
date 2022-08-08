package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_mouse_action {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(3000);
		
		WebElement capital=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement country=driver.findElement(By.xpath("//div[@id='box106']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(capital, country);
		
		WebElement country1=driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement capital1=driver.findElement(By.xpath("//div[@id='box107']"));
		act.dragAndDrop(country1, capital1).perform();
	}

}
