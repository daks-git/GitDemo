import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Webdriver is interface
		System.setProperty("webdriver.chrome.driver","D:/ECLIPSE/chromedriver-win64/chromedriver-win64/ChromeDriver.exe");
		//Selenium manager automatically invokes chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
