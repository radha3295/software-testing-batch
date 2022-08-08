package xpath_LocatorProctice;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Inspect_amezon_by_xpath 
{
	static WebDriver driver;
	public static void getscreenshot() throws IOException  
	{
		Date d=new Date(0);
		DateFormat d1=new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date=d1.format(d);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File destfile=new File("E:\\software testing\\Pavan sir Automation notes\\screenshotfolder\\sc"+date+".png");
		FileHandler.copy(sourcefile, destfile);
	}
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.amazon.in/");
		
		getscreenshot();
		
		//Thread.sleep(3000);
		WebElement singinbutton=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		singinbutton.click();
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.xpath("//input[contains(@id,'ap_email')]"));
		username.sendKeys("7020940775");
		Thread.sleep(2000);
		
		WebElement continuebutton=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[2]/span/span/input"));
		continuebutton.click();
		Thread.sleep(2000);
		
		WebElement password=driver.findElement(By.id("ap_password"));
		password.sendKeys("radha@3295");
		Thread.sleep(2000);
		
		WebElement finalsinginbutton=driver.findElement(By.id("signInSubmit"));
		finalsinginbutton.click();
		getscreenshot();
		
		WebElement searchbox=driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]"));
		searchbox.sendKeys("vivo");
		Thread.sleep(2000);
		
		WebElement manifying=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));
		manifying.click();
		Thread.sleep(2000);
		
		WebElement productsearch=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
		productsearch.click();

	}

}
