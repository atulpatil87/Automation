package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleGetIndex 
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\Applicatios\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://google.com");
		driver.findElement(By.className("gLFyf")).sendKeys("Automation Testing");
		List <WebElement> list = driver.findElements(By.cssSelector("ul[class='G43f7e']>li>div>div>div>span>b"));
		System.out.println("size : "+list.size());
		for(int i=0;i<list.size();i++) 
		{
			System.out.println(list.get(i).getText());
		}
		driver.close();
	}

}
