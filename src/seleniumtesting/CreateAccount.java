package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\upasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Main+Page");
		driver.manage().window().maximize();	
		//check if text box is there or not at the webpage
		boolean display=driver.findElement(By.xpath("//*[@id='wpName2']")).isDisplayed();
		System.out.println(display);
		//check if text box is enabled or not at the webpage
		boolean enabled=driver.findElement(By.xpath("//*[@id='wpName2']")).isEnabled();
		System.out.println(enabled);	
		//Test case1. Username text box
		driver.findElement(By.xpath("//input[@id='wpName2']")).sendKeys("Upasana");
		//Test case 2. Password Text box
		//we can use isDisplayed and isEnabled as well here
		driver.findElement(By.xpath("//input[@id='wpPassword2']")).sendKeys("Garg");
		//Test case 3. enter data in confirm password text box
	driver.findElement(By.xpath("//input[@id='wpRetype']")).sendKeys("Garg");
	//Test case 4. Enter email id at email text box
driver.findElement(By.xpath("//input[@id='wpEmail']")).sendKeys("upasana_garg2002@yahoo.com");
		Thread.sleep(7000);//we need this wait time so that we can enter the captcha at run time
boolean buttonenabled=driver.findElement(By.xpath("//button[@id='wpCreateaccount']")).isEnabled();
		System.out.println(buttonenabled);	
		
		driver.findElement(By.xpath("//button[@id='wpCreateaccount']")).click();
		driver.close();
		
		
		
		
		
		
		
		
	}

}
