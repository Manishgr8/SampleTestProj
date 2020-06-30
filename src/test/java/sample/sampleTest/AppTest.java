package sample.sampleTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void Scenario1() throws InterruptedException {
	
	// Open the Chrome Browser using ChromeDriver.exe
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
	// Providing implicit wait of 5 seconds
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
				
	// Navigate to salesforce application
	driver.navigate().to("https://login.salesforce.com/");
	
	//driver.quit();
}
}
