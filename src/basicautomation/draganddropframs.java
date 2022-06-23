package basicautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropframs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//using frame id
		//driver.switchTo().frame(0);
		//using frame webelement
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		Actions a=new Actions(driver);
		
		WebElement source=driver.findElement(By.cssSelector("#draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));
		
		
		a.dragAndDrop(source, dest).build().perform();
		driver.switchTo().defaultContent();

	}

}
