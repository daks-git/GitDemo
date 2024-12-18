package dakacademy.pageobjects;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {
	
	public WebDriver driver;
	@Test
	public WebDriver initializeBrowser() throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream fis  = new FileInputStream(System.getProperty("user.dir")+"//src//resources//Globaldata.properties");
		prop.load(fis);
	String browserName = prop.getProperty("browser");
		
	if(browserName.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		
	}
	driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}
	
	public void launchApplication() throws IOException {
		
		driver =  initializeBrowser();
		
	}

}
