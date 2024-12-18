package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day1 {
	
	@Test
	
	public void Demo()
	{
		System.out.println("Demo method from day1");
	}
	
@Test(groups= {"smoke"})
	
	public void GroupsDemo()
	{
		System.out.println("smoke group demo");
	}
	
@Test
	
	public void SecondTest()
	{
		System.out.println("second method from day1");
	}

@BeforeMethod

public void BeforeMethodDemo()
{
	System.out.println("executes before every test method in day1 clasee");
}

@AfterMethod

public void AfterMethodDemo()
{
	System.out.println("executes after every test method in day1 clasee");
}
@BeforeClass
public void BeforeClassDemo()
{
	System.out.println("executes before  test method in day1 class");
}

@AfterClass
public void AfterClassDemo()
{
	System.out.println("executes after all methods in day1 class");
}

}
