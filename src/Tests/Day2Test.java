package Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2Test {

	@Parameters({"Link"})
	@Test()
	public void Demo3(String urlName)
	{
		System.out.println("Right  Anurodh");
		System.out.println(urlName);
		
	}
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("This will execute as Before Suite");
	}
	
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("This will execute as Before Test");
	}

	@BeforeClass
	public void bfclass()
	{
		System.out.println("This will execute as Before Class");
	}
	
	@BeforeMethod
	public void bfmethod()
	{
		System.out.println("This will execute as Before Method");
	}
	
	@AfterClass
	public void afclass()
	{
		System.out.println("This will execute as After Class");
	}
	
	@Test()
	public void de3()
	{
		System.out.println("This is Method");	
		
	}
	
	@Test(groups={"smoke"})
	public void Dem5()
	{
		System.out.println("Smoke test method");
	}
	
	@AfterMethod
	public void afmethod()
	{
		System.out.println("This will execute as After Method");
	}
	

	@AfterTest()
	public void postrequsite()
	{
		System.out.println("This will execute as After Test");
	}
	
	@AfterSuite
	public void Afsuite()
	{
		System.out.println("This will execute as Before Suite");
	}
	

}
