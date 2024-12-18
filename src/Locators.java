import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		//Webdriver is interface
				System.setProperty("webdriver.chrome.driver","D:/ECLIPSE/chromedriver-win64/chromedriver-win64/ChromeDriver.exe");
				//Selenium manager automatically invokes chrome browser
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.findElement(By.id("email")).clear();
				driver.findElement(By.id("email")).sendKeys("testmail@gmail.com");
				driver.findElement(By.name("pass")).sendKeys("testmail@gmail.com");
				driver.findElement(By.name("login")).click();
				Thread.sleep(2000);
				String s = driver.findElement(By.cssSelector("._9ay7")).getText();
				System.out.println(s);
				
				driver.findElement(By.linkText("Forgotten password?")).click();
				
				//css
				
				
				//driver.findElement(null)
				driver.close();// TODO Auto-generated method stub

		
	}

}
