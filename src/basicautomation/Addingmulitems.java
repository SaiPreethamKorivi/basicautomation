package basicautomation;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addingmulitems {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int j=0;
		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String[] items= {"Brocolli","Cucumber"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
		Thread.sleep(3000);
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
