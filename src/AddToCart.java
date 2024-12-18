import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:/ECLIPSE/chromedriver-win64/chromedriver-win64/ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int i, j = 0;
		for (i = 0; i < products.size(); i++) {
			/*
			 * String name = products.get(i).getText(); if (name.contains("Cucumber")) {
			 * driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(
			 * ); break; } }
			 */

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List itemNeededList = Arrays.asList(itemsNeeded);
			if (itemNeededList.contains(formattedName))

			{

				j++;

				// click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length)

				{

					break;

				}
			}
		}
	}
}
