package webelement_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class WebElement_method2 {

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
		
		
		//isDisplayed() -- return boolean value if object is displyed or not
		WebElement showbutton=driver.findElement(By.xpath("//input[@id='show-textbox']"));
		showbutton.click();
		WebElement textbox=driver.findElement(By.xpath("//input[@id='displayed-text']"));
		boolean result =textbox.isDisplayed();
		System.out.println("after click on show button "+result);
		
		WebElement hidebutton=driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		hidebutton.click();
		boolean result2=textbox.isDisplayed();
		System.out.println("after click on show button"+ result2);
		
		
		//isEnabled()-- return the boolean value true or false--if textbox is enable or not 
		WebElement textbox2=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		boolean result3=textbox2.isEnabled();
		if(result3==true)
		{
			System.out.println("we can enter value in textbox2");
		}
		else
		{
			System.out.println("we cannot enter value in textbox2");
		}
		
		textbox2.sendKeys("this textbox is enalbed");
		
		
		//isSelected()---returns the boolean value true or false if object is selected or not selected 
		WebElement radiobutton3=driver.findElement(By.xpath("//input[@value='Radio3']"));
		radiobutton3.click();
		Thread.sleep(3000);
		System.out.println(radiobutton3.isSelected());
		
		WebElement radiobutton4=driver.findElement(By.xpath("//input[@value='Radio4']"));
		radiobutton4.click();
		Thread.sleep(3000);
		System.out.println(radiobutton3.isSelected());
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		checkbox.click();
		Thread.sleep(3000);
		System.out.println(checkbox.isSelected());
		
		WebElement checkbox2=driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		//checkbox2.click();
		Thread.sleep(3000);
		System.out.println(checkbox2.isSelected());
		
		
	}

}
