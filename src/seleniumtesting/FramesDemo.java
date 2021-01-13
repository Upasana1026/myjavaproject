package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\upasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	
	//switch to frame 1--package frame
		//click on the link
		
		//switch back to the default content
		
		//switch to frame3-classname
		//click on a link
//For driver object to locate an element on the frame, driver has to switch in the frame
//and then only u can locate the element and perform action on it eg. click, sendKeys
//same as we do in Alert box
//switch to frame 1-packageListFrame
//click on a link
//switch back to default content--that is the correct way always
//switch to 3rd frame--classFrame
//click on a link
	driver.switchTo().frame("packageListFrame");
	Thread.sleep(2000);
	driver.findElement(By.linkText("org.openqa.selenium.devtools")).click();
	Thread.sleep(3000);
	driver.switchTo().defaultContent();//we can not switch from 1 frame to other directly 
	//we need to switch to default content first
	driver.switchTo().frame("classFrame");
	driver.findElement(By.linkText("org.openqa.selenium")).click();
	Thread.sleep(2000);
	driver.close();
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	}

}
