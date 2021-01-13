package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//WebElement ==is an object in selenium that is used to store an element location
		//we use webelement to make our scripts more neat and clean, crisp.
		//we don't need to write driver.findelement over and over again.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\upasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Main+Page");
		driver.manage().window().maximize();	
		WebElement e=driver.findElement(By.xpath("//*[@id='wpName2']"));
		WebElement e1=driver.findElement(By.xpath("//*[@id='wpPassword2']"));
		WebElement e2=driver.findElement(By.xpath("//input[@id='wpRetype']"));
		WebElement e3=driver.findElement(By.xpath("//input[@id='wpEmail']"));
		WebElement e4=driver.findElement(By.xpath("//button[@id='wpCreateaccount']"));
		
		e.isDisplayed();
		e.isEnabled();
		e.sendKeys("upasana");
		
		e1.isDisplayed();
		e1.isEnabled();
		e1.sendKeys("garg");
		
		e2.isDisplayed();
		e2.isEnabled();
		e2.sendKeys("garg");
		
		e3.isDisplayed();
		e3.isEnabled();
		e3.sendKeys("upasana_garg2002@yahoo.com");
		
		Thread.sleep(4000);
		
		e4.isDisplayed();
		e4.isEnabled();
		e4.click();
		
		driver.close();
		
		
		
		
	}

}
