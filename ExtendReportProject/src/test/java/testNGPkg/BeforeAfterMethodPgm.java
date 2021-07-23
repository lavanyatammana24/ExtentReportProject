package testNGPkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BeforeAfterMethodPgm 
{
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method updated in git ");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method updated in git");
	}
}
