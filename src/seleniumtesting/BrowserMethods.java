package seleniumtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\upasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.h2kinfosys.com/");
//to maximize the browser window
driver.manage().window().maximize();
//driver.get("https://www.google.com/");
//to fetch the title of my webpage
//getTitle() method will fetch the title of the webpage and print it
	String t=driver.getTitle();	
	System.out.println(t);
	//verification if title is correct or not
		if (t.contains("Online"))
				{
			System.out.println("My Title of h2k webpage is correct");
				}
				else
				{System.out.println("My Title of h2k webpage is not correct");
				
				}
		//navigation method=>if we want to navigate from current webpage to 
		//another webpage on same browser window
		driver.navigate().to("https://www.selenium.dev/downloads/");
		String t1=driver.getTitle();
		System.out.println(t1);
		if(t1.equalsIgnoreCase("Downloads"))
		{
			System.out.println("My Title of Selenium webpage is correct");
				}
				else
				{System.out.println("My Title of Selenium webpage is not correct");
				
				}
		//now I want to go back to h2kinfosys website
		driver.navigate().back();
		String url=driver.getCurrentUrl();//returns the url of current webpage
		System.out.println("Url of current webpage " + url);
		if (url.contains("h2kinfosys"))
		{System.out.println("navigated back to h2k webpage");
		}
		else
		{System.out.println("you are on wrong page");
		
		}
		driver.navigate().forward();
		driver.navigate().refresh();//it will reload the webpage
		driver.close();
	}

}
