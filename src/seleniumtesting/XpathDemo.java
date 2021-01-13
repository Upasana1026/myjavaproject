package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\upasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");
		driver.manage().window().maximize();	
		String X=driver.findElement(By.xpath("//li[text()='22664.0']")).getText();
		
		System.out.println(X);
		
		
driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
	driver.findElement(By.xpath("//a[text()='Main page']")).click();
	Thread.sleep(4000);
	
	//System.out.println(Y);	
	driver.close();	
		
		
		
		
	}

}
