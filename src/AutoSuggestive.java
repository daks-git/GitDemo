import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","D:/ECLIPSE/chromedriver-win64/chromedriver-win64/ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("IND");
		Thread.sleep(2000);
		List <WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option : options)
		{
			if(option.getText().equalsIgnoreCase("indonesia"))
			{
				option.click();
				break;
			}
		}
		
		Assert.assertFalse(driver.findElement(By.cssSelector("label[for='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		
		System.out.println(driver.findElement(By.cssSelector("label[for='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		
		driver.findElement(By.cssSelector("label[for='ctl00_mainContent_chk_friendsandfamily']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.cssSelector("label[for='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
				//Assert.assertTrue(driver.findElement(By.cssSelector("label[for='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	}

}
