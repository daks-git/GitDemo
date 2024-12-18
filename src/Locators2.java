import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver","D:/ECLIPSE/chromedriver-win64/chromedriver-win64/ChromeDriver.exe");
		// WebDriver driver = new EdgeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(text, "You are successfully logged in.");
		System.out.println(text);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	}

}
