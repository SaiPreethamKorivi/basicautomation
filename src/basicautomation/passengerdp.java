package basicautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class passengerdp {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "I:\\Selenium\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "I:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(5000);
		
		
		int i=1;
		while(i<5)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}
}
