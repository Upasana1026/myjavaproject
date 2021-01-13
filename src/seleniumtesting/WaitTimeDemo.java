package seleniumtesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTimeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\upasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);//
		//initial wait time to load the page
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//it applies to each and every web element on page eg 5 seconds seprately here
	//driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium Testing");  
		//Thread.sleep(2000);	
	//explicit wait is applied on a particular web element
		WebElement e= driver.findElement(By.xpath("//input[@id='searchInput']"));
		WebDriverWait w= new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOf(e));
		e.sendKeys("Selenium Testing");
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
	}

}
