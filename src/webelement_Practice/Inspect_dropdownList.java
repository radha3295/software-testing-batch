package webelement_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Inspect_dropdownList {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement practice=driver.findElement(By.xpath("//a[text()='PRACTICE']"));
		practice.click();
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		dropdown.click();
		
		Select s=new Select(dropdown);//to select option from dropdown list we need to create object of select
										//because there is no such mehtod of wedriver or webelement for selecting option from dropdown list
		
		s.selectByIndex(3);		//by indexing we select  option from dropdown list 
		
		s.selectByValue("option1");		//by attribute value we select option from dropdown list
		
		s.selectByVisibleText("Option2");		// by uting html text we select option from dropdown list 
		
		
		
		
		
		
	}

}
