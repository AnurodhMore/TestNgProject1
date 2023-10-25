package Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day4Test {

	@BeforeClass
	public void bfclass()
	{
		System.out.println("Before Class");
	}
	
	@Test(groups={"smoke"})
	 public void WebLoginHomeLoan()

	 {
		System.out.println("WebloginHome Anurodh");
		// selenium code for web login
	 }
	
	
	@Test(timeOut=4000) // if tc requires time to execute then waiting for some time using timeOut
	 public void MobileLoginHomeLoan()

	 {
		System.out.println("MobileloginHome Anurodh");
		// Appium code for mobile login
	 }
	
	@Test(enabled=false)//if we want to skip this particular tc
	 public void TestLoginHomeLoan()

	 {
		System.out.println("Test Login");
		// Appium code for mobile login
	 }
	
	
	
	@Test(dependsOnMethods= {"WebLoginHomeLoan"})
	 public void APIHomeLoan()

	 {
		System.out.println("APIHomeLogin Anurodh");
		// RESTAPI code for loginAPI
	 }
	
	@AfterClass
	public void afclass()
	{
		System.out.println("After Class");
	}
	
	
	
}
