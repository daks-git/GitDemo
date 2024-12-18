import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class LinksCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:/ECLIPSE/chromedriver-win64/chromedriver-win64/ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qaclickacademy.com/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.id("course-part"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		driver.navigate().to("https://www.ebay.com/");
		WebElement footerlinks = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footerlinks.findElements(By.tagName("a")).size());
	}

}
