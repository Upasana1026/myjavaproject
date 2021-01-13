package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxRadiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\upasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.manage().window().maximize();
		//driver.get("https://ironspider.ca/forms/checkradio.htm");//or
		driver.get("https://ironspider.ca/forms/dropdowns.htm");
		driver.findElement(By.linkText("Checkboxes & Radio Buttons")).click();
		/*
		WebElement e=driver.findElement(By.xpath("//input[@value='red']"));
		
		WebElement e1=driver.findElement(By.xpath("//input[@value='yellow']"));
		
		System.out.println("Is red checkbox dispalyed " + e.isDisplayed());//true
		System.out.println("Is red checkbox enabled " + e.isEnabled());//true
		System.out.println("Is red checkbox selected " + e.isSelected());//false
		e.click();
		Thread.sleep(3000);
		
		
		System.out.println("Is red checkbox selected " + e.isSelected());//true
		Thread.sleep(3000);
		
		System.out.println("Is yellow checkbox dispalyed " + e1.isDisplayed());//true
		System.out.println("Is yellow checkbox enabled " + e1.isEnabled());//true
		System.out.println("Is yellow checkbox selected " + e1.isSelected());//false
		e1.click();
		
		System.out.println("Is yellow checkbox selected " + e1.isSelected());//true
		Thread.sleep(3000);*/
		//driver.close();
		
		//Assignment--do it for radio buttons
		//driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form")).click();
WebElement e2=driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[1]"));
		//here I took xpath as values are not unique here
		
		System.out.println("Is IE RB dispalyed " + e2.isDisplayed());//true
		System.out.println("Is IE RB  enabled " + e2.isEnabled());//true
		System.out.println("Is IE RB selected " + e2.isSelected());//false
		e2.click();
		
		System.out.println("Is IE RB selected " + e2.isSelected());//true
		Thread.sleep(3000);
		
WebElement e3=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/blockquote[2]/form/input[3]"));
	//here I copied full xpath as we can take xpath or full xpath.	
		System.out.println("Is  Opera RB dispalyed " + e3.isDisplayed());//true
		System.out.println("Is  Opera RB  enabled " + e3.isEnabled());//true
		System.out.println("Is  Opera RB selected " + e3.isSelected());//false
		e3.click();
		
		System.out.println("Is Opera RB selected " + e3.isSelected());//true
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
