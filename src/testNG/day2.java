package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	@Test
	
	public void Ploan()
	{
		System.out.println("fromd ploan day2 class");
	}
	
	@BeforeTest
	public void prerequisite() {
		
		System.out.println("i will execute first");
	}
@Test(groups= {"smoke"})
	
	public void GroupsDemoday2()
	{
		System.out.println("smoke group demo2");
	}
	
	@AfterTest
	public void EndooAll() {
		
		System.out.println("to close cookies connections etc");
	}
}
