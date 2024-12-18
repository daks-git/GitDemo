import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:/ECLIPSE/chromedriver-win64/chromedriver-win64/ChromeDriver.exe");
				 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("testKeys:");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("testKeys:");
			driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("pwdtext");
		//driver.findElement(By.xpath("")).sendKeys("54543");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("5434");
		driver.findElement(By.xpath("//input[@type='text'][3]")).clear();
		driver.findElement(By.xpath("")).sendKeys("5454"); 
		
		driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();
		driver.findElement(By.xpath("//label[contains(@for,'chkbox')]")).click();
			//driver.close();
				 
	}

}
