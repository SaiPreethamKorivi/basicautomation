package basicautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addingsingleitem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String items="Cucumber";
		driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
		
		List<WebElement> names=driver.findElements(By.cssSelector(".product-name"));
		for(int i=0;i<names.size();i++)
		{
			String snames[]= names.get(i).getText().split("-");
			String formatname=snames[0].trim();
			if(formatname.contains(items))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				break;
			}
	}
		//driver.close();   

	}
}
