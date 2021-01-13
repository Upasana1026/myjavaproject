package seleniumtesting;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//select--2 methods--SelectByIndex, SelectByVisibleText
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\upasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://ironspider.ca/forms/dropdowns.htm");
		//select the dropdown
		WebElement e=driver.findElement(By.xpath("//select[@name='coffee']"));
		
		Select dd=new Select(e);//Select is a class name here
		dd.selectByIndex(2);//will select the option "with sugar"
		Thread.sleep(3000);
		dd.selectByVisibleText("With cream & sugar");
		Thread.sleep(3000);
		dd.selectByValue("crisp");//inspect at site for value
		Thread.sleep(3000);
		
		
		List<WebElement> l= dd.getOptions();//Add list package of java util
		
		//Assignment-print all the values of drop downs using For-each loop
		
		int count = l.size();
		System.out.println(count);
		
		
		
		for (int i=0; i<count; i++)
		{
			System.out.println(l.get(i).getText());
		}
		
		/*for
		(String temp:l.size());//temp is an object
		{
			System.out.println(temp);
		}
		*/
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
	}

}
