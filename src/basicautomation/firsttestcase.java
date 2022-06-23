package basicautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class firsttestcase {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="korivi";
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("inputUsername")).sendKeys("sai");
		driver.findElement(By.name("inputPassword")).sendKeys("hello");
		driver.findElement(By.className("signInBtn")).click();
		try
		{
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//using css selector(clasname)
		}
		catch(Exception e)
		{
			System.out.println("exception");
		}
		//System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(10000);
		System.out.println(driver.findElement(By.xpath("//form/h2")).getText());//parent-child using xpath
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Preetham");
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sai@gm.com");
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("saipreetham321@gmail.com");//pc using css
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9000617133");
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		
		driver.close();
		driver.quit();

	}

}
