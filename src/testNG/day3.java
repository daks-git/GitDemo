package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
	@Parameters({"URL"})
	
	public void WebloginCarLoan(String urlname)
	{
		System.out.println("from Weblogin car");
		System.out.println(urlname);
		
			}
	@Test
	public void MobileloginCarLoan() {
		System.out.println("Mobile login car");
		
	}
	@Test
	public void MobileSignin() {
		System.out.println("Mobile signin");
		
	}
	@Test
	public void ReportTest() {
		System.out.println("My report test");
		
	}
	@Test(timeOut=4000)
	public void MobileSignout() {
		System.out.println("Mobile signout");
		
	}
	@Test
public void LoginApiCarLoan() {
	System.out.println("API login car");
		
	}
	@Test(dataProvider="getData")
	public void dataProviderDemo(String uname,String pwd) {
		System.out.println(uname);
		System.out.println(pwd);
			
		}
	
	@BeforeSuite
	public void BeforeSuiteDemo() {
		System.out.println("i am number 1");
			
		}
	
	@AfterSuite
	public void AfterSuiteDemo() {
		System.out.println("iam last");
			
		}
	@DataProvider
	public Object getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "firstUname";
		data[0][1] = "pwd1";
		
		data[1][0] ="secondname";
		data[1][1]= "pwd2";
		
		data[2][0] = "thirdname";
		data[2][1] = "pwd3";
		return data;
	}
}
