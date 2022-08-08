package collections_concept;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inspect_table_elements {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\software testing\\browesr driver\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List <WebElement> columnHeading=driver.findElements(By.xpath("//table//tbody//tr//th"));
		
		System.out.println(" no of coumn headings "+columnHeading.size());
		for(int i=0;i<columnHeading.size();i++)
		{
			String result=columnHeading.get(i).getText();
			System.out.println(" column headings " +result);
		}
		
		List<WebElement> Celldata=driver.findElements(By.xpath("//table//tbody/tr/td"));
		System.out.println("no of cells in table"+Celldata.size());
		for(int i=0;i<Celldata.size();i++)
		{
			String cellresult=Celldata.get(i).getText();
			System.out.println(cellresult);
		}
		

	}

}
