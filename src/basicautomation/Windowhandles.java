package basicautomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	private static Object String;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver",
//				"I:\\Selenium\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "I:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();

		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]

		Iterator<String>it = windows.iterator();
		while(it.hasNext()) {

		String parentsId = it.next();

		String childId = it.next();
		
		
		
		System.out.println(parentsId);
		
		System.out.println(childId);
		
		
		Thread.sleep(2000);
		driver.switchTo().window(childId);
		
		Thread.sleep(5000);
		
		

		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		driver.findElement(By.cssSelector(".im-para.red")).getText();

		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		
		driver.switchTo().window(parentsId);

		driver.findElement(By.id("username")).sendKeys(emailId);
		}

	}

}
