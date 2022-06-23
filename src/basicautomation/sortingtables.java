package basicautomation;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class sortingtables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		Thread.sleep(3000);
		
		List<WebElement>li=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
		
		List<String> d=li.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> e=d.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(d.equals(e));
		
		//scan the element and find the beans price from the table
		List<String> q;
		do {
		List<WebElement> t=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		q=t.stream().filter(s->s.getText().contains("Rice")).map(s->getprice(s)).collect(Collectors.toList());
		q.forEach(s->System.out.println(s));
	
		if(q.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}
			while(q.size()<1);
		
	}
	

	private static String getprice(WebElement s) {
		
	String price	=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		// TODO Auto-generated method stub
		return price;
	}

}
