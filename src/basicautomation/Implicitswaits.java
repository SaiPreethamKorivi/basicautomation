package basicautomation;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitswaits {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String[] items= {"Brocolli","Cucumber"};
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		additems(driver,items);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		
		
		
		
	}

	private static void additems(WebDriver driver, String[] items) {
		// TODO Auto-generated method stub
		int j=0;
		List<WebElement> names=driver.findElements(By.cssSelector(".product-name"));
		for(int i=0;i<names.size();i++)
		{
			String snames[]= names.get(i).getText().split("-");
			String formatname=snames[0].trim();
			//convert array into array list for easy search
			List itemsList = Arrays.asList(items);
			
			if(itemsList.contains(formatname))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==items.length)
				{
					break;
				}
			}
		}

	}
}
