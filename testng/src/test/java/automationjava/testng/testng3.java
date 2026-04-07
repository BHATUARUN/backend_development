package automationjava.testng;

import org.testng.annotations.Test;

public class testng3 {
	
	  @Test (priority = 3)
	  public void test1()
	  {
		 System.out.println("yadavji");
	  }
      @Test (priority = 4)
      public void test2()
      {
         System.out.println("ahirat");
      }
      @Test (priority = 1)
      public void test3()
      {
    	  System.out.println("krishnavanshi");
      }
      @Test (priority = 2)
      public void test4()
      {
          System.out.println("yaduvanshi");
      }
      @Test (priority = 5)
      public void test5()
      {
    	  System.out.println("abhir");
      }
}