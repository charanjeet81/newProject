package Regression;

import org.testng.annotations.Test;
import org.yaml.snakeyaml.tokens.DirectiveToken;

public class Test_02 
{
	  @Test(groups = "Chrome") 
	  public void f1() 
	  {
		  System.out.println("Chrome -- Title Testing");
	  }
	  
	  @Test(groups = "Chrome") 
	  public void f2() 
	  {
		  System.out.println("Chrome --Header Testing");
	  }
	  
	  @Test(groups = "Chrome", expectedExceptions=ArithmeticException.class) // Even though you have exception, it will not hal your programe.
	  public void f3() 
	  {
		  System.out.println("Chrome --Footer Testing");
		  int i = 9/0;
	  }
}
