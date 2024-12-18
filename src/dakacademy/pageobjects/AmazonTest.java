package dakacademy.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class AmazonTest {
@Test
	public void newTest() {
		// TODO Auto-generated method stub
		String test = "dak";
		System.setProperty("webdriver.chrome.driver",
				"D:/ECLIPSE/chromedriver-win64/chromedriver-win64/ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		////a[contains(text(),'Create new account')]
		WebElement login = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		System.out.println(login.getCssValue("font-size"));
		System.out.println(login.getCssValue("background-color"));
		System.out.println(login.getRect().getWidth());
		System.out.println(login.getRect().getHeight());
		System.out.println(login.getRect().getDimension());
		System.out.println(login.getLocation());
		System.out.println(Color.fromString(login.getCssValue("background-color")).asHex());

	}

}
