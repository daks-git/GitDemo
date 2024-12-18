import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:/ECLIPSE/chromedriver-win64/chromedriver-win64/ChromeDriver.exe");
		WebDriver driver = new ChromeDriver(); 
		Actions a = new Actions(driver);
		driver.get("https://www.amazon.com/");
		WebElement move = driver.findElement(By.id("twotabsearchtextbox"));
		driver.manage().window().maximize();
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		
		a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("my text tes").build().perform();
		a.moveToElement(move).contextClick().build().perform();
	}

}
