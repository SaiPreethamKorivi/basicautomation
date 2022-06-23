package basicautomation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "I:\\Selenium\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://airpdftoword.com/");
		
		driver.findElement(By.id("dropzoneInput-label")).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("I:\\Selenium\\AutoIt3\\new1.exe");
	}

}
