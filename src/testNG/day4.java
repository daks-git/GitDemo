package testNG;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Test
	
	public void WebloginHomeLoan()
	{
		System.out.println("from Weblogin home");
		Assert.assertTrue(false);
			}
	@Test
	@Parameters({"URL"})
	public void MobileloginHomeLoan(String urlname) {
		System.out.println("Mobile login home");
		System.out.println(urlname);
	}
	@Test(enabled=false)
public void LoginApiHomeLoan() {
	System.out.println("API login home");
		
	}
	
	@Test
	public void DependsOnDemo() {
		System.out.println("API login home");
			
		}
	
	@Test(dependsOnMethods={"DependsOnDemo"})
	public void DependsOnDemo1() {
		System.out.println("API login home");
			
		}
	
}
