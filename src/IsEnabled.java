import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IsEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:/ECLIPSE/chromedriver-win64/chromedriver-win64/ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement seniorCit = driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount"));
		System.out.println(seniorCit.isSelected());
		seniorCit.click();
		Assert.assertTrue((seniorCit).isSelected());
		System.out.println(seniorCit.isSelected());
		driver.close();
	}

}
