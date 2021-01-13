package seleniumtesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\upasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Main+Page");
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		//entering existing username in the user name field
		driver.findElement(By.xpath("//*[@id='wpName2']")).sendKeys("upasana");
		Thread.sleep(3000);
		//error message will be displayed
		//*[@id="userlogin2"]/div/div[2]/div/div--
		//as it is not allowed in java "" inside "" so we use either '' or \before"
		//once error message is displayed, capture that
		//getText method==>will fetch the text 
		String errortext=driver.findElement(By.xpath("//*[@id='userlogin2']/div/div[2]/div/div")).getText();
		System.out.println(errortext);
		if(errortext.contains("Username entered already in use. Please choose a different name."))
//here when I copied the error message from the webpage, script failed, but when I copied the 
//error message from the console(after running the script), script passed,
			//as Sonal did in video # 27
			
			System.out.println("error message on the webpage is correct");
			else
				System.out.println("error message is not correct");
		driver.close(); 
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
