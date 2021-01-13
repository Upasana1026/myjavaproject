package seleniumtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicSearchBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\upasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://search.yahoo.com/");
		driver.findElement(By.xpath("//input[@id='yschsp']")).sendKeys("Java");
		//Thread.sleep(10000);
		WebDriverWait w= new WebDriverWait(driver,3000);
		  //w.until(ExpectedConditions.visibilityOfAllElements(li);

//List<WebElement>li= driver.findElements(By.xpath("//ul[@class='sa-tray-list-container']/descendant::/li"));
		List<WebElement>li= driver.findElements(By.xpath("//ul[@class='sa-tray-list-container']/li"));
		
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
	driver.close();	
		
		
		
		
		
		
	}

}
