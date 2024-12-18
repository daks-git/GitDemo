package testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessBrowser{
	
	@Test
	public void headTest() throws IOException {
		
	
Properties prop = new Properties();
FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//resources//Globaldata.properties");
prop.load(fis);
String browserName = System.getProperty("browserMode");
ChromeOptions opt = new ChromeOptions();
System.setProperty("webdriver.chrome.driver",
		"D:/ECLIPSE/chromedriver-win64/chromedriver-win64/ChromeDriver.exe");
WebDriver driver;

	opt.addArguments("headless");
	

driver = new ChromeDriver(opt);
driver.manage().window().setSize(new Dimension(1440,900));
driver.get("https://www.facebook.com/");
System.out.println(driver.getCurrentUrl());
	}

}
