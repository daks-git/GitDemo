package testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	public void onTestSuccess(ITestResult result)
	{
		
		System.out.println("success from listener pass");
	}
	public void onTestFailure(ITestResult result)
	{
		
		System.out.println("failed from listener pass"+result.getName());
	}

}
