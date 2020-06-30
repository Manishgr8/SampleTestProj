package sample.sampleTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import sample.sampleTest.DriverFactory;
import sample.sampleTest.DriverNames;

public class App 
{
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private String iWait;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		baseUrl = properties.getProperty("baseURL");
		iWait=properties.getProperty("implicitWait");
		// open the browser
		driver.get(baseUrl);
		Thread.sleep(5000L);
		driver.manage().window().maximize();
		
		
		// Asserting if correct page has been launched or not
		//generic.AssertTitle("Real Estate");
	}	
	
	@Test
	public void Scenario1() throws InterruptedException {
	/*
	// Open the Chrome Browser using ChromeDriver.exe
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
	// Providing implicit wait of 5 seconds
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
				
	// Navigate to salesforce application
	driver.navigate().to(baseUrl);
	*/
		
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("manish.agrawal@siapoc.com.siadev");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Manishgr8");
	driver.findElement(By.xpath("//input[@id='Login']")).click();
	
	//driver.quit();

}
}
