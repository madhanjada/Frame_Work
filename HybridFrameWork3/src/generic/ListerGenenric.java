package generic;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListerGenenric implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		// TODO Auto-generated method stub
		System.out.println("tc is Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	System.out.println("tc is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	System.out.println("tc is Failured");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
System.out.println("tc is Skipped");	
	}
}