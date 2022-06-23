package basicautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://66.161.124.168:5080/cpmtool/#/login");
		
		driver.findElement(By.cssSelector("input[formcontrolname='userName']")).sendKeys("saipreetham_admin");
		
		driver.findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys("hello");
		driver.findElement(By.xpath("//span[text()=' Log In ']")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector(".fa.fa-circle-o")).click();
		driver.findElement(By.xpath("//span[text()='Create']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='mat-form-field-infix'])[2]")).click();
		//driver.findElement(By.cssSelector(".mat-form-field-infix")).sendKeys("test");
		Thread.sleep(5000);
		List<WebElement> dates= driver.findElements(By.xpath("//div[@role='listbox'] //mat-option[@role='option']"));
		//Grab common attribute//Put into list and iterate
		//int count=driver.findElements(By.className("day")).size();

		for(int i=0;i<dates.size();i++)
		{
		String text=dates.get(i).getText();
		if(text.equals("DISH"))
		{
			
			dates.get(i).click();
		}

		}
		
		//div[@role='listbox'] //mat-option[@role='option']
	}
	

}
