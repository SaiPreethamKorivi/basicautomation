 package basicautomation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "I:\\Selenium\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		//for(WebElement i:options)
		//{
			//if(i.getText().equalsIgnoreCase("India"))
			//{
				//i.click();
				//break;
			//}
		//}
		for(int i=0;i<options.size();i++)
		{
			String n=options.get(i).getText();
			if(n.equalsIgnoreCase("INDIA"))
			{
				options.get(i).click();
				break;
			}
		}
		
		
	}

}
