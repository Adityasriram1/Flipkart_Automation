package TestPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	@Override
	  public void onTestFailure(ITestResult tr) {
	    System.out.println("Test Failed");
	  }

	  @Override
	  public void onTestSkipped(ITestResult tr) {
		  System.out.println("Test Skipped");
	  }

	  @Override
	  public void onTestSuccess(ITestResult tr) {
		  System.out.println("Test Success");
	  }
}
