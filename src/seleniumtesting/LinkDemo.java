package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\upasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Main+Page");
		driver.manage().window().fullscreen();	
		WebElement l1=driver.findElement(By.linkText("Main page"));
		l1.isDisplayed();
		l1.isEnabled();
		l1.click();
		Thread.sleep(3000);
		System.out.println("Title of main page " + driver.getTitle());//title of main page
		driver.navigate().back();
System.out.println("Title of create account page " + driver.getTitle());//title of create account page
Thread.sleep(3000);

WebElement l2=driver.findElement(By.linkText("About Wikipedia"));
		Thread.sleep(3000);
System.out.println("Title of web2 page " + driver.getTitle());//title of about wikipedia page
//we can also use By.partialLinkText when we give partial text of the link 
//but it is not recommended as parts of many links at one webpage are very common
		l2.isDisplayed();
		l2.isEnabled();
		l2.click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Title of web3 page" + driver.getTitle());//Create account page title
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
	}

}
