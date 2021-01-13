package seleniumtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicSearchBoxKohls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\upasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.kohls.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("cloth");
		//Thread.sleep(10000);
		//WebDriverWait w= new WebDriverWait(driver,3000);
		  //w.until(ExpectedConditions.visibilityOfAllElements(li);


		List<WebElement>li= driver.findElements(By.xpath("//ul[@id='K1000']/descendant::li"));
		
		int s =li.size();
		System.out.println(s);
		//To print all the values in the list
		for (int i=0; i<s;i++)
		{
			System.out.println(li.get(i).getText());
		}
	}

}
