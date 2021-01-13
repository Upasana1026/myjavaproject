package seleniumtesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\upasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//click on sign in button
		driver.findElement(By.xpath("//input[@type='submit']")).click();//here tagname is 
		//input for clicking the sign in button as it depends on developer which tag he uses
		//check the website sign in button xpath to confirm the tag here
		
		Thread.sleep(2000);
		//switching from web page to alert box
		Alert a= driver.switchTo().alert();
		String errorText= a.getText();
		System.out.println(errorText);
		
		//a.getText();//to fetch the text of alert box
	    //a.accept();//to click on ok/yes button at alert box
		//we can not inspect element on alert boxes
		//a.dismiss();//to click on cancel/No button if any
		//a.sendKeys("  ");//to enter data at text box at alert box
		
		String ET="Please enter a valid user name";
		if (errorText.equals(ET))
			
		{System.out.println("Error message is there");
		}
		
		else
		{System.out.println("Error message is not there");
		}
		
		Thread.sleep(3000);
		a.accept();
		driver.close(); 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
