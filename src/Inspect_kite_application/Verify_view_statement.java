package Inspect_kite_application;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Verify_view_statement {

	public static void main(String[] args) throws InterruptedException 
	{
		// create instance of ChromeOptions class
		ChromeOptions options = new ChromeOptions();

		//Then Add chrome switch to disable notification - "--disable-notifications"
		options.addArguments("--disable-notifications");
				
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		  
		driver.get("https://kite.zerodha.com/");
		System.out.println("kite is opening");
		
		//implicite wait is used
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement userid=driver.findElement(By.xpath("//input[@id='userid']"));
		userid.sendKeys("XDW500");
		System.out.println("userid is entered");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("radha@3295");
		System.out.println("password is entered");
		
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		System.out.println("you are login ");
		Thread.sleep(2000);
		
		WebElement pin=driver.findElement(By.xpath("//input[@type='password']"));
		pin.sendKeys("321995");
		Thread.sleep(2000);
		System.out.println("pin is entered");
		
		WebElement continuebutton=driver.findElement(By.xpath("//button[@type='submit']"));
		continuebutton.click();
		System.out.println("sucessfully login on kite application");
		
		WebElement viewStatement=driver.findElement(By.linkText("View statement"));
		Actions act=new Actions(driver);
		act.click(viewStatement).perform();
		//viewStatement.click();
		
		driver.navigate().to("https://console.zerodha.com/funds/statement?segment=equity");
		WebElement category=driver.findElement(By.tagName("select"));
		Select s=new Select(category);
		s.selectByVisibleText("Commodity");
		
		WebElement dateRangeSelect=driver.findElement(By.xpath("//input[@name='date']"));
		dateRangeSelect.click();
		
		WebElement selectFromDate=driver.findElement(By.xpath("(//td[@title='2022-07-01'])[1]"));
		selectFromDate.clear();
		WebElement forwordArrow=driver.findElement(By.xpath("(//a[@class='mx-icon-next-month'])[2]"));
		forwordArrow.click();
		WebElement selectToDate=driver.findElement(By.xpath("//td[@title='2022-08-31']"));
		selectToDate.click();
		
	}

}
