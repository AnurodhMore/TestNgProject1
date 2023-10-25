package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3Test {

	
	@BeforeMethod
	public void bfmethod()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afmethod()
	{
		System.out.println("After Method");
	}
	
	@Parameters({"URL","APIKEY"})
	@Test(groups={"smoke"})
	 public void WebLoginCarLoan(String url2, String api)

	 {
		System.out.println("WebloginCar Anurodh");
		System.out.println(url2);
		System.out.println(api);
		// selenium code for web login
	 }
	@BeforeSuite
	public void bfsuite()

	 {
		System.out.println("Before Suite");
		// Appium code for mobile login
	 }
	
	@AfterSuite
	public void afsuite()

	 {
		System.out.println("After Suite");
		// Appium code for mobile login
	 }
	// iff requiremnet is that client does not want mobile test case for car loan to be ran
	@Test
	 public void MobileLoginCarLoan()

	 {
		System.out.println("MobileloginCar Anurodh");
		// Appium code for mobile login
	 }
	
	@Test
	 public void MobileSigninCarLoan()

	 {
		System.out.println("MobileSigninCar Anurodh");
		// Appium code for mobile login
	 }
	
	@Test
	 public void MobileSignoutCarLoan()

	 {
		System.out.println("MobileSignoutCar Anurodh");
		// Appium code for mobile login
	 }
	
	
	
	@Test(dataProvider="getData")
	 public void LoginAPICarLoan(String user_name, String pass_word)

	 {
		System.out.println("LoginAPICar Anurodh");
		System.out.println(user_name);
		System.out.println(pass_word);
		// RESTAPI code for loginAPI
	 }
	
	@DataProvider           // Using Data Provider for class level annotations
	public Object[][] getData()

	{
		// eg while giiving loan, following can be sceanrios
		//1 . Customer with good credit history
		//2. Customer with no credit history
		//3. Customer with fradulent history
		
		Object[][] data = new Object[3][2];		// defining multi-dimensional array
		// row -> how many combinations you have/ how many times test should run with multiple data eg- 3 in above case
		// column -> InEACH COMbination how many values to be passed eg 2- uname and pwd
		//columns in the row are nothing but the values for that particular combination 
		
		data[0][0]= "firstuname";
		data[0][1] = "firstpass";
		
		
		//2nd set 
		data[1][0]= "seconduname";
		data[1][1] = "secondpass";
		
		//3rd set 
	    data[2][0]= "thirduname";
		data[2][1] = "thirdpass";
		
		return data;
		
		
	}
}
