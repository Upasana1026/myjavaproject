package SeTestScriptsByMe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\upasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		//to maximize the browser window
		driver.manage().window().maximize();		
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("selenium");
		Thread.sleep(2000);	
		
		String arr1[];
				arr1= new String
		System.out.println(arraynew.length);
		
		for(int i=0; i<3;i++)
		{
			for(int j=0;j<4;j++)	
			{
				System.out.println(arr5[i][j]); //arr5[0][0]==>1
				
			}
		}
		System.out.println(arr5.length);
		System.out.println(arr3.length);
		
		
		
		
		
		
		
		

	}

}
