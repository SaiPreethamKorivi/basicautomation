package basicautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "I:\\Selenium\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "I:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdp=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dp=new Select(staticdp);
		dp.selectByIndex(2);
		System.out.println(dp.getFirstSelectedOption().getText());
		dp.selectByVisibleText("INR");
		System.out.println(dp.getFirstSelectedOption().getText());
		dp.selectByValue("USD");
		System.out.println(dp.getFirstSelectedOption().getText());
		
		
 
		
	}

}
