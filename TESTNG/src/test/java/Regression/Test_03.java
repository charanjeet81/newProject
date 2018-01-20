package Regression;

import org.testng.annotations.Test;

public class Test_03 
{
	  @Test(groups = "FF")
	  public void f1() 
	  {
		  System.out.println("FF - Title Testing");
	  }
	  
	  @Test(groups = "FF")
	  public void f2() 
	  {
		  System.out.println("FF - Header Testing");
	  }
	  
	  @Test(groups = "FF")
	  public void f3() 
	  {
		  System.out.println("FF - Footer Testing");
	  }
}
