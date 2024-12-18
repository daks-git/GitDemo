import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:/ECLIPSE/chromedriver-win64/chromedriver-win64/ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("//rahulshettyacademy.com/greenkart/#/offers");
	}

}
