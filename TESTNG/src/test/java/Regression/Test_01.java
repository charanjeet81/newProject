package Regression;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_01 
{
	@BeforeMethod
	 public void login() 
	  {
		  System.out.println("Login to the aplication");
	  }
	
	@AfterMethod
	 public void logout() 
	  {
		  System.out.println("Logout From application.");
	  }
	
	@BeforeClass
	 public void invokeApplication() 
	  {
		  System.out.println("Invoking Application");
	  }
	
	@AfterClass
	 public void tearDown() 
	  {
		  System.out.println("Closing Application.");
	  }
	
	@BeforeTest
	 public void db_Connection_ON() 
	  {
		  System.out.println("Connecting to DB.");
	  }
	
	@AfterTest
	 public void db_Connection_OFF() 
	  {
		  System.out.println("Closing Connecting with DB..");
	  }
	
	@BeforeSuite
	 public void networkConnection() 
	  {
		  System.out.println("Connecting to VPN.");
	  }
	
	@AfterSuite
	 public void networkConnectionStop() 
	  {
		  System.out.println("Closing Connecting with VPN..");
	  }
	
  @Test(priority = 3)
  public void f1() 
  {
	  System.out.println("Title Testing");
  }
  
  @Test(priority = 1)
  public void f2() 
  {
	  System.out.println("Header Testing");
  }
  
  @Test(priority = 2)
  public void f3() 
  {
	  System.out.println("Footer Testing");
  }
}
