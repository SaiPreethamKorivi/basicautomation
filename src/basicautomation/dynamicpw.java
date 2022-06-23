package basicautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicpw {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "I:\\Selenium\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		dynamicpw d=new dynamicpw();
		String actualpw=d.getpw(driver);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("sai");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(actualpw);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	}
	
	public String getpw(WebDriver driver) throws InterruptedException
	{
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String pw=driver.findElement(By.cssSelector("form p")).getText();
		String[] apw=pw.split("'");
		String[] apw2=apw[1].split("'");
		String actualpw=apw2[0];
		return actualpw;
	}

}
