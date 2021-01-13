package seleniumtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//1.give the path of your chromedriver exe file to open the browser
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\upasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
//2.creating a reference object for interface WebDriver and access the child class
	//ChromeDriver	===to open ChromeBrowser
	//we have to import this class and interface from Selenium packages	
	WebDriver driver= new ChromeDriver();
	//get() method=>to open an application URL on the browser
	driver.get("https://www.h2kinfosys.com/");
	//copy the url from the website only, do not write manually
			
		
		
		
		
		
	}

}
