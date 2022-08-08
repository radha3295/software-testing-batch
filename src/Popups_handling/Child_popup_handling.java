package Popups_handling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_popup_handling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://vctcpune.com/");
		
		String mainPageAddress=driver.getWindowHandle();
		System.out.println(mainPageAddress);
		
		WebElement nextpage=driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		nextpage.click();
		
//		Set<String> allpageaddresses=driver.getWindowHandles();
//		System.out.println(allpageaddresses);
//		
		List<String> allpageaddresses=new ArrayList<String>(driver.getWindowHandles());
		System.out.println("all page addresses= " +allpageaddresses);
		
		driver.switchTo().window(allpageaddresses.get(1));
		WebElement textbox=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		textbox.sendKeys("we are indians");
		
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		}

}
