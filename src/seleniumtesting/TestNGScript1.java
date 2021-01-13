package seleniumtesting;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGScript1 {

	
	@Test
	public void DynamicSearchBoxWiki()
	{

		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\upasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		
			driver.manage().window().maximize();
			driver.get("https://en.wikipedia.org/wiki/Special:Search?search=seleniu&go=Go&ns0=1");
			//driver.findElement(By.xpath("//*[@id='simpleSearch']")).sendKeys("Java");
			driver.findElement(By.xpath("//input[@placeholder='Search Wikipedia']")).sendKeys("java");
			Thread.sleep(5000);
	//List<WebElement>li= driver.findElements(By.xpath("//ul[@class='sa-tray-list-container']/descendant::/li"));
			//List<WebElement>li= driver.findElements(By.xpath("//ul[@class='sa-tray-list-container']/li"));
			List<WebElement>li= driver.findElements(By.xpath("//*[@class='suggestions']/descendant::a"));
			int s =li.size();
			System.out.println(s);
			//To print all the values in the list
			for (int i=0; i<s;i++)
			{
				//System.out.println(li.get(i).getText());
				String text=li.get(i).getText();
				if(text.contains("javascript"))
				{
					li.get(i).click();
				
				break;
			}
			
			}
			Thread.sleep(3000);
		driver.close();	
			}
			
	



	
		
		
		
		
		
		
	}

}
