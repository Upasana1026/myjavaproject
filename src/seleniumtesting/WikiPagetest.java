package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiPagetest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\upasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().fullscreen();
		//Test step 1. locate the text box and enter data in that textbox
		//1st locator==id
		//driver.findElement(By.id("searchInput")).sendKeys("Selenium Testing");
		//2nd locator==name
		//driver.findElement(By.name("search")).sendKeys("selenium testing");
		//3rd locator==classname
		//driver.findElement(By.className("  "))----it is not applicable here as class name is not there
		//4th locator==tagname
		//driver.findElement(By.tagName("input")).sendKeys("Selenium testing");--
		//we can not use tagnames in script as tagnames are not unique
		//5th locator==xpath---Relative xpath
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium Testing");  
		Thread.sleep(2000);		
		//6th locator==xpath==absolute/full xpath
		//driver.findElement(By.xpath("/html/body/div[3]/form/fieldset/div/input")).sendKeys("selenium testing");
      //6th locator==css selector==copy selector from inspect 
	//driver.findElement(By.cssSelector("#searchInput")).sendKeys("Selenium testing");
		Thread.sleep(3000);
		//Test step2. locate the button and click on it
	//here i have used full xpath, make sure u hover 
		//on the button not the inside magnifying glass on the webpage
	driver.findElement(By.xpath("/html/body/div[3]/form/fieldset/button")).click();
	
	Thread.sleep(3000);	
	driver.close();
		
	}

}
