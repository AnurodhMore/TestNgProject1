package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1Test {

	
	@Test
	public void Demo1()
	{
		System.out.println("Hello Anurodh");
	}
	
	
	@Test(groups={"smoke"})
	public void Demo2()
	{
		System.out.println("Bye Anurodh");
	}
	
	
	

}
