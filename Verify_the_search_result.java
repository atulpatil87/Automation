import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {
  public static void main(String[] args) {
    // Set the path to the ChromeDriver executable
    System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
    
    // Create a new ChromeDriver instance
    WebDriver driver = new ChromeDriver();
    
    // Navigate to a website
    driver.get("https://www.example.com");
    
    // Find the search input field
    WebElement searchField = driver.findElement(By.id("search-input"));
    
    // Enter a search term into the field
    searchField.sendKeys("Selenium");
    
    // Find the search button and click it
    driver.findElement(By.id("search-button")).click();
    
    // Verify that the search results are displayed
    WebElement searchResults = driver.findElement(By.id("search-results"));
    if (searchResults.isDisplayed()) {
      System.out.println("Search results are displayed");
    } else {
      System.out.println("Search results are not displayed");
    }
    
    // Close the web browser
    driver.quit();
  }
}
