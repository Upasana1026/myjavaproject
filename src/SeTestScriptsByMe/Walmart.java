package SeTestScriptsByMe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Walmart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\upasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.walmart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='global-search-input']")).sendKeys("milk");
		
		driver.findElement(By.xpath("//button[@id='global-search-submit']")).click();
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
