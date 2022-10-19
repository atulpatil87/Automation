package RahulShettyAca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assin2ClearTrip 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\Applicatios\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Minimize The Window");
	//	driver.manage().window().minimize();
		System.out.println("go to the website");
		driver.get("http://www.cleartrip.com");
		System.out.println("Sleep 3sec");
		Thread.sleep(3000);
		System.out.println("click on from iput tab...");
		//driver.findElement(By.xpath("(//input[@class='field bw-1 bs-solid w-100p p-2 box-border br-4 fs-2 c-neutral-900 h-8 bc-neutral-100 c-neutral-900 focus:bc-secondary-500 flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 null'])[1]")).click();
		System.out.println("Type new***");
		driver.findElement(By.xpath("(//input[@class='field bw-1 bs-solid w-100p p-2 box-border br-4 fs-2 c-neutral-900 h-8 bc-neutral-100 c-neutral-900 focus:bc-secondary-500 flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 null'])[1]")).sendKeys("New");
		System.out.println("Sleep 2sec");
		Thread.sleep(2000);
		System.out.println("select the New York in given window");
		driver.findElement(By.xpath("//p[normalize-space()='New York, US - All airports (NYC)']")).click();
		System.out.println("Click on The Date");
		driver.findElement(By.xpath("(//button[@class='flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900'])[1]")).click();
		System.out.println("click on the today date");
		driver.findElement(By.cssSelector("div[aria-label='Thu Dec 23 2021']")).click();
		System.out.println("click on the below link"); 
		driver.findElement(By.cssSelector("strong[class='pr-1']")).click();
		System.out.println("click on the Adult button");
		driver.findElement(By.cssSelector("div[class='mb-4'] select[class='bc-neutral-100 bg-transparent']")).click();
		System.out.println("Sleep 2sec");
		Thread.sleep(2000);
		System.out.println("Select the number of index");
		driver.findElement(By.cssSelector("div[class='mb-4'] option[value='5']")).click();
		System.out.println("Select children");
		driver.findElement(By.xpath("//div[3]//select[1]")).click();
		System.out.println("Sleep 2sec");
		Thread.sleep(2000);
		System.out.println("click on the index 2");
		driver.findElement(By.xpath("//div[3]//select[1]//option[3]")).click();
		System.out.println("click on class on travel button");
		driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[4]")).click();
		System.out.println("Sleep 2sec");
		Thread.sleep(2000);
		System.out.println("business");
		driver.findElement(By.cssSelector("option[value='Business']")).click();
		System.out.println(" sent keys air");
		driver.findElement(By.cssSelector("input[placeholder='Airline name']")).sendKeys("air");
		System.out.println("Sleep 5sec");
		Thread.sleep(5000);
		System.out.println("Select the Airindia");
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[40]")).click();
		System.out.println("click on the search button");
		driver.findElement(By.cssSelector("//button[normalize-space()='Search flights']")).click();
			
	
		
	//	driver.close();
		}

}
