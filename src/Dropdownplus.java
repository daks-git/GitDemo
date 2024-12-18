import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;
public class Dropdownplus {	

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				int i=1;
				System.setProperty("webdriver.chrome.driver","D:/ECLIPSE/chromedriver-win64/chromedriver-win64/ChromeDriver.exe");
				
					WebDriver driver = new ChromeDriver();
					driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
					driver.manage().window().maximize();
				driver.findElement(By.id("divpaxinfo")).click();
				Thread.sleep(2000);
				while(i<3) {
				driver.findElement(By.id("hrefIncAdt")).click();
				i++;
				}
				for(int j=1;j<4;j++) {
					driver.findElement(By.id("hrefIncChd")).click();
				}
		driver.close();
	}
			

}
