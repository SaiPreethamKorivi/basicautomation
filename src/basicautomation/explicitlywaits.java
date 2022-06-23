package basicautomation;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitlywaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		WebDriverWait w= new WebDriverWait(driver, 5);
		
		
		String[] items= {"Brocolli","Cucumber"};
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		additems(driver,items);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".promoInfo")));
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
