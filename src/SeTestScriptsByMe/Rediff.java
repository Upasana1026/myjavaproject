package SeTestScriptsByMe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\upasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().fullscreen();	
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
	}

}
