package basicautomation;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footdriver=driver.findElement(By.cssSelector("div[id='gf-BIG']"));// foot driver scope
		
		System.out.println(footdriver.findElements(By.tagName("a")).size());

		WebElement coldriver=footdriver.findElement(By.xpath("table/tbody/tr/td[1]/ul")); //col driver scope
		System.out.println(coldriver.findElements(By.tagName("a")).size());
		
	List<WebElement> li=coldriver.findElements(By.tagName("a"));
	
	for(int i=0;i<li.size();i++)
	{
		String controlclick=Keys.chord(Keys.CONTROL,Keys.ENTER);//to open links using keybord control+click to open in new tab
		li.get(i).sendKeys(controlclick);
		
	}
	}

}
